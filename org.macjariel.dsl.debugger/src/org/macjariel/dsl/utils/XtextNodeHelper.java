package org.macjariel.dsl.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.nodemodel.INode;
import org.macjariel.dsl.DSLDebuggerLog;

public class XtextNodeHelper {

	public static class PositionInfo {
		public int startLine = -1;
		public int endLine = -1;
		public int startChar = -1;
		public int endChar = -1;
	};

	public static PositionInfo stripWhitespaces(INode node, IFile file) {
		PositionInfo positionInfo = new PositionInfo();
		try {
		InputStream is = file.getContents();
		LineNumberReader reader = new LineNumberReader(new InputStreamReader(is));

		reader.skip(node.getOffset());

		char aChar[] = new char[1];
		for (int idx = node.getOffset(); idx != node.getOffset() + node.getLength(); ++idx) {
			reader.read(aChar, 0, 1);
			if (Character.isWhitespace(aChar[0]))
				continue;

			if (positionInfo.startChar == -1)
				positionInfo.startChar = idx;

			if (positionInfo.startLine == -1)
				positionInfo.startLine = reader.getLineNumber() + 1;

			positionInfo.endChar = idx + 1;
			positionInfo.endLine = reader.getLineNumber() + 2;
		}
		} catch (IOException e) {
			DSLDebuggerLog.logError(e);
		} catch (CoreException e) {
			DSLDebuggerLog.log(e);
		}
		return positionInfo;
	}

	public static PositionInfo stripWhitespaces(INode node) {
		// TODO: implement based on code in Annotator (if necessary)
		return null;
	}

}
