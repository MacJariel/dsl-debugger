/**
 * <copyright>
 * </copyright>
 *
 */
package org.macjariel.karel.karel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Command Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.macjariel.karel.karel.UserDefinedCommandStatement#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.macjariel.karel.karel.KarelPackage#getUserDefinedCommandStatement()
 * @model annotation="http://www.macjariel.org/DSLDebugger type='Statement SubroutineCall'"
 * @generated
 */
public interface UserDefinedCommandStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' reference.
   * @see #setCommand(UserDefinedCommand)
   * @see org.macjariel.karel.karel.KarelPackage#getUserDefinedCommandStatement_Command()
   * @model
   * @generated
   */
  UserDefinedCommand getCommand();

  /**
   * Sets the value of the '{@link org.macjariel.karel.karel.UserDefinedCommandStatement#getCommand <em>Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(UserDefinedCommand value);

} // UserDefinedCommandStatement
