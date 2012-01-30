package org.macjariel.dsl.debug.core;

import java.util.List;

import org.eclipse.debug.core.model.IDebugTarget;

/**
 * A running DSL instance. 
 * @author MacJariel
 *
 */
public interface IDSLDebugTarget extends IDebugTarget, IDSLDebugElement {

	/**
	 * Returns the list of DebugEvent handlers registered to this DSLDebugTarget.
	 * @return
	 */
	List<IDebugEventHandler> debugEventHandlers();
	
	/**
	 * Returns the DebugTarget for the GPL language.
	 * @return the DebugTarget for the GPL language
	 */
	IDebugTarget getGplDebugTarget();
	
}
