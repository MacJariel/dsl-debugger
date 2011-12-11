package org.macjariel.dsl.debugger.mapping.impl;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debugger.mapping.ICallStackMapping;
import org.macjariel.dsl.debugger.mapping.IMappingAlgorithms;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;
import org.macjariel.dsl.debugger.model.IDslDebugElementFactory;

public class MappingManagerImpl implements IMappingManager, IResourceChangeListener {

	private boolean isInitialized = false;
	private CallStackMappingImpl callStackMapping;
	private SourceTargetMappingImpl sourceTargetMapping;
	private MappingAlgorithmsImpl mappingAlgorithmsImpl;

	private IDslDebugElementFactory dslDebugElementFactory;

	public MappingManagerImpl() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(this);
	}

	@Override
	public void init(EObject dslProgramModel, EObject traceabilityModel,
			EObject moduleElementTypesModel, IDslDebugElementFactory dslDebugElementFactory) {
		callStackMapping = new CallStackMappingImpl(this);
		sourceTargetMapping = new SourceTargetMappingImpl(this, dslProgramModel, traceabilityModel,
				moduleElementTypesModel);
		mappingAlgorithmsImpl = new MappingAlgorithmsImpl(this);

		this.dslDebugElementFactory = dslDebugElementFactory;
		isInitialized = true;
	}

	@Override
	public ICallStackMapping getCallStackMapping() {
		if (!isInitialized)
			throw new IllegalStateException("MappingManagerImpl was not initialized.");

		return callStackMapping;
	}

	@Override
	public ISourceTargetMapping getSourceTargetMapping() {
		if (!isInitialized)
			throw new IllegalStateException("MappingManagerImpl was not initialized.");

		return sourceTargetMapping;
	}

	@Override
	public IDslDebugElementFactory getDslDebugElementFactory() {
		if (!isInitialized)
			throw new IllegalStateException("MappingManagerImpl was not initialized.");

		return dslDebugElementFactory;
	}

	@Override
	public IMappingAlgorithms getMappingAlgorithms() {
		return mappingAlgorithmsImpl;
	}

	@Override
	public void load(IResource dslProgram, IResource traceabilityModel,
			IResource moduleElementTypesModel) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(this);
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// event.getDelta()
		
		// TODO Auto-generated method stub

	}

}
