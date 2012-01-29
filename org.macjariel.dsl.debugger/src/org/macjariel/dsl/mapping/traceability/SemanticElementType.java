package org.macjariel.dsl.mapping.traceability;

import java.util.EnumSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.utils.StringHelper;

/**
 * Possible types of semantic elements in the DSL model. These elements can have
 * more than one type, so you should use this type with {@link Set}.
 * 
 * TODO: to be moved somewhere (I want to delete the traceability package) TODO:
 * this class does not need a Debug target
 * 
 * @author MacJariel
 * 
 */
public enum SemanticElementType {
	UNKNOWN, STATEMENT, INIT_COMMAND, SUBROUTINE_CALL, SUBROUTINE_DEFINITION;

	/**
	 * Constructs an empty set of SemanticElementTypes and returns it.
	 * 
	 * @return
	 */
	public static Set<SemanticElementType> create() {
		return EnumSet.noneOf(SemanticElementType.class);
	}

	/**
	 * Constructs a set of passed source element types and returns it.
	 * 
	 * @param types
	 *            SemanticElementTypes
	 * @return Set of SemanticElementTypes.
	 */
	public static Set<SemanticElementType> create(SemanticElementType... types) {
		Set<SemanticElementType> result = create();
		for (SemanticElementType type : types) {
			result.add(type);
		}
		return result;
	}

	/**
	 * Constructs a set of SemanticElementTypes and returns it.
	 * 
	 * @param annotationString
	 *            The string that contains source element types delimited with a
	 *            space.
	 * @return Set of SemanticElementTypes.
	 */
	public static Set<SemanticElementType> create(String annotationString) {
		Set<SemanticElementType> result = create();
		for (String typeString : annotationString.split(" ")) {
			String underscoredTypeString = StringHelper.camelCaseToUnderscoreCase(typeString);
			try {
				result.add(SemanticElementType.valueOf(underscoredTypeString));
			} catch (IllegalArgumentException e) {
				System.err.println("Unknown source element type string: '" + underscoredTypeString
						+ "'");
			}
		}
		return result;
	}

	public static Set<SemanticElementType> create(EObject semanticElement) {
		EAnnotation annotation = semanticElement.eClass().getEAnnotation(
				DSLDebuggerPlugin.DSL_DEBUGGER_ANNOTATION_SOURCE);

		if (annotation != null) {
			// TODO: convert into String constant
			return create(annotation.getDetails().get("type"));
		}
		return create();

	}
}
