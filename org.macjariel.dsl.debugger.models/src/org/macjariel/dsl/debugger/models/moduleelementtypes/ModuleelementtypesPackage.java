/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesFactory
 * @model kind="package"
 * @generated
 */
public interface ModuleelementtypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moduleelementtypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://macjariel.org/moduleelementtypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moduleelementtypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleelementtypesPackage eINSTANCE = org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementImpl <em>Module Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementImpl
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl#getModuleElement()
	 * @generated
	 */
	int MODULE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Module Element Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__MODULE_ELEMENT_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Module Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT__MODULE_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Module Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementTypesModelImpl <em>Module Element Types Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementTypesModelImpl
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl#getModuleElementTypesModel()
	 * @generated
	 */
	int MODULE_ELEMENT_TYPES_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Module Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Module Element Types Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_ELEMENT_TYPES_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType <em>Module Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl#getModuleElementType()
	 * @generated
	 */
	int MODULE_ELEMENT_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Element</em>'.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement
	 * @generated
	 */
	EClass getModuleElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElementTypes <em>Module Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Module Element Types</em>'.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElementTypes()
	 * @see #getModuleElement()
	 * @generated
	 */
	EAttribute getModuleElement_ModuleElementTypes();

	/**
	 * Returns the meta object for the reference '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Element</em>'.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement#getModuleElement()
	 * @see #getModuleElement()
	 * @generated
	 */
	EReference getModuleElement_ModuleElement();

	/**
	 * Returns the meta object for class '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel <em>Module Element Types Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Element Types Model</em>'.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel
	 * @generated
	 */
	EClass getModuleElementTypesModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel#getModuleElements <em>Module Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Elements</em>'.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel#getModuleElements()
	 * @see #getModuleElementTypesModel()
	 * @generated
	 */
	EReference getModuleElementTypesModel_ModuleElements();

	/**
	 * Returns the meta object for enum '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType <em>Module Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Element Type</em>'.
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType
	 * @generated
	 */
	EEnum getModuleElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModuleelementtypesFactory getModuleelementtypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementImpl <em>Module Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementImpl
		 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl#getModuleElement()
		 * @generated
		 */
		EClass MODULE_ELEMENT = eINSTANCE.getModuleElement();

		/**
		 * The meta object literal for the '<em><b>Module Element Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_ELEMENT__MODULE_ELEMENT_TYPES = eINSTANCE.getModuleElement_ModuleElementTypes();

		/**
		 * The meta object literal for the '<em><b>Module Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ELEMENT__MODULE_ELEMENT = eINSTANCE.getModuleElement_ModuleElement();

		/**
		 * The meta object literal for the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementTypesModelImpl <em>Module Element Types Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleElementTypesModelImpl
		 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl#getModuleElementTypesModel()
		 * @generated
		 */
		EClass MODULE_ELEMENT_TYPES_MODEL = eINSTANCE.getModuleElementTypesModel();

		/**
		 * The meta object literal for the '<em><b>Module Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS = eINSTANCE.getModuleElementTypesModel_ModuleElements();

		/**
		 * The meta object literal for the '{@link org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType <em>Module Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType
		 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesPackageImpl#getModuleElementType()
		 * @generated
		 */
		EEnum MODULE_ELEMENT_TYPE = eINSTANCE.getModuleElementType();

	}

} //ModuleelementtypesPackage
