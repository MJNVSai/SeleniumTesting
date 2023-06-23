package testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import library.BrowserFactory;

import pages.LoginPage3;

public class VerifyFacebookLogin3 {
	
	@Test
	public void verifyValidLogin()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\Report\\sample.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		
		ExtentTest test = extent.createTest("MyFirstTest");
		
		WebDriver driver=BrowserFactory.startBrowser("firefox","https://www.facebook.com/login.php/");
		
		LoginPage3 login=PageFactory.initElements(driver,LoginPage3.class);
		
		login.loginToFacebook("vamsi", "vamsi");
		
		Assert.assertTrue(true);
		test.log(Status.PASS, "pass");
		
		extent.flush();
		driver.quit();
	}



}
