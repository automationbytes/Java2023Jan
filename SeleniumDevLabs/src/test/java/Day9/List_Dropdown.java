package Day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_Dropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Ban");
		
		List<WebElement> source = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]/li"));
		//Thread.sleep(2000);
		for(WebElement s : source)
		{
			System.out.println(s.getText());
			if(s.getText().equals("Bangalore Airport, Bangalore")) {
				s.click();
				break;	
			}
			
		}
			
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Kol");
		
		List<WebElement> destination = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]/li"));
		//Thread.sleep(2000);
		for(WebElement s : destination)
		{
			System.out.println(s.getText());
			if(s.getText().contains("Airport")) {
				s.click();
				break;	
			}
			
		}
		
		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		
		for(int i =0; i<12;i++) {
			String monthTitle = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			System.out.println(monthTitle);
			
			if(monthTitle.equals("May 2023")) {
				
				List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]//td"));
				for(WebElement d: dates) {
					System.out.println(d.getText());
					if(d.getText().equals("24")) {
						d.click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.xpath("//td[@class=\"next\"]/button")).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
