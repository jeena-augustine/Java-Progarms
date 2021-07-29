package com.example.demo.conditions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.conditions.LeapYearExample;

public class LeapYearExampleTest {

	@Test
	public void testLeapYear() {
		assertTrue(LeapYearExample.leapYear(2020));
		assertFalse(LeapYearExample.leapYear(2021));
	}

}
