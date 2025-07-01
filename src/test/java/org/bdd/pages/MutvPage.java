package org.bdd.pages;

import java.time.Duration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.MutvPageLocators;
import org.bdd.utils.AndroidGenericLibrary;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.GlobalParams;
import org.bdd.utils.IosGenericLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MutvPage extends Common {
	private static final Logger log = LogManager.getLogger(MutvPage.class);
	MutvPageLocators mutvPageLocators;

	public MutvPage() {
		this.mutvPageLocators = new MutvPageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), mutvPageLocators);

	}

	public void clickOnExploreIcon() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				elementToBeClickableFluentWait(mutvPageLocators.exploreBtnMutvScreen, 60);
				mutvPageLocators.exploreBtnMutvScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on exploreBtnMutvScreen ");
//                mutvPageLocators.viewProgramsPopUp.click();
//                ExtentsReportManager.extentReportLogging("pass", "Clicks on viewProgramsPopUp ");
			} else {
				waitForVisibilityFluentWait(mutvPageLocators.exploreBtnMutvScreen, 60);
				mutvPageLocators.exploreBtnMutvScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on exploreBtnMutvScreen ");
//				viewProgramsPopUp.click();
//				 ExtentsReportManager.extentReportLogging("pass","Clicks on viewProgramsPopUp ");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnMutvTab()<br />" + e);
			throw e;
		}
	}

	public void clickOnMutvTab() {
		String device = GlobalParams.getPlatformName();
		;
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(mutvPageLocators.mutvTabMutvScreen, 60);
				mutvPageLocators.mutvTabMutvScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on mutvTabMutvScreen ");
			} else {
				elementToBeClickableFluentWait(mutvPageLocators.mutvTabMutvScreen, 60);
				waitForVisibilityFluentWait(mutvPageLocators.mutvTabMutvScreen, 60);
				mutvPageLocators.mutvTabMutvScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on mutvTabMutvScreen ");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnMutvTab()<br />" + e);
			throw e;
		}
	}

	public void clickOnMyListIcon() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.myListIconMutvScreen, 60);
			mutvPageLocators.myListIconMutvScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on myListIconMutvScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnMyListIcon()<br />" + e);
			throw e;

		}

	}

	public void clickBackBtn() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.backIconMutvScreen, 60);
			mutvPageLocators.backIconMutvScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on backIconMutvScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clickBackBtn()<br />" + e);
			throw e;

		}
	}

	public String getMyListTitleMyListPage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.myListTextMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns myListTextMutvScreen Text");
			return mutvPageLocators.myListTextMutvScreen.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMyListTitleMyListPage()<br />" + e);
			throw e;
		}
	}

	public String getDescriptionMyListPage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.descMyListMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns descMyListMutvScreen Text");
			return mutvPageLocators.descMyListMutvScreen.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getDescriptionMyListPage()<br />" + e);
			throw e;
		}
	}

	public String getAddButtonMylistPage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.addIconMyListMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns addIconMyListMutvScreen Text");
			return mutvPageLocators.addIconMyListMutvScreen.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getAddButtonMylistPage()<br />" + e);
			throw e;
		}
	}

	public Boolean checkBackButtonDisplayed() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.backIconMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns backIconMutvScreen Text");
			return mutvPageLocators.backIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-checkBackButtonDisplayed()<br />" + e);
			throw e;
		}
	}

	public Boolean checkPlusIconDisplayed() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.plusIconMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns plusIconMutvScreen Text");
			return mutvPageLocators.plusIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-checkPlusIconDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clickScheduleIconMutvScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.sheduleIconMutvScreen, 60);
			mutvPageLocators.sheduleIconMutvScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on sheduleIconMutvScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickScheduleIconMutvScreen()<br />" + e);
			throw e;

		}
	}

	public void clickOnBackIconScheduleMutvScreen() {
		try {
//            waitForVisibilityFluentWait(mutvPageLocators.backIconSheduleScreenMutv);
			elementToBeClickableFluentWait(mutvPageLocators.backIconSheduleScreenMutv, 60);
			mutvPageLocators.backIconSheduleScreenMutv.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on backIconSheduleScreenMutv ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnBackIconScheduleMutvScreen()<br />" + e);
			throw e;

		}
	}

	public void clickOnDay(String dayandFutureDay) {
		String device = GlobalParams.getPlatformName();
		;
		try {
			if (device.equalsIgnoreCase("android")) {
//                driver.findElement(By.xpath(
//                                "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.staging_mu_dxc:id/tabTextView\" and @text=\""
//                                        + dayandFutureDay + "\"]"))
				driver.findElement(
						By.xpath("//android.widget.TextView[contains(@resource-id, ':id/tabTextView') and @text='"
								+ dayandFutureDay + "']"))
						.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on dayandFutureDay ");
			} else {
				driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + dayandFutureDay + "Tab Item\"]"))
						.click();

			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clickOnDay()<br />" + e);
			throw e;
		}
	}

	public void clickOnNotNowButtonInMatchAppearanceAlertScreen() {
		try {
			 if (Common.apiEnv().equalsIgnoreCase("prod")) {
			if (!mutvPageLocators.notNowButtonMatchAppearanceAlert1.isEmpty()) {
				waitForVisibilityFluentWait(mutvPageLocators.notNowButtonMatchAppearanceAlert, 60);
				mutvPageLocators.notNowButtonMatchAppearanceAlert.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on notNowButtonMatchAppearanceAlert ");
			}
			 }
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (StaleElementReferenceException se) {
			System.out.println("stale element exception");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnNotNowButtonInMatchAppearanceAlertScreen()<br />" + e);
			throw e;
		}

	}

	public void selectsTheDontAllowButtonInAudioNotificationAlert() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.dontAlowButtonAudioAlert, 60);
			mutvPageLocators.dontAlowButtonAudioAlert.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on dontAlowButtonAudioAlert ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-selectsTheDontAllowButtonInAudioNotificationAlert()<br />" + e);
			throw e;

		}
	}

	public void selectsNotAllowInThePhotosAndVideosAccessInAlert() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.dontAlowButtonPhotosAndVideosAlert, 60);
			mutvPageLocators.dontAlowButtonPhotosAndVideosAlert.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on dontAlowButtonPhotosAndVideosAlert ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-selectsNotAllowInThePhotosAndVideosAccessInAlert()<br />" + e);
			throw e;

		}
	}

	public void clicksOnTheNotificationAtBottomOfScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.notificationUnitedNowBottomScreen, 60);
			mutvPageLocators.notificationUnitedNowBottomScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on notificationUnitedNowBottomScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnTheNotificationAtBottomOfScreen()<br />" + e);
			throw e;

		}
	}

	public void clicksOnPlusIcon() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.plusIconMutvScreen, 60);
			mutvPageLocators.plusIconMutvScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on plusIconMutvScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlusIcon()<br />" + e);
			throw e;

		}
	}

	public void clicksOnOneVideo() {
		try {
			int maxScrollAttempts = 10;
			boolean elementFound = false;

			if (Common.apiEnv().equalsIgnoreCase("prod")) {
				for (int i = 0; i < maxScrollAttempts; i++) {
					if (mutvPageLocators.fullMUTV.size() > 0) {
						elementFound = true;
						break;
					}
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
				}
			} else if (Common.apiEnv().equalsIgnoreCase("stage")) {
				for (int i = 0; i < maxScrollAttempts; i++) {
					if (mutvPageLocators.fullMUTV1.size() > 0) {
						elementFound = true;
						break;
					}
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
				}
			}

			if (!elementFound) {
				throw new NoSuchElementException("One Video MUTV element not found after scrolling.");
			}

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				waitForVisibilityFluentWait(mutvPageLocators.oneVideoMutvScreen, 60);
				mutvPageLocators.oneVideoMutvScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on oneVideoMutvScreen (Stage)");
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				elementToBeClickableFluentWait(mutvPageLocators.oneVideoMutvScreen1, 60);
				mutvPageLocators.oneVideoMutvScreen1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on oneVideoMutvScreen (Prod)");
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnOneVideo()<br />" + e);
			throw e;
		}
	}

	public void clickPlusSymbolMyListScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.plusSymbolMyListScreen, 60);
			mutvPageLocators.plusSymbolMyListScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on plusSymbolMyListScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickPlusSymbolMyListScreen()<br />" + e);
			throw e;

		}

	}

	public boolean getValidateVideoIsDisplayed() {
		try {
			if (mutvPageLocators.vedioTitleLinkInMyListScreenPreprod1.size() > 0) {
				waitForVisibilityFluentWait(mutvPageLocators.vedioTitleLinkInMyListScreenPreprod, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns vedioTitleLinkInMyListScreenPreprod Text");
				return mutvPageLocators.vedioTitleLinkInMyListScreenPreprod.isDisplayed();
			} else if (mutvPageLocators.vedioTitleLinkInMyListScreen1.size() > 0) {
				waitForVisibilityFluentWait(mutvPageLocators.vedioTitleLinkInMyListScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns vedioTitleLinkInMyListScreen Text");
				return mutvPageLocators.vedioTitleLinkInMyListScreen.isDisplayed();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getValidateVideoIsDisplayed()<br />" + e);
			throw e;
		}
		return false;
	}

	public void clickOnVediTitleLink() {
		try {
			if (mutvPageLocators.vedioTitleLinkInMyListScreenPreprod1.size() > 0) {
				waitForVisibilityFluentWait(mutvPageLocators.vedioTitleLinkInMyListScreenPreprod, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns vedioTitleLinkInMyListScreenPreprod Text");
				mutvPageLocators.vedioTitleLinkInMyListScreenPreprod.click();
			} else if (mutvPageLocators.vedioTitleLinkInMyListScreen1.size() > 0) {
				waitForVisibilityFluentWait(mutvPageLocators.vedioTitleLinkInMyListScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns vedioTitleLinkInMyListScreen Text");
				mutvPageLocators.vedioTitleLinkInMyListScreen.click();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getValidateVideoIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clicksOnUncheckMylistIcon() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.tickSymbilMyList, 60);
			mutvPageLocators.tickSymbilMyList.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on tickSymbilMyList ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnUncheckMylistIcon()<br />" + e);
			throw e;

		}
	}

	public void ClickOnLessThanSymbolButtonInMyListScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.lessThenSymbolInMyListScreen, 60);
			mutvPageLocators.lessThenSymbolInMyListScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on lessThenSymbolInMyListScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ClickOnLessThanSymbolButtonInMyListScreen()<br />" + e);
			throw e;

		}
	}

	public void clickOnGreaterThenSymbolInMyListScreen() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.greaterThenSymbolInMyListScreen, 60);
			mutvPageLocators.greaterThenSymbolInMyListScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on greaterThenSymbolInMyListScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnGreaterThenSymbolInMyListScreen()<br />" + e);
			throw e;

		}
	}

	public boolean validateplusIconIsDisplayed() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.plusIconMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns plusIconMutvScreen Text");
			return mutvPageLocators.plusIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateplusIconIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void selectsTheVideoAndCheckCBSBadge() {
		try {
			for (int scrolls = 0; scrolls < 5; scrolls++) {
				for (WebElement video : mutvPageLocators.videosMutvPage) {
					try {
						WebElement subscriptionStatus = video.findElement(By.xpath(
								".//*[contains(@resource-id, 'subscription_status') and contains(@text, 'Subscribe to watch')]"));

						if (subscriptionStatus.isDisplayed()) {
							subscriptionStatus.click();
							ExtentsReportManager.extentReportLogging("pass",
									"Clicked on video with 'Subscribe to watch'");
							return;
						}
					} catch (NoSuchElementException e) {
						// Skip this video if no subscription badge is found
					}
				}

				// Scroll down and try again
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
			}

			ExtentsReportManager.extentReportLogging("info", "No 'Subscribe to watch' video found after scrolling.");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in selectsTheVideoAndCheckCBSBadge()<br />" + e);
			throw e;
		}

//        try {
////            AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "ALL PREMIER LEAGUE GAMES");
//        	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
//            for (int i = 0; i < mutvPageLocators.videosMutvPage.size(); i++) {
//            	try {
//            	    WebElement subscriptionStatus = mutvPageLocators.videosMutvPage.get(i)
//            	        .findElement(By.xpath("//*[contains(@resource-id, 'subscription_status') and contains(@text, 'Register')]"));
//
//            	    if (subscriptionStatus.isDisplayed() && subscriptionStatus.getText().contains("Subscribe to watch")) {
//            	        subscriptionStatus.click();
//            	        ExtentsReportManager.extentReportLogging("pass", "Clicks on videosMutvPage");
//            	        break;
//            	    }
//            	} 
//            	catch (NoSuchElementException n) {
//                    System.out.println("subscribtion not found to this video");
//                }
//            }
//        } catch (Exception e) {
//            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-selectsTheVideoAndCheckCBSBadge()<br />" + e);
//            throw e;
//        }

	}

	public boolean validateSubscribeScreenIsDisplayed() {
		try {
			if (mutvPageLocators.headerCBRCBSPage.isDisplayed()
					&& mutvPageLocators.headerCBRCBSPage.getText().equalsIgnoreCase("SUBSCRIBE"))
				ExtentsReportManager.extentReportLogging("pass", "Returns headerCBRCBSPage Text");
			return mutvPageLocators.headerCBRCBSPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateSubscribeScreenIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clicksCloseButtonInSubscribeScreen() {
		mutvPageLocators.closeButton.click();
		ExtentsReportManager.extentReportLogging("pass", "Clicks on closeButton ");
	}

	public void selectsTheVideoAndChecksCBRBadge() {
		try {
			for (int scrolls = 0; scrolls < 5; scrolls++) {
				for (WebElement video : mutvPageLocators.videosMutvPage) {
					try {
						WebElement subscriptionStatus = video.findElement(By.xpath(
								".//*[contains(@resource-id, 'subscription_status') and contains(@text, 'Register to watch')]"));

						if (subscriptionStatus.isDisplayed()) {
							subscriptionStatus.click();
							ExtentsReportManager.extentReportLogging("pass",
									"Clicked on video with 'Register to watch'");
							return;
						}
					} catch (NoSuchElementException e) {
						// No badge found in this video card, continue
					}
				}

				// Scroll down and try next set
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
			}

			ExtentsReportManager.extentReportLogging("info",
					"No video found with 'Register to watch' after scrolling.");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in selectsTheVideoAndChecksCBRBadge()<br />" + e);
			throw e;
		}

//        try {
//            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
//            for (int i = 0; i < mutvPageLocators.videosMutvPage.size(); i++) {
//            	try {
//            	    WebElement subscriptionStatus = mutvPageLocators.videosMutvPage.get(i)
//            	        .findElement(By.xpath("//*[contains(@resource-id, 'subscription_status') and contains(@text, 'Subscribe')]"));
//
//            	    if (subscriptionStatus.isDisplayed() && subscriptionStatus.getText().contains("Register to watch")) {
//            	        subscriptionStatus.click();
//            	        ExtentsReportManager.extentReportLogging("pass", "Clicks on videosMutvPage ");
//            	        break;
//            	    }
//            	} 
//            	catch (NoSuchElementException n) {
//                    System.out.println("subscribtion not found to this video");
//                }
//            }
//
//        } catch (Exception e) {
//            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-selectsTheVideoAndChecksCBRBadge()<br />" + e);
//            throw e;
//        }
	}

	public boolean validateRegisterScreenIsDisplayed() {
		try {
			if (mutvPageLocators.headerCBRCBSPage.isDisplayed()
					&& mutvPageLocators.headerCBRCBSPage.getText().equalsIgnoreCase("SIGN UP"))
				ExtentsReportManager.extentReportLogging("pass", "Returns headerCBRCBSPage Text");
			return mutvPageLocators.headerCBRCBSPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateRegisterScreenIsDisplayed()<br />" + e);
			throw e;
		}
	}

//    public void clicksOnTheHeroCarouselDotsInMutvScreen() {
//        if (mutvPageLocators.heroCarouselDotsMutvPage.size() > 0) {
//            for (int i = 0; i < mutvPageLocators.heroCarouselDotsMutvPage.size(); i++) {
//                mutvPageLocators.heroCarouselDotsMutvPage.get(i).click();
//                ExtentsReportManager.extentReportLogging("pass", "Clicks on heroCarouselDotsMutvPage ");
//            }
//        }
//    }

	public boolean clicksOnTheHeroCarouselInMutvScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Hero carousel is displayed ");
			return mutvPageLocators.heroCarouselInMutvPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesHeroCardInShopScreen()<br />" + e);
			throw e;
		}
	}
