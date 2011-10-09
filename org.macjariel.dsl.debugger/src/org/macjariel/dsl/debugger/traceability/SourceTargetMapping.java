package org.macjariel.dsl.debugger.traceability;

import org.eclipse.core.resources.IResource;

public interface SourceTargetMapping {

	/**
	 * Structure that represents a mapping item (either source or target).
	 * @author MacJariel
	 *
	 */
	public class MappingItem {
		
		public MappingItem(final IResource resource, final int lineNumber, final int charStart, final int charEnd) {
			this.resource = resource;
			this.lineNumber = lineNumber;
			this.charStart = charStart;
			this.charEnd = charEnd;
		}
		
		/**
		 * File with source code.
		 */
		public final IResource resource;
		
		/**
		 * Line number, counted from one.
		 */
		public final int lineNumber;
		
		public final int charStart;
		
		public final int charEnd;
	}
	
	
	MappingItem lookupSourceElement(MappingItem targetMappingItem);
	
}
