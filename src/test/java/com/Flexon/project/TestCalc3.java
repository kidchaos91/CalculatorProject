package com.Flexon.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalc3 {
	@Test
	public void testSum3() {
		Calculator c1 = new Calculator();
		System.out.println("sum");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, Calculator.sum(15, 15));
		System.out.println(result);
	}

}