//        try {
//            List<WebElement> dots = mutvPageLocators.heroCarouselDotsMutvPage;
//            if (dots == null || dots.isEmpty()) {
//                ExtentsReportManager.extentReportLogging("info", "No heroCarouselDotsMutvPage elements found.");
//                return false;
//            }
//
//            for (WebElement dot : dots) {
//                if (dot.isDisplayed()) {
//                    try {
//                        dot.click();
//                        ExtentsReportManager.extentReportLogging("pass", "Clicked on heroCarouselDotsMutvPage");
//                    } catch (Exception clickError) {
//                        ExtentsReportManager.extentReportLogging("fail", "Click failed on a visible heroCarouselDot: " + clickError);
//                        return false;
//                    }
//                } else {
//                    ExtentsReportManager.extentReportLogging("fail", "heroCarouselDot is not displayed.");
//                    return false;
//                }
//            }
//
//            return true;
//        } catch (Exception e) {
//            ExtentsReportManager.extentReportLogging(
//                "fail",
//                "Exception in clicksOnTheHeroCarouselDotsInMutvScreen()<br />" + e
//            );
//            return false;
//        }
//    }

//    public void clicksOnTheHeroCarouselDotsInMutvScreenIos() {
//        try {
//            if (mutvPageLocators.heroCarouselDotsMutvPage.size() > 0) {
//                for (int i = 0; i < mutvPageLocators.heroCarouselDotsMutvPage.size(); i++) {
//                    ExtentsReportManager.extentReportLogging("pass", "Swipes to heroCarouselDotsMutvPage ");
//                    System.out.println(mutvPageLocators.heroCarouselDotsMutvPage.get(i));
//                    swipeWithCoordinates(299, 297, 88, 310, 200, "left", driver);
//                }
//            }
//        } catch (Exception e) {
//            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clicksOnTheHeroCarouselDotsInMutvScreenIos()<br />" + e);
//            throw e;
//        }
//
//    }

	public boolean clicksOnTheHeroCarouselDotsInMutvScreenIos() {
		try {
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				ExtentsReportManager.extentReportLogging("pass", "Hero carousel is displayed ");
				return mutvPageLocators.heroCarouselInMutvPage.isDisplayed();
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				ExtentsReportManager.extentReportLogging("pass", "Hero carousel is displayed ");
				return mutvPageLocators.heroCarouselInMutvPage1.isDisplayed();
			} else {
				ExtentsReportManager.extentReportLogging("fail", "Unknown environment: " + Common.apiEnv());
				return false;
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnTheHeroCarouselDotsInMutvScreenIos()<br />" + e);
			throw e;
		}
	}

