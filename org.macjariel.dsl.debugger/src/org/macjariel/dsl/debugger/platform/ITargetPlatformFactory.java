package org.macjariel.dsl.debugger.platform;

import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public interface ITargetPlatformFactory {

	/** Creates launch configuration delegate for target GPL. */
	public ILaunchConfigurationDelegate createLaunchDelegate();
	
	/** This method should dispose allocated resources, if any. */
	public void dispose();
}
