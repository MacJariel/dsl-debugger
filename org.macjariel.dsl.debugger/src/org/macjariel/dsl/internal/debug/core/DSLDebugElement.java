package org.macjariel.dsl.internal.debug.core;

import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.IDSLDebugElement;
import org.macjariel.dsl.debug.core.IDSLDebugTarget;

/**
 * @author MacJariel
 *
 */
public class DSLDebugElement extends DebugElement implements IDSLDebugElement {

	/**
	 * @param target
	 */
	public DSLDebugElement(IDebugTarget target) {
		super(target);
		assert(target == null || target instanceof DSLDebugTarget);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
	 */
	@Override
	public final String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	@Override
	public final IDSLDebugTarget getDSLDebugTarget() {
		return (DSLDebugTarget) getDebugTarget();
	}
	
	/**
	 * Convenience method to log errors
	 */
	protected void logError(Exception e) {
		DSLDebuggerLog.logError(e);
	}

}
