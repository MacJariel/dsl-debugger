package org.macjariel.dsl.internal.debug.core.stepping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.emf.ecore.EObject;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.DSLDebugModel;
import org.macjariel.dsl.debug.core.IDSLLineBreakpoint;
import org.macjariel.dsl.debug.core.IDSLStackFrame;
import org.macjariel.dsl.debug.core.IDSLThread;
import org.macjariel.dsl.debug.core.IDebugEventHandler;
import org.macjariel.dsl.debug.core.ISteppingStrategy;
import org.macjariel.dsl.utils.EMFHelper;

public class DefaultSteppingStrategy implements ISteppingStrategy {

	private void installBreakpoints(final IDSLThread thread,
			final Collection<EObject> semanticElements) throws DebugException {
		final List<IDSLLineBreakpoint> breakpoints = new ArrayList<IDSLLineBreakpoint>();
		try {
			for (EObject semanticElement : semanticElements) {
				EMFHelper.getWorkspaceResource(semanticElement.eResource());
				IResource resource = EMFHelper.getWorkspaceResource(semanticElement.eResource());

				try {
					IDSLLineBreakpoint bp =
							DSLDebugModel.createLineBreakpoint(resource, semanticElement, false,
									false, null);
					bp.installGplBreakpoint(thread.getDSLDebugTarget());
					breakpoints.add(bp);
				} catch (CoreException e) {
					throw new DebugException(DSLDebuggerLog.createStatus(e));
				}
			}
		} finally {
			if (breakpoints.size() > 0) {
				thread.getDSLDebugTarget().debugEventHandlers()
						.add(new BreakpointCleaner(thread, breakpoints));
			}
		}
	}

	@Override
	public boolean canStepInto() {
		return true;
	}

	@Override
	public void stepInto(final IDSLThread thread) throws DebugException {
		List<IDSLStackFrame> stackFrames =
				Arrays.asList((IDSLStackFrame[]) thread.getStackFrames());

		Collection<EObject> semanticElements =
				DSLDebuggerPlugin.getInstance().getMappingManager().getMappingAlgorithms()
						.findSemanticElementsForStepIntoBreakpoints(stackFrames);

		installBreakpoints(thread, semanticElements);

		thread.getGplThread().resume();
	}

	@Override
	public boolean canStepOver() {
		return true;
	}

	@Override
	public void stepOver(IDSLThread thread) throws DebugException {
		List<? extends IDSLStackFrame> stackFrames = thread.getDSLStackFrames();

		Collection<EObject> semanticElements =
				DSLDebuggerPlugin.getInstance().getMappingManager().getMappingAlgorithms()
						.findSemanticElementsForStepOverBreakpoints(stackFrames);

		installBreakpoints(thread, semanticElements);

		thread.getGplThread().resume();
	}

	@Override
	public boolean canStepReturn() {
		return false;
	}

	@Override
	public void stepReturn(IDSLThread thread) throws DebugException {
		throw new IllegalStateException();
	}

	static class BreakpointCleaner implements IDebugEventHandler {

		final IDSLThread thread;
		final List<IDSLLineBreakpoint> breakpoints;

		public BreakpointCleaner(final IDSLThread thread, final List<IDSLLineBreakpoint> breakpoints) {
			this.thread = thread;
			this.breakpoints = breakpoints;
		}

		@Override
		public boolean handleDebugEvent(DebugEvent event) {
			if (thread.getGplThread() == event.getSource() && event.getKind() == DebugEvent.SUSPEND) {

				// Remove all step breakpoints
				for (Iterator<IDSLLineBreakpoint> it = breakpoints.iterator(); it.hasNext();) {
					IDSLLineBreakpoint bp = it.next();
					try {
						bp.delete();
					} catch (CoreException e) {
						DSLDebuggerLog.log(e);
					}
					it.remove();
				}
				thread.getDSLDebugTarget().debugEventHandlers().remove(this);
				return false;
			}
			return false;
		}
	}

}
