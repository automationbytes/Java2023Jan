package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseTestClass;
import pageObjects.LoginPage;

public class LaunchURL extends BaseTestClass{
	public LoginPage lp;
	
	
	
	@Test
	public void urlTest() {
	
		initializeBrowser();
		lp = new LoginPage(driver);
		
		Assert.assertEquals(lp.pageTitle(), "Swag Labs");
		
		lp.enterUsername("standard_user");
		lp.enterpassword("secret_sauce");
		lp.clickLogin();
	}
}
