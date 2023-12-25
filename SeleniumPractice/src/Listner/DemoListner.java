package Listner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Itest.class)
public class DemoListner {
@Test
public void Testcase()
{
	System.out.println("this is a test case");
}
}
