package org.macjariel.dsl.debugger.traceability;

import java.util.EnumSet;
import java.util.Set;

import org.macjariel.dsl.debugger.utils.StringHelper;

/**
 * Possible types of source elements in the DSL model. These elements can have
 * more than one type, so you should use this type with {@link Set}.
 * 
 * TODO: to be moved somewhere (I want to delete the traceability package)
 * 
 * @author MacJariel
 * 
 */
public enum SourceElementType {
	UNKNOWN, STATEMENT, INIT_COMMAND, SUBROUTINE_CALL, SUBROUTINE_DEFINITION;

	/**
	 * Constructs an empty set of SourceElementTypes and returns it.
	 * 
	 * @return
	 */
	public static Set<SourceElementType> create() {
		return EnumSet.noneOf(SourceElementType.class);
	}

	/**
	 * Constructs a set of passed source element types and returns it.
	 * 
	 * @param types
	 *            SourceElementTypes
	 * @return Set of SourceElementTypes.
	 */
	public static Set<SourceElementType> create(SourceElementType... types) {
		Set<SourceElementType> result = create();
		for (SourceElementType type : types) {
			result.add(type);
		}
		return result;
	}

	/**
	 * Constructs a set of SourceElementTypes and returns it.
	 * 
	 * @param annotationString
	 *            The string that contains source element types delimited with a
	 *            space.
	 * @return Set of SourceElementTypes.
	 */
	public static Set<SourceElementType> createFromAnnotationString(String annotationString) {
		Set<SourceElementType> result = create();
		for (String typeString : annotationString.split(" ")) {
			String underscoredTypeString = StringHelper.camelCaseToUnderscoreCase(typeString);
			try {
				result.add(SourceElementType.valueOf(underscoredTypeString));
			} catch (IllegalArgumentException e) {
				System.err.println("Unknown source element type string: '" + underscoredTypeString + "'");				
			}
		}
		return result;
	}
}
