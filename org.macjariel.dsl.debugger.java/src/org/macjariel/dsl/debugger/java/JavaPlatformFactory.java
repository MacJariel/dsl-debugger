package org.macjariel.dsl.debugger.java;

import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.macjariel.dsl.debugger.java.impl.JDIDebugModelAdaptor;
import org.macjariel.dsl.debugger.platform.IDebugModel;
import org.macjariel.dsl.debugger.platform.ITargetPlatformFactory;

public class JavaPlatformFactory implements ITargetPlatformFactory {

	private JDIDebugModelAdaptor jdiDebugModelAdaptor = new JDIDebugModelAdaptor();
	
	public JavaPlatformFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public ILaunchConfigurationDelegate createLaunchDelegate() {
		return new JavaLaunchDelegate();
	}

	@Override
	public IDebugModel getDebugModel() {
		return jdiDebugModelAdaptor;
	}

}
