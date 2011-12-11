package org.macjariel.dsl.debugger.mapping;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;

public interface IMappingAlgorithms {

	public ISourceTargetMapping.IItem lookupMappingItemForLineBreakpoint(IResource dslResource, int line);

}
