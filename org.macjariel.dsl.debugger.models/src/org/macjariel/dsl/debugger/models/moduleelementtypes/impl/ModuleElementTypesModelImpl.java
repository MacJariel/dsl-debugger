/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Element Types Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementTypesModelImpl#getModuleElements <em>Module Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleElementTypesModelImpl extends EObjectImpl implements ModuleElementTypesModel {
	/**
	 * The cached value of the '{@link #getModuleElements() <em>Module Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleElement> moduleElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleElementTypesModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleelementtypesPackage.Literals.MODULE_ELEMENT_TYPES_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleElement> getModuleElements() {
		if (moduleElements == null) {
			moduleElements = new EObjectContainmentEList<ModuleElement>(ModuleElement.class, this, ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS);
		}
		return moduleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS:
				return ((InternalEList<?>)getModuleElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS:
				return getModuleElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS:
				getModuleElements().clear();
				getModuleElements().addAll((Collection<? extends ModuleElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS:
				getModuleElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS:
				return moduleElements != null && !moduleElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleElementTypesModelImpl
