package org.macjariel.dsl.debugger.ui.adapters;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.texteditor.ITextEditor;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;
import org.macjariel.dsl.debugger.breakpoints.DSLLineBreakpoint;

/**
 * This class can adapt ITextEditor to IToggleBreakpointsTarget interface. This
 * is necessary to allow adding breakpoints to ITextEditor.
 * 
 * @author MacJariel
 * 
 */
public class DSLBreakpointAdapter implements IToggleBreakpointsTarget {

	@Override
	public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
		ITextEditor textEditor = (ITextEditor) part;
		if (textEditor != null) {
			IResource resource = (IResource) textEditor.getEditorInput()
					.getAdapter(IResource.class);
			ITextSelection textSelection = (ITextSelection) selection;
			int lineNumber = textSelection.getStartLine();

			// delete existing breakpoint
			IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager()
					.getBreakpoints(DSLDebuggerPlugin.DSL_DEBUG_MODEL_ID);
			for (IBreakpoint bp : breakpoints) {
				if (resource.equals(bp.getMarker().getResource()) && bp instanceof ILineBreakpoint
						&& ((ILineBreakpoint) bp).getLineNumber() == lineNumber + 1) {
					bp.delete();
					return;
				}
			}

			// add new breakpoint
			// TODO
			DSLLineBreakpoint dslBreakpoint = new DSLLineBreakpoint(resource, lineNumber);
			DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(dslBreakpoint);
		}

	}

	@Override
	public boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		return false;
	}

}
