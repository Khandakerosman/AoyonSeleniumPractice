package appleBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@BeforeMethod
	public void innitTest() {
		openApplication();	
	}
	
	
	@Test
	private void signInTest() {
		driver.findElement(By.linkText("Sign In")).click();
		String actualTitle="Sign In - Macy's";
		String expectedTitle=driver.getTitle();
		System.out.println(" Developers Title:" +expectedTitle);
		Assert.assertEquals(expectedTitle, actualTitle, "Reasons for failing>>>");

	}
	@Test
	private void validloginTest() {
		driver.findElement(By.id("email")).sendKeys("Adhsjda@gmail.com");
		driver.findElement(By.id("pw-input")).sendKeys("dsfjH6a");
		driver.findElement(By.id("sign-in")).click();
	}
	
	
	void tearDown () {
		closeApplication();
			
	}
}
