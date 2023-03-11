package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {

	public static WebDriver driver;
	public static Properties prop;
	String browserName;
	String url;
	String timeouts;
	
	public BaseTestClass() {
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("src/test/resources/config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initializeBrowser() {
		browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		timeouts = prop.getProperty("timeouts");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		

		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Please provide the supported browser : chrome, firefox and edge");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(timeouts)));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeouts)));
		driver.get(url);
		
	}
	
	
}
