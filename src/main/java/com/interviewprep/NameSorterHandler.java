package com.interviewprep;

import java.util.ArrayList;
import java.util.List;

public class NameSorterHandler {

	public static List<String> sorterHandler (List<String> allNames) {
		
		
		//Convert to people
		List<Person> people = new ArrayList<>();
		for (String name: allNames) {
			people.add(new Person(name));
		}
		
		//Sort names
		NameSorter.sortNames(people);

		//Make strings of sorted names
		List<String> sortedNames = new ArrayList<>();
		for (Person person: people) {
			sortedNames.add(person.toString());
		}
		
		Logger.writeToLog("Sorted names");
		
		//Return sorted strings
		return sortedNames;
	}
}
