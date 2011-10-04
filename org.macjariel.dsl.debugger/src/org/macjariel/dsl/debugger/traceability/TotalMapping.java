package org.macjariel.dsl.debugger.traceability;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Collections;
import java.util.Vector;

import org.eclipse.acceleo.traceability.GeneratedFile;
import org.eclipse.acceleo.traceability.GeneratedText;
import org.eclipse.acceleo.traceability.InputElement;
import org.eclipse.acceleo.traceability.ModuleElement;
import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.macjariel.dsl.debugger.traceability.TotalMapping.TotalMappingItem.Type;

/**
 * The class provides a mapping from any element in DSL program model to lists
 * of regions in generated files. It also contains convenience methods to obtain
 * generated text.
 * 
 * @author MacJariel
 * 
 */
public class TotalMapping {

	private EObject dslProgramModel;

	private TraceabilityModel traceabilityModel;

	public static class TotalMappingItem implements Cloneable {

		enum Type {
			STATEMENT, SUBRUTINE_CALL, SUBRUTINE_DEFINITION, UNKNOWN
		}

		private static String[] typeAnnotations = {
				"http://www.macjariel.org/dsldebugger/Statement",
				"http://www.macjariel.org/dsldebugger/SubrutineCall",
				"http://www.macjariel.org/dsldebugger/SubrutineDefinition", null };

		static Type getTypeFromAnnotationSource(String annotationSource) {
			if (annotationSource == typeAnnotations[0])
				return Type.STATEMENT;

			if (annotationSource == typeAnnotations[1])
				return Type.SUBRUTINE_CALL;

			if (annotationSource == typeAnnotations[2])
				return Type.SUBRUTINE_DEFINITION;

			return null;
		}

		EObject sourceElement;

		IFile sourceFile;
		IFile targetFile;

		int sourceStartOffset, sourceEndOffset;
		int sourceStartLine, sourceEndLine;

		int targetStartOffset, targetEndOffset;
		int targetStartLine, targetEndLine;

		Type type;

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
			this.sourceStartLine = node.getStartLine() - 1;
			this.sourceEndLine = node.getEndLine() - 1;
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

		void setType(Type type) {
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
			Type type = null;

			for (EAnnotation eAnnotation : eClass.getEAnnotations()) {
				type = TotalMappingItem.getTypeFromAnnotationSource(eAnnotation.getSource());
				if (type != null)
					break;
				;
			}

			if (type == null)
				continue;

			TotalMappingItem item = new TotalMappingItem();

			NodeModelUtils.getNode(sourceElement);

			item.setType(type);
			item.fillSource(sourceElement);

			InputElement[] associatedInputElements = TraceabilityModelHelper
					.getAssociatedInputElements(sourceElement, traceabilityModel);
			Vector<GeneratedText> generatedTexts = new Vector<GeneratedText>();
			if (associatedInputElements.length > 0) {
				for (GeneratedFile gFile : traceabilityModel.getGeneratedFiles()) {
					for (GeneratedText gText : gFile.getGeneratedRegions()) {
						for (InputElement inputElement : associatedInputElements) {
							if (gText.getSourceElement() == inputElement) {
								ModuleElement m = gText.getModuleElement();
								EObject me = m.getModuleElement();
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

	Vector<TotalMappingItem> items = new Vector<TotalMappingItem>();
}