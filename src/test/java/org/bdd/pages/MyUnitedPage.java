package org.bdd.pages;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.MyUnitedPageLocators;
import org.bdd.utils.AndroidGenericLibrary;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.GlobalParams;
import org.bdd.utils.IosGenericLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyUnitedPage extends Common {
	private static final Logger log = LogManager.getLogger(MyUnitedPage.class);
	MyUnitedPageLocators myUnitedPageLocators;

	public MyUnitedPage() {
		this.myUnitedPageLocators = new MyUnitedPageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), myUnitedPageLocators);
	}

	public void clickOnRateAppInTheGeneralScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.rateAppInGeneralScreen, 60);
			myUnitedPageLocators.rateAppInGeneralScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on rate app in general section");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}
	}

	public String getGooglePlayText() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.googlePlayText, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returning Google Play Text");
			return myUnitedPageLocators.googlePlayText.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getGooglePlayText()<br />" + e);
			throw e;
		}
	}

	public void clickOnLanguageInTheGeneralScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.languageInGeneralScreen, 60);
			myUnitedPageLocators.languageInGeneralScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on language in the general section");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnChineseLanguageInLangugaeScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.selectChineseLanguage, 60);
			myUnitedPageLocators.selectChineseLanguage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on chinese language in language section");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnChineseLanguageInLanguageScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnConfirmButtonInLanguageScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.confirmButtonInlanguageScreen, 60);
			myUnitedPageLocators.confirmButtonInlanguageScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on confirm button in language screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnConfirmButtonInLanguageScreen()<br />" + e);
			throw e;
		}
	}

	public String getWelcomeTextInChinese() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.welcomeTextInChineseUnitedScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns Welcome text in chinese");
			return myUnitedPageLocators.welcomeTextInChineseUnitedScreen.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWelcomeTextInChinese()<br />" + e);
			throw e;
		}
	}

	public void clickDontAllowButtonInAudioNotificationAlertAfterRefresh() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.dontAllowBtnAudioRefreshed, 60);
			myUnitedPageLocators.dontAllowBtnAudioRefreshed.click();
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on dont allow button in audio notification alert after refresh");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickDon'tAllowButtonInAudioNotificationAlertAfterRefresh()<br />"
							+ e);
			throw e;
		}

	}

	public void clickDontAllowInThePhotosAndVideosAccessInAlertAfterRefresh() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.dontAllowBtnPhotosAndVideosRefreshed, 60);
			myUnitedPageLocators.dontAllowBtnPhotosAndVideosRefreshed.click();
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on don't allow button in photos and videos access in alert after refresh");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickDontAllowInThePhotosAndVideosAccessInAlertAfterRefresh()<br />"
							+ e);
			throw e;
		}
	}

	public void clickOnSettingIconInChineseLanguage() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.settingsIconMyUnitedInChinese, 60);
			myUnitedPageLocators.settingsIconMyUnitedInChinese.click();
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on don't allow button in photos and videos access in alert after refresh");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnSettingIconInChineseLanguage()<br />" + e);
			throw e;
		}

	}

	public void clickOnGENERALLinkInChineseLanguage() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.generalIconSettingsPageInChinese, 60);
			myUnitedPageLocators.generalIconSettingsPageInChinese.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on general link in chinese language");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnGENERALLinkInChineseLanguage()<br />" + e);
			throw e;
		}

	}

	public void clickOnLanguageGeneralInChineseLanguage() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.languageGeneralScreenInChinese, 60);
			myUnitedPageLocators.languageGeneralScreenInChinese.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on language in chinese language");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnLanguageGeneralInChineseLanguage()<br />" + e);
			throw e;
		}

	}

	public void clickOnEnglishLanguageInLangugaeScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.selectEnglishLanguage, 60);
			myUnitedPageLocators.selectEnglishLanguage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on english language in language screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnEnglishLanguageInLanguageScreen()<br />" + e);
			throw e;
		}

	}

	public void clickOnConfirmButtonInChineseLanguage() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.confirmBtnInChineseLanguage, 60);
			myUnitedPageLocators.confirmBtnInChineseLanguage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on confirm button in chinese language");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnConfirmButtonInChineseLanguage()<br />" + e);
			throw e;
		}
	}

	public void clickOnMyUnitedInBottomTabWhichIsInChineseLanguage() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedBtnInChinese, 60);
			myUnitedPageLocators.myUnitedBtnInChinese.click();
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on my united in bottom tab which is in chines language");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnMyUnitedInBottomTabWhichIsInChineseLanguage()<br />" + e);
			throw e;
		}

	}

	public boolean validateChineseCalenderIcon() {
		try {
			if (myUnitedPageLocators.calenderIconUnitedPage1.isEmpty()) {
				return myUnitedPageLocators.calenderIconUnitedPage.isDisplayed();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.calenderIconChineseUnitedNowIos, 60);
				ExtentsReportManager.extentReportLogging("pass", "Displays calender icon in chinese united now");
				return myUnitedPageLocators.calenderIconChineseUnitedNowIos.isDisplayed();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateChineseCalenderIcon()<br />" + e);
			throw e;
		}
	}

	public String getMyUnitedText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedTitleUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return myUnitedPageLocators.myUnitedTitleUnitedPage.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedTitleUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
				return myUnitedPageLocators.myUnitedTitleUnitedPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnStickersIconInMyunitedScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.stickersIconUnitedPage, 60);
			myUnitedPageLocators.stickersIconUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on stickers icon in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnStickersIconInMyunitedScreen()<br />" + e);
			throw e;
		}

	}

	public String getMyMessageTitleText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.myMessageTitleInboxUnitedPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my message title text");
				return myUnitedPageLocators.myMessageTitleInboxUnitedPage.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.stickersTitleStickersScreenIos, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my message title text");
				return myUnitedPageLocators.stickersTitleStickersScreenIos.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMyMessageTitleText()<br />" + e);
			throw e;
		}
	}

	public void clickOnBackButtonInInboxScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconInboxUnitedPage, 60);
			myUnitedPageLocators.backIconInboxUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on back button in inbox screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBackButtonInInboxScreen()<br />" + e);
			throw e;
		}

	}

	public void clickOnBackButtonInStickersScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconStickersUnitedPage, 60);
			myUnitedPageLocators.backIconStickersUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on back button in stickers screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBackButtonInStickersScreen()<br />" + e);
			throw e;
		}

	}

	public String getPointsThisSeasonCardTextMyUnited() {
		String device = GlobalParams.getPlatformName();
		try {
		    int maxScrollAttempts = 5;
		    boolean elementFound = false;

		    for (int i = 0; i < maxScrollAttempts; i++) {
		        if (myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.size() > 0) {
		            elementFound = true;
		            break;
		        }
		        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5); // Works for both platforms
		    }

		    if (!elementFound) {
		        throw new NoSuchElementException("Point This Season Card not found after scrolling.");
		    }

		    waitForVisibilityFluentWait(myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0), 60);

		    if (device.equalsIgnoreCase("android")) {
		        ExtentsReportManager.extentReportLogging("pass", "Returns points this season card text - Android");
		        return myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0).getText();
		    } else {
		        ExtentsReportManager.extentReportLogging("pass", "Returns points this season card text - iOS");
		        return myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0).getDomAttribute("label");
		    }

		} catch (Exception e) {
		    ExtentsReportManager.extentReportLogging("fail",
		            "Exception occurred in function-getPointsThisSeasonCardTextMyUnited()<br />" + e);
		    throw e;
		}

	}

	public void clickOnSeasonCardInMyUnitedScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0), 60);
			myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0).click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on seasons card in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnSeasonCardInMyUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public String getPredictionsTextSeasonCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.predictionHeaderSeasonCard, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns prediction header season card text");
				return myUnitedPageLocators.predictionHeaderSeasonCard.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.predictionHeaderSeasonCard, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns prediction header season card text ");
				return myUnitedPageLocators.predictionHeaderSeasonCard.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPredictionsTextSeasonCard()<br />" + e);
			throw e;
		}

	}

	public String getMyBestScoreTextSeasonCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.myBestScoreHeaderSeasonCard, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my best score text in season card ");
				return myUnitedPageLocators.myBestScoreHeaderSeasonCard.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.myBestScoreHeaderSeasonCard, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my best score text in season card");
				return myUnitedPageLocators.myBestScoreHeaderSeasonCard.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMyBestScoreTextSeasonCard()<br />" + e);
			throw e;
		}

	}

	public String getMatchesTextSeasonCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.matchesHeaderSeasonCard, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matches text in season card");
				return myUnitedPageLocators.matchesHeaderSeasonCard.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.matchesHeaderSeasonCard, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matches text in season card ");
				return myUnitedPageLocators.matchesHeaderSeasonCard.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}

	}

	public void clickOnBackIconInSeasonCardScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconSeasonCardScreen, 60);
			myUnitedPageLocators.backIconSeasonCardScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on back icon in season card screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBackIconInSeasonCardScreen()<br />" + e);
			throw e;
		}
	}

	public String getMyStickersCarouselMyUnited() {
		  String device = GlobalParams.getPlatformName();
		    try {
		        if (device.equalsIgnoreCase("android")) {
		            int maxScrollAttempts = 5;
		            boolean elementFound = false;

		            for (int i = 0; i < maxScrollAttempts; i++) {
		                if (myUnitedPageLocators.myStickersTextMyUnitedScreen1.size() > 0) {
		                    elementFound = true;
		                    break;
		                }
		                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
		            }

		            if (!elementFound) {
		                throw new NoSuchElementException("My Stickers text not found after scrolling.");
		            }

		            waitForVisibilityFluentWait(myUnitedPageLocators.myStickersTextMyUnitedScreen, 60);
		            ExtentsReportManager.extentReportLogging("pass", "Returns My Stickers text in My United screen (Android)");
		            return myUnitedPageLocators.myStickersTextMyUnitedScreen.getText();
		        } else {
		            waitForVisibilityFluentWait(myUnitedPageLocators.myStickersTextMyUnitedScreen, 60);
		            ExtentsReportManager.extentReportLogging("pass", "Returns My Stickers text in My United screen (iOS)");
		            return myUnitedPageLocators.myStickersTextMyUnitedScreen.getDomAttribute("label");
		        }
		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail",
		            "Exception occurred in function-getMyStickersCarouselMyUnited()<br />" + e);
		        throw e;
		    }
	}

	public void clickOnViewAllButton() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.viewAllIconMyUnitedScreen, 60);
			myUnitedPageLocators.viewAllIconMyUnitedScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on view all button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnViewAllButton()<br />" + e);
			throw e;
		}

	}

	public void clickOnBackIconInStickersScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconStickersScreen, 60);
			myUnitedPageLocators.backIconStickersScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on back icon in stickers screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBackIconInStickersScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnFirstStickerInStickersScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.firstStickerInStickersScreen, 60);
			myUnitedPageLocators.firstStickerInStickersScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on First stickers in stickers screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnFirstStickerInStickersScreen()<br />" + e);
			throw e;
		}
	}

	public void selectsSearchImageFromShareOption() {
		try {
			AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "Edge");
			waitForVisibilityFluentWait(myUnitedPageLocators.searchImageLinkStickersScreen, 60);
			myUnitedPageLocators.searchImageLinkStickersScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on search image link in stickers screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectsSearchImageFromShareOption()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheStickerInGoogleLensPage() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.imageSharedGoogleLensScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed image shared in google lens screen");
			return myUnitedPageLocators.imageSharedGoogleLensScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheStickerInGoogleLensPage()<br />" + e);
			throw e;
		}
	}

	public void clickOnEditButton() {
		AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "SHIRT");
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.tShirtEditButton, 60);
			myUnitedPageLocators.tShirtEditButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on t shit edit button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnEditButton()<br />" + e);
			throw e;
		}
	}

	public int x = Common.setGenerateTwoDigitsRandomNumber();

	public String settShirtNumber() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.tShirtTextBox, 60);
			myUnitedPageLocators.tShirtTextBox.clear();
			myUnitedPageLocators.tShirtTextBox.sendKeys(String.valueOf(x));
			ExtentsReportManager.extentReportLogging("pass", "Returns the t shirt no");
			return String.valueOf(x);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-settShirtNumber()<br />" + e);
			throw e;
		}
	}

	public void clickOnSaveTshirtButton() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.tShirtsaveButton, 60);
			myUnitedPageLocators.tShirtsaveButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on save t shirt button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnSaveTshirtButton()<br />" + e);
			throw e;
		}
	}

	public void clickOnBackToTopButton() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				myUnitedPageLocators.unitedNowTab.click();
				myUnitedPageLocators.myUnitedButton.click();
                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "BACK TO TOP");
