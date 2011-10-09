package org.macjariel.dsl.debugger.launcher;

import java.io.File;

import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.model.DSLDebugTarget;
import org.macjariel.dsl.debugger.model.DSLSourceLocator;
import org.macjariel.dsl.debugger.platform.ITargetPlatformFactory;
import org.macjariel.dsl.debugger.platform.impl.TargetPlatformManager;
import org.macjariel.dsl.debugger.traceability.ResourceAnnotator;
import org.macjariel.dsl.debugger.traceability.TotalMapping;

public class DSLLaunchDelegate implements ILaunchConfigurationDelegate {

	private ILaunchConfigurationDelegate targetLaunchDelegate;

	private ITargetPlatformFactory targetPlatformFactory;

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {

		ResourceSet rs = new ResourceSetImpl();

		URI dslProgramFile = URI.createPlatformResourceURI(
				configuration.getAttribute(DSLLaunchParams.DSL_PROGRAM_FILE, ""), true);
		Resource dslProgramResource = rs.getResource(dslProgramFile, true);
		EObject dslProgramModel = dslProgramResource.getContents().get(0);

		URI traceModelFile = CommonPlugin.resolve(URI.createPlatformResourceURI(
				new File(configuration.getAttribute(DSLLaunchParams.TRACE_MODEL_FILE, ""))
						.getAbsolutePath(), true));
		Resource traceModelResource = rs.getResource(traceModelFile, true);
		TraceabilityModel traceModel = (TraceabilityModel) traceModelResource.getContents().get(0);

		// TODO: I still don't know the best way of injecting target platform
		// ID, so it is hardcoded here
		// String targetPlatformId =
		// configuration.getAttribute(DSLLaunchParams.TARGET_PLATFORM_ID, "");
		String targetPlatformId = "org.macjariel.dsl.debugger.java.javaPlatform";

		try {
			targetPlatformFactory = TargetPlatformManager
					.getTargetPlatformFactory(targetPlatformId);
		} catch (Exception e) {
			DSLDebuggerLog.logError(e);
		}

		// Create mapping
		TotalMapping totalMapping = new TotalMapping(dslProgramModel, traceModel);

		// Annotate resources according to mapping (debug purposes)
		ResourceAnnotator annotator = new ResourceAnnotator(totalMapping);
		annotator.annotateResources();
		
		
		// Create debug target
		new DSLDebugTarget(launch, traceModel, dslProgramModel, totalMapping, targetPlatformFactory);

		targetLaunchDelegate = targetPlatformFactory.createLaunchDelegate();
		targetLaunchDelegate.launch(configuration, mode, launch, monitor);

		// Create DSL source locator
		DSLSourceLocator dslSourceLocator = new DSLSourceLocator(launch.getSourceLocator());
		launch.setSourceLocator(dslSourceLocator);
	}
}
