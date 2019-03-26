package com.Flexon.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testSum() {
		Calculator c1 = new Calculator();
		System.out.println("sum");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = c1.sum(x, y);
		assertEquals(expResult, result);
		System.out.println(result);
//		assertEquals(null, Calculator.sum(15, null));
//		assertEquals(null, Calculator.sum(null, 15));
//		assertEquals(null, Calculator.sum(null, null));
	}
	
	@Test
	public void testSum2() {
		Calculator c1 = new Calculator();
		System.out.println("sum");
		Integer x = -15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = c1.sum(x, y);
		assertEquals(null, c1.sum(15, null));
		System.out.println(result);
	}


}
