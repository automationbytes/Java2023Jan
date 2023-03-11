package com.ui.listeners;

import java.util.Arrays;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentListeners implements ITestListener{

	static Date d = new Date();
	static String fileName = "extent.html";
	
	private static ExtentReports extent = ExtentManager.createInstance(fileName);
	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	public static boolean overAllFailure;
	
	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));

		String testName = "TestCase : ";
		if(result.getParameters().length > 0) {
			testName = testName + result.getParameters()[0];
		}
		else {
			testName = testName + result.getMethod().getMethodName();
		}
		
		
		ExtentTest test = extent.createTest(testName);
		testReport.set(test);
		overAllFailure = false;
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));

		String methodName = result.getMethod().getMethodName();
		Markup m;
		
		if(overAllFailure) {
			String logText = "Test Case: - "+methodName.toUpperCase() + "Failed";
			m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			testReport.get().fail(m);
		}
		else {
			String logText = "Test Case: - "+methodName.toUpperCase() + "Passed";
			m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			testReport.get().pass(m);
		}
	}
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");

		String exceptionMsg = Arrays.toString(result.getThrowable().getStackTrace());
		
		ExtentManager.captureScreenshot();
		
		overAllFailure = true;
	}
	
	
	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		if(extent != null) {
			extent.flush();
		}
	}
}