//                waitForVisibilityFluentWait(backToTopButton);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				myUnitedPageLocators.backToTopButton.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on back top top button");
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				waitForVisibilityFluentWait(myUnitedPageLocators.backToTopButton, 60);
				myUnitedPageLocators.backToTopButton.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on back top top button ");
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBackToTopButton()<br />" + e);
			throw e;
		}
	}

	public boolean getTshirtName() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.tShirtNameMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns t shirt name in my united screen ");
				return myUnitedPageLocators.tShirtNameMyUnitedScreen.isDisplayed();
			} else {
				ExtentsReportManager.extentReportLogging("pass", "Returns t shirt name in my united screen");
				return myUnitedPageLocators.tShirtNameMyUnitedScreen.getDomAttribute("label").equalsIgnoreCase("T");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getTshirtName()<br />" + e);
			throw e;
		}
	}

	public String getTshirtNumber() throws InterruptedException {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.tShirtNumberMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns t shirt no in my united screen");
				return myUnitedPageLocators.tShirtNumberMyUnitedScreen.getText();
			} else {
				Thread.sleep(2000);
				waitForVisibilityFluentWait(myUnitedPageLocators.tShirtNumberMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns t shirt no in my united screen ");
				return myUnitedPageLocators.tShirtNumberMyUnitedScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getTshirtNumber()<br />" + e);
			throw e;
		}

	}

	public void clickOnGetOfficialMembershipCTAButtonInMyUnitedScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.getOfficialMemberCTABtnMyUnitedScreen, 60);
			myUnitedPageLocators.getOfficialMemberCTABtnMyUnitedScreen.click();
			ExtentsReportManager.extentReportLogging("pass",
					"Clicks on get official membership sta button in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnGetOfficialMembershipCTAButtonInMyUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public String getTicketsTitleInGetOfficialMembershipScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.ticketsInGetOfficialMemberCTABtn, 60);
				ExtentsReportManager.extentReportLogging("pass",
						"Returns tickets text in get official member cta button");
				return myUnitedPageLocators.ticketsInGetOfficialMemberCTABtn.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.ticketsInGetOfficialMemberCTABtn, 60);
				ExtentsReportManager.extentReportLogging("pass",
						"Returns tickets text in get official member cta button ");
				return myUnitedPageLocators.ticketsInGetOfficialMemberCTABtn.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getTicketsTitleInGetOfficialMembershipScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnCloseIconInGetOfficialMembershipScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.closeIconInGetOfficialMemberCTABtn, 60);
			myUnitedPageLocators.closeIconInGetOfficialMemberCTABtn.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on close icon in get official membership screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnCloseIconInGetOfficialMembershipScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnBuyShirtCTAButtonInMyUnitedScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.buyTShirtCTABtnMyUnitedScreen, 60);
			myUnitedPageLocators.buyTShirtCTABtnMyUnitedScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on buy shirt cta button in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBuyShirtCTAButtonInMyUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public boolean getShopNowIsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.shopNowTextBuyTShirtCTABtn, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed shop now text in buy t shirt CTA button");
			return myUnitedPageLocators.shopNowTextBuyTShirtCTABtn.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getShopNowIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public String getScoredCardThisSeason() {
		    try {
		        int maxScrollAttempts = 5;
		        boolean elementFound = false;

		        if (Common.apiEnv().equalsIgnoreCase("stage")) {
		            for (int i = 0; i < maxScrollAttempts; i++) {
		                if (myUnitedPageLocators.scoreThisSeasonSeasonOne1.size() > 0) {
		                    elementFound = true;
		                    break;
		                }
		                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
		                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
		            }

		            if (!elementFound) {
		                throw new NoSuchElementException("Score This Season Card not found after scrolling (stage).");
		            }

		            waitForVisibilityFluentWait(myUnitedPageLocators.scoreThisSeasonSeasonOne, 60);
		            ExtentsReportManager.extentReportLogging("pass", "Returns Score this season - Stage");
		            return myUnitedPageLocators.scoreThisSeasonSeasonOne.getText();

		        } else if (Common.apiEnv().equalsIgnoreCase("prod")) {
		            for (int i = 0; i < maxScrollAttempts; i++) {
		                if (myUnitedPageLocators.scoreThisSeasonSeasonOne1.size() > 0) {
		                    elementFound = true;
		                    break;
		                }
		                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.8);
		            }

		            if (!elementFound) {
		                throw new NoSuchElementException("Score This Season Card not found after scrolling (prod).");
		            }

		            waitForVisibilityFluentWait(myUnitedPageLocators.scoreThisSeasonSeasonOne, 60);
		            ExtentsReportManager.extentReportLogging("pass", "Returns Score this season - Prod");
		            return myUnitedPageLocators.scoreThisSeasonSeasonOne.getText();
		        }

		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail",
		                "Exception occurred in function-getScoredCardThisSeason()<br />" + e);
		        throw e;
		    }
		return null;
	}

	public String getMyUnitedThisSeason() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedSeasonOne, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united season one text");
				return myUnitedPageLocators.myUnitedSeasonOne.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedSeasonOne, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my united season one text ");
				return myUnitedPageLocators.myUnitedSeasonOne.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMyUnitedThisSeason()<br />" + e);
			throw e;
		}
	}

	public void clickOnTotalScoreCard() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedSeasonTwo, 60);
			myUnitedPageLocators.myUnitedSeasonTwo.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on Total score card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnTotalScoreCard()<br />" + e);
			throw e;
		}

	}

	public String getTotalScoreCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedScoreSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned total score");
				return myUnitedPageLocators.myUnitedScoreSeasonTwo.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedScoreSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned total score ");
				return myUnitedPageLocators.myUnitedScoreSeasonTwo.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getTotalScoreCard()<br />" + e);
			throw e;
		}
	}

	public String getPredictionTotalScoreCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.predictionsSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned prediction total score card");
				return myUnitedPageLocators.predictionsSeasonTwo.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.predictionsSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned prediction total score card ");
				return myUnitedPageLocators.predictionsSeasonTwo.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPredictionTotalScoreCard()<br />" + e);
			throw e;
		}
	}

	public String getDailyStreaksTotalScoreCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.dailyStreaksSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned daily streaks count");
				return myUnitedPageLocators.dailyStreaksSeasonTwo.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.dailyStreaksSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned daily streaks count ");
				return myUnitedPageLocators.dailyStreaksSeasonTwo.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getDailyStreaksTotalScoreCard()<br />" + e);
			throw e;
		}
	}

	public String getAppearanceTotalScoreCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearanceSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance count");
				return myUnitedPageLocators.appearanceSeasonTwo.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearanceSeasonTwo, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance count ");
				return myUnitedPageLocators.appearanceSeasonTwo.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getAppearanceTotalScoreCard()<br />" + e);
			throw e;
		}
	}

	public void clickOnBackIconInTotalScoreCard() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconSeasonTwo, 60);
			myUnitedPageLocators.backIconSeasonTwo.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on back icon in total score card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBackIconInTotalScoreCard()<br />" + e);
			throw e;
		}

	}

	public boolean getNumberHeadingSeasonThreeIsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.numberHeadingSeasonThree, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns number heading in season ");
			return myUnitedPageLocators.numberHeadingSeasonThree.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getNumberHeadingSeasonThreeIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public String getDailyStreaksInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.dailyStreaksSeasonThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned daily streaks in daily streaks ");
				return myUnitedPageLocators.dailyStreaksSeasonThree.getText();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.LEFT, 0.7);
				waitForVisibilityFluentWait(myUnitedPageLocators.dailyStreaksSeasonThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned daily streaks in daily streaks");
				return myUnitedPageLocators.dailyStreaksSeasonThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getDailyStreaksInDailyStreaksCard()<br />" + e);
			throw e;
		}

	}

	public String getConsecutiveDaysinTheAppInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.consecutiveDaysinTheAppSeasonThree, 60);
				ExtentsReportManager.extentReportLogging("pass",
						"Returned consecutive days in app in daily streak card");
				return myUnitedPageLocators.consecutiveDaysinTheAppSeasonThree.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.consecutiveDaysinTheAppSeasonThree, 60);
				ExtentsReportManager.extentReportLogging("pass",
						"Returned consecutive days in app in daily streak card ");
				return myUnitedPageLocators.consecutiveDaysinTheAppSeasonThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getConsecutiveDaysinTheAppInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public String getViewInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns view season");
				return myUnitedPageLocators.viewSeasonThree.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns view season ");
				return myUnitedPageLocators.viewSeasonThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getViewInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public void clickOnViewButtonInDailyStreaksCard() {
		try {
//			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.RIGHT, 0.7);
			waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonThree, 60);
			myUnitedPageLocators.viewSeasonThree.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on view button in daily streaks card screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnViewButtonInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public String getDailyStreaksScreenTitleInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.dailyStreaksScreenTitleThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns daily streaks screen title");
				return myUnitedPageLocators.dailyStreaksScreenTitleThree.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.dailyStreaksScreenTitleThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns daily streaks screen title ");
				return myUnitedPageLocators.dailyStreaksScreenTitleThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getDailyStreaksScreenTitleInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public boolean getScoreNumberInCircleInDailyStreaksCardIsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.scoreNumberInCircleThree, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed score number");
			return myUnitedPageLocators.scoreNumberInCircleThree.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getScoreNumberInCircleInDailyStreaksCardIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public String getDescriptionInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.descriptionThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned description ");
				return myUnitedPageLocators.descriptionThree.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.descriptionThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned description");
				return myUnitedPageLocators.descriptionThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getDescriptionInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public boolean getScoreNumberInRectangleInDailyStreaksCardIsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.scoreNumberInRectangleThree, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed score number ");
			return myUnitedPageLocators.scoreNumberInRectangleThree.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getScoreNumberInRectangleInDailyStreaksCardIsDisplayed()<br />"
							+ e);
			throw e;
		}
	}

	public String getBestScoreTextInRectangleInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.bestScoreTextInRectangleThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned beast score text ");
				return myUnitedPageLocators.bestScoreTextInRectangleThree.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.bestScoreTextInRectangleThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned beast score text");
				return myUnitedPageLocators.bestScoreTextInRectangleThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getBestScoreTextInRectangleInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public String getShareInDailyStreaksCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.shareThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned share in daily streaks screen");
				return myUnitedPageLocators.shareThree.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.shareThree, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned share in daily streaks screen ");
				return myUnitedPageLocators.shareThree.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getShareInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public void clickBackIconInDailyStreaksCard() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconThree, 60);
			myUnitedPageLocators.backIconThree.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks back icon in daily streaks screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickBackIconInDailyStreaksCard()<br />" + e);
			throw e;
		}
	}

	public boolean getNumberHeadingSeasonFourIsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.numberHeadingSeasonFour, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed number in heading");
			return myUnitedPageLocators.numberHeadingSeasonFour.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getNumberHeadingSeasonFourIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public String getAppearanceTitleAppearancecard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				swipeWithCoordinates(877, 947, 129, 947, 200, "left", driver);
				waitForVisibilityFluentWait(myUnitedPageLocators.appearanceTitleFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance title in appearance card");
				return myUnitedPageLocators.appearanceTitleFour.getText();
			} else {
				//IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.LEFT, 0.3);
				waitForVisibilityFluentWait(myUnitedPageLocators.appearanceTitleFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance title in appearance card ");
				return myUnitedPageLocators.appearanceTitleFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getAppearanceTitleAppearancecard()<br />" + e);
			throw e;
		}

	}

	public String getthisAppearancecard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.thisSeasonFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned this season appearance card");
				return myUnitedPageLocators.thisSeasonFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.thisSeasonFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned this season appearance card ");
				return myUnitedPageLocators.thisSeasonFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getthisAppearancecard()<br />" + e);
			throw e;
		}
	}

	public String getViewAppearancecard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned view season in appearance card");
				return myUnitedPageLocators.viewSeasonFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned view season in appearance card ");
				return myUnitedPageLocators.viewSeasonFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getViewAppearancecard()<br />" + e);
			throw e;
		}
	}

	public void clickOnViewButtonAppearancecard() throws Exception {
			String device = GlobalParams.getPlatformName();
			try {
				if (device.equalsIgnoreCase("android")) {
		    waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonFour, 60);
		    myUnitedPageLocators.viewSeasonFour.click();

		    if (myUnitedPageLocators.appearanceTitleFour1.size() > 0) {
		        myUnitedPageLocators.appearanceTitleFour.click();
		    }
				} else {
					 waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonFour, 60);
					 myUnitedPageLocators.viewSeasonFour.click();
				}

		} catch (Exception e) {
		    ExtentsReportManager.extentReportLogging("fail",
		        "Exception occurred in function-clickOnViewButtonAppearancecard()<br />" + e);
		    throw e;
		}
	}

	public String getAppearanceInsideTitleAppearancecard() throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearancesInsideTitleFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned Aprearance text in appearance card");
				return myUnitedPageLocators.appearancesInsideTitleFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearancesInsideTitleFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned Aprearance text in appearance card ");
				return myUnitedPageLocators.appearancesInsideTitleFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getAppearanceInsideTitleAppearancecard()<br />" + e);
			throw e;
		}
	}

	public String getAppearanceScoreAppearancecard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearanceScoreFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance score in title appearance card");
				return myUnitedPageLocators.appearanceScoreFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearanceScoreFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance score in title appearance card");
				return myUnitedPageLocators.appearanceScoreFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getAppearanceScoreAppearancecard()<br />" + e);
			throw e;
		}
	}

	public String getDescriptionAppearancecard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.descriptionFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned description text in appearance card");
				return myUnitedPageLocators.descriptionFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.descriptionFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned description text in appearance card");
				return myUnitedPageLocators.descriptionFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}
	}

	public String getLastAppearanceAppearanceCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.lastAppearanceFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned last appearance in appearance card");
				return myUnitedPageLocators.lastAppearanceFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.lastAppearanceFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned last appearance in appearance card ");
				return myUnitedPageLocators.lastAppearanceFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getLastAppearanceAppearanceCard()<br />" + e);
			throw e;
		}
	}

	public String getShareAppearanceCard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.shareFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned shared text in appearance card");
				return myUnitedPageLocators.shareFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.shareFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned shared text in appearance card ");
				return myUnitedPageLocators.shareFour.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getShareAppearanceCard()<br />" + e);
			throw e;
		}
	}

	public void clickBackIconAppearanceCard() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.backIconFour, 60);
			myUnitedPageLocators.backIconFour.click();
			ExtentsReportManager.extentReportLogging("pass", "clicked back icon in appearance card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickBackIconAppearanceCard()<br />" + e);
			throw e;
		}
	}

	public String selectDailySteaksInDailyStreaksCards(String expectedDailystreaks) {
		String actualDailyStreaks = null;
		try {
			for (int i = 0; i < 20; i++) {
				swipeWithCoordinates(901, 916, 418, 921, 200, "left", driver);
				actualDailyStreaks = myUnitedPageLocators.dailyStreaksSeasonThree.getText();
				if (actualDailyStreaks.equalsIgnoreCase(expectedDailystreaks)) {
					break;
				} else {
					swipeWithCoordinates(901, 916, 418, 921, 200, "left", driver);
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Selects daily streaks in daily streaks card");
			return actualDailyStreaks;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectDailySteaksInDailyStreaksCards()<br />" + e);
			throw e;
		}

	}
	public String selectAppearenceInAppearenceCard(String expectedAppearence) {
		String actualAppearence = null;
		try {
			for (int i = 0; i < 20; i++) {
				swipeWithCoordinates(901, 916, 418, 921, 200, "left", driver);
				actualAppearence = myUnitedPageLocators.appearanceTitleFour.getText();
				if (actualAppearence.equalsIgnoreCase(expectedAppearence)) {
					break;
				} else {
					swipeWithCoordinates(901, 916, 418, 921, 200, "left", driver);
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Selects daily streaks in Appearence card");
			return actualAppearence;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectAppearenceInAppearenceCard()<br />" + e);
			throw e;
		}

	}
	
	

	public void scrollsDownToFavoritePlayerScreen() {
		try {
			  if (Common.apiEnv().equalsIgnoreCase("stage")) {
		for (int i = 0; i < 20; i++) {
			if (myUnitedPageLocators.pickYourfavoritePlayerMyUnitedScreen.size() <= 0) {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.9);
			} else {
				break;
			}}
			}
			  else if (Common.apiEnv().equalsIgnoreCase("prod")) {
					for (int i = 0; i < 20; i++) {
						if (myUnitedPageLocators.pickYourfavoritePlayerMyUnitedScreen.size() <= 0) {
							IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
						} else {
							break;
						}
			}}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-scrollsDownToFavoritePlayerScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnEditButtonInFavoritePlayers() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen, 60);
			myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicked on edit button in favourite players");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}
	}

	public String getChoosePlayerInFavPlayerScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.choosePlayerTitleFavoritePlayerScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned choose player in favourite player screen ");
				return myUnitedPageLocators.choosePlayerTitleFavoritePlayerScreen.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.choosePlayerTitleFavoritePlayerScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned choose player in favourite player screen");
				return myUnitedPageLocators.choosePlayerTitleFavoritePlayerScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getChoosePlayerInFavPlayerScreen()<br />" + e);
			throw e;
		}
	}

	public String getMenInFavPlayerScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.menIconFavoritePlayerScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned men in favourite players screen");
				return myUnitedPageLocators.menIconFavoritePlayerScreen.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.menIconFavoritePlayerScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned men in favourite players screen");
				return myUnitedPageLocators.menIconFavoritePlayerScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getMenInFavPlayerScreen()<br />" + e);
			throw e;
		}
	}

	public String getWomenInFavPlayerScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.womenIconFavoritePlayerScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned women in favourite player screen");
				return myUnitedPageLocators.womenIconFavoritePlayerScreen.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.womenIconFavoritePlayerScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned women in favourite player screen");
				return myUnitedPageLocators.womenIconFavoritePlayerScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWomenInFavPlayerScreen()<br />" + e);
			throw e;
		}
	}

	public String clickOnFavoritePlayerInPlayersScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen, 60);
				String name=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen2.getText();
				myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicked on favourite player in players screen");
				return name;
			}else {
				waitForVisibilityFluentWait(myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen, 60);
				String name=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen2.getDomAttribute("label").replaceAll("[^A-Za-z]","").toUpperCase();
				myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicked on favourite player in players screen");
				return name;
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnFavoritePlayerInPlayersScreen()<br />" + e);
			throw e;
		}

	}

	public boolean validatesTheStarIconInsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.starIconOnFavPalyer, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed star icon");
			return myUnitedPageLocators.starIconOnFavPalyer.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheStarIconInsDisplayed()<br />" + e);
			throw e;
		}

	}

	public String getPlayerNameInUnitedScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				myUnitedPageLocators.shopTabIcon.click();
				myUnitedPageLocators.myUnitedButton.click();
                waitForVisibilityFluentWait(myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned players name in my united screen");
				return myUnitedPageLocators.playerFirstNameInMyUnitedScreen.getText().toUpperCase()+" "+myUnitedPageLocators.playerLastNameInMyUnitedScreen.getText().toUpperCase();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned edited players name in my united screen ");
				String fName=myUnitedPageLocators.playerFirstNameInMyUnitedScreen.getText();
				fName=fName.split(myUnitedPageLocators.playerLastNameInMyUnitedScreen.getText())[0].toUpperCase();
				return fName+" "+myUnitedPageLocators.playerLastNameInMyUnitedScreen.getText().toUpperCase();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnPlayerNameInUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public String getBuyShirtButtonScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.buyShirtIconMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned buy shirt icon in my united screen");
				return myUnitedPageLocators.buyShirtIconMyUnitedScreen.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.buyShirtIconMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned buy shirt icon in my united screen ");
				return myUnitedPageLocators.buyShirtIconMyUnitedScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getBuyShirtButtonScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnBuyShirtButtonInMyUnitedScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.buyShirtIconMyUnitedScreen, 60);
			myUnitedPageLocators.buyShirtIconMyUnitedScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicked on buy shirt button in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBuyShirtButtonInMyUnitedScreen()<br />" + e);
			throw e;
		}

	}

	public String getShopTitleShopScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.shopTitleFavPlayerShopScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned shop title in shop screen");
				return myUnitedPageLocators.shopTitleFavPlayerShopScreen.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.shopTitleFavPlayerShopScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned shop title in shop screen ");
				return myUnitedPageLocators.shopTitleFavPlayerShopScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getShopTitleShopScreen()<br />" + e);
			throw e;
		}
	}

	public boolean payerImageNMyUnitedScreenIsDisplayed() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.playerImageInMyUnitedScreen, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed played image");
			return myUnitedPageLocators.playerImageInMyUnitedScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-payerImageNMyUnitedScreenIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clickOnCrossIconInShopScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.crossIconInShopScreen, 60);
			myUnitedPageLocators.crossIconInShopScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on cross icon in shop screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnCrossIconInShopScreen()<br />" + e);
			throw e;
		}

	}

	public void clickOnEditIconInMyUnitedScreen() {

		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen, 60);
			myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on edit icon in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnEditIconInMyUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public String clickEditsTheFavoritePlayerInPlayerScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.selectEditedPlayerScreen, 60);
				String playerName2=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen2.getText().toUpperCase();
				myUnitedPageLocators.selectEditedPlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on edit the favourite players in players screen");
				return playerName2;
			}else{
				waitForVisibilityFluentWait(myUnitedPageLocators.selectEditedPlayerScreen, 60);
				String playerName2=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen2.getText().replaceAll("[^A-Za-z]","").toUpperCase();
				myUnitedPageLocators.selectEditedPlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on edit the favourite players in players screen");
				return playerName2;
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickEditsTheFavoritePlayerInPlayerScreen()<br />" + e);
			throw e;
		}

	}

	public String getEditedPlayerNameInMyUnitedScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
//				waitForVisibilityFluentWait(myUnitedPageLocators.editedPlayerNameMyUnitedScreen, 60);
				waitForVisibilityFluentWait(myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned edited players name in my united screen");
				return myUnitedPageLocators.playerFirstNameInMyUnitedScreen.getText().toUpperCase()+" "+myUnitedPageLocators.playerLastNameInMyUnitedScreen.getText().toUpperCase();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.editIconfavoritePlayerMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned edited players name in my united screen ");
				String fName=myUnitedPageLocators.playerFirstNameInMyUnitedScreen.getText();
				fName=fName.split(myUnitedPageLocators.playerLastNameInMyUnitedScreen.getText())[0].toUpperCase();
				return fName+" "+myUnitedPageLocators.playerLastNameInMyUnitedScreen.getText().toUpperCase();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getEditedPlayerNameInMyUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public String getCountryFlagMyUnitedScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if(myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.size()>0) {
					waitForVisibilityFluentWait(myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.get(0), 60);
					ExtentsReportManager.extentReportLogging("pass", "Returned country flag in my united screen");
					return myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.get(0).getText();
				}
				else return "noFlag";
			} else {
				if(myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.size()>0){
					waitForVisibilityFluentWait(myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.get(0), 60);
					ExtentsReportManager.extentReportLogging("pass", "Returned country flag in my united screen ");
					return myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.get(0).getDomAttribute("label").trim();
				}
				else return "noFlag";
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getCountryFlagMyUnitedScreen()<br />" + e);
			throw e;
		}

	}

	public void clickOnCountryFlagInMyUnitedScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.get(0), 60);
			myUnitedPageLocators.countryFlagPlayerMyUnitedScreen.get(0).click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on country flag in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnCountryFlagInMyUnitedScreen()<br />" + e);
			throw e;
		}

	}

	public boolean validateCalenderIcon() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.calenderIconUnitedPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed calender icon");
			return myUnitedPageLocators.calenderIconUnitedPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateCalenderIcon()<br />" + e);
			throw e;
		}

	}

	public void selectsPrintImageFromShareOptionInIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(myUnitedPageLocators.sharePointPrintFileStickersIos, 60);
			myUnitedPageLocators.sharePointPrintFileStickersIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Selects print image feom share options ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-selectsPrintImageFromShareOptionInIos()<br />" + e);
			throw e;
		}
	}

	public void clickOnShareIconInPrintScreenInIos() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.printIconPrintScreenIos, 60);
			myUnitedPageLocators.printIconPrintScreenIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on share icon in print screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnShareIconInPrintScreenInIos()<br />" + e);
			throw e;
		}

	}

	public void clickOnChromiumInPrintScreen() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.chromiumIconPrintScreenIos, 60);
			myUnitedPageLocators.chromiumIconPrintScreenIos.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on chromium in print screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnChromiumInPrintScreen()<br />" + e);
			throw e;
		}

	}

	public String getCancleIconText() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.cancleIconPrintScreenIos, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returned cancel icon text  in print screen");
			return myUnitedPageLocators.cancleIconPrintScreenIos.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getCancleIconText()<br />" + e);
			throw e;
		}
	}

	public String getOptionsIconText() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.optionsIconPrintScreenIos, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returned options icon in print screen");
			return myUnitedPageLocators.optionsIconPrintScreenIos.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getOptionsIconText()<br />" + e);
			throw e;
		}
	}

	public String getShareIconText() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.shareIconPrintScreenIos, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns share icon text in print screen");
			return myUnitedPageLocators.shareIconPrintScreenIos.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getShareIconText()<br />" + e);
			throw e;
		}
	}

	public void scrollDownToStickersIos() {
		for (int i = 0; i < 20; i++) {
			if (myUnitedPageLocators.stickersMyUnitedScreenIos.size() <= 0) {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			} else {
				break;
			}
		}
		ExtentsReportManager.extentReportLogging("pass", "scrolled down the stickers");
	}

	public void navigatesPointsScreenInIos() {
		try {
			for (int i = 0; i < 20; i++) {
				if (myUnitedPageLocators.pointsThisSeasonMyUnitedIos.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Navigated to point screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-navigatesPointsScreenInIos()<br />" + e);
			throw e;
		}

	}

	public void navigatesToAppDebutInIos() {
		try {
			for (int i = 0; i < 20; i++) {
				if (myUnitedPageLocators.editTshirtNumMYUnitedInIos.size() <= 0) {
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

	public void clickOnEditButtonIos() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.tShirtEditButton, 60);
			myUnitedPageLocators.tShirtEditButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicked on edit button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnEditButtonIos()<br />" + e);
			throw e;
		}

	}

	public void scrollsDownToMyUnitedAllPointsSeasonCard() {
		try {
			for (int i = 0; i < 20; i++) {
				if (myUnitedPageLocators.allPointsThisSeasonMYUnitedInIos.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolled down to my united all points seasons card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-scrollsDownToMyUnitedAllPointsSeasonCard()<br />" + e);
			throw e;
		}
	}

	public void scrollsDownToFavoritePlayerScreenInIos() {
		try {
			for (int i = 0; i < 20; i++) {
				if (myUnitedPageLocators.favoritePlayerMYUnitedInIos.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolled down to favourite screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
			throw e;
		}

	}

	public String getSirtNameMyUnited() {
		try {
//			 waitForVisibilityFluentWait(tShirtNameMyUnitedScreen);
			ExtentsReportManager.extentReportLogging("pass", "Returned shirt name in my united");
			return myUnitedPageLocators.tShirtNameMyUnitedScreen.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getSirtNameMyUnited()<br />" + e);
			throw e;
		}

	}

	public String getPlayerNameInUnitedScreenInIos() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.playerNameInMyUnitedScreen1, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returned players name in united now screen");
			return myUnitedPageLocators.playerNameInMyUnitedScreen1.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPlayerNameInUnitedScreenInIos()<br />" + e);
			throw e;
		}
	}

	public String getPlayerNameInUnitedScreenInAndroid() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.playerNameInMyUnitedScreen1, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returned player name in united now screen");
			return myUnitedPageLocators.playerNameInMyUnitedScreen1.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getPlayerNameInUnitedScreenInAndroid()<br />" + e);
			throw e;
		}
	}

	public void clickOnMyUnitedBtn() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.myUnitedTabLoggedIn, 60);
			myUnitedPageLocators.myUnitedTabLoggedIn.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on my united button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnMyUnitedBtn()<br />" + e);
			throw e;
		}

	}

	public void clicksContinueInMUAppPopup() {
		try {
			if (myUnitedPageLocators.mutvINAppPopUp.size() > 0) {
				if (myUnitedPageLocators.closeIconMutvINAppPopUp.size() > 0) {
				myUnitedPageLocators.closeIconMutvINAppPopUp.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on close icon in mutv in app popup");
				}
			}
			if (myUnitedPageLocators.muappPopup.size() > 0) {
//                continueMuApp.click();
				// backIconInboxUnitedPage.click();
//                Thread.sleep(2000);
				swipeWithCoordinates(986, 1081, 269, 1081, 200, "left", driver);
			}
			if (myUnitedPageLocators.muappPopup1.size() > 0) {
				if (myUnitedPageLocators.okButtonMuApp.size() > 0) {
					myUnitedPageLocators.okButtonMuApp.get(0).click();
					ExtentsReportManager.extentReportLogging("pass", "Clicks on ok button in mu app popup");
				} else if (myUnitedPageLocators.closeButtonMuApp.size() > 0) {
					myUnitedPageLocators.closeButtonMuApp.get(0).click();
					ExtentsReportManager.extentReportLogging("pass", "Clicks on close button in mu app popup");
				}
			} else if (myUnitedPageLocators.idfaVariantPopup.size() > 0) {
				if (myUnitedPageLocators.muappPopup1.get(0).getText().equalsIgnoreCase("IDFA Variant using modal")) {
					myUnitedPageLocators.noButtonIdfaVariant.click();
					ExtentsReportManager.extentReportLogging("pass", "Clicks on no button in idfa variant popup");
				}
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksContinueInMUAppPopup()<br />" + e);
			throw e;
		}

	}

	public void clicksOnInAppMessageNotificationAtBottomOfScreen() {
		try {
			if (myUnitedPageLocators.inAppPopup.size() > 0) {
				myUnitedPageLocators.inAppSlideIcon.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on in app slide icon");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnInAppMessageNotificationAtBottomOfScreen()<br />" + e);
			throw e;
		}
	}

	public void ClicksOnTestContinue() {
		try {
			if (!myUnitedPageLocators.continueTestMyUnitedPage.isEmpty()) {
				myUnitedPageLocators.continueTestMyUnitedPage1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicked on continue test in my united page");
				waitForVisibilityFluentWait(myUnitedPageLocators.backIconMyUnitedAppTest, 60);
				myUnitedPageLocators.backIconMyUnitedAppTest.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicked on back icon in my united app test");
			} 	else if (!myUnitedPageLocators.brazeINAppPopUp.isEmpty()) {
				myUnitedPageLocators.brazeINAppPopUp1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicked on braze in app popup ");
			} else if (!myUnitedPageLocators.inAppMessageTestMyUnitedPage1.isEmpty()) {
				myUnitedPageLocators.inAppMessageTestMyUnitedPage.click();
				waitForVisibilityFluentWait(myUnitedPageLocators.backIconMyUnitedAppTest1, 60);
				myUnitedPageLocators.backIconMyUnitedAppTest1.click();
				ExtentsReportManager.extentReportLogging("pass", "clicked on back icon in my united app ");
			}
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (StaleElementReferenceException se) {
			System.out.println("stale element exception");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-ClicksOnTestContinue()<br />" + e);
			throw e;
		}

	}

	public void clicksOnNoTracking() {
		try {
			if (!myUnitedPageLocators.trackingMyUnited1.isEmpty()) {
				myUnitedPageLocators.trackingMyUnited.click();
			} else if (!myUnitedPageLocators.notToTrack1.isEmpty()) {
				myUnitedPageLocators.notToTrack.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on no tracking");
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (StaleElementReferenceException se) {
			System.out.println("stale element exception");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnNoTracking()<br />" + e);
			throw e;
		}

	}

	public boolean validatesMyUnitedBenefitsDisplayedInOnboardingScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "SIGN FOR UNITED");
				return !myUnitedPageLocators.myUnitedBenefits.isEmpty();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				return !myUnitedPageLocators.myUnitedBenefits.isEmpty();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesMyUnitedBenefitsDisplayedInOnboardingScreen()<br />" + e);
			throw e;
		}
	}

	public boolean ValidatesBenefitsTilesInOnboardingScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				return !myUnitedPageLocators.myUnitedBenefitsTiles.isEmpty();
			} else {
				return !myUnitedPageLocators.myUnitedBenefitsTiles.isEmpty();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-ValidatesBenefitsTilesInOnboardingScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesBenefiltsTilesWhenImageIsOnexImage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				return !myUnitedPageLocators.myUnitedBenefitsTilesOneXImage.isEmpty();
			} else {
				return !myUnitedPageLocators.myUnitedBenefitsTilesOneXImage.isEmpty();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesBenefiltsTilesWhenImageIsOnexImage()<br />" + e);
			throw e;
		}
	}

	public boolean validatesViewBenefitsDisplayedInMyunitedScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "SIGN FOR UNITED");
				return !myUnitedPageLocators.viewBenefits.isEmpty();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				return !myUnitedPageLocators.viewBenefits.isEmpty();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesViewBenefitsDisplayedInMyunitedScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesBenefitsTilesInMyunitedScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				return !myUnitedPageLocators.myUnitedBenefitsTiles.isEmpty();
			} else {
				return !myUnitedPageLocators.viewBenefitsTiles.isEmpty();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesBenefitsTilesInMyunitedScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesBenefitsTilesWhenImageIsOnexImageInMyUnitedPage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				return !myUnitedPageLocators.myUnitedBenefitsTilesOneXImage.isEmpty();
			} else {
				return !myUnitedPageLocators.viewBenefitsTilesOneXImage.isEmpty();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesBenefitsTilesWhenImageIsOnexImageInMyUnitedPage()<br />"
							+ e);
			throw e;
		}
	}

	public void clicksOnEditProfileButtonInIos() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.editProfileMyProfilePage, 60);
			myUnitedPageLocators.editProfileMyProfilePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicked on edit profile in my profile page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnEditProfileButtonInIos()<br />" + e);
			throw e;
		}
	}

	public void editsThePostalcodeInEditProfilePageInIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			myUnitedPageLocators.postalCodeEditProfilePage.clear();
			myUnitedPageLocators.postalCodeEditProfilePage.sendKeys("123456");
			ExtentsReportManager.extentReportLogging("pass", "Clicks on postal code in edit profile page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-editsThePostalcodeInEditProfilePageInIos()<br />" + e);
			throw e;
		}
	}

	public void clicksSaveDetailsInEditProfileScreenInIos() {
		try {
			myUnitedPageLocators.saveDetailsEditProfilePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on save details in edit profile screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksSaveDetailsInEditProfileScreenInIos()<br />" + e);
			throw e;
		}
	}

	public String validatesTheSuccessMessageInEditProfileScreenInIos() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returned success message in edit profile page");
			return myUnitedPageLocators.successMessageEditProfilePage.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesTheSuccessMessageInEditProfileScreenInIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatesInboxIconIsNotDisplayedInMyUnitedPage() {
		try {
			if (myUnitedPageLocators.inboxIconUnitedPage.size() == 0) {
				ExtentsReportManager.extentReportLogging("pass", "validates inboxIconUnitedPage is not displayed ");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesInboxIconIsNotDisplayedInMyUnitedPage()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean validatesInboxIconIsNotDisplayedInMyUnitedPageinios() {
		try {
			if (myUnitedPageLocators.inboxIconUnitedPage.size() == 0) {
				ExtentsReportManager.extentReportLogging("pass", "validates inboxIconUnitedPage is not displayed ");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesInboxIconIsNotDisplayedInMyUnitedPage()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean userValidatesMyTicketsComponentInMyUnitedScreen() {
		try {
			 if (Common.apiEnv().equalsIgnoreCase("stage")) {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(myUnitedPageLocators.myTicketsComponentMyUnited, 60);
				ExtentsReportManager.extentReportLogging("pass", "validates myTicketsComponentMyUnited preprod displayed ");
				return myUnitedPageLocators.myTicketsComponentMyUnited.isDisplayed();
			}
			
			else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(myUnitedPageLocators.myTicketsComponentMyUnitedPreProd, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns My tickets text from My United Page ");
			return myUnitedPageLocators.myTicketsComponentMyUnitedPreProd.isDisplayed();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userValidatesMyTicketsComponentInMyUnitedScreen()<br />" + e);
			throw e;
		}
		return false;
	}

	public void userClicksOnMyTicketsComponentInMyUnitedScreen() {
		try {
			myUnitedPageLocators.myTicketsComponentMyUnited.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on my tickes component in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksOnMyTicketsComponentInMyUnitedScreen()<br />" + e);
			throw e;
		}
	}

	public boolean userValidatesStadiumComponentInMyUnitedScreen() {
		try {
			 if (Common.apiEnv().equalsIgnoreCase("stage")) {
			waitForVisibilityFluentWait(myUnitedPageLocators.stadiumComponentMyUnited, 60);
			if (myUnitedPageLocators.stadiumComponentMyUnited.isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "validates stadiumComponentMyUnitedPreProd preprod displayed ");
				return myUnitedPageLocators.stadiumComponentMyUnited.isDisplayed();
			}
			 }
			else if (Common.apiEnv().equalsIgnoreCase("prod")) {
			waitForVisibilityFluentWait(myUnitedPageLocators.stadiumComponentMyUnitedPreProd, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns My tickets text from My United Page ");
			return myUnitedPageLocators.stadiumComponentMyUnitedPreProd.isDisplayed();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userValidatesStadiumComponentInMyUnitedScreen()<br />" + e);
			throw e;
		}
		return false;
	}

	public void userClicksOnStadiumComponentInMyUnitedScreen() {
		try {
			myUnitedPageLocators.stadiumComponentMyUnited.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on my stadium component in my united screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksOnStadiumComponentInMyUnitedScreen()<br />" + e);
			throw e;
		}
		
	}

	public boolean userValidatesContentInStadiumComponent() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.stadiumComponentContentMyUnited, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns stadium text from My United Page ");
			return myUnitedPageLocators.stadiumComponentContentMyUnited.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userValidatesContentInStadiumComponent()<br />" + e);
			throw e;
		}
	}

	public boolean userValidatesContentInMyTicketsComponent() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.myTicketsContentMyUnited, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns my tickets text from My United Page ");
			return myUnitedPageLocators.myTicketsContentMyUnited.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userValidatesContentInStadiumComponent()<br />" + e);
			throw e;
		}
	}

	public void userClicksOnBackIconInMyTickets() {
		try {
			myUnitedPageLocators.backIconinMyTicketsMyUnited.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on back icon in my tickets screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClicksOnBackIconInMyTickets()<br />" + e);
			throw e;
		}
		
	}

	public String getBecomeAMember() {
		 String device = GlobalParams.getPlatformName();
	        try {
	            if (device.equalsIgnoreCase("android")) {
	                waitForVisibilityFluentWait(myUnitedPageLocators.getOfficialMemberCTABtnMyUnitedScreen, 60);
	                ExtentsReportManager.extentReportLogging("pass", "Returns Become a member in my united screen ");
	                return myUnitedPageLocators.getOfficialMemberCTABtnMyUnitedScreen.getText();
	            } else {
	                waitForVisibilityFluentWait(myUnitedPageLocators.getOfficialMemberCTABtnMyUnitedScreen, 60);
	                ExtentsReportManager.extentReportLogging("pass", "Returns Become a member in my united screens");
	                return myUnitedPageLocators.getOfficialMemberCTABtnMyUnitedScreen.getDomAttribute("label");
	            }
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getBecomeAMember()<br />" + e);
	            throw e;
	        }
	    }

	public String getBuyShirt() {
		 String device = GlobalParams.getPlatformName();
	        try {
	            if (device.equalsIgnoreCase("android")) {
	                waitForVisibilityFluentWait(myUnitedPageLocators.buyTShirtCTABtnMyUnitedScreen, 60);
	                ExtentsReportManager.extentReportLogging("pass", "Returns buy shirt text in my united screen ");
	                return myUnitedPageLocators.buyTShirtCTABtnMyUnitedScreen.getText();
	            } else {
	                waitForVisibilityFluentWait(myUnitedPageLocators.buyTShirtCTABtnMyUnitedScreen, 60);
	                ExtentsReportManager.extentReportLogging("pass", "Returns buy shirt text in my united screen ");
	                return myUnitedPageLocators.buyTShirtCTABtnMyUnitedScreen.getDomAttribute("label");
	            }
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getBuyShirt()<br />" + e);
	            throw e;
	        }
	}

	public List getStickersFromMyUnitedUI() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> actualStickers = new ArrayList<>();
		Set<String> uniqueString = new HashSet<>(actualStickers);
		try {
			int size = myUnitedPageLocators.stickersMyUnited.size();
			System.out.println("SIZE ++++++" +size);
			if (device.equalsIgnoreCase("android")) {
					for (int i = 0; i < size; i++) {
						actualStickers
								.add(myUnitedPageLocators.stickersMyUnited.get(i).getDomAttribute("content-desc").toLowerCase());

					}
					System.out.println("Actual Stickers ++++++" +actualStickers);
					uniqueString.addAll(actualStickers);
//					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.92);
//				}
////				uniqueString.addAll(actualShopMenuItems);
				ExtentsReportManager.extentReportLogging("pass", "Returns view all list");
			} else {
//				for (int j = 0; j < 3; j++) {
					for (int i = 0; i < size; i++) {
						actualStickers.add(myUnitedPageLocators.stickersMyUnited.get(i)
								.getDomAttribute("label").toLowerCase());
					}
					uniqueString.addAll(actualStickers);
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
					"Exception occurred in function-getStickersFromMyUnitedUI()<br />" + e);
			throw e;
		}
	}


	public void userClicksOnPreferenceCenterInIos() {
		try {
			if(myUnitedPageLocators.preferenceCenterInMyUnited.isDisplayed()){
          elementToBeClickableFluentWait(myUnitedPageLocators.preferenceCenterInMyUnited,60);
          myUnitedPageLocators.preferenceCenterInMyUnited.click();
          ExtentsReportManager.extentReportLogging("pass","Clicks on preference center in My United");
      } else {
    	  elementToBeClickableFluentWait(myUnitedPageLocators.preferenceCenterInMyUnited,60);
    	  myUnitedPageLocators.preferenceCenterInMyUnited.click();
          ExtentsReportManager.extentReportLogging("pass","Clicks on preference center in My United");
      }
      }
      catch (Exception e) {
          ExtentsReportManager.extentReportLogging("fail","Exception occured in function-userClicksOnPreferenceCenter()<br />" + e);
          throw e;
      }
  }

	public String getsTheTitleOfThePreferenceCenterScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.titleOfPreferenceCenter, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned shop title of the preference center");
				return myUnitedPageLocators.titleOfPreferenceCenter.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.titleOfPreferenceCenter, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned shop title of the preference center");
				return myUnitedPageLocators.titleOfPreferenceCenter.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getsTheTitleOfThePreferenceCenterScreen()<br />" + e);
			throw e;
		}
	}

	public void selectingOneOfTheChecklistInThePreferenceCenterScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
          elementToBeClickableFluentWait(myUnitedPageLocators.selectingChecklistInPreferenceCenter,60);
          myUnitedPageLocators.selectingChecklistInPreferenceCenter.click();
          ExtentsReportManager.extentReportLogging("pass","selects the check list in My United");
      } else {
    	  elementToBeClickableFluentWait(myUnitedPageLocators.selectingChecklistInPreferenceCenter,60);
    	  myUnitedPageLocators.selectingChecklistInPreferenceCenter.click();
          ExtentsReportManager.extentReportLogging("pass","selects the check list in My United");
      }
      }
      catch (Exception e) {
          ExtentsReportManager.extentReportLogging("fail","Exception occured in function-selectingOneOfTheChecklistInThePreferenceCenterScreen()<br />" + e);
          throw e;
      }
  }
	
