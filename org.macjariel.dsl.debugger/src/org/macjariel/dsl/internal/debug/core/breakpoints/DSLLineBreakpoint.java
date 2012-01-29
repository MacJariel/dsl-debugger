package org.macjariel.dsl.internal.debug.core.breakpoints;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.IDSLLineBreakpoint;
import org.macjariel.dsl.mapping.ISourceTargetMapping;
import org.macjariel.dsl.xtext.XtextDslModelHelper;

/**
 * A line breakpoint specific for the DSL Debugger.
 * 
 * @author MacJariel
 * 
 */
public class DSLLineBreakpoint extends LineBreakpoint implements IDSLLineBreakpoint {

	private static final boolean LOGGING = true;

	/**
	 * Semantic element in the DSL semantic model that this line breakpoint is
	 * attached to.
	 */
	private EObject semanticElement;

	/**
	 * Target language (GPL) breakpoint that corresponds to this DSL breakpoint.
	 */
	private ILineBreakpoint gplBreakpoint = null;

	/**
	 * Name of the <i>semantic element</i> attribute for Markers.
	 * 
	 * @see {@link IMarker}
	 */
	public static final String SEMANTIC_ELEMENT = "org.macjariel.dsl.debugger.semanticElement";

	/**
	 * Whether register GPL breakpoints to the breakpoint manager. Registered
	 * breakpoints are shown in UI and user is aware of them, while unregistered
	 * breakpoints are invisible to user. It is preferred not to register GPL
	 * breakpoints, however, it can be convenient to register GPL breakpoints
	 * for debugging purposes.
	 */
	public static final Boolean REGISTER_GPL_BREAKPOINTS = true;

