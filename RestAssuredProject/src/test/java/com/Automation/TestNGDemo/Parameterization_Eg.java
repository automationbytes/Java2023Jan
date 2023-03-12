package com.Automation.TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Eg {

	
	@Test
	@Parameters({"x","y"})
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	@Test
	@Parameters({"x","y"})
	public void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	@Test
	@Parameters({"x","y"})
	public void mul(int x, int y) {
		System.out.println(x*y);
	}
	
	@Test
	@Parameters({"x","y"})
	public void div(int x, int y) {
		System.out.println(x/y);
	}
}
