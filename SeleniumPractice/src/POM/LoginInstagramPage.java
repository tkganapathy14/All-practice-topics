package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInstagramPage {

	public LoginInstagramPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	private WebElement uname;
	public WebElement getElement()
	{
		return uname;		
	}
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement pword;
	public WebElement getElement1() {
		return pword;	
	}
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginbutton;
	public WebElement getElement2() {
		return loginbutton;
		
	}

}