//		 try {
//			 if(myUnitedPageLocators.selectingChecklistInPreferenceCenter.isDisplayed())
//	            waitForVisibilityFluentWait(myUnitedPageLocators.selectingChecklistInPreferenceCenter, 60);
//	            myUnitedPageLocators.selectingChecklistInPreferenceCenter.click();
//	            ExtentsReportManager.extentReportLogging("pass", "Clicks on selectingOneOfTheChecklistInThePreferenceCenterScreen ");
//		 } else {
//			 
//			 
//	        } catch (Exception e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-selectingOneOfTheChecklistInThePreferenceCenterScreen()<br />" + e);
//	            throw e;
//
//	        }
//	    }

	public void clicksOnSavePreferenceButton() {
		try {
            waitForVisibilityFluentWait(myUnitedPageLocators.saveButtonInPreferenceCenter, 60);
            myUnitedPageLocators.saveButtonInPreferenceCenter.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on selectingOneOfTheChecklistInThePreferenceCenterScreen ");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clicksOnSavePreferenceButton()<br />" + e);
            throw e;

        }
		
	}

	public String validatesPreferenceUpdatedMessage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.updatedPreferenceCenter, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned updated status of preference center");
				return myUnitedPageLocators.updatedPreferenceCenter.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.updatedPreferenceCenter, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned updated status of preference center");
				return myUnitedPageLocators.updatedPreferenceCenter.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesPreferenceUpdatedMessage()<br />" + e);
			throw e;
		}
	}
		
	public void userScrollsRightToLeftToNavigateAppearence() {
		            	String device = GlobalParams.getPlatformName();
		        		try {
		        			for (int i = 0; i < 5; i++) {
		        				if (!(myUnitedPageLocators.viewSeasonFour1.size() > 0)) {
		        					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.RIGHT, 0.7);
		        				} else {
		        					break;
		        				}
		        			}
		        			ExtentsReportManager.extentReportLogging("pass", "Returns Right To Left To Navigate Appearence Text");
		        		} catch (Exception e) {
		        			ExtentsReportManager.extentReportLogging("fail",
		        					"Exception occurred in function-userScrollsRightToLeftToNavigateAppearence()<br />" + e);
		        			throw e;
		        		}
