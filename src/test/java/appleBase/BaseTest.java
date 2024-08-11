package appleBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseTest {

	WebDriver driver;
	
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
	}
	
	
	
	
	public void closeApplication() {
		if(driver !=null) {
			driver.quit();
		}
		
	}

}
