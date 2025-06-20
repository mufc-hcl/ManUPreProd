package org.bdd.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.UnitedNowPageLocators;
import org.bdd.utils.*;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
		  String device = GlobalParams.getPlatformName().toLowerCase();
		    boolean isAndroid = device.contains("android");
		try {
		Set<String> seenElementIds = new HashSet<>();
		Map<String, Integer> cardContentToYPosition = new HashMap<>();
		int scrollCount = 0;
		int requiredInitialCount = 30;
		int requiredTotalCount = 35;
		int sameCardScrolls = 0;
		int visibleCardPosition = 0;
		int maxMainFilterScrolls = 10;
		List<String> lastScrollCardIds = new ArrayList<>();

		List<WebElement> closeUpsell = driver.findElements(By.xpath("//*[@content-desc='Close Notification']"));
	    if (closeUpsell.size()>0) {
			waitForVisibilityFluentWait(closeUpsell.get(0), 60);
			closeUpsell.get(0).click();
			ExtentsReportManager.extentReportLogging("info", "Clicks on close icon in Upsell PopUp in UnitedNow ");
		}
	    boolean filterAppeared = false;

		// Step 1: Scroll until filter appears and disappears
		boolean cardVisibleAfterFilter = false;

		  while (scrollCount < maxMainFilterScrolls) {
		        try {
		          
		            
		            WebElement filterElement = isAndroid
							? driver.findElement(
									By.xpath("//android.widget.ImageView[contains(@resource-id, ':id/mFilterLay')]"))
							: driver.findElement(By.xpath("//XCUIElementTypeButton[@name='filterIcon']"));

		            if (filterElement.isDisplayed()) {
		                Point location = filterElement.getLocation();
		                Dimension screenSize = driver.manage().window().getSize();
		                int threshold = screenSize.getHeight() / 4;

		                if (!filterAppeared && location.getY() <= threshold) {
		                    filterAppeared = true;
		                    ExtentsReportManager.extentReportLogging("info", "Filter appeared near top.");
		                }

		                if (filterAppeared && !filterElement.isDisplayed()) {
		                    ExtentsReportManager.extentReportLogging("info", "Filter disappeared. Stopping scroll.");
		                    break;
		                }
		            }
		        } catch (Exception e) {
		            if (filterAppeared) {
		                ExtentsReportManager.extentReportLogging("info", "Filter not found after appearing. Stopping scroll.");
		                break;
		            }
		        }

		        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
		        scrollCount++;
		    }
		
		  if (!filterAppeared) {
		    	ExtentsReportManager.extentReportLogging("info", "Filter never appeared after max scrolls.");
		    }
		

		String cardXpath = isAndroid
		? "//*[contains(@resource-id, ':id/card_view') or contains(@resource-id, 'brazeUnitedNowFragment') or contains(@resource-id,'linear_layout_dfp')]"
		: "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther";

		while (scrollCount < maxScrolls) {
		List<WebElement> cardElements = driver.findElements(By.xpath(cardXpath));
		List<String> currentScrollCardIds = new ArrayList<>();
		int newCardsThisScroll = 0;

		for (WebElement card : cardElements) {
		try {
		if (!card.isDisplayed()) continue;

		String elementId = ((RemoteWebElement) card).getId();
		currentScrollCardIds.add(elementId);
		if (seenElementIds.contains(elementId)) continue;

		seenElementIds.add(elementId);

		String resourceId = card.getDomAttribute("resourceId");
		String text = "";
		String className = "";
		String contentDesc = "";

		try {
		WebElement textView = card.findElement(By.xpath(".//android.widget.TextView"));
		text = textView.getText();
		} catch (Exception ignored) {}

		try {
		WebElement imageView = card.findElement(By.xpath(".//android.widget.ImageView"));
		contentDesc = imageView.getDomAttribute("content-desc");
		className = imageView.getDomAttribute("class");
		} catch (Exception ignored) {}

		String contentKey = (resourceId + "|" + text + "|" + className + "|" + contentDesc).trim();
		int y = card.getLocation().getY();

		if (cardContentToYPosition.containsKey(contentKey)) {
		int previousY = cardContentToYPosition.get(contentKey);
		if (Math.abs(previousY - y) < 50) continue;
		}

		cardContentToYPosition.put(contentKey, y);
		visibleCardPosition++;
		newCardsThisScroll++;

		ExtentsReportManager.extentReportLogging("info",
		"elementId: " + elementId +
		", Pos: " + visibleCardPosition +
		", content-desc: " + contentDesc +
		", text: " + text +
		", resourceId: " + resourceId);

		} catch (Exception ignored) {}
		}

		ExtentsReportManager.extentReportLogging("info", "Scroll " + (scrollCount + 1) + ": New cards = "
		+ newCardsThisScroll + ", Total unique = " + seenElementIds.size());

		if (lastScrollCardIds.equals(currentScrollCardIds)) {
		sameCardScrolls++;
		if (sameCardScrolls >= 15) {
		ExtentsReportManager.extentReportLogging("fail",
		"Same set of cards displayed for 6 consecutive scrolls. Possibly stuck or page not loading.");
		return false;
		}
		} else {
		sameCardScrolls = 0;
		}

		lastScrollCardIds = new ArrayList<>(currentScrollCardIds);

		if (seenElementIds.size() >= requiredTotalCount) {
		ExtentsReportManager.extentReportLogging("pass",
		"Successfully validated more than 35 distinct displayed cards. Final count: " + seenElementIds.size());
		return true;
		}

		IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.6);
		scrollCount++;
		}

		int finalCount = seenElementIds.size();
		if (finalCount < requiredInitialCount) {
		ExtentsReportManager.extentReportLogging("fail", "Only " + finalCount + " cards found. Expected ≥ 30.");
		return false;
		} else if (finalCount < requiredTotalCount) {
		ExtentsReportManager.extentReportLogging("fail",
		"Only " + finalCount + " cards found. Expected more than 35 after " + maxScrolls + " scrolls.");
		return false;
		}

		ExtentsReportManager.extentReportLogging("pass",
		"Successfully validated ≥35 displayed cards. Final count: " + finalCount);
		return true;
	} catch (Exception e) {
        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function validateAtLeast30DistinctCardsAndMore()<br />" + e);
        throw e;
    }
	}

	public boolean validateAtLeast30DistinctCardsAndMore1(int maxScrolls) {
		try {
		Set<String> seenCardIds = new HashSet<>();
		int scrollCount = 0;
		int requiredInitialCount = 30;
		int requiredTotalCount = 35;
		int maxMainFilterScrolls = 10;
		int sameCardScrolls = 0;
		List<String> lastScrollCardIds = new ArrayList<>();
		
		List<WebElement> closeUpsell = driver.findElements(By.xpath("//*[@content-desc='Close Notification']"));
	    if (closeUpsell.size()>0) {
			waitForVisibilityFluentWait(closeUpsell.get(0), 60);
			closeUpsell.get(0).click();
			ExtentsReportManager.extentReportLogging("info", "Clicks on close icon in Upsell PopUp in UnitedNow ");
		}

		String device = GlobalParams.getPlatformName().toLowerCase();
		boolean isAndroid = device.contains("android");

		String cardXpath = isAndroid
				? "//*[contains(@resource-id, ':id/card_view') or contains(@resource-id, 'brazeUnitedNowFragment') or contains(@resource-id,'linear_layout_dfp')]"
				: "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther";

		boolean filterAppeared = false;

		// Step 1: Scroll until filter appears and disappears
		boolean cardVisibleAfterFilter = false;

		  while (scrollCount < maxMainFilterScrolls) {
		        try {
		          
		            
		            WebElement filterElement = isAndroid
							? driver.findElement(
									By.xpath("//android.widget.ImageView[contains(@resource-id, ':id/mFilterLay')]"))
							: driver.findElement(By.xpath("//XCUIElementTypeButton[@name='filterIcon']"));

		            if (filterElement.isDisplayed()) {
		                Point location = filterElement.getLocation();
		                Dimension screenSize = driver.manage().window().getSize();
		                int threshold = screenSize.getHeight() / 4;

		                if (!filterAppeared && location.getY() <= threshold) {
		                    filterAppeared = true;
		                    ExtentsReportManager.extentReportLogging("info", "Filter appeared near top.");
		                }

		                if (filterAppeared && !filterElement.isDisplayed()) {
		                    ExtentsReportManager.extentReportLogging("info", "Filter disappeared. Stopping scroll.");
		                    break;
		                }
		            }
		        } catch (Exception e) {
		            if (filterAppeared) {
		                ExtentsReportManager.extentReportLogging("info", "Filter not found after appearing. Stopping scroll.");
		                break;
		            }
		        }

		        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
		        scrollCount++;
		    }
		
		  if (!filterAppeared) {
		    	ExtentsReportManager.extentReportLogging("info", "Filter never appeared after max scrolls.");
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
				} catch (Exception ignored) {
				}
			}

			ExtentsReportManager.extentReportLogging("info", "Scroll " + (scrollCount + 1) + ": New cards = "
					+ newCardsThisScroll + ", Total unique = " + seenCardIds.size());

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

			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.6);
			scrollCount++;
		}

		// Final fallback validation
		int finalCount = seenCardIds.size();
		if (finalCount < requiredInitialCount) {
			ExtentsReportManager.extentReportLogging("fail", "Only " + finalCount + " cards found. Expected ≥ 30.");
			return false;
		} else if (finalCount < requiredTotalCount) {
			ExtentsReportManager.extentReportLogging("fail",
					"Only " + finalCount + " cards found. Expected ≥ 35 after " + maxScrolls + " scrolls.");
			return false;
		}

		ExtentsReportManager.extentReportLogging("pass",
				"Successfully validated 35 displayed cards. Final count: " + finalCount);
		return true;
	} catch (Exception e) {
        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function validateAtLeast30DistinctCardsAndMore()<br />" + e);
        throw e;
    }
	}


	
	public int getDfpAdPosition(int maxScrolls) {
		try {
	    int scrollCount = 0;
	    int visibleCardPosition = 0;
	    int nondfpCardCount = 0;
	    
	    List<WebElement> closeUpsell = driver.findElements(By.xpath("//*[@content-desc='Close Notification']"));
	    if (closeUpsell.size()>0) {
			waitForVisibilityFluentWait(closeUpsell.get(0), 60);
			closeUpsell.get(0).click();
			ExtentsReportManager.extentReportLogging("info", "Clicks on close icon in Upsell PopUp in UnitedNow ");
		}

	    Set<String> seenElementIds = new HashSet<>();
	    Map<String, Integer> cardContentToYPosition = new HashMap<>();

	    String cardXpath = "//*[contains(@resource-id, 'card_view') or contains(@resource-id, 'brazeUnitedNowFragment') or contains(@resource-id,'linear_layout_dfp')]";

	    boolean filterAppeared = false;
	    int maxMainFilterScrolls = 10;
	    // Step 1: Scroll until filter appears and disappears
	    while (scrollCount < maxMainFilterScrolls) {
	        try {
	            WebElement filterElement = driver.findElement(
	                    By.xpath("//android.widget.ImageView[contains(@resource-id, ':id/mFilterLay')]"));

	            if (filterElement.isDisplayed()) {
	                Point location = filterElement.getLocation();
	                Dimension screenSize = driver.manage().window().getSize();
	                int threshold = screenSize.getHeight() / 4;

	                if (!filterAppeared && location.getY() <= threshold) {
	                    filterAppeared = true;
	                    ExtentsReportManager.extentReportLogging("info", "Filter appeared near top.");
	                }

	                if (filterAppeared && !filterElement.isDisplayed()) {
	                    ExtentsReportManager.extentReportLogging("info", "Filter disappeared. Stopping scroll.");
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            if (filterAppeared) {
	                ExtentsReportManager.extentReportLogging("info", "Filter not found after appearing. Stopping scroll.");
	                break;
	            }
	        }

	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
	        scrollCount++;
	    }
	    
	    if (!filterAppeared) {
	    	ExtentsReportManager.extentReportLogging("info", "Filter never appeared after max scrolls.");
	    }
	    
	    while (scrollCount < maxScrolls) {
	        List<WebElement> cardElements = driver.findElements(By.xpath(cardXpath));

	        for (WebElement card : cardElements) {
	            try {
	                if (!card.isDisplayed()) continue;

	                String elementId = ((RemoteWebElement) card).getId();
	               // ExtentsReportManager.extentReportLogging("pass",  "elementId: " + elementId +", Pos: " + visibleCardPosition );
	                if (seenElementIds.contains(elementId)) continue;

	                seenElementIds.add(elementId);

	                // Unique key to detect duplicates
	                String resourceId = card.getDomAttribute("resourceId");
	                String text = "";
	                String className = "";
	                String contentDesc = "";

	                try {
	                    WebElement textView = card.findElement(By.xpath(".//android.widget.TextView"));
	                    text = textView.getText();
	                } catch (Exception e) {}

	                try {
	                    WebElement imageView = card.findElement(By.xpath(".//android.widget.ImageView"));
	                    contentDesc = imageView.getDomAttribute("content-desc");
	                    className = imageView.getDomAttribute("class");
	                } catch (Exception e) {}


	                String contentKey = (resourceId + "|" + text + "|" + className + "|" + contentDesc).trim();
	                int y = card.getLocation().getY();

	                if (cardContentToYPosition.containsKey(contentKey)) {
	                    int previousY = cardContentToYPosition.get(contentKey);
	                    if (Math.abs(previousY - y) < 50) continue;
	                }

	                cardContentToYPosition.put(contentKey, y);
	                visibleCardPosition++;

	                ExtentsReportManager.extentReportLogging("info", 
	                    "elementId: " + elementId + 
	                    ", Pos: " + visibleCardPosition + 
	                    ", content-desc: " + contentDesc + 
	                    ", text: " + text + 
	                    ", resourceId: " + resourceId);

	                // Check for dfp card using resource-id or content-desc
	                boolean isDfpCard = (resourceId != null && resourceId.toLowerCase().contains("dfp")) ||
	                                    (contentDesc != null && contentDesc.toLowerCase().contains("dfp"));

	                if (isDfpCard) {
	                	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
	                    ExtentsReportManager.extentReportLogging("pass", "DFP Ad found at position: " + visibleCardPosition);
	                    return visibleCardPosition;
	                } else {
	                    nondfpCardCount++;
	                    ExtentsReportManager.extentReportLogging("info", "Non-DFP card #" + nondfpCardCount + " at position " + visibleCardPosition);

	                    if (nondfpCardCount > 12) {
	                        ExtentsReportManager.extentReportLogging("info", "11 non-dfp cards seen. Aborting search.");
	                        return -1;
	                    }
	                }
	            } catch (Exception e) {
	                System.out.println("Error processing card: " + e.getMessage());
	            }
	        }

	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
	        scrollCount++;
	    }

	    ExtentsReportManager.extentReportLogging("Warning", "DFP Ad not found after full scroll.");
	    return -1;
	    
	} catch (Exception e) {
        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getDfpAdPosition()<br />" + e);
        throw e;
    }
	}

	public int getBrazeCardPositionBasedonMatchday(int displayTimeInHours) {
	    final int DEFAULT_POSITION = 2;
	    final int MATCH_CENTRE_POSITION = 3;
	    int position = DEFAULT_POSITION;

	    try {
	        if (!unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.isEmpty()) {
	            String cardText = unitedNowPageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText();

	            if ("LIVE MATCH CENTRE".equalsIgnoreCase(cardText)) {
	                // Get current UK time
	                ZoneId ukZone = ZoneId.of("Europe/London");
	                ZonedDateTime nowUK = ZonedDateTime.now(ukZone);
	                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
	                String appOpenTime = nowUK.format(formatter);

	                // Extract match start time from UI
	                WebElement timerElement = driver.findElement(By.xpath(
	                    "//*[contains(@resource-id, 'linearlayout_match_parent_center_header')]/android.widget.LinearLayout/android.widget.TextView[1]"
	                ));
	                String matchStartTime = timerElement.getText().trim();
	                System.out.println("Timer Text: " + matchStartTime);

	                // Parse times
	                SimpleDateFormat format = new SimpleDateFormat("hh:mm");
	                Date matchStart = format.parse(matchStartTime);
	                Date appOpen = format.parse(appOpenTime);

	                // Calculate time difference in minutes
	                long diffMillis = appOpen.getTime() - matchStart.getTime();
	                int diffMinutes = (int) (diffMillis / (60 * 1000));
	                int displayWindowMinutes = displayTimeInHours * 60;

	                // Determine position
	                if (diffMinutes >= 0 && diffMinutes <= displayWindowMinutes) {
	                    position = MATCH_CENTRE_POSITION;
	                }

	                ExtentsReportManager.extentReportLogging("pass",
	                    "Match Live - Based on calculation Braze Card position should be: " + position);
	            }
	        }
	    } catch (ParseException e) {
	        throw new RuntimeException("Invalid time format. Expected format like '3:00'.", e);
	    } catch (Exception e) {
	        throw new RuntimeException("Error extracting match start time from card element.", e);
	    }

	    return position;
	}

	

	
	public int getBrazeCardPosition(int maxScrolls) throws Exception {
		try {
		 int scrollCount = 0;
		    int visibleCardPosition = 0;
		    int nonbrazeCardCount = 0;
		    List<WebElement> closeUpsell = driver.findElements(By.xpath("//*[@content-desc='Close Notification']"));
		    if (closeUpsell.size()>0) {
				waitForVisibilityFluentWait(closeUpsell.get(0), 60);
				closeUpsell.get(0).click();
				ExtentsReportManager.extentReportLogging("info", "Clicks on close icon in Upsell PopUp in UnitedNow ");
			}
		    
		    Set<String> seenElementIds = new HashSet<>();
		    Map<String, Integer> cardContentToYPosition = new HashMap<>();

		    String cardXpath = "//*[contains(@resource-id, 'card_view') or contains(@resource-id, 'brazeUnitedNowFragment') or contains(@resource-id,'linear_layout_dfp')]";

		    boolean filterAppeared = false;
		    int maxMainFilterScrolls = 10;
		    // Step 1: Scroll until filter appears and disappears
		    while (scrollCount < maxMainFilterScrolls) {
		        try {
		            WebElement filterElement = driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id, ':id/mFilterLay')]"));

		            if (filterElement.isDisplayed()) {
		                Point location = filterElement.getLocation();
		                Dimension screenSize = driver.manage().window().getSize();
		                int threshold = screenSize.getHeight() / 4;

		                if (!filterAppeared && location.getY() <= threshold) {
		                    filterAppeared = true;
		                    ExtentsReportManager.extentReportLogging("info", "Filter appeared near top.");
		                }

		                if (filterAppeared && !filterElement.isDisplayed()) {
		                    ExtentsReportManager.extentReportLogging("info", "Filter disappeared. Stopping scroll.");
		                    break;
		                }
		            }
		        } catch (Exception e) {
		            if (filterAppeared) {
		                ExtentsReportManager.extentReportLogging("info", "Filter not found after appearing. Stopping scroll.");
		                break;
		            }
		        }

		        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
		        scrollCount++;
		    }
		    

		    if (!filterAppeared) {
		    	ExtentsReportManager.extentReportLogging("info", "Filter never appeared after max scrolls.");
		    }

		    
		    while (scrollCount < maxScrolls) {
		        List<WebElement> cardElements = driver.findElements(By.xpath(cardXpath));
		        Thread.sleep(40);
		        for (WebElement card : cardElements) {
		            try {
		                if (!card.isDisplayed()) continue;

		                String elementId = ((RemoteWebElement) card).getId();
		               // ExtentsReportManager.extentReportLogging("pass",  "elementId: " + elementId +", Pos: " + visibleCardPosition );
		                if (seenElementIds.contains(elementId)) continue;

		                seenElementIds.add(elementId);

		                // Unique key to detect duplicates
		                String resourceId = card.getDomAttribute("resourceId");
		                String text = "";
		                String className = "";
		                String contentDesc = "";

		                try {
		                    WebElement textView = card.findElement(By.xpath(".//android.widget.TextView"));
		                    text = textView.getText();
		                } catch (Exception e) {}

		                try {
		                    WebElement imageView = card.findElement(By.xpath(".//android.widget.ImageView"));
		                    contentDesc = imageView.getDomAttribute("content-desc");
		                    className = imageView.getDomAttribute("class");
		                } catch (Exception e) {}


		                String contentKey = (resourceId + "|" + text + "|" + className + "|" + contentDesc).trim();
		                int y = card.getLocation().getY();

		                if (cardContentToYPosition.containsKey(contentKey)) {
		                    int previousY = cardContentToYPosition.get(contentKey);
		                    if (Math.abs(previousY - y) < 50) continue;
		                }

		                cardContentToYPosition.put(contentKey, y);
		                visibleCardPosition++;

		                ExtentsReportManager.extentReportLogging("pass", 
		                    "elementId: " + elementId + 
		                    ", Pos: " + visibleCardPosition + 
		                    ", content-desc: " + contentDesc + 
		                    ", text: " + text + 
		                    ", resourceId: " + resourceId);

		                // Check for braze card using resource-id or content-desc
		                boolean isBrazeCard = (resourceId != null && resourceId.toLowerCase().contains("braze")) ||
		                                    (contentDesc != null && contentDesc.toLowerCase().contains("braze"));

		                if (isBrazeCard) {
		                	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
		                    ExtentsReportManager.extentReportLogging("pass", "Braze Card found at position: " + visibleCardPosition);
		                    return visibleCardPosition;
		                } else {
		                    nonbrazeCardCount++;
		                    ExtentsReportManager.extentReportLogging("info", "Non-Braze card #" + nonbrazeCardCount + " at position " + visibleCardPosition);

		                    if (nonbrazeCardCount > 4) {
		                        ExtentsReportManager.extentReportLogging("info", "4 non-braze cards seen. Aborting search.");
		                        return -1;
		                    }
		                }
		            } catch (Exception e) {
		                System.out.println("Error processing card: " + e.getMessage());
		            }
		        }

		        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
		        scrollCount++;
		    }

		    ExtentsReportManager.extentReportLogging("fail", "Braze Card not found after full scroll.");
		    return -1;
	
	} catch (Exception e) {
        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getBrazeCardPosition()<br />" + e);
        throw e;
    }
	}
}
