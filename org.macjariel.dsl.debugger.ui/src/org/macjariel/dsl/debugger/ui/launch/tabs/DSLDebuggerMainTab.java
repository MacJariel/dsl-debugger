package org.macjariel.dsl.debugger.ui.launch.tabs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.macjariel.dsl.debugger.DSLDebuggerLog;
import org.macjariel.dsl.debugger.ui.internal.BrowseDialogsHelper;
import org.macjariel.dsl.debugger.ui.internal.SWTFactory;
import org.macjariel.dsl.debugger.launcher.DSLLaunchParams;

/**
 * Main launch configuration tab for DSL Debugger.
 * 
 * @author MacJariel
 * 
 */
public class DSLDebuggerMainTab extends AbstractLaunchConfigurationTab {

	private Text dslProgramFilenameText;
	private Text traceabilityModelFilenameText;

	@Override
	public void createControl(Composite parent) {
		Composite comp = SWTFactory.createComposite(parent, 1, 1, GridData.FILL_BOTH);

		((GridLayout) comp.getLayout()).verticalSpacing = 0;
		createDSLModelEditor(comp);
		createTraceabilityModelEditor(comp);
		setControl(comp);

	}

	protected void createDSLModelEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "DSL program", 2, 1, GridData.FILL_HORIZONTAL);
		dslProgramFilenameText = SWTFactory.createSingleText(group, 1);
		Button showButton = SWTFactory.createPushButton(parent, "Select...", null);
		showButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleDSLProgramFileSelection();
			}
		});
	}

	protected void createTraceabilityModelEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Traceability model", 2, 1,
				GridData.FILL_HORIZONTAL);
		traceabilityModelFilenameText = SWTFactory.createSingleText(group, 1);
		Button showButton = SWTFactory.createPushButton(parent, "Select...", null);
		showButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleTraceabilityModelFileSelection();
			}
		});
	}

	private void handleDSLProgramFileSelection() {
		IFile dslProgramFile = BrowseDialogsHelper.browseForFile(getShell(), ResourcesPlugin
				.getWorkspace().getRoot(), "");
		if (dslProgramFile != null) {
			dslProgramFilenameText.setText(dslProgramFile.getFullPath().toPortableString());
			setDirty(true);
			updateLaunchConfigurationDialog();
		}

	}

	private void handleTraceabilityModelFileSelection() {
		IFile traceabilityModelFile = BrowseDialogsHelper.browseForFile(getShell(), ResourcesPlugin
				.getWorkspace().getRoot(), "");
		if (traceabilityModelFile != null) {
			traceabilityModelFilenameText.setText(traceabilityModelFile.getFullPath()
					.toPortableString());
			setDirty(true);
			updateLaunchConfigurationDialog();
		}

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {

		try {
			dslProgramFilenameText.setText(configuration.getAttribute(
					DSLLaunchParams.DSL_PROGRAM_FILE, ""));
			traceabilityModelFilenameText.setText(configuration.getAttribute(
					DSLLaunchParams.TRACE_MODEL_FILE, ""));
		} catch (CoreException e) {
			DSLDebuggerLog.logError(e);
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DSLLaunchParams.DSL_PROGRAM_FILE,
				dslProgramFilenameText.getText());
		configuration.setAttribute(DSLLaunchParams.TRACE_MODEL_FILE,
				traceabilityModelFilenameText.getText());
		// TODO: Set appropriate DSLLaunchParams.TARGET_PLATFORM_ID (or how else can it be set?)
	}

	@Override
	public String getName() {
		return "DSL Debugger";
	}
}
