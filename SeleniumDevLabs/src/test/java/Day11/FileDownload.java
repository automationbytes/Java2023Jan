package Day11;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
String path = System.getProperty("user.dir")+"\\src\\test\\java\\Day11";
		HashMap<String, Object> pref = new HashMap();
		pref.put("profile.default_content_settings_popups",0);
		pref.put("download.default_directory", path);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", pref);

		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/file.xhtml;jsessionid=node01vdaxgmsabhsgkr265bhpgvw5126102.node0");
		driver.findElement(By.xpath("//span[text()='Download']")).click();

	}
}
