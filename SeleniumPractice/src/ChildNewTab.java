import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentid = driver.getWindowHandle();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("newTabBtn")));
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(parentid))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("alertBox")).click();
				Thread.sleep(3000);
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
		}
	}

}
