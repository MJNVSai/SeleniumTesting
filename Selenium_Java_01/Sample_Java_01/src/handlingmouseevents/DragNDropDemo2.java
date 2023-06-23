package handlingmouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDropDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		// Open webpage
		driver.get("https://jqueryui.com/draggable/");
		 
		driver.switchTo().frame(0);
				
				// Add 5 seconds wait
				Thread.sleep(5000);
		 
				// Create object of actions class
				Actions act=new Actions(driver);
		 
				// find element which we need to drag
				WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
				
				// calling the method and x,y cordinates are random
				act.dragAndDropBy(drag, 250, 150).build().perform();
		driver.quit();
		 
		

	}

}
