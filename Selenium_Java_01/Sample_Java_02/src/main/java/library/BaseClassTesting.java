package library;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseClassTesting extends BaseClass{

	@Test(description = "Valid Login Scenario",priority = 1)
	public void validLogin() throws Exception
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
	}
	@Test(description = "Invalid Login Scenario", priority = 2)
	public void InvalidLogin()
	{
		driver.findElement(By.name("username")).sendKeys("admin1");
		
		driver.findElement(By.name("password")).sendKeys("admin2");
		
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
}
