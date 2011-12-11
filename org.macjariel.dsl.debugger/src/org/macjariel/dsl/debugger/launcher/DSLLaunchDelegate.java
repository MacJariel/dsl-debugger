package org.macjariel.dsl.debugger.launcher;

import java.io.File;

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
import org.macjariel.dsl.debugger.core.traceability.TraceabilityModelSerializer;
import org.macjariel.dsl.debugger.mapping.ICallStackMapping;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.impl.CallStackMappingImpl;
import org.macjariel.dsl.debugger.mapping.impl.MappingManagerImpl;
import org.macjariel.dsl.debugger.mapping.impl.SourceTargetMappingImpl;
import org.macjariel.dsl.debugger.model.DSLDebugTarget;
import org.macjariel.dsl.debugger.model.DSLSourceLocator;
import org.macjariel.dsl.debugger.model.DslDebugElementFactory;
import org.macjariel.dsl.debugger.model.IDslDebugElementFactory;
import org.macjariel.dsl.debugger.platform.ITargetPlatformFactory;
import org.macjariel.dsl.debugger.platform.impl.TargetPlatformManager;
import org.macjariel.dsl.debugger.traceability.ResourceAnnotator;

public class DSLLaunchDelegate implements ILaunchConfigurationDelegate {

	private ILaunchConfigurationDelegate targetLaunchDelegate;

	private ITargetPlatformFactory targetPlatformFactory;

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {

		// TODO: I decided to change the lifetime of traceability information - these resources
		//       should not be created at the moment of launch, but before, and it should live
		//       after the launch finished. So this must be moved to DSLDebuggerPlugin.
		
		ResourceSet rs = new ResourceSetImpl();

		URI dslProgramFile = URI.createPlatformResourceURI(
				configuration.getAttribute(DSLLaunchParams.DSL_PROGRAM_FILE, ""), true);
		Resource dslProgramResource = rs.getResource(dslProgramFile, true);
		EObject dslProgramModel = dslProgramResource.getContents().get(0);

		URI targetDir = CommonPlugin.resolve(URI.createPlatformResourceURI(
				new File(configuration.getAttribute(DSLLaunchParams.TARGET_DIR, ""))
						.getAbsolutePath(), true));

		Resource traceModelResource = rs.getResource(
				targetDir.appendSegment(TraceabilityModelSerializer.TRACEABILITY_FILENAME), true);
		EObject traceModel = traceModelResource.getContents().get(0);

		Resource moduleElementTypesModelResource = rs.getResource(
				targetDir.appendSegment(TraceabilityModelSerializer.MODULEELEMENTTYPES_FILENAME),
				true);
		EObject moduleElementTypesModel = moduleElementTypesModelResource.getContents().get(0);

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

		// Create debug element factory
		IDslDebugElementFactory dslDebugElementFactory = new DslDebugElementFactory();
		
		// Create mapping manager
		// TODO: use dependency injection
		IMappingManager mappingManager = new MappingManagerImpl();
		mappingManager.init(dslProgramModel, traceModel, moduleElementTypesModel, dslDebugElementFactory);
		
		// Annotate resources according to mapping (debug purposes)
		// ResourceAnnotator annotator = new ResourceAnnotator(mappingManager);
		// annotator.annotateResources();

		// Create debug target
		new DSLDebugTarget(launch, traceModel, dslProgramModel, mappingManager, targetPlatformFactory);

		
		targetLaunchDelegate = targetPlatformFactory.createLaunchDelegate();
		targetLaunchDelegate.launch(configuration, mode, launch, monitor);

		// Create DSL source locator
		DSLSourceLocator dslSourceLocator = new DSLSourceLocator(launch.getSourceLocator());
		launch.setSourceLocator(dslSourceLocator);
	}
}
