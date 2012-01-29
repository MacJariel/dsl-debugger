package org.macjariel.dsl.internal.debug.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.internal.debug.core.breakpoints.DSLLineBreakpoint;
import org.macjariel.dsl.utils.Annotator;
import org.macjariel.dsl.utils.EMFHelper;

public class DSLThread extends DSLDebugElement implements IThread {

	private static boolean DEBUG = true;

	private Annotator annotator = DEBUG ? new Annotator() : null;

	private IThread gplThread;

	private List<DSLStackFrame> stackFrames;

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
		return true;
	}

	@Override
	public boolean canStepOver() {
		return true;
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
		Collection<EObject> next = DSLDebuggerPlugin.getInstance().getMappingManager().getMappingAlgorithms()
				.findSemanticElementsForStepIntoBreakpoints(stackFrames);
		for (EObject obj : next) {
			EMFHelper.getWorkspaceResource(obj.eResource());
			IResource resource = EMFHelper.getWorkspaceResource(obj.eResource());
			DSLLineBreakpoint bp = DSLLineBreakpoint.create(resource, obj);
			bp.installGplBreakpoint(getDebugTarget());
			stepBreakpoints.add(bp);
		}

		gplThread.resume();
	}

	private List<DSLLineBreakpoint> stepBreakpoints = new ArrayList<DSLLineBreakpoint>();

	@Override
	public void stepOver() throws DebugException {
		EObject next = DSLDebuggerPlugin.getInstance().getMappingManager().getMappingAlgorithms()
				.findSemanticElementForStepOver(stackFrames);
		if (next != null) {
			IResource res = stackFrames.get(0).getResource();
			DSLLineBreakpoint bp = DSLLineBreakpoint.create(res, next);
			bp.installGplBreakpoint(getDebugTarget());
			stepBreakpoints.add(bp);
		}

		gplThread.resume();
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

		// Remove all step breakpoints
		for (Iterator<DSLLineBreakpoint> it = stepBreakpoints.iterator(); it.hasNext();) {
			DSLLineBreakpoint bp = it.next();
			try {
				bp.delete();
			} catch (CoreException e) {
				DSLDebuggerLog.log(e);
			}
			it.remove();
		}

		if (DEBUG) {
			annotator.clearAnnotations();

			// Annotate current position
			EObject currentElement = stackFrames.size() > 0 ? stackFrames.get(0)
					.getSemanticElement() : null;
			if (currentElement != null)
				annotator.addAnnotation(currentElement, "Current Element");

			// Annotate breakpoint positions for stepping
			EObject stepOver = DSLDebuggerPlugin.getInstance().getMappingManager()
					.getMappingAlgorithms().findSemanticElementForStepOver(stackFrames);
			if (stepOver != null)
				annotator.addAnnotation(stepOver, "Step Over");

			Collection<EObject> stepInto = DSLDebuggerPlugin.getInstance().getMappingManager()
					.getMappingAlgorithms().findSemanticElementsForStepIntoBreakpoints(stackFrames);
			annotator.addAnnotation(stepInto, "Step Into");

			
		}

	}

	void eventResumed() {
		if (DEBUG) {
			annotator.clearAnnotations();
		}
	}

	void updateStackFrames() throws DebugException {
		getDSLDebugTarget()
				.getMappingManager()
				.getCallStackMapping()
				.updateStackFrames(getDebugTarget(), this, this.stackFrames,
						gplThread.getStackFrames(), DSLStackFrameFactory.INSTANCE);
	}
}
