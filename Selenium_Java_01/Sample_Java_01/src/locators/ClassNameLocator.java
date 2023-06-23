package locators;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ClassNameLocator {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		/*
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("Random First Name");
		driver.findElement(By.id("lastName")).sendKeys("Random Last Name");
		driver.findElement(By.id("username")).sendKeys("Samplemail090912121");
		driver.findElement(By.name("Passwd")).sendKeys("VRSEC@5544");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("VRSEC@5544");
		
		driver.findElement(By.id("selectioni1")).click();
	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("phoneNumberId")).isDisplayed());
		System.out.println(driver.findElement(By.id("phoneNumberId")).isEnabled());
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("9121795499");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		*/
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]")).sendKeys("Randon First Name");
		driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]")).sendKeys("Randon Last Name");
		driver.findElement(By.id("Email")).sendKeys("random1811@yopmail.com");
		driver.findElement(By.id("Password")).sendKeys("VRSEC@5544");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("VRSEC@5544");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("(//input)[5]")).click();
		String actual=driver.findElement(By.className("topic-html-content-header")).getText();
		System.out.println(actual);
		String expected="Welcome to our store";
		Assert.assertEquals(actual, expected);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./Screenshots/1.png");
        FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("Registration Done Successfully");
		driver.quit();
		
		
	}


}
