package Day10;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screensht {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir");
		FileUtils.copyFile(Screenshot, new File(path+"//screenshot//snapdeal.jpg"));
		
	}

}
