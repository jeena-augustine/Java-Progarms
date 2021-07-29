package com.example.demo.oops.inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInheritance2Test {

	BabyDog d = new BabyDog();
	@Test
	public void testBark() {
		assertNotSame("eating...",d.bark());
		
	}
	@Test
	public void testEat() {
		assertNotSame("eating...",d.eat());
		
	}
	
	@Test
	public void testWeep() {
		assertSame("weeping...",d.weep());
		
	}
}
