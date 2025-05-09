package com.interviewprep;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OutputFileHandler implements IOutputHandler {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	private FileWriter myWriter;
	
	public OutputFileHandler(FileWriter myWriter) throws IOException {
		this.myWriter = myWriter;
	}
	
	@Override
	public void writeLine(String line) throws IOException {
		myWriter.write(line);
	}
	
	public void writeLines(List<String> lines) throws IOException {
		for (String line: lines) {
			writeLine(line + "\n");
		}
	}
	
	public void close() throws IOException {
		myWriter.close();
	}
}
