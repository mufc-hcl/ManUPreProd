package org.bdd.runners;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.bdd.utils.AppiumDriverManager;
import org.bdd.utils.ExtentReporter;
import org.bdd.utils.GlobalParams;
import org.testng.annotations.*;

import java.io.IOException;


@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport1.json",
        "rerun:rerun/cucumber-reports/rerun1.txt"}, features = {
        "src/test/resources"}, glue = {"org.bdd.stepdef"}, dryRun = false, monochrome = true,
        tags = "@Outline"

)
public class Runner1 {
    private TestNGCucumberRunner testNGCucumberRunner;
    public static ExtentReports extentReportsThreadLocal;

    @Parameters({"platformName", "deviceName", "os_version"})
    @BeforeMethod(alwaysRun = true)
    public void setFileName(String platformName, String deviceName, String os) throws IOException {
        GlobalParams.setPlatformName(platformName);
        GlobalParams.setDeviceName(deviceName);
        GlobalParams.setOsversion(os);
        new AppiumDriverManager().initializeDriver();
        ExtentReporter.setTest(extentReportsThreadLocal);
    }

    @Parameters({"deviceName"})
    @BeforeClass()
    public void setUp(String deviceName) {
        String reportPath = "target/reports/" + deviceName + "-ExtentReport.html";
        extentReportsThreadLocal = ExtentReporter.initializeExtentReports(reportPath);
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Run Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickleEvent, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickleEvent.getPickle());
    }

    @DataProvider(name = "scenarios", parallel = true)
    public Object[][] parallelScenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass
    public void tearDown() {
        testNGCucumberRunner.finish();
    }

    @AfterMethod
    public void am() {
        AppiumDriverManager driverManager = new AppiumDriverManager();
        if (driverManager.getAppiumDriver() != null) {
            driverManager.getAppiumDriver().quit();
            driverManager.setAppiumDriver(null);
        }
    }
}
