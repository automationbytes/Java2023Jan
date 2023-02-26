package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	public static void main(String[] args) {

		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/file.xhtml;jsessionid=node01vdaxgmsabhsgkr265bhpgvw5126102.node0");
		String path = System.getProperty("user.dir");
		System.out.println(path+"\\src\\test\\java\\Day11\\Dummy.txt");
		driver.findElement(By.xpath("//span[@class='ui-fileupload-filename']/..//input")).sendKeys(path+"\\src\\test\\java\\Day11\\Dummy.txt");
		
	}
}
