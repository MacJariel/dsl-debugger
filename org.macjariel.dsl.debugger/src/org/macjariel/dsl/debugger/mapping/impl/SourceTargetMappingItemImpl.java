package org.macjariel.dsl.debugger.mapping.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Set;

import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;
import org.macjariel.dsl.debugger.models.moduleelementtypes.ModuleElementType;
import org.macjariel.dsl.debugger.traceability.SourceElementType;

public class SourceTargetMappingItemImpl implements Cloneable, ISourceTargetMapping.IItem {

	EObject sourceElement;

	public IFile sourceFile;
	public IFile targetFile;

	public int sourceStartOffset, sourceEndOffset;
	public int sourceStartLine, sourceEndLine;

	public int targetStartOffset, targetEndOffset;
	public int targetStartLine, targetEndLine;

	public String sourceSubroutineName;

	Set<SourceElementType> sourceElementTypes;
	Set<ModuleElementType> moduleElementTypes;

	// THESE THINGS ARE FOR DEBUG PURPOSES AND SHOULD BE REMOVED LATER

	public boolean showSourceAnnotation = false;
	public boolean showTargetAnnotation = false;

	public Object sourceAnnotationObject;
	public Object targetAnnotationObject;
	
	public EObject moduleElement;

	// END OF DEBUG THINGS

	SourceTargetMappingItemImpl() {

	}

	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}

	void fillSource(EObject sourceElement, Set<SourceElementType> sourceElementTypes) {
		this.sourceElement = sourceElement;
		this.sourceElementTypes = sourceElementTypes;

		URI sourceElementURI = CommonPlugin.resolve(sourceElement.eResource().getURI());
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		this.sourceFile = workspaceRoot
				.getFileForLocation(new Path(sourceElementURI.toFileString()));

		if (!this.sourceFile.exists()) {
			throw new RuntimeException("Could not find DSL model file in the workspace: "
					+ sourceElementURI.toFileString());
		}

		ICompositeNode node = NodeModelUtils.getNode(sourceElement);
		this.sourceStartOffset = node.getOffset();
		this.sourceEndOffset = node.getOffset() + node.getLength();
		this.sourceStartLine = node.getStartLine();
		this.sourceEndLine = node.getEndLine();

		if (this.sourceElementTypes.contains(SourceElementType.STATEMENT)) {
			EObject container = sourceElement.eContainer();
			while (container != null) {
				Set<SourceElementType> containerType = SourceTargetMappingImpl
						.getElementType(container);
				if (containerType != null
						&& containerType.contains(SourceElementType.SUBROUTINE_DEFINITION)) {
					// TODO: of course we want better subroutine name, than
					// this.. maybe we should just query for "name"
					// attribute with using eGet method
					this.sourceSubroutineName = guessSubrutineName(container); 
					break;
				}
				container = container.eContainer();

			}
			if (this.sourceSubroutineName == null) {
				// TODO: how to obtain the name for the main subroutine
				this.sourceSubroutineName = "Main";
			}
		}
	}

	void fillTarget(GeneratedFile gFile, int startOffset, int endOffset) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		this.targetFile = root.getFileForLocation(new Path(gFile.getPath()));
		this.targetStartOffset = startOffset;
		this.targetEndOffset = endOffset;

		computeTargetLines();
	}
	
	public static String guessSubrutineName(EObject subrutineDefinition) {
		for (EAttribute attr: subrutineDefinition.eClass().getEAllAttributes()) {
			if (attr.getName().toLowerCase().equals("name")) {
				return subrutineDefinition.eGet(attr).toString();
			}
		}
		return subrutineDefinition.toString();
	}

	private void computeTargetLines() {
		// Compute targetStartLine and targetEndLine (the target file has to
		// be opened to determine this)
		InputStream is = null;
		try {
			// TODO: make sure that getContents(true) is OK
			is = targetFile.getContents(true);
			LineNumberReader reader = new LineNumberReader(new InputStreamReader(is));

			reader.skip(this.targetStartOffset);

			this.targetStartLine = -1;
			this.targetEndLine = -1;

			for (int i = this.targetStartOffset; i != this.targetEndOffset; ++i) {
				// TODO: The LineNumberReader.read() can read
				// \r\n at once. This can lead into
				// wrong offset on windows. Using the second
				// read() method may help.

				int aChar = reader.read();
				if (Character.isWhitespace(aChar))
					continue;
				if (this.targetStartLine == -1)
					this.targetStartLine = reader.getLineNumber() + 1;

				this.targetEndLine = reader.getLineNumber() + 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * public TotalMappingItem clone() { return (TotalMappingItem)
	 * super.clone(); }
	 */

	public void debugPrint() {
		System.out.println("**** MAPPING ITEM ****");

		System.out.println("src: " + this.sourceFile.getName() + ": [" + this.sourceStartOffset
				+ "-" + this.sourceEndOffset + "], lines: [" + this.sourceStartLine + "-"
				+ this.sourceEndLine + "]");

		System.out.println("dst: " + this.targetFile.getName() + ": [" + this.targetStartOffset
				+ "-" + this.targetEndOffset + "], lines: [" + this.targetStartLine + "-"
				+ this.targetEndLine + "]");

		System.out.println("src-text:");
		printFileRegion(this.sourceFile, this.sourceStartOffset, this.sourceEndOffset);

		System.out.println("\ndst-text:");
		printFileRegion(this.targetFile, this.targetStartOffset, this.targetEndOffset);

		System.out.println();
	}

	public void printFileRegion(IFile file, int startOffset, int endOffset) {
		InputStream is;
		try {
			is = file.getContents(true);

			is.skip(startOffset);
			for (int i = startOffset; i < endOffset; ++i) {
				char c = (char) is.read();
				System.out.print(c);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public IFile getSourceFile() {
		return sourceFile;
	}

	@Override
	public IFile getTargetFile() {
		return targetFile;
	}

	@Override
	public int getSourceCharStart() {
		return sourceStartOffset;
	}

	@Override
	public int getSourceCharEnd() {
		return sourceEndOffset;
	}

	@Override
	public int getSourceStartLine() {
		return sourceStartLine;
	}

	@Override
	public int getSourceEndLine() {
		return sourceEndLine;
	}

	@Override
	public int getTargetCharStart() {
		return targetStartOffset;
	}

	@Override
	public int getTargetCharEnd() {
		return targetEndOffset;
	}

	@Override
	public int getTargetStartLine() {
		return targetStartLine;
	}

	@Override
	public int getTargetEndLine() {
		return targetEndLine;
	}

	@Override
	public String getSourceSubroutineName() {
		return sourceSubroutineName;
	}

	@Override
	public Set<ModuleElementType> getModuleElementTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SourceElementType> getSourceElementTypes() {
		return sourceElementTypes;
	}

}
