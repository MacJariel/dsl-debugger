package org.macjariel.dsl.debugger;

import org.eclipse.core.runtime.Plugin;
import org.macjariel.dsl.debugger.platform.impl.TargetPlatform;
import org.macjariel.dsl.debugger.platform.impl.TargetPlatformManager;
import org.osgi.framework.BundleContext;

public class DSLDebuggerPlugin extends Plugin {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "org.macjariel.dsl.debugger"; //$NON-NLS-1$
	
	/** The debug model ID of the DSL debugger */
	public static final String DSL_DEBUG_MODEL_ID = PLUGIN_ID + ".model"; //$NON-NLS-1$
	
	/** The DSL line breakpoint ID */
	public static final String DSL_LINE_BREAKPOINT_ID = PLUGIN_ID + ".breakpoint"; //$NON-NLS-1$
	
	/** The marker type id of DSL line breakpoint marker */
	public static final String DSL_LINE_BREAKPOINT_MARKER_ID = PLUGIN_ID + ".lineBreakpointMarker"; //$NON-NLS-1$

	/** The shared instance */
	private static DSLDebuggerPlugin instance;

	public static DSLDebuggerPlugin getInstance() {
		return instance;
	}

	public DSLDebuggerPlugin() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		
		//TEST
		for (TargetPlatform platform : TargetPlatformManager.getTargetPlatforms()) {
			System.out.println("Found target platform: " + platform.getName());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		instance = null;
		TargetPlatformManager.disposeTargetPlatforms();
	}

}
