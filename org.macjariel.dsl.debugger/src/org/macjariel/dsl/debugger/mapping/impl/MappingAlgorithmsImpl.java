package org.macjariel.dsl.debugger.mapping.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debugger.mapping.IMappingAlgorithms;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping.IItem;
import org.macjariel.dsl.debugger.model.IDSLStackFrame;
import org.macjariel.dsl.debugger.traceability.SemanticElementType;

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

	@Override
	public EObject findSemanticElementForStepOver(List<? extends IDSLStackFrame> stackFrames) {
		Iterator<? extends IDSLStackFrame> stackFrameIterator = stackFrames.iterator();
		EObject result = null;
		while (result == null && stackFrameIterator.hasNext()) {
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

			while (iter.hasNext()) {
				i = iter.next();
				Set<SemanticElementType> semanticElementTypes = SemanticElementType.create(i);
				if (semanticElementTypes.contains(SemanticElementType.STATEMENT)) {
					result = i;
					break;
				}
			}

		}
		return result;
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
