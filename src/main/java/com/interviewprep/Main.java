package com.interviewprep;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Not enough arguments.");
			System.exit(1);
		}
		
        String inputFile = args[0];
        String outputFile = args[1];
        
        
        try {
        	
        	LOGGER.info("Start program");
        	IInputFileHandler inputFileHandler = new InputFileHandler(new FileReader(inputFile));
        	IOutputHandler outputFileHandler = new OutputFileHandler(new FileWriter(outputFile));
        	NameSorterHandler sorterHandler = new NameSorterHandler(inputFileHandler, outputFileHandler);
        	sorterHandler.sorterHandler();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		}
	    
	}

}
