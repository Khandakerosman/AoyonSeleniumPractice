package appleLinksTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppleLinks {
	WebDriver driver;
	
	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
	}
	@Test
	public void storeLinkTest() {
		driver.findElement(By.linkText("Find a Store")).click();
		
		String actualTitle="Apple Store - Find a Store - Apple";
		String expectedTitle=driver.getTitle(); //what developer built
		System.out.println(" Developers Title:" +expectedTitle);
		
		Assert.assertEquals(expectedTitle, actualTitle, "Reasons for failing>>>");
	
	}
	@Test
	public void iphoneLinkTest() {
		driver.findElement(By.linkText("iPhone")).click();
	String actualTitle="iPhone - Apple";
	String expectedTitle=driver.getTitle();		
	System.out.println(" Developers title is: "+expectedTitle);
	Assert.assertEquals(expectedTitle, actualTitle, "It's failing because--> ");
		
	}
	
	
	
	public void closeApplication() {
		//driver.quit();
	}	
	
}