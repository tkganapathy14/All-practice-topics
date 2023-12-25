package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void crossbrowser(String Browsername)
	{
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		}
		else
		{
			System.setProperty("webdriver.edge.driver","./selenium app/msedgedriver.exe");
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");	
		}
		driver.quit();
	}
}
