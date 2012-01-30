package org.macjariel.dsl.debug.core;

import org.eclipse.debug.core.DebugEvent;

public interface IDebugEventHandler {

	boolean handleDebugEvent(DebugEvent event);
}
