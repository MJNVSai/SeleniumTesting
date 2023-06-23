package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlert {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/oprs-web/");
		 driver.findElement(By.xpath("(//button)[2]")).click();

	        // Switch to alert window and capture the text and print

	        System.out.println(driver.switchTo().alert().getText());

	        // Pause testcase for 5 second

	          Thread.sleep(5000);

	        // click on ok button

	        driver.switchTo().alert().accept();

	        // Close browser

	        driver.quit();

	}

}
