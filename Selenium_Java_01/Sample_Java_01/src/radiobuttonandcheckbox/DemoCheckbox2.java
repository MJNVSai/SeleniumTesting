package radiobuttonandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCheckbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		 
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/login");

       WebElement rememberme_checkBox=driver.findElement(By.xpath("//input[@id='RememberMe']"));

       boolean status=rememberme_checkBox.isDisplayed();

       System.out.println("Male radio button is Displayed >>"+status);

        boolean enabled_status=rememberme_checkBox.isEnabled();

        System.out.println("Male radio button is Enabled >>"+enabled_status);

      boolean selected_status=rememberme_checkBox.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status);

        rememberme_checkBox.click();

      boolean selected_status_new=rememberme_checkBox.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status_new);
        
        driver.quit();
	}

}
