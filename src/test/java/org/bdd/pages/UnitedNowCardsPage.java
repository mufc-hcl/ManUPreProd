package org.bdd.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.UnitedNowPageLocators;
import org.bdd.utils.*;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UnitedNowCardsPage extends Common {
	private static final Logger log = LogManager.getLogger(UnitedNowCardsPage.class);
	UnitedNowPageLocators unitedNowPageLocators;
	public UnitedNowAPIResponse unitedNowAPIResponse = new UnitedNowAPIResponse();

	public UnitedNowCardsPage() {
		this.unitedNowPageLocators = new UnitedNowPageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), unitedNowPageLocators);
	}

	
	public boolean validateAtLeast30DistinctCardsAndMore(int maxScrolls) {
	    Set<String> seenCardIds = new HashSet<>();
	    int scrollCount = 0;
	    int requiredInitialCount = 30;
	    int requiredTotalCount = 35;
	    int maxMainFilterScrolls = 10;
	    int sameCardScrolls = 0;
	    List<String> lastScrollCardIds = new ArrayList<>();

	    String device = GlobalParams.getPlatformName().toLowerCase();
	    boolean isAndroid = device.contains("android");

	    String cardXpath = isAndroid
	        ? "//*[contains(@resource-id, ':id/card_view') or contains(@resource-id, 'brazeUnitedNowFragment') or contains(@resource-id,'linear_layout_dfp')]"
	        : "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther";

	    // Step 1: Scroll MainFilterView to top
	    while (scrollCount < maxMainFilterScrolls) {
	        try {
	            WebElement filterElement = isAndroid
	                ? driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id, ':id/MainFilterViewOld')]"))
	                : driver.findElement(By.xpath("//XCUIElementTypeButton[@name='filterIcon']"));

	            if (filterElement.isDisplayed()) {
	                Point location = filterElement.getLocation();
	                if (location.getY() < 200) break;
	            }
	        } catch (Exception ignored) {}
	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
	        scrollCount++;
	    }

	    // Step 2: Clear filter view
	    int scrollToClearFilter = 0;
	    while (scrollToClearFilter < maxMainFilterScrolls) {
	        try {
	            WebElement filterElement = isAndroid
	                ? driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id, ':id/MainFilterViewOld')]"))
	                : driver.findElement(By.xpath("//XCUIElementTypeButton[@name='filterIcon']"));
	            if (!filterElement.isDisplayed()) break;
	        } catch (Exception e) {
	            break;
	        }
	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.1);
	        scrollToClearFilter++;
	    }

	    // Step 3: Scroll to validate cards
	    scrollCount = 0;
	    while (scrollCount < maxScrolls) {
	        List<WebElement> cards = driver.findElements(By.xpath(cardXpath));
	        int newCardsThisScroll = 0;
	        List<String> currentScrollCardIds = new ArrayList<>();

	        for (WebElement card : cards) {
	            try {
	                if (card.isDisplayed()) {
	                    String elementId = ((RemoteWebElement) card).getId();
	                    currentScrollCardIds.add(elementId);
	                    if (!seenCardIds.contains(elementId)) {
	                        seenCardIds.add(elementId);
	                        newCardsThisScroll++;
	                    }
	                }
	            } catch (Exception ignored) {}
	        }

	        ExtentsReportManager.extentReportLogging("info",
	            "Scroll " + (scrollCount + 1) + ": New cards = " + newCardsThisScroll + ", Total unique = " + seenCardIds.size());

	        // Check for repeated card set
	        if (lastScrollCardIds.equals(currentScrollCardIds)) {
	            sameCardScrolls++;
	            if (sameCardScrolls >= 6) {
	                ExtentsReportManager.extentReportLogging("fail", 
	                    "Same set of cards displayed for 6 consecutive scrolls. Possibly stuck or page not loading.");
	                return false;
	            }
	        } else {
	            sameCardScrolls = 0;
	        }

	        lastScrollCardIds = new ArrayList<>(currentScrollCardIds);

	        if (seenCardIds.size() >= requiredTotalCount) {
	            ExtentsReportManager.extentReportLogging("pass",
	                "Successfully validated ≥35 distinct displayed cards. Final count: " + seenCardIds.size());
	            return true;
	        }

	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.8);
	        scrollCount++;
	    }

	    // Final fallback validation
	    int finalCount = seenCardIds.size();
	    if (finalCount < requiredInitialCount) {
	        ExtentsReportManager.extentReportLogging("fail",
	            "Only " + finalCount + " cards found. Expected ≥ 30.");
	        return false;
	    } else if (finalCount < requiredTotalCount) {
	        ExtentsReportManager.extentReportLogging("fail",
	            "Only " + finalCount + " cards found. Expected ≥ 35 after " + maxScrolls + " scrolls.");
	        return false;
	    }

	    ExtentsReportManager.extentReportLogging("pass",
	        "Successfully validated ≥35 displayed cards. Final count: " + finalCount);
	    return true;
	}

}
