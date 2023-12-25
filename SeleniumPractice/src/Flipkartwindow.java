import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		String parentid = driver.getWindowHandle();
		System.out.println("parent id : "+parentid);
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		allid.remove(parentid);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("APPLE iPhone 14 - The Big Billion Day"))
			{
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
								
			}
		}
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		
	}

}