	/**
	 * Constructs a DSL Line Breakpoint for given resource and semantic element.
	 * 
	 * @param resource
	 *            Resource where the breakpoint will be put
	 * @param semanticElement
	 *            Semantic element to put the breakpoint on
	 */
	public static DSLLineBreakpoint create(final IResource resource, final EObject semanticElement) {
		final DSLLineBreakpoint instance = new DSLLineBreakpoint();
		final int lineNumber = NodeModelUtils.getNode(semanticElement).getStartLine();

		IWorkspaceRunnable job = new IWorkspaceRunnable() {

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = resource
						.createMarker(DSLDebuggerPlugin.DSL_LINE_BREAKPOINT_MARKER_ID);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(IBreakpoint.ID, instance.getModelIdentifier());
				marker.setAttribute(IMarker.MESSAGE, "DSL Line breakpoint: " + resource.getName()
						+ " [line: " + (lineNumber) + "]");

				URI semanticElementURI = semanticElement
						.eResource()
						.getURI()
						.appendFragment(semanticElement.eResource().getURIFragment(semanticElement));

				marker.setAttribute(SEMANTIC_ELEMENT, semanticElementURI.toString());
				instance.setMarker(marker);
			}
		};
		try {
			instance.run(instance.getMarkerRule(), job);
		} catch (DebugException e) {
			e.printStackTrace();
		}
		return instance;
	}

	/**
	 * Constructs a DSLLineBreakpoint.
	 */
	public DSLLineBreakpoint() {
		if (LOGGING)
			DSLDebuggerLog.logInfo("Creating a DSL breakpoint [" + toString() + "].");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.core.model.Breakpoint#setMarker(org.eclipse.core.resources
	 * .IMarker)
	 */
	@Override
	public void setMarker(IMarker marker) throws CoreException {
		URI semanticElementURI = URI.createURI(marker.getAttribute(SEMANTIC_ELEMENT, ""));

		ResourceSet rs = XtextDslModelHelper.XTEXT_RESOURCE_SET;
		semanticElement = rs.getEObject(semanticElementURI, true);

		super.setMarker(marker);

		if (LOGGING)
			DSLDebuggerLog.logInfo("Marker for the DSL breakpoint [" + toString() + "] set.");

		// TODO: temporary
		createGplBreakpoint();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (getMarker() == null)
			return "DSLLineBreakpoint w/o marker";

		int lineNumber = 0;
		try {
			lineNumber = getLineNumber();
		} catch (CoreException e) {
			DSLDebuggerLog.log(e);
		}
		return getMarker().getResource().getName() + ": " + String.valueOf(lineNumber);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.IBreakpoint#getModelIdentifier()
	 */
	@Override
	public String getModelIdentifier() {
		return DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID;
	}

	/**
	 * Installs associated GPL breakpoint to GPL debug target.
	 * 
	 * @param gplDebugTarget
	 */
	public void installGplBreakpoint(IDebugTarget gplDebugTarget) {

		if (gplBreakpoint == null) {
			createGplBreakpoint();
		}

		updateGplBreakpoint(gplDebugTarget);

		// Unregistered breakpoints need to be manually added to debug target.
		if (REGISTER_GPL_BREAKPOINTS == false) {
			gplDebugTarget.breakpointAdded(gplBreakpoint);
		}
	}

	/**
	 * Updates associated GPL breakpoint.
	 * 
	 * @param gplDebugTarget
	 */
	public void updateGplBreakpoint(IDebugTarget gplDebugTarget) {
		// TODO: Fix enabling/disabling of breakpoints
		// This method basically tries to implement the enabling/disabling of
		// breakpoints in the "breakpoint manager view". Currently it is not
		// really working, so maybe the best solution is to just add/remove GPL
		// breakpoints to GPL targets (and bypass the breakpoint manager).

		boolean wasChanged = false;
		try {
			Boolean isEnabledOld = (Boolean) gplBreakpoint.getMarker().getAttribute(
					IBreakpoint.ENABLED);
			Boolean isEnabledNew = (Boolean) getMarker().getAttribute(IBreakpoint.ENABLED);
			if (!isEnabledOld.equals(isEnabledNew)) {
				gplBreakpoint.getMarker().setAttribute(IBreakpoint.ENABLED, isEnabledNew);
				wasChanged = true;
			}
		} catch (CoreException e) {
			DSLDebuggerLog.logError(e);
		}

		if (REGISTER_GPL_BREAKPOINTS == false && wasChanged) {
			gplDebugTarget.breakpointChanged(gplBreakpoint, null);
		} else {
			DebugPlugin.getDefault().getBreakpointManager().fireBreakpointChanged(gplBreakpoint);
		}

	}

	/**
	 * Uninstalls associated GPL breakpoint from GPL debug target.
	 * 
	 * @param gplDebugTarget
	 */
	public void uninstallGplBreakpoint(IDebugTarget gplDebugTarget) {
		if (gplBreakpoint == null) {
			return;
		}

		if (REGISTER_GPL_BREAKPOINTS == false) {
			gplDebugTarget.breakpointRemoved(gplBreakpoint, null);
		}
	}

	/**
	 * Creates a GPL breakpoint that will correspond with this DSL breakpoint.
	 */
	private void createGplBreakpoint() {
		Assert.isTrue(gplBreakpoint == null, "One GPL breakpoint already exists.");

		if (LOGGING)
			DSLDebuggerLog.logInfo("Creating GPL breakpoint for DSL breakpoint [" + toString()
					+ "].");

		ISourceTargetMapping mapping = DSLDebuggerPlugin.getInstance().getMappingManager()
				.getSourceTargetMapping();
		ISourceTargetMapping.IItem mappingItem = (mapping == null) ? null : mapping
				.findMappingForSourceElement(semanticElement);

		if (mappingItem == null) {
			DSLDebuggerLog.logError("Cannot create GPL breakpoint for DSL breakpoint ["
					+ toString() + "] because the lookup in mapping was unsuccessful.");
			return;

		}

		final IResource resource = mappingItem.getTargetFile();

		final int lineNumber = mappingItem.getTargetStartLine();
		final int startChar = mappingItem.getTargetCharStart();
		final int endChar = mappingItem.getTargetCharEnd();
		final boolean register = REGISTER_GPL_BREAKPOINTS;

		// TODO: extract following block of code to an interface
		{
			// TODO: this should be generalized for other GPLs than JAVA
			final String typeName = resource.getFullPath().removeFileExtension()
					.removeFirstSegments(2).toOSString().replace('/', '.');
			try {
				gplBreakpoint = JDIDebugModel.createLineBreakpoint(resource, typeName, lineNumber,
						startChar, endChar, 0, register, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (LOGGING)
			DSLDebuggerLog.logInfo("GPL breakpoint [" + gplBreakpoint + "] created.");

	}

	/**
	 * Deletes the GPL breakpoint.
	 */
	private void deleteGplBreakpoint() {
		if (gplBreakpoint == null)
			return;

		if (LOGGING)
			DSLDebuggerLog.logInfo("Deleting GPL breakpoint [" + gplBreakpoint + "].");

		try {
			if (REGISTER_GPL_BREAKPOINTS) {
				gplBreakpoint.delete();
			} else {
				gplBreakpoint.getMarker().delete();
			}
		} catch (CoreException e) {
			DSLDebuggerLog.log(e);
		}
		gplBreakpoint = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.core.model.Breakpoint#delete()
	 */
	@Override
	public void delete() throws CoreException {
		deleteGplBreakpoint();
		super.delete();
	}

}
