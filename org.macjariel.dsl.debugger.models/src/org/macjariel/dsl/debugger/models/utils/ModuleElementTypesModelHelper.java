package org.macjariel.dsl.debugger.models.utils;

import java.util.EnumSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel;

public class ModuleElementTypesModelHelper {

	/**
	 * Looks up the moduleElement in the ModuleElementTypesModel and returns a
	 * set of its moduleElementTypes.
	 * 
	 * @param model
	 * @param moduleElement
	 * @return
	 */
	public static Set<ModuleElementType> getTypesForModuleElement(ModuleElementTypesModel model,
			EObject moduleElement) {
		Set<ModuleElementType> result = EnumSet.noneOf(ModuleElementType.class);
		for (ModuleElement me : model.getModuleElements()) {
			if (EcoreUtil.equals(me.getModuleElement(), moduleElement)) {
				result.addAll(me.getModuleElementTypes());
			}
		}
		return result;
	}
}
