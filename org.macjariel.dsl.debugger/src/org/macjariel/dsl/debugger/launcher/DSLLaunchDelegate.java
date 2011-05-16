package org.macjariel.dsl.debugger.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.platform.ITargetPlatformFactory;
import org.macjariel.dsl.debugger.platform.impl.TargetPlatformManager;

public class DSLLaunchDelegate implements ILaunchConfigurationDelegate {

	private ILaunchConfigurationDelegate targetLaunchDelegate;

	private ITargetPlatformFactory targetPlatformFactory;

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		ResourceSet rs = new ResourceSetImpl();

		URI dslProgramFile = URI.createPlatformResourceURI(configuration
				.getAttribute(DSLLaunchParams.DSL_PROGRAM_FILE, ""), true);
		Resource dslProgramResource = rs.getResource(dslProgramFile, true);
		EObject dslProgramModel = dslProgramResource.getContents().get(0);

		URI traceModelFile = URI.createPlatformResourceURI(configuration
				.getAttribute(DSLLaunchParams.TRACE_MODEL_FILE, ""), true);
		Resource traceModelResource = rs.getResource(traceModelFile, true);
		EObject traceModelModel = traceModelResource.getContents().get(0);

		String targetPlatformId = configuration.getAttribute(
				DSLLaunchParams.TARGET_PLATFORM_ID, "");
		try {
			targetPlatformFactory = TargetPlatformManager
					.getTargetPlatformFactory(targetPlatformId);
		} catch (Exception e) {
			DSLDebuggerLog.logError(e);
		}

		// Create debug target
		// DSLDebugTarget dslDebugTarget = new DSLDebugTarget(launch,
		// dslProgramModel, traceModel);

		targetLaunchDelegate = targetPlatformFactory.createLaunchDelegate();
		targetLaunchDelegate.launch(configuration, mode, launch, monitor);
	}

}