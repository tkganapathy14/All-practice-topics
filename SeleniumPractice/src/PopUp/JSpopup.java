package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		//promt popup
		driver.findElement(By.id("prompt")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("ganapathy");
		Thread.sleep(4000);
		alert.accept();
		//Alert popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(3000);
		alert.accept();
		//confirmation popup
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		alert.dismiss();
		driver.quit();
	}

}
