package com.interviewprep;

/**
 * This class represents a person
 */
public class Person {
	private String lastName;
	private String givenNames;
	
	public Person (String fullName) {
		this.givenNames = FullNameParser.parseForGivenNames(fullName);
		this.lastName = FullNameParser.parseForLastName(fullName);
	}

	public String getLastName () {
		return this.lastName;
	}
	
	public String getGivenNames () {
		return this.givenNames;
	}
	
	@Override
	public String toString () {
		return this.givenNames + " " + this.lastName;
	}

}
