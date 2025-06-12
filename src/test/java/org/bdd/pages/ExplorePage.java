package org.bdd.pages;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.ExplorePageLocators;
import org.bdd.utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExplorePage extends Common {

	private static final Logger log = LogManager.getLogger(ExplorePage.class);
	ExplorePageLocators explorePageLocators;

	public ExplorePage() {
		this.explorePageLocators = new ExplorePageLocators();
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), explorePageLocators);
	}

	public void closePopScreen() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.popScreen, 60);
			explorePageLocators.popScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on close pop up screen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-closePopScreen<br />" + e);
			throw e;
		}
	}

	public String getWhatsNewOrLiveBlog() {
		String device = GlobalParams.getPlatformName();
		;
		try {
			if (device.equalsIgnoreCase("android")) {
				if (explorePageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
//                    if (!(explorePageLocators.makeYourPredictionsUnitedNowScreen.get(0).getText().equalsIgnoreCase("LIVE MATCH CENTRE")))
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				}
				List<WebElement> e = driver.findElements(AppiumBy.accessibilityId("Dismiss Live Stream"));
				if (e.size() > 0)
					e.get(0).click();
				if (explorePageLocators.whatsNew1.size() > 0) {
					ExtentsReportManager.extentReportLogging("pass", "Returning whats New/live match blog text ");
					return explorePageLocators.whatsNew.getText();
				} else {
					AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "WHAT'S NEW");
//				waitForVisibilityFluentWait(explorePageLocators.whatsNew);
					ExtentsReportManager.extentReportLogging("pass", "Returning whats New/live match blog Text ");
					return explorePageLocators.whatsNew.getText();
				}
			} else {
				if (explorePageLocators.makeYourPredictionsUnitedNowScreen.size() > 0) {
					// if (explorePageLocators.liveMatchCenterUnitedNowScreen.isEmpty())
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				}
			}
			List<WebElement> e = driver.findElements(AppiumBy.xpath(
					"//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
			if (e.size() > 0)
				e.get(0).click();
			if (explorePageLocators.liveBlogUniteNowPage1.size() > 0) {
				ExtentsReportManager.extentReportLogging("pass", "Returning liveMatchCenter Text ");
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				return explorePageLocators.liveBlogUniteNowPage1.get(0).getDomAttribute("label");
			} else {
				if(explorePageLocators.whatsNew1.size()>0) {
//                   IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				waitForVisibilityFluentWait(explorePageLocators.whatsNew, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returning whatsNew Text ");
				return explorePageLocators.whatsNew.getDomAttribute("label");
			}else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
				waitForVisibilityFluentWait(explorePageLocators.whatsNew, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returning whatsNew Text ");
				return explorePageLocators.whatsNew.getDomAttribute("label");
			}
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getWhatsNewOrLiveBlog()<br />" + e);
			throw e;
		}
	}

	public void clickMyUnitedTab() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.myUnitedButton, 60);
			explorePageLocators.myUnitedButton.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on My United Tab ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickMyUnitedTab()<br />" + e);
			throw e;
		}
	}

	public void clickSettingIcon() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.settingIcon, 60);
			explorePageLocators.settingIcon.click();
			
			if (explorePageLocators.closeIconInAppMsgIosBrazeTest.isDisplayed()) {
				waitForVisibilityFluentWait(explorePageLocators.closeIconInAppMsgIosBrazeTest, 60);
				explorePageLocators.closeIconInAppMsgIosBrazeTest.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on ok button in Not Now In UnitedNow PopUp");
		}
		} catch (NoSuchElementException ns) {
		System.out.println("element is not displayed hence skipped");
			ExtentsReportManager.extentReportLogging("pass", "Clicks on settingIcon ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickSettingIcon()<br />" + e);
			throw e;
		}
	}

	public void clickOnGeneral() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.general, 60);
			explorePageLocators.general.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on general ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnGeneral()<br />" + e);
			throw e;
		}
	}

	public void clickOnHelp() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.help, 60);
			explorePageLocators.help.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on help ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clickOnHelp()<br />" + e);
			throw e;
		}
	}

	public void clickOnContactUs() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.contactUs, 60);
			explorePageLocators.contactUs.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on contactUs ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnContactUs()<br />" + e);
			throw e;
		}
	}

	public String getContactUs() throws Exception {
		String device = GlobalParams.getPlatformName();
		;
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.contactUsScreenText, 60);
				Thread.sleep(5000);
				ExtentsReportManager.extentReportLogging("pass", "Returns contactUs Screen Text ");
				return explorePageLocators.contactUsScreenText.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.contactUsScreenText, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns contactUs Screen Text ");
				return explorePageLocators.contactUsScreenText.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getContactUs()<br />" + e);
			throw e;
		}
	}

	// faqs

	public void clickOnFaqs() {
		try {
//            waitForVisibilityFluentWait(explorePageLocators.faqSHelp,60);
			waitForVisibilityFluentWait(explorePageLocators.faqSHelp, 60);
			explorePageLocators.faqSHelp.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicked on faqSHelp");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clickOnFaqs()<br />" + e);
			throw e;
		}
	}

	public String getFaqsText() throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.faqsFaqsPage, 60);
				Thread.sleep(5000);
				ExtentsReportManager.extentReportLogging("pass", "Returns FaqsPage  Text ");
				return explorePageLocators.faqsFaqsPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.faqsFaqsPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns FaqsPage  Text ");
				return explorePageLocators.faqsFaqsPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getFaqsText()<br />" + e);
			throw e;
		}
	}

	// accessability

	public void clickOnAccessability() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.accessibilityHelp, 60);
			explorePageLocators.accessibilityHelp.click();
			ExtentsReportManager.extentReportLogging("pass", "Returns accessibilityHelp  Text ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnAccessability()<br />" + e);
			throw e;
		}
	}

	public String getAccessabilityText() throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.accessibilityAccessibilityPage, 60);
				Thread.sleep(5000);
				ExtentsReportManager.extentReportLogging("pass", "Returns accessibility Text ");
				return explorePageLocators.accessibilityAccessibilityPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.accessibilityAccessibilityPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns accessibility Text ");
				return explorePageLocators.accessibilityAccessibilityPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getAccessabilityText()<br />" + e);
			throw e;
		}
	}

	// terms of use

	public void clickOnTermsOfUse() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.termsOfUseHelp, 60);
			explorePageLocators.termsOfUseHelp.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on termsOfUseHelp ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnTermsOfUse()<br />" + e);
			throw e;
		}
	}

	public String getTermsOfUseText() throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.termsOfUseTermsOfUsePage, 60);
				Thread.sleep(5000);
				ExtentsReportManager.extentReportLogging("pass", "Returns termsOfUseTermsOfUsePage Text");
				return explorePageLocators.termsOfUseTermsOfUsePage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.termsOfUseTermsOfUsePage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns termsOfUseTermsOfUsePage Text");
				return explorePageLocators.termsOfUseTermsOfUsePage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getTermsOfUseText()<br />" + e);
			throw e;
		}

	}

	// privacy policy

	public void clickOnPrivacyPolicy() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.privacyPolicyHelp, 60);
			explorePageLocators.privacyPolicyHelp.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on privacyPolicyHelp ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnPrivacyPolicy()<br />" + e);
			throw e;
		}
	}

	public String getPrivacyPolicyText() throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.privacyPolicyPrivacyPolicyPage, 60);
				Thread.sleep(5000);
				ExtentsReportManager.extentReportLogging("pass", "Clicks on privacyPolicyHelp ");
				return explorePageLocators.privacyPolicyPrivacyPolicyPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.privacyPolicyPrivacyPolicyPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Clicks on privacyPolicyHelp ");
				return explorePageLocators.privacyPolicyPrivacyPolicyPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getPrivacyPolicyText()<br />" + e);
			throw e;
		}

	}

