/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.macjariel.dsl.debugger.models.moduleelementtypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Module Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleelementtypesPackage#getModuleElementType()
 * @model
 * @generated
 */
public enum ModuleElementType implements Enumerator {
	/**
	 * The '<em><b>Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	STATEMENT(0, "Statement", "Statement"),

	/**
	 * The '<em><b>Init Command</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INIT_COMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	INIT_COMMAND(1, "InitCommand", "InitCommand"),

	/**
	 * The '<em><b>Subrutine Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBRUTINE_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	SUBRUTINE_CALL(2, "SubrutineCall", "SubrutineCall"),

	/**
	 * The '<em><b>Subrutine Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBRUTINE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBRUTINE_DEFINITION(3, "SubrutineDefinition", "SubrutineDefinition");

	/**
	 * The '<em><b>Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Statement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATEMENT
	 * @model name="Statement"
	 * @generated
	 * @ordered
	 */
	public static final int STATEMENT_VALUE = 0;

	/**
	 * The '<em><b>Init Command</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Init Command</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INIT_COMMAND
	 * @model name="InitCommand"
	 * @generated
	 * @ordered
	 */
	public static final int INIT_COMMAND_VALUE = 1;

	/**
	 * The '<em><b>Subrutine Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subrutine Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBRUTINE_CALL
	 * @model name="SubrutineCall"
	 * @generated
	 * @ordered
	 */
	public static final int SUBRUTINE_CALL_VALUE = 2;

	/**
	 * The '<em><b>Subrutine Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subrutine Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBRUTINE_DEFINITION
	 * @model name="SubrutineDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SUBRUTINE_DEFINITION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Module Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModuleElementType[] VALUES_ARRAY =
		new ModuleElementType[] {
			STATEMENT,
			INIT_COMMAND,
			SUBRUTINE_CALL,
			SUBRUTINE_DEFINITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Module Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModuleElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Module Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModuleElementType get(int value) {
		switch (value) {
			case STATEMENT_VALUE: return STATEMENT;
			case INIT_COMMAND_VALUE: return INIT_COMMAND;
			case SUBRUTINE_CALL_VALUE: return SUBRUTINE_CALL;
			case SUBRUTINE_DEFINITION_VALUE: return SUBRUTINE_DEFINITION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModuleElementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModuleElementType
