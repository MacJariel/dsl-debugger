package org.macjariel.dsl.debugger.traceability;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.acceleo.traceability.GeneratedText;
import org.eclipse.acceleo.traceability.InputElement;
import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.debugger.DSLDebuggerPlugin;

/**
 * The class provides a mapping from any element in DSL program model to lists
 * of regions in generated files. It also contains convenience methods to obtain
 * generated text.
 * 
 * @author MacJariel
 * 
 */
public class TotalMapping implements SourceTargetMapping {

	private EObject dslProgramModel;

	private TraceabilityModel traceabilityModel;

	public static class TotalMappingItem implements Cloneable {

		EObject sourceElement;

		public IFile sourceFile;
		public IFile targetFile;

		public int sourceStartOffset, sourceEndOffset;
		public int sourceStartLine, sourceEndLine;

		public int targetStartOffset, targetEndOffset;
		public int targetStartLine, targetEndLine;

		Set<SourceElementType> type;

		TotalMappingItem() {

		}

		public Object clone() {
			try {
				return super.clone();
			} catch (Exception e) {
				return null;
			}
		}

		void fillSource(EObject sourceElement) {
			this.sourceElement = sourceElement;

			URI sourceElementURI = CommonPlugin.resolve(sourceElement.eResource().getURI());
			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			this.sourceFile = workspaceRoot.getFileForLocation(new Path(sourceElementURI
					.toFileString()));

			/*
			 * String platformString =
			 * sourceElement.eResource().getURI().toPlatformString(true);
			 * Resource res = sourceElement.eResource(); URI uri = res.getURI();
			 * String platformStrss = uri.toPlatformString(true);
			 * 
			 * IWorkspaceRoot workspaceRoot =
			 * ResourcesPlugin.getWorkspace().getRoot(); this.sourceFile =
			 * workspaceRoot.getFile(new Path(platformString));
			 */

			if (!this.sourceFile.exists()) {
				throw new RuntimeException("Could not find DSL model file in the workspace: "
						+ sourceElementURI.toFileString());
			}

			ICompositeNode node = NodeModelUtils.getNode(sourceElement);
			this.sourceStartOffset = node.getOffset();
			this.sourceEndOffset = node.getOffset() + node.getLength();
			this.sourceStartLine = node.getStartLine();
			this.sourceEndLine = node.getEndLine();
		}

		void fillTarget(GeneratedFile gFile, int startOffset, int endOffset) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

			this.targetFile = root.getFileForLocation(new Path(gFile.getPath()));
			this.targetStartOffset = startOffset;
			this.targetEndOffset = endOffset;

			computeTargetLines();
		}

		private void computeTargetLines() {
			// Compute targetStartLine and targetEndLine (the target file has to
			// be opened to determine this)
			InputStream is = null;
			try {
				// TODO: make sure that getContents(true) is OK
				is = targetFile.getContents(true);
				LineNumberReader reader = new LineNumberReader(new InputStreamReader(is));

				reader.skip(this.targetStartOffset);

				this.targetStartLine = -1;
				this.targetEndLine = -1;

				for (int i = this.targetStartOffset; i != this.targetEndOffset; ++i) {
					// TODO: The LineNumberReader.read() can read
					// \r\n at once. This can lead into
					// wrong offset on windows. Using the second
					// read() method may help.

					int aChar = reader.read();
					if (Character.isWhitespace(aChar))
						continue;
					if (this.targetStartLine == -1)
						this.targetStartLine = reader.getLineNumber() + 1;

					this.targetEndLine = reader.getLineNumber() + 1;
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			} finally {
				if (is != null) {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		void setType(Set<SourceElementType> type) {
			this.type = type;
		}

		/*
		 * public TotalMappingItem clone() { return (TotalMappingItem)
		 * super.clone(); }
		 */

		public void debugPrint() {
			System.out.println("**** MAPPING ITEM ****");

			System.out.println("src: " + this.sourceFile.getName() + ": [" + this.sourceStartOffset
					+ "-" + this.sourceEndOffset + "], lines: [" + this.sourceStartLine + "-"
					+ this.sourceEndLine + "]");

			System.out.println("dst: " + this.targetFile.getName() + ": [" + this.targetStartOffset
					+ "-" + this.targetEndOffset + "], lines: [" + this.targetStartLine + "-"
					+ this.targetEndLine + "]");

			System.out.println("src-text:");
			printFileRegion(this.sourceFile, this.sourceStartOffset, this.sourceEndOffset);

			System.out.println("\ndst-text:");
			printFileRegion(this.targetFile, this.targetStartOffset, this.targetEndOffset);

			System.out.println();
		}

		public void printFileRegion(IFile file, int startOffset, int endOffset) {
			InputStream is;
			try {
				is = file.getContents(true);

				is.skip(startOffset);
				for (int i = startOffset; i < endOffset; ++i) {
					char c = (char) is.read();
					System.out.print(c);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public TotalMapping(EObject dslProgramModel, TraceabilityModel traceabilityModel) {
		this.dslProgramModel = dslProgramModel;
		this.traceabilityModel = traceabilityModel;
		initMapping();
	}

	public void initMapping() {
		TreeIterator<EObject> iter = EcoreUtil.getAllProperContents(dslProgramModel, false);
		while (iter.hasNext()) {
			EObject sourceElement = iter.next();
			EClass eClass = sourceElement.eClass();

			EAnnotation dslAnnotation = eClass
					.getEAnnotation(TraceabilityModelHelper.DSL_DEBUGGER_ANNOTATION_SOURCE);
			if (dslAnnotation == null) {
				continue;
			}

			TotalMappingItem item = new TotalMappingItem();

			NodeModelUtils.getNode(sourceElement);

			item.setType(SourceElementType.createFromAnnotationString(dslAnnotation.getDetails()
					.get("type")));
			item.fillSource(sourceElement);

			InputElement[] associatedInputElements = TraceabilityModelHelper
					.getAssociatedInputElements(sourceElement, traceabilityModel);
			Vector<GeneratedText> generatedTexts = new Vector<GeneratedText>();
			if (associatedInputElements.length > 0) {
				for (GeneratedFile gFile : traceabilityModel.getGeneratedFiles()) {
					for (GeneratedText gText : gFile.getGeneratedRegions()) {
						for (InputElement inputElement : associatedInputElements) {
							if (gText.getSourceElement() == inputElement) {
								// ModuleElement m = gText.getModuleElement();
								// EObject me = m.getModuleElement();
								generatedTexts.add(gText);
							}
						}
					}
				}
			}
			Collections.sort(generatedTexts);

			GeneratedFile gFile = null;
			int startOffset = 0;
			int endOffset = 0;

			for (GeneratedText gText : generatedTexts) {
				if (gFile == gText.getOutputFile() && endOffset == gText.getStartOffset()) {
					// This region connects to the previous one
					endOffset = gText.getEndOffset();
				} else {
					if (gFile != null) {
						TotalMappingItem newItem = (TotalMappingItem) item.clone();
						newItem.fillTarget(gFile, startOffset, endOffset);
						putItem(newItem);
					}

					gFile = gText.getOutputFile();
					startOffset = gText.getStartOffset();
					endOffset = gText.getEndOffset();
				}
			}

			if (gFile != null) {
				item.fillTarget(gFile, startOffset, endOffset);
				putItem(item);
			}
		}
	}

	// TODO: convenience method, to be removed probably
	/*
	 * private void printRegion(GeneratedFile gFile, int startOffset, int
	 * endOffset) { System.out.println("**** Region: [" + startOffset + " - " +
	 * endOffset + "], [" + gFile.getName() + "]");
	 * 
	 * try { URI targetURI = new URI("file", gFile.getPath(), "");
	 * IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot(); IFile[]
	 * files = root.findFilesForLocationURI(targetURI); assert (files.length <=
	 * 1); if (files.length == 0) {
	 * System.out.println("Error: cannot find target file!"); } else { char[]
	 * buffer = new char[endOffset - startOffset + 2]; InputStreamReader isr =
	 * new InputStreamReader(files[0].getContents()); isr.skip(startOffset);
	 * isr.read(buffer, 0, endOffset - startOffset); System.out.println(buffer);
	 * } } catch (URISyntaxException e) { e.printStackTrace(); } catch
	 * (CoreException e) { e.printStackTrace(); } catch (IOException e) {
	 * e.printStackTrace(); } }
	 */

	private void putItem(TotalMappingItem item) {
		items.add(item);

		// DEBUG - add markers

		IMarker dslMarker;
		try {
			// dslMarker =
			// item.sourceFile.createMarker(DSLDebuggerPlugin.DSL_CODE_MARKER);
			HashMap<String, Object> hashMap = new HashMap();

			dslMarker = item.sourceFile.createMarker(IMarker.TEXT);
			dslMarker.setAttribute(IMarker.LINE_NUMBER, item.sourceStartLine);
			dslMarker.setAttribute(IMarker.CHAR_START, item.sourceStartOffset);
			dslMarker.setAttribute(IMarker.CHAR_END, item.sourceEndOffset);
			String text = "Lines: " + item.sourceStartLine + ":" + item.sourceEndLine + ", Chars: "
					+ item.sourceStartOffset + ":" + item.sourceEndOffset;

			dslMarker.setAttribute(IMarker.TEXT, text);
			dslMarker.setAttribute(IMarker.MESSAGE, text);

		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	TotalMappingItem findMappingForSourceElement(EObject sourceElement) {
		for (TotalMappingItem item : items) {
			if (item.sourceElement == sourceElement)
				return item;
		}
		return null;
	}

	public void debugPrint() {
		for (TotalMappingItem item : items) {
			item.debugPrint();
		}
	}

	// TODO: make private
	public Vector<TotalMappingItem> items = new Vector<TotalMappingItem>();

	@Override
	public MappingItem lookupSourceElement(MappingItem targetMappingItem) {

		List<TotalMappingItem> resultItems = new Vector<TotalMappingItem>();

		for (TotalMappingItem item : this.items) {

			if (targetMappingItem.resource.equals(item.targetFile) == false) {
				continue;
			}

			// / TODO: this is not working yet - continue here
			if (targetMappingItem.lineNumber >= item.targetStartLine
					&& targetMappingItem.lineNumber <= item.targetEndLine) {

				resultItems.add(item);
			}

		}

		if (resultItems.size() == 1) {
			return new MappingItem(resultItems.get(0).sourceFile,
					resultItems.get(0).sourceStartLine, resultItems.get(0).sourceStartOffset,
					resultItems.get(0).sourceEndOffset);
		}

		// TODO: This case needs to be precisely investigated... For now we
		// blindly return the first element.
		if (resultItems.size() > 1) {

			return new MappingItem(resultItems.get(0).sourceFile,
					resultItems.get(0).sourceStartLine, resultItems.get(0).sourceStartOffset,
					resultItems.get(0).sourceEndOffset);
		}

		// for (TotalMappingItem item : resultItems) {
		// System.out.println(item);
		// }

		return null;

	}
}
