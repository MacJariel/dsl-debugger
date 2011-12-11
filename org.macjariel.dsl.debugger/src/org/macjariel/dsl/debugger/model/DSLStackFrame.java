package org.macjariel.dsl.debugger.model;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

public class DSLStackFrame extends DSLDebugElement implements IStackFrame {

	private final DSLThread dslThread;

	private final IResource resource;

	private final int lineNumber, charStart, charEnd;
	
	private final String stackFrameText;

	public DSLStackFrame(IDebugTarget target, DSLThread thread, IResource resource, int lineNumber,
			int charStart, int charEnd, String stackFrameText) {
		super(target);
		this.dslThread = thread;
		this.resource = resource;
		this.lineNumber = lineNumber;
		this.charStart = charStart;
		this.charEnd = charEnd;
		this.stackFrameText = stackFrameText;
	}

	public IResource getResource() {
		return resource;
	}
	
	@Override
	public IVariable[] getVariables() throws DebugException {
		return null;
	}

	@Override
	public boolean hasVariables() throws DebugException {
		return false;
	}

	@Override
	public int getLineNumber() throws DebugException {
		return lineNumber;
	}

	@Override
	public int getCharStart() throws DebugException {
		return charStart;
	}

	@Override
	public int getCharEnd() throws DebugException {
		return charEnd;
	}

	@Override
	public String getName() throws DebugException {
		// Should rather return procedure name
		return resource.getName() + " line: " + lineNumber;
	}

	@Override
	public IRegisterGroup[] getRegisterGroups() throws DebugException {
		return null;
	}

	@Override
	public boolean hasRegisterGroups() throws DebugException {
		return false;
	}

	@Override
	public boolean canStepInto() {
		return dslThread.canStepInto();
	}

	@Override
	public boolean canStepOver() {
		return dslThread.canStepOver();
	}

	@Override
	public boolean canStepReturn() {
		return dslThread.canStepReturn();
	}

	@Override
	public boolean isStepping() {
		return dslThread.isStepping();
	}

	@Override
	public void stepInto() throws DebugException {
		dslThread.stepInto();
	}

	@Override
	public void stepOver() throws DebugException {
		dslThread.stepOver();
	}

	@Override
	public void stepReturn() throws DebugException {
		dslThread.stepReturn();

	}

	@Override
	public boolean canResume() {
		return dslThread.canResume();
	}

	@Override
	public boolean canSuspend() {
		return dslThread.canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return dslThread.isSuspended();
	}

	@Override
	public void resume() throws DebugException {
		dslThread.resume();
	}

	@Override
	public void suspend() throws DebugException {
		dslThread.suspend();
	}

	@Override
	public boolean canTerminate() {
		return dslThread.canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return dslThread.isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		dslThread.terminate();
	}

	@Override
	public IThread getThread() {
		return dslThread;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IResource.class) {
			return this.resource;
		//} else if (adapter == IElementLabelProvider.class) {
		// IDebugModelProvider
		// ISourceDisplay (in UI)
		}
		
		return super.getAdapter(adapter);
	}
	
	@Override
	public String toString() {
		return stackFrameText + " line: " + lineNumber;
	}
}
