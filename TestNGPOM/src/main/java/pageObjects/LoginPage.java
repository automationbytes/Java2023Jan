package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTestClass;

public class LoginPage extends BaseTestClass{

	@FindBy(xpath = "//input[@name=\"user-name\"]")
	WebElement username_webedit;
	
	By username_editbox = By.xpath("//input[@name=\"user-name\"]");
	By password_editbox = By.xpath("//input[@name=\"password\"]");
	By signin_button = By.xpath("//input[@name=\"login-button\"]");
	
	public LoginPage(WebDriver driver) {
		BaseTestClass.driver = driver; //by method
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUsername(String user) {
		username_webedit.sendKeys(user);
	}
	
	public void enterpassword(String password) {
		driver.findElement(password_editbox).sendKeys(password);
	}
	
	
	public void clickLogin() {
		driver.findElement(signin_button).click();
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
}
