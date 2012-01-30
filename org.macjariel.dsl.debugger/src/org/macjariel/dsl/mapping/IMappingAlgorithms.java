package org.macjariel.dsl.mapping;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debug.core.IDSLStackFrame;

/**
 * @author MacJariel
 *
 */
public interface IMappingAlgorithms {

	/**
	 * @param dslResource
	 * @param line
	 * @return
	 */
	public ISourceTargetMapping.IItem lookupMappingItemForLineBreakpoint(IResource dslResource,
			int line);

	/**
	 * @param stackFrames
	 * @return
	 */
	public Collection<EObject> findSemanticElementsForStepOverBreakpoints(List<? extends IDSLStackFrame> stackFrames);

	/**
	 * @param stackFrames
	 * @return
	 */
	public Collection<EObject> findSemanticElementsForStepIntoBreakpoints(
			List<? extends IDSLStackFrame> stackFrames);

}
