package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyReaddata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		FileInputStream fis=new FileInputStream("./Test data DDT/data.properties");
		Properties properties=new Properties();
		properties.load(fis);
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("uname"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(properties.getProperty("pword"));
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}
