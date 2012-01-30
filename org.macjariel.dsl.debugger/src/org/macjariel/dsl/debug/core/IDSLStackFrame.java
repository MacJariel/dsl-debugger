package org.macjariel.dsl.debug.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.emf.ecore.EObject;

public interface IDSLStackFrame extends IStackFrame, IDSLDebugElement {

	EObject getSemanticElement();

	IResource getResource();

}
