package handlingdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowndemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		 
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        
        WebElement month_dropdown = driver.findElement(By.xpath("//select[@id='month']"));
        
        
        Thread.sleep(3000);
        
        Select month= new Select(month_dropdown);
        
        List<WebElement> months=month.getOptions();
        
        for(WebElement m:months)
        {
        	String birth_month=m.getText();
        	System.out.println(birth_month);
        	if(birth_month.equals("Apr"))
        		break;
        }

        driver.quit();
	}

}
