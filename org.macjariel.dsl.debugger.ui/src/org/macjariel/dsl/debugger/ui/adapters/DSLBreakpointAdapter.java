package org.macjariel.dsl.debugger.ui.adapters;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.DSLDebugModel;
import org.macjariel.dsl.debug.core.IDSLLineBreakpoint;
import org.macjariel.dsl.xtext.XtextDslModelHelper;


/**
 * Allows ITextEditor act as IToogleBreakpointsTarget and thus allows adding
 * breakpoints.
 * 
 * @author MacJariel
 * 
 */
public class DSLBreakpointAdapter implements IToggleBreakpointsTarget {

	private final static boolean LOGGING = true;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#toggleLineBreakpoints
	 * (org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void toggleLineBreakpoints(final IWorkbenchPart part, final ISelection selection)
			throws CoreException {
		final IBreakpointManager breakpointManager = DebugPlugin.getDefault()
				.getBreakpointManager();
		final XtextEditor xtextEditor = (XtextEditor) part;
		final int lineNumber = ((ITextSelection) selection).getStartLine() + 1;
		final IResource resource = (IResource) xtextEditor.getEditorInput().getAdapter(
				IResource.class);

		for (IBreakpoint breakpoint : breakpointManager
				.getBreakpoints(DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID)) {
			if (resource.equals(breakpoint.getMarker().getResource())
					&& breakpoint instanceof ILineBreakpoint
					&& ((ILineBreakpoint) breakpoint).getLineNumber() == lineNumber) {
				breakpoint.delete();
				return;
			}
		}

		final EObject semanticElement = xtextEditor.getDocument().readOnly(
				new IUnitOfWork<EObject, XtextResource>() {

					@Override
					public EObject exec(XtextResource semanticModel) throws Exception {
						return XtextDslModelHelper.findBreakableSemanticElement(semanticModel,
								lineNumber);
					}

				});

		final int startLine = (semanticElement == null) ? 0 : NodeModelUtils.getNode(
				semanticElement).getStartLine();
		if (LOGGING)
			DSLDebuggerLog.logInfo("Trying to add a breakpoint on line: " + lineNumber
					+ ", semantic element: " + semanticElement + ", startLine: " + startLine);

		if (semanticElement != null) {
			final IDSLLineBreakpoint lineBreakpoint = DSLDebugModel.createLineBreakpoint(resource, semanticElement, true, true, null);
			DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(lineBreakpoint);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#
	 * canToggleLineBreakpoints(org.eclipse.ui.IWorkbenchPart,
	 * org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#toggleMethodBreakpoints
	 * (org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#canToggleMethodBreakpoints(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#toggleWatchpoints(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#canToggleWatchpoints(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
		return false;
	}
}
