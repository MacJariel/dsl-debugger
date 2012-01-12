package org.macjariel.dsl.debugger.mapping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.macjariel.dsl.debugger.xtext.XtextDslModelHelper;

/**
 * @author MacJariel
 *
 */
public abstract class AbstractMappingManager implements IMappingManager {

	public AbstractMappingManager() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.macjariel.dsl.debugger.mapping.IMappingManager#load(org.eclipse.emf.common.util.URI, org.eclipse.emf.common.util.URI, org.eclipse.emf.common.util.URI)
	 */
	@Override
	public void load(final URI semanticModelUri, final URI traceabilityModelUri, final URI moduleElementTypesModelUri) {
		ResourceSet rs = XtextDslModelHelper.XTEXT_RESOURCE_SET;
	
		Resource semanticModelRes = rs.getResource(semanticModelUri, false);
		if (semanticModelRes != null)
			semanticModelRes.unload();
		semanticModelRes = rs.getResource(semanticModelUri, true);
		EObject semanticModel = rs.getResource(semanticModelUri, true).getContents().get(0);
	
		Resource traceabilityModelRes = rs.getResource(traceabilityModelUri, false);
		if (traceabilityModelRes != null)
			traceabilityModelRes.unload();
		traceabilityModelRes = rs.getResource(traceabilityModelUri, true);
		EObject traceabilityModel = traceabilityModelRes.getContents().get(0);
	
		Resource moduleElementTypesModelRes = rs.getResource(moduleElementTypesModelUri, false);
		if (moduleElementTypesModelRes != null)
			moduleElementTypesModelRes.unload();
		moduleElementTypesModelRes = rs.getResource(moduleElementTypesModelUri, true);
		EObject moduleElementTypesModel = moduleElementTypesModelRes.getContents().get(0);
	
		load(semanticModel, traceabilityModel, moduleElementTypesModel);
	}

}