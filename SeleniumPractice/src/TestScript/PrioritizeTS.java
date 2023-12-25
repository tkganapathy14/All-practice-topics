package TestScript;

import org.testng.annotations.Test;

public class PrioritizeTS {

	@Test(priority = -1)
	public void login()
	{
		System.out.println("this is login page");
	}
	@Test(priority = 2)
	public void home()
	{
		System.out.println("this is Home page");
	}
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("this is logout page");
	}
	
}
