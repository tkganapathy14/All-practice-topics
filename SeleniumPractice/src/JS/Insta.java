package JS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement uname = driver.findElement(By.name("username"));
		WebElement pword = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

		js.executeScript("arguments[0].value='7207792375'",uname);
		js.executeScript("arguments[0].value='Ganapathy@97'",pword);
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		js.executeScript("arguments[0].click()",login);
	//	System.out.println(js.executeScript("return document.Title"));
		System.out.println(js.executeScript("return window.location.href"));

		js.executeScript("history.go()");
	}

}
