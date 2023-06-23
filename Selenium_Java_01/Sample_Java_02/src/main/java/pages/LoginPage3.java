package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage3 {

	
		WebDriver driver;
 
 
		@FindBy(how=How.XPATH,using ="//input[@name='email']" )
		@CacheLookup
		WebElement username;

		@FindBy(how=How.XPATH, using = "//input[@name='pass']")
		@CacheLookup
		WebElement password;
		
		@FindBy(how=How.XPATH, using="//button[@name='login']")
		@CacheLookup
		WebElement loginButton;
		
 
 
		public LoginPage3(WebDriver driver)		
		{
			this.driver=driver;
		}
 
 
		public void loginToFacebook(String userid,String pass)
		{
 
			username.sendKeys(userid);
			password.sendKeys(pass);
			loginButton.click();
 
		}
 
 
		public void typeUserName(String uid)
		{
 
			username.sendKeys(uid);
		}
 
		public void typePassword(String pass)
		{
 
			password.sendKeys(pass);
		}
 
		public void clickOnLoginButton()
		{
			loginButton.click();
		}

	}

