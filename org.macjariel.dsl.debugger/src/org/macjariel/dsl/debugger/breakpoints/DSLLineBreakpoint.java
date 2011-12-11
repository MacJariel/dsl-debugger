package org.macjariel.dsl.debugger.breakpoints;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;
import org.macjariel.dsl.debugger.mapping.ISourceTargetMapping;
import org.macjariel.dsl.debugger.model.DSLDebugTarget;

public class DSLLineBreakpoint extends LineBreakpoint {

	private DSLDebugTarget debugTarget;

	private ILineBreakpoint gplBreakpoint = null;

	/**
	 * Constructs an empty DSLLineBreakpoint. This constructor is used by the
	 * BreakpointManager to recreate breakpoints from persistent markers.
	 */
	public DSLLineBreakpoint() {
	}

	public DSLLineBreakpoint(final IResource file, final int lineNumber) throws CoreException {
		IWorkspaceRunnable job = new IWorkspaceRunnable() {

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = file.createMarker(DSLDebuggerPlugin.DSL_LINE_BREAKPOINT_MARKER_ID);
				setMarker(marker);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber + 1);
				marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
				marker.setAttribute(IMarker.MESSAGE, "DSL Line breakpoint: " + file.getName()
						+ " [line: " + (lineNumber + 1) + "]");
			}
		};

		/*
		 * { // DEBUG: lists all markers on the resource IMarker[] markers =
		 * file.findMarkers(DSLDebuggerPlugin.DSL_LINE_BREAKPOINT_MARKER_ID,
		 * true, IResource.DEPTH_INFINITE); for (IMarker marker : markers) {
		 * System.out.println("Marker " + marker.getId() + ": " +
		 * marker.getAttribute(IMarker.MESSAGE, "[no message]")); } }
		 */

		run(getMarkerRule(file), job);
	}

	@Override
	public String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	public void install(DSLDebugTarget debugTarget) {
		this.debugTarget = debugTarget;

		// TODO: this old code was responsible for creating a GPL breakpoint
		// according to the resource file and line number. This approach was
		// abandoned, because we want the breakpoints to be smarter than that.
		// First, every breakpoint needs to have an element in DSL model
		// associated just during its creation. This is currently imposible,
		// because the DSL Model is not known before the launch of the debug
		// session, but as soon as traceability information's lifespan will
		// change, this should be implemented.
		//
		// Reminder for the implementor:
		// @see DSLDebuggerPlugin - this should contain a IMappingManager object
		// @see IMappingManager - this hold all traceability information, it can
		// give us IMappingAlgorithms
		// @see IMappingAlgorithms - this has method
		// lookupMappingItemForLineBreakpoint

		
		/*
		mapping = this.debugTarget.getMapping(this);
		if (mapping != null) {
			try {
				// FIXME this is nasty and does not follow concept of Java types
				// typeName should be the full class name in the target file
				String typeName = mapping.getTarget().getFullPath().removeFileExtension()
						.removeFirstSegments(2).toOSString().replace('/', '.');
				int lineNumber = mapping.getTargetStartLineNumber();

				createGplBreakpoint(mapping.getTarget(), typeName, lineNumber,
						mapping.getTargetStartChar(), mapping.getTargetEndChar());

				IDebugTarget jDebugTarget = debugTarget.getGplDebugTarget();
				if (jDebugTarget != null)
					jDebugTarget.breakpointAdded(this.gplBreakpoint);

			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		*/
	}

	@Override
	public void delete() throws CoreException {

		if (this.gplBreakpoint != null) {
			this.gplBreakpoint.delete();
		}
		super.delete();
	}

	private void createGplBreakpoint(IResource resource, String typeName, int lineNumber,
			int charStart, int charEnd) throws CoreException {
		if (this.gplBreakpoint == null || !this.gplBreakpoint.isRegistered()) {
			// TODO: create it using a method in org.macjariel.dsl.debugger.java
			// project
			this.gplBreakpoint = JDIDebugModel.createLineBreakpoint(resource, typeName, lineNumber,
					charStart, charEnd, 0, true, null);
		}
	}
}
