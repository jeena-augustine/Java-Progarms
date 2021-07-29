package com.exmple.demo.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMIExampleTest {

	@Test
	public void testBMI() {
		assertEquals(6,BMIExample.calculateBMI("m", 3, 123, 10));
	}

}
