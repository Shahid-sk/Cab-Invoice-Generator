package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
	InvoiceGenerator invoiceGenerator = null;

	/**
	 * Purpose : To create object before any test case is called. Improves
	 * Redundancy of code
	 */
	@Before
	public void setUp() {
		invoiceGenerator = new InvoiceGenerator();
	}

	/**
	 * Step 1.1 Purpose : Given distance and time, return total fare
	 */
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	/**
	 * Step 1.2 Purpose: Given distance and time, return minimum fare as 5
	 */
	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
}