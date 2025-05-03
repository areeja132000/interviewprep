package com.interviewprep;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileHandler implements IOutputFileHandler {
	private FileWriter myWriter;
	
	public OutputFileHandler(FileWriter myWriter) throws IOException {
		this.myWriter = myWriter;
	}
	
	@Override
	public void writeLineToFile(String line) throws IOException {
		myWriter.write(line);
	}
	
	public void writeLinesToFile(List<String> lines) throws IOException {
		for (String line: lines) {
			writeLineToFile(line);
		}
	}
	
	public void close() throws IOException {
		myWriter.close();
	}
}
