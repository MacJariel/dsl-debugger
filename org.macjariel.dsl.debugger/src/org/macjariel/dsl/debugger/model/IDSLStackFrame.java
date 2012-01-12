package org.macjariel.dsl.debugger.model;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.ecore.EObject;

public interface IDSLStackFrame extends IStackFrame {

	EObject getSemanticElement();
	
}
