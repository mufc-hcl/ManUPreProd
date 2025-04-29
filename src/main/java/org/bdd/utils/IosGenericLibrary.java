package org.bdd.utils;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class IosGenericLibrary {


    private static final Duration SCROLL_DUR = Duration.ofSeconds(2);

    //“direction”: “up”, “down”, “left, “right”.
    public static void scroll1(AppiumDriver driver, WebElement element, String direction) {
//     element = (RemoteWebElement)driver.findElement(By.className("XCUIElementTypeTable"));
//    String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
//    scrollObject.put("element", elementID); // Only for ‘scroll in element’
//    scrollObject.put("xpath", element.getText()); // Only for ‘scroll in element’
        scrollObject.put("iOSNsPredicate", element.getDomAttribute("label")); // Only for ‘scroll in element’
        scrollObject.put("direction", direction);
        driver.executeScript("mobile:scroll", scrollObject);
    }

    public static void Rolldown(AppiumDriver driver) {
        Map<String, Object> args = new HashMap<>();
        args.put("direction", "down");
        driver.executeScript("mobile: scroll", args);
    }

    public static void scroll(AppiumDriver driver, WebElement panel, ScrollDirection dir, double scrollRatio) {
        Point midPoint;
        Dimension size;

        if (scrollRatio < 0 || scrollRatio > 1) {
            throw new Error("Scroll distance must be between 0 and 1");
        }

        if (panel != null) {
            midPoint = getCenter(panel);
        } else { //entire screen is scrollable
            size = driver.manage().window().getSize();
            System.out.println(size);
            midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));
        }

        int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
        int top = midPoint.y - (int) (midPoint.y * scrollRatio);
        int left = midPoint.x - (int) (midPoint.x * scrollRatio);
        int right = midPoint.x + (int) (midPoint.x * scrollRatio);

        if (dir == ScrollDirection.UP) {
            swipe(driver, new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
        } else if (dir == ScrollDirection.DOWN) {
            swipe(driver, new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
        } else if (dir == ScrollDirection.LEFT) {
            swipe(driver, new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
        } else {
            swipe(driver, new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
        }
    }

    protected static void swipe(AppiumDriver driver, Point start, Point end, Duration duration) {

        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(swipe));
    }

    private static Point getCenter(WebElement el) {
        Point location = el.getLocation();
        Dimension size = el.getSize();
        return new Point(location.x + size.getWidth() / 2, location.y + size.getHeight() / 2);
    }

    public enum ScrollDirection {
        UP, DOWN, LEFT, RIGHT
    }
}