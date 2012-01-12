package org.macjariel.dsl.debugger.mapping;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.traceability.SemanticElementType;

public interface ISourceTargetMapping {

	/**
	 * This interface represents an item of the SourceTargetMapping, i.e. it is
	 * a pair that maps a region in a source file to a region in a target file.
	 * 
	 * @author MacJariel TODO: document all methods
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

		/**
		 * @return
		 */
		public int getSourceStartLine();

		/**
		 * @return
		 */
		public int getSourceEndLine();

		/**
		 * @return
		 */
		public int getTargetCharStart();

		/**
		 * @return
		 */
		public int getTargetCharEnd();

		/**
		 * @return
		 */
		public int getTargetStartLine();

		/**
		 * @return
		 */
		public int getTargetEndLine();

		/**
		 * @return
		 */
		public String getSourceSubroutineName();

		/**
		 * @return
		 */
		public Set<SemanticElementType> getSemanticElementTypes();

		/**
		 * @return
		 */
		public Set<ModuleElementType> getModuleElementTypes();
		
		/**
		 * @return
		 */
		public EObject getSemanticElement();
	}

	/**
	 * @return
	 */
	IItem[] getAllMappingItems();

	/**
	 * @param resource
	 * @param lineNumber
	 * @param charStart
	 * @param charEnd
	 * @return
	 */
	IItem lookupSourceElement(final IResource resource, final int lineNumber, final int charStart,
			final int charEnd);

	/**
	 * @param sourceElement
	 * @return
	 */
	IItem findMappingForSourceElement(EObject sourceElement);

}
