package TestNgTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample_Tc {
	//Suite--->suite is a collection of test case
	//aim-open chrome and go to
	//1.google.co.in,	2.bing.com	3.yahoo.com and then close browser
	WebDriver driver;
	long endtime;
	long startTime;
	@BeforeSuite
	public void launchbrowser()
	{
		 startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	//@Test
	public void opengoogle() 	{
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime-startTime;
		System.out.println(totaltime);
	}
	//@Test
	public void openBing() throws InterruptedException
	{
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime-startTime;
		System.out.println(totaltime);
	}
	//@Test
	public void openyahoo() throws InterruptedException
	{
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime-startTime;
		System.out.println(totaltime);
	}
	
	@Test
	public void opengoogle1()
	{
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void openBing1()
	{
		driver.get("https://www.bing.com/");	
	}
	@Test
	public void openyahoo1()
	{
		driver.get("https://www.yahoo.com/");
	}
	
	@AfterSuite
	public void closebrowser()
	{
		endtime = System.currentTimeMillis();
		long totaltime = endtime-startTime;
		System.out.println("total time taken for browser : "+totaltime);
		driver.quit();
	}
	
}
