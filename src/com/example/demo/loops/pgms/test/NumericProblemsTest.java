package com.example.demo.loops.pgms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.loops.pgms.NumericProblems;

public class NumericProblemsTest {

	@Test
	public void testCalculateDeprecation() {
		
		assertEquals(81,NumericProblems.calculateDeprecation(100,10, 2));
	}

}
