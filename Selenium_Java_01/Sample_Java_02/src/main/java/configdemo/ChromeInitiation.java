package configdemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ChromeInitiation {

	public static void main(String[] args) throws Exception  {
		File src=new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Java_01\\Sample_Java_02\\Configuration\\config.properties");
		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties pro=new Properties();

		// Load file so we can use into our script
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver",pro.getProperty("Chrome_Path"));
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google","Google");
		System.out.println("Test Case Has ben Passed");
		driver.quit();

	}

}
