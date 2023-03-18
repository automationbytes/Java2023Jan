package StepDefn;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

public class AppHooks {

	private WebDriver driver;
	private DriverFactory driverFactory;
	public static Properties prop;
	public static ConfigReader creader;
	
	@Before()
	public void getBrowser() {
		creader = new ConfigReader();
		driverFactory = new DriverFactory();
		
		driver = driverFactory.init_Driver(creader.getConfigProperty("browser"));
	}
	
//	@After(order  = 0)
//	public void cleanup() {
////		driver.close();
////		driver.quit();
//	}
	
	 @After(order = 1)
	    public void tearDown(Scenario scenario){
	        if (scenario.isFailed()){
	            String screenshotName = scenario.getName().replaceAll(" ","_");
	            byte[] sourcePath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(sourcePath,"image/png",screenshotName);
	        }
	    }
	
	
	
}
