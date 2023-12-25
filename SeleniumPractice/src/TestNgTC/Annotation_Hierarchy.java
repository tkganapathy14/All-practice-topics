package TestNgTC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Hierarchy {
	@Test
	public void Test() {
		System.out.println("i am Test");
	}
	@Test
	public void Test1() {
		System.out.println("i am Test1");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i am beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("i am afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("i am beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("i am afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("i am beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("i am afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("i am beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("i am afterSuite");
	}

}
