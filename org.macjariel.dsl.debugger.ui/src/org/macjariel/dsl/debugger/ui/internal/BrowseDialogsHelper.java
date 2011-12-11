/**
 * 
 */
package org.macjariel.dsl.debugger.ui.internal;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

/**
 * Helper for preparing different types of browse dialogs.
 * 
 * @author Michal Malohlava
 *
 */
public class BrowseDialogsHelper {
	
	/**
	 * Open "Browse resources" dialog for selecting a file.
	 * 
	 * @param shell UI shell
	 * @param container container containing resources
	 * @param initialPattern initial search patter
	 * 
	 * @return selected file.
	 */
	public static final IFile browseForFile(Shell shell, IContainer container, String initialPattern) {
		FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(shell, false, container, IResource.FILE);
		
		dialog.setInitialPattern(initialPattern);
		dialog.open();
				
		if (dialog.getReturnCode() == Window.OK) {
			return (IFile) dialog.getResult()[0];			
		}
		
		return null;
	}
	
	public static final IPath browseForContainer(Shell shell, IContainer initialRoot, String message) {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(shell, initialRoot, false, message);
		
		dialog.open();
		if (dialog.getReturnCode() == Window.OK) {
			return (IPath)dialog.getResult()[0];
		}
		return null;
	}
	
}
