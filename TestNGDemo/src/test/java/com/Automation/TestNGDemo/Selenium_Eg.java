package com.Automation.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Eg {

	WebDriver driver;
	@BeforeMethod(alwaysRun = true)
	public void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Before Method - Initiating Webdriver");
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("After Method - Closing Webdriver");
	}
	
	@Test(groups = {"searchengine"})
	public void google() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(groups = {"searchengine"})
	public void bing() {
		driver.get("https://www.bing.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(groups = {"ecommerce"})
	public void amazon() {
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(groups = {"ecommerce"})
	public void flipkart() {
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
