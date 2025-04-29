package org.bdd.stepdef;

import io.cucumber.java.*;
import org.bdd.utils.ExtentReporter;
import org.bdd.utils.GlobalParams;

public class Hooks {
    // executes before every scenario
    @Before
    public static void initialize(Scenario scenario) {
        ExtentReporter.startTest(scenario.getName(), GlobalParams.getDeviceName() + " testcases");
    }

    @After
    public void quitDriver(Scenario scenario) {
// End report after each scenario
        if (scenario.isFailed()) {
            ExtentReporter.getTest().fail("Test Failed" + scenario.getName());
        } else {
            ExtentReporter.getTest().pass("Test Passed");
        }
        ExtentReporter.endTest();
    }
}
