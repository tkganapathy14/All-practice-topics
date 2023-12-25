package TestNgTC;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_testNg implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is onTestSuccess");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is onTestFailure");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is onTestSkipped");		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test case is onStart");	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test case is onFinish");
	}
	

}
