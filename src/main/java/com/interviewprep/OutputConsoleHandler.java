package com.interviewprep;

import java.io.IOException;
import java.util.List;

public class OutputConsoleHandler implements IOutputHandler{
	
	@Override
	public void writeLine(String line) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(line);
	}

	@Override
	public void writeLines(List<String> lines) throws IOException {
		// TODO Auto-generated method stub
		for (String line: lines) {
			writeLine(line);
		}
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.flush();
	}

}
