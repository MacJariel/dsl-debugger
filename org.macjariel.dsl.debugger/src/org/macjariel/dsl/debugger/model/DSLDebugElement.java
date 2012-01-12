package org.macjariel.dsl.debugger.model;

import org.eclipse.core.runtime.Assert;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;

/**
 * @author MacJariel
 *
 */
public class DSLDebugElement extends DebugElement {

	/**
	 * @param target
	 */
	public DSLDebugElement(IDebugTarget target) {
		super(target);
		Assert.isTrue(target instanceof DSLDebugTarget);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IDebugElement#getModelIdentifier()
	 */
	@Override
	public final String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	/**
	 * Convenient method to access DSLDebugTarget.
	 * @return DSL Debug Target
	 */
	public final DSLDebugTarget getDSLDebugTarget() {
		return (DSLDebugTarget) getDebugTarget();
	}

}
