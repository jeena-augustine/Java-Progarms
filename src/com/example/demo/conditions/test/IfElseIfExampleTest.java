package com.example.demo.conditions.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.conditions.IfElseIfExample;

public class IfElseIfExampleTest {

	@Test
	public void testCalculateGrade() {
		assertSame("A grade",IfElseIfExample.CalculateGrade(85));
	}

}
