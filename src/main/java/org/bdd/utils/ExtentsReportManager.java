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

		String screenshotPath = captureScreenshot(); 
		String screenshotName = new File(screenshotPath).getName(); 
		String relativePath = GlobalParams.getDeviceName() + "/" + screenshotName;
		String link = "<a href='" + relativePath + "' target='_blank'>Click here to view screenshot</a>";

		if (status.equalsIgnoreCase("pass")) {
			log.info(message);
			
			//add link to html for screenshot
			ExtentReporter.getTest().log(Status.PASS, message + " " + link);

			// Commented passed taking snapshot- embedded
			// ExtentReporter.getTest().log(Status.PASS, message,
			// MediaEntityBuilder.createScreenCaptureFromBase64String(addScreenshot()).build());
			
			//Capture screenshot and add to html report - more time less space
			// ExtentReporter.getTest().log(Status.PASS, message,
			 //MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
			 
			 //status with message and no screenshot
//            ExtentReporter.getTest().log(Status.PASS, message);
		} else if (status.equalsIgnoreCase("fail")) {
			log.error(message);
			ExtentReporter.getTest().log(Status.FAIL, message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(addScreenshot()).build());
		} else if (status.equalsIgnoreCase("info")) {
			log.info(message);
			ExtentReporter.getTest().log(Status.INFO, message);
		} else if (status.equalsIgnoreCase("warning")) {
			log.warn(message);
			ExtentReporter.getTest().log(Status.WARNING, message);
		}
	}

	public static String addScreenshot() {
		File screenshot = new AppiumDriverManager().getAppiumDriver().getScreenshotAs(OutputType.FILE);
		String screenshotName = "";
		try {
			Date d = new Date();
			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
			FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "/target/reports/"
					+ GlobalParams.getDeviceName() + "/" + screenshotName));
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

	public static String captureScreenshot() {
		File screenshot = new AppiumDriverManager().getAppiumDriver().getScreenshotAs(OutputType.FILE);
		String screenshotName = "";
		String screenshotPath = "";
		try {
			Date d = new Date();
			screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
			screenshotPath = System.getProperty("user.dir") + "/target/reports/" + GlobalParams.getDeviceName() + "/"
					+ screenshotName;
			FileUtils.copyFile(screenshot, new File(screenshotPath));
			System.out.println("Successfully captured a screenshot");
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
		return screenshotPath;
	}

}
