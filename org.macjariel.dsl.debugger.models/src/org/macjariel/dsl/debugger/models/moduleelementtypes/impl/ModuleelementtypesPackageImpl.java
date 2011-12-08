/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElement;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementTypesModel;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesFactory;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleelementtypesPackageImpl extends EPackageImpl implements ModuleelementtypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleElementTypesModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleElementTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModuleelementtypesPackageImpl() {
		super(eNS_URI, ModuleelementtypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModuleelementtypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModuleelementtypesPackage init() {
		if (isInited) return (ModuleelementtypesPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleelementtypesPackage.eNS_URI);

		// Obtain or create and register package
		ModuleelementtypesPackageImpl theModuleelementtypesPackage = (ModuleelementtypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModuleelementtypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModuleelementtypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModuleelementtypesPackage.createPackageContents();

		// Initialize created meta-data
		theModuleelementtypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModuleelementtypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModuleelementtypesPackage.eNS_URI, theModuleelementtypesPackage);
		return theModuleelementtypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleElement() {
		return moduleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleElement_ModuleElementTypes() {
		return (EAttribute)moduleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleElement_ModuleElement() {
		return (EReference)moduleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleElementTypesModel() {
		return moduleElementTypesModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleElementTypesModel_ModuleElements() {
		return (EReference)moduleElementTypesModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleElementType() {
		return moduleElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleelementtypesFactory getModuleelementtypesFactory() {
		return (ModuleelementtypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		moduleElementEClass = createEClass(MODULE_ELEMENT);
		createEAttribute(moduleElementEClass, MODULE_ELEMENT__MODULE_ELEMENT_TYPES);
		createEReference(moduleElementEClass, MODULE_ELEMENT__MODULE_ELEMENT);

		moduleElementTypesModelEClass = createEClass(MODULE_ELEMENT_TYPES_MODEL);
		createEReference(moduleElementTypesModelEClass, MODULE_ELEMENT_TYPES_MODEL__MODULE_ELEMENTS);

		// Create enums
		moduleElementTypeEEnum = createEEnum(MODULE_ELEMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleElement_ModuleElementTypes(), this.getModuleElementType(), "ModuleElementTypes", null, 0, -1, ModuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleElement_ModuleElement(), theEcorePackage.getEObject(), null, "moduleElement", null, 0, 1, ModuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleElementTypesModelEClass, ModuleElementTypesModel.class, "ModuleElementTypesModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleElementTypesModel_ModuleElements(), this.getModuleElement(), null, "moduleElements", null, 0, -1, ModuleElementTypesModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(moduleElementTypeEEnum, ModuleElementType.class, "ModuleElementType");
		addEEnumLiteral(moduleElementTypeEEnum, ModuleElementType.STATEMENT);
		addEEnumLiteral(moduleElementTypeEEnum, ModuleElementType.INIT_COMMAND);
		addEEnumLiteral(moduleElementTypeEEnum, ModuleElementType.SUBRUTINE_CALL);
		addEEnumLiteral(moduleElementTypeEEnum, ModuleElementType.SUBRUTINE_DEFINITION);

		// Create resource
		createResource(eNS_URI);
	}

} //ModuleelementtypesPackageImpl
