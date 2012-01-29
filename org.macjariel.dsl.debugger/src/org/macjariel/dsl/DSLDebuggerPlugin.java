package org.macjariel.dsl;

import org.eclipse.core.runtime.Plugin;
import org.macjariel.dsl.mapping.IMappingManager;
import org.macjariel.dsl.mapping.impl.MappingManagerImpl;
import org.macjariel.dsl.platform.impl.TargetPlatformManager;
import org.osgi.framework.BundleContext;

public class DSLDebuggerPlugin extends Plugin {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "org.macjariel.dsl.debugger"; //$NON-NLS-1$

	/** The debug model ID of the DSL debugger */
	public static final String DSL_DEBUG_MODEL_ID = PLUGIN_ID + ".model"; //$NON-NLS-1$

	/** The marker type id of DSL line breakpoint marker */
	public static final String DSL_LINE_BREAKPOINT_MARKER_ID = PLUGIN_ID + ".lineBreakpointMarker"; //$NON-NLS-1$

	public static final String GPL_CODE_MARKER = PLUGIN_ID + ".gplCodeMarker"; //$NON-NLS-1$

	public static final String DSL_CODE_MARKER = PLUGIN_ID + ".dslCodeMarker"; //$NON-NLS-1$

	public static final String DSL_DEBUGGER_ANNOTATION_SOURCE = "http://www.macjariel.org/DSLDebugger";

	/** The shared instance */
	private static DSLDebuggerPlugin instance;

	private IMappingManager mappingManager;

	public static DSLDebuggerPlugin getInstance() {
		return instance;
	}

	public DSLDebuggerPlugin() {
		super();

		mappingManager = new MappingManagerImpl();
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

	public IMappingManager getMappingManager() {
		return this.mappingManager;
	}

}
