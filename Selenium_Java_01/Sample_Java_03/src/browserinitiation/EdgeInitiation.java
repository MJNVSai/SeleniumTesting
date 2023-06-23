package browserinitiation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeInitiation {

	public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
			driver.get("https://www.vrsiddhartha.ac.in");
			driver.manage().window().maximize();

	}

}
