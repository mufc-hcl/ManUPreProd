package org.bdd.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.bdd.utils.PropertyFileManager.props;

public class CapabilitiesManager {
    private static final Logger log = LogManager.getLogger(CapabilitiesManager.class);
	private String android_app;
	private String ios_app;

    public DesiredCapabilities getCapabilities(String mobType) throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        try {
            Properties props = new PropertyFileManager().getProperties();
            // android or ios selection
            HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
            String env = Common.apiEnv();
            if (env.equalsIgnoreCase("stage")) {
            	android_app = props.getProperty("android_app_stage");
            	ios_app = props.getProperty("ios_app_stage");
            	System.out.println("env *** "+env +"  *** android **** "+android_app+ " *** ios ***"+ios_app);
            } else if (env.equalsIgnoreCase("prod")) {
            	android_app = props.getProperty("android_app_preprod");
            	ios_app = props.getProperty("ios_app_preprod");
            	System.out.println("env *** "+env +"  *** android **** "+android_app+ " *** ios ***"+ios_app);
            }
            switch (mobType) {
                case "android":
                    bstackOptions.put("userName", props.getProperty("browserstack.user"));
                    bstackOptions.put("accessKey", props.getProperty("browserstack.key"));
                    caps.setCapability("platformName", GlobalParams.getPlatformName());
                    caps.setCapability("appium:platformVersion", GlobalParams.getOsversion());
                    caps.setCapability("appium:deviceName", GlobalParams.getDeviceName());
                    caps.setCapability("appium:app", android_app);
                    caps.setCapability("interactiveDebugging", props.getProperty("interactiveDebugging"));
                    caps.setCapability("browserstack.idleTimeout", props.getProperty("BROWSERSTACK_IDLE_TIMEOUT"));
                    caps.setCapability("setWebContentsDebuggingEnabled", "true");
                    caps.setCapability("bstack:options", bstackOptions);
                    break;
                case "ios":
                    bstackOptions.put("userName", props.getProperty("browserstack.user"));
                    bstackOptions.put("accessKey", props.getProperty("browserstack.key"));
                    caps.setCapability("platformName", GlobalParams.getPlatformName());
                    caps.setCapability("appium:platformVersion", GlobalParams.getOsversion());
                    caps.setCapability("appium:deviceName", GlobalParams.getDeviceName());
                    caps.setCapability("appium:app", ios_app);
                    caps.setCapability("interactiveDebugging", props.getProperty("interactiveDebugging"));
                    caps.setCapability("browserstack.idleTimeout", props.getProperty("BROWSERSTACK_IDLE_TIMEOUT"));
                    caps.setCapability("setWebContentsDebuggingEnabled", "true");
                    caps.setCapability("bstack:options", bstackOptions);
                    break;
                case "android_vl13":
                    bstackOptions.put("userName", props.getProperty("browserstack.user"));
                    bstackOptions.put("accessKey", props.getProperty("browserstack.key"));
                    caps.setCapability("appium:device", props.getProperty("android_device_vl13"));
                    caps.setCapability("os_version", props.getProperty("android_os_vl13"));
                    caps.setCapability("appium:app", props.getProperty("android_app"));
                    caps.setCapability("deviceName", props.getProperty("android_deviceName_vl13"));
                    caps.setCapability("interactiveDebugging", props.getProperty("interactiveDebugging"));
                    caps.setCapability("browserstack.idleTimeout", props.getProperty("BROWSERSTACK_IDLE_TIMEOUT"));
                    caps.setCapability("setWebContentsDebuggingEnabled", "true");
                    caps.setCapability("bstack:options", bstackOptions);
                    break;
                case "android_Tablet":
                    bstackOptions.put("userName", props.getProperty("browserstack.user"));
                    bstackOptions.put("accessKey", props.getProperty("browserstack.key"));
                    caps.setCapability("appium:device", props.getProperty("android_device_Tablet"));
                    caps.setCapability("os_version", props.getProperty("android_os_Tablet"));
                    caps.setCapability("appium:app", props.getProperty("android_app"));
                    caps.setCapability("deviceName", props.getProperty("android_deviceName_Tablet"));
                    caps.setCapability("interactiveDebugging", props.getProperty("interactiveDebugging"));
                    caps.setCapability("browserstack.idleTimeout", props.getProperty("BROWSERSTACK_IDLE_TIMEOUT"));
                    caps.setCapability("setWebContentsDebuggingEnabled", "true");
                    caps.setCapability("bstack:options", bstackOptions);
                    break;
                case "ios_Tablet":
                    bstackOptions.put("userName", props.getProperty("browserstack.user"));
                    bstackOptions.put("accessKey", props.getProperty("browserstack.key"));
                    caps.setCapability("platformName", props.getProperty("ios_platformName_Tablet"));
                    caps.setCapability("appium:platformVersion", props.getProperty("ios_os_Tablet_Version"));
                    caps.setCapability("appium:deviceName", props.getProperty("ios_deviceName_Tablet"));
                    caps.setCapability("appium:app", props.getProperty("ios_app"));
                    caps.setCapability("browserstack.idleTimeout", props.getProperty("BROWSERSTACK_IDLE_TIMEOUT"));
                    caps.setCapability("bstack:options", bstackOptions);
                    break;
            }

        } catch (Exception e) {
            log.error("exception occured" + e);
            throw e;
        }
        return caps;
    }

}
