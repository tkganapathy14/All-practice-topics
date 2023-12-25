package TestNgTC;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class Skipped_TC {

	@Test(priority = 1)
	public void startcar()
	{
		System.out.println("Start the car");
	}
	@Test(priority = 2)
	public void PutFirstGear()
	{
		System.out.println("First Gear");
	}
	@Test(priority = 3,enabled = false)
	public void PutsecondGear()
	{
		System.out.println("second Gear");
	}
	@Test(priority = 4)
	public void PutThirdGear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority = 5,enabled = true)
	public void MusicOn()
	{
		System.out.println("Music On");
	}
}
