package browserinitationwithwdm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeInitation 
{

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://vrsiddhartha.ac.in");
		driver.manage().window().maximize();

	}

}
