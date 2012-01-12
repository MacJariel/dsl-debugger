package org.macjariel.dsl.debugger.xtext;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.util.NodeTreeIterator;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.macjariel.dsl.debugger.traceability.SemanticElementType;

/**
 * 
 * TODO: This utility class imports UI packages. Consider removing the
 * dependency on them or moving some functionality into UI project.
 * 
 * @author MacJariel
 * 
 */
public class XtextDslModelHelper {

	/**
	 * This resource set is currently used among the whole project.
	 * TODO: First, I should consider moving it somewhere else.
	 * TODO: Second, I should have a review of the resource set concept.
	 */
	public static XtextResourceSet XTEXT_RESOURCE_SET = new SynchronizedXtextResourceSet();
	
	/**
	 * Searches for the semantic model element that is suitable for putting a
	 * breakpoint on it. The method tries to select the first such model element
	 * on a given line. If there is no such model element on the given line, it
	 * will select the closest element to that line.
	 * 
	 * @param lineNumber
	 *            The number of line (one based)
	 * 
	 * @return
	 */
	public static EObject findBreakableSemanticElement(final XtextResource semanticModel,
			final int lineNumber) {

		EObject rootElement = semanticModel.getContents().get(0);
		ICompositeNode rootNode = NodeModelUtils.getNode(rootElement);
		NodeTreeIterator nodeIter = new NodeTreeIterator(rootNode);

		do {
			INode aNode = nodeIter.next();
			if (aNode.getStartLine() != lineNumber)
				continue;
			
			EObject semanticElement = aNode.getSemanticElement();
			Set<SemanticElementType> semanticElementTypes = SemanticElementType
					.create(semanticElement);
			if (semanticElementTypes.contains(SemanticElementType.STATEMENT)) {
				return semanticElement;
			}
		} while (nodeIter.hasNext());
		return null;
	}

	
	private static INode getLeafNodeForLine(INode aNode, int lineNumber) {
		if (lineNumber >= aNode.getStartLine() && lineNumber <= aNode.getEndLine()) {
			if (aNode instanceof ICompositeNode) {
				for (INode childNode : ((ICompositeNode) aNode).getChildren()) {
					INode result = getLeafNodeForLine(childNode, lineNumber);
					if (result != null) {
						return result;
					}
				}
			} else {
				return aNode;
			}
		}
		return null;
	}
}