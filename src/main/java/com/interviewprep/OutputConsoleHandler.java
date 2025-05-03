package com.interviewprep;

import java.util.List;

public class OutputConsoleHandler {
	
	public static void writeLinesToConsole(List<String> lines) {
		for (String line: lines) {
			System.out.println(line);
		}
	}

}
