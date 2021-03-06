/**
 * <copyright>
 * </copyright>
 *
 */
package org.macjariel.karel.karel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Heading Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.macjariel.karel.karel.InitHeadingCommand#getHeading <em>Heading</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.macjariel.karel.karel.KarelPackage#getInitHeadingCommand()
 * @model annotation="http://www.macjariel.org/DSLDebugger type='Statement'"
 * @generated
 */
public interface InitHeadingCommand extends InitCommand
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' attribute.
   * @see #setHeading(String)
   * @see org.macjariel.karel.karel.KarelPackage#getInitHeadingCommand_Heading()
   * @model
   * @generated
   */
  String getHeading();

  /**
   * Sets the value of the '{@link org.macjariel.karel.karel.InitHeadingCommand#getHeading <em>Heading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' attribute.
   * @see #getHeading()
   * @generated
   */
  void setHeading(String value);

} // InitHeadingCommand
