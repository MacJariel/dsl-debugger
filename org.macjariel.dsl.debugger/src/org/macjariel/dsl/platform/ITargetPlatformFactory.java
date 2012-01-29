package org.macjariel.dsl.platform;

import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public interface ITargetPlatformFactory {

	/** Creates launch configuration delegate for target GPL. */
	public ILaunchConfigurationDelegate createLaunchDelegate();
	
	/** Returns debug model for target GPL. */
	public IDebugModel getDebugModel();
	
	/** This method should dispose allocated resources, if any. */
	public void dispose();
}
