package com.Automation.TestNGDemo;

import org.testng.annotations.Test;

public class Priority_Eg {

	@Test
	public void first() {
		System.out.println("First");
	}
	@Test(priority = -1)
	public void second() {
		System.out.println("Second");
	}
	@Test(priority = 1)
	public void third() {
		System.out.println("Third");
	}
	
	@Test(invocationCount = 6)
	public void fourth() {
		System.out.println("Fourth");
	}
	
	@Test(timeOut = 5000)
	public void fifth() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Fifth");
	}
	@Test
	public void sixth() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Sixth");
	}
	
	
	
}
