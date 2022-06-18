 package com.vcentry.lab.testBase;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerTest extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test Passed");
		log.info(result.getName()+ " is passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.FAIL, "Test Failed "+result.getThrowable());
		test.addScreenCaptureFromPath(Screenshot());
		log.error(result.getName()+ " is Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, "Test Skipped");
		log.info(result.getName()+ " is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		log.info("******************************Execution Started*************************");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	extent.flush();	
	log.info("******************************Execution End*************************");
	
	}

}
