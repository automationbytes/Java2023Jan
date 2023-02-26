package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://admin-demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		driver.findElement(By.xpath("(//li[@class=\"nav-item has-treeview\"]//p[contains(text(),\"Catalog\")])[1]")).click();
		
		driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
		
		Select PageSize = new Select(driver.findElement(By.name("products-grid_length")));
		PageSize.selectByVisibleText("100");
		
		Thread.sleep(7000);
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//tr"));
		int rowsize = row.size();
		System.out.println(rowsize);
		
		for(int i = 1; i<rowsize; i++) {
			System.out.println(driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td[3]")).getText());
			if("Apple iCam".equals(driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td[3]")).getText())) {
				driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td[8]//a")).click();
				break;
			}
				
		}
		
		

	}
}
