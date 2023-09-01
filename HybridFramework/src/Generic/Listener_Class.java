package Generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Class implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	System.out.println("TC started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC Success");;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC Fail");;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC Skipped");;
	}

}
