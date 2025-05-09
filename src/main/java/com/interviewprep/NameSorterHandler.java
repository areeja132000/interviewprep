package com.interviewprep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NameSorterHandler {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	private IOutputHandler outputFileHandler;
	private IInputFileHandler inputFileHandler;
	
	public NameSorterHandler(IInputFileHandler inputFileHandler, IOutputHandler outputFileHandler) {
		this.inputFileHandler = inputFileHandler;
		this.outputFileHandler = outputFileHandler;
	}

	public void sorterHandler () {
		
		List<String> allNames = readNames();
		
		//Convert to people
		List<Person> people = convertStringsToPeople(allNames);
		
		//Sort names
		NameSorter.sortNames(people);
		LOGGER.info("Sorted names");

		//Make strings of sorted names
		List<String> sortedNames = convertPeopleToStrings(people);
		
		//Write names to file
		writeNames(sortedNames);
		LOGGER.info("Wrote names to file");
		
		closeResources();
	}
	
	private void closeResources() {
		try {
			this.outputFileHandler.close();
			this.inputFileHandler.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private List<String> readNames() {
		List<String> allNames = new ArrayList<>();
		try {
			allNames = this.inputFileHandler.readAllLines();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allNames;
	}
	
	private void writeNames(List<String> sortedNames) {
		try {
			this.outputFileHandler.writeLines(sortedNames);
			(new OutputConsoleHandler()).writeLines(sortedNames);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private List<Person> convertStringsToPeople(List<String> allNames) {
		List<Person> people = new ArrayList<>();
		for (String name: allNames) {
			people.add(new Person(name));
		}
		return people;
	}
	
	private List<String> convertPeopleToStrings(List<Person> people) {
		List<String> sortedNames = new ArrayList<>();
		for (Person person: people) {
			sortedNames.add(person.toString());
		}
		return sortedNames;
	}
	 
	
}
