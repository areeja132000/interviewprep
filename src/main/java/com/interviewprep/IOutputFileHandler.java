package com.interviewprep;

import java.io.IOException;
import java.util.List;

public interface IOutputFileHandler {
	public void writeLineToFile(String line) throws IOException;
	public void writeLinesToFile(List<String> line) throws IOException;
	public void close() throws IOException;
}