//            List<WebElement> dots = mutvPageLocators.heroCarouselDotsMutvPage;
//            if (dots == null || dots.isEmpty()) {
//                ExtentsReportManager.extentReportLogging("info", "No heroCarouselDotsMutvPage elements found.");
//                return false;
//            }
//
//            for (WebElement dot : dots) {
//                if (dot.isDisplayed()) {
//                    try {
//                        ExtentsReportManager.extentReportLogging("pass", "Swiping to heroCarouselDot");
//                       // System.out.println(dot);
//                        swipeWithCoordinates(299, 297, 88, 310, 200, "left", driver);
//                    } catch (Exception swipeError) {
//                        ExtentsReportManager.extentReportLogging("fail", "Swipe failed for heroCarouselDot: " + swipeError);
//                        return false;
//                    }
//                } else {
//                    ExtentsReportManager.extentReportLogging("fail", "heroCarouselDot is not displayed.");
//                    return false;
//                }
//            }
//
//            return true;
//        } catch (Exception e) {
//            ExtentsReportManager.extentReportLogging("fail", "Exception in clicksOnTheHeroCarouselDotsInMutvScreenIos()<br />" + e);
//            return false;
//        }
//    }

	public boolean validateTimeInScheduleScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns epgTimeSchedulePage Text");
			return mutvPageLocators.epgTimeSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateTimeInScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validateVideoIconInScheduleScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns videoIconSchedulePage Text");
			return mutvPageLocators.videoIconSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateVideoIconInScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatePlayingNowTextInScheduleScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns PlayingNowTextInScheduleScreen Text");
			return mutvPageLocators.playNowTextSchedulePage.isDisplayed()
					&& mutvPageLocators.playNowTextSchedulePage.getText().equalsIgnoreCase("PLAYING NOW");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatePlayingNowTextInScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validateVideoTitleInScheduleScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns videoTitleSchedulePage Text");
			return mutvPageLocators.videoTitleSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateVideoTitleInScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatePlayButtonInScheduleScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns playNowButtonSchedulePage Text");
			return mutvPageLocators.playNowButtonSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatePlayButtonInScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPlayButtonInScheduleScreen() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.playNowButtonSchedulePage, 60);
			mutvPageLocators.playNowButtonSchedulePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on playNowButtonSchedulePage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlayButtonInScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksPauseButton() throws Exception {
		try {
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				Thread.sleep(10000);
				elementToBeClickableFluentWait(mutvPageLocators.pauseButton1, 60);
				mutvPageLocators.pauseButton1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on pauseButton ");
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				Thread.sleep(10000);
				elementToBeClickableFluentWait(mutvPageLocators.pauseButton, 60);
				mutvPageLocators.pauseButton.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on pauseButton ");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksPauseButton()<br />" + e);
			throw e;
		}
	}

	public void clicksOnCloseButton() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.closeButtonVideo, 60);
			mutvPageLocators.closeButtonVideo.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on closeButtonVideo ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnCloseButton()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPlusIconInMutvScheduleScreen() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.plusIconMutvSchedulePage, 60);
			mutvPageLocators.plusIconMutvSchedulePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on plusIconMutvSchedulePage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlusIconInMutvScheduleScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnGoToSettings() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.goToSettingsEnableAlert, 60);
			mutvPageLocators.goToSettingsEnableAlert.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on goToSettingsEnableAlert ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnGoToSettings()<br />" + e);
			throw e;
		}
	}

	public void clicksOnNotificationFromAppInfoScreen() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.notificationsAppInfoPage, 60);
			mutvPageLocators.notificationsAppInfoPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on notificationsAppInfoPage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnNotificationFromAppInfoScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnSetRemainderIcon() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.setReminderIcon, 60);
			mutvPageLocators.setReminderIcon.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on setReminderIcon ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnSetRemainderIcon()<br />" + e);
			throw e;
		}
	}

	public void clicksOnManUtdStageInAlarmAndReminder() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.manUtdStageAlarmReminder, 60);
			mutvPageLocators.manUtdStageAlarmReminder.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on manUtdStageAlarmReminder ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnManUtdStageInAlarmAndReminder()<br />" + e);
			throw e;
		}
	}

	public void clicksOnAlarmSwitchInAlarmAndRemainder() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.reminderAlarmReminder, 60);
			mutvPageLocators.reminderAlarmReminder.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on reminderAlarmReminder ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnAlarmSwitchInAlarmAndRemainder()<br />" + e);
			throw e;
		}
	}

	public void clicksOnRemainderSetIcon() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.setReminderIcon, 60);
			mutvPageLocators.setReminderIcon.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on setReminderIcon ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnRemainderSetIcon()<br />" + e);
			throw e;
		}
	}

	public boolean validateTheTickIconDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns plusIconMutvSchedulePage Text");
			return mutvPageLocators.plusIconMutvSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateTheTickIconDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clickOnAVideoInMutvPage() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.videoMutvPage, 60);
			mutvPageLocators.videoMutvPage.click();
			if (!mutvPageLocators.playIconFullEpisodeTypeVideo1.isEmpty()) {
				mutvPageLocators.playIconFullEpisodeTypeVideo1.get(0).click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on videoMutvPage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnAVideoInMutvPage()<br />" + e);
			throw e;
		}
	}

	public String obtainedTheCurrentVideoTime() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.currentPlayTimeVideoMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns currentPlayTimeVideoMutvPage Text");
			return mutvPageLocators.currentPlayTimeVideoMutvPage.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-obtainedTheCurrentVideoTime()<br />" + e);
			throw e;
		}

	}

	public void playsTheVideoForTwentySeconds() throws Exception {
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-playsTheVideoForTwentySeconds()<br />" + e);
			throw e;
		}
	}

	public String obtainedTheTotalVideoTime() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.totalPlayTimeVideoMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns totalPlayTimeVideoMutvPage Text");
			return mutvPageLocators.totalPlayTimeVideoMutvPage.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-obtainedTheTotalVideoTime()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPauseIconInThePlayedVideo() throws Exception {
		clicksPauseButton();
	}

	public void clicksOnTheCloseButtonInThePlayedVideo() {
		clicksOnCloseButton();
	}

	public void clicksOnTheTickIconInIos() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.tickIconMutvSchedulePage, 60);
			mutvPageLocators.tickIconMutvSchedulePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on tickIconMutvSchedulePage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnTheTickIconInIos()<br />" + e);
			throw e;
		}

	}

	public boolean validateTheTickIconDisplayedInIos() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns tickIconMutvSchedulePage Text");
			return mutvPageLocators.tickIconMutvSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateTheTickIconDisplayedInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnRemainderSetIconInIos() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.reminderSetIcon, 60);
			mutvPageLocators.reminderSetIcon.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on reminderSetIcon ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnRemainderSetIconInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validateCloseIconIsDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns closeIconMutvSchedulePage Text");
			return mutvPageLocators.closeIconMutvSchedulePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateCloseIconIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clicksInCloseIconInRemainderSetPage() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.closeIconMutvSchedulePage, 60);
			mutvPageLocators.closeIconMutvSchedulePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on closeIconMutvSchedulePage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksInCloseIconInRemainderSetPage()<br />" + e);
			throw e;
		}
	}

	public void clicksPlayButtonInThePodcastScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.playButtonPodcast, 60);
			mutvPageLocators.playButtonPodcast.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on playButtonPodcast ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksPlayButtonInThePodcastScreen()<br />" + e);
			throw e;
		}
	}

	public boolean verifyPlayButtonForTheSubscribedUser() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.playButtonPodcast, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns playButtonPodcast Text");
			return mutvPageLocators.playButtonPodcast.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-verifyPlayButtonForTheSubscribedUser()<br />" + e);
			throw e;
		}
	}

	public void SelectsTheVideoAndCheckCBSBadgeInIos() throws InterruptedException {
		try {
			int i = 1;
			while (i > 0) {
//                String type = "name";
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
				List<WebElement> e = driver.findElements(
						AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"  Subscribe to watch\"])[1]"));
				if (e.size() > 0) {
					ExtentsReportManager.extentReportLogging("pass", "found video with subscribe to watch");
					e.get(0).click();
//                    e=driver.findElement("");
					Thread.sleep(4000);
					break;
				} else {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
					i++;
					if (i > 30) {
						ExtentsReportManager.extentReportLogging("fail",
								"Failing due to excessive scroll and unable to find the cbs video " + e);
						break;
					}
				}
			}
//			if (!mutvPageLocators.CBSVideoMutvPage.isEmpty()) {
//				mutvPageLocators.CBSVideoMutvPage.get(0).click();
//				ExtentsReportManager.extentReportLogging("pass", "Clicks on close icon in MUTV ");
//			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-SelectsTheVideoAndCheckCBSBadgeInIos()" + e);
			throw e;
		}
	}

	public String getSubscrptionTitleSubcribePage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.titleCBSVideoMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns titleCBSVideoMutvPage Text");
			return mutvPageLocators.titleCBSVideoMutvPage.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getSubscrptionTitleSubcribePage()<br />" + e);
			throw e;
		}
	}

	public String getDescriptionSubscribePage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.descCBSVideoMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns descCBSVideoMutvPage Text");
			return mutvPageLocators.descCBSVideoMutvPage.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getDescriptionSubscribePage()<br />" + e);
			throw e;
		}
	}

	public void ClicksOnLoginButtonInSubscribeScreen() {
		try {
//            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			elementToBeClickableFluentWait(mutvPageLocators.logInBtnInSubscribeScreen, 60);
			mutvPageLocators.logInBtnInSubscribeScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on logInBtnInSubscribeScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ClicksOnLoginButtonInSubscribeScreen()<br />" + e);
			throw e;
		}

	}

	public void ClicksOnPlayIconForCBSVideo() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			elementToBeClickableFluentWait(mutvPageLocators.playIconCBSVideoScreen, 60);
			mutvPageLocators.playIconCBSVideoScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on playIconCBSVideoScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ClicksOnPlayIconForCBSVideo()<br />" + e);
			throw e;
		}

	}

	public void clicksOnLoginButtonInSubscribeScreenInIos() {
		try {
//            elementToBeClickableFluentWait(mutvPageLocators.loginBtnSubscribeScreen, 60);
			mutvPageLocators.loginBtnSubscribeScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on loginBtnSubscribeScreen ");
//			AndroidGenericLibrary.switchToNativeViewIos(((IOSDriver) driver));
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnLoginButtonInSubscribeScreenInIos()<br />" + e);
			throw e;
		}
	}

	public void selectsTheVideoAndCheckCBRBadgeInIos() throws InterruptedException {
		try {
			int i = 1;
			while (i > 0) {
//                String type = "name";
				List<WebElement> e = driver
						.findElements(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"  Register to watch\"])"));
				if (e.size() > 0) {
					ExtentsReportManager.extentReportLogging("pass", "found video with register to watch");
					e.get(0).click();
					Thread.sleep(4000);
					break;
				} else {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
					i++;
					if (i > 30) {
						ExtentsReportManager.extentReportLogging("fail",
								"Failing due to excesive scroll and unable to find the cbr video " + e);
						break;
					}
				}
			}
//            ExtentsReportManager.extentReportLogging("pass", "Checks for Image Card d in united now page");
//            if (mutvPageLocators.CBRVideoMutvPage.isEmpty()) {
//                mutvPageLocators.CBRVideoMutvPage.get(0).click();
//            }
//            if (!mutvPageLocators.CBRVideoMutvPage1.isEmpty()) {
//                mutvPageLocators.CBRVideoMutvPage1.get(0).click();
//            }

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnImagePopUpWindow()<br />" + e);
			throw e;
		}

	}

	public String getSignUpTitleRegisterPage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.signUpTitleRegisterScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns signUpTitleRegisterScreen Text");
			return mutvPageLocators.signUpTitleRegisterScreen.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getSignUpTitleRegisterPage()<br />" + e);
			throw e;
		}
	}

	public String getDescSignUpTitleRegisterPage() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.descSignUpRegisterScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns descSignUpRegisterScreen Text");
			return mutvPageLocators.descSignUpRegisterScreen.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getDescSignUpTitleRegisterPage()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPlayIconForCBRVideo() throws InterruptedException {
		try {
			Thread.sleep(5000);
//            elementToBeClickableFluentWait(mutvPageLocators.playIconCBRVideoScreen, 60);
//            mutvPageLocators.playIconCBRVideoScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on playIconCBRVideoScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlayIconForCBRVideo()<br />" + e);
			throw e;
		}
	}

	public void clicksOnViewAllMutvPage() {
		try {
			for (int i = 0; i < 20; i++) {
				if (mutvPageLocators.faqInMutvPage.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolled down to Faq ViewAllMutvPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-scrollsDownToMyUnitedAllPointsSeasonCard()<br />" + e);
			throw e;
		}
	}

	public boolean MutvTabInTheNavigationBarIsDisplayed() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.mutvTabMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns mutvTabMutvScreen Text");
			return mutvPageLocators.mutvTabMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-MutvTabInTheNavigationBarIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesTheSearchIconInMutvIsDisplayed() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.searchIconMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns searchIconMutvScreen Text");
			return mutvPageLocators.searchIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesTheSearchIconInMutvIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesScheduleIconIsDisplayedInMUTVScreenInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.sheduleIconMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns sheduleIconMutvScreen Text");
			return mutvPageLocators.sheduleIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesScheduleIconIsDisplayedInMUTVScreenInIos()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesMyListIconIsDisplayedInTheMUTVScreenInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.myListIconMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns myListIconMutvScreen Text");
			return mutvPageLocators.myListIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesMyListIconIsDisplayedInTheMUTVScreenInIos()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesHeroContainerIsDisplayedInMUTVIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.heroCarouselMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns heroCarouselMutvPage Text");
			return mutvPageLocators.heroCarouselMutvPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesHeroContainerIsDisplayedInMUTVIos()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesEpisodeCarouselsAreDisplayedIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//	            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(mutvPageLocators.episodeCauroselMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns episodeCauroselMutvScreen Text");
			return mutvPageLocators.episodeCauroselMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesEpisodeCarouselsAreDisplayedIos()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesViewAllButtonIsDisplayedForEpisodeCarouselsInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.viewAllBtnMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns viewAllBtnMutvScreen Text");
			return mutvPageLocators.viewAllBtnMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesViewAllButtonIsDisplayedForEpisodeCarouselsInIos()<br />"
							+ e);
			throw e;
		}
	}

	public boolean ValidatesEpisodeLandingScreenInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.episodeLandingMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns episodeLandingMutvScreen Text");
			return mutvPageLocators.episodeLandingMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesEpisodeLandingScreenInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPlayIconInVideoLandingScreenInIos() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.playIconInEpisodeLandingScreen, 60);
			mutvPageLocators.playIconInEpisodeLandingScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on playIconInEpisodeLandingScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlayIconInVideoLandingScreenInIos()<br />" + e);
			throw e;
		}

	}

	public void clicksOnFullEpisodeTypeVideosInVideoLandingScreen() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.fullEpisodeTypeVideo, 60);
			mutvPageLocators.fullEpisodeTypeVideo.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fullEpisodeTypeVideo ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnFullEpisodeTypeVideosInVideoLandingScreen()<br />" + e);
			throw e;
		}

	}

	public boolean ValidatesFullEpisodeLandingScreenInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.fullEpisodeTypeVideoLandingScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns fullEpisodeTypeVideoLandingScreen Text");
			return mutvPageLocators.fullEpisodeTypeVideoLandingScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesFullEpisodeLandingScreenInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnViewAllMutvPageInIos() {
		try {
//			 IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			elementToBeClickableFluentWait(mutvPageLocators.viewAllBtnMutvScreen1, 60);
			mutvPageLocators.viewAllBtnMutvScreen1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on viewAllBtnMutvScreen1 ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnViewAllMutvPageInIos()<br />" + e);
			throw e;
		}

	}

	public boolean ValidatesClipTypeVideoPlaysTheVideosInFullScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.clipTypeVideo, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns clipTypeVideo Text");
			return mutvPageLocators.clipTypeVideo.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-ValidatesClipTypeVideoPlaysTheVideosInFullScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesPlusIconIsDisplayedInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.plusIconInMyListScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns plusIconInMyListScreen Text");
			return mutvPageLocators.plusIconInMyListScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesPlusIconIsDisplayedInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPlusIconInPodcastAudioScreen() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.plusIconInpodcastAudioScreen, 60);
			mutvPageLocators.plusIconInpodcastAudioScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on plusIconInpodcastAudioScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlusIconInPodcastAudioScreen()<br />" + e);
			throw e;
		}

	}

	public boolean validatesTheCBRVideoInMyListScreenInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.cbrVideoInMyListScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns cbrVideoInMyListScreen Text");
			return mutvPageLocators.cbrVideoInMyListScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheCBRVideoInMyListScreenInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheCBSVideoInMyListScreenInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.cbrVideoInMyListScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns cbrVideoInMyListScreen Text");
			return mutvPageLocators.cbrVideoInMyListScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheCBSVideoInMyListScreenInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnOnePodcastAudioInIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			elementToBeClickableFluentWait(mutvPageLocators.podcastAudioInMutvScreen, 60);
			mutvPageLocators.podcastAudioInMutvScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on podcastAudioInMutvScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnOnePodcastAudioInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnCBRVideoIconInMylistScreenInIos() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.fullEpisodeTypeVideo, 60);
			mutvPageLocators.fullEpisodeTypeVideo.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fullEpisodeTypeVideo ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnCBRVideoIconInMylistScreenInIos()<br />" + e);
			throw e;
		}

	}

	public void clicksOnCBSVideoIconInMylistScreenInIos() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.fullEpisodeTypeVideo, 60);
			mutvPageLocators.fullEpisodeTypeVideo.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fullEpisodeTypeVideo ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnCBSVideoIconInMylistScreenInIos()<br />" + e);
			throw e;
		}

	}

	public boolean validatesPodcastAudioInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.podcastAudioMyListScren, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns podcastAudioMyListScren Text");
			return mutvPageLocators.podcastAudioMyListScren.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesPodcastAudioInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheMutvTabInTheNavigationBar() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.mutvTabMutvScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns mutvTabMutvScreen Text");
			return mutvPageLocators.mutvTabMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheMutvTabInTheNavigationBar()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheSearchOptionInMutvScreen() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.searchPodcast, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns searchPodcast Text");
			return mutvPageLocators.searchPodcast.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheSearchOptionInMutvScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesScheduleIconDisplayedInMutvScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns sheduleIconMutvScreen Text");
			return mutvPageLocators.sheduleIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesScheduleIconDisplayedInMutvScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMS() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns heroCardMutvPage Text");
			return mutvPageLocators.heroCardMutvPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMS()<br />"
							+ e);
			throw e;
		}
	}

	public List<Boolean> validatesEpisodeCarouselsAreDisplayedInMutvScreen() {
		List<Boolean> flag = new ArrayList<>();

		try {
			if (mutvPageLocators.episodesCarousel.size() > 0) {
				for (int i = 0; i < mutvPageLocators.episodesCarousel.size(); i++) {
					flag.add(true);
				}
			} else
				flag.add(false);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesEpisodeCarouselsAreDisplayedInMutvScreen()<br />" + e);
			throw e;
		}
		return flag;
	}

	public boolean navigatesToOneOfTheEpidsodeCaroselAndValidatesTheViewAllButton() {
		try {
			AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "BARCELONA: THE FIRST LEG");
			ExtentsReportManager.extentReportLogging("pass", "Returns viewAllButton Text");
			return mutvPageLocators.viewAllButton.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-navigatesToOneOfTheEpidsodeCaroselAndValidatesTheViewAllButton()<br />"
							+ e);
			throw e;
		}
	}

	public boolean tapsAndVerifyEpisodeLandingScreenIsDisplayed() {
		try {
			mutvPageLocators.viewAllButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Returns episodeLandingPage Text");
			return mutvPageLocators.episodeLandingPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-tapsAndVerifyEpisodeLandingScreenIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean tapsFullEpisodeTypeVideosAndVerifyVideoLandingPageIsDisplayed() {
		try {
			mutvPageLocators.fullEpisodeTypeVideo.click();
			ExtentsReportManager.extentReportLogging("pass", "Returns playIconFullEpisodeTypeVideo Text");
			return mutvPageLocators.playIconFullEpisodeTypeVideo.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-tapsFullEpisodeTypeVideosAndVerifyVideoLandingPageIsDisplayed()<br />"
							+ e);
			throw e;
		}
	}

	public boolean tapsClipAndVideoPlaysInFullScreen() {
		try {
			mutvPageLocators.playIconFullEpisodeTypeVideo.click();
			ExtentsReportManager.extentReportLogging("pass", "Returns closeButtonVideo Text");
			return mutvPageLocators.closeButtonVideo.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-tapsClipAndVideoPlaysInFullScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesMyListIconIsDisplayedInTopLeftOfMutvScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns myListIconMutvScreen Text");
			return mutvPageLocators.myListIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesMyListIconIsDisplayedInTopLeftOfMutvScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesMyListScreenIsDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns plusIconMutvScreen Text");
			return mutvPageLocators.plusIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesMyListScreenIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean tapsBackIconAndValidateMutvPageIsDisplayed() {
		try {
			mutvPageLocators.greaterThenSymbolInMyListScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Returns myListIconMutvScreen Text");
			return mutvPageLocators.myListIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-tapsBackIconAndValidateMutvPageIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean userValidatesFindSomethingToAddButtonIsDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns addIconMyListMutvScreen Text");
			return mutvPageLocators.addIconMyListMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-userValidatesFindSomethingToAddButtonIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean validatesPlusIconIsDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns plusIconMutvScreen Text");
			return mutvPageLocators.plusIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesPlusIconIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clicksOnLogInButtonForCBRVideo() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.logInBtnRegisterScreen, 60);
			mutvPageLocators.logInBtnRegisterScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on logInBtnRegisterScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnLogInButtonForCBRVideo()<br />" + e);
			throw e;
		}

	}

	public boolean validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMSinios() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns heroCarouselDotsMutvPage1 Text");
			return mutvPageLocators.heroCarouselDotsMutvPage1.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMSinios()<br />"
							+ e);
			throw e;
		}
	}

	public void clicksOnImagePopUpWindow() {
		try {
			String deviceName = new GlobalParams().getDeviceName();
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
			if (mutvPageLocators.imagePopUpWindow.size() > 0) {
				if (deviceName.equalsIgnoreCase("Google Pixel 9")) {
					swipeWithCoordinates(96, 2293, 970, 2293, 200, "left", driver);
				} else {
					swipeWithCoordinates(182, 2128, 871, 2137, 200, "left", driver);
				}
			}
			if (!mutvPageLocators.imagePopUpWindow.isEmpty()) {
				mutvPageLocators.imagePopUpWindow.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on imagePopUpWindow ");
			}
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnImagePopUpWindow()<br />" + e);
			throw e;
		}
	}

	public void clicksOnOnePodcastAudioInMutvScreen() {
		try {
			AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "TOP-RATED UTD PODCASTS");
			waitForVisibilityFluentWait(mutvPageLocators.podcastAudioInMutvScreen, 60);
			mutvPageLocators.podcastAudioInMutvScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on podcastAudioInMutvScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnOnePodcastAudioInMutvScreen()<br />" + e);
			throw e;

		}

	}

	public boolean validatePodcastAudioInMyListScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns podcastAudioMyListScren Text");
			return mutvPageLocators.podcastAudioMyListScren.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatePodcastAudioInMyListScreen()<br />" + e);
			throw e;
		}
	}

	public void NavigatesToCBSVideoInIos() {
		try {
			for (int i = 0; i < 20; i++) {
				if (mutvPageLocators.cbsVideoInMutvScreen.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Navigated to app debut");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAppDebutInIos()<br />" + e);
			throw e;
		}
	}

	public void NavigatesToCBRVideoInIos() {
		try {
			for (int i = 0; i < 20; i++) {
				if (mutvPageLocators.cbrVideoInMutvScreen.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Navigated to app debut");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAppDebutInIos()<br />" + e);
			throw e;
		}

	}

	public void validatesCBRScreeneIsNotDisplayedForLoggedInUser() {
		if (mutvPageLocators.headerCBRCBSPage1.size() == 0) {
			ExtentsReportManager.extentReportLogging("pass", "validates on heroCarouselDotsMutvPage ");
		}
	}

	public void validatesCBSScreeneIsNotDisplayedForLoggedInUser() {
		if (mutvPageLocators.titleCBSVideoMutvPage1.size() == 0) {
			ExtentsReportManager.extentReportLogging("pass", "validates on heroCarouselDotsMutvPage ");
		}
	}

	public boolean ValidatesTheEpgIconInTopRightIsDisplayed() {
		try {
			log.info("Returns EpgIcon Text");
			waitForVisibilityFluentWait(mutvPageLocators.sheduleIconMutvScreen, 60);
			return mutvPageLocators.sheduleIconMutvScreen.isDisplayed();
		} catch (Exception e) {
			log.error("Exception occured in function-ValidatesTheEpgIconInTopRightIsDisplayed()" + e);
			throw e;
		}
	}

	public boolean validatesTheScheduleIconInEpgSchedulePage() {
		try {
			log.info("Returns scheduleTextInEPGPage Text");
			waitForVisibilityFluentWait(mutvPageLocators.scheduleTextInEPGPage, 60);
			return mutvPageLocators.scheduleTextInEPGPage.isDisplayed();
		} catch (Exception e) {
			log.error("Exception occured in function-validatesTheScheduleIconInEpgSchedulePage()" + e);
			throw e;
		}
	}

	public boolean validatesCBSBadgesForFutureScheduleProgram() {
		try {
			log.info("Returns EpgIcon Text");
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(mutvPageLocators.cbsBadgeInSchedulePage, 60);
			return mutvPageLocators.cbsBadgeInSchedulePage.isDisplayed();
		} catch (Exception e) {
			log.error("Exception occured in function-ValidatesTheEpgIconInTopRightIsDisplayed()" + e);
			throw e;
		}
	}

	public boolean validatesCBSBadgesForPreviousScheduleProgram() {
		try {
			log.info("Returns scheduleTextInEPGPage Text");
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
			waitForVisibilityFluentWait(mutvPageLocators.cbsBadgeInSchedulePage, 60);
			return mutvPageLocators.cbsBadgeInSchedulePage.isDisplayed();
		} catch (Exception e) {
			log.error("Exception occured in function-validatesTheScheduleIconInEpgSchedulePage()" + e);
			throw e;
		}
	}

	public boolean validatesMutvIconAndDescriptionAlongWithProgramDetails() {
		try {
			log.info("Returns MutvIconAndDescriptionAlong program Text");
			return (mutvPageLocators.mutvIconInSetReminderSchedule.isDisplayed()
					&& mutvPageLocators.showingTimeInSetReminderSchedule.isDisplayed()
					&& mutvPageLocators.descSetReminderSchedule.isDisplayed());
		} catch (Exception e) {
			log.error("Exception occured in function-validatesMutvIconAndDescriptionAlongWithProgramDetails()" + e);
			throw e;
		}
	}

	public boolean validatesSetReminderButtonAndCloseButton() {
		try {
			log.info("Returns SetReminderButton And CloseButton Text");
			return (mutvPageLocators.setReminderButtonInSchedulePage.isDisplayed()
					&& mutvPageLocators.closeButtonInSchedulePage.isDisplayed());
		} catch (Exception e) {
			log.error("Exception occured in function-validatesSetReminderButtonAndCloseButton()" + e);
			throw e;
		}
	}

	public String getPodcastTextFromMUTVScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(mutvPageLocators.podcastTextInMUTV, 30);
				ExtentsReportManager.extentReportLogging("pass", "Returns podcast text in MUTV screen");
				return mutvPageLocators.podcastTextInMUTV.getText();
			} else {
				waitForVisibilityFluentWait(mutvPageLocators.podcastTextInMUTV, 30);
				ExtentsReportManager.extentReportLogging("pass", "Returns podcast text in MUTV screen");
				return mutvPageLocators.podcastTextInMUTV.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPodcastTextFromMUTVScreen()<br />" + e);
			throw e;
		}
	}

	public void scrolldownToViewAllAndClickonViewAll() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "EPC 10 MOST EMOTIONAL MOMENTS");
				mutvPageLocators.viewAllButton.click();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				mutvPageLocators.viewAllButton.click();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesToAppDebutInIos()<br />" + e);
			throw e;
		}

	}

	public List getViewAllListOneInMUTVScreen() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> actualShopMenuItems = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				for (int i = 0; i < mutvPageLocators.viewAllListOne.size(); i++) {
					actualShopMenuItems.add(mutvPageLocators.viewAllListOne.get(i).getText().toLowerCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns view all list");
			} else {
				for (int i = 0; i < mutvPageLocators.viewAllListOne.size(); i++) {
					actualShopMenuItems.add(mutvPageLocators.viewAllListOne.get(i).getText().toLowerCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns view all list");
			}
			return actualShopMenuItems;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getViewAllListOneInMUTVScreen()<br />" + e);
			throw e;
		}
	}

	public List getEpgScheduleWeeklyDescriptionListOneInMUTVScreen() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> actualShopMenuItems = new ArrayList<>();
		Set<String> uniqueString = new HashSet<>(actualShopMenuItems);
		int size = mutvPageLocators.epgScheduleWeeklyDescription.size();
		try {
			if (device.equalsIgnoreCase("android")) {
//				for (int j = 0; j < 3; j++) {
				for (int i = 0; i < size; i++) {
					actualShopMenuItems
							.add(mutvPageLocators.epgScheduleWeeklyDescription.get(i).getText().toLowerCase());

				}
				uniqueString.addAll(actualShopMenuItems);
//					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.92);
//				}
////				uniqueString.addAll(actualShopMenuItems);
				ExtentsReportManager.extentReportLogging("pass", "Returns view all list");
			} else {
//				for (int j = 0; j < 3; j++) {
				for (int i = 0; i < size; i++) {
					actualShopMenuItems.add(
							mutvPageLocators.epgScheduleWeeklyDescription.get(i).getDomAttribute("name").toLowerCase());
				}
				uniqueString.addAll(actualShopMenuItems);
//					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.92);
//				}
////				uniqueString.addAll(actualShopMenuItems);
				ExtentsReportManager.extentReportLogging("pass", "Returns view all list");
			}
			ArrayList<String> calenderlist1 = new ArrayList<>(uniqueString);
			Collections.sort(calenderlist1);
			return calenderlist1;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getViewAllListOneInMUTVScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksSearchInMutvScreen() {
		try {
//            elementToBeClickableFluentWait(explorePageLocators.searchButtonUnitedPage,5);
			elementToBeClickableFluentWait(mutvPageLocators.searchButtonUnitedPage, 60);
			mutvPageLocators.searchButtonUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage");
		} catch (WebDriverException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", mutvPageLocators.searchButtonUnitedPage);
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksSearchInUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public String getMyListTitle() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				// waitForVisibilityFluentWait(mutvPageLocators.MyListTitle, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns My List Title text ");
				return mutvPageLocators.MyListTitle.getText();
			} else {
				// waitForVisibilityFluentWait(mutvPageLocators.MyListTitle, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns My List Title text");
				return mutvPageLocators.MyListTitle.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMyListTitle()<br />" + e);
			throw e;
		}
	}

	public String getMyListDesc() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				// waitForVisibilityFluentWait(mutvPageLocators.MyListDesc, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns My List Desc text ");
				return mutvPageLocators.MyListDesc.getText();
			} else {
				// waitForVisibilityFluentWait(mutvPageLocators.MyListDesc, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my My List Desc text");
				return mutvPageLocators.MyListDesc.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMyListDesc()<br />" + e);
			throw e;
		}
	}

	public String getFindSomeThingToAdd() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				// waitForVisibilityFluentWait(mutvPageLocators.FindSomeThingToAdd, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Find SomeThing To Add text ");
				return mutvPageLocators.FindSomeThingToAdd.getText();
			} else {
				// waitForVisibilityFluentWait(mutvPageLocators.FindSomeThingToAdd, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Find SomeThing To Add text");
				return mutvPageLocators.FindSomeThingToAdd.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getFindSomeThingToAdd()<br />" + e);
			throw e;
		}
	}

	public ArrayList<String> getCarouselListFromSearchPage() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> carouselList = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				for (int i = 0; i < mutvPageLocators.carouselList.size() - 1; i++) {
					carouselList.add(mutvPageLocators.carouselList.get(i).getText().trim().toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns search page carousel values");
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
				for (int i = 0; i < mutvPageLocators.carouselList.size(); i++) {
					carouselList.add(mutvPageLocators.carouselList.get(i).getText().trim().toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns search page carousel values");
			}
			return carouselList;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getCarouselListFromSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clicksOnShopNowPopUP() {
		try {
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
			if (mutvPageLocators.buyORshopNowInUnitedNowPopUp1.isDisplayed()) {
				waitForVisibilityFluentWait(mutvPageLocators.buyORshopNowInUnitedNowPopUp1, 60);
				mutvPageLocators.buyORshopNowInUnitedNowPopUp1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on ok button in shop Now In UnitedNow PopUp");
			}}
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnShopNowPopUP()<br />" + e);
			throw e;
		}
	}

	public void userClicksOnPreferenceCenter() {
		try {
			if (mutvPageLocators.preferenceCenterInMutv.isDisplayed()) {
				elementToBeClickableFluentWait(mutvPageLocators.preferenceCenterInMutv, 60);
				mutvPageLocators.preferenceCenterInMutv.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on preference center in My United");
			} else {
				elementToBeClickableFluentWait(mutvPageLocators.preferenceCenterInMutv, 60);
				mutvPageLocators.preferenceCenterInMutv.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on preference center in My United");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-userClicksOnPreferenceCenter()<br />" + e);
			throw e;
		}
	}

	public void clicksOnNotnowPopUp() {
		try {
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
			if (mutvPageLocators.notNowPopUpInMatchAlert.isDisplayed()) {
				waitForVisibilityFluentWait(mutvPageLocators.notNowPopUpInMatchAlert, 60);
				mutvPageLocators.notNowPopUpInMatchAlert.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on ok button in Not Now In UnitedNow PopUp");
			}
			}
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnNotnowPopUp()<br />" + e);
			throw e;
		}
	}

	public void clicksinAppMsgIOSBrazeTestCloseButton() {
		try {
				if (Common.apiEnv().equalsIgnoreCase("prod")) {
		            if (!mutvPageLocators.closeIconInAppMsgIosBrazeTest1.isEmpty()) {
		                mutvPageLocators.closeIconInAppMsgIosBrazeTest.click();
		                ExtentsReportManager.extentReportLogging("pass", 
		                    "Clicked on Braze in-app message close button in iOS (Stage)");
			  }
				}
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksinAppMsgIOSBrazeTestCloseButton()<br />" + e);
			throw e;
		}
	}

	public boolean CBSCBRBadgesDisplayForPreviousScheduleProgram() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.5);

			if (!mutvPageLocators.cbrBadgeEpgScheduleScreen.isEmpty()
					|| !mutvPageLocators.cbsBadgeEpgScheduleScreen.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass",
						"'Subscribe/Register to Watch' badge found after scrolling above");
				return true;
			}

			ExtentsReportManager.extentReportLogging("fail", "CBRorCBS badge not found after scrolling  above");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in CBSCBRBadgesDisplayForPreviousScheduleProgram()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean CBSCBRBadgesDisplayForFutureScheduleProgram() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);

			if (!mutvPageLocators.cbrBadgeEpgScheduleScreen.isEmpty()
					|| !mutvPageLocators.cbsBadgeEpgScheduleScreen.isEmpty()) {
				ExtentsReportManager.extentReportLogging("pass",
						"'Subscribe/Register to Watch' badge found after scrolling DOWn");
				return true;
			}

			ExtentsReportManager.extentReportLogging("fail", "CBRorCBS badge not found after scrolling  DOWN");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in CBSCBRBadgesDisplayForPreviousScheduleProgram()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean CBSCBRBadgesIsNotDisplayedForCurrentProgram() {
		try {

			WebElement element = driver.findElement(By.xpath(
					"//android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"));

			String elementText = element.getText();

			if (elementText.contains("Subscribe to watch") || elementText.contains("Register to watch")) {
				ExtentsReportManager.extentReportLogging("fail", "CBRorCBS badge Text contains.'");
			} else {
				ExtentsReportManager.extentReportLogging("Pass",
						"CBS or CBR Video Is not displayed for current program");
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in CBSCBRBadgesIsNotDisplayedForCurrentProgram()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean CBSCBRBadgesIsNotDisplayedForCurrentPrograminIos() {
		try {

			WebElement element = driver.findElement(
					By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]"));

			String elementText = element.getText();

			if (elementText.contains("Subscribe to watch") || elementText.contains("Register to watch")) {
				ExtentsReportManager.extentReportLogging("fail", "CBRorCBS badge Text contains.'");
			} else {
				ExtentsReportManager.extentReportLogging("Pass", "CBS or CBR Is not displayed for current program");
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in CBSCBRBadgesIsNotDisplayedForCurrentProgram()<br />" + e);
			throw e;
		}
		return false;

	}

	public boolean validateHeroCarouselDisableInMutvPage() {
		try {
			String device = GlobalParams.getPlatformName();
			WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(10));
			List<WebElement> dots;
			try {
				if (device.equalsIgnoreCase("android")) {
					dots = shortWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(
							"//android.widget.FrameLayout[contains(@resource-id, 'id/frame')]/android.widget.LinearLayout")));
				} else if (device.equalsIgnoreCase("ios")) {
					dots = shortWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
							By.xpath("//XCUIElementTypeOther[2]//XCUIElementTypeCollectionView")));
				}
			} catch (TimeoutException e) {
				ExtentsReportManager.extentReportLogging("Pass",
						"Hero carousel are not displayed – carousel is disabled as expected on CMS side ");
				return true;
			}

			// If elements are found
			//ExtentsReportManager.extentReportLogging("fail",	"Hero carousel are visible in MUTV page – should be disabled on CMS side ");
			return false;

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in validateHeroCarouselDisableInMutvPage()<br />" + e);
			return false;
		}
	}

