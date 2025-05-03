package com.interviewprep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.interviewprep.Person;

class PersonTest {

	@Test
	void testPersonCreation() {
		Person testPerson = new Person("Gary Smith");
		
		assertEquals("Gary", testPerson.getGivenNames());
		assertEquals("Smith", testPerson.getLastName());
	}
	
	@Test
	void testMultipleGivenNames() {
		Person testPerson = new Person("Gary Henry Jack Smith");
		
		assertEquals("Gary Henry Jack", testPerson.getGivenNames());
		assertEquals("Smith", testPerson.getLastName());
	}
	
	@Test
	void testNull() {
		Person testPerson = new Person(null);
		
		assertNull(testPerson.getGivenNames());
		assertNull(testPerson.getLastName());
	}
	
	@Test
	void testInvalid() {
		Person testPerson = new Person("");
		
		assertNull(testPerson.getGivenNames());
		assertNull(testPerson.getLastName());
	}
	
	@Test
	void testInvalidSingleName() {
		Person testPerson = new Person("Gary");
		
		assertNull(testPerson.getGivenNames());
		assertNull(testPerson.getLastName());
	}



}
