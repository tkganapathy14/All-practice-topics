import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame("frm3").switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Ganapathy");
		driver.findElement(By.id("englishchbx")).click();
		driver.switchTo().parentFrame().switchTo().frame("frm1");
		
		WebElement dropdown = driver.findElement(By.id("course"));
		Select Frame1=new Select(dropdown);
		Frame1.selectByVisibleText("Javascript");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[text()='Tutorials'])[1]")).click();
		
		
	}

}
