package com.Automation.TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderEg {

	
	@DataProvider(name = "singledp")
	public Object[][] SingleDPmthd(){
		return new Object[][] {{3},{100}};
	}
	
	
	
	
	@DataProvider(name = "multidp")
	public Object[][] MultiDPmthd(){
		return new Object[][] {{2,3},{10,20}};
	}

	@Test(dataProvider = "multidp")
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	@Test(dataProvider = "multidp")
	public void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	
	@Test(dataProvider = "singledp")
	public void age(int age) {
		System.out.println("My age is "+age);
	}
	
}
