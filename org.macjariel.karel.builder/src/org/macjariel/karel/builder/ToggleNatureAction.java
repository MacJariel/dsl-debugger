package org.macjariel.karel.builder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Action that provides toggling mechanism for the Karel project nature.
 * 
 * @author MacJariel
 * 
 */
public class ToggleNatureAction implements IObjectActionDelegate {

	/**
	 * The name of the properties file that configures the Acceleo builder.
	 */
	public static final String PROPERTIES_FILE = "karel.properties";

	/**
	 * The current selection.
	 */
	private ISelection selection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					toggleNature(project);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action
	 * .IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.
	 * action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

	/**
	 * Toggles Karel nature on a project
	 * 
	 * @param project
	 *            to have Karel nature added or removed
	 */
	private void toggleNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();

			for (int i = 0; i < natures.length; ++i) {
				if (KarelNature.NATURE_ID.equals(natures[i])) {
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					return;
				}
			}

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			newNatures[0] = KarelNature.NATURE_ID;
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			description.setNatureIds(newNatures);
			project.setDescription(description, null);

			// Generate the property file
			IFile propertiesFile = project.getFile(PROPERTIES_FILE);
			if (!propertiesFile.exists()) {
				final String nl = System.getProperty("line.separator");

				StringBuffer content = new StringBuffer();
				content.append("##############################################################");
				content.append(nl);
				content.append("# Karel configuration file");
				content.append(nl);
				content.append("#");
				content.append(nl);
				content.append("# For each DSL file in your project, enter a source folder");
				content.append(nl);
				content.append("# in which the GPL classes will be generated. Example:");
				content.append(nl);
				content.append("# model/program.karel = src-gen");
				content.append(nl);
				content.append("# ");
				content.append(nl);
				/*
				 * content.append(
				 * "# You can also specify if you want the output folder to be"
				 * ); content.append(nl);
				 * content.append("# cleared before a new generation. Example:"
				 * ); content.append(nl);
				 * content.append("# src-uml-generated__clear = true");
				 * content.append(nl); content.append("# "); content.append(nl);
				 * content.append(
				 * "# By default, the output folder is NOT cleared before a new"
				 * ); content.append(nl); content.append("# generation.");
				 * content.append(nl); content.append(
				 * "##############################################################"
				 * ); content.append(nl);
				 */
				content.append(nl);

				InputStream source = new ByteArrayInputStream(content.toString().getBytes());
				propertiesFile.create(source, true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			// TODO: log exception
			// IStatus status = new Status(IStatus.ERROR,
			// UML2JavaUIActivator.PLUGIN_ID,
			// e.getMessage(), e);
			// UML2JavaUIActivator.getDefault().getLog().log(status);
		}
	}

}
