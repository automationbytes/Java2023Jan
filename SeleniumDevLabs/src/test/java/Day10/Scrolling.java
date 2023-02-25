package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	static WebDriver driver;
	static void jsclick(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",we);
		
	}
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	//	driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(10000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		Thread.sleep(10000);
		
		js.executeScript("window.scrollBy(500,1000)");
		
		
Thread.sleep(10000);
		
		js.executeScript("window.scrollBy(500,1000)");
		
		
		Thread.sleep(10000);
				
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("sendLinkButton")));
				
				
		jsclick(driver.findElement(By.id("sendLinkButton")));
		
	}

}
