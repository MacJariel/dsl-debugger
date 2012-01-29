package org.macjariel.dsl.internal.debug.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.PlatformObject;
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
import org.macjariel.dsl.internal.debug.core.breakpoints.DSLLineBreakpoint;
import org.macjariel.dsl.mapping.IMappingManager;
import org.macjariel.dsl.platform.ITargetPlatformFactory;

public class DSLDebugTarget extends PlatformObject implements IDebugTarget, IDebugEventSetListener {

	private final ILaunch launch;

	private final ITargetPlatformFactory targetPlatformFactory;

	private final IMappingManager mappingManager;

	private List<DSLThread> dslThreads = new ArrayList<DSLThread>();

	private IProcess process;

	private List<DSLLineBreakpoint> dslLineBreakpoints = new ArrayList<DSLLineBreakpoint>();

	private IDebugTarget gplDebugTarget;

	public DSLDebugTarget(ILaunch launch, IMappingManager mappingManager,
			ITargetPlatformFactory targetPlatformFactory) {
		this.launch = launch;
		this.targetPlatformFactory = targetPlatformFactory;
		this.mappingManager = mappingManager;

		init();
		
		DebugPlugin.getDefault().addDebugEventListener(this);
		launch.addDebugTarget(this);
	}

	public void init() {
		initThreads();
	}

	private void deinitialize() {
		deinitBreakpoints();
		deinitThreads();
	}

	private IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}

	private void initBreakpoints() {
		IBreakpointManager manager = getBreakpointManager();
		manager.addBreakpointListener(this);

		IBreakpoint[] breakpoints = manager.getBreakpoints(DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID);
		for (IBreakpoint breakpoint : breakpoints) {
			if (breakpoint instanceof DSLLineBreakpoint) {
				breakpointAdded(breakpoint);
			}
		}
	}

	private void deinitBreakpoints() {
		getBreakpointManager().removeBreakpointListener(this);
	}

	private void initThreads() {
		dslThreads = new ArrayList<DSLThread>();
	}

	private void deinitThreads() {

	}

	@Override
	public String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}

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

	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
		if (supportsBreakpoint(breakpoint)) {
			if (getBreakpointManager().isEnabled()) {
				DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
				dslLineBreakpoint.installGplBreakpoint(gplDebugTarget);

				this.dslLineBreakpoints.add(dslLineBreakpoint);
			}
		}

	}

	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
			dslLineBreakpoint.uninstallGplBreakpoint(gplDebugTarget);
			this.dslLineBreakpoints.remove(breakpoint);
		}
	}

	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
			dslLineBreakpoint.updateGplBreakpoint(gplDebugTarget);
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
		for (DebugEvent e : events) {
			handleDebugEvent(e);
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
		if (isDisconnected()) {
			return null;
		}
		synchronized (dslThreads) {
			dslThreads.add(thread);
		}
		thread.fireCreationEvent();
		return thread;
	}

	protected void onGplDebugTargetCreated(IDebugTarget gplDebugTarget) {
		Assert.isTrue(this.gplDebugTarget == null);
		this.gplDebugTarget = gplDebugTarget;
		
		// Now we can finally initialize breakpoints
		initBreakpoints();
		
	}
	
	protected void handleDebugEvent(DebugEvent event) {
		Date date = new Date();
		System.err.print("[" + date.toString() + "] Debug event: ");
		System.err.println(event);

		Object eventSource = event.getSource();
		if (eventSource instanceof IDebugTarget) {
			switch (event.getKind()) {
			case DebugEvent.CREATE: // Register GPL DebugTarget
				onGplDebugTargetCreated((IDebugTarget) eventSource);
				break;
			case DebugEvent.TERMINATE:
				deinitialize();
				break;
			}
		} else if (eventSource instanceof IProcess) {
			switch (event.getKind()) {
			case DebugEvent.CREATE:
				assert this.process == null;
				this.process = (IProcess) eventSource;
				break;
			}
		} else if (eventSource instanceof IThread) {
			switch (event.getKind()) {
			case DebugEvent.CREATE:
				try {
					if (targetPlatformFactory.getDebugModel().isUserThread((IThread) eventSource)) {
						createThread((IThread) eventSource);
					}
				} catch (DebugException e) {
					DSLDebuggerLog.logError(e);
				}
				break;
			case DebugEvent.SUSPEND:
				if (eventSource instanceof DSLThread) {
					((DSLThread) eventSource).eventSuspended();
				} else {

					for (DSLThread thread : dslThreads) {
						if (thread.getGplThread() == eventSource) {
							thread.fireSuspendEvent(event.getDetail());
						}
					}
				}
				break;

			case DebugEvent.RESUME:
				if (eventSource instanceof DSLThread) {
					((DSLThread) eventSource).eventResumed();
				} else {
					for (DSLThread thread : dslThreads) {
						if (thread.getGplThread() == eventSource) {
							thread.fireSuspendEvent(event.getDetail());
						}
					}
				}
			}
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
		if (breakpoint instanceof DSLLineBreakpoint) {
			return true;
		} else {
			return false;
		}
	}

	public IDebugTarget getGplDebugTarget() {
		return gplDebugTarget;
	}

	public final IMappingManager getMappingManager() {
		return this.mappingManager;
	}
}
