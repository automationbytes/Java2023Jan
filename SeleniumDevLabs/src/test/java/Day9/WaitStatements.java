package Day9;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitStatements {
	public static void main(String[] args) {
/*
 * implicit wait - 
 * explicit wait
 * Fluent wait
 * 
 * Thread.wait - hardwait
 * 
 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Mle']")));
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//	
	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Male']")));
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
	}
}
