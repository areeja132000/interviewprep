package com.interviewprep;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class InputFileHandler implements IInputFileHandler{
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
        
        Logger.writeToLog("Read lines");
        return Arrays.asList(allLines.split("\n"));
	}
	
	public void close() throws IOException {
		myReader.close();
	}

}
