package TestScript;

import org.testng.annotations.Test;

public class Ignore_disableTC {

	@Test(enabled = false)
	public void login()
	{
		System.out.println("this is login page");
	}
	@Test
	public void home()
	{
		System.out.println("this is Home page");
	}
	@Test(enabled = true)
	public void logout()
	{
		System.out.println("this is logout page");
	}
	
}
