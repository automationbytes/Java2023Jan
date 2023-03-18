package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By username = By.id("Email");
	private By password = By.id("Password");
	private By login = By.xpath("//button[text()='Log in']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void EnterUserName(String user) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
	}
	
	public void EnterPassword(String passwrd) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void clickLogin() {
		
		driver.findElement(login).click();
	}
}
