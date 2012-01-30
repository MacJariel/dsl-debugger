package org.macjariel.dsl.debug.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.emf.ecore.EObject;

public interface IDSLLineBreakpoint extends ILineBreakpoint {

	/**
	 * Returns whether GPL breakpoint is to be registered with the
	 * BreakpointManager.
	 * 
	 * @throws CoreException
	 */
	boolean getRegisterGplBreakpointFlag() throws CoreException;

	void setRegisterGplBreakpointFlag(boolean flag) throws CoreException;

	/**
	 * Installs associated GPL breakpoint to GPL debug target.
	 * 
	 * @param gplDebugTarget
	 * @throws CoreException
	 */
	void installGplBreakpoint(IDSLDebugTarget gplDebugTarget) throws CoreException;

	/**
	 * Uninstalls associated GPL breakpoint from GPL debug target.
	 * 
	 * @param gplDebugTarget
	 * @throws CoreException
	 */
	void uninstallGplBreakpoint(IDSLDebugTarget gplDebugTarget) throws CoreException;

	/**
	 * Returns the semantic element of the breakpoint.
	 * 
	 * @throws CoreException
	 */
	EObject getSemanticElement() throws CoreException;
}
