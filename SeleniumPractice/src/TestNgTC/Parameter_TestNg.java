package TestNgTC;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_TestNg {

	@Test
	@Parameters("Name")
	public void parameter(String name)
	{
		System.out.println("this is my name : "+name);
	}
}