//	public void checksForUTDProdcastInMUTV() {
//		try {
//			if (Common.apiEnv().equalsIgnoreCase("prod")) {
//				for (int i = 0; i < 20; i++) {
//					if (!(mutvPageLocators.uTDPodcastMUTV.size() > 0)) {
//						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//					} else {
//						break;
//					}
//				}
//				ExtentsReportManager.extentReportLogging("pass", "found UTD PODCAST in MUTV");
//			} else if (Common.apiEnv().equalsIgnoreCase("stage")) {
//				for (int i = 0; i < 20; i++) {
//					if (!(mutvPageLocators.uTDPodcastMUTV1.size() > 0)) {
//						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//					} else {
//						break;
//					}
//				}
//				ExtentsReportManager.extentReportLogging("pass", "found UTD PODCAST in MUTV");
//			}
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Exception occured in function-checksForUTDProdcastInMUTV()<br />" + e);
//			throw e;
//		}
//
//	}
	public void checksForUTDPodcastInMUTV() {
	    try {
	        if (Common.apiEnv().equalsIgnoreCase("prod")) {
	            for (int i = 0; i < 20; i++) {
	                if (mutvPageLocators.uTDPodcastMUTV.size() == 0) {
	                    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
	                } else {
	                    break;
	                }
	            }
	            ExtentsReportManager.extentReportLogging("pass", "found UTD PODCAST in MUTV");
	        } else if (Common.apiEnv().equalsIgnoreCase("stage")) {
	            for (int i = 0; i < 20; i++) {
	                if (mutvPageLocators.uTDPodcastMUTV1.size() == 0) {
	                    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
	                } else {
	                    break;
	                }
	            }
	            ExtentsReportManager.extentReportLogging("pass", "found UTD PODCAST in MUTV");
	        }
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail",
	                "Exception occurred in function-checksForUTDPodcastInMUTV()<br />" + e);
	        throw e;
	    }
	}


