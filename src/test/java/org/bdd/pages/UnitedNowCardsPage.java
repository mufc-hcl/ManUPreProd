package org.bdd.pages;

import java.util.ArrayList;
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

		boolean filterAppeared = false;

		// Step 1: Scroll until filter appears and disappears
		boolean cardVisibleAfterFilter = false;

		while (scrollCount < maxMainFilterScrolls) {
		    try {
		        WebElement filterElement = isAndroid
						? driver.findElement(
								By.xpath("//android.view.ViewGroup[contains(@resource-id, ':id/MainFilterViewOld')]"))
						: driver.findElement(By.xpath("//XCUIElementTypeButton[@name='filterIcon']"));

		        if (filterElement.isDisplayed()) {
		            Point location = filterElement.getLocation();

		            Dimension screenSize = driver.manage().window().getSize();
		            int screenHeight = screenSize.getHeight();
		            int threshold = screenHeight / 4; // top 25% of screen

		            if (!filterAppeared && location.getY() <= threshold) {

		                filterAppeared = true;
		                ExtentsReportManager.extentReportLogging("info", "Filter appeared near top.");

		                // Check if any card is already visible
		                List<WebElement> initialCards = driver.findElements(By.xpath(cardXpath));
		                for (WebElement card : initialCards) {
		                    if (card.isDisplayed()) {
		                        ExtentsReportManager.extentReportLogging("pass",
		                                "Card already visible after filter appeared. Skipping further scroll.");
		                        cardVisibleAfterFilter = true;
		                        break;
		                    }
		                }

		                if (cardVisibleAfterFilter) {
		                    break; // Exit the outer while loop
		                }
		            }

		            if (filterAppeared && !filterElement.isDisplayed()) {
		                ExtentsReportManager.extentReportLogging("info", "Filter disappeared. Stopping scroll.");
		                break;
		            }
		        }
		    } catch (Exception e) {
		        if (filterAppeared) {
		            ExtentsReportManager.extentReportLogging("info",
		                    "Filter not found after appearing. Stopping scroll.");
		            break;
		        }
		    }

		    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
		    scrollCount++;
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

			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
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
				"Successfully validated ≥35 displayed cards. Final count: " + finalCount);
		return true;
	}

