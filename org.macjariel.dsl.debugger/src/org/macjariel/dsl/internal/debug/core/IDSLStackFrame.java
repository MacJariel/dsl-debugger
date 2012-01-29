package org.macjariel.dsl.internal.debug.core;

import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.ecore.EObject;

public interface IDSLStackFrame extends IStackFrame {

	EObject getSemanticElement();
	
}
