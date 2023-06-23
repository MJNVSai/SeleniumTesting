package locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassLocatorDemo 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rizwan");
		driver.findElement(By.id("LastName")).sendKeys("Mohamad");
		driver.findElement(By.id("Email")).sendKeys("208w1a1292@vrsec.ac.in");
		driver.findElement(By.id("Password")).sendKeys("208w1a1299");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("208w1a1299");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.className("register-continue-button")).click();
		String actual_message = driver.findElement(By.className("topic-html-content-header")).getText();
		String expected_message = "Welcome to our store";
		
		Assert.assertEquals(actual_message, expected_message);
		System.out.println("Test Case is Passed");
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/pic1.png");
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
		

	}

}
