package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest6 {
  @Test(priority = -100)
  public void Ctestcase1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google","Google");
		System.out.println("Test Case Has ben Passed");
		driver.quit();
  }
  @Test(priority=100)
  public void Btestcase2() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Facebook – log in or sign up","Facebook – log in or sign up");
		System.out.println("Test Case Has ben Passed");
		driver.quit();
  }
  @Test(priority = 50,timeOut = 10000)
  public void Atestcase3() throws Exception {
	  Thread.sleep(500);
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("YouTube","YouTube");
		System.out.println("Test Case Has ben Passed");
		driver.quit();
  }
}
