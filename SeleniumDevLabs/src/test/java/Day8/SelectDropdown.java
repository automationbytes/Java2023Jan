package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	public static void main(String[] args) {

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FOrder%2FList");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
	//	WebElement billingcountry = driver.findElement(By.cssSelector("select[name=\"BillingCountryId\"]"));
		Select dropbc = new Select(driver.findElement(By.xpath("//select[@name=\"BillingCountryId\"]")));
		//dropbc.selectByVisibleText("India");
		//dropbc.selectByValue("90");
		
		dropbc.selectByIndex(10);
		
		
		
		
	
		
	}
}
