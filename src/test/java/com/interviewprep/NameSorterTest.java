package com.interviewprep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.interviewprep.NameSorter;
import com.interviewprep.Person;

class NameSorterTest {
	
	private static Person garyAnneJock;
	private static Person garyBobAbel;
	private static Person garySheppardCain;
	private static Person garySheppardJock;
	private static Person garyBobJock;
	private static Person garySheppardFerdenand;
	private static Person garySheppardAntonio;
	private static Person amyAnneFerdenand;
	private static Person garyBobFerdenand;
	private static Person garyBobAntonio;
	
	@BeforeAll
	static void setup() {
		garyAnneJock = new Person("Gary Anne Jock");
		garyBobAbel = new Person("Gary Bob Abel");
		garySheppardCain = new Person("Gary Sheppard Cain");
		garySheppardJock = new Person("Gary Sheppard Jock");
		garyBobJock = new Person("Gary Bob Jock");
		garySheppardFerdenand = new Person("Gary Sheppard Ferdenand");
		garySheppardAntonio = new Person("Gary Sheppard Antonio");
		amyAnneFerdenand = new Person("Amy Anne Ferdenand");
		garyBobFerdenand = new Person("Gary Bob Ferdenand");
		garyBobAntonio = new Person("Gary Bob Antonio");
	}

	@Test
	void testNullList() {
		List<Person> unsortedNames = null; 
		
		NameSorter.sortNames(unsortedNames);
		
		assertNull(unsortedNames);
	}
	
	@Test
	void testEmptyList() {
		List<Person> unsortedNames = new ArrayList<>();
		List<Person> sortedNames = new ArrayList<>();
		
		NameSorter.sortNames(unsortedNames);
		
		assertEquals(sortedNames, unsortedNames);
	}
	
	@Test
	void testValidList() {
		List<Person> unsortedNames = Arrays.asList(garyAnneJock, garyBobAbel, garySheppardCain);
		List<Person> sortedNames = Arrays.asList(garyBobAbel, garySheppardCain, garyAnneJock);
		
		NameSorter.sortNames(unsortedNames);
		
		assertEquals(sortedNames, unsortedNames);
	}
	
	@Test
	void testSameLastName() {	
		List<Person> unsortedNames = Arrays.asList(garyAnneJock, garySheppardJock, garyBobJock);
		List<Person> sortedNames = Arrays.asList(garyAnneJock, garyBobJock, garySheppardJock);

		NameSorter.sortNames(unsortedNames);
		
		assertEquals(sortedNames, unsortedNames);
	}
	
	@Test
	void testDuplicateLastNames() {
		List<Person> unsortedNames = Arrays.asList(garyAnneJock, garySheppardFerdenand, garySheppardJock, 
				garySheppardAntonio, garyBobJock, amyAnneFerdenand, garyBobFerdenand, garyBobAntonio);
		List<Person> sortedNames = Arrays.asList(garyBobAntonio, garySheppardAntonio, amyAnneFerdenand, 
				garyBobFerdenand, garySheppardFerdenand, garyAnneJock, garyBobJock, garySheppardJock);
		
		NameSorter.sortNames(unsortedNames);

		assertEquals(sortedNames, unsortedNames);
	}

}
