package org.macjariel.dsl.debugger.model;

import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;

public class DSLDebugElement extends DebugElement {

	public DSLDebugElement(IDebugTarget target) {
		super(target);
	}

	@Override
	public String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	public DSLDebugTarget getDSLDebugTarget() {
		return (DSLDebugTarget) getDebugTarget();
	}

}
