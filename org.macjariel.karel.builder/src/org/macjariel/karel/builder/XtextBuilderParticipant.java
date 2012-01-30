package org.macjariel.karel.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.macjariel.karel.generator.ui.common.GenerateAll;

public class XtextBuilderParticipant implements IXtextBuilderParticipant {

	public XtextBuilderParticipant() {
	}

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		if (!context.getBuiltProject().hasNature(KarelNature.NATURE_ID))
			return;

		for (Delta delta : context.getDeltas()) {
			IResourceDescription newRes = delta.getNew();
			if (newRes == null)
				continue;

			try {
				IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				URI uri = CommonPlugin.resolve(newRes.getURI());
				if (!uri.isFile())
					continue;
				IPath path = new Path(uri.toFileString());
				IFile file = workspaceRoot.getFileForLocation(path);
				if (file == null)
					continue;
				generate(context.getBuiltProject(), file, monitor);
			} catch (Exception e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}

		context.getResourceSet();
	}

	/**
	 * Launches the generation with the given model.
	 * 
	 * @param project
	 *            The project.
	 * @param model
	 *            The uml model.
	 * @param progressMonitor
	 *            The progress monitor.
	 */
	protected void generate(IProject project, IFile model, IProgressMonitor progressMonitor) {
		IFile propertiesFile = project.getFile(ToggleNatureAction.PROPERTIES_FILE);
		Properties properties = new Properties();
		try {
			properties.load(propertiesFile.getContents());
			Object output = properties.get(model.getProjectRelativePath().toString());
			if (output instanceof String) {
				String outputPath = (String) output;
				Object clear = properties.get(outputPath + "__clear");

				IFolder targetFolder = project.getFolder(new Path(outputPath));

				if (targetFolder.exists()) {
					if (clear instanceof String && ((String) clear).trim().equals("true")) {
						IResource[] members = targetFolder.members();
						for (IResource member : members) {
							member.delete(true, progressMonitor);
						}
					}
				}

				URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
				try {
					GenerateAll generator = new GenerateAll(modelURI, targetFolder.getLocation()
							.toFile(), new ArrayList<String>());
					generator.doGenerate(progressMonitor);
				} catch (IOException e) {
					IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(),
							e);
					Activator.getDefault().getLog().log(status);
				} finally {
					targetFolder.refreshLocal(IResource.DEPTH_INFINITE, progressMonitor);
				}
			}
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
	}

}
