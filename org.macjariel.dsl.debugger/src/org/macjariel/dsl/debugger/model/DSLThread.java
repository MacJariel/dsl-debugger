package org.macjariel.dsl.debugger.model;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.internal.debug.core.JavaDebugUtils;
import org.eclipse.jdt.internal.debug.core.model.JDIStackFrame;
import org.macjariel.dsl.debugger.traceability.SourceTargetMapping;
import org.macjariel.dsl.debugger.traceability.SourceTargetMapping.MappingItem;

public class DSLThread extends DSLDebugElement implements IThread {

	private IThread gplThread;

	private ArrayList<DSLStackFrame> stackFrames;

	public DSLThread(IDebugTarget target, IThread gplThread) {
		super(target);
		this.gplThread = gplThread;
		this.stackFrames = new ArrayList<DSLStackFrame>();
	}

	public IThread getGplThread() {
		return gplThread;
	}

	@Override
	public boolean canResume() {
		return gplThread.canResume();
	}

	@Override
	public boolean canSuspend() {
		return gplThread.canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return gplThread.isSuspended();
	}

	@Override
	public void resume() throws DebugException {
		gplThread.resume();
	}

	@Override
	public void suspend() throws DebugException {
		gplThread.suspend();
	}

	@Override
	public boolean canStepInto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepReturn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStepping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stepInto() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepOver() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepReturn() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canTerminate() {
		return gplThread.canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return gplThread.isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		gplThread.terminate();
	}

	@Override
	public IStackFrame[] getStackFrames() throws DebugException {
		return stackFrames.toArray(new IStackFrame[stackFrames.size()]);
	}

	@Override
	public boolean hasStackFrames() throws DebugException {
		return stackFrames.size() != 0;
	}

	@Override
	public int getPriority() throws DebugException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IStackFrame getTopStackFrame() throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() throws DebugException {
		return "DSL <" + gplThread.getName() + ">";
	}

	@Override
	public IBreakpoint[] getBreakpoints() {
		return gplThread.getBreakpoints();
	}

	void eventSuspended() {
		try {
			updateStackFrames();
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void updateStackFrames() throws DebugException {
		// TODO: we could reuse DSLStackFrames, instead of deleting them
		// this approach should provide better UI experience

		stackFrames.clear();

		if (gplThread.hasStackFrames()) {
			for (IStackFrame stackFrame : gplThread.getStackFrames()) {
				Object sourceElement = getLaunch().getSourceLocator().getSourceElement(stackFrame);
				IResource sourceElementResource = null;

				// Each debug model can use its own types for source elements.
				// We try to convert the
				// source element to IResource, first directly and then using
				// the Adapter mechanism.
				// This works for JDIDebugModel, but might not work for another
				// debug models (another
				// GPL languages). Please, fill a debug report, if your language
				// is not supported.

				if (sourceElement instanceof IResource) {
					sourceElementResource = (IResource) sourceElement;
				} else if (sourceElement instanceof IAdaptable) {
					sourceElementResource = (IResource) ((IAdaptable) sourceElement)
							.getAdapter(IResource.class);
				} else {
					throw new RuntimeException(
							"Don't know how to convert source elements of type '"
									+ sourceElement.getClass().getName() + "' to IResource.");
				}

				if (sourceElementResource == null) {
					System.err.println("Cannot find IResource for a source element, maybe its OK.");
					return;
					// throw new
					// RuntimeException("Cannot find IResource for a source element.");
				}

				System.out.println("[DEBUG] StackFrame: " + sourceElementResource + ", line: "
						+ stackFrame.getLineNumber() + ", charStart: " + stackFrame.getCharStart()
						+ ", charEnd: " + stackFrame.getCharEnd() + ".");

				MappingItem mappingItem = getDSLDebugTarget().getSourceTargetMapping()
						.lookupSourceElement(
								new MappingItem(sourceElementResource, stackFrame.getLineNumber(),
										stackFrame.getCharStart(), stackFrame.getCharEnd()));
				if (mappingItem != null) {

					stackFrames.add(new DSLStackFrame(getDebugTarget(), this, mappingItem.resource,
							mappingItem.lineNumber, mappingItem.charStart, mappingItem.charEnd));

				}

			}

		} else {
			stackFrames.clear();
		}

	}

}
