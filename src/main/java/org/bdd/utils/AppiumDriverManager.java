package org.bdd.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class AppiumDriverManager {
    private static final ThreadLocal<AppiumDriver> driver1 = new ThreadLocal<>();
    private static final ThreadLocal<String> device = new ThreadLocal<>();
    private static final Logger log = LogManager.getLogger(AppiumDriverManager.class);

    public AppiumDriver getAppiumDriver() {
        return driver1.get();
    }

    public String getDevice() {
        return device.get();
    }

    public void setAppiumDriver(AppiumDriver driver2) {
        driver1.set(driver2);
    }

    public void setDevice() {
        String deviceType = System.getProperty("device");
        device.set(deviceType);
    }


    public void initializeDriver() throws IOException {
        AppiumDriver driver = null;
        Properties props = new PropertyFileManager().getProperties();
        if (driver == null) {
            try {
                setDevice();
                String mob = GlobalParams.getPlatformName();
                DesiredCapabilities capabilities;
                switch (mob.toLowerCase()) {
                    case "android":
                        capabilities = new CapabilitiesManager().getCapabilities(mob);
                        driver = new AndroidDriver(
                                new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                                capabilities);
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                        break;
                    case "ios":
                        capabilities = new CapabilitiesManager().getCapabilities(mob);
                        driver = new IOSDriver(
                                new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                                capabilities);
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                        break;
                }

            } catch (Exception e) {
                log.error("exception occured" + e);
                throw e;
            }

        }
        setAppiumDriver(driver);
    }

    public void initializeIosDriver() throws IOException {
        AppiumDriver driver = null;
        Properties props = new PropertyFileManager().getProperties();
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = new CapabilitiesManager().getCapabilities("ios");
                driver = new IOSDriver(
                        new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                        capabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            } catch (Exception e) {
                log.error("exception occured" + e);
                throw e;
            }

        }
        setAppiumDriver(driver);
    }

    public void initializeAndroidDriver() throws IOException {
        AppiumDriver driver = null;
        Properties props = new PropertyFileManager().getProperties();
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = new CapabilitiesManager().getCapabilities("android");
                driver = new AndroidDriver(
                        new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                        capabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            } catch (Exception e) {
                log.error("exception occured" + e);
                throw e;
            }
        }
        setAppiumDriver(driver);
    }

    public void initializeAndroidDriverVersionLessthanThirteen() throws IOException {
        AppiumDriver driver = null;
        Properties props = new PropertyFileManager().getProperties();
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = new CapabilitiesManager().getCapabilities("android_vl13");
                driver = new AndroidDriver(
                        new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                        capabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            } catch (Exception e) {
                log.error("exception occured" + e);
                throw e;
            }
        }
        setAppiumDriver(driver);
    }

    public void initializeAndroidDriverTablet() throws IOException {
        AppiumDriver driver = null;
        Properties props = new PropertyFileManager().getProperties();
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = new CapabilitiesManager().getCapabilities("android_Tablet");
                driver = new AndroidDriver(
                        new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                        capabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            } catch (Exception e) {
                log.error("exception occured" + e);
                throw e;
            }
        }
        setAppiumDriver((AppiumDriver) driver);
    }

    public void initializeIosDriverTablet() throws IOException {
        AppiumDriver driver = null;
        Properties props = new PropertyFileManager().getProperties();
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = new CapabilitiesManager().getCapabilities("Ios_Tablet");
                driver = new AndroidDriver(
                        new URL("https://" + props.getProperty("browserstack.user") + ":" + props.getProperty("browserstack.key") + "@hub.browserstack.com/wd/hub"),
                        capabilities);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            } catch (Exception e) {
                log.error("exception occured" + e);
                throw e;
            }
        }
        setAppiumDriver((AppiumDriver) driver);

    }
}