//		        		return false;
		                   
	}

	
	public boolean getPlayerNameInUnitedScreenInIos(String expPlayerName) {
	    try {
	        
	        String playerName = expPlayerName.replace(" ", "");
	        String xpath = "//XCUIElementTypeStaticText[starts-with(@name, '" + playerName + "')]";
	        WebElement playerEle = driver.findElement(AppiumBy.xpath(xpath));
	        waitForVisibilityFluentWait(playerEle, 60);
	        ExtentsReportManager.extentReportLogging("pass", 
	            "Player '" + expPlayerName + "' is displayed in United Now screen");

	        return true;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", 
	            "Exception in getPlayerNameInUnitedScreenInIos for player '" + expPlayerName + "'<br />" + e);
	        return false; 
	    }
	}

	public String clickEditsAFavoritePlayerInPlayerScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.selectEditedPlayerScreen, 60);
				String playerName2=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen2.getText();
				myUnitedPageLocators.selectEditedPlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on edit the favourite players in players screen");
				return playerName2;
			}else{
				waitForVisibilityFluentWait(myUnitedPageLocators.selectEditedPlayerScreen, 60);
				String playerName2=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen2.getText().replaceAll("[^A-Za-z]","");
				myUnitedPageLocators.selectEditedPlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on edit the favourite players in players screen");
				return playerName2;
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickEditsAFavoritePlayerInPlayerScreen()<br />" + e);
			throw e;
		}
	}
	
	public String clickEditsTheFavoritePlayer1InPlayerScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.selectEditedPlayerScreen1, 60);
				String playerName1=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen1.getText().toUpperCase();
				myUnitedPageLocators.selectEditedPlayerScreen1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on edit the favourite players in players screen");
				return playerName1;
			}else{
				waitForVisibilityFluentWait(myUnitedPageLocators.selectEditedPlayerScreen1, 60);
				String playerName1=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen1.getText().replaceAll("[^A-Za-z]","").toUpperCase();
				myUnitedPageLocators.selectEditedPlayerScreen1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on edit the favourite players in players screen");
				return playerName1;
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickEditsTheFavoritePlayer1InPlayerScreen()<br />" + e);
			throw e;
		}

	}
	public void switchToWebView() {
		   AndroidGenericLibrary.switchToWebViewContext((AndroidDriver) driver);
		
	}

	public void enterUsername(String usernameNew) {
		try {
			if (myUnitedPageLocators.newEmailTextBoxMyProfile1.size() > 0) {
			 waitForVisibilityFluentWait(myUnitedPageLocators.newEmailTextBoxMyProfile,60);
             myUnitedPageLocators.newEmailTextBoxMyProfile.sendKeys(usernameNew);
             ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
			} else if (myUnitedPageLocators.newEmailTextBoxMyProfilePreprod1.size() > 0) {
				 waitForVisibilityFluentWait(myUnitedPageLocators.newEmailTextBoxMyProfilePreprod,60);
	                myUnitedPageLocators.newEmailTextBoxMyProfilePreprod.sendKeys(usernameNew);
	                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
			}
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterUsername()<br />" + e);
//	           throw e;

	        }
		
	}

	public void enterPassword(String password) {
		 try {
			 if (myUnitedPageLocators.passwordTextBoxMyProfile1.size() > 0) {
	            waitForVisibilityFluentWait(myUnitedPageLocators.passwordTextBoxMyProfile,60);
	            myUnitedPageLocators.passwordTextBoxMyProfile.sendKeys(password);
	            AndroidGenericLibrary.hideKeyBoard(driver);
	            ExtentsReportManager.extentReportLogging("pass","Enters Password");
		 }else if (myUnitedPageLocators.passwordTextBoxMyProfilePreprod1.size() > 0) {
		 waitForVisibilityFluentWait(myUnitedPageLocators.passwordTextBoxMyProfilePreprod,60);
         myUnitedPageLocators.passwordTextBoxMyProfilePreprod.sendKeys(password);
//         AndroidGenericLibrary.hideKeyBoard(driver);
         ExtentsReportManager.extentReportLogging("pass","Enters Password preprod");
		 }
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterPassword()<br />" + e);
	           throw e;

	        }
		
	}

	public void enterConfirmUsername(String confirmusernameNew) {
	        try {
	            if(myUnitedPageLocators.confirmEmailTextBoxMyProfile1.size() > 0) {
//	            elementToBeClickableFluentWait(idmPageLocators.emailTextBox);
	                waitForVisibilityFluentWait(myUnitedPageLocators.confirmEmailTextBoxMyProfile,60);
	                myUnitedPageLocators.confirmEmailTextBoxMyProfile.sendKeys(confirmusernameNew);
	                ExtentsReportManager.extentReportLogging("pass","enters confirm email");
	            }else if (myUnitedPageLocators.confirmEmailTextBoxMyProfilePreprod1.size() > 0) {
	                waitForVisibilityFluentWait(myUnitedPageLocators.confirmEmailTextBoxMyProfilePreprod,60);
	                myUnitedPageLocators.confirmEmailTextBoxMyProfilePreprod.sendKeys(confirmusernameNew);
	                ExtentsReportManager.extentReportLogging("pass","enters confirm email preprod");
	            }

	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterUsername()<br />" + e);
//	           throw e;

	        }
		
	}

	public void clicksOnUpdateEmailAddressInMyProfile() {
		try {
			if(myUnitedPageLocators.updateEmailAddressInChangeEmail1.size() > 0) {
//	            elementToBeClickableFluentWait(idmPageLocators.emailTextBox);
	                waitForVisibilityFluentWait(myUnitedPageLocators.updateEmailAddressInChangeEmail,60);
	                myUnitedPageLocators.updateEmailAddressInChangeEmail.click();
	                ExtentsReportManager.extentReportLogging("pass","Clicks on update email change email page");
	            }else if (myUnitedPageLocators.updateEmailAddressInChangeEmailPreprod1.size() > 0) {
	            	  waitForVisibilityFluentWait(myUnitedPageLocators.updateEmailAddressInChangeEmailPreprod,60);
		                myUnitedPageLocators.updateEmailAddressInChangeEmailPreprod.click();
	                ExtentsReportManager.extentReportLogging("pass","enters confirm email preprod");
	            }
			
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnUpdateEmailAddressInMyProfile()<br />" + e);
			throw e;
		}
		
	}

	public String userValidatesEmailChangeSuccessfullyMessage() {
		try {
			if(myUnitedPageLocators.emailUpdateSuccessMessage.isDisplayed()) {
			waitForVisibilityFluentWait(myUnitedPageLocators.emailUpdateSuccessMessage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns userValidates Email Change SuccessfullyMessage");
			return myUnitedPageLocators.emailUpdateSuccessMessage.getText();
			}else if (myUnitedPageLocators.emailUpdateSuccessMessage.isDisplayed()) {
				waitForVisibilityFluentWait(myUnitedPageLocators.emailUpdateSuccessMessage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns userValidates Email Change SuccessfullyMessage preprod");
				return myUnitedPageLocators.emailUpdateSuccessMessage.getText();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getWelcomeTextInChinese()<br />" + e);
			throw e;
		}
		return null;
	}

	public void clicksOnCloseIconInEmailUpdateSuccessScreen() {
		try {
			myUnitedPageLocators.closeIconEmailUpdateScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on update email change email page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnUpdateEmailAddressInMyProfile()<br />" + e);
			throw e;
		}

	}

	
	public String getTshirtNames() {
		String device = GlobalParams.getPlatformName();
		String tShirtName;
		try {
			if (device.equalsIgnoreCase("android")) {				
				waitForVisibilityFluentWait(myUnitedPageLocators.tShirtNameMyUnitedScreen, 60);
				tShirtName = myUnitedPageLocators.tShirtNameMyUnitedScreen.getText();
				ExtentsReportManager.extentReportLogging("pass", "Returns t shirt name in my united screen "+tShirtName);
				return tShirtName;
			} else {
				tShirtName = myUnitedPageLocators.tShirtNameMyUnitedScreen.getDomAttribute("name");
				ExtentsReportManager.extentReportLogging("pass", "Returns t shirt name in my united screen "+tShirtName);
				return tShirtName;
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getTshirtNames()<br />" + e);
			throw e;
		}
	}


	public void enterAddressLineOne(String addr1) {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
    				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
        	myUnitedPageLocators.addLineOneEditProfile1.clear();
            waitForVisibilityFluentWait(myUnitedPageLocators.addLineOneEditProfile,60);
            myUnitedPageLocators.addLineOneEditProfile.sendKeys(addr1);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineOneEditProfilePage");
            }
            else {		
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
        	myUnitedPageLocators.addLineOneEditProfile1.clear();
            waitForVisibilityFluentWait(myUnitedPageLocators.addLineOneEditProfile,60);
            myUnitedPageLocators.addLineOneEditProfile.sendKeys(addr1);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineOneEditProfilePage");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineOne()<br />" + e);
           throw e;

        }
    }

    public void enterAddressLinetwo(String addr2) {
        	String device = GlobalParams.getPlatformName();
    		try {
    			if (device.equalsIgnoreCase("android")) {
        	myUnitedPageLocators.addLineTwoEditProfile1.clear();
            waitForVisibilityFluentWait(myUnitedPageLocators.addLineTwoEditProfile,60);
            myUnitedPageLocators.addLineTwoEditProfile.sendKeys(addr2);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineTwoEditProfilePage");
    			}
            else {
            	myUnitedPageLocators.addLineTwoEditProfile1.clear();
                waitForVisibilityFluentWait(myUnitedPageLocators.addLineTwoEditProfile,60);
                myUnitedPageLocators.addLineTwoEditProfile.sendKeys(addr2);
                ExtentsReportManager.extentReportLogging("pass","Enters addressLineTwoEditProfilePage");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLinetwo()<br />" + e);
           throw e;

        }
    }

    public void enterAddressLineThree(String addr3) {
    	String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
        	myUnitedPageLocators.addLineThreeEditProfile1.clear();
            waitForVisibilityFluentWait(myUnitedPageLocators.addLineThreeEditProfile,60);
            myUnitedPageLocators.addLineThreeEditProfile.sendKeys(addr3);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineThreeEditProfilePage");
			}
			else {
				myUnitedPageLocators.addLineThreeEditProfile1.clear();
	            waitForVisibilityFluentWait(myUnitedPageLocators.addLineThreeEditProfile,60);
	            myUnitedPageLocators.addLineThreeEditProfile.sendKeys(addr3);
	            ExtentsReportManager.extentReportLogging("pass","Enters addressLineThreeEditProfilePage");
			}
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineThree()<br />" + e);
           throw e;

        }
    }

    public void enterAddressLineTown(String town) {
        	String device = GlobalParams.getPlatformName();
    		try {
    			if (device.equalsIgnoreCase("android")) {
        	myUnitedPageLocators.townOrcityEditProfile1.clear();
            waitForVisibilityFluentWait(myUnitedPageLocators.townOrcityEditProfile,60);
            myUnitedPageLocators.townOrcityEditProfile.sendKeys(town);
            ExtentsReportManager.extentReportLogging("pass","Enters townEditProfilePage");
    			}
    			else {
    				myUnitedPageLocators.townOrcityEditProfile1.clear();
    	            waitForVisibilityFluentWait(myUnitedPageLocators.townOrcityEditProfile,60);
    	            myUnitedPageLocators.townOrcityEditProfile.sendKeys(town);
    	            ExtentsReportManager.extentReportLogging("pass","Enters townEditProfilePage");	
    			}
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineTown()<br />" + e);
           throw e;

        }
    }


	public String validateSuccessMessageInEditProfile() {
			String device = GlobalParams.getPlatformName();
    		try {
    			if (device.equalsIgnoreCase("android")) {
			waitForVisibilityFluentWait(myUnitedPageLocators.successMessageInEditProfile, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displayed Successs message");
			return myUnitedPageLocators.successMessageInEditProfile.getText();
    			}
    			else {
    				waitForVisibilityFluentWait(myUnitedPageLocators.successMessageInEditProfile, 60);
    				ExtentsReportManager.extentReportLogging("pass", "Displayed Successs message");
    				return myUnitedPageLocators.successMessageInEditProfile.getText();
    			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateSuccessMessageInEditProfile()<br />"
							+ e);
			throw e;
		}
}

	public void enterPinCode(String Test12345) {
			String device = GlobalParams.getPlatformName();
    		try {
    			if (device.equalsIgnoreCase("android")) {
			 myUnitedPageLocators.pinCodeInEditProfile1.clear();
            waitForVisibilityFluentWait(myUnitedPageLocators.pinCodeInEditProfile,60);
            myUnitedPageLocators.pinCodeInEditProfile.sendKeys(Test12345);
            ExtentsReportManager.extentReportLogging("pass","Enters townEditProfilePage");
    			}
    			else {
    				 myUnitedPageLocators.pinCodeInEditProfile1.clear();
    		            waitForVisibilityFluentWait(myUnitedPageLocators.pinCodeInEditProfile,60);
    		            myUnitedPageLocators.pinCodeInEditProfile.sendKeys(Test12345);
    		            ExtentsReportManager.extentReportLogging("pass","Enters townEditProfilePage");
    			}
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineTown()<br />" + e);
           throw e;

        }
		
	}

	public String getAddr1Text() {
		 try {
			 IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.9);
	            waitForVisibilityFluentWait(myUnitedPageLocators.addLineOneEditProfile1,60);
	            ExtentsReportManager.extentReportLogging("pass","Returns townEditProfilePage  Text ");
	            return myUnitedPageLocators.addLineOneEditProfile1.getText();
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTownText()<br />" + e);
	           throw e;
	        }
	}

	public String getAddr2Text() {
		 try {
	            waitForVisibilityFluentWait(myUnitedPageLocators.addLineTwoEditProfile1,60);
	            ExtentsReportManager.extentReportLogging("pass","Returns townEditProfilePage  Text ");
	            return myUnitedPageLocators.addLineTwoEditProfile1.getText();
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTownText()<br />" + e);
	           throw e;
	        }
	}

	public String getAddr3Text() {
		 try {
	            waitForVisibilityFluentWait(myUnitedPageLocators.addLineThreeEditProfile1,60);
	            ExtentsReportManager.extentReportLogging("pass","Returns townEditProfilePage  Text ");
	            return myUnitedPageLocators.addLineThreeEditProfile1.getText();
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTownText()<br />" + e);
	           throw e;
	        }
	}

	public String getTownText() {
		 try {
			 IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
	            waitForVisibilityFluentWait(myUnitedPageLocators.townOrcityEditProfile1,60);
	            ExtentsReportManager.extentReportLogging("pass","Returns townEditProfilePage  Text ");
	            return myUnitedPageLocators.townOrcityEditProfile1.getText();
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTownText()<br />" + e);
	           throw e;
	        }
	}

	public String getPincodeText() {
		 try {
	            waitForVisibilityFluentWait(myUnitedPageLocators.pinCodeInEditProfile1,60);
	            ExtentsReportManager.extentReportLogging("pass","Returns townEditProfilePage  Text ");
	            return myUnitedPageLocators.pinCodeInEditProfile1.getText();
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTownText()<br />" + e);
	           throw e;
	        }
	}

	public void ClearsAllDataInTextboxInEditProfileScreen() {
		try {
	        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);

	        if (myUnitedPageLocators.addLineOneEditProfile1.isDisplayed()) {
	            myUnitedPageLocators.addLineOneEditProfile1.clear();
	        }

	        if (myUnitedPageLocators.addLineTwoEditProfile1.isDisplayed()) {
	            myUnitedPageLocators.addLineTwoEditProfile1.clear();
	        }

	        if (myUnitedPageLocators.addLineThreeEditProfile1.isDisplayed()) {
	            myUnitedPageLocators.addLineThreeEditProfile1.clear();
	        }

	        if (myUnitedPageLocators.townOrcityEditProfile1.isDisplayed()) {
	            myUnitedPageLocators.townOrcityEditProfile1.clear();
	        }


	    } catch (NoSuchElementException e) {
	        System.out.println("Element not displayed, skipping: " + e.getMessage());
	    } catch (StaleElementReferenceException e) {
	        System.out.println("Stale element, skipping: " + e.getMessage());
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in ClearsAllDataInTextboxInEditProfileScreen()<br />" + e);
	        throw e;
	    }
	}		

