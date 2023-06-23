package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage2;

public class VerifyFacebookLogin2 {
	
	@Test
	public void verifyValidLogin()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		 
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/login.php/");
		 
		LoginPage2 login=new LoginPage2(driver);
		 
		login.typeUserName("vamsi");
		login.typePassword("vamsi");
		login.clickOnLoginButton();
		driver.quit();
	}

}
