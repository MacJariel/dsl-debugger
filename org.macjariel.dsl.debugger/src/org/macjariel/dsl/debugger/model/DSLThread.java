package org.macjariel.dsl.debugger.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;

public class DSLThread extends DSLDebugElement implements IThread {

	private IThread gplThread;

	private List<IStackFrame> stackFrames;

	public DSLThread(IDebugTarget target, IThread gplThread) {
		super(target);
		this.gplThread = gplThread;
		this.stackFrames = new ArrayList<IStackFrame>();
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
		return stackFrames.size() > 0 ? stackFrames.get(0) : null;
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
		getDSLDebugTarget().getMappingManager().getCallStackMapping().updateStackFrames(getDebugTarget(), this, this.stackFrames,
		gplThread.getStackFrames());
	}
}
