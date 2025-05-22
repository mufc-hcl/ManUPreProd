package org.bdd.pages;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.OnboardingPageLocators;
import org.bdd.utils.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class OnboardingPage extends Common {
    private static final Logger log = LogManager.getLogger(OnboardingPage.class);
    OnboardingPageLocators onboardingPageLocators;

    public OnboardingPage() {
        this.onboardingPageLocators = new OnboardingPageLocators();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), onboardingPageLocators);
    }

    // screen 1 reusable methods -getting all text values
    public String getQuoteScreen1() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.quoteScreen1, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned quote");
                return onboardingPageLocators.quoteScreen1.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.quoteScreen1, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned quote ");
                return onboardingPageLocators.quoteScreen1.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getQuoteScreen1()<br />" + e);
            throw e;
        }
    }

    public String getDescScreen1() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.descScreen1, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned description screen 1");
                return onboardingPageLocators.descScreen1.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.descScreen1, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned description screen1");
                return onboardingPageLocators.descScreen1.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getDescScreen1()<br />" + e);
            throw e;
        }
    }

    public String getLetsGOButtonScreen1() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.letsGOButtonScreen1, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned lets go button text");
                return onboardingPageLocators.letsGOButtonScreen1.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.letsGOButtonScreen1, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned lets go button text ");
                return onboardingPageLocators.letsGOButtonScreen1.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getLetsGOButtonScreen1()<br />" + e);
            throw e;
        }
    }

    public void clickLetsGOButtonScreen1() {
        try {
            elementToBeClickableFluentWait(onboardingPageLocators.letsGOButtonScreen1, 30);
            onboardingPageLocators.letsGOButtonScreen1.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on lets go button ");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickLetsGOButtonScreen1()<br />" + e);
            throw e;

        }
    }

    //screen 2 reusable methods -getting all text values
    public String getTextforWelcomeHeading() {
    	 String device = GlobalParams.getPlatformName();
         ;
        WebElement ele = null;
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeToTheManUtdApp, 60);
                ele = onboardingPageLocators.welcomeToTheManUtdApp;
                ExtentsReportManager.extentReportLogging("pass", "Returned welcome text");
                return ele.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeToTheManUtdApp, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned welcome text ");
                return onboardingPageLocators.welcomeToTheManUtdApp.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforWelcomeHeading()<br />" + e);
            throw e;
        }
    }

    public void clickScreenTwoDotButton() throws InterruptedException {
        try {
//			elementToBeClickableFluentWait(screenTwoDot.get(0));
            while (!(onboardingPageLocators.allowButtonScreen2.get(0).getText().equalsIgnoreCase("ALLOW"))) {
                Thread.sleep(2000);
                ExtentsReportManager.extentReportLogging("pass", "waiting for screen two to display");
                onboardingPageLocators.screenTwoDot.get(0).click();
                ExtentsReportManager.extentReportLogging("pass", "Clicks on screen two dot");
                if ((onboardingPageLocators.allowButtonScreen2.get(0).getText().equalsIgnoreCase("ALLOW"))) break;
            }
//			screenTwoDot.get(0).click();
        } catch (Exception e) {
//			Assert.fail();
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickScreenTwoDotButton()<br />" + e);
            throw e;

        }
    }

    public void clickScreenThreeDotButton() {
        try {
//            elementToBeClickableFluentWait(onboardingPageLocators.screenThreeDot, 5);
            elementToBeClickableFluentWait(onboardingPageLocators.screenThreeDot, 60);
            onboardingPageLocators.screenThreeDot.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on screen three dot");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickScreenThreeDotButton()<br />" + e);
            throw e;
        }
    }

    public void clickScreenFourDotButton() {
        try {
//            elementToBeClickableFluentWait(onboardingPageLocators.screenFourDot, 60);
            elementToBeClickableFluentWait(onboardingPageLocators.screenFourDot, 60);
            onboardingPageLocators.screenFourDot.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on screen four dot");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickScreenFourDotButton()<br />" + e);
            throw e;
        }
    }

    public String getTextForWelcomeHeadingScreen2() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 2");
                return onboardingPageLocators.welcomeTextScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen2");
                return onboardingPageLocators.welcomeTextScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextForWelcomeHeadingScreen2()<br />" + e);
            throw e;
        }
    }

    public String getQuoteScreen2() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.quoteScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned quote in screen 2");
                return onboardingPageLocators.quoteScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.quoteScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned quote in screen2");
                return onboardingPageLocators.quoteScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getQuoteScreen2()<br />" + e);
            throw e;
        }
    }

    public String getDescScreen2() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.descScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned description screen2");
                return onboardingPageLocators.descScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.descScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned description screen 2");
                return onboardingPageLocators.descScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getDescScreen2()<br />" + e);
            throw e;
        }
    }

    public String getAllowButtonScreen2() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.allowBtnScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returened allow button  in screen2");
                return onboardingPageLocators.allowBtnScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.allowBtnScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returened allow button text in screen 2");
                return onboardingPageLocators.allowBtnScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getAllowButtonScreen2()<br />" + e);
            throw e;
        }
    }

    public String getAskMeLaterButtonScreen2() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.askMeLaterScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned ask me later test in screen2");
                return onboardingPageLocators.askMeLaterScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.askMeLaterScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned ask me later test in screen 2");
                return onboardingPageLocators.askMeLaterScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getAskMeLaterButtonScreen2()<br />" + e);
            throw e;
        }
    }

    public void clickAskMeLaterButtonScreen2() {
        try {
            elementToBeClickableFluentWait(onboardingPageLocators.askMeLaterScreen2, 30);
            onboardingPageLocators.askMeLaterScreen2.click();
            ExtentsReportManager.extentReportLogging("pass", "CLicks on ask me later icon in screen 2");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickAskMeLaterButtonScreen2()<br />" + e);
            throw e;

        }
    }

    public void userClickOnAllow() {
        try {
            elementToBeClickableFluentWait(onboardingPageLocators.allowBtnScreen2, 60);
            onboardingPageLocators.allowBtnScreen2.click();
            ExtentsReportManager.extentReportLogging("pass", "CLicks on Allow in screen 2");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-userClickOnAllow()<br />" + e);
            throw e;

        }
    }

    public String getNotification() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.allowNotificationScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns allow notification text");
                return onboardingPageLocators.allowNotificationScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.allowNotificationScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns allow notification text ");
                return onboardingPageLocators.allowNotificationScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getNotification()<br />" + e);
            throw e;
        }
    }

    public String getAllow() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.allowBtnNoftScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Return allow button in screen 2 ");
                return onboardingPageLocators.allowBtnNoftScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.allowBtnNoftScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Return allow button in screen 2");
                return onboardingPageLocators.allowBtnNoftScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getAllow()<br />" + e);
            throw e;
        }
    }

    public String getDontAllow() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.dontAllowBtnNoftScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned don't allow text");
                return onboardingPageLocators.dontAllowBtnNoftScreen2.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.dontAllowBtnNoftScreen2, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned don't allow text ");
                return onboardingPageLocators.dontAllowBtnNoftScreen2.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getDontAllow()<br />" + e);
            throw e;
        }
    }

    public void userClickOnAllowBtnInNotificationScreen() {
        try {
            elementToBeClickableFluentWait(onboardingPageLocators.allowBtnNoftScreen2, 60);
            onboardingPageLocators.allowBtnNoftScreen2.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on Allow button in notification screen");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-userClickOnAllowBtnInNotificationScreen()<br />" + e);
            throw e;
        }
    }

    public void userClickOnDenyBtnInNotificationScreen() {
        try {
            waitForVisibilityFluentWait(onboardingPageLocators.dontAllowBtnNoftScreen2, 60);
            onboardingPageLocators.dontAllowBtnNoftScreen2.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on deny button in notification screen");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-userClickOnDenyBtnInNotificationScreen()<br />" + e);
            throw e;
        }
    }
    // screen 3 reusable methods -getting all text values

    public String getTextForWelcomeHeadingScreen3() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 3");
                return onboardingPageLocators.welcomeTextScreen3.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 3 ");
                return onboardingPageLocators.welcomeTextScreen3.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextForWelcomeHeadingScreen3()<br />" + e);
            throw e;
        }
    }

    public ArrayList<String> getMenScreen3() {
        String device = GlobalParams.getPlatformName();
        ArrayList<String> verifyPlayerCategeory = new ArrayList<>();
        try {
  			if (device.equalsIgnoreCase("android")) {
  				for (int i = 0; i < onboardingPageLocators.playerCategeoryVerify.size(); i++) {
  					verifyPlayerCategeory.add(onboardingPageLocators.playerCategeoryVerify.get(i).getText().toUpperCase());
  				}
  				ExtentsReportManager.extentReportLogging("pass", "Returns player categeory text from UI" );
  			} else {
  				for (int i = 0; i < onboardingPageLocators.playerCategeoryVerify.size(); i++) {
  					verifyPlayerCategeory.add(onboardingPageLocators.playerCategeoryVerify.get(i).getDomAttribute("label").toUpperCase());
  				}
  				ExtentsReportManager.extentReportLogging("pass", "Returns player categeory text from UI" );
  			}
  			return verifyPlayerCategeory;
  		} catch (Exception e) {
  			ExtentsReportManager.extentReportLogging("fail",
  					"Exception occurred in function-getMenScreen3()<br />" + e);
  			throw e;
  		}
      }

    public String getWomenScreen3() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.womenButtonScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns women button in screen 3");
                return onboardingPageLocators.womenButtonScreen3.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.womenButtonScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns women button in screen3");
                return onboardingPageLocators.womenButtonScreen3.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getWomenScreen3()<br />" + e);
            throw e;
        }
    }

    public String getSwipeToSelectScreen3() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.swipeToSelectScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns swipe to select in screen 3");
                return onboardingPageLocators.swipeToSelectScreen3.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.swipeToSelectScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns swipe to select in screen3");
                return onboardingPageLocators.swipeToSelectScreen3.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getSwipeToSelectScreen3()<br />" + e);
            throw e;
        }
    }

    public String getSelectionScreen3() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.selectionScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns selection text in screen3");
                return onboardingPageLocators.selectionScreen3.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.selectionScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns selection text in screen3 ");
                return onboardingPageLocators.selectionScreen3.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getSelectionScreen3()<br />" + e);
            throw e;
        }
    }

    public String getConfirmButtonScreen3() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.confirmButtonScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Return confirm button text in screen 3");
                return onboardingPageLocators.confirmButtonScreen3.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.confirmButtonScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Return confirm button text in screen3");
                return onboardingPageLocators.confirmButtonScreen3.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getConfirmButtonScreen3()<br />" + e);
            throw e;
        }
    }

    public String getSkipButtonScreen3() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.skipButtonScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Return skip button text in screen 3");
                return onboardingPageLocators.skipButtonScreen3.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.skipButtonScreen3, 60);
                ExtentsReportManager.extentReportLogging("pass", "Return skip button text in screen 3");
                return onboardingPageLocators.skipButtonScreen3.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getSkipButtonScreen3()<br />" + e);
            throw e;
        }
    }

    public void clickSkipButtonScreen3() {
        try {
            waitForVisibilityFluentWait(onboardingPageLocators.skipButtonScreen3, 30);
            onboardingPageLocators.skipButtonScreen3.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on skip button in screen 3");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickSkipButtonScreen3()<br />" + e);
            throw e;
        }
    }

    public String getTextForWelcomeHeadingScreen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 4");
                return onboardingPageLocators.welcomeTextScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 4 ");
                return onboardingPageLocators.welcomeTextScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextForWelcomeHeadingScreen4()<br />" + e);
            throw e;
        }
    }

    public ArrayList<String> getbutton1Screen4()  {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> signUpscreen = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				for (int i = 0; i < onboardingPageLocators.signUpThreeScreens.size(); i++) {
					signUpscreen.add(onboardingPageLocators.signUpThreeScreens.get(i).getText().replace("INSIDER ACCESS", "FULL MUTV ACCESS").toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns signUpscreen text" );
			} else {
				for (int i = 0; i < onboardingPageLocators.signUpThreeScreens.size(); i++) {
					signUpscreen.add(onboardingPageLocators.signUpThreeScreens.get(i).getDomAttribute("label").replace("INSIDER ACCESS", "FULL MUTV ACCESS").toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns signUpscreen text" );
			}
			return signUpscreen;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getbutton1Screen4()<br />" + e);
			throw e;
		}
    }

    public String getButton2Screen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.unitedPredictionsScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned united predictions text");
                return onboardingPageLocators.unitedPredictionsScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.unitedPredictionsScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returned united predictions text ");
                return onboardingPageLocators.unitedPredictionsScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getButton2Screen4()<br />" + e);
            throw e;
        }
    }

    public String getButton3Screen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.offersAndRewardsScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns offers and reward text");
                return onboardingPageLocators.offersAndRewardsScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.offersAndRewardsScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns offers and reward text ");
                return onboardingPageLocators.offersAndRewardsScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getButton3Screen4()<br />" + e);
            throw e;
        }
    }

    public String getGetExclusiveAccessTextScreen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.getExclisiveScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns get exclusive");
                return onboardingPageLocators.getExclisiveScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.getExclisiveScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns get exclusive ");
                return onboardingPageLocators.getExclisiveScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getGetExclusiveAccessTextScreen4()<br />" + e);
            throw e;
        }
    }

    public String getDescScreen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.descScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns Description text");
                return onboardingPageLocators.descScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.descScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns Description text ");
                return onboardingPageLocators.descScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getDescScreen4()<br />" + e);
            throw e;
        }
    }

    public String getSignForUnitedButtonScreen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.signForUnitedScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns sign in for united button text");
                return onboardingPageLocators.signForUnitedScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.signForUnitedScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns sign in for united button text ");
                return onboardingPageLocators.signForUnitedScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getSignForUnitedButtonScreen4()<br />" + e);
            throw e;
        }
    }

    public String getSkipButtonScreen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.skipBtnScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns skip button text");
                return onboardingPageLocators.skipBtnScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.skipBtnScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns skip button text");
                return onboardingPageLocators.skipBtnScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-validatesTheSuccessMessageInEditProfileScreenInIos()<br />" + e);
            throw e;
        }
    }

    public void clickSkipButtonScreen4() {
        try {
//            waitForVisibilityFluentWait(onboardingPageLocators.skipBtnScreen4, 5);
            waitForVisibilityFluentWait(onboardingPageLocators.skipBtnScreen4, 60);
            onboardingPageLocators.skipBtnScreen4.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on skip button");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-validatesTheSuccessMessageInEditProfileScreenInIos()<br />" + e);
            throw e;
//			Assert.fail();
        }
    }

    public String getMyUnitedBenefitsScreen4() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.myUnitedBenefitsScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns my united text ");
                return onboardingPageLocators.myUnitedBenefitsScreen4.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.myUnitedBenefitsScreen4, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns my united text");
                return onboardingPageLocators.myUnitedBenefitsScreen4.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getMyUnitedBenefitsScreen4()<br />" + e);
            throw e;
        }
    }

    public String selectFavoritePlayer(String expectedPlayerName,int size) throws InterruptedException {
//		waitForVisibilityFluentWait(screenThreeDot);
        String actualPlayerName = null;
        System.out.println("e"+expectedPlayerName);
        try {
            for (int i = 0; i < size; i++) {
                swipeWithCoordinates(877, 947, 129, 947, 200, "left", driver);
                Thread.sleep(1000);
                actualPlayerName = onboardingPageLocators.selectedPlayerName.getText();
                if (actualPlayerName.equalsIgnoreCase(expectedPlayerName)) {
                    break;
                }
//                else {
//                    swipeWithCoordinates(877, 947, 129, 947, 200, "left", driver);
//                }
            }
            ExtentsReportManager.extentReportLogging("pass", "Selects favourites player as : "+expectedPlayerName);
            return actualPlayerName;
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-selectFavoritePlayer()<br />" + e);
            throw e;
        }

    }

    public void clickConfirmButton() {
        try {
            elementToBeClickableFluentWait(onboardingPageLocators.enabledConfirmButtonScreen3, 60);
            onboardingPageLocators.enabledConfirmButtonScreen3.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on confirm button");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickConfirmButton()<br />" + e);
            throw e;
        }
    }

    public void clicksOnCancelButtonInAppleIdScreen() throws Exception {
    	try {
//          waitForVisibilityFluentWait(explorePageLocators.weUseCookiesTexts);
			if (onboardingPageLocators.cancelButtonAppleIdScreen.isDisplayed()) {
//              waitForVisibilityFluentWait(explorePageLocators.okButtonCookiesScreen);
				onboardingPageLocators.cancelButtonAppleIdScreen.click();
				ExtentsReportManager.extentReportLogging("pass", "Clicks on cancel button in IOS");
			}
			Thread.sleep(1000);
		} catch (NoSuchElementException ns) {
			System.out.println("element is not displayed hence skipped");
		} catch (NullPointerException np) {
			System.out.println("null pointer exception due to override of screens");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-clicksOnCancelButtonInAppleIdScreen()<br />" + e);
			throw e;
		}
		/*
		 * try { elementToBeClickableFluentWait(onboardingPageLocators.
		 * cancelButtonAppleIdScreen, 60);
		 * onboardingPageLocators.cancelButtonAppleIdScreen.click();
		 * ExtentsReportManager.extentReportLogging("pass",
		 * "Clicks on cancel button in apple id"); } catch (Exception e) {
		 * ExtentsReportManager.extentReportLogging("fail",
		 * "Exception occurred in function-clicksOnCancelButtonInAppleIdScreen()<br />"
		 * + e); throw e; }
		 */
    }

    public String selectFavoritePlayerIos(String expectedPlayerName,int size) {
        waitForVisibilityFluentWait(onboardingPageLocators.welcomeTextScreen3, 60);
        String actualPlayerName = null;
        try {
            for (int i = 0; i < size; i++) {
                if (!onboardingPageLocators.selectedPlayerIos.isEmpty()) {
                    swipeWithCoordinates(363, 386, 195, 386, 200, "left", driver);
                    actualPlayerName = onboardingPageLocators.selectedPlayerIos.get(0).getDomAttribute("label").toUpperCase();
                    if (actualPlayerName.equalsIgnoreCase(expectedPlayerName)) {
                        break;
                    }
                }
//                else {
//                    swipeWithCoordinates(363, 386, 195, 386, 200, "left", driver);
//                }
            }
            ExtentsReportManager.extentReportLogging("pass", "Selects favorite player: "+expectedPlayerName);
            return actualPlayerName;
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
            throw e;
        }

    }

    public boolean validatesBenefitsCardsInScreenFourIsDisplayed() {
        try {
            AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "BACK TO TOP");
            if (onboardingPageLocators.myUnitedBenefitsCardsScreenFour.isDisplayed() && onboardingPageLocators.backToTopScreenFour.isDisplayed())
                ExtentsReportManager.extentReportLogging("pass", "Returns myUnited BenefitsCards ScreenFour Text");
            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
            return true;
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-validatesBenefitsCardsInScreenFourIsDisplayed()<br />" + e);
            throw e;
        }
    }

    public boolean validatesBenefitsCardsInScreenFourIsDisplayedIos() {
        try {
            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
            if (onboardingPageLocators.myUnitedBenefitsCardsScreenFour.isDisplayed() && onboardingPageLocators.backToTopScreenFour.isDisplayed())
                ExtentsReportManager.extentReportLogging("pass", "Returns myUnited BenefitsCards ScreenFour Text");
            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.UP, 0.7);
            return true;
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-validatesBenefitsCardsInScreenFourIsDisplayed()<br />" + e);
            throw e;
        }
    }

    public void clicksOnLogInButtonInSignInPage() {
        try {
            elementToBeClickableFluentWait(onboardingPageLocators.loginBtnInSignINPage, 60);
            onboardingPageLocators.loginBtnInSignINPage.click();
            ExtentsReportManager.extentReportLogging("pass", "Clicks on confirm button");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-clickConfirmButton()<br />" + e);
            throw e;
        }

    }

    public String getLoginTextInLoginPage() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.loginTextLoginPage, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns login Text LoginPage");
                return onboardingPageLocators.loginTextLoginPage.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.loginTextLoginPage, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns login Text LoginPage");
                return onboardingPageLocators.loginTextLoginPage.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getLoginTextInLoginPage()<br />" + e);
            throw e;
        }
    }

    public String getDescInLoginPage() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.descLoginPage, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns desc Login Page Text");
                return onboardingPageLocators.descLoginPage.getText().trim();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.descLoginPage, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns desc Login Page Text");
                return onboardingPageLocators.descLoginPage.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getDescInLoginPage()<br />" + e);
            throw e;
        }
    }

    public String getCreateAccTextInSignInPage() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.createAccSignPageText, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns createAcc SignPage Text");
                return onboardingPageLocators.createAccSignPageText.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.createAccSignPageText, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns createAcc SignPage Text");
                return onboardingPageLocators.createAccSignPageText.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getCreateAccTextInSignInPage()<br />" + e);
            throw e;
        }
    }

    public String getDescInSignInPage() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(onboardingPageLocators.DescSignPageText, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns Desc SignPage Text ");
                return onboardingPageLocators.DescSignPageText.getText();
            } else {
                waitForVisibilityFluentWait(onboardingPageLocators.DescSignPageText, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns Desc SignPage Text ");
                return onboardingPageLocators.DescSignPageText.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-getDescInSignInPage()<br />" + e);
            throw e;
        }
    }
}
