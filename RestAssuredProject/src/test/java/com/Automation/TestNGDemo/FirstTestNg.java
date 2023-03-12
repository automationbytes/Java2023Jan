package com.Automation.TestNGDemo;

import org.testng.annotations.Test;

public class FirstTestNg {

	
	@Test(enabled = false)
	public void helloWorld() {
		System.out.println("Hello");
	}
	
	
	@Test(alwaysRun = true)
	public void firsttest() {
		System.out.println("My First Test");
	}
	
	
	@Test()
	public void firtest() {
		System.out.println("My Second Test");
	}
	
}
