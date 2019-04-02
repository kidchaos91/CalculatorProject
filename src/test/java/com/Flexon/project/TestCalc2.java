package com.Flexon.project;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestCalc2 {
	@Test
	public void testSum2() {
		System.out.println("sum");
		Integer x = -15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		Assert.assertEquals(null, Calculator.sum(15, null));
		System.out.println(result);
	}
	
	@Test
	public void testSum3() {
		System.out.println("sum");
		Integer x = -15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		Assert.assertEquals(null, Calculator.sum(15, null));
		System.out.println(result);
	}
	
	@BeforeMethod
	public void beforeTheMethod() {
		System.out.println("before method");
	}
	
	@BeforeTest
	public void beforeTheTest() {
		System.out.println("before");
	}

	@AfterTest
	public void afterTheTest() {
		System.out.println("after");
	}
}
