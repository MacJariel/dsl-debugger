/**
 * <copyright>
 * </copyright>
 *
 */
package org.macjariel.karel.karel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.macjariel.karel.karel.CommandStatement#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.macjariel.karel.karel.KarelPackage#getCommandStatement()
 * @model annotation="http://www.macjariel.org/DSLDebugger type='Statement'"
 * @generated
 */
public interface CommandStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see org.macjariel.karel.karel.KarelPackage#getCommandStatement_Kind()
   * @model
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link org.macjariel.karel.karel.CommandStatement#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

} // CommandStatement
