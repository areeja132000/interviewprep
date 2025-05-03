package com.interviewprep;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Not enough arguments.");
			System.exit(1);
		}
		
        String inputFile = args[0];
        String outputFile = args[1];
        
        
        try {
        	IInputFileHandler inputFileHandler = new InputFileHandler(new FileReader(inputFile));
			List<String> sortedNames = NameSorterHandler.sorterHandler(inputFileHandler.readAllLines());
			IOutputFileHandler outputFileHandler = new OutputFileHandler(new FileWriter(outputFile));
			outputFileHandler.writeLinesToFile(sortedNames);
			OutputConsoleHandler.writeLinesToConsole(sortedNames);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
