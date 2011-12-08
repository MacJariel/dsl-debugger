/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.macjariel.dsl.debugger.models.moduleelementtypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleelementtypesFactoryImpl extends EFactoryImpl implements ModuleelementtypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleelementtypesFactory init() {
		try {
			ModuleelementtypesFactory theModuleelementtypesFactory = (ModuleelementtypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://macjariel.org/moduleelementtypes"); 
			if (theModuleelementtypesFactory != null) {
				return theModuleelementtypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModuleelementtypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleelementtypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModuleelementtypesPackage.MODULE_ELEMENT: return createModuleElement();
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPES_MODEL: return createModuleElementTypesModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPE:
				return createModuleElementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModuleelementtypesPackage.MODULE_ELEMENT_TYPE:
				return convertModuleElementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleElement createModuleElement() {
		ModuleElementImpl moduleElement = new ModuleElementImpl();
		return moduleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleElementTypesModel createModuleElementTypesModel() {
		ModuleElementTypesModelImpl moduleElementTypesModel = new ModuleElementTypesModelImpl();
		return moduleElementTypesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleElementType createModuleElementTypeFromString(EDataType eDataType, String initialValue) {
		ModuleElementType result = ModuleElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleelementtypesPackage getModuleelementtypesPackage() {
		return (ModuleelementtypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModuleelementtypesPackage getPackage() {
		return ModuleelementtypesPackage.eINSTANCE;
	}

} //ModuleelementtypesFactoryImpl
