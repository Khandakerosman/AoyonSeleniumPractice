package webDriverCommandd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	
	public class AppleUrlAndTitleTest {
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.apple.com/");

	}

	
	@Test
	public void titleTest() {
		String actualTitle = "Apple";
		String expectedTitle = driver.getTitle();
		System.out.println("Apple title is: " + expectedTitle);

		
		Assert.assertEquals(expectedTitle, actualTitle, "reasons for failing>>>>  ");

	}

	@Test
	public void urlTest() {
		String actualUrl = "https://www.apple.com/";
		String expectedUrl = driver.getCurrentUrl();
		System.out.println(" Apple url is>>>  " + expectedUrl);
		
		Assert.assertEquals(expectedUrl, actualUrl, " reasons for failing >>>");
	}

	
	@AfterTest
	public void closeApp() {
		driver.quit();

	}
}
	
	

