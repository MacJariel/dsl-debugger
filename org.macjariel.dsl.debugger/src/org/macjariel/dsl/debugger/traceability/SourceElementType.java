package org.macjariel.dsl.debugger.traceability;

import java.util.EnumSet;
import java.util.Set;

/**
 * Possible types of source elements in the DSL model. These elements can have
 * more than one type, so you should use this type with {@link Set}.
 * 
 * @author MacJariel
 * 
 */
public enum SourceElementType {
	Unknown, Statement, InitCommand, SubrutineCall, SubrutineDefinition;

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
			result.add(SourceElementType.valueOf(typeString));
		}
		return result;
	}
}
