package com.interviewprep;

import java.io.IOException;

public class Logger {
	
	private IOutputFileHandler logger;
	
	public Logger(IOutputFileHandler logger) throws IOException {
		this.logger = logger;
		logger.writeLineToFile("Log Begins:");
	}
	
	public void writeToLog(String line) throws IOException {
		logger.writeLineToFile(line);
	}

}
