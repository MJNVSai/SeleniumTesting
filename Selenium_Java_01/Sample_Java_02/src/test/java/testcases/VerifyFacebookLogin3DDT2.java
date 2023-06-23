package testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import library.BrowserFactory;

import pages.LoginPage3;

public class VerifyFacebookLogin3DDT2 {
	
	@Test(dataProvider ="Authentication")
	public void verifyValidLogin(String sUsername, String sPassword)
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\Report\\sample.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		
		ExtentTest test = extent.createTest("MyFirstTest");
		
		WebDriver driver=BrowserFactory.startBrowser("edge","https://www.facebook.com/login.php/");
		
		LoginPage3 login=PageFactory.initElements(driver,LoginPage3.class);
		
		login.loginToFacebook(sUsername,sPassword);
		
		Assert.assertTrue(true);
		test.log(Status.PASS, "pass");
		
		extent.flush();
		driver.quit();
	}

	@DataProvider(name = "Authentication")

	  public static Object[][] credentials() {

	        // The number of times data is repeated, test will be executed the same no. of times

	        // Here it will execute two times

	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};

	  }

}
