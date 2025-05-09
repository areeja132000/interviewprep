package com.interviewprep;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputFileHandler implements IInputFileHandler{
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	private FileReader myReader;
	
	public InputFileHandler(FileReader myReader) throws IOException {
		this.myReader = myReader;
	}

	@Override
	public List<String> readAllLines() throws IOException {
        String allLines = "";
        int ch=myReader.read();
        while (ch!=-1) {
        	allLines = allLines+(char)ch;
        	ch=myReader.read();
        }
        
        LOGGER.info("Read lines");
        return Arrays.asList(allLines.split("\n"));
	}
	
	public void close() throws IOException {
		myReader.close();
	}

}
