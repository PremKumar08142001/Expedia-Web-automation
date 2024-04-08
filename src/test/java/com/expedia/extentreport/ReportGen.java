package com.expedia.extentreport;

import java.io.IOException;
import java.time.LocalDate;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.expedia.base.TestBase;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.expedia.utilities.TestUtil;

public class ReportGen extends TestBase{
	
	
	public static void reportCreation() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("reports/"+"Expedia"+"_reports.html");
		extent.attachReporter(spark);
	}
	
	public static void finishReportAfterTest(ITestResult itr) throws IOException {
		
		extenttest = extent.createTest(itr.getTestClass().getName()+"-"+itr.getMethod().getMethodName());
				
		if(itr.getStatus() == ITestResult.SUCCESS) {
			extenttest.log(Status.PASS, "Expedia test succeeded");
			extenttest.log(Status.INFO, "check if this success message is displayed in console");
		}else if(itr.getStatus() == ITestResult.FAILURE) {
			extenttest.log(Status.FAIL, "Expedia test failed");
			extenttest.log(Status.INFO, "check Expedia this failed message is displayed in console");
			extenttest.addScreenCaptureFromPath(TestUtil.captureScreenshot(driver,itr.getMethod().getMethodName()));
		}else if(itr.getStatus() == ITestResult.SKIP) {
			extenttest.log(Status.SKIP, "Expedia - one test skipped");
			extenttest.log(Status.INFO, "check if this skipped message is displayed in console");
		}
		
		
	}
	

}
