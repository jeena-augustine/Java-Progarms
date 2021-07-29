package com.example.demo.loops.pgms.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.loops.pgms.CommissionPercentage;
import com.example.demo.loops.pgms.DistanceExample;

public class CommissionPercentageTest {

	@Test
	public void testCalculateCommission() {
		assertEquals(10,CommissionPercentage.calculateCommission(100, 10));
		assertNotEquals(20,CommissionPercentage.calculateCommission(100, 10));
	}

	@Test
	public void calculateDistance() {
		assertNotEquals(16,DistanceExample.calculateDistanceBW2Points(10, 6));
	}
}
