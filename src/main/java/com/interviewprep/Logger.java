package com.interviewprep;

import java.io.IOException;

public class Logger {
	
	private static IOutputFileHandler logger;
	
	public static void setLogger(IOutputFileHandler logger) {
		Logger.logger = logger;
		try {
			logger.writeLineToFile("Log Begins:\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeToLog(String line) {
		try {
			logger.writeLineToFile(line + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			Logger.logger.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
