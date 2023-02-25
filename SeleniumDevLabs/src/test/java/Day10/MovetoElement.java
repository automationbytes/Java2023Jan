package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.timeanddate.com/weather/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Weather' and @class='site-nav__title']")));
		action.moveToElement(driver.findElement(By.xpath("//a[text()='2-Week Forecast' and @class='site-nav__link']")));
		
		action.click(driver.findElement(By.xpath("//a[text()='2-Week Forecast' and @class='site-nav__link']")));
		action.build().perform();

		action.moveToElement(driver.findElement(By.xpath("//li[@class='nav-2__item']/a[text()='Sun & Moon ']")));
		action.moveToElement(driver.findElement(By.xpath("//li[@class='nav-2__submenu-item']/a[text()='Moon Phases ']")));
		
		action.click(driver.findElement(By.xpath("//li[@class='nav-2__submenu-item']/a[text()='Moon Phases ']")));
		action.build().perform();

		
	}
}
