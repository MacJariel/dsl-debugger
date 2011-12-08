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
 * A representation of the model object '<em><b>Module Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElementTypes <em>Module Element Types</em>}</li>
 *   <li>{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElement <em>Module Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#getModuleElement()
 * @model
 * @generated
 */
public interface ModuleElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Element Types</b></em>' attribute list.
	 * The list contents are of type {@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType}.
	 * The literals are from the enumeration {@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Element Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Element Types</em>' attribute list.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#getModuleElement_ModuleElementTypes()
	 * @model
	 * @generated
	 */
	EList<ModuleElementType> getModuleElementTypes();

	/**
	 * Returns the value of the '<em><b>Module Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Element</em>' reference.
	 * @see #setModuleElement(EObject)
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#getModuleElement_ModuleElement()
	 * @model
	 * @generated
	 */
	EObject getModuleElement();

	/**
	 * Sets the value of the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElement <em>Module Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Element</em>' reference.
	 * @see #getModuleElement()
	 * @generated
	 */
	void setModuleElement(EObject value);

} // ModuleElement
