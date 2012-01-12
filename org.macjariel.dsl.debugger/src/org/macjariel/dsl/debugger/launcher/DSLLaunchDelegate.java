package org.macjariel.dsl.debugger.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.model.DSLDebugTarget;
import org.macjariel.dsl.debugger.model.DSLSourceLocator;
import org.macjariel.dsl.debugger.platform.ITargetPlatformFactory;
import org.macjariel.dsl.debugger.platform.impl.TargetPlatformManager;

public class DSLLaunchDelegate implements ILaunchConfigurationDelegate {

	private ILaunchConfigurationDelegate targetLaunchDelegate;

	private ITargetPlatformFactory targetPlatformFactory;

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {

		// TODO: I still don't know the best way of injecting target platform
		// ID, so it is hardcoded here
		String targetPlatformId = "org.macjariel.dsl.debugger.java.javaPlatform";

		try {
			targetPlatformFactory = TargetPlatformManager
					.getTargetPlatformFactory(targetPlatformId);
		} catch (Exception e) {
			DSLDebuggerLog.logError(e);
		}

		// Annotate resources according to mapping (debug purposes)
		// ResourceAnnotator annotator = new ResourceAnnotator(mappingManager);
		// annotator.annotateResources();

		// Create debug target
		final IMappingManager mappingManager = DSLDebuggerPlugin.getInstance().getMappingManager();
		new DSLDebugTarget(launch, mappingManager, targetPlatformFactory);

		targetLaunchDelegate = targetPlatformFactory.createLaunchDelegate();
		targetLaunchDelegate.launch(configuration, mode, launch, monitor);

		// Create DSL source locator
		DSLSourceLocator dslSourceLocator = new DSLSourceLocator(launch.getSourceLocator());
		launch.setSourceLocator(dslSourceLocator);
	}
}
