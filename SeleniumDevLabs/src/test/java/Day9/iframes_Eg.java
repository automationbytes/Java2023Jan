package Day9;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes_Eg {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().sendKeys("DevLabs");
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	
	
		//parent page
		String parentpage = driver.getWindowHandle();
		System.out.println(parentpage);
		//allwindows
		Set<String> allpages = driver.getWindowHandles();
		System.out.println(allpages);
		//to print current url
		System.out.println(driver.getCurrentUrl());
	
		for(String a : allpages) {
			if(!a.equals(parentpage)) {
				driver.switchTo().window(a);
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		driver.findElement(By.id("search2")).sendKeys("sql");
		driver.findElement(By.id("learntocode_searchbtn")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