public boolean navigatesToAboutYouInMyUnitedScreen() {
	    try {
	    	if (Common.apiEnv().equalsIgnoreCase("stage")) {
	        for (int i = 0; i < 5; i++) {
	            if (!(myUnitedPageLocators.aboutYouMyUnitedScreen.size() > 0)) {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
	            } else {
	                ExtentsReportManager.extentReportLogging("pass", "Returns about you");
	                return true;
	            }
	        }
	        ExtentsReportManager.extentReportLogging("fail", "aboutYouMyUnitedScreen not displayed after scrolling");
	        return false;
	    } 
	     else if (Common.apiEnv().equalsIgnoreCase("prod")) {
			// About You section is not expected in prod
			ExtentsReportManager.extentReportLogging("pass", "About You section is not displayed in prod, as expected.");
			return true;
	    }
} catch (Exception e) {
	ExtentsReportManager.extentReportLogging("fail", "Exception occurred while validating About You section<br />" + e);
	throw e;
}
return false;
}

public boolean validatesTextContainingUserFirstnameLastNameCountryAndAgeDetails() {
	try {
		if (Common.apiEnv().equalsIgnoreCase("stage")) {
			String aboutYouText = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'desc_textView')]")).getText();
			System.out.println("About You Text: " + aboutYouText);

			if (aboutYouText.contains("ManuPreprod") &&
			    aboutYouText.contains("Preprod") &&
			    aboutYouText.contains("30 Apr 2025") &&
			    aboutYouText.contains("India") &&
			    aboutYouText.contains("24")) {

				ExtentsReportManager.extentReportLogging("pass", "Name, DOJ, age, and country are correctly displayed in the description.");
				return true;
			} else {
				ExtentsReportManager.extentReportLogging("fail", "One or more user details are missing or incorrect in the description.");
				return false;
			}
		} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
			// About You section is not expected in prod
			ExtentsReportManager.extentReportLogging("pass", "About You section is not displayed in prod, as expected.");
			return true;
		}
	} catch (Exception e) {
		ExtentsReportManager.extentReportLogging("fail", "Exception occurred while validating About You section<br />" + e);
		throw e;
	}
	return false;
	
}

