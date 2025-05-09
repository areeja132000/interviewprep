package com.interviewprep;

import java.io.IOException;
import java.util.List;

public interface IOutputHandler {
	public void writeLine(String line) throws IOException;
	public void writeLines(List<String> line) throws IOException;
	public void close() throws IOException;
}