//	public int getDfpAdPosition(int maxScrolls) {
//		int scrollCount = 0;
//		int visibleCardPosition = 0;
//		Set<String> seenElementIds = new HashSet<>();
//		int maxMainFilterScrolls = 10;
//
//		String cardXpath = "//*[contains(@resource-id, ':id/card_view') or contains(@resource-id, 'brazeUnitedNowFragment')]";
//		String dfpXpath = "//android.widget.LinearLayout[contains(@resource-id,'linear_layout_dfp')]";
//
//		boolean filterAppeared = false;
//
//		// Step 1: Scroll until filter appears and disappears
//		boolean cardVisibleAfterFilter = false;
//
//		while (scrollCount < maxMainFilterScrolls) {
//		    try {
//		        WebElement filterElement = driver.findElement(
//		                By.xpath("//android.widget.ImageView[contains(@resource-id, ':id/mFilterLay')]"));
//
//		        if (filterElement.isDisplayed()) {
//		            Point location = filterElement.getLocation();
//
//		            Dimension screenSize = driver.manage().window().getSize();
//		            int screenHeight = screenSize.getHeight();
//		            int threshold = screenHeight / 4; // top 25% of screen
//
//		            if (!filterAppeared && location.getY() <= threshold) {
//
//		                filterAppeared = true;
//		                ExtentsReportManager.extentReportLogging("info", "Filter appeared near top.");
//
//		                // Check if any card is already visible
//		                List<WebElement> initialCards = driver.findElements(By.xpath(cardXpath));
//		                for (WebElement card : initialCards) {
//		                    if (card.isDisplayed()) {
//		                        ExtentsReportManager.extentReportLogging("pass",
//		                                "Card already visible after filter appeared. Skipping further scroll.");
//		                        cardVisibleAfterFilter = true;
//		                        break;
//		                    }
//		                }
//
//		                if (cardVisibleAfterFilter) {
//		                    break; // Exit the outer while loop
//		                }
//		            }
//
//		            if (filterAppeared && !filterElement.isDisplayed()) {
//		                ExtentsReportManager.extentReportLogging("info", "Filter disappeared. Stopping scroll.");
//		                break;
//		            }
//		        }
//		    } catch (Exception e) {
//		        if (filterAppeared) {
//		            ExtentsReportManager.extentReportLogging("info",
//		                    "Filter not found after appearing. Stopping scroll.");
//		            break;
//		        }
//		    }
//
//		    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
//		    scrollCount++;
//		}
//
//
//		// Step 2: Search for card views and DFP ad positions
//		int scrollForCards = 0;
//		while (scrollForCards < maxScrolls) {
//			List<WebElement> cardViewElements = driver.findElements(By.xpath(cardXpath));
//			List<WebElement> dfpAdElements = driver.findElements(By.xpath(dfpXpath));
//
//			List<WebElement> allCards = new ArrayList<>();
//			allCards.addAll(cardViewElements);
//			allCards.addAll(dfpAdElements);
//
//			for (WebElement card : allCards) {
//				try {
//					if (!card.isDisplayed())
//						continue;
//
//					String elementId = ((RemoteWebElement) card).getId();
//					if (seenElementIds.contains(elementId))
//						continue;
//
//					seenElementIds.add(elementId);
//					visibleCardPosition++;
//
//					ExtentsReportManager.extentReportLogging("pass", "elementId " + elementId + " visibleCardPosition: "
//							+ visibleCardPosition + " scrollForCards: " + scrollForCards);
//
//					String resourceIdOrName = card.getAttribute("resource-id");
//
//					if (resourceIdOrName != null && (resourceIdOrName.contains("linear_layout_dfp")
//							|| resourceIdOrName.toLowerCase().contains("dfp"))) {
//
//						if (!card.isDisplayed()) {
//							ExtentsReportManager.extentReportLogging("info",
//									"DFP ad found but not displayed yet. Scrolling");
//							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
//							continue;
//						}
//
//						ExtentsReportManager.extentReportLogging("pass",
//								"DFP ad found at position: " + visibleCardPosition);
//						return visibleCardPosition;
//					}
//				} catch (Exception e) {
//					System.out.println("Error processing card: " + e.getMessage());
//				}
//			}
//
//			if (visibleCardPosition == 12) {
//				ExtentsReportManager.extentReportLogging("info", "Reached 11 visible cards without DFP. Exiting.");
//				return -1;
//			}
//
//			scrollForCards++;
//			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
//		}
//
//		ExtentsReportManager.extentReportLogging("fail", "DFP ad not found.");
//		return -1;
//	}
	
	
	public int getDfpAdPosition(int maxScrolls) {
	    int scrollCount = 0;
	    int visibleCardPosition = 0;
	    int nondfpCardCount = 0;

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
	                    ", resourceId: " + resourceId);

	                // Check for dfp card using resource-id or content-desc
	                boolean isDfpCard = (resourceId != null && resourceId.toLowerCase().contains("dfp")) ||
	                                    (contentDesc != null && contentDesc.toLowerCase().contains("dfp"));

	                if (isDfpCard) {
	                    ExtentsReportManager.extentReportLogging("pass", "DFP Ad found at position: " + visibleCardPosition);
	                    return visibleCardPosition;
	                } else {
	                    nondfpCardCount++;
	                    ExtentsReportManager.extentReportLogging("info", "Non-DFP card #" + nondfpCardCount + " at position " + visibleCardPosition);

	                    if (nondfpCardCount > 12) {
	                        ExtentsReportManager.extentReportLogging("info", "11+ non-dfp cards seen. Aborting search.");
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

	    ExtentsReportManager.extentReportLogging("fail", "DFP Ad not found after full scroll.");
	    return -1;
	}

	
	public int getDfpAdPosition2(int maxScrolls) {
	    int scrollCount = 0;
	    int visibleCardPosition = 0;
	    int nonabcCardCount = 0;
	    Set<String> seenCardKeys = new HashSet<>();
	    int maxMainFilterScrolls = 10;

	    String cardXpath = "//*[contains(@resource-id, 'card_view') or contains(@resource-id, 'brazeUnitedNowFragment')]";
	    String dfpXpath = "//android.widget.LinearLayout[contains(@resource-id,'linear_layout_dfp')]";

	    boolean filterAppeared = false;

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

	    // Step 2: Scroll and track cards
	    int scrollForCards = 0;
	    while (scrollForCards < maxScrolls) {
	        List<WebElement> cardElements = driver.findElements(By.xpath(cardXpath + " | " + dfpXpath));

	        for (WebElement card : cardElements) {
	            try {
	                if (!card.isDisplayed()) continue;

	                // Build a content-based key
	                String resourceId = card.getAttribute("resourceId");
	                String text = card.getText();
	                String className = card.getAttribute("className");
	                int y = card.getLocation().getY();

	                // Composite key: content + position
	                String cardKey = (resourceId + "|" + text + "|" + className + "|" + y).trim();

	                if (seenCardKeys.contains(cardKey)) continue;
	                seenCardKeys.add(cardKey);
	                visibleCardPosition++;

	                ExtentsReportManager.extentReportLogging("pass", "CardKey: " + cardKey + 
	                        " | Position: " + visibleCardPosition + 
	                        " | Scroll: " + scrollForCards + 
	                        " | ResourceId: " + resourceId);

	                boolean isdfp = resourceId != null && resourceId.toLowerCase().contains("dfp");

	                if (isdfp) {
	                    ExtentsReportManager.extentReportLogging("pass",
	                            "DFP ad found at position: " + visibleCardPosition);
	                    return visibleCardPosition;
	                } else {
	                    nonabcCardCount++;
	                    ExtentsReportManager.extentReportLogging("info",
	                            "Non-DFP card #" + nonabcCardCount + " at position " + visibleCardPosition);

	                    if (nonabcCardCount > 10) {
	                        ExtentsReportManager.extentReportLogging("info",
	                                "More than 10 non-DFP cards seen. DFP ad not in expected position.");
	                        return -1;
	                    }
	                }

	            } catch (Exception e) {
	                System.out.println("Error processing card: " + e.getMessage());
	            }
	        }

	        scrollForCards++;
	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
	    }

	    ExtentsReportManager.extentReportLogging("fail", "ABC ad not found after scrolling.");
	    return -1;
	}

	

}
