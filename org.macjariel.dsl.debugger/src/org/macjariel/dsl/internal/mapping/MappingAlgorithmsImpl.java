package org.macjariel.dsl.internal.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.macjariel.dsl.debug.core.IDSLStackFrame;
import org.macjariel.dsl.mapping.IMappingAlgorithms;
import org.macjariel.dsl.mapping.IMappingManager;
import org.macjariel.dsl.mapping.ISourceTargetMapping;
import org.macjariel.dsl.mapping.ISourceTargetMapping.IItem;
import org.macjariel.dsl.mapping.traceability.SemanticElementType;

public class MappingAlgorithmsImpl implements IMappingAlgorithms {

	private IMappingManager mappingManager;

	public MappingAlgorithmsImpl(IMappingManager mappingManager) {
		this.mappingManager = mappingManager;
	}

	// TODO: we still don't use this method, because I came across another
	// problem with breakpoints and breakpoint manager. I need to make the whole
	// IMappingManager accessible anytime, not only during debugging session,
	// then I can finish this.

	@Override
	public IItem lookupMappingItemForLineBreakpoint(IResource dslResource, int line) {
		List<ISourceTargetMapping.IItem> items = new Vector<ISourceTargetMapping.IItem>();
		for (ISourceTargetMapping.IItem item : mappingManager.getSourceTargetMapping()
				.getAllMappingItems()) {
			if (item.getSourceFile().equals(dslResource) && item.getSourceStartLine() == line
					&& item.getSemanticElementTypes().contains(SemanticElementType.STATEMENT)) {
				items.add(item);
			}
		}

		if (items.size() == 1) {
			return items.get(0);
		} else if (items.size() > 1) {
			// There are more statements on the line, return the leftmost one
			IItem leftmostItem = items.get(0);
			for (IItem item : items) {
				if (item.getSourceCharStart() < leftmostItem.getSourceCharStart()) {
					leftmostItem = item;
				}
			}
			return leftmostItem;
		}
		return null;
	}

	private static boolean testSemanticElementType(EObject semanticElement,
			SemanticElementType semanticElementType) {
		return SemanticElementType.create(semanticElement).contains(semanticElementType);
	}

	private static EObject findFirstStatement(EList<EObject> statements) {
		for (Object object : statements) {
			if (!(object instanceof EObject))
				continue;
			EObject statement = (EObject) object;
			if (testSemanticElementType(statement, SemanticElementType.STATEMENT))
				return statement;
		}
		return null;
	}

