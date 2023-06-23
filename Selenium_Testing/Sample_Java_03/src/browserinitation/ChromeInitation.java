package browserinitation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeInitation 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHREEE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.vrsiddhartha.ac.in");
		driver.manage().window().maximize();
	}

}
