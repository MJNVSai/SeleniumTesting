package pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegistrationPage {

	
		WebDriver driver;
 
 
		@FindBy(how=How.XPATH,using ="//input[@name='firstname']" )
		@CacheLookup
		WebElement firstname;

		@FindBy(how=How.XPATH, using = "//input[@name='lastname']")
		@CacheLookup
		WebElement lastname;
		
		@FindBy(how=How.XPATH, using = "//input[@name='reg_email__']")
		@CacheLookup
		WebElement regemail;
		
		@FindBy(how=How.XPATH, using = "//input[@name='reg_email_confirmation__']")
		@CacheLookup
		WebElement regemail_confirm;
		
		@FindBy(how=How.XPATH, using = "//input[@name='reg_passwd__']")
		@CacheLookup
		WebElement regpass;
		
		@FindBy(how=How.XPATH, using = "//select[@name='birthday_day']")
		@CacheLookup
		WebElement day_dropdown;
		
		@FindBy(how=How.XPATH, using = "//select[@name='birthday_month']")
		@CacheLookup
		WebElement month_dropdown;
		
		@FindBy(how=How.XPATH, using = "//select[@name='birthday_year']")
		@CacheLookup
		WebElement year_dropdown;
		
		@FindBy(how=How.XPATH, using = "//input[@type='radio'][@class='_8esa'][@value='1']")
		@CacheLookup
		WebElement female_radio;
		
		@FindBy(how=How.XPATH, using = "//input[@type='radio'][@class='_8esa'][@value='2']")
		@CacheLookup
		WebElement male_radio;
		
		@FindBy(how=How.XPATH, using = "//input[@type='radio'][@class='_8esa'][@value='-1']")
		@CacheLookup
		WebElement others_radio;
		
		
		@FindBy(how=How.XPATH, using="//button[@name='websubmit']")
		@CacheLookup
		WebElement SignUpButton;
		
 
 
		public RegistrationPage(WebDriver driver)
		{
			this.driver=driver;
		}
 
 
		
		public void regToFacebook(String fname,String lname, String email,String email_cnf, String pass, String day, String month, String year,String gender) throws InterruptedException
		{
 
			firstname.sendKeys(fname);
			lastname.sendKeys(lname);
			regemail.sendKeys(email);
			Thread.sleep(2000);
			regemail_confirm.sendKeys(email_cnf);
			regpass.sendKeys(pass);
			day_dropdown.sendKeys(day);;
			month_dropdown.sendKeys(month);;
			year_dropdown.sendKeys(year);
			if(gender.equalsIgnoreCase("female"))
				female_radio.click();
			else if(gender.equalsIgnoreCase("male"))
				male_radio.click();
			else if(gender.equalsIgnoreCase("others"))
				others_radio.click();
			SignUpButton.click();
			
 
		}
 
 
	}

