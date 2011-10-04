package org.macjariel.karel.dsl.debugger.ui.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.texteditor.ITextEditor;
import org.macjariel.dsl.debugger.ui.adapters.DSLBreakpointAdapter;

@SuppressWarnings("rawtypes")
/**
 * This class is an adapter factory that provides an adapter for the ITextEditor of
 * given DSL.
 * 
 * @author MacJariel
 *
 */
public class DSLBreakpointAdapterFactory implements IAdapterFactory {

	private static String editorID = "org.macjariel.karel.Karel";

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adaptableObject instanceof ITextEditor
				&& ((ITextEditor) adaptableObject).getSite().getId().equals(editorID)) {
			return new DSLBreakpointAdapter();
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { ITextEditor.class };
	}

}
