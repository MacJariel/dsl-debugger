package org.macjariel.dsl.debugger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * This helper class provides static convenient methods for logging.
 * 
 * The code is based on FavoritesLog class from book Eclipse Plug-ins, Third
 * Edition (page 129).
 * 
 * @author MacJariel
 */
public class DSLDebuggerLog {

	public static void log(CoreException exception) {
		log(createStatus(exception.getStatus().getSeverity(), Status.OK, exception.getMessage(),
				exception));
	}

	public static void logInfo(String message) {
		log(IStatus.INFO, IStatus.OK, message, null);
	}

	public static void logWarning(String message) {
		log(IStatus.WARNING, IStatus.OK, message, null);
	}

	public static void logError(Throwable exception) {
		logError("Unexpected Exception", exception);
	}

	public static void logError(String message) {
		logError(message, null);
	}

	public static void logError(String message, Throwable exception) {
		log(IStatus.ERROR, IStatus.OK, message, exception);
	}

	public static void log(int severity, int code, String message, Throwable exception) {
		log(createStatus(severity, code, message, exception));
	}

	public static IStatus createStatus(int severity, int code, String message, Throwable exception) {
		return new Status(severity, DSLDebuggerPlugin.PLUGIN_ID, code, message, exception);
	}

	public static void log(IStatus status) {
		DSLDebuggerPlugin.getInstance().getLog().log(status);
	}

}