//	public void clicksOnFirstPodcastInMUTV() {
//			try {
//				if (Common.apiEnv().equalsIgnoreCase("prod")) {
//				if(mutvPageLocators.podcastInMUTV.isDisplayed()){
//	          elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV,60);
//	          mutvPageLocators.podcastInMUTV.click();
//	          ExtentsReportManager.extentReportLogging("pass","Clicks on podcast in MUTV");
//				} else if (Common.apiEnv().equalsIgnoreCase("stage")) {
//					if(mutvPageLocators.podcastInMUTV2.isDisplayed()){
//				          elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV2,60);
//				          mutvPageLocators.podcastInMUTV2.click();
//				          ExtentsReportManager.extentReportLogging("pass","Clicks on podcast in MUTV");
//				}
//	      } else {
//	    	  if (Common.apiEnv().equalsIgnoreCase("prod")) {
//	    	  IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
//	    	  elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV,60);
//	          mutvPageLocators.podcastInMUTV.click();
//	          ExtentsReportManager.extentReportLogging("pass","Clicks on podcast in MUTV");
//	      }  else if (Common.apiEnv().equalsIgnoreCase("stage")) {
//	    	  IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
//	    	  elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV2,60);
//	          mutvPageLocators.podcastInMUTV2.click();
//	          ExtentsReportManager.extentReportLogging("pass","Clicks on podcast in MUTV");
//	      }
//	      }
//				}
//			}
//	      catch (Exception e) {
//	          ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnFirstPodcastInMUTV()<br />" + e);
//	          throw e;
//	      }
			