//send feedback

	public void clickOnSendFeedback() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.sendAppFeedbackHelp, 60);
			explorePageLocators.sendAppFeedbackHelp.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on sendAppFeedbackHelp ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnSendFeedback()<br />" + e);
			throw e;
		}
	}

	public String getFeedBackTitleText() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.feedBackPageTitle, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns feedBackPageTitle ");
				return explorePageLocators.feedBackPageTitle.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.feedBackPageTitle, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns feedBackPageTitle ");
				return explorePageLocators.feedBackPageTitle.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getFeedBackTitleText()<br />" + e);
			throw e;
		}
	}

	public void setFeedbackForm(String emailAddress, String subject, String feedback) {

		try {
			waitForVisibilityFluentWait(explorePageLocators.emailAddressTextBoxFeedBackPage, 60);
			explorePageLocators.emailAddressTextBoxFeedBackPage.sendKeys(emailAddress);
			explorePageLocators.subjectTextBoxFeedBackPage.sendKeys(subject);
			explorePageLocators.feedbackCommentTextBoxFeedBackPage.sendKeys(feedback);
			explorePageLocators.submitButtonFeedBackPage.click();
			ExtentsReportManager.extentReportLogging("pass",
					"Enters emailAddress,subject and Clicks on submitButtonFeedBackPage ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-setFeedbackForm()<br />" + e);
			throw e;

		}
	}

	public String getSuccessMessageAfterFeedbackSubmission() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.successMessageFeedBackPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns successMessage in FeedBackPage");
				return explorePageLocators.successMessageFeedBackPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.successMessageFeedBackPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns successMessage in FeedBackPage");
				return explorePageLocators.successMessageFeedBackPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getSuccessMessageAfterFeedbackSubmission()<br />" + e);
			throw e;
		}
	}

	public void clicksSearchInUnitedScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.searchButtonUnitedPage, 60);
			explorePageLocators.searchButtonUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage");
		} catch (WebDriverException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", explorePageLocators.searchButtonUnitedPage);
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksSearchInUnitedScreen()<br />" + e);
			throw e;
		}

	}
	public void clicksSearchInUnitedScreenAnd() {
		try {
			//WebElement button = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Search']")); 
	        // Get coordinates
//	        Point point = button.getLocation();
//	        Dimension size = button.getSize();
//	        int centerX = point.getX() + (size.getWidth() / 2);
//	        int centerY = point.getY() + (size.getHeight() / 2);
//	        System.out.println("X " +centerX + "Y "+centerY);
//			AndroidGenericLibrary.clickAtCoordinates(driver,870,205);//non match day
			//AndroidGenericLibrary.clickAtCoordinates(driver,904,205);//match day
			elementToBeClickableFluentWait(explorePageLocators.searchButtonUnitedPage, 60);
			explorePageLocators.searchButtonUnitedPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage");
		} catch (WebDriverException e) {
			try {				
//				AndroidGenericLibrary.clickAtCoordinates(driver,870,205);//non match day
				AndroidGenericLibrary.clickAtCoordinates(driver,904,205);//match day
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage with co-ordinates");
		} catch (WebDriverException e1) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", explorePageLocators.searchButtonUnitedPage);
			ExtentsReportManager.extentReportLogging("pass", "Clicks on searchButton UnitedPage with js");
		
		 // Retry locating element
//        WebElement button = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Search']")); 
//        // Get coordinates
//        Point point = button.getLocation();
//        Dimension size = button.getSize();
//        int centerX = point.getX() + (size.getWidth() / 2);
//        int centerY = point.getY() + (size.getHeight() / 2);
//        System.out.println("X " +centerX + "Y "+centerY);
//        // Create W3C touch tap action
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1)
//                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY))
//                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
//                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//        driver.perform(Arrays.asList(tap));
		

	}
		catch (Exception e2) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksSearchInUnitedScreen()<br />" + e);
			throw e;
		}
		}

	}

	public void clicksSearchInUnitedScreen1() throws Exception {
		String device = GlobalParams.getPlatformName();
		By searchButtonLocator;
		if (device.equalsIgnoreCase("android")) {
			 searchButtonLocator = AppiumBy.xpath("//android.widget.ImageView[@content-desc='Search']"); 
//			 if (!explorePageLocators.notificationUnitedNowBottomScreen.isEmpty()) {
//				 explorePageLocators.notificationUnitedNowBottomScreen.get(0).click();
//	                ExtentsReportManager.extentReportLogging("pass", "Clicks on notificationUnitedNowBottomScreen ");
//	            }
		}
		else
		{
			 searchButtonLocator = AppiumBy.accessibilityId("Explore"); 
		}  

	    int maxRetries = 5;
	    int attempts = 0;

	    while (attempts < maxRetries) {
	        try {
	             driver.getPageSource();
	             WebElement searchButton = driver.findElement(searchButtonLocator);
          	    elementToBeClickableFluentWait(searchButton, 10);
	            //WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(searchButtonLocator));

	            // Click it
	            searchButton.click();

	            ExtentsReportManager.extentReportLogging("pass", "Clicked on Search button in United screen");
	            return;

	        } catch ( WebDriverException e) {
	            System.out.println("Attempt " + (attempts + 1) + ": Element issue (stale/not interactable). Retrying Clicking on search button...");
	            attempts++;
	            Thread.sleep(1000);
	        }
	    }

	    ExtentsReportManager.extentReportLogging("fail",
	            "Failed to click Search button in United screen after " + maxRetries + " retries");
	    throw new Exception("Element not clickable after retries.");
	}

	// Search screen
	public void clicksHelpCouroselInSearchPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(explorePageLocators.helpCouroselSearchPage, 60);
			explorePageLocators.helpCouroselSearchPage.click();
			if (explorePageLocators.closeIconInAppMsgIosBrazeTest.isDisplayed()) {
				waitForVisibilityFluentWait(explorePageLocators.closeIconInAppMsgIosBrazeTest, 60);
				explorePageLocators.closeIconInAppMsgIosBrazeTest.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on close button in Popup ");
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on helpCourosel SearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksHelpCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clicksHistoryCouroselInSearchPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(explorePageLocators.historyCouroselSearchPage, 60);
			explorePageLocators.historyCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on historyCourosel SearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksHistoryCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public String getStoryInHistoryScreen() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.storyInHistorySearchPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Clicks on storyInHistory SearchPage");
				return explorePageLocators.storyInHistorySearchPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.storyInHistorySearchPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Clicks on storyInHistory SearchPage");
				return explorePageLocators.storyInHistorySearchPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getStoryInHistoryScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksMutvCouroselInSearchPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
			waitForVisibilityFluentWait(explorePageLocators.mutvCouroselSearchPage, 60);
			explorePageLocators.mutvCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on MutvCourosel SearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksMutvCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public String getMutvWelcomeTextMutvPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.mutvWelcomeTextMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns mutvWelcomeText MutvPage ");
			return explorePageLocators.mutvWelcomeTextMutvPage.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMutvWelcomeTextMutvPage()<br />" + e);
			throw e;
		}
	}

	public String getMutvDescriptionMutvPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.mutvDescriptionMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns mutvDescription MutvPage ");
			return explorePageLocators.mutvDescriptionMutvPage.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMutvDescriptionMutvPage()<br />" + e);
			throw e;
		}
	}

	public String getMutvExploreButtonMutvPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.mutvExploreButtonMutvPage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns mutvExploreButtonMutvPage");
			return explorePageLocators.mutvExploreButtonMutvPage.getText();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMutvExploreButtonMutvPage()<br />" + e);
			throw e;
		}
	}

	public void clickShopCouroselInSearchPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.shopCouroselSearchPage, 60);
			explorePageLocators.shopCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on shopCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickShopCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public String getShopTitleShopPage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.shopTitleShopPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ShopCouroselSearchPage Text");
				return explorePageLocators.shopTitleShopPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.shopTitleShopPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ShopCouroselSearchPage Text");
				return explorePageLocators.shopTitleShopPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getShopTitleShopPage()<br />" + e);
			throw e;
		}

	}

	public void clickFixtureAndTableCouroselInSearchPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.fixturesAndTableCouroselSearchPage, 60);
			explorePageLocators.fixturesAndTableCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fixturesAndTableCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickFixtureAndTableCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clickMyTicketsCouroselInSearchPage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (!device.equalsIgnoreCase("android")) {
				
			}
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//            waitForVisibilityFluentWait(explorePageLocators.myTicketsCouroselSearchPage,60);
			waitForVisibilityFluentWait(explorePageLocators.myTicketsCouroselSearchPage, 60);
			explorePageLocators.myTicketsCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on myTicketsCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickMyTicketsCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clickBuyTicketsCouroselInSearchPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.buyTicketsCouroselSearchPage, 60);
			explorePageLocators.buyTicketsCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on buyTicketsCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickBuyTicketsCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clickMembershipCouroselInSearchPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
			waitForVisibilityFluentWait(explorePageLocators.membershipCouroselSearchPage, 60);
			explorePageLocators.membershipCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on membershipCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickMembershipCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public String getOfficialMembership() {
		String device = GlobalParams.getPlatformName();
		String headerText = null;
		try {
			   if (device.equalsIgnoreCase("android")) {
			            waitForVisibilityFluentWait(explorePageLocators.unitedMembershipMembership, 60);
			            if (explorePageLocators.unitedMembershipMembership.isDisplayed()) {
			                ExtentsReportManager.extentReportLogging("pass", "Returns unitedMembershipMembership Text");
			                return explorePageLocators.unitedMembershipMembership.getText();
			            } else {
			                ExtentsReportManager.extentReportLogging("pass", "Returns officialMembership Text");
			                return explorePageLocators.officialMembership.getText();
			            }
			        } else if (device.equalsIgnoreCase("ios")) {
			           // waitForVisibilityFluentWait(explorePageLocators.unitedMembershipMembership, 60)
			        	for (WebElement element : explorePageLocators.unitedMembershipOptions) {
			        	    if (element.isDisplayed()) {
			        	    	headerText = element.getDomAttribute("label"); 
			        	        break;
			        	    }
			        	}

			            ExtentsReportManager.extentReportLogging("pass", "Returns ShopCarouselSearchPage Text for iOS");
			            return headerText;
			        } else {
			            waitForVisibilityFluentWait(explorePageLocators.officialMembership, 120);
			            ExtentsReportManager.extentReportLogging("pass", "Returns officialMembership Text for Web");
			            return explorePageLocators.officialMembership.getDomAttribute("label");
			        }
			
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getOfficialMembership()<br />" + e);
			throw e;
		}
	}

	public String getOfficialMembershipDesc() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				 waitForVisibilityFluentWait(explorePageLocators.officialMembershipDesc, 60);
		            if (explorePageLocators.unitedMembershipDesc.isDisplayed()) {
		                ExtentsReportManager.extentReportLogging("pass", "Returns unitedMembershipMembership Text");
		                return explorePageLocators.unitedMembershipDesc.getText();
		            } else {
		                ExtentsReportManager.extentReportLogging("pass", "Returns officialMembership Text");
		                return explorePageLocators.officialMembershipDesc.getText();
		            }
		        } else if (device.equalsIgnoreCase("ios")) {
		            waitForVisibilityFluentWait(explorePageLocators.unitedMembershipDesc, 60);
		            ExtentsReportManager.extentReportLogging("pass", "Returns ShopCarouselSearchPage Text for iOS");
		            return explorePageLocators.unitedMembershipDesc.getDomAttribute("label");
		        } else {
		            waitForVisibilityFluentWait(explorePageLocators.officialMembershipDesc, 120);
		            ExtentsReportManager.extentReportLogging("pass", "Returns officialMembership Text for Web");
		            return explorePageLocators.officialMembershipDesc.getDomAttribute("label");
		        }
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getOfficialMembershipDesc()<br />" + e);
			throw e;
		}
	}

	public void clickFansCouroselInSearchPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.fansCouroselSearchPage, 60);
			explorePageLocators.fansCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fansCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickFansCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clickMyUnitedCouroselInSearchPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
			waitForVisibilityFluentWait(explorePageLocators.myUnitedCouroselSearchPage, 60);
			explorePageLocators.myUnitedCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on myUnitedCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickMyUnitedCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public String getMyUnitedTitle() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.myUnitedTitle, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns myUnitedTitle");
				return explorePageLocators.myUnitedTitle.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.myUnitedTitle, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns myUnitedTitle");
				return explorePageLocators.myUnitedTitle.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMyUnitedTitle()<br />" + e);
			throw e;
		}
	}

	public void clickPredictionCouroselInSearchPage() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.predictionsCouroselSearchPage, 60);
			explorePageLocators.predictionsCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on predictionsCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickPredictionCouroselInSearchPage()<br />" + e);
			throw e;
		}
	}

	public void clicksPlayersCouroselInSearchScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			waitForVisibilityFluentWait(explorePageLocators.playersCouroselSearchPage, 60);
			explorePageLocators.playersCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on playersCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksPlayersCouroselInSearchScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksFixturesAndTableCouroselInSearchScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
			waitForVisibilityFluentWait(explorePageLocators.fixturesAndTableCouroselSearchPage, 60);
			explorePageLocators.fixturesAndTableCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fixturesAndTableCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksFixturesAndTableCouroselInSearchScreen()<br />" + e);
			throw e;
		}
	}

	public boolean clicksBuyTicketsCouroselInSearchScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
			waitForVisibilityFluentWait(explorePageLocators.buyTicketsCouroselSearchPage, 60);
			
			if (explorePageLocators.buyTicketsCouroselSearchPage.isDisplayed()) {
	            explorePageLocators.buyTicketsCouroselSearchPage.click();
	            ExtentsReportManager.extentReportLogging("pass", "Clicked on buyTicketsCarouselSearchPage");
	            return true;
	        } else {
	            ExtentsReportManager.extentReportLogging("info", "buyTicketsCarouselSearchPage not displayed.");
	            return false;
	        }
			
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksBuyTicketsCouroselInSearchScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksFansCouroselInSearchScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
			waitForVisibilityFluentWait(explorePageLocators.fansCouroselSearchPage, 60);
			explorePageLocators.fansCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on fansCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksFansCouroselInSearchScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksPredictionsCouroselInSearchScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
			waitForVisibilityFluentWait(explorePageLocators.predictionsCouroselSearchPage, 60);
			explorePageLocators.predictionsCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on predictionsCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksPredictionsCouroselInSearchScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksLatestCouroselInSearchScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
			waitForVisibilityFluentWait(explorePageLocators.latestCouroselSearchPage, 60);
			explorePageLocators.latestCouroselSearchPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on latestCouroselSearchPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksLatestCouroselInSearchScreen()<br />" + e);
			throw e;
		}
	}

	public String getTicketTitle() {
		String device = GlobalParams.getPlatformName();
		String ticketPage = null;
		try {
			if (device.equalsIgnoreCase("android")) {
				switchToWebView();
//				if (!explorePageLocators.acceptAllInBuyTickets.isEmpty()) {
//              elementToBeClickableFluentWait(mutvPageLocators.notNowButtonMatchAppearanceAlert);
//					explorePageLocators.acceptAllInBuyTickets.get(0).click();
//	              ExtentsReportManager.extentReportLogging("pass", "Clicks on Accept all cookies popup ");
//	          }
				if (!explorePageLocators.acceptAllInBuyTickets.isEmpty()) {
				for (WebElement element : explorePageLocators.acceptAllInBuyTickets) {
	        	    if (element.isDisplayed()) {
	        	    	 element.click();
	        	        break;
	        	    }
	        	}
				}
				waitForVisibilityFluentWait(explorePageLocators.ticketTitleTicketPage, 60);
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", explorePageLocators.ticketTitleTicketPage);
//				for (WebElement element : explorePageLocators.ticketTitleTicketPage) {
//	        	    if (element.isDisplayed()) {
//	        	    	ticketPage = element.getText();
//	        	        break;
//	        	    }
//	        	}
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				//return explorePageLocators.ticketTitleTicketPage.getText();
				return explorePageLocators.ticketTitleTicketPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.ticketTitleTicketPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				return explorePageLocators.ticketTitleTicketPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getTicketTitle()<br />" + e);
			throw e;
		}
	}

	public String getFansPageContent() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.fansPageContent, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns fansPageContent Text");
				return explorePageLocators.fansPageContent.getText().replace("\"", "").trim();
			} else {
				elementToBeClickableFluentWait(explorePageLocators.fansPageContent, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns fansPageContent Text");
				return explorePageLocators.fansPageContent.getDomAttribute("label").replace("\"", "").trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getFansPageContent()<br />" + e);
			throw e;
		}
	}

	public void clicksOnNotificationIconInSettingsScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.notificationButtonSettingsPage, 60);
			explorePageLocators.notificationButtonSettingsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on notificationButtonSettingsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnNotificationIconInSettingsScreen()<br />" + e);
			throw e;
		}
	}

	public String getUntiedNowAlertsTextNotificationPage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.unitedNowAlertsNotificationsPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns unitedNowAlertsNotificationsPage Text");
				return explorePageLocators.unitedNowAlertsNotificationsPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.unitedNowAlertsNotificationsPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns unitedNowAlertsNotificationsPage Text");
				return explorePageLocators.unitedNowAlertsNotificationsPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getUntiedNowAlertsTextNotificationPage()<br />" + e);
			throw e;
		}
	}

	public String getMatchAlertsTextNotificationPage() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.matchAlertsNotificationsPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchAlertsNotificationsPage Text");
				return explorePageLocators.matchAlertsNotificationsPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.matchAlertsNotificationsPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchAlertsNotificationsPage Text");
				return explorePageLocators.matchAlertsNotificationsPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMatchAlertsTextNotificationPage()<br />" + e);
			throw e;
		}
	}

	public void clicksOnUnitedNowAlertInNotificationScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.unitedNowAlertsNotificationsPage, 60);
			explorePageLocators.unitedNowAlertsNotificationsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on unitedNowAlertsNotificationsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnUnitedNowAlertInNotificationScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnMatchAlertInNotificationScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.matchAlertsNotificationsPage, 60);
			explorePageLocators.matchAlertsNotificationsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchAlertsNotificationsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnMatchAlertInNotificationScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnLatestAlertSwitchInUnitedNowAlertsScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.latestSwitchIconUnitedNowAlertsPage, 60);
			explorePageLocators.latestSwitchIconUnitedNowAlertsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on latestSwitchIconUnitedNowAlertsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnLatestAlertSwitchInUnitedNowAlertsScreen()<br />" + e);
			throw e;
		}
	}

	public void selectsGoToSettingsFromEnableAlertsDialogBox() {
		try {
			if (explorePageLocators.goToSettingsButtonEnableAlerts.isDisplayed()) {
				elementToBeClickableFluentWait(explorePageLocators.goToSettingsButtonEnableAlerts, 60);
				explorePageLocators.goToSettingsButtonEnableAlerts.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on goToSettingsButtonEnableAlerts");
			}
		} catch (NoSuchElementException ns) {
			ExtentsReportManager.extentReportLogging("info", "element is not displayed hence skipped");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-selectsGoToSettingsFromEnableAlertsDialogBox()<br />" + e);
			throw e;
		}
	}

	public void clicksOnNotificationsSwitchInSettings() {
		try {
			if (explorePageLocators.notificationSwitch.isDisplayed()) {
				elementToBeClickableFluentWait(explorePageLocators.notificationSwitch, 60);
				explorePageLocators.notificationSwitch.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on notificationSwitch");
			}
		} catch (NoSuchElementException ns) {
			ExtentsReportManager.extentReportLogging("info", "element is not displayed hence skipped");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnNotificationsSwitchInSettings()<br />" + e);
			throw e;
		}
	}

	public void clicksBackIconInTheSettings() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.backButtonSettings, 60);
			explorePageLocators.backButtonSettings.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on backButtonSettings");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksBackIconInTheSettings()<br />" + e);
			throw e;
		}
	}

	public void clicksOnBackButtonInUnitedNowAlertsScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.backButtonUnitedNowAlertsPage, 60);
			explorePageLocators.backButtonUnitedNowAlertsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on backButtonUnitedNowAlertsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnBackButtonInUnitedNowAlertsScreen()<br />" + e);
			throw e;
		}
	}

	public void validatesTheGeneralAlerts() {
		try {
			for (WebElement unitedNowAlertText : explorePageLocators.unitedNowAlertTexts) {
				unitedNowAlertText.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on each of united Now Alert Text");

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheGeneralAlerts()<br />" + e);
			throw e;
		}
	}

	public void validatesTheMatchAlertsInMatchAlertsScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.matchAlertTexts.get(0), 60);
			for (WebElement matchAlertText : explorePageLocators.matchAlertTexts) {
				matchAlertText.click();
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on each of match Alert Texts");

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheMatchAlertsInMatchAlertsScreen()<br />" + e);
			throw e;
		}

	}

	public void clicksOnOkButtonInCookiesScreenIos() {
		try {
			if (!explorePageLocators.okButtonCookiesScreen1.isEmpty()) {
				explorePageLocators.okButtonCookiesScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on okButtonCookiesScreen");
			} else if (!explorePageLocators.rejectBtnQA.isEmpty()) {
				explorePageLocators.rejectBtnQA1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on rejectBtnQA1");
			}
//            elementToBeClickableFluentWait(explorePageLocators.okButtonCookiesScreen);
//            okButtonCookiesScreen.click();

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnOkButtonInCookiesScreenIos()<br />" + e);
			throw e;
		}
	}

	public void clicksOnOkButtonInCookiesScreen() throws Exception {
		try {
			clickOnNotNowButtonInMatchAppearanceAlertScreen();
//            waitForVisibilityFluentWait(explorePageLocators.weUseCookiesTexts);
			if (explorePageLocators.weUseCookiesTexts.isDisplayed()) {
//                waitForVisibilityFluentWait(explorePageLocators.okButtonCookiesScreen);
				explorePageLocators.okButtonCookiesScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on okButtonCookiesScreen");
			}
			Thread.sleep(1000);
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnOkButtonInCookiesScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnNotNowButtonInMatchAppearanceAlertScreen() {
		try {
			if (!explorePageLocators.notNowButtonMatchAppearanceAlert1.isEmpty()) {
//                elementToBeClickableFluentWait(explorePageLocators.notNowButtonMatchAppearanceAlert);
				explorePageLocators.notNowButtonMatchAppearanceAlert.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on notNowButtonMatchAppearanceAlert");
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

	public boolean validatesHeroCardInLatestScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns latestCardInLatestScreen Text ");
			return explorePageLocators.latestCardInLatestScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesHeroCardInLatestScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnTheAnyOneOfTheCardInLatestScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.latestCardInLatestScreen, 60);
			explorePageLocators.latestCardInLatestScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on latestCardInLatestScreen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnTheAnyOneOfTheCardInLatestScreen()<br />" + e);
			throw e;
		}

	}

	public void clicksOnPageFiltersInLatestScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.latestTabInLatestScreen, 60);
			explorePageLocators.latestTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.menTabInLatestScreen, 60);
			explorePageLocators.menTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.womenTabInLatestScreen, 60);
			explorePageLocators.womenTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.under21sTabInLatestScreen, 60);
			explorePageLocators.under21sTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.under18sTabInLatestScreen, 60);
			explorePageLocators.under18sTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.clubTabInLatestScreen, 60);
			explorePageLocators.clubTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.menTabInLatestScreen, 60);
			explorePageLocators.menTabInLatestScreen.click();
			elementToBeClickableFluentWait(explorePageLocators.latestTabInLatestScreen, 60);
			explorePageLocators.latestTabInLatestScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on PageFiltersInLatestScreen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPageFiltersInLatestScreen()<br />" + e);
			throw e;
		}
	}

	public void clicksOnShareIconInAnyOfTheLatestCards() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.shareIconLatestScreen, 60);
			explorePageLocators.shareIconLatestScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on shareIconLatestScreen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnShareIconInAnyOfTheLatestCards()<br />" + e);
			throw e;
		}

	}

	public void clicksOnMessageIconInShareScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.messageIconShareScreen, 60);
			explorePageLocators.messageIconShareScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on messageIconShareScreen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnMessageIconInShareScreen()<br />" + e);
			throw e;
		}

	}

	public void clicksOnCrossIconInLatestCard() {
		try {
			if (!explorePageLocators.crossIconInDestinationScreen.isEmpty()) {
				explorePageLocators.crossIconInDestinationScreen1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on crossIconInDestinationScreen1");
			} else if (!explorePageLocators.backIconInDestinationScreen.isEmpty()) {
				explorePageLocators.backIconInDestinationScreen1.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on backIconInDestinationScreen");
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnCrossIconInLatestCard()<br />" + e);
			throw e;
		}
	}

	public void clicksOnUnitedNowInBottomTabInIos() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.unitedNowTabInBottomScreen, 60);
			explorePageLocators.unitedNowTabInBottomScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on unitedNowTabInBottomScreen");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnUnitedNowInBottomTabInIos()<br />" + e);
			throw e;
		}

	}

	public void searchPlayersOrUpdates(String ExploreSearchText) {
		try {
			waitForVisibilityFluentWait(explorePageLocators.selectingSuggestionsExploreScreen, 60);
			explorePageLocators.selectingSuggestionsExploreScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on selectingSuggestionsExploreScreen");
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(ExploreSearchText);
			ExtentsReportManager.extentReportLogging("pass", "Enters searchInputTextInExplorePage Text");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-searchPlayersOrUpdates()<br />" + e);
			throw e;

		}

	}

	public void searchPlayersOrUpdatesInIos(String ExploreSearchText) {
		try {
			waitForVisibilityFluentWait(explorePageLocators.selectingSuggestionsExploreScreen, 60);
			explorePageLocators.selectingSuggestionsExploreScreen.click();
			explorePageLocators.clearIconInExploreScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on clearIconInExploreScreen");
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(ExploreSearchText);
			ExtentsReportManager.extentReportLogging("pass", "Enters searchInputTextInExplorePage Text");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-searchPlayersOrUpdatesInIos()<br />" + e);
			throw e;

		}

	}

	public boolean validatesSearchAutoSuggestionsIsDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns autoSuggestionWithDataExploreScreen Text");
			return explorePageLocators.autoSuggestionWithDataExploreScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSearchAutoSuggestionsIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean validatesWithoutDataInSearchScreenIsDisplayed() {
		try {

			if (explorePageLocators.autoSuggestionExploreScreen.size() > 0) {
				ExtentsReportManager.extentReportLogging("pass", "Found auto Suggestion in Explore Screen Text");
				return true;
			} else {
				ExtentsReportManager.extentReportLogging("fail", " NOt Found auto Suggestion in Explore Screen Text");
				return false;
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesWithoutDataInSearchScreenIsDisplayed()<br />" + e);
			throw e;
		}

	}

	public void clicksOnPlayersInSearchSuggestions() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.selectPlayerInSuggestions, 60);
			explorePageLocators.selectPlayerInSuggestions.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on selectPlayerInSuggestions");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPlayersInSearchSuggestions()<br />" + e);
			throw e;
		}

	}

	public void enterImageInSearchForImageContentInPageFilter(String imageContent) {
		try {
			explorePageLocators.clearIconInExploreScreen.click();
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(imageContent);
			explorePageLocators.selectPlayerInSuggestions.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on selectPlayerInSuggestions");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterImageInSearchForImageContentInPageFilter()<br />" + e);
			throw e;

		}
	}

	public boolean validatesSearchResultForImage() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns searchResultForImage Text");
			return explorePageLocators.searchResultForImage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSearchResultForImage()<br />" + e);
			throw e;
		}

	}

	public void enterImageInSearchForVideosContentInPageFilter(String videoContent) {
		try {
			explorePageLocators.clearIconInExploreScreen.click();
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(videoContent);
			explorePageLocators.selectPlayerInSuggestions.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on selectPlayerInSuggestions");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterImageInSearchForVideosContentInPageFilter()<br />" + e);
			throw e;

		}
	}

	public boolean validatesSearchResultForVideos() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns searchResultForImage Text");
			return explorePageLocators.searchResultForVideos.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSearchResultForVideos()<br />" + e);
			throw e;
		}
	}

	public boolean validatesSearchResultForNews() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns searchResultForNews Text");
			return explorePageLocators.searchResultForNews.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSearchResultForNews()<br />" + e);
			throw e;
		}
	}

	public void enterImageInSearchForNewsContentInPageFilter(String newsContent) {
		try {
			explorePageLocators.clearIconInExploreScreen.click();
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(newsContent);
			explorePageLocators.selectPlayerInSuggestions.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on selectPlayerInSuggestions");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterImageInSearchForNewsContentInPageFilter()<br />" + e);
			throw e;

		}

	}

	public void enterImageInSearchForAllContentInPageFilter(String allContent) {
		try {
			explorePageLocators.clearIconInExploreScreen.click();
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(allContent);
			explorePageLocators.selectPlayerInSuggestions.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on selectPlayerInSuggestions");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterImageInSearchForAllContentInPageFilter()<br />" + e);
			throw e;

		}

	}

	public boolean validatesSearchResultForAll() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns searchResultForAll Text");
			return explorePageLocators.searchResultForAll.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSearchResultForAll()<br />" + e);
			throw e;
		}
	}

	public void clicksOnContentRelatedToSearchResult() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.firstcontentInPageFilter, 60);
			explorePageLocators.firstcontentInPageFilter.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on firstcontentInPageFilter");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnContentRelatedToSearchResult()<br />" + e);
			throw e;

		}

	}

	public void searchPlayersOrUpdatesRelatedSearches(String ExploreSearchText) {
		try {
			explorePageLocators.clearIconInExploreScreen.click();
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(ExploreSearchText);
			ExtentsReportManager.extentReportLogging("pass", "Enters searchInputTextInExplorePage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-searchPlayersOrUpdatesRelatedSearches()<br />" + e);
			throw e;

		}

	}

	public boolean validatesSearchResultisDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns searchResultForSearchedContent Text");
			return explorePageLocators.searchResultForSearchedContent.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSearchResultisDisplayed()<br />" + e);
			throw e;
		}
	}

	public String getTitleTextSearchResultOfPlayers() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.ticketTitleTicketPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				return explorePageLocators.ticketTitleTicketPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.titleTextSearchResultPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns titleTextSearchResultPage Text");
				return explorePageLocators.titleTextSearchResultPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getTitleTextSearchResultOfPlayers()<br />" + e);
			throw e;
		}
	}

	public String validateUnitedTabFixtures() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.ticketTitleTicketPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				return explorePageLocators.ticketTitleTicketPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.unitedTabInFixturesAndTables, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				return explorePageLocators.unitedTabInFixturesAndTables.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateUnitedTabFixtures()<br />" + e);
			throw e;
		}
	}

	public String validateAllTeamsTabFixtures() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.ticketTitleTicketPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				return explorePageLocators.ticketTitleTicketPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.allTeamsTabInFixturesAndTables, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns allTeamsTabInFixturesAndTables Text");
				return explorePageLocators.allTeamsTabInFixturesAndTables.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateAllTeamsTabFixtures()<br />" + e);
			throw e;
		}
	}

	public String validateOldMatchResultsInFixtures() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.ticketTitleTicketPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns ticketTitleTicketPage Text");
				return explorePageLocators.ticketTitleTicketPage.getText();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.9);
				waitForVisibilityFluentWait(explorePageLocators.matchResultsInFixtures, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchResultsInFixtures Text");
				return explorePageLocators.matchResultsInFixtures.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateOldMatchResultsInFixtures()<br />" + e);
			throw e;
		}
	}

	public void clicksPlayersCatogaryFromTab(String Teams) {
		try {
//			elementToBeClickableFluentWait(explorePageLocators.menTabIntableFilter);
//			menTabIntableFilter.click();

			if (Teams.equalsIgnoreCase("men")) {
				elementToBeClickableFluentWait(explorePageLocators.menTabFixturesListingPage, 60);
				explorePageLocators.menTabFixturesListingPage.click();
			} else if (Teams.equalsIgnoreCase("women")) {
				elementToBeClickableFluentWait(explorePageLocators.womenTabFixturesListingPage, 60);
				explorePageLocators.womenTabFixturesListingPage.click();
			} else if (Teams.equalsIgnoreCase("under21s")) {
				elementToBeClickableFluentWait(explorePageLocators.under21STabFixturesListingPage, 60);
				explorePageLocators.under21STabFixturesListingPage.click();
			} else if (Teams.equalsIgnoreCase("under18s")) {
				elementToBeClickableFluentWait(explorePageLocators.under18STabFixturesListingPage, 60);
				explorePageLocators.under18STabFixturesListingPage.click();
			} else if (Teams.equalsIgnoreCase("girls")) {
				elementToBeClickableFluentWait(explorePageLocators.girlsTabFixturesListingPage, 60);
				explorePageLocators.girlsTabFixturesListingPage.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on PlayersCatogaryFromTab");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksPlayersCatogaryFromTab()<br />" + e);
			throw e;
		}

	}

	public boolean validateTheTablePageFilterAllTeams(String validation) {
		String[] splitFixtures = validation.split(",");
		try {
			if (explorePageLocators.allTableFiltersinFixturesPage.isDisplayed()) {
				ExtentsReportManager.extentReportLogging("pass", "Returns allTableFiltersinFixturesPage Text");
				return explorePageLocators.allTableFiltersinFixturesPage.getText().contains(splitFixtures[0])
						|| explorePageLocators.allTableFiltersinFixturesPage.getText().contains(splitFixtures[1])
						|| explorePageLocators.allTableFiltersinFixturesPage.getText().contains(splitFixtures[2]);
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateTheTablePageFilterAllTeams()<br />" + e);
			throw e;
		}

		return false;

	}

	public String validatesMatchLiveStats() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.matchLivePlayersPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchLivePlayersPage Text");
				return explorePageLocators.matchLivePlayersPage.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.matchLivePlayersPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchLivePlayersPage Text");
				return explorePageLocators.matchLivePlayersPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesMatchLiveStats()<br />" + e);
			throw e;
		}
	}

	public String validatesSeasonStatsForPlayers() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "SEASON STATS");
				waitForVisibilityFluentWait(explorePageLocators.seasonStatsPlayersPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchLivePlayersPage Text");
				return explorePageLocators.seasonStatsPlayersPage.getText();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				waitForVisibilityFluentWait(explorePageLocators.seasonStatsPlayersPage, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns seasonStatsPlayersPage Text");
				return explorePageLocators.seasonStatsPlayersPage.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesSeasonStatsForPlayers()<br />" + e);
			throw e;

		}
	}

	public void clickOnViewMoreBtnInPlayersScreenIos() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "VIEW MORE");
				waitForVisibilityFluentWait(explorePageLocators.viewMoreBtnLatestSectionPlayersPage, 60);
				explorePageLocators.viewMoreBtnLatestSectionPlayersPage.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on viewMoreBtnLatestSectionPlayersPage");
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				elementToBeClickableFluentWait(explorePageLocators.viewMoreBtnLatestSectionPlayersPage, 60);
				explorePageLocators.viewMoreBtnLatestSectionPlayersPage.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on viewMoreBtnLatestSectionPlayersPage");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnViewMoreBtnInPlayersScreenIos()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheSearchPageInIosIsDisplayed() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns searchInputTextInExplorePage Text");
			return explorePageLocators.searchInputTextInExplorePage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheSearchPageInIosIsDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clicksOnExitBtnInSearchpage() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.exitBtnInSearchPagePlayers, 60);
			explorePageLocators.exitBtnInSearchPagePlayers.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on exitBtnInSearchPagePlayers");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnExitBtnInSearchpage()<br />" + e);
			throw e;

		}

	}

	public boolean validatesTheShareIconInPlayersScreenInIosDisplayed() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "VIEW MORE");
				ExtentsReportManager.extentReportLogging("pass", "Returns shareIconPlayersPage Text");
				return explorePageLocators.shareIconPlayersPage.isDisplayed();
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
				ExtentsReportManager.extentReportLogging("pass", "Returns shareIconPlayersPage Text");
				return explorePageLocators.shareIconPlayersPage.isDisplayed();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheShareIconInPlayersScreenInIosDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clickOnShareIconInPlayersScreenIos() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.shareIconPlayersPage, 60);
			explorePageLocators.shareIconPlayersPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on shareIconPlayersPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnShareIconInPlayersScreenIos()<br />" + e);
			throw e;

		}

	}

	public void clickOnProfileStatsInPlayersScreenIos() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.profileTabPlayersInfoPage, 60);
			explorePageLocators.profileTabPlayersInfoPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on profileTabPlayersInfoPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnProfileStatsInPlayersScreenIos()<br />" + e);
			throw e;

		}

	}

	public void clickOnStatsTabInPlayersScreenIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			elementToBeClickableFluentWait(explorePageLocators.statsTabPlayersInfoPage, 60);
			explorePageLocators.statsTabPlayersInfoPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on statsTabPlayersInfoPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnStatsTabInPlayersScreenIos()<br />" + e);
			throw e;

		}

	}

	public void clickOnDDGirlsTabInIos() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.girlsDDInTableFixturesPgae, 60);
			explorePageLocators.girlsDDInTableFixturesPgae.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on girlsDDInTableFixturesPgae");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnDDGirlsTabInIos()<br />" + e);
			throw e;

		}

	}

	public String getGirlsLeague1Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague1TextScheduleScreen Text");
				return explorePageLocators.girlsLeague1TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague1TextScheduleScreen Text");
				return explorePageLocators.girlsLeague1TextScheduleScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getGirlsLeague1Text()<br />" + e);
			throw e;
		}
	}

	public String getGirlsLeague2Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague2TextScheduleScreen, 60);
				explorePageLocators.girlsLeague2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague2TextScheduleScreen Text");
				return explorePageLocators.girlsLeague2TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague2TextScheduleScreen, 60);
				explorePageLocators.girlsLeague2TextScheduleScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague2TextScheduleScreen Text");
				return explorePageLocators.girlsLeague2TextScheduleScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getGirlsLeague2Text()<br />" + e);
			throw e;
		}
	}

	public String getGirlsLeague3Text() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague3TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague3TextScheduleScreen Text");
				return explorePageLocators.girlsLeague3TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague3TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague3TextScheduleScreen Text");
				return explorePageLocators.girlsLeague3TextScheduleScreen.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getGirlsLeague3Text()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheItemsInHistoryPageDisplayed() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			ExtentsReportManager.extentReportLogging("pass", "Returns itemInHistoryPage Text");
			return explorePageLocators.itemInHistoryPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheItemsInHistoryPageDisplayed()<br />" + e);
			throw e;
		}
	}

	public boolean validatesTheItemsInHistoryPageIosDisplayed() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			ExtentsReportManager.extentReportLogging("pass", "Returns itemInHistoryPage Text");
			return explorePageLocators.itemInHistoryPage.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheItemsInHistoryPageIosDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clickOnAnyOneOfTheHistoryItemInIos() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.itemInHistoryPage, 60);
			explorePageLocators.itemInHistoryPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on itemInHistoryPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnAnyOneOfTheHistoryItemInIos()<br />" + e);
			throw e;

		}

	}

	public boolean validatesTheCTAHistoryItemDisplayed() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns titleCTAHistoryItem Text");
			return explorePageLocators.titleCTAHistoryItem.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheCTAHistoryItemDisplayed()<br />" + e);
			throw e;
		}
	}

	public void clickOnTableCTAFixturesAndTablesPageInIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (explorePageLocators.tableCTABtnInFixtures.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolls down to tableCTABtnInFixtures");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnTableCTAFixturesAndTablesPageInIos()<br />" + e);
			throw e;
		}

	}

	public void clickOnTableCTA() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.tableCTABtnInFixtures1, 60);
			explorePageLocators.tableCTABtnInFixtures1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on tableCTABtnInFixtures1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnTableCTA()<br />" + e);
			throw e;

		}

	}

	public void selectsALatestVideoInLatestListingPage() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (explorePageLocators.latestVideoListingPage.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}

			}
			ExtentsReportManager.extentReportLogging("pass", "Scroll down to latestVideoListingPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-selectsALatestVideoInLatestListingPage()<br />" + e);
			throw e;
		}

	}

	public boolean validatesTheVideoPlayingInVideoDestinationPageDisplayed() {
		try {
			waitForVisibilityFluentWait(explorePageLocators.moreInfoBtnInVideoModel, 60);
			ExtentsReportManager.extentReportLogging("pass", "Returns moreInfoBtnInVideoModel Text");
			return explorePageLocators.moreInfoBtnInVideoModel.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheVideoPlayingInVideoDestinationPageDisplayed()<br />"
							+ e);
			throw e;
		}
	}

	public void clicksLatestVideoInListingPage() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.latestVideoListingPage1, 60);
			explorePageLocators.latestVideoListingPage1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on latestVideoListingPage1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksLatestVideoInListingPage()<br />" + e);
			throw e;

		}

	}

	public void scrollDowToBuyTicketHospitalityTickeyInfoCTAInFixturesPageInIos() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (explorePageLocators.ticketInfoBtnFixturesPage.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}

			}
			ExtentsReportManager.extentReportLogging("pass", "Scroll down to ticketInfoBtnFixturesPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-scrollDowToBuyTicketHospitalityTickeyInfoCTAInFixturesPageInIos()<br />"
							+ e);
			throw e;
		}

	}

	public void clicksOnTicketsInfoBtnInIos() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.ticketInfoBtnFixturesPage1, 60);
			explorePageLocators.ticketInfoBtnFixturesPage1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on ticketInfoBtnFixturesPage1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnTicketsInfoBtnInIos()<br />" + e);
			throw e;

		}

	}

	public void scrollDownToMatchResults() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (explorePageLocators.matchResultsInFixtures1.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scroll down to matchResultsInFixtures1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-scrollDownToMatchResults()<br />" + e);
			throw e;
		}

	}

	public void clicksOnPostMatchAnalysisInUnitedScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.matchResultsInFixtures, 60);
			explorePageLocators.matchResultsInFixtures.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on matchResultsInFixtures");
			elementToBeClickableFluentWait(explorePageLocators.postMatchInUnitedNowPage, 60);
			explorePageLocators.postMatchInUnitedNowPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on postMatchInUnitedNowPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnPostMatchAnalysisInUnitedScreen()<br />" + e);
			throw e;

		}

	}

	public String validateMatchCenter() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.girlsLeague1TextScheduleScreen, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns girlsLeague1TextScheduleScreen Text");
				return explorePageLocators.girlsLeague1TextScheduleScreen.getText();
			} else {
				waitForVisibilityFluentWait(explorePageLocators.matchCenterFormatchResult, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns matchCenterFormatchResult Text");
				return explorePageLocators.matchCenterFormatchResult.getDomAttribute("label");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validateMatchCenter()<br />" + e);
			throw e;
		}
	}

	public void clicksOnBackInTicketsPage() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.backIconInTicketsPage, 60);
			explorePageLocators.backIconInTicketsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on backIconInTicketsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnBackInTicketsPage()<br />" + e);
			throw e;

		}

	}

	public void swipwToLeft() {
		swipeWithCoordinates(982, 1071, 559, 1085, 200, "left", driver);

	}

	public void clicksOnBackIconInPredictionsPage() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.backIconInPridictionsPage, 60);
			explorePageLocators.backIconInPridictionsPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on backIconInPridictionsPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnBackIconInPredictionsPage()<br />" + e);
			throw e;

		}
	}

	public void clickOnProfileTabInPlayersScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.profileTabInPlayersPage, 60);
			explorePageLocators.profileTabInPlayersPage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on profileTabInPlayersPage");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnProfileTabInPlayersScreen()<br />" + e);
			throw e;

		}

	}

	public void scrollsDownToDFPAdsCardInLatestScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (explorePageLocators.dfpAdCardInLatestScreen.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolls down to dfpAdCardInLatestScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-scrollsDownToDFPAdsCardInLatestScreen()<br />" + e);
			throw e;
		}

	}

	public boolean validatesTheDFPAdCardAndClickOnDfpAdCard() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "returns dfpAdCardInLatestScreen1 Text");
			return explorePageLocators.dfpAdCardInLatestScreen1.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheDFPAdCardAndClickOnDfpAdCard()<br />" + e);
			throw e;
		}
	}

	public void clickOnDfpAdCardLatestScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.dfpAdCardInLatestScreen1, 60);
			explorePageLocators.dfpAdCardInLatestScreen1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on dfpAdCardInLatestScreen1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnDfpAdCardLatestScreen()<br />" + e);
			throw e;

		}

	}

	public void scrollsDownToDFPAdsCardInPlayersScreen() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			for (int i = 0; i < 20; i++) {
				if (explorePageLocators.dfpAdCardInPlayersScreen.size() <= 0) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Scrolls down to dfpAdCardInPlayersScreen ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-scrollsDownToDFPAdsCardInPlayersScreen()<br />" + e);
			throw e;
		}

	}

	public boolean validatesTheDFPAdCardAndClickOnDfpAdCardPlayersScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "returns dfpAdCardInPlayersScreen1 Text");
			return explorePageLocators.dfpAdCardInPlayersScreen1.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheDFPAdCardAndClickOnDfpAdCardPlayersScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnDfpAdCardPlayersScreen() {
		try {
			elementToBeClickableFluentWait(explorePageLocators.dfpAdCardInPlayersScreen1, 60);
			explorePageLocators.dfpAdCardInPlayersScreen1.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on dfpAdCardInPlayersScreen1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnDfpAdCardPlayersScreen()<br />" + e);
			throw e;

		}

	}

	public boolean validatesTheCrestImageInFixturesScreen() {
		try {
			if (explorePageLocators.crestAImageInFixturesScreen.isDisplayed()
					&& explorePageLocators.crestBImageInFixturesScreen.isDisplayed())
				ExtentsReportManager.extentReportLogging("pass", "Returns crestAImageInFixturesScreen Text");
			return true;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesTheCrestImageInFixturesScreen()<br />" + e);
			throw e;
		}
	}

	public void clickOnReggNotNowInMyUnited() {
		try {
			if (!explorePageLocators.ReggressionPopUpUniteNow.isEmpty()) {
				explorePageLocators.ReggressionPopUpUniteNow.get(0).click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on ReggressionPopUpUniteNow ");
			}
			ExtentsReportManager.extentReportLogging("pass", "Clicks on dfpAdCardInPlayersScreen1");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnDfpAdCardPlayersScreen()<br />" + e);
			throw e;

		}

	}

	public ArrayList<String> getCarouselListFromSearchPage() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> carouselList = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				for (int i = 0; i < explorePageLocators.carouselList.size() - 1; i++) {
					carouselList.add(explorePageLocators.carouselList.get(i).getText().trim().toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns search page carousel values");
			} else {
				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
				for (int i = 0; i < explorePageLocators.carouselList.size(); i++) {
					carouselList.add(explorePageLocators.carouselList.get(i).getText().trim().toUpperCase());
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

	public boolean validatesPopularAndCategoriesSectionInTheSearchScreen() {
		try {
			if (explorePageLocators.popularSection.size() > 0 && explorePageLocators.categoriesSection.size() > 0) {
				ExtentsReportManager.extentReportLogging("pass",
						"Found popular and categories section in search screen");
				return true;
			} else {
				ExtentsReportManager.extentReportLogging("fail",
						"Not Found popular and categories section in search screen");
				return false;
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getCarouselListFromSearchPage()<br />" + e);
			throw e;
		}
	}

	public ArrayList<String> getsPopularContentInTheSearchScreen() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> popularContent = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				int size = explorePageLocators.popularSectionData.size();
				for (int i = 0; i < size; i++) {
					popularContent.add(explorePageLocators.popularSectionData.get(i).getText());
				}
				ExtentsReportManager.extentReportLogging("pass", "Found popular content in search screen");
				return popularContent;
			} else {
				explorePageLocators.popularSectionData.get(0).click();
				int size = explorePageLocators.popularSectionData.size();
				for (int i = 0; i < size; i++) {
					if (!(explorePageLocators.popularSectionData.get(i).getText().equalsIgnoreCase("popular")))
						popularContent.add(explorePageLocators.popularSectionData.get(i).getText());
					if (explorePageLocators.popularSectionData.get(i).getText().equalsIgnoreCase("categories")) {
						ExtentsReportManager.extentReportLogging("pass", "Found popular content in search screen");
						return popularContent;
					}
				}
				return popularContent;
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getCarouselListFromSearchPage()<br />" + e);
			throw e;
		}
	}

	public void enterCharactersInSearch(String twoCharacter) throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				waitForVisibilityFluentWait(explorePageLocators.searchInputTextInUnitedNowSearchScreen, 60);
				explorePageLocators.searchInputTextInUnitedNowSearchScreen.click();
				waitForVisibilityFluentWait(explorePageLocators.typesearchInputTextInUnitedNowSearchScreen, 60);
				explorePageLocators.typesearchInputTextInUnitedNowSearchScreen.sendKeys(twoCharacter);
				ExtentsReportManager.extentReportLogging("pass", "Clicks on enterlessthanTwoCharacter");
			} else {
				explorePageLocators.clearIconInExploreScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on clearIconInExploreScreen");
				waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
				explorePageLocators.searchInputTextInExplorePage.sendKeys(twoCharacter);
				ExtentsReportManager.extentReportLogging("pass", "Enters searchInputTextInExplorePage Text");
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterCharactersInSearch()<br />" + e);
			throw e;

		}
	}

	public void enterlessthanTwoCharacterios(String twoCharacter) {
		try {
//			waitForVisibility(explorePageLocators.searchInputTextInUnitedNowSearchScreen, 60);
			explorePageLocators.searchInputTextInUnitedNowSearchScreen.click();
//			waitForVisibility(explorePageLocators.typesearchInputTextInUnitedNowSearchScreen, 60);
			explorePageLocators.typesearchInputTextInUnitedNowSearchScreen.sendKeys(twoCharacter);
			ExtentsReportManager.extentReportLogging("pass", "Clicks on enterlessthanTwoCharacter");

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterImageInSearchForNewsContentInPageFilter()<br />" + e);
			throw e;

		}
	}

	public void enterThreeCharacter(String threeCharacter) {
		try {
			waitForVisibilityFluentWait(explorePageLocators.typesearchInputTextInUnitedNowSearchScreen, 60);
			explorePageLocators.typesearchInputTextInUnitedNowSearchScreen.clear();
			explorePageLocators.typesearchInputTextInUnitedNowSearchScreen.sendKeys(threeCharacter);
			ExtentsReportManager.extentReportLogging("pass", "Clicks on enterlessthanTwoCharacter");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-enterImageInSearchForNewsContentInPageFilter()<br />" + e);
			throw e;
		}
	}

	public boolean validatesNoSearchResultForThreeCharactersIninUtedNow() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (explorePageLocators.suggestion.isEmpty()) {
					ExtentsReportManager.extentReportLogging("Pass", "Not Found suggestion in search screen");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("Fail", "Found suggestion in search screen");
					return false;
				}
			} else {
				if (explorePageLocators.suggestion.isEmpty()) {
					ExtentsReportManager.extentReportLogging("Pass", "Not Found suggestion in search screen");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("Fail", "Found suggestion in search screen");
					return false;
				}
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesSearchResultIninUtedNow()<br />" + e);
			throw e;
		}
	}

	public boolean validatesSearchResultForThreeCharactersIninUtedNow() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (explorePageLocators.suggestion.size() > 0) {
					ExtentsReportManager.extentReportLogging("pass", "Found suggestion in search screen");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("fail", "Not Found suggestion in search screen");
					return false;
				}
			} else {
				if (explorePageLocators.suggestion.size() > 0) {
					ExtentsReportManager.extentReportLogging("pass", "Found suggestion in search screen");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("fail", "Not Found suggestion in search screen");
					return false;
				}
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesSearchResultIninUtedNow()<br />" + e);
			throw e;
		}
	}

	public void clicksOnOkBackButtonInWeHaveImprovedInIos() {
		try {
			if (!explorePageLocators.weHaveImprovedList.isEmpty()) {
				explorePageLocators.weHaveImproved.click();
//				elementToBeClickableFluentWait(explorePageLocators.backUnitedNowSearch, 60);
//				explorePageLocators.backUnitedNowSearch.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on okButtonCookiesScreen");
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnOkButtonInCookiesScreenIos()<br />" + e);
			throw e;
		}
	}
	
	public void userClickOnFirstItemFromList() {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				if (explorePageLocators.suggestion.size() > 0) {
					explorePageLocators.suggestion.get(0).click();
					ExtentsReportManager.extentReportLogging("pass", "User select first item from search screen");
				} else {
					ExtentsReportManager.extentReportLogging("fail", "User unable to select firt item from search screen");
				}
			} else {
				if (explorePageLocators.suggestion.size() > 0) {
					explorePageLocators.suggestion.get(0).click();
					ExtentsReportManager.extentReportLogging("pass", "User select first item from search screen in IOS");
				} else {
					ExtentsReportManager.extentReportLogging("fail", "User unable to select firt item from search screen");
				}
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validatesSearchResultIninUtedNow()<br />" + e);
			throw e;
		}
	}
	
	public void userClickOnFirstItemFromListInIOS() {
		try {
				if (explorePageLocators.suggestion.size() > 0) {
					waitForVisibilityFluentWait(explorePageLocators.suggestion.get(0), 60);
					explorePageLocators.suggestion.get(0).click();
					ExtentsReportManager.extentReportLogging("pass", "User select first item from search screen in IOS");
				} else {
					ExtentsReportManager.extentReportLogging("fail", "User unable to select firt item from search screen");
				}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-userClickOnFirstItemFromListInIOS()<br />" + e);
			throw e;
		}
	}
    public void switchToWebView() {
        AndroidGenericLibrary.switchToWebViewContext((AndroidDriver) driver);
    }
	
	public boolean validateDataInSerchResult() throws Exception {
		String device = GlobalParams.getPlatformName();
		try {
			if (device.equalsIgnoreCase("android")) {
				Thread.sleep(1000);
				
				List<WebElement> allData = driver.findElements(By.xpath("//android.webkit.WebView[@text=\"Search – ManUtd.com | Manchester United\"]"));
				if (allData.size() > 0) {
					ExtentsReportManager.extentReportLogging("pass", "Data found from suggestion in search screen");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("fail", "Not Found suggestion in search screen");
					return false;
				}
			} else {
				if (explorePageLocators.allData.isDisplayed() && explorePageLocators.mutv.isDisplayed() && explorePageLocators.news.isDisplayed() && explorePageLocators.video.isDisplayed()) {
					ExtentsReportManager.extentReportLogging("pass", "Data found from suggestion in search screen");
					return true;
				} else {
					ExtentsReportManager.extentReportLogging("fail", "Not Found suggestion in search screen");
					return false;
				}
			}

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-validateDataInSerchResult()<br />" + e);
			throw e;
		}
	}
	
	public void searchAllDataInIos(String ExploreSearchText) {
		try {
			waitForVisibilityFluentWait(explorePageLocators.selectingSuggestionsExploreScreen, 60);
			explorePageLocators.selectingSuggestionsExploreScreen.click();
			explorePageLocators.clearIconInExploreScreen.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on clearIconInExploreScreen");
			waitForVisibilityFluentWait(explorePageLocators.searchInputTextInExplorePage, 60);
			explorePageLocators.searchInputTextInExplorePage.sendKeys(ExploreSearchText);
			ExtentsReportManager.extentReportLogging("pass", "Enters searchInputTextInExplorePage Text");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-searchPlayersOrUpdatesInIos()<br />" + e);
			throw e;

		}

	}
	
	public String getAll() {
		try {
				waitForVisibilityFluentWait(explorePageLocators.allData, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns All Text");
				return explorePageLocators.allData.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getAll()<br />" + e);
			throw e;
		}
	}
	
	public String getMutv() {
		try {
				waitForVisibilityFluentWait(explorePageLocators.mutv, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns mutv Text");
				return explorePageLocators.mutv.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getMutv()<br />" + e);
			throw e;
		}
	}
	
	public String getNews() {
		try {
				waitForVisibilityFluentWait(explorePageLocators.news, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns News Text");
				return explorePageLocators.news.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getNews()<br />" + e);
			throw e;
		}
	}
	
	public String getVideos() {
		try {
				waitForVisibilityFluentWait(explorePageLocators.video, 60);
				ExtentsReportManager.extentReportLogging("pass", "Returns video Text");
				return explorePageLocators.video.getDomAttribute("label");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-getVideo()<br />" + e);
			throw e;
		}
	}
	
	public void askAppNotToTrack() throws Exception {
		try {
//            waitForVisibilityFluentWait(explorePageLocators.weUseCookiesTexts);
			if (explorePageLocators.askAppNotToTrack.isDisplayed()) {
//                waitForVisibilityFluentWait(explorePageLocators.okButtonCookiesScreen);
				explorePageLocators.askAppNotToTrack.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on Ask App Not to Track");
			}
			Thread.sleep(1000);
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-askAppNotToTrack()<br />" + e);
			throw e;
		}
	}

	public void clickOnContinueButton() throws Exception {
		try {
//            waitForVisibilityFluentWait(explorePageLocators.weUseCookiesTexts);
			if (explorePageLocators.clicksOnContinueButton.isDisplayed()) {
//                waitForVisibilityFluentWait(explorePageLocators.okButtonCookiesScreen);
				explorePageLocators.clicksOnContinueButton.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on continue button");
			}
			Thread.sleep(1000);
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnContinueButton()<br />" + e);
			throw e;
		}
	}

		public void checksForCBSContentInSearchResult() throws Exception {
			try {
			    int scrollAttempts = 0;
			    while (true) {
			        List<WebElement> videos = driver.findElements(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Subscribe\"])[1]"));
			        
			        if (!videos.isEmpty()) {
			            ExtentsReportManager.extentReportLogging("pass", "Found video with 'Subscribe' label.");
			            videos.get(0).click();
			            // Optional: Wait for next screen to load
			            // new WebDriverWait(driver, Duration.ofSeconds(10)).until(...);
			            break;
			        }

			        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			        scrollAttempts++;

			        if (scrollAttempts > 30) {
			            ExtentsReportManager.extentReportLogging("fail", "Exceeded max scrolls; could not find CBS video.");
			            break;
			        }
			    }
			} catch (Exception e) {
			    ExtentsReportManager.extentReportLogging("fail", "Exception in SelectsTheVideoAndCheckCBSBadgeInIos(): " + e);
			    throw e;
			}
			
		}
		

	public void checksForCBRContentInSearchResult() {
		try {
	        int scrollAttempts = 0;
	        while (true) {
	            List<WebElement> videos = driver.findElements(AppiumBy.xpath("//XCUIElementTypeLink[contains(@name, \"Register\")]"));

	            if (!videos.isEmpty()) {
	                WebElement video = videos.get(0);
	                if (video.isDisplayed()) {
	                    ExtentsReportManager.extentReportLogging("pass", "Found video with 'Register' label.");
	                     video.click();
	                    break; // ✅ Do NOT scroll, just exit
	                }
	            }

	            if (scrollAttempts >= 30) {
	                ExtentsReportManager.extentReportLogging("fail", "Exceeded max scrolls; could not find CBR video.");
	                break;
	            }

	            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
	            scrollAttempts++;
	        }
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in checksForCBRContentInSearchResult(): " + e);
	        throw e;
	    }
		
		
	}

	public void clicksOnCBRContent() {
		try {
			IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
			elementToBeClickableFluentWait(explorePageLocators.CBRcontentSearchResults, 60);
			explorePageLocators.CBRcontentSearchResults.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on CBRContent");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clickOnStatsTabInPlayersScreenIos()<br />" + e);
			throw e;

		}
		
	}

//	public String getWhatsNewText() {
//		String device = GlobalParams.getPlatformName();
//		String whatsNew = null;
//		try {
//			if (device.equalsIgnoreCase("android")) {
//				if(explorePageLocators.whatsNew.isDisplayed()) {
////				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
//				 whatsNew = explorePageLocators.whatsNew.getText();
//				return whatsNew;
//				}
//				else  {
//					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
//					 whatsNew = explorePageLocators.whatsNew.getAttribute("name");
//					return whatsNew;
//				}
//			} else { //IOS
//				if(explorePageLocators.whatsNew.isDisplayed()) {
////				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
//				 whatsNew = explorePageLocators.whatsNew.getAttribute("name");
//				return whatsNew;
//		} else {
//				IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.5);
//				 whatsNew = explorePageLocators.whatsNew.getAttribute("name");
//				return whatsNew;
//			}
//		}
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getWhatsNew()<br />" + e);
//			throw e;
//		}
//	}
	public String getWhatsNewText() {
	    String device = GlobalParams.getPlatformName();
	    String whatsNew = null;
	    
	    try {
	        if (device.equalsIgnoreCase("android")) {
	            if (explorePageLocators.whatsNew.isDisplayed()) {
	            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
	                whatsNew = explorePageLocators.whatsNew.getText();
	                return whatsNew;
	            } else {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
	                whatsNew = explorePageLocators.whatsNew.getAttribute("name");
	                return whatsNew;
	            }
	        } else { // iOS
	            if (!explorePageLocators.whatsNew.isDisplayed()) {
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
	            }
	            whatsNew = explorePageLocators.whatsNew.getAttribute("name");
	            return whatsNew;
	        }
	        
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getWhatsNew()<br />" + e);
	        throw e;
	    }
	}

}
 
	
		
		



