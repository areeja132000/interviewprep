package com.interviewprep;

import java.util.Comparator;
import java.util.List;

public class NameSorter {
	
	/**
	 * Sorts given list of full names (first by last name, then by given names) 
	 * and returns a sorted list of full names
	 * 
	 * @param allNames a list of full name strings that need to be sorted
	 * @return         sorted list of full name strings
	 */
	public static void sortNames (List<Person> people) {
		//Sort list of people (first by last name, then by given names)
		if (people != null) {
			people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getGivenNames));
		}
	}
	
}
