package autoIT;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CSSLocators {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Vamsi");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Vamsi");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("vamsi1903@yopmail.com");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.cssSelector("input[value='Male']")));
		
		driver.findElement(By.cssSelector("input#userNumber")).sendKeys("9121795499");
		driver.findElement(By.cssSelector("input#dateOfBirthInput")).click();
		new Select(driver.findElement(By.xpath("//select[contains(@class,'month-select')]"))).selectByVisibleText("April");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//select[contains(@class,'year-select')]"))).selectByVisibleText("1998");
		Thread.sleep(3000);
	
		List<WebElement> l= driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']/div"));
		for(WebElement e:l)
		{
			System.out.println(e.getText());
			if(e.getText().equals("3"))
			{
				e.click();
				break;
			}
		}
	
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#subjectsInput")).sendKeys("Selenium");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.cssSelector("input#hobbies-checkbox-2")));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[text()='Select picture']")));
		//driver.findElement(By.xpath("//label[text()='Select picture']")).click();
		Thread.sleep(2000);
		/*
		 Robot rb = new Robot();
		 
		    // copying File path to Clipboard
		    StringSelection str = new StringSelection("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Java_01\\Sample_Java_01\\Screenshots\\1.png");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		    */
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\SampleAutoITScript2.exe");
		    
		    driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Vijayawada");
		    Thread.sleep(3000);
		    Actions act=new Actions(driver);
		    act.sendKeys(Keys.TAB);
		    Thread.sleep(3000);
		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[text()='Select State']")));
		    
		    act.sendKeys(Keys.ARROW_DOWN);
		    act.sendKeys(Keys.ENTER);
		    
		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[text()='Select City']")));
		    act.sendKeys(Keys.ARROW_DOWN);
		    act.sendKeys(Keys.ENTER);
		    //driver.findElement(By.xpath("//div[text()='Select State']")).click();
		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.cssSelector("button#submit")));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.cssSelector("button#closeLargeModal")));
		    
		    
	}

}
