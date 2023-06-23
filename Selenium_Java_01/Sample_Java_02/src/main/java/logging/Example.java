package logging;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case Google is classname
	         Logger logger=Logger.getLogger(Example.class.getName());
	        

	       // configure log4j properties file
	       PropertyConfigurator.configure("log4j.properties");


	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			WebDriver driver=new ChromeDriver(chromeOptions);
	        logger.info("Browser Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        logger.info("Implicit wait given");
	      

	        // Load application
	        driver.get("https://www.google.co.in/");
	        logger.info("Url opened");
	      

	        // type Selenium
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        logger.info("keyword type");   
	}

}
