package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
private WebDriver driver;
	
	private By logo = By.cssSelector("img[alt=\"logo.png\"]");
	private By Logout = By.linkText("Logout");
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void clickLogout() {
		
		driver.findElement(Logout).click();
	}
	
	public boolean verifylogo() {
		return driver.findElement(logo).isDisplayed();
	}
}
