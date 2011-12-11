package org.macjariel.dsl.debugger.mapping.impl;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.mapping.ICallStackMapping;
import org.macjariel.dsl.debugger.mapping.IMappingManager;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;

public class CallStackMappingImpl implements ICallStackMapping {

	private IMappingManager mappingManager;
	

	public CallStackMappingImpl(IMappingManager mappingManager) {
		this.mappingManager = mappingManager;
	}

	@Override
	public void updateStackFrames(IDebugTarget dslDebugTarget, IThread dslThread,
			List<IStackFrame> dslStackFrames, IStackFrame[] gplStackFrames) throws DebugException {
		
		// TODO: we could reuse DSLStackFrames, instead of deleting them
		// this approach should provide better UI experience

		dslStackFrames.clear();

		for (IStackFrame stackFrame : gplStackFrames) {
			Object sourceElement = dslDebugTarget.getLaunch().getSourceLocator()
					.getSourceElement(stackFrame);
			IResource sourceElementResource = null;

			// Each debug model can use its own types for source elements.
			// We try to convert the source element to IResource, first directly
			// and then using the Adapter mechanism.
			// This works for JDIDebugModel, but might not work for another
			// debug models (another GPL languages). Please, fill a debug
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
				DSLDebuggerLog.logInfo("Cannot find IResource for source element '" + sourceElement  + "'.");
				continue;
			}

			DSLDebuggerLog.logInfo("[DEBUG] StackFrame: " + sourceElementResource + ", line: "
					+ stackFrame.getLineNumber() + ", charStart: " + stackFrame.getCharStart()
					+ ", charEnd: " + stackFrame.getCharEnd() + ".");

			ISourceTargetMapping.IItem mappingItem = mappingManager.getSourceTargetMapping().lookupSourceElement(
					sourceElementResource, stackFrame.getLineNumber(), stackFrame.getCharStart(),
					stackFrame.getCharEnd());

			if (mappingItem != null) {
				String stackFrameText = mappingItem.getSourceSubroutineName();
				
				dslStackFrames.add(mappingManager.getDslDebugElementFactory().createStackFrame(dslDebugTarget,
						dslThread, mappingItem.getSourceFile(), mappingItem.getSourceStartLine(),
						mappingItem.getSourceCharStart(), mappingItem.getSourceCharEnd(), stackFrameText));

			}

		}

	}

}
