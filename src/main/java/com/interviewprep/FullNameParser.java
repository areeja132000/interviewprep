package com.interviewprep;


public class FullNameParser {
	
	/**
	 * Extracts given names from a full name
	 * 
	 * @param fullName full name that needs to be parsed
	 * @return         given names
	 */
	public static String parseForGivenNames(String fullName) {
		String[] allNames = splitValid(fullName);
		if (allNames!=null) {
			String buildGivenNames = allNames[0];
			for (int i=1; i<allNames.length-1; i++) {
				buildGivenNames = buildGivenNames + " " + allNames[i];
			}
			return buildGivenNames;
		} 
		return null;
	}
	
	/**
	 * Extracts last name from a full name
	 * 
	 * @param fullName full name that needs to be parsed
	 * @return         last name
	 */
	public static String parseForLastName(String fullName) {
		String[] allNames = splitValid(fullName);
		if (allNames!=null) {
			return allNames[allNames.length-1];
		}
		
		return null;
	}
	
	/**
	 * Splits a full name into its individual names if full name is valid
	 * 
	 * @param fullName full name string
	 * @return         list of names in the full name
	 */
	private static String[] splitValid(String fullName) {
		if (fullName != null) {
			String[] allNames = fullName.trim().split(" ");
			if (allNames.length >= 2) {
				
				return allNames;
			}
		}
		return null;
	}

}
