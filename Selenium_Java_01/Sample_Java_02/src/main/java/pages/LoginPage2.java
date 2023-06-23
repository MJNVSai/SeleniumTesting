package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {

	
		WebDriver driver;
 
 
 
		By username=By.xpath("//input[@name='email']");
		By password=By.xpath("//input[@name='pass']");
		By loginButton=By.xpath("//button[@name='login']");
 
 
		public LoginPage2(WebDriver driver)
		{
			this.driver=driver;
		}
 
 
		public void loginToFacebook(String userid,String pass)
		{
 
			driver.findElement(username).sendKeys(userid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(loginButton).click();
 
		}
 
 
		public void typeUserName(String uid)
		{
 
			driver.findElement(username).sendKeys(uid);
		}
 
		public void typePassword(String pass)
		{
 
			driver.findElement(password).sendKeys(pass);
		}
 
		public void clickOnLoginButton()
		{
			driver.findElement(loginButton).click();
		}

	}

