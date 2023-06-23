package radiobuttonandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		 
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

       WebElement showpassword_radio_button=driver.findElement(By.xpath("//div[starts-with(@id,'selection')]//preceding::input[1]"));

       boolean status=showpassword_radio_button.isDisplayed();

       System.out.println("Male radio button is Displayed >>"+status);

        boolean enabled_status=showpassword_radio_button.isEnabled();

        System.out.println("Male radio button is Enabled >>"+enabled_status);

      boolean selected_status=showpassword_radio_button.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status);

        showpassword_radio_button.click();

      boolean selected_status_new=showpassword_radio_button.isSelected();

        System.out.println("Male radio button is Selected >>"+selected_status_new);
        
        driver.quit();
	}

}
