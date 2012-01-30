package org.macjariel.dsl.internal.debug.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.IDSLDebugElement;
import org.macjariel.dsl.debug.core.IDSLDebugTarget;
import org.macjariel.dsl.debug.core.IDebugEventHandler;
import org.macjariel.dsl.debug.core.ISteppingStrategy;
import org.macjariel.dsl.internal.debug.core.breakpoints.DSLLineBreakpoint;
import org.macjariel.dsl.internal.debug.core.stepping.DefaultSteppingStrategy;
import org.macjariel.dsl.mapping.IMappingManager;
import org.macjariel.dsl.platform.ITargetPlatformFactory;

public class DSLDebugTarget extends DSLDebugElement implements IDSLDebugTarget,
		IDebugEventSetListener {

	private final ILaunch launch;

	private final ITargetPlatformFactory targetPlatformFactory;

	private final ISteppingStrategy steppingStrategy;

	private List<DSLThread> dslThreads = new ArrayList<DSLThread>();

	private IProcess process;

	private List<DSLLineBreakpoint> breakpoints = new ArrayList<DSLLineBreakpoint>();

	private IDebugTarget gplDebugTarget;

	private List<IDebugEventHandler> debugEventHandlers = new ArrayList<IDebugEventHandler>();

	public DSLDebugTarget(ILaunch launch, IMappingManager mappingManager,
			ITargetPlatformFactory targetPlatformFactory) {
		super(null);
		this.launch = launch;
		this.targetPlatformFactory = targetPlatformFactory;
		this.steppingStrategy = new DefaultSteppingStrategy();

		initialize();
	}

	public void initialize() {
		getLaunch().addDebugTarget(this);
		DebugPlugin.getDefault().addDebugEventListener(this);
		initializeBreakpoints();
	}

	protected void cleanup() {
		removeAllThreads();
		DebugPlugin plugin = DebugPlugin.getDefault();
		plugin.getBreakpointManager().removeBreakpointListener(this);
		plugin.removeDebugEventListener(this);
	}

	/**
	 * Removes all threads from this target's collection of threads, firing a
	 * terminate event for each.
	 */
	protected void removeAllThreads() {
		Iterator<DSLThread> itr = getThreadIterator();
		while (itr.hasNext()) {
			DSLThread child = itr.next();
			child.terminated();
		}
		synchronized (dslThreads) {
			dslThreads.clear();
		}
	}

	/**
	 * Returns an iterator over the collection of threads. The returned iterator
	 * is made on a copy of the thread list so that it is thread safe. This
	 * method should always be used instead of getThreadList().iterator()
	 * 
	 * @return an iterator over the collection of threads
	 */
	private Iterator<DSLThread> getThreadIterator() {
		List<DSLThread> threadList;
		synchronized (dslThreads) {
			threadList = new ArrayList<DSLThread>(dslThreads);
		}
		return threadList.iterator();
	}

	private void initializeBreakpoints() {
		IBreakpointManager manager = DebugPlugin.getDefault().getBreakpointManager();
		manager.addBreakpointListener(this);

		IBreakpoint[] breakpoints = manager.getBreakpoints(DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID);
		for (IBreakpoint breakpoint : breakpoints) {
			if (breakpoint instanceof DSLLineBreakpoint) {
				breakpointAdded(breakpoint);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.IDebugElement#getDebugTarget()
	 */
	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.IDebugElement#getLaunch()
	 */
	@Override
	public ILaunch getLaunch() {
		return launch;
	}

	@Override
	public boolean canTerminate() {
		return gplDebugTarget != null ? gplDebugTarget.canTerminate() : false;
	}

	@Override
	public boolean isTerminated() {
		return true;
		// return javaDebugTarget != null ? javaDebugTarget.isTerminated() :
		// false;
	}

	@Override
	public void terminate() throws DebugException {
		if (gplDebugTarget != null)
			gplDebugTarget.terminate();

	}

	@Override
	public boolean canResume() {
		return gplDebugTarget != null ? gplDebugTarget.canResume() : false;
	}

	@Override
	public boolean canSuspend() {
		return gplDebugTarget != null ? gplDebugTarget.canSuspend() : false;
	}

	@Override
	public boolean isSuspended() {
		return gplDebugTarget != null ? gplDebugTarget.isSuspended() : false;
	}

	@Override
	public void resume() throws DebugException {
		if (gplDebugTarget != null)
			gplDebugTarget.resume();
	}

	@Override
	public void suspend() throws DebugException {
		if (gplDebugTarget != null)
			gplDebugTarget.suspend();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.core.IBreakpointListener#breakpointAdded(org.eclipse
	 * .debug.core.model.IBreakpoint)
	 */
	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
				if (!breakpoints.contains(dslLineBreakpoint)) {
					dslLineBreakpoint.installGplBreakpoint(getDSLDebugTarget());
					breakpoints.add(dslLineBreakpoint);
				}
			} catch (CoreException e) {
				logError(e);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.core.IBreakpointListener#breakpointRemoved(org.eclipse
	 * .debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
				dslLineBreakpoint.uninstallGplBreakpoint(getDSLDebugTarget());
				this.breakpoints.remove(breakpoint);
			} catch (CoreException e) {
				logError(e);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.core.IBreakpointListener#breakpointChanged(org.eclipse
	 * .debug.core.model.IBreakpoint, org.eclipse.core.resources.IMarkerDelta)
	 */
	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
			try {
				dslLineBreakpoint.updateGplBreakpoint(gplDebugTarget);
			} catch (CoreException e) {
				logError(e);
			}
		}
	}

	@Override
	public boolean canDisconnect() {
		return gplDebugTarget != null ? gplDebugTarget.canDisconnect() : false;
	}

	@Override
	public void disconnect() throws DebugException {
		if (gplDebugTarget != null)
			gplDebugTarget.disconnect();

	}

	@Override
	public boolean isDisconnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supportsStorageRetrieval() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleDebugEvents(DebugEvent[] events) {
		for (DebugEvent event : events) {
			// We make a copy of the debugEventHandlers list, because some
			// handlers might remove
			// themselves from the list during their handling
			Iterator<IDebugEventHandler> handlerIter =
					new ArrayList<IDebugEventHandler>(debugEventHandlers).iterator();
			boolean handled = false;
			while (handlerIter.hasNext() && !handled) {
				IDebugEventHandler handler = handlerIter.next();
				handled = handler.handleDebugEvent(event);
			}

			if (!handled) {
				// TODO: I should remove the ugly handleDebugEvent method into
				// DebugEventHanadlers
				handleDebugEvent(event);
			}
		}

	}

	/**
	 * Creates, adds and returns a thread for the given GPL thread. A creation
	 * event is fired for the thread. Returns <code>null</code> if during the
	 * creation of the thread this target is set to the disconnected state.
	 * 
	 * @param gplThread
	 *            corresponding GPL thread
	 * @return model thread
	 */
	protected DSLThread createThread(IThread gplThread) {
		DSLThread thread = new DSLThread(this, gplThread);
		thread.setSteppingStrategy(steppingStrategy);
		if (isDisconnected()) {
			return null;
		}
		synchronized (dslThreads) {
			dslThreads.add(thread);
		}
		thread.fireCreationEvent();
		return thread;
	}

	/**
	 * Notified when another debug target is created.
	 * 
	 * @param gplDebugTarget
	 */
	protected void created(IDebugTarget gplDebugTarget) {
		if (gplDebugTarget == this)
			return;

		Assert.isTrue(this.gplDebugTarget == null, "There are more than one other DebugTarget.");
		this.gplDebugTarget = gplDebugTarget;

		// Now we can finally initialize breakpoints
		initializeBreakpoints();

		fireCreationEvent();
	}

	protected void terminated() {
		cleanup();
	}

	protected void handleDebugEvent(DebugEvent event) {
		Date date = new Date();
		System.err.print("[" + date.toString() + "] Debug event: ");
		System.err.println(event);

		// We don't care about DebugEvents emitted by this debug model
		if (event.getSource() instanceof IDSLDebugElement) {
			return;
		}

		boolean handled = false;
		Object eventSource = event.getSource();
		if (eventSource instanceof IDebugTarget) {
			assert (eventSource != this);
			switch (event.getKind()) {
			case DebugEvent.CREATE: // Register GPL DebugTarget
				created((IDebugTarget) eventSource);
				handled = true;
				break;
			case DebugEvent.TERMINATE:
				terminated();
				handled = true;
				break;
			}
		} else if (eventSource instanceof IProcess) {
			switch (event.getKind()) {
			case DebugEvent.CREATE:
				assert this.process == null;
				this.process = (IProcess) eventSource;
				handled = true;
				break;
			}
		} else if (eventSource instanceof IThread) {
			Assert.isTrue(!(eventSource instanceof DSLThread));
			switch (event.getKind()) {
			case DebugEvent.CREATE:
				handled = true;
				try {
					if (targetPlatformFactory.getDebugModel().isUserThread((IThread) eventSource)) {
						createThread((IThread) eventSource);
					}
				} catch (DebugException e) {
					DSLDebuggerLog.logError(e);
				}
				break;
			case DebugEvent.SUSPEND:
				handled = true;
				for (DSLThread thread : dslThreads) {
					if (thread.getGplThread() == eventSource) {
						thread.suspended(event.getDetail());
					}
				}
				break;

			case DebugEvent.RESUME:
				handled = true;
				for (DSLThread thread : dslThreads) {
					if (thread.getGplThread() == eventSource) {
						thread.resumed(event.getDetail());
					}
				}
			}
		}
		if (handled == false) {
			DSLDebuggerLog.logWarning("Unhandled debug event: " + event);
		}
	}

	@Override
	public IProcess getProcess() {
		return this.process;
	}

	@Override
	public IThread[] getThreads() throws DebugException {
		return dslThreads.toArray(new IThread[dslThreads.size()]);
	}

	@Override
	public boolean hasThreads() throws DebugException {
		return dslThreads.size() != 0;
	}

	@Override
	public String getName() throws DebugException {
		return "DSL Debug Target";
	}

	@Override
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		return breakpoint instanceof DSLLineBreakpoint;
	}

	@Override
	public IDebugTarget getGplDebugTarget() {
		return gplDebugTarget;
	}

	@Override
	public List<IDebugEventHandler> debugEventHandlers() {
		return debugEventHandlers;
	}
}
