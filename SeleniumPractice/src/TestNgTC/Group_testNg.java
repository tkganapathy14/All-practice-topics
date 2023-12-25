package TestNgTC;

import org.testng.annotations.Test;

public class Group_testNg {

	//i want print apple and samsung moble
	@Test(groups = "Apple")
	public void apple() {
		System.out.println("this is apple phone");
	}
	@Test(groups = "Moto")
	public void moto() {
		System.out.println("this is moto phone");
	}
	@Test(groups = "Oppo")
	public void Oppo() {
		System.out.println("this is Oppo phone");
	}
	@Test(groups = "Samsung")
	public void Samsung() {
		System.out.println("this is Samsung phone");
	}
}
