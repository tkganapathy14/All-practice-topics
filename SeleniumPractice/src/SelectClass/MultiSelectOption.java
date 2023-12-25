package SelectClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tkgan\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement Multiselect = driver.findElement(By.id("multiselect1"));
		Select select=new Select(Multiselect);
		select.selectByVisibleText("Volvo");
		select.selectByIndex(1);
		select.selectByValue("Hyundaix");
		//select.selectByIndex(3);
		Thread.sleep(3000);
		System.out.println("first selected option is : "+select.getFirstSelectedOption().getText());
		List<WebElement> options = select.getOptions();
		System.out.println("All option list");
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		List<WebElement> selopt = select.getAllSelectedOptions();
		System.out.println("selected option in list");
		for(WebElement opt:selopt)
		{
			System.out.println(opt.getText());
		}
		select.deselectByIndex(2);
		select.deselectByValue("volvox");
		//select.deselectByVisibleText("Audi");
		select.deselectAll();
		Thread.sleep(3000);
		driver.quit();
	}

}
