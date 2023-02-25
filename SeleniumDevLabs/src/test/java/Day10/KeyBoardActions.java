package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.name("q")).sendKeys("Devlabs");
	//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	Actions act = new Actions(driver);
	act.keyDown(Keys.ENTER);
	act.keyUp(driver.findElement(By.name("q")), Keys.ENTER);
	act.build().perform();
	
}

}
