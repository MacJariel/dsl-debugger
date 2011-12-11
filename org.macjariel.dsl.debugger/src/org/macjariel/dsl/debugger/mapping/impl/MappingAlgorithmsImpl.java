package org.macjariel.dsl.debugger.mapping.impl;

import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.debugger.mapping.IMappingAlgorithms;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping.IItem;
import org.macjariel.dsl.debugger.traceability.SourceElementType;

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
					&& item.getSourceElementTypes().contains(SourceElementType.STATEMENT)) {
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
}
