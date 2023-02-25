package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
//	
	Actions action = new Actions(driver);
	action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
	action.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']")));
	action.click(driver.findElement(By.xpath("//span[text()='Copy']")));
	action.build().perform();
	
	driver.switchTo().alert().accept();
	
	action.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")));
	action.build().perform();
	

}
}
