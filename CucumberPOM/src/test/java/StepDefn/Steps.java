package StepDefn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.LogoutPage;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

public class Steps {
	
	private ConfigReader creader = new ConfigReader();
	private LoginPage lpage = new LoginPage(DriverFactory.getDriver());
	private LogoutPage  loutpage= new LogoutPage(DriverFactory.getDriver());
	
	@Given("the user lauches the NOPAdmin url")
	public void the_user_lauches_the_nop_admin_url() {
	 
		DriverFactory.getDriver().get(creader.getConfigProperty("url"));
	}
	@Then("the user verifies the logo")
	public void the_user_verifies_the_logo() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(DriverFactory.getDriver().getTitle().equals("Your store. Login"));
	}
	@When("the user enters the username and password")
	public void the_user_enters_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	 lpage.EnterUserName(creader.getConfigProperty("username"));
	 lpage.EnterPassword(creader.getConfigProperty("password"));
	 
	}
	@When("the user clicks on signin button")
	public void the_user_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    lpage.clickLogin();
	}
	@Then("the user verifies the homepage")
	public void the_user_verifies_the_homepage() {
	  Assert.assertTrue(loutpage.verifylogo());
	}

	@Then("the user clicks on the logout button")
	public void the_user_clicks_on_the_logout_button() {
		loutpage.clickLogout();
	}


}
