package org.macjariel.dsl.mapping.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.internal.debug.core.IDSLStackFrame;
import org.macjariel.dsl.internal.debug.core.IStackFrameFactory;
import org.macjariel.dsl.mapping.ICallStackMapping;
import org.macjariel.dsl.mapping.IMappingManager;
import org.macjariel.dsl.mapping.ISourceTargetMapping;
import org.macjariel.dsl.mapping.ISourceTargetMapping.IItem;

public class CallStackMappingImpl implements ICallStackMapping {

	private IMappingManager mappingManager;

	public CallStackMappingImpl(IMappingManager mappingManager) {
		this.mappingManager = mappingManager;
	}

	@Override
	public <T extends IDSLStackFrame> void updateStackFrames(IDebugTarget dslDebugTarget,
			IThread dslThread, List<T> dslStackFrames, IStackFrame[] gplStackFrames,
			IStackFrameFactory<T> stackFrameFactory) throws DebugException {

		// TODO: we could reuse DSLStackFrames, instead of deleting them
		// this approach should provide better UI experience

		// dslStackFrames.clear();
		List<ISourceTargetMapping.IItem> mappingItems = new ArrayList<ISourceTargetMapping.IItem>(
				gplStackFrames.length);

		for (IStackFrame stackFrame : gplStackFrames) {
			Object sourceElement = dslDebugTarget.getLaunch().getSourceLocator()
					.getSourceElement(stackFrame);
			IResource sourceElementResource = null;

			// Each debug model can use its own types for source elements.
			// We try to convert the source element to IResource, first directly
			// and then using the Adapter mechanism.
			// This works for JDIDebugModel, but might not work for another
			// debug models (another GPL languages). Please, fill a bug
			// report, if your language is not supported.

			if (sourceElement instanceof IResource) {
				sourceElementResource = (IResource) sourceElement;
			} else if (sourceElement instanceof IAdaptable) {
				sourceElementResource = (IResource) ((IAdaptable) sourceElement)
						.getAdapter(IResource.class);
			} else {
				throw new RuntimeException("Don't know how to convert source elements of type '"
						+ sourceElement.getClass().getName() + "' to IResource.");
			}

			if (sourceElementResource == null) {
				DSLDebuggerLog.logInfo("Cannot find IResource for source element '" + sourceElement
						+ "'.");
				continue;
			}

			DSLDebuggerLog.logInfo("[DEBUG] StackFrame: " + sourceElementResource + ", line: "
					+ stackFrame.getLineNumber() + ", charStart: " + stackFrame.getCharStart()
					+ ", charEnd: " + stackFrame.getCharEnd() + ".");

			ISourceTargetMapping.IItem mappingItem = mappingManager.getSourceTargetMapping()
					.lookupSourceElement(sourceElementResource, stackFrame.getLineNumber(),
							stackFrame.getCharStart(), stackFrame.getCharEnd());
			mappingItems.add(mappingItem);

			/*
			 * if (mappingItem != null) { String stackFrameText =
			 * mappingItem.getSourceSubroutineName();
			 * dslStackFrames.add(stackFrameFactory
			 * .createStackFrame(dslDebugTarget, dslThread,
			 * mappingItem.getSourceFile(), mappingItem.getSourceStartLine(),
			 * mappingItem.getSourceCharStart(), mappingItem.getSourceCharEnd(),
			 * stackFrameText)); }
			 */
		}

		ListIterator<IItem> mappingItemsIter = mappingItems.listIterator(mappingItems.size());
		ListIterator<T> dslStackFramesIter = dslStackFrames.listIterator(dslStackFrames.size());

		while (mappingItemsIter.hasPrevious()) {
			final IItem mappingItem = mappingItemsIter.previous();
			if (mappingItem == null)
				continue;
			if (dslStackFramesIter.hasPrevious()) {
				final T dslStackFrame = dslStackFramesIter.previous();
				if (!stackFrameFactory.stackFrameEquals(dslStackFrame, mappingItem)) {
					stackFrameFactory.updateStackFrame(dslDebugTarget, dslThread, dslStackFrame,
							mappingItem);
				}
			} else {
				dslStackFramesIter.add(stackFrameFactory.createStackFrame(dslDebugTarget, dslThread, mappingItem));
				dslStackFramesIter.previous(); // We skip over the element just added
			}
		}
		while (dslStackFramesIter.hasPrevious()) {
			dslStackFramesIter.previous();
			dslStackFramesIter.remove();
		}
	}
}
