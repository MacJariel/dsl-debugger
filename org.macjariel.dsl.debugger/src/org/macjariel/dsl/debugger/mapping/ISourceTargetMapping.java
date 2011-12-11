package org.macjariel.dsl.debugger.mapping;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.traceability.SourceElementType;

public interface ISourceTargetMapping {

	/**
	 * This interface represents an item of the SourceTargetMapping, i.e. it is
	 * a pair that maps a region in a source file to a region in a target file.
	 * 
	 * @author MacJariel
	 * TODO: document all methods
	 */
	interface IItem {

		/**
		 * @return The source file of this mapping item.
		 */
		public IFile getSourceFile();

		/**
		 * @return The target file of this mapping item.
		 */
		public IFile getTargetFile();

		/**
		 * @return The index of the starting character of the source element in
		 *         the source file.
		 */
		public int getSourceCharStart();

		/**
		 * @return The index of the character just after the ending character of
		 *         the source element in the source file.
		 */
		public int getSourceCharEnd();

		public int getSourceStartLine();

		public int getSourceEndLine();

		public int getTargetCharStart();

		public int getTargetCharEnd();

		public int getTargetStartLine();

		public int getTargetEndLine();

		public String getSourceSubroutineName();
		
		public Set<SourceElementType> getSourceElementTypes();
		
		public Set<ModuleElementType> getModuleElementTypes();
	}

	IItem[] getAllMappingItems();

	IItem lookupSourceElement(final IResource resource, final int lineNumber, final int charStart,
			final int charEnd);
}
