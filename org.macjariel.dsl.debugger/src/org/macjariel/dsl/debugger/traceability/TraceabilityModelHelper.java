package org.macjariel.dsl.debugger.traceability;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.acceleo.traceability.GeneratedText;
import org.eclipse.acceleo.traceability.InputElement;
import org.eclipse.acceleo.traceability.ModelFile;
import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * This is noninstantiable utility class that provides static methods to facilitate work with
 * the Acceleo TraceabilityModel.
 * 
 * @author MacJariel
 *
 */
public class TraceabilityModelHelper {

	// Suppress default constructor for noninstantiability
	private TraceabilityModelHelper() {
		throw new AssertionError();
	}

	private static class Region implements Comparable<Region> {
		int startOffset;
		int endOffset;

		@Override
		public int compareTo(Region o) {
			int result = this.startOffset - o.startOffset;
			if (result == 0) {
				result = this.endOffset - o.endOffset;
			}
			return result;
		}
	}

	public static SimpleMapping getMappingToJava(IResource source, int lineNumber,
			TraceabilityModel traceModel, EObject dslProgramModel) {

		SimpleMapping simpleMapping = new SimpleMapping();
		simpleMapping.sourceLineNumber = lineNumber;
		simpleMapping.source = source;

		if (fillMappingToJava(simpleMapping, traceModel, dslProgramModel)) {
			return simpleMapping;
		} else {
			return null;
		}

	}

