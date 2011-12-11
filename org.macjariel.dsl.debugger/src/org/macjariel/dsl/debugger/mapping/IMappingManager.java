package org.macjariel.dsl.debugger.mapping;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debugger.model.IDslDebugElementFactory;

/**
 * Manager that manages all parts of a mapping implementation.
 * 
 * TODO: The life cycle of the MappingManager should not be restricted to life
 * cycle of a debugging session (DebugTarget), but it should live "forever".
 * This is good for several things: it should be possible to add breakpoints not
 * only when the debugging is running, but we need to know the mapping (actually
 * the DSL model) to identify statements in source DSL code.
 * 
 * TODO: It would be great if we have some mechanism that will automatically update
 * the mapping manager when a dslProgram will be updated.
 * 
 * @author MacJariel
 * 
 */
public interface IMappingManager {

	/**
	 * Initializes all parts of the mapping implementation.
	 * 
	 * @param dslProgramModel
	 *            model of the DSL program
	 * @param traceabilityModel
	 *            traceability model
	 * @param moduleElementTypesModel
	 *            moduleElementTypes model
	 * @param dslDebugElementFactory
	 *            instance of DSL debugElement factory
	 *            
	 * @deprecated
	 * TODO: to be removed
	 */
	void init(EObject dslProgramModel, EObject traceabilityModel, EObject moduleElementTypesModel,
			IDslDebugElementFactory dslDebugElementFactory);

	void load(IResource dslProgram, IResource traceabilityModel, IResource moduleElementTypesModel);
	
	ICallStackMapping getCallStackMapping();

	ISourceTargetMapping getSourceTargetMapping();

	IDslDebugElementFactory getDslDebugElementFactory();

	IMappingAlgorithms getMappingAlgorithms();

}
