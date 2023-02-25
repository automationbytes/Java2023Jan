package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrapnDrop {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://emicalculator.net/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//span[text()='50L']/parent::span"));
		WebElement drop = driver.findElement(By.xpath("//span[text()='125L']/parent::span"));
		
//		action.dragAndDrop(drag, drop);
//		action.build().perform();
//		
		
		action.clickAndHold(drag);
		action.release(drop);
		action.build().perform();
		
		
		action.scrollToElement(driver.findElement(By.cssSelector("i[class=\"fa fa-print\"]")));
		action.build().perform();
		
		//action.
		
	}
}
