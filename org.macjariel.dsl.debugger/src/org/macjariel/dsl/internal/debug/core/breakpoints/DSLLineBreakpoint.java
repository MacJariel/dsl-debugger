package org.macjariel.dsl.internal.debug.core.breakpoints;

import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.macjariel.dsl.DSLDebuggerLog;
import org.macjariel.dsl.DSLDebuggerPlugin;
import org.macjariel.dsl.debug.core.IDSLLineBreakpoint;
import org.macjariel.dsl.mapping.ISourceTargetMapping;

/**
 * A line breakpoint specific for the DSL Debugger.
 * 
 * @author MacJariel
 * 
 */
/**
 * @author MacJariel
 * 
 */
public class DSLLineBreakpoint extends AbstractDSLLineBreakpoint implements IDSLLineBreakpoint {

	protected static final String DSL_LINE_BREAKPOINT =
			"org.macjariel.dsl.debug.core.dslLineBreakpointMarker"; //$NON-NLS-1$

	/**
	 * Target language (GPL) breakpoint that corresponds to this DSL breakpoint.
	 */
	protected ILineBreakpoint gplBreakpoint;

	public DSLLineBreakpoint() {
	}

	public DSLLineBreakpoint(final IResource resource, final EObject semanticElement,
			final boolean register, final boolean registerGplBreakpoint, final Map<String, Object> attributes) throws CoreException {
		super(resource, semanticElement, register, registerGplBreakpoint, attributes, DSL_LINE_BREAKPOINT);
	}

	/**
	 * Updates associated GPL breakpoint.
	 * 
	 * @param gplDebugTarget
	 */
	public void updateGplBreakpoint(IDebugTarget gplDebugTarget) throws CoreException {
		// TODO: Fix enabling/disabling of breakpoints
		// This method basically tries to implement the enabling/disabling of
		// breakpoints in the "breakpoint manager view". Currently it is not
		// really working, so maybe the best solution is to just add/remove GPL
		// breakpoints to GPL targets (and bypass the breakpoint manager).

		// boolean wasChanged = false;
		// try {
		// Boolean isEnabledOld =
		// (Boolean) gplBreakpoint.getMarker().getAttribute(
		// IBreakpoint.ENABLED);
		// Boolean isEnabledNew =
		// (Boolean) getMarker().getAttribute(IBreakpoint.ENABLED);
		// if (!isEnabledOld.equals(isEnabledNew)) {
		// gplBreakpoint.getMarker().setAttribute(IBreakpoint.ENABLED,
		// isEnabledNew);
		// wasChanged = true;
		// }
		// } catch (CoreException e) {
		// DSLDebuggerLog.logError(e);
		// }
		//
		// if (REGISTER_GPL_BREAKPOINTS == false && wasChanged) {
		// gplDebugTarget.breakpointChanged(gplBreakpoint, null);
		// } else {
		// DebugPlugin.getDefault().getBreakpointManager()
		// .fireBreakpointChanged(gplBreakpoint);
		// }

	}

	/**
	 * Creates a GPL breakpoint that will correspond with this DSL breakpoint.
	 */
	protected void createGplBreakpoint() throws CoreException {
		if (gplBreakpoint != null)
			return;

		if (LOGGING)
			DSLDebuggerLog.logInfo("Creating GPL breakpoint for DSL breakpoint [" + toString()
					+ "].");

		ISourceTargetMapping mapping =
				DSLDebuggerPlugin.getInstance().getMappingManager().getSourceTargetMapping();
		ISourceTargetMapping.IItem mappingItem =
				(mapping == null) ? null : mapping
						.findMappingForSourceElement(getSemanticElement());

		if (mappingItem == null) {
			DSLDebuggerLog.logError("Cannot create GPL breakpoint for DSL breakpoint ["
					+ toString() + "] because the lookup in mapping was unsuccessful.");
			return;

		}

		final IResource resource = mappingItem.getTargetFile();

		final int lineNumber = mappingItem.getTargetStartLine();
		final int startChar = mappingItem.getTargetCharStart();
		final int endChar = mappingItem.getTargetCharEnd();
		final boolean register = getRegisterGplBreakpointFlag();

		try {
			gplBreakpoint =
					createGplBreakpointImpl(resource, lineNumber, startChar, endChar, register);
		} catch (CoreException e) {
			throw DSLDebuggerLog.rethrowCoreException(e);
		}

		if (LOGGING)
			DSLDebuggerLog.logInfo("GPL line breakpoint [" + gplBreakpoint + "] created.");

	}

	protected void deleteGplBreakpoint() throws CoreException {
		if (gplBreakpoint == null)
			return;

		if (LOGGING)
			DSLDebuggerLog.logInfo("Deleting GPL breakpoint [" + gplBreakpoint + "].");

		if (getRegisterGplBreakpointFlag()) {
			gplBreakpoint.delete();
		} else {
			gplBreakpoint.getMarker().delete();
		}
		gplBreakpoint = null;
	}

	protected ILineBreakpoint createGplBreakpointImpl(final IResource resource,
			final int lineNumber, final int startChar, final int endChar, boolean register)
			throws CoreException {

		final String typeName =
				resource.getFullPath().removeFileExtension().removeFirstSegments(2).toOSString()
						.replace('/', '.');

		return JDIDebugModel.createLineBreakpoint(resource, typeName, lineNumber, startChar,
				endChar, 0, register, null);
	}

	@Override
	protected IBreakpoint getGplBreakpoint() {
		return gplBreakpoint;
	}

}