public boolean validatesTextContainingUserFirstnameLastNameCountryAndAgeDetailsinios() {
	try {
		 if (Common.apiEnv().equalsIgnoreCase("stage")) {
	    String aboutYouText = driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3 or position()=4]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")).getText();
	    System.out.println("About You Text: " + aboutYouText);
	    if (aboutYouText.contains("Manupreprod") && aboutYouText.contains("Preprod")
	    		&& aboutYouText.contains("30 Apr 2025") && aboutYouText.contains("India") 
	    		&& aboutYouText.contains("24")) {
	        ExtentsReportManager.extentReportLogging("pass", "Name and DOJ are correctly displayed in the description.");
	    } else {
	        ExtentsReportManager.extentReportLogging("fail", "Mismatch in Name or DOJ in the description.");
	    }
		 }
			else if (Common.apiEnv().equalsIgnoreCase("prod")) {
		    String aboutYouText = driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3 or position()=4]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")).getText();
		    System.out.println("About You Text: " + aboutYouText);
		    if (aboutYouText.contains("Manu") && aboutYouText.contains("Preprod")
		    		&& aboutYouText.contains("24 Apr 2025") && aboutYouText.contains("India") 
		    		&& aboutYouText.contains("25")) {
		        ExtentsReportManager.extentReportLogging("pass", "Name and DOJ are correctly displayed in the description.");
		    } else {
		        ExtentsReportManager.extentReportLogging("fail", "Mismatch in Name or DOJ in the description.");
		    }
			}
	} catch (Exception e) {
	    ExtentsReportManager.extentReportLogging("fail", "Exception occurred while validating About You section<br />" + e);
	    throw e;
	}
	return false;
	
}

