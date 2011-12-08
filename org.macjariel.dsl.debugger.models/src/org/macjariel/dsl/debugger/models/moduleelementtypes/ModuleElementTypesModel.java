/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Element Types Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel#getModuleElements <em>Module Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#getModuleElementTypesModel()
 * @model
 * @generated
 */
public interface ModuleElementTypesModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Elements</em>' containment reference list.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#getModuleElementTypesModel_ModuleElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleElement> getModuleElements();

} // ModuleElementTypesModel
