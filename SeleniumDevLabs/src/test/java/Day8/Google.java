package Day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.close();
		driver.quit();
		
	}
}
