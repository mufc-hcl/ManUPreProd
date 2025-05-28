package org.bdd.utils;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;

import java.io.*;
import java.util.Base64;
import java.util.Date;

public class ExtentsReportManager {
    private static final Logger log = LogManager.getLogger(ExtentsReportManager.class);

    public static void extentReportLogging(String status, String message) {
        if (status.equalsIgnoreCase("pass")) {
            log.info(message);
            //Commented passed taking snapshot
           ExtentReporter.getTest().log(Status.PASS, message, MediaEntityBuilder.createScreenCaptureFromBase64String(addScreenshot()).build());
//            ExtentReporter.getTest().log(Status.PASS, message);
        } else if (status.equalsIgnoreCase("fail")) {
            log.error(message);
            ExtentReporter.getTest().log(Status.FAIL, message, MediaEntityBuilder.createScreenCaptureFromBase64String(addScreenshot()).build());
        } else if (status.equalsIgnoreCase("info")) {
            log.info(message);
            ExtentReporter.getTest().log(Status.INFO, message);
        } else if (status.equalsIgnoreCase("warning")) {
            log.warn(message);
            ExtentReporter.getTest().log(Status.WARNING, message);
        }
    }

    public static String addScreenshot() {
        File screenshot = new AppiumDriverManager().getAppiumDriver()
                .getScreenshotAs(OutputType.FILE);
        String screenshotName = "";
        try {
            Date d = new Date();
            screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "/target/reports/" + GlobalParams.getDeviceName() + "/" + screenshotName));
            System.out.println("Successfully captured a screenshot");
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
        InputStream in = null;
        String base64;
        try {
            in = new FileInputStream(screenshot);

            byte[] imageBytes = IOUtils.toByteArray(in);
            base64 = Base64.getEncoder().encodeToString(imageBytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return base64;
//		 scenario.attach(screenshot, "image/png", "image");
    }
}