public String getUserPersonalizedDescription() {
	  String device = GlobalParams.getPlatformName();
	    try {
	        waitForVisibilityFluentWait(myUnitedPageLocators.descAboutYouMyuniteScreen, 60);
	        ExtentsReportManager.extentReportLogging("pass", "Returned personalized user description text");

	        if (device.equalsIgnoreCase("android")) {
	            return myUnitedPageLocators.descAboutYouMyuniteScreen.getText();
	        } else {
	            return myUnitedPageLocators.descAboutYouMyuniteScreen.getDomAttribute("label");
	        }
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail",
	            "Exception occurred in function-getUserPersonalizedDescription()<br />" + e);
	        throw e;
	    }
}

	public boolean navigatesToAboutYouInMyUnitedScreenIos() { 
	    String device = GlobalParams.getPlatformName();
	    try {
	        for (int i = 0; i < 5; i++) {
	            if (!(myUnitedPageLocators.aboutYouMyUnitedScreen.size() > 0)) {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
	            } else {
	                ExtentsReportManager.extentReportLogging("pass", "Returns about you");
	                return true;
	            }
	        }
	        ExtentsReportManager.extentReportLogging("fail", "aboutYouMyUnitedScreen not displayed after scrolling");
	        return false;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail",
	                "Exception occurred in function-navigatesToAboutYouInMyUnitedScreenIos()<br />" + e);
	        return false;
	    }
	}

public void validateBackgroundColor() {
	try {
	    WebElement backgroundElement = driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id, \"framelayout_background\")]"));

	    // Get element location and size
	    org.openqa.selenium.Point location = backgroundElement.getLocation();
	    org.openqa.selenium.Dimension size = backgroundElement.getSize();

	    // Capture full screen screenshot
	    File fullScreenshot = driver.getScreenshotAs(OutputType.FILE);
	    BufferedImage fullImg = ImageIO.read(fullScreenshot);

	    // Crop the screenshot to the element's bounds
	    BufferedImage croppedImg = fullImg.getSubimage(
	        location.getX(),
	        location.getY(),
	        size.getWidth(),
	        size.getHeight()
	    );
	    // Get center pixel color
	    int centerX = (int)(croppedImg.getWidth() * 0.6);
	    int centerY = (int)(croppedImg.getHeight() * 0.6);
	    Color actualColor = new Color(croppedImg.getRGB(centerX, centerY));

	    // Define the reference colors
	    Color red = new Color(182, 38, 26);
	    Color platinum = new Color(229, 228, 226); // example RGB for platinum
	    Color gold = new Color(255, 215, 0);       // example RGB for gold

	    String colorName;
	    if (actualColor.equals(red)) {
	        colorName = "Red";
	    } else if (actualColor.equals(platinum)) {
	        colorName = "Platinum";
	    } else if (actualColor.equals(gold)) {
	        colorName = "Gold";
	    } else {
	        colorName = "Other";
	    }

	    System.out.println("Detected color: RGB(" 
	        + actualColor.getRed() + "," 
	        + actualColor.getGreen() + "," 
	        + actualColor.getBlue() + ") → " + colorName);

	    Color expectedColor = red; // or platinum or gold depending on test

	    if (!actualColor.equals(expectedColor)) {
	        throw new AssertionError("Expected: " + expectedColor + ", but found: " + actualColor);
	    }

	    ExtentsReportManager.extentReportLogging("pass", "Background color validated successfully: " + colorName);

	} catch (IOException e) {
	    ExtentsReportManager.extentReportLogging("fail", "IOException while reading screenshot<br />" + e);
	    throw new RuntimeException(e);
	} catch (Exception e) {
	    ExtentsReportManager.extentReportLogging("fail", "Exception in validateBackgroundColor()<br />" + e);
	    throw e;
	}
}

public void validateBackgroundColorInIos() {
	try {
	    WebElement backgroundElement = driver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]"));

	    // Get element location and size
	    org.openqa.selenium.Point location = backgroundElement.getLocation();
	    org.openqa.selenium.Dimension size = backgroundElement.getSize();

	    // Capture full screen screenshot
	    File fullScreenshot = driver.getScreenshotAs(OutputType.FILE);
	    BufferedImage fullImg = ImageIO.read(fullScreenshot);

	    // Crop the screenshot to the element's bounds
	    BufferedImage croppedImg = fullImg.getSubimage(
	        location.getX(),
	        location.getY(),
	        size.getWidth(),
	        size.getHeight()
	    );
	    // Get center pixel color
	    int centerX = (int)(croppedImg.getWidth() * 0.6);
	    int centerY = (int)(croppedImg.getHeight() * 0.6);
	    Color actualColor = new Color(croppedImg.getRGB(centerX, centerY));

	    // Define the reference colors
	    Color red = new Color(198, 1, 2);
	    Color platinum = new Color(229, 228, 226); 
	    Color gold = new Color(255, 215, 0);   

	    String colorName;
	    if (actualColor.equals(red)) {
	        colorName = "Red";
	    } else if (actualColor.equals(platinum)) {
	        colorName = "Platinum";
	    } else if (actualColor.equals(gold)) {
	        colorName = "Gold";
	    } else {
	        colorName = "Other";
	    }

	    System.out.println("Detected color: RGB(" 
	        + actualColor.getRed() + "," 
	        + actualColor.getGreen() + "," 
	        + actualColor.getBlue() + ") → " + colorName);

	    Color expectedColor = red; 

	    if (!actualColor.equals(expectedColor)) {
	        throw new AssertionError("Expected: " + expectedColor + ", but found: " + actualColor);
	    }

	    ExtentsReportManager.extentReportLogging("pass", "Background color validated successfully: " + colorName);

	} catch (IOException e) {
	    ExtentsReportManager.extentReportLogging("fail", "IOException while reading screenshot<br />" + e);
	    throw new RuntimeException(e);
	} catch (Exception e) {
	    ExtentsReportManager.extentReportLogging("fail", "Exception in validateBackgroundColor()<br />" + e);
	    throw e;
	}
	
}
	public void clicksOnChangePasswordInMyProfile() {
	try {
		myUnitedPageLocators.changePasswordMyProfilePage.click();
		ExtentsReportManager.extentReportLogging("pass", "Clicks on change Password My Profie page");
	} catch (Exception e) {
		ExtentsReportManager.extentReportLogging("fail",
				"Exception occurred in function-clicksOnChangePasswordInMyProfile()<br />" + e);
		throw e;
	}
	}
	
	public void clicksOnUpdatePasswordInChangePassword() {
		try {
			myUnitedPageLocators.updatePasswordChangePasswordScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on Update Password in change Password page");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clicksOnUpdatePasswordInChangePassword()<br />" + e);
			throw e;
		}
	}
	
	public boolean userValidatesPasswordUpdatedSuccessfullyMessage() {
	    try {
	        waitForVisibilityFluentWait(myUnitedPageLocators.pwUpdatedtxtChangePasswordScreen, 60);

	        boolean isMessageDisplayed = myUnitedPageLocators.pwUpdatedtxtChangePasswordScreen.isDisplayed();
	        boolean isChangePasswordSectionVisible = myUnitedPageLocators.pwUpdateMsgChangePasswordScreen.isDisplayed();

	        if (isMessageDisplayed && isChangePasswordSectionVisible) {
	            ExtentsReportManager.extentReportLogging("pass", "Password update success messages are visible.");
	            return true;
	        } else {
	            ExtentsReportManager.extentReportLogging("fail", "Password update success messages are not visible.");
	            return false;
	        }

	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail",
	                "Exception occurred in function-userValidatesPasswordUpdatedSuccessfullyMessage()<br />" + e);
	        throw e;
	    }
	}


	public void updatePassword() throws Exception {
	      String device = GlobalParams.getPlatformName();
	        try {
	        	String oldpassword = Common.getOldPassword();	
	        	String newpassword = Common.getNewPassword();
	        	GlobalParams.setNewPassword(newpassword);
                waitForVisibilityFluentWait(myUnitedPageLocators.currentPasswordChangePasswordScreen,60);
                myUnitedPageLocators.currentPasswordChangePasswordScreen.sendKeys(oldpassword);
                myUnitedPageLocators.newPasswordChangePasswordScreen.sendKeys(newpassword);
                myUnitedPageLocators.confirmNewPasswordChangePasswordScreen.sendKeys(newpassword);
                System.out.println("newpassword "+newpassword +" oldpassword "+ oldpassword);
                ExtentsReportManager.extentReportLogging("pass","Updated old password with New Password ");
	        } catch (Exception e) {
	           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-updatePassword()<br />" + e);
	           throw e;

	        }
	}

}
	

	
	
		
	


