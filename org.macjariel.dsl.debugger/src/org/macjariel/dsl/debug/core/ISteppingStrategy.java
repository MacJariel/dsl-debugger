package org.macjariel.dsl.debug.core;

import org.eclipse.debug.core.DebugException;

public interface ISteppingStrategy {

	/**
	 * Returns whether this strategy can perform a step into.
	 * @return whether this strategy can perform a step into
	 */
	boolean canStepInto();

	/**
	 * Returns whether this strategy can perform a step over.
	 * @return whether this strategy can perform a step over
	 */
	boolean canStepOver();

	/**
	 * Returns whether this strategy can perform a step return.
	 * @return whether this strategy can perform a step return
	 */
	boolean canStepReturn();
	
	/**
	 * Performs a step into on given DSLThread.
	 * @param thread a suspended DSLThread to perform the step on
	 * @throws DebugException
	 */
	void stepInto(IDSLThread thread) throws DebugException;

	/**
	 * Performs a step over on given DSLThread.
	 * @param thread a suspended DSLThread to perform the step on
	 * @throws DebugException
	 */
	void stepOver(IDSLThread thread) throws DebugException;

	/**
	 * Performs a step return on given DSLThread.
	 * @param thread a suspended DSLThread to perform the step on
	 * @throws DebugException
	 */
	void stepReturn(IDSLThread thread) throws DebugException;
}
