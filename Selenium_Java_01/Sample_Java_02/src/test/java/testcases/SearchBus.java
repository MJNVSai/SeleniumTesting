package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.WaitSync;

public class SearchBus {
	
	@Test
	public void checkBuses()
	{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://www.redbus.in/");
	 
	WaitSync.isElementPresnt(driver,"//input[@id='src']", 20).sendKeys("Bangalore");
	 
	WaitSync.isElementPresnt(driver,"//input[@id='dest']", 20).sendKeys("Chennai");
	}

}
