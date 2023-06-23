package browserinitiationwebdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class IEInitiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google","Google");
		System.out.println("Test Case Has ben Passed");
		driver.quit();
	    
		
	}

}
