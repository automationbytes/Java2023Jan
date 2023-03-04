package com.Automation.TestNGDemo;

import org.testng.annotations.*;
import org.testng.annotations.Test;
//
//@Test(groups= {"Regression"})
public class Annotations_Eg {

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	
	
	@BeforeClass
	public void beforeCls() {
		System.out.println("Before Class");
	}
	
	
	@BeforeMethod
	public void beforeMtd() {
		System.out.println("Before Method");
	}
	
	
	@Test
	public void test2() {
		System.out.println("ABC");
	}
	
	@Test(groups= {"Regression"})
	public void test1() {
		System.out.println("XYZ");
	}
	
	@AfterMethod
	public void AfterMtd() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void AfterCls() {
		System.out.println("After Class");
	}
	
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	
}
