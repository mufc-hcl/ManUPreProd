package org.bdd.utils;

import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.SupportsContextSwitching;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class AndroidGenericLibrary {
    private static final Logger log = LogManager.getLogger(AndroidGenericLibrary.class);

    //To swipe based on the coordinates using Pointer Input and sequence class
    public static void swipeWithCoordinates(int startX, int startY, int endX, int endY, int millis, String direction, AppiumDriver driver) {
        try {
            int arg = 0;
            if (direction.equalsIgnoreCase("left")) {
                arg = PointerInput.MouseButton.LEFT.asArg();

            } else if (direction.equalsIgnoreCase("right")) {
                arg = PointerInput.MouseButton.RIGHT.asArg();
            } else {
                throw new Exception("error in providing direction");
            }
            PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
            Sequence sequence = new Sequence(finger1, 1)
                    .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                    .addAction(finger1.createPointerDown(arg))
                    .addAction(new Pause(finger1, Duration.ofMillis(millis)))
                    .addAction(finger1.createPointerMove(Duration.ofMillis(millis), PointerInput.Origin.viewport(), endX, endY))
                    .addAction(finger1.createPointerUp(arg));

            driver.perform(Collections.singletonList(sequence));
        } catch (Exception e) {
            log.error("swipe exception occured" + e);
        }
    }

    public static void swipeJSWithWebElement(WebElement ele, String direction, AppiumDriver driver) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(),
                "direction", direction,
                "percent", 0.75
        ));
    }

    //To swipe based on the coordinates in the screen using touch action class and Touch action class is depreciated ,but it could be used
    public static void swipeUsingTouchAction(int startX, int startY, int endX, int endY, int millis, AppiumDriver driver) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(waitOptions(Duration.ofMillis(millis)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

    }

    //To Swipe without coordinates
    public static void swipe(AppiumDriver driver, int millis, String direction) {

        try {
            Dimension size = driver.manage().window().getSize();
            int startX = size.getWidth() / 2;
            int startY = size.getHeight() / 2;
            int endX = startX;
            int endY = (int) (size.getHeight() * 0.25);
            swipeWithCoordinates(startX, startY, endX, endY, millis, direction, driver);
        } catch (Exception e) {
            log.error("swipe exception occured" + e);

        }
    }

    //To scroll to element with ext attribute
    public static void scrollDownUsingUiScrollable(AppiumDriver driver, String text) {
        try {
            // Find a scrollable element using UiSelector
            driver.findElement(AppiumBy.androidUIAutomator
                    ("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "scroll exception occured in function scrollDownUsingUiScrollable() <br />" + e);

        }
    }

    public static void hideKeyBoard(AppiumDriver driver) {
        ((AndroidDriver) driver).hideKeyboard();
    }

    public static void switchToWebViewContext(AndroidDriver driver) {
//        giving wait to pick all the context handles
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Get available context handles
        Set<String> contextHandles = driver.getContextHandles();
        // Print out available context handles (optional)
        for (String context : contextHandles) {
            log.info("Context: " + context);
        }

        // Switch to webview context (assuming there's only one webview context)
        for (String context : contextHandles) {
            if (context.equals("WEBVIEW_chrome")) {
                driver.context(context);
                log.info("Switched to webview context: " + context);
                break;

            }
        }
    }

    public static void switchToNativeView(AndroidDriver driver) {
        driver.context("NATIVE_APP");
        log.info("Switched to native context");
    }

    public static void clickAtCoordinates(AppiumDriver driver,int x, int y) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence clickAtPoint = new Sequence(finger, 1);

        clickAtPoint.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
        clickAtPoint.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        clickAtPoint.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(clickAtPoint));
    }
}
