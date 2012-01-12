package org.macjariel.dsl.debugger.mapping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * Manager that manages all parts of a mapping implementation.
 * 
 * TODO: The life cycle of the MappingManager should not be restricted to life
 * cycle of a debugging session (DebugTarget), but it should live "forever".
 * This is good for several things: it should be possible to add breakpoints not
 * only when the debugging is running, but we need to know the mapping (actually
 * the DSL model) to identify statements in source DSL code.
 * 
 * TODO: It would be great if we have some mechanism that will automatically
 * update the mapping manager when a dslProgram will be updated.
 * 
 * @author MacJariel
 * 
 */
public interface IMappingManager {

	/**
	 * @param semanticModel
	 * @param traceabilityModel
	 * @param moduleElementTypesModel
	 */
	void load(EObject semanticModel, EObject traceabilityModel, EObject moduleElementTypesModel);

	/**
	 * @param semanticModelUri
	 * @param traceabilityModelUri
	 * @param moduleElementTypesModelUri
	 */
	void load(URI semanticModelUri, URI traceabilityModelUri, URI moduleElementTypesModelUri);

	/**
	 * @return
	 */
	ICallStackMapping getCallStackMapping();

	/**
	 * @return
	 */
	ISourceTargetMapping getSourceTargetMapping();

	/**
	 * @return
	 */
	IMappingAlgorithms getMappingAlgorithms();

}