	private Collection<EObject> findConditionalBlockBreakpoints(EObject conditionalBlock) {
		Collection<EObject> results = new ArrayList<EObject>();

		EList<EStructuralFeature> structuralFeatures = conditionalBlock.eClass()
				.getEAllStructuralFeatures();
		for (EStructuralFeature feature : structuralFeatures) {
			Object object = conditionalBlock.eGet(feature);

			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				if (testSemanticElementType(eObject, SemanticElementType.STATEMENT)) {
					results.add(eObject);
				} else if (testSemanticElementType(eObject, SemanticElementType.CONDITIONAL_BLOCK)) {
					results.addAll(findConditionalBlockBreakpoints(eObject));
				}
			} else if (object instanceof EList) {
				EList<EObject> eList = (EList<EObject>) object;
				Iterator<EObject> iter = eList.iterator();
				while (iter.hasNext()) {
					EObject eObject = iter.next();
					if (testSemanticElementType(eObject, SemanticElementType.STATEMENT)) {
						results.add(eObject);
						break;
					} else if (testSemanticElementType(eObject, SemanticElementType.CONDITIONAL_BLOCK)) {
						results.addAll(findConditionalBlockBreakpoints(eObject));
					}
				}
			}
		}
		return results;
	}

	private Iterator<EObject> findNextElementIter(EObject semanticObject) {
		EObject containerElement = semanticObject.eContainer();

		EList<EStructuralFeature> structuralFeatures = containerElement.eClass()
				.getEAllStructuralFeatures();
		for (EStructuralFeature feature : structuralFeatures) {
			Object object = containerElement.eGet(feature);

			if (object instanceof EObject && object.equals(semanticObject)) {
				return null;
			} else if (object instanceof EList) {
				EList<EObject> eList = (EList<EObject>) object;
				Iterator<EObject> it = eList.iterator();
				while (it.hasNext()) {
					if (it.next().equals(semanticObject)) {
						return it.hasNext() ? it : null;
					}
				}
			}
		}
		return null;
	}

	@Override
	public Collection<EObject> findSemanticElementsForStepOverBreakpoints(
			List<? extends IDSLStackFrame> stackFrames) {
		Assert.isLegal(stackFrames.size() != 0);

		Collection<EObject> results = new ArrayList<EObject>();

		Iterator<? extends IDSLStackFrame> stackFrameIter = stackFrames.iterator();
		IDSLStackFrame stackFrame = stackFrameIter.next();

		EObject currentElement = stackFrame.getSemanticElement();
		EObject containerElement = currentElement.eContainer();
		Iterator<EObject> nextElementIter = findNextElementIter(currentElement);

		while (true) {

			if (nextElementIter != null && nextElementIter.hasNext()) {
				EObject nextElement = nextElementIter.next();
				Set<SemanticElementType> nextElementType = SemanticElementType.create(nextElement);
				if (nextElementType.contains(SemanticElementType.CONDITIONAL_BLOCK)) {
					results.addAll(findConditionalBlockBreakpoints(nextElement));
					// We don't break here, so we are examining the element right after CONDITIONAL_BLOCK
				}

				if (nextElementType.contains(SemanticElementType.STATEMENT)) {
					results.add(nextElement);
					// We found a STATEMENT, so we can end
					// Handling of possible "break" and "continue"
					containerElement = nextElement.eContainer();
					while (containerElement != null) {
						Set<SemanticElementType> containerElementType = SemanticElementType
								.create(containerElement);
						if (containerElementType.contains(SemanticElementType.CONDITIONAL_BLOCK)) {
							results.addAll(findConditionalBlockBreakpoints(containerElement));
						}
						
						if (containerElementType.contains(SemanticElementType.SUBROUTINE_DEFINITION)) {
							break;
						}
						containerElement = containerElement.eContainer();
					}
					
					break;
				}
			} else {
				Set<SemanticElementType> containerElementType = SemanticElementType
						.create(containerElement);

				if (containerElementType.contains(SemanticElementType.CONDITIONAL_BLOCK)) {
					// We are at the end of a CONDITIONAL_BLOCK, so we add
					// all breakpoints for it and continue
					results.addAll(findConditionalBlockBreakpoints(containerElement));
				}

				if (containerElementType.contains(SemanticElementType.SUBROUTINE_DEFINITION)) {
					// We are at the end of a subroutine, examine another stack
					// frame
					if (stackFrameIter.hasNext()) {
						stackFrame = stackFrameIter.next();
					} else {
						break;
					}
					currentElement = stackFrame.getSemanticElement();
				} else {
					// Examine the container
					currentElement = containerElement;
				}
				containerElement = currentElement.eContainer();
				nextElementIter = findNextElementIter(currentElement);
			}
		}
		return results;

//		if (testSemanticElementType(containerElement, SemanticElementType.CONDITIONAL_BLOCK)) {
//			results.addAll(findConditionalBlockBreakpoints(containerElement));
//		}
//
//		TreeIterator<EObject> siblingElementIter = containerElement.eAllContents();
//		EObject siblingElement = null;
//		while (siblingElementIter.hasNext()) {
//			siblingElement = siblingElementIter.next();
//			if (siblingElement.equals(currentElement)) {
//				break;
//			}
//			siblingElementIter.prune();
//		}
//
//		Assert.isTrue(currentElement.equals(siblingElement));
//
//		while (siblingElementIter.hasNext()) {
//			siblingElement = siblingElementIter.next();
//			Set<SemanticElementType> siblingElementType = SemanticElementType
//					.create(siblingElement);
//
//			if (siblingElementType.contains(SemanticElementType.STATEMENT)) {
//				results.add(siblingElement);
//				break;
//			} else if (siblingElementType.contains(SemanticElementType.CONDITIONAL_BLOCK)) {
//				results.addAll(findConditionalBlockBreakpoints(siblingElement));
//				siblingElementIter.prune();
//			}
//
//		}

		// Iterator<? extends IDSLStackFrame> stackFrameIterator =
		// stackFrames.iterator();
		// EObject result = null;
		// while (result == null && stackFrameIterator.hasNext()) {
		// IDSLStackFrame stackFrame = stackFrameIterator.next();
		// EObject stackFrameSemanticElement = stackFrame.getSemanticElement();
		//
		// // Find first breakable on the same level
		// TreeIterator<EObject> iter =
		// stackFrameSemanticElement.eContainer().eAllContents();
		// EObject i = null;
		// while (iter.hasNext() && !stackFrameSemanticElement.equals(i)) {
		// i = iter.next();
		// iter.prune();
		// }
		// Assert.isTrue(stackFrameSemanticElement.equals(i));
		//
		// while (iter.hasNext()) {
		// i = iter.next();
		// Set<SemanticElementType> semanticElementTypes =
		// SemanticElementType.create(i);
		// if (semanticElementTypes.contains(SemanticElementType.STATEMENT)) {
		// result = i;
		// break;
		// }
		// }
		//
		// }
		// return result;
	}

	@Override
	public Collection<EObject> findSemanticElementsForStepIntoBreakpoints(
			List<? extends IDSLStackFrame> stackFrames) {
		Iterator<? extends IDSLStackFrame> stackFrameIterator = stackFrames.iterator();
		Collection<EObject> result = new ArrayList<EObject>();
		while (result.size() == 0 && stackFrameIterator.hasNext()) {
			IDSLStackFrame stackFrame = stackFrameIterator.next();
			EObject stackFrameSemanticElement = stackFrame.getSemanticElement();

			// Find first breakable on the same level
			TreeIterator<EObject> iter = stackFrameSemanticElement.eContainer().eAllContents();
			EObject i = null;
			while (iter.hasNext() && !stackFrameSemanticElement.equals(i)) {
				i = iter.next();
				iter.prune();
			}
			Assert.isTrue(stackFrameSemanticElement.equals(i));

			Set<SemanticElementType> semanticElementTypes = SemanticElementType.create(i);
			if (semanticElementTypes.contains(SemanticElementType.SUBROUTINE_CALL)) {
				EObject subrutineDefinition = null;
				for (EObject crossRef : stackFrameSemanticElement.eCrossReferences()) {
					Set<SemanticElementType> semanticElementTypes2 = SemanticElementType
							.create(crossRef);
					if (semanticElementTypes2.contains(SemanticElementType.SUBROUTINE_DEFINITION)) {
						subrutineDefinition = crossRef;
					}
				}

				if (subrutineDefinition != null) {
					EObject firstStatement = findFirstStatement(subrutineDefinition.eAllContents());
					if (firstStatement != null) {
						result.add(firstStatement);
					}
				}
			}

			// Catch to be sure
			EObject statement = findFirstStatement(iter);
			if (statement != null) {
				result.add(statement);
			}

		}
		return result;
	}

	EObject findFirstStatement(Iterator<EObject> iter) {
		while (iter.hasNext()) {
			EObject item = iter.next();
			Set<SemanticElementType> semanticElementTypes = SemanticElementType.create(item);
			if (semanticElementTypes.contains(SemanticElementType.STATEMENT)) {
				return item;
			}
		}
		return null;
	}
}
