package TestNgTC;

import org.testng.annotations.Test;


public class Dependencies_TC {

	//problem 1:you have to admit a student to Engineer
	//problem 2:you have to admit a student to Higher education
	@Test(enabled=false)//it will throw error
	public void Tenth()
	{
		System.out.println("tenth class pass");
	}
	@Test(dependsOnMethods ="Tenth" )
	public void Intermediate()
	{
		System.out.println("Intermediate pass");
	}
	@Test(dependsOnMethods ="Intermediate" )
	public void Engineer()
	{
		System.out.println("Engineer College");
	}
}
