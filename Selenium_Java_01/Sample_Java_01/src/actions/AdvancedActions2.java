package actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActions2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		 
			//driver.get("https://www.google.com");
			driver.get("https://demoqa.com/droppable/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Actions act=new Actions(driver);
			WebElement from = driver.findElement(By.id("draggable"));
			 
			WebElement to = driver.findElement(By.id("droppable"));	
			
			//Perform drag and drop
			act.dragAndDrop(from, to).perform();
			
			//verify text changed in to 'Drop here' box 
			String textTo = to.getText();

			if(textTo.equals("Dropped!")) {
				System.out.println("PASS: Source is dropped to target as expected");
			}else {
				System.out.println("FAIL: Source couldn't be dropped to target as expected");
			}
		
			driver.quit();
			//act.contextClick(driver.findElement(By.linkText("తెలుగు"))).perform();
			//act.contextClick(driver.findElement(By.linkText("తెలుగు"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			//act.doubleClick(driver.findElement(By.linkText("తెలుగు"))).perform();
			

}
}
