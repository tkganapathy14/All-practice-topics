package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> Allid = driver.getWindowHandles();
		for(String handle:Allid)
		{
			if(! handle.equals(parentid))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				System.out.println(driver.getCurrentUrl());
			
			}
		}
	}
}
