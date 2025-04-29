package org.bdd.pages;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.MyUnitedPageLocators;
import org.bdd.utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

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
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
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
			waitForVisibilityFluentWait(myUnitedPageLocators.calenderIconChineseUnitedNowIos, 60);
			ExtentsReportManager.extentReportLogging("pass", "Displays calender icon in chinese united now");
			return myUnitedPageLocators.calenderIconChineseUnitedNowIos.isDisplayed();
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
			if (device.equalsIgnoreCase("android")) {

//				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "FAVOURITE PLAYER");
                do {
                    IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
                } while (myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.size() <= 0);
				waitForVisibilityFluentWait(myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0), 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns points this season cars text");
				return myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0).getText();
			} else {
//				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				waitForVisibilityFluentWait(myUnitedPageLocators.pointThisSeasonCardMyunitedScreen.get(0), 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns points this season cars text ");
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
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "MY STICKERS");
				waitForVisibilityFluentWait(myUnitedPageLocators.myStickersTextMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my stickers text in my united screen ");
				return myUnitedPageLocators.myStickersTextMyUnitedScreen.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.myStickersTextMyUnitedScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns my stickers text in my united screen");
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
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "Score this season");
				waitForVisibilityFluentWait(myUnitedPageLocators.scoreThisSeasonSeasonOne, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Score this season ");
				return myUnitedPageLocators.scoreThisSeasonSeasonOne.getText();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				waitForVisibilityFluentWait(myUnitedPageLocators.scoreThisSeasonSeasonOne, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns Score this season");
				return myUnitedPageLocators.scoreThisSeasonSeasonOne.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getScoredCardThisSeason()<br />" + e);
			throw e;
		}
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
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.RIGHT, 0.7);
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
				//swipeWithCoordinates(985, 1189, 202, 1176, 200, "right", driver);
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

	public void clickOnViewButtonAppearancecard() {
		try {
			waitForVisibilityFluentWait(myUnitedPageLocators.viewSeasonFour, 60);
			myUnitedPageLocators.viewSeasonFour.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicked on view button in appearance card");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnViewButtonAppearancecard()<br />" + e);
			throw e;
		}
	}

	public String getAppearanceInsideTitleAppearancecard() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearancesInsideTitleFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance in title appearance card");
				return myUnitedPageLocators.appearancesInsideTitleFour.getText();
			} else {
				waitForVisibilityFluentWait(myUnitedPageLocators.appearancesInsideTitleFour, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returned appearance in title appearance card ");
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
				actualDailyStreaks = myUnitedPageLocators.appearanceTitleFour.getText();
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
		for (int i = 0; i < 20; i++) {
			if (myUnitedPageLocators.pickYourfavoritePlayerMyUnitedScreen.size() <= 0) {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			} else {
				break;
			}
		}
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
				String name=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen1.getText().toUpperCase();
				myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicked on favourite player in players screen");
				return name;
			}else {
				waitForVisibilityFluentWait(myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen, 60);
				String name=myUnitedPageLocators.selectPlayerNameFavoritePlayerScreen1.getDomAttribute("label").replaceAll("[^A-Za-z]","").toUpperCase();
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
					"Exception occurred in function-clickOnRateAppInTheGeneralScreen()<br />" + e);
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
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
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
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
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
				myUnitedPageLocators.closeIconMutvINAppPopUp.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on close icon in mutv in app popup");
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
			} else if (!myUnitedPageLocators.brazeINAppPopUp.isEmpty()) {
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
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(myUnitedPageLocators.myTicketsComponentMyUnited, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns My tickets text from My United Page ");
			return myUnitedPageLocators.myTicketsComponentMyUnited.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userValidatesMyTicketsComponentInMyUnitedScreen()<br />" + e);
			throw e;
		}
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
			waitForVisibilityFluentWait(myUnitedPageLocators.stadiumComponentMyUnited, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns My tickets text from My United Page ");
			return myUnitedPageLocators.stadiumComponentMyUnited.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userValidatesStadiumComponentInMyUnitedScreen()<br />" + e);
			throw e;
		}
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

	}
	
		
	


