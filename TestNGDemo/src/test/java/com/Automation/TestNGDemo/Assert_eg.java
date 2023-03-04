package com.Automation.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_eg {

	@Test(groups= {"Regression"})
	public void Assert_Eg() {
		String a = "Hello";
		String b = "World";
		
		Assert.assertEquals(a, b);
		
		System.out.println("Hello");
	}

	@Test(dependsOnMethods = "Assert_Eg")
	public void anyname_DependsOn_Eg() {
		
		
		System.out.println("I am depending on Assert Eg");
	}
//	@Test
	public void SoftAssert_Eg() {
		String a = "Hello";
		String b = "World";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		
		System.out.println("Hello");
	}

}
