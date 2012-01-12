package org.macjariel.dsl.debugger.mapping.impl;

import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.mapping.AbstractMappingManager;
import org.macjariel.dsl.debugger.mapping.ICallStackMapping;
import org.macjariel.dsl.debugger.mapping.IMappingAlgorithms;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;

/**
 * TODO: Allow for more semantic models (and their traceability models) to be
 * held in the same time.
 * 
 * @author MacJariel
 * 
 */
public class MappingManagerImpl extends AbstractMappingManager implements IMappingManager {

	private boolean isInitialized = false;

	private CallStackMappingImpl callStackMapping;
	private SourceTargetMappingImpl sourceTargetMapping;
	private MappingAlgorithmsImpl mappingAlgorithmsImpl;

	// private EObject semanticModel;
	// private EObject traceabilityModel;
	// private EObject moduleElementTypesModel;

	public MappingManagerImpl() {
	}

	@Override
	public ICallStackMapping getCallStackMapping() {
		if (!isInitialized) {
			DSLDebuggerLog.logWarning("MappingManagerImpl was not initialized.");
		}

		return callStackMapping;
	}

	@Override
	public ISourceTargetMapping getSourceTargetMapping() {
		if (!isInitialized)
			DSLDebuggerLog.logWarning("MappingManagerImpl was not initialized.");

		return sourceTargetMapping;
	}

	@Override
	public IMappingAlgorithms getMappingAlgorithms() {
		return mappingAlgorithmsImpl;
	}

	@Override
	public void load(EObject semanticModel, EObject traceabilityModel,
			EObject moduleElementTypesModel) {

		// this.semanticModel = semanticModel;
		// this.traceabilityModel = traceabilityModel;
		// this.moduleElementTypesModel = moduleElementTypesModel;

		callStackMapping = new CallStackMappingImpl(this);
		sourceTargetMapping = new SourceTargetMappingImpl(this, semanticModel, traceabilityModel,
				moduleElementTypesModel);
		mappingAlgorithmsImpl = new MappingAlgorithmsImpl(this);

		isInitialized = true;
	}

}