//		}
	public void clicksOnFirstPodcastInMUTV() {
	    try {
	        if (Common.apiEnv().equalsIgnoreCase("prod")) {
	            if (mutvPageLocators.podcastInMUTV.isDisplayed()) {
	                elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV, 60);
	                mutvPageLocators.podcastInMUTV.click();
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
	            } else {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
	                elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV, 60);
	                mutvPageLocators.podcastInMUTV.click();
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
	            }
	        } else if (Common.apiEnv().equalsIgnoreCase("stage")) {
	            if (mutvPageLocators.podcastInMUTV2.isDisplayed()) {
	                elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV2, 60);
	                mutvPageLocators.podcastInMUTV2.click();
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
	            } else {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
	                elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV2, 60);
	                mutvPageLocators.podcastInMUTV2.click();
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
	            }
	        }
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail",
	                "Exception occurred in function-clicksOnFirstPodcastInMUTV()<br />" + e);
	        throw e;
	    }
	}


	public boolean validatesPlayButtonInPodcastAudioScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (mutvPageLocators.playButtonInPodcastAudioScreen.isDisplayed()) {
					ExtentsReportManager.extentReportLogging("pass", "Validated podcast video in MUTV");
					return true;
				}
			} else {
				if (mutvPageLocators.playButtonInPodcastAudioScreen.isDisplayed()) {
					ExtentsReportManager.extentReportLogging("pass", "Validated podcast video in MUTV");
					return true;
				}
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesPlayButtonInPodcastAudioScreen()<br />" + e);
			return false;
		}
		return false;
	}

	public void checksForUTDProdcastInMUTVInIos() {
		try {
			for (int i = 0; i < 20; i++) {
				if (!(mutvPageLocators.uTDPodcastMUTV.size() > 0)) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "found UTD PODCAST in MUTV");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-checksForUTDProdcastInMUTV()<br />" + e);
			throw e;
		}

	}

	public void clicksOnFirstPodcastInMUTVInIos() {
		try {
			if (mutvPageLocators.podcastInMUTV.isDisplayed()) {
				elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV, 60);
				mutvPageLocators.podcastInMUTV.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
			} else {
				elementToBeClickableFluentWait(mutvPageLocators.podcastInMUTV, 60);
				mutvPageLocators.podcastInMUTV.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnFirstPodcastInMUTV()<br />" + e);
			throw e;
		}

	}

	public void clicksOnBackIconInPodcastAudioScreen() {
		try {
			if (mutvPageLocators.backButtonInPodcastAudioScreen.isDisplayed()) {
				elementToBeClickableFluentWait(mutvPageLocators.backButtonInPodcastAudioScreen, 60);
				mutvPageLocators.backButtonInPodcastAudioScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
			} else {
				elementToBeClickableFluentWait(mutvPageLocators.backButtonInPodcastAudioScreen, 60);
				mutvPageLocators.backButtonInPodcastAudioScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on podcast in MUTV");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnFirstPodcastInMUTV()<br />" + e);
			throw e;
		}

	}

	public boolean validatesProdcastAudioMinimizedAndPlaying() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (mutvPageLocators.audioMinimizedAndPlaying.isDisplayed()) {
					ExtentsReportManager.extentReportLogging("pass", "Validated podcast audio minimized and playing");
					return true;
				}
			} else { // iOS logic
				if (mutvPageLocators.audioMinimizedAndPlaying1.size() > 0) {
					System.out.println("Podcast mini player is displayed.");
					ExtentsReportManager.extentReportLogging("pass", "Podcast mini player is displayed.");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("fail", "Podcast mini player is not displayed.");
				}
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesProdcastAudioMinimizedAndPlayinge ()<br />" + e);
			return false;
		}
		return false;
	}

	public boolean validatesProdcastAudioMinimizedAndPlayingBG() {
		String device = GlobalParams.getPlatformName();
		driver.manage().window().minimize();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (mutvPageLocators.audioMinimizedAndPlaying.isDisplayed()) {
					ExtentsReportManager.extentReportLogging("pass", "Validated podcast audio minimized and playing");
					return true;
				}
			} else { // iOS logic
				if (mutvPageLocators.audioMinimizedAndPlaying1.size() > 0) {
					System.out.println("Podcast mini player is displayed.");
					ExtentsReportManager.extentReportLogging("pass", "Podcast mini player is displayed.");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("fail", "Podcast mini player is not displayed.");
				}
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesProdcastAudioMinimizedAndPlayinge ()<br />" + e);
			return false;
		}
		return false;
	}

	public void checksForTopTwentyCollectionsInMUTV() {
		String device = GlobalParams.getPlatformName();
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//				for (int i = 0; i < 20; i++) {
//					if (!(mutvPageLocators.topTwentyCollectionsInMutv.size() > 0)) {
//						IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
//					} else {
//						break;
//					}
//				}
			ExtentsReportManager.extentReportLogging("pass", "found TOP 20 COLLECTION in MUTV");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-checksForTopTwentyCollectionsInMUTV()<br />" + e);
			throw e;
		}

	}

	public void clicksOnFirstTopCollectionVideoInMUTV() {
		try {
			if (mutvPageLocators.firstVideoInTopTwentyCollectionInMUTV.isDisplayed()) {
				elementToBeClickableFluentWait(mutvPageLocators.firstVideoInTopTwentyCollectionInMUTV, 60);
				mutvPageLocators.firstVideoInTopTwentyCollectionInMUTV.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on video in top twenty collections in MUTV");
			} else {
				elementToBeClickableFluentWait(mutvPageLocators.firstVideoInTopTwentyCollectionInMUTV, 60);
				mutvPageLocators.firstVideoInTopTwentyCollectionInMUTV.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on video in top twenty collections in MUTV");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnFirstTopCollectionVideoInMUTV()<br />" + e);
			throw e;
		}
	}

	public void clicksOnPlayButton() {
		try {
			if (mutvPageLocators.playButtonInMUTV.isDisplayed()) {
				elementToBeClickableFluentWait(mutvPageLocators.playButtonInMUTV, 60);
				mutvPageLocators.playButtonInMUTV.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on play button in MUTV");
			} else {
				elementToBeClickableFluentWait(mutvPageLocators.playButtonInMUTV, 60);
				mutvPageLocators.playButtonInMUTV.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on play button in MUTV");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlayButton()<br />" + e);
			throw e;
		}

	}

	public void clicksOnTheCloseButtonInThePlayedVideoInMUTV() {
		clicksOnCloseButtonInMUTV();

	}

	private void clicksOnCloseButtonInMUTV() {
		try {
			elementToBeClickableFluentWait(mutvPageLocators.closeButtonVideoInMUTV, 60);
			mutvPageLocators.closeButtonVideoInMUTV.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on closeButtonVideo in MUTV ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnCloseButtonInMUTV()<br />" + e);
			throw e;
		}

	}

	public void clicksOnFirstPodcastInMUTVInIOS() {
		try {
			for (int i = 0; i < 20; i++) {
				if (!(mutvPageLocators.podcastInMUTV1.size() > 0)) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "found UTD PODCAST in MUTV");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-checksForUTDProdcastInMUTV()<br />" + e);
			throw e;
		}
	}

	public void clicksOnLoginToAddCalenderButtonInIos() {
		try {
			waitForVisibilityFluentWait(mutvPageLocators.loginToAddCalenderButton, 60);
			mutvPageLocators.loginToAddCalenderButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on loginButton ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnLoginToAddCalenderButtonInIos()<br />" + e);
			throw e;
		}
	}

