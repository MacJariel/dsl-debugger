package org.macjariel.dsl.debugger.ui.launch.tabs;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaJRETab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaMainTab;

/**
 * Launch configuration tab group for DSL Debugger.
 * @author MacJariel
 *
 */
public class DSLLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

	/**
	 * Creates tabs for the DSL Debugger launch configuration tab group. Creation of target platform
	 * specific tabs (such as Java related tabs) is delegated to another object.
	 * TODO: Decide the best way for decoupling creation of DSL tabs from target platform (e.g. Java) tabs.
	 */
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new DSLDebuggerMainTab(),
				new JavaMainTab(),
				new RefreshTab(),
				new JavaArgumentsTab(),
				new JavaJRETab(),
				new JavaClasspathTab(),
				new SourceLookupTab(),
				new EnvironmentTab(),
				new CommonTab()
		};
		setTabs(tabs);
	}

}
