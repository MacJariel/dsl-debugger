/**
 * <copyright>
 * </copyright>
 *

 */
package org.macjariel.karel.karel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.macjariel.karel.karel.UserDefinedCommand#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.macjariel.karel.karel.UserDefinedCommand#getName <em>Name</em>}</li>
 *   <li>{@link org.macjariel.karel.karel.UserDefinedCommand#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.macjariel.karel.karel.KarelPackage#getUserDefinedCommand()
 * @model
 * @generated
 */
public interface UserDefinedCommand extends EObject
{
  /**
   * Returns the value of the '<em><b>Doc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' containment reference.
   * @see #setDoc(DocumentationComment)
   * @see org.macjariel.karel.karel.KarelPackage#getUserDefinedCommand_Doc()
   * @model containment="true"
   * @generated
   */
  DocumentationComment getDoc();

  /**
   * Sets the value of the '{@link org.macjariel.karel.karel.UserDefinedCommand#getDoc <em>Doc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' containment reference.
   * @see #getDoc()
   * @generated
   */
  void setDoc(DocumentationComment value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.macjariel.karel.karel.KarelPackage#getUserDefinedCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.macjariel.karel.karel.UserDefinedCommand#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.macjariel.karel.karel.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.macjariel.karel.karel.KarelPackage#getUserDefinedCommand_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // UserDefinedCommand
