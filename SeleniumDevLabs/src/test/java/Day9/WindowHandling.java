package Day9;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.openmultipleurl.com/");
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.google.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.bing.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.yahoo.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.facebook.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("list_urls")).sendKeys("https://www.amazon.com/");
		driver.findElement(By.name("list_urls")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("input[value=\"Go Now\"]")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		for(String a: allWindows) {
			if(!a.equals(parentWindow)) {
				driver.switchTo().window(a);
				System.out.println(driver.getCurrentUrl());
				
				if(driver.getCurrentUrl().contains("bing")) {
					driver.findElement(By.name("q")).sendKeys("Selenium");
					driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
					
				}
				else {
					driver.close();
				}
			}
		}

	}
}
