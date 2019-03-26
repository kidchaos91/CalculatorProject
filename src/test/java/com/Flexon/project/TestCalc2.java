package com.Flexon.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalc2 {
	@Test
	public void testSum2() {
		System.out.println("sum");
		Integer x = -15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(null, Calculator.sum(15, null));
		System.out.println(result);
	}

}
