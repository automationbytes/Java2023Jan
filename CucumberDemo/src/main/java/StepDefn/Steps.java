package StepDefn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Steps {

	WebDriver driver;
	
	@Before
	public void beforescenario() {
		System.out.println("Before");
	}
	
//	@BeforeAll
//	public void beforeAllSce() {
//		System.out.println("Before All");
//	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("Before Step");
	}
	
	@Given("the user navigates to google url")
	public void the_user_navigates_to_google_url() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
	}

	@Then("the user verifies google search page is displayed")
	public void the_user_verifies_google_search_page_is_displayed() {
		Assert.assertEquals("Google", driver.getTitle());
	}

	@When("the user enters {string} in Search bar")
	public void the_user_enters_in_search_bar(String searchtext) {
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(searchtext);
	}

	@When("the user clicks on submit button")
	public void the_user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(Keys.ENTER);
	}

	@Then("the user verifies the google page results")
	public void the_user_verifies_the_google_page_results() {
		System.out.println(driver.getTitle());
			}

}