	public static boolean fillMappingToJava(SimpleMapping simpleMapping,
			TraceabilityModel traceModel, EObject dslProgramModel) {
		EObject eo = getElementForLine(simpleMapping.sourceLineNumber, dslProgramModel);
		// CompositeNode cNode1 = getCompositeNodeForEObject(eo);
		InputElement associatedInputElement = getAssociatedInputElement(eo, traceModel);

		if (associatedInputElement != null) {
			for (GeneratedFile gFile : traceModel.getGeneratedFiles()) {
				// There are generally more regions that forms the generated
				// code. These regions should be merged to one.
				List<Region> regions = new ArrayList<Region>();
				for (GeneratedText gText : gFile.getGeneratedRegions()) {
					// CompositeNode cNode2 =
					// getCompositeNodeForEObject(gText.getSourceElement());
					// if (equals(cNode1, cNode2)) {
					if (gText.getSourceElement() == associatedInputElement) {
						Region region = new Region();
						region.startOffset = gText.getStartOffset();
						region.endOffset = gText.getEndOffset();
						regions.add(region);
						// simpleMapping.targetStartChar =
						// gText.getStartOffset();
						// simpleMapping.targetEndChar = gText.getEndOffset();
						/*
						 * try { URI targetURI = new URI("file",
						 * gText.getOutputFile().getPath(), ""); IWorkspaceRoot
						 * root = ResourcesPlugin.getWorkspace().getRoot();
						 * IFile[] files =
						 * root.findFilesForLocationURI(targetURI); if
						 * (files.length > 1) { // TODO: What if the target file
						 * is represented by more than one resource? } if
						 * (files.length != 0) { simpleMapping.target =
						 * files[0]; return true; } } catch (URISyntaxException
						 * e) { e.printStackTrace(); }
						 */
					}
				}
				if (regions.size() > 0) {
					Collections.sort(regions);
					// TODO: This does not consider holes between regions, but
					// it is sufficient for now.
					simpleMapping.targetStartChar = regions.get(0).startOffset;
					simpleMapping.targetEndChar = regions.get(regions.size() - 1).endOffset;

					try {
						URI targetURI = new URI("file", gFile.getPath(), "");
						IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
						IFile[] files = root.findFilesForLocationURI(targetURI);
						if (files.length > 1) {
							// TODO: What if the target file is represented by
							// more than one resource?
						}
						if (files.length != 0) {
							simpleMapping.target = files[0];

						}
					} catch (URISyntaxException e) {
						e.printStackTrace();
						return false;
					}

					IFile targetFile = (IFile) simpleMapping.target;
					InputStream is = null;
					try {
						try {
							// TODO: make sure that getContents(true) is OK
							is = targetFile.getContents(true);
							LineNumberReader reader = new LineNumberReader(
									new InputStreamReader(is));
							reader.skip(simpleMapping.targetStartChar);
							simpleMapping.targetStartLineNumber = -1;
							simpleMapping.targetEndLineNumber = -1;

							for (int i = simpleMapping.targetStartChar; i != simpleMapping.targetEndChar; ++i) {
								// TODO: The LineNumberReader.read() can read
								// \r\n at once. This can lead into
								// wrong offset on windows. Using the second
								// read() method may help.
								int aChar = reader.read();
								if (Character.isWhitespace(aChar))
									continue;
								if (simpleMapping.targetStartLineNumber == -1)
									simpleMapping.targetStartLineNumber = reader.getLineNumber() + 1;

								simpleMapping.targetEndLineNumber = reader.getLineNumber() + 1;
								// System.out.println(reader.getLineNumber() +
								// ": '" + (char)aChar + "'");
							}
							System.out.println("Lines: " + simpleMapping.targetStartLineNumber
									+ " - " + simpleMapping.targetEndLineNumber);
						} finally {
							if (is != null) {
								is.close();
							}
						}
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

					return true;

				}
			}
		}
		return false;

	}

	private static boolean nodesEqual(ICompositeNode cNode1, ICompositeNode cNode2) {
		return cNode1 != null && cNode2 != null && cNode1.getOffset() == cNode2.getOffset()
				&& cNode1.getTotalOffset() == cNode2.getTotalOffset()
				&& cNode1.getTotalLength() == cNode2.getTotalLength();
	}

	public static InputElement getAssociatedInputElement(EObject eo, TraceabilityModel traceModel) {
		ICompositeNode cNode1 = getCompositeNodeForEObject(eo);
		InputElement result = null;

		if (cNode1 != null) {
			for (ModelFile modelFile : traceModel.getModelFiles()) {
				for (InputElement ie : modelFile.getInputElements()) {
					EObject modelElement = ie.getModelElement();
					ICompositeNode cNode2 = getCompositeNodeForEObject(modelElement);
					if (nodesEqual(cNode1, cNode2)) {
						result = ie;
					}
				}
			}
		}
		return result;
	}

	public static InputElement[] getAssociatedInputElements(EObject eo, TraceabilityModel traceModel) {
		Resource res1 = eo.eResource();
		Vector<InputElement> result = new Vector<InputElement>();
		for (ModelFile modelFile : traceModel.getModelFiles()) {
			for (InputElement ie : modelFile.getInputElements()) {
				EObject modelElement = ie.getModelElement();
				Resource res2 = modelElement.eResource();
				if (modelElement.equals(eo)) {
					result.add(ie);
				}
			}
		}
		return result.toArray(new InputElement[result.size()]);
	}

	public static EObject getElementForLine(int lineNumber, EObject dslProgramModel) {
		INode aNode = getCompositeNodeForEObject(dslProgramModel);
		return getElementForAbstractNode(aNode, lineNumber);
	}

	public static EObject getElementForAbstractNode(INode aNode, int lineNumber) {
		// TODO Check functionality
		if (lineNumber >= aNode.getStartLine() && lineNumber <= aNode.getEndLine()) {
			// if (lineNumber == aNode.getLine() || (lineNumber >
			// aNode.getLine() && lineNumber <= aNode.endLine())) {
			if (aNode instanceof ICompositeNode) {
				for (INode childNode : ((ICompositeNode) aNode).getChildren()) {
					EObject result = getElementForAbstractNode(childNode, lineNumber);
					if (result != null) {
						return result;
					}
				}
			} else {
				return ((ILeafNode) aNode).getSemanticElement();
				// return NodeModelUtils.getNearestSemanticObject(aNode);
			}

		} else {
			return null;
		}
		return null;
	}

	public static ICompositeNode getCompositeNodeForEObject(EObject eo) {
		return NodeModelUtils.getNode(eo);

		/*
		 * // previous implementation
		 * 
		 * NodeAdapter nodeAdapter = NodeModelUtils.getNodeAdapter(eo); if
		 * (nodeAdapter != null) { return nodeAdapter.getParserNode(); } return
		 * null;
		 */
	}

}
