package com.linkedin.qa.util;

import com.linkedin.qa.base.TestBase;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends TestBase implements ITestListener {
        @Override
        public void onTestFailure(ITestResult result) {
            System.out.println("FAILED Test");
            takeScreenshotAtEndOfTest(result.getMethod().getMethodName());
        }
}
