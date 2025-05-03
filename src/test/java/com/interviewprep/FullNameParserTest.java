package com.interviewprep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.interviewprep.FullNameParser;

class FullNameParserTest {

	@Test
	void testValidGivenNames() {
		String givenNames = FullNameParser.parseForGivenNames("Gary Henry Jack Smith");
		assertEquals("Gary Henry Jack", givenNames);
	}
	
	@Test
	void testInvalidGivenNames() {
		String givenNames = FullNameParser.parseForGivenNames("Gary");
		assertNull(givenNames);
	}
	
	@Test
	void testNullGivenNames() {
		String givenNames = FullNameParser.parseForGivenNames(null);
		assertNull(givenNames);
	}
	
	@Test
	void testValidLastName() {
		String lastName = FullNameParser.parseForLastName("Gary Henry Jack Smith");
		assertEquals("Smith", lastName);
	}
	
	@Test
	void testInvalidLastName() {
		String lastName = FullNameParser.parseForGivenNames("Gary");
		assertNull(lastName);
	}
	
	@Test
	void testNullLastName() {
		String lastName = FullNameParser.parseForGivenNames(null);
		assertNull(lastName);
	}

}
