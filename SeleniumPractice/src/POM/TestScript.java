package POM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		
		LoginInstagramPage login=new LoginInstagramPage(driver);
		login.getElement().sendKeys("7207792375");
		login.getElement1().sendKeys("Ganapathy@97");
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new  File("./Screenshot/insta.png");
	//	FileUtils.copyFile(src, des);
		org.openqa.selenium.io.FileHandler.copy(src, des);
		login.getElement2().click();
		//	driver.quit();
	}

}