//	public boolean validatesContentCardInMUTV() {
//		try {
//			for (int i = 0; i < 20; i++) {
//				if (!(mutvPageLocators.contentCardInMUTV1.size() > 0)) {
//					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
//					 return mutvPageLocators.contentCardInMUTV.isDisplayed();
//				} else {
//					break;
//				}
//			}
//			ExtentsReportManager.extentReportLogging("pass", "found content card in MUTV");
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Exception occured in function-validatesContentCardInMUTV()<br />" + e);
//			throw e;
//		}
//		
//	}
	public boolean validatesContentCardInMUTV() {
			String device = GlobalParams.getPlatformName();
			try {
		        if (device.equalsIgnoreCase("android")) {
		        	 if (mutvPageLocators.contentCardInMUTV.isDisplayed()) {
		     	            ExtentsReportManager.extentReportLogging("pass", "Braze content card is displayed.");
		     	            return true;
		        	        } else {
		        	            ExtentsReportManager.extentReportLogging("info", "Braze content card is not displayed.");
		        	            return false;
		        	        }
		        } else {
		        	 if (mutvPageLocators.contentCardInMUTV.isDisplayed()) {
	     	            ExtentsReportManager.extentReportLogging("pass", "Braze content card is displayed.");
	     	            return true;
		        	 } else {
	     	            ExtentsReportManager.extentReportLogging("info", "Braze content card is not displayed.");
	     	            return false;
	     	        }
		            }
		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function validatesContentCardInMUTV()<br />" + e);
		        throw e;
		    }
	 
	}

	public boolean validatesContentCardInMUTVInIos() {
		 try {
		        for (int i = 0; i < 5; i++) {
		            if (mutvPageLocators.contentCardInMUTV1.size() > 0) {
		                ExtentsReportManager.extentReportLogging("pass", "Found content card in MUTV");
		                return true; 
		            } else {
		                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
		            }
		        }
		        ExtentsReportManager.extentReportLogging("fail", "Content card is not available in MUTV.");
		        return false; 
		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail",
		                "Exception occurred in function validatesContentCardInMUTV() - " + e);
		        throw e;
		    }
	}

	public boolean userNavigatesToBrazeContentcardMUTV() {
		try {
	        for (int i = 0; i < 10; i++) {
	            if (mutvPageLocators.contentCardInMUTV1.size() > 0) {
	                ExtentsReportManager.extentReportLogging("Pass", "Braze Content Card 'MUTV' is available.");
	                return true;
	            } else {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
	                ExtentsReportManager.extentReportLogging("Info", "Scrolled down to look for Braze Content Card 'MUTV'.");
	            }
	        }
	        ExtentsReportManager.extentReportLogging("Fail", "Braze Content Card 'MUTV' is not available after scrolling.");
	        return false;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("Fail",
	            "Exception occurred in function userNavigatesToBrazeContentcardMUTV()<br />" + e);
	        throw e;
	    }
}
		
	}



