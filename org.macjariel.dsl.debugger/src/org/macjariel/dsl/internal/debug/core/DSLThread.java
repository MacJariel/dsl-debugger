package org.macjariel.dsl.internal.debug.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.IDSLStackFrame;
import org.macjariel.dsl.debug.core.IDSLThread;
import org.macjariel.dsl.debug.core.ISteppingStrategy;
import org.macjariel.dsl.utils.Annotator;

public class DSLThread extends DSLDebugElement implements IDSLThread {

	private static boolean DEBUG = true;

	private Annotator annotator = DEBUG ? new Annotator() : null;

	private IThread gplThread;

	private List<DSLStackFrame> stackFrames;

	private boolean isStepping = false;

	private ISteppingStrategy steppingStrategy = null;

	public DSLThread(IDebugTarget target, IThread gplThread) {
		super(target);
		this.gplThread = gplThread;
		this.stackFrames = new ArrayList<DSLStackFrame>();
	}

	@Override
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
		return isSuspended() && (steppingStrategy != null) && steppingStrategy.canStepInto();
	}

	@Override
	public boolean canStepOver() {
		return isSuspended() && (steppingStrategy != null) && steppingStrategy.canStepOver();
	}

	@Override
	public boolean canStepReturn() {
		return isSuspended() && (steppingStrategy != null) && steppingStrategy.canStepReturn();
	}

	@Override
	public boolean isStepping() {
		return isStepping;
	}

	@Override
	public void setStepping(boolean isStepping) {
		this.isStepping = isStepping;
	}

	@Override
	public void stepInto() throws DebugException {
		assert (steppingStrategy != null);
		steppingStrategy.stepInto(this);
	}

	@Override
	public void stepOver() throws DebugException {
		assert (steppingStrategy != null);
		steppingStrategy.stepOver(this);
	}

	@Override
	public void stepReturn() throws DebugException {
		assert (steppingStrategy != null);
		steppingStrategy.stepReturn(this);
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
	public List<? extends IDSLStackFrame> getDSLStackFrames() {
		return stackFrames;
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

	/**
	 * Notified when the corresponding GPL thread has been suspended.
	 */
	void suspended(int detail) {
		// TODO: handle reason of suspend, that is encoded in detail argument
		
		// Is it possible that the GPL thread is not suspended by now?
		Assert.isTrue(gplThread.isSuspended());
		
		try {
			updateStackFrames();
		} catch (DebugException e) {
			DSLDebuggerLog.log(e);
		}
		
		// TODO: should this suspend event have same detail as GPL suspend event?
		fireSuspendEvent(detail);

		if (DEBUG) {
			annotator.clearAnnotations();

			// Annotate current position
			EObject currentElement =
					stackFrames.size() > 0 ? stackFrames.get(0).getSemanticElement() : null;
			if (currentElement != null)
				annotator.addAnnotation(currentElement, "Current Element");

			// Annotate breakpoint positions for stepping
			Collection<EObject> stepInto =
					DSLDebuggerPlugin.getInstance().getMappingManager().getMappingAlgorithms()
							.findSemanticElementsForStepIntoBreakpoints(stackFrames);
			annotator.addAnnotation(stepInto, "Step Into");

			Collection<EObject> stepOver =
					DSLDebuggerPlugin.getInstance().getMappingManager().getMappingAlgorithms()
							.findSemanticElementsForStepOverBreakpoints(stackFrames);
			annotator.addAnnotation(stepOver, "Step Over");

		}

	}

	/**
	 * Notified when the corresponding GPL thread has been resumed.
	 * @param details
	 */
	void resumed(int detail) {
		if (DEBUG) {
			annotator.clearAnnotations();
		}
		fireResumeEvent(detail);
	}

	void updateStackFrames() throws DebugException {
		DSLDebuggerPlugin
				.getInstance()
				.getMappingManager()
				.getCallStackMapping()
				.updateStackFrames(getDebugTarget(), this, this.stackFrames,
						gplThread.getStackFrames(), DSLStackFrameFactory.INSTANCE);
	}

	/**
	 * Notification this thread has terminated - update state and fire a
	 * terminate event.
	 */
	protected void terminated() {
		fireTerminateEvent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.macjariel.dsl.debug.core.IDSLThread#getSteppingStrategy()
	 */
	@Override
	public ISteppingStrategy getSteppingStrategy() {
		return steppingStrategy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.macjariel.dsl.debug.core.IDSLThread#setSteppingStrategy(org.macjariel
	 * .dsl.debug.core.ISteppingStrategy)
	 */
	@Override
	public void setSteppingStrategy(ISteppingStrategy steppingStrategy) {
		this.steppingStrategy = steppingStrategy;
	}

}
