/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementImpl#getModuleElementTypes <em>Module Element Types</em>}</li>
 *   <li>{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementImpl#getModuleElement <em>Module Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleElementImpl extends EObjectImpl implements ModuleElement {
	/**
	 * The cached value of the '{@link #getModuleElementTypes() <em>Module Element Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleElementType> moduleElementTypes;

	/**
	 * The cached value of the '{@link #getModuleElement() <em>Module Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleElement()
	 * @generated
	 * @ordered
	 */
	protected EObject moduleElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleelementtypesPackage.Literals.MODULE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleElementType> getModuleElementTypes() {
		if (moduleElementTypes == null) {
			moduleElementTypes = new EDataTypeUniqueEList<ModuleElementType>(ModuleElementType.class, this, ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT_TYPES);
		}
		return moduleElementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModuleElement() {
		if (moduleElement != null && moduleElement.eIsProxy()) {
			InternalEObject oldModuleElement = (InternalEObject)moduleElement;
			moduleElement = eResolveProxy(oldModuleElement);
			if (moduleElement != oldModuleElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT, oldModuleElement, moduleElement));
			}
		}
		return moduleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetModuleElement() {
		return moduleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleElement(EObject newModuleElement) {
		EObject oldModuleElement = moduleElement;
		moduleElement = newModuleElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT, oldModuleElement, moduleElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT_TYPES:
				return getModuleElementTypes();
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT:
				if (resolve) return getModuleElement();
				return basicGetModuleElement();
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
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT_TYPES:
				getModuleElementTypes().clear();
				getModuleElementTypes().addAll((Collection<? extends ModuleElementType>)newValue);
				return;
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT:
				setModuleElement((EObject)newValue);
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
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT_TYPES:
				getModuleElementTypes().clear();
				return;
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT:
				setModuleElement((EObject)null);
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
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT_TYPES:
				return moduleElementTypes != null && !moduleElementTypes.isEmpty();
			case ModuleelementtypesPackage.MODULE_ELEMENT__MODULE_ELEMENT:
				return moduleElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ModuleElementTypes: ");
		result.append(moduleElementTypes);
		result.append(')');
		return result.toString();
	}

} //ModuleElementImpl
