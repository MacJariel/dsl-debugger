package org.macjariel.dsl.debugger.utils;

public class StringHelper {

	public static String camelCaseToUnderscoreCase(String str) {
		StringBuilder sb = new StringBuilder();
		
		boolean precedingIsLowerCase = false;
		final int length = str.length();
		for (int offset = 0; offset < length; ) {
			final int codepoint = str.codePointAt(offset);
			
			// Rule for appending the underscore character
			if (Character.isUpperCase(codepoint) && precedingIsLowerCase) {
				sb.append('_');
			}
			
			// Append the upper case of the current character
			sb.appendCodePoint(Character.toUpperCase(codepoint));
			
			// Set precedingIsLowerCase for next iteration
			if (Character.isLowerCase(codepoint)) {
				precedingIsLowerCase = true;
			} else {
				precedingIsLowerCase = false;
			}
			
			// Change the offset
			offset += Character.charCount(codepoint);
		}
		return sb.toString();
	}
}
