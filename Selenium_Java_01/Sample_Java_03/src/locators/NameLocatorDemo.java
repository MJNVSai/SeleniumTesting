package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Raghu");
		driver.findElement(By.id("lastName")).sendKeys("Ravi Teja");
		driver.findElement(By.id("username")).sendKeys("raju5465RT");
		driver.findElement(By.name("Passwd")).sendKeys("vrsec12345");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("vrsec12345");
		driver.findElement(By.xpath("//button/span[text()='Next']")).click();

	}

}
