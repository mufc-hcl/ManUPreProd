package org.bdd.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
    private static ThreadLocal<ExtentReports> extentReportsThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    // Initialize the ExtentReport with a unique report name based on the class name
    public static ExtentReports initializeExtentReports(String reportPath) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
//        extentReportsThreadLocal.set(extentReports);
        return extentReports;
    }

    // Start the ExtentTest for each scenario
    public static ExtentTest startTest(String testName, String description) {
        ExtentTest extentTest = extentReportsThreadLocal.get().createTest(testName, description);
//        ExtentTest extentTest = extentReports.createTest(testName, description);
        extentTestThreadLocal.set(extentTest);
        return extentTest;
    }

    // End the test and flush the report
    public static void endTest() {
        extentReportsThreadLocal.get().flush();
    }

    public static ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    public static void setTest(ExtentReports extentReports) {
        extentReportsThreadLocal.set(extentReports);
    }
}
