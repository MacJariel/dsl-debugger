/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage
 * @generated
 */
public interface ModuleelementtypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleelementtypesFactory eINSTANCE = org.macjariel.dsl.debugger.models.moduleelementtypes.impl.ModuleelementtypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Element</em>'.
	 * @generated
	 */
	ModuleElement createModuleElement();

	/**
	 * Returns a new object of class '<em>Module Element Types Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Element Types Model</em>'.
	 * @generated
	 */
	ModuleElementTypesModel createModuleElementTypesModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModuleelementtypesPackage getModuleelementtypesPackage();

} //ModuleelementtypesFactory
