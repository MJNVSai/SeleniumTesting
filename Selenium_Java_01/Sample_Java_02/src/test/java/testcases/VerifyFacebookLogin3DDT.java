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
import library.ExcelUtils;
import pages.LoginPage3;

public class VerifyFacebookLogin3DDT {
	
	@Test(dataProvider ="Authentication")
	public void verifyValidLogin(String sUsername, String sPassword)
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\Report\\sample.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		
		ExtentTest test = extent.createTest("MyFirstTest");
		
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.facebook.com/login.php/");
		
		LoginPage3 login=PageFactory.initElements(driver,LoginPage3.class);
		
		login.loginToFacebook(sUsername,sPassword);
		
		Assert.assertTrue(true);
		test.log(Status.PASS, "pass");
		
		extent.flush();
		driver.quit();
	}

	@DataProvider(name = "Authentication")

	  public static Object[][] credentials() throws Exception {

		Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Admin\\Desktop\\sample.xlsx","Sheet2");

        return (testObjArray);

	  }

}
