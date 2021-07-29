package com.example.demo.loops.pgms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.loops.pgms.TextSample;

public class TextSampleTest {

	@Test
	public void testAverageOfNnumbers() {
		assertEquals(1,TextSample.averageOfNnumbers(2));
	}

	@Test
	public void testFactorial() {
		assertEquals(23,TextSample.factorial(4));
		
	}
	
	
	
}
