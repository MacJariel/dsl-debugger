package org.macjariel.dsl.launching;

import org.macjariel.dsl.DSLDebuggerPlugin;

public class DSLLaunchParams {

	/** Launch configuration attribute (DSL program file) */
	public static final String DSL_PROGRAM_FILE = DSLDebuggerPlugin.PLUGIN_ID
			+ ".dsl_program_file"; //$NON-NLS-1$

	/** Launch configuration attribute (traceability model file) */
	public static final String TARGET_DIR = DSLDebuggerPlugin.PLUGIN_ID
			+ ".trace_model_file"; //$NON-NLS-1$

	/** Launch configuration attribute (target platform id) */
	public static final String TARGET_PLATFORM_ID = DSLDebuggerPlugin.PLUGIN_ID
			+ ".target_platform_id";

	// Suppress default constructor for noninstantiability.
	private DSLLaunchParams() {
		throw new RuntimeException();
	}
}
