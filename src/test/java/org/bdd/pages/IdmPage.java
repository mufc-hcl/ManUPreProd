package org.bdd.pages;

import static org.bdd.utils.AndroidGenericLibrary.switchToNativeView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.ExplorePageLocators;
import org.bdd.locators.IdmPageLocators;
import org.bdd.utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class IdmPage extends Common {
//    private AppiumDriver driver;
    private WebDriver dr;
    private static final Logger log= LogManager.getLogger(IdmPage.class);
    IdmPageLocators idmPageLocators;
    public IdmPage() {
    	this.idmPageLocators = new IdmPageLocators();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), idmPageLocators);
    }

  

    public void clicksOnLogInButton() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.loginButton,60);
            idmPageLocators.loginButton.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);
           throw e;
        }
    }

    public String getGooglePrivacyPoilcy() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.privacyPolicyText,60);
                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
                return idmPageLocators.privacyPolicyText.getText();
            } else {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibilityFluentWait(idmPageLocators.privacyPolicyText,60);
                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
                return idmPageLocators.privacyPolicyText.getDomAttribute("label");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);
           throw e;
        }
    }

    public void clicksOnSignForUnitedButton() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.signForUnitedButton,60);
            idmPageLocators.signForUnitedButton.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);throw e;
        }
    }

    public String getGooglePrivacyPolicyINCreateAnAccountScreen() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                switchToWebView();
//                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "Privacy Policy");
//                waitForVisibilityFluentWait(idmPageLocators.privacyPolicyText,60);
                waitForVisibilityFluentWait(idmPageLocators.privacyPolicyText1,60);
                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
                return idmPageLocators.privacyPolicyText1.getText();
            } else {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibilityFluentWait(idmPageLocators.privacyPolicyText,60);
                return idmPageLocators.privacyPolicyText.getText();
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);
           throw e;
        }

    }

    public void enterUsername(String username) throws Exception {
      String device = GlobalParams.getPlatformName();
        try {
            if(device.equalsIgnoreCase("android")) {
//            elementToBeClickableFluentWait(idmPageLocators.emailTextBox);
                waitForVisibilityFluentWait(idmPageLocators.emailTextBox,60);
                idmPageLocators.emailTextBox.sendKeys(username);
                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
            }else{
                Thread.sleep(1000);
                elementToBeClickableFluentWait(idmPageLocators.emailTextBox,60);
                waitForVisibilityFluentWait(idmPageLocators.emailTextBox,60);
                idmPageLocators.emailTextBox.sendKeys(username);
                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
            }

        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterUsername()<br />" + e);
           throw e;

        }
    }

    public void enterPassword(String password) {
        try {
            waitForVisibilityFluentWait(idmPageLocators.passwordTextBox,60);
            idmPageLocators.passwordTextBox.sendKeys(password);
            AndroidGenericLibrary.hideKeyBoard(driver);
            ExtentsReportManager.extentReportLogging("pass","Enters Password");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterPassword()<br />" + e);
           throw e;

        }
    }

    public void enterPasswordInIos(String password) {
        try {
            waitForVisibilityFluentWait(idmPageLocators.passwordTextBox,60);
            idmPageLocators.passwordTextBox.sendKeys(password);
            ExtentsReportManager.extentReportLogging("pass","Enters Password");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterPasswordInIos()<br />" + e);
           throw e;

        }
    }

    public void clicksOnLoginButtonInLoginScreen() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.loginButtonLoginScreen,60);
            idmPageLocators.loginButtonLoginScreen.click();
            switchToNativeView(((AndroidDriver) driver));
            new MyUnitedPage().clicksContinueInMUAppPopup();
            ExtentsReportManager.extentReportLogging("pass","Clicks on loginButtonLoginScreen ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnLoginButtonInLoginScreen()<br />" + e);
           throw e;
        }
    }

    public void clicksOnLoginButtonInLoginScreenInIos() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.loginButtonLoginScreen,60);
            idmPageLocators.loginButtonLoginScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on loginButtonLoginScreen ");
//			AndroidGenericLibrary.switchToNativeViewIos(((IOSDriver) driver));
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnLoginButtonInLoginScreenInIos()<br />" + e);
           throw e;
        }
    }

    public void clicksOnCloseFromNotification() {
        try {
            if (idmPageLocators.closeButtonLevelNotification.isDisplayed()) {
//                elementToBeClickableFluentWait(idmPageLocators.closeButtonLevelNotification);
            	idmPageLocators.closeButtonLevelNotification.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on closeButtonLevelNotification ");
            }
        } catch (NoSuchElementException ns) {
            System.out.println("element is not displayed hence skipped");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnCloseFromNotification()<br />" + e);
           throw e;
        }
    }

    public String getDailyStreaksText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.dailyStreaksText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns dailyStreaksText Text ");
                return idmPageLocators.dailyStreaksText.getText();
            } else {
                waitForVisibilityFluentWait(idmPageLocators.dailyStreaksText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns dailyStreaksText Text ");
                return idmPageLocators.dailyStreaksText.getDomAttribute("label");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getDailyStreaksText()<br />" + e);
           throw e;
        }
    }

    public String getTotalScoreText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.totalScoreText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns totalScoreText Text ");
                return idmPageLocators.totalScoreText.getText();
            } else {
                waitForVisibilityFluentWait(idmPageLocators.totalScoreText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns totalScoreText Text ");
                return idmPageLocators.totalScoreText.getDomAttribute("label");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTotalScoreText()<br />" + e);
           throw e;
        }
    }

    public String getAppearanceText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.AppearanceText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns AppearanceText Text ");
                return idmPageLocators.AppearanceText.getText();
            } else {
                waitForVisibilityFluentWait(idmPageLocators.AppearanceText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns AppearanceText Text ");
                return idmPageLocators.AppearanceText.getDomAttribute("label");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getAppearanceText()<br />" + e);
           throw e;
        }
    }

    public void switchToWebView() {
        AndroidGenericLibrary.switchToWebViewContext((AndroidDriver) driver);
    }


    public void clicksOnMyProfileIcon() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.myProfileIconSettingPage,60);
            idmPageLocators.myProfileIconSettingPage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on myProfileIconSettingPage ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnMyProfileIcon()<br />" + e);
           throw e;
        }
    }

    public void clicksOnLogoutIcon() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.LogoutIconMyProfilePage,60);
            idmPageLocators.LogoutIconMyProfilePage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on LogoutIconMyProfilePage ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnLogoutIcon()<br />" + e);
           throw e;
        }
    }

    public void selectsYesFromTheWantToLogoutAlertBox() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.yesIconLogoutAlertBox,60);
            idmPageLocators.yesIconLogoutAlertBox.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on yesIconLogoutAlertBox ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-selectsYesFromTheWantToLogoutAlertBox()<br />" + e);
           throw e;
        }
    }

    public String getSignForUnitedText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.signForUnitedButton,60);
            ExtentsReportManager.extentReportLogging("pass","Returns signForUnitedButton Text ");
            return idmPageLocators.signForUnitedButton.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getSignForUnitedText()<br />" + e);
           throw e;
        }
    }

    public String getLoginText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.loginButton,60);
            ExtentsReportManager.extentReportLogging("pass","Returns loginButton Text ");
            return idmPageLocators.loginButton.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getLoginText()<br />" + e);
           throw e;
        }
    }

    public String getLevelText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.fanLevelText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns fanLevelText  Text ");
                return idmPageLocators.fanLevelText.getText();
            } else {
                waitForVisibilityFluentWait(idmPageLocators.fanLevelText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns fanLevelText Text ");
                return idmPageLocators.fanLevelText.getDomAttribute("label");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getLevelText()<br />" + e);
           throw e;
        }
    }

    public boolean checkGivenDataDisplayedInMyProfileScreen() {
        try {
            if (idmPageLocators.editProfileMyProfilePage.isDisplayed() && idmPageLocators.changePasswordMyProfilePage.isDisplayed()
                    && idmPageLocators.changeEmailAddressMyProfilePage.isDisplayed() && idmPageLocators.preferenceCentreMyProfilePage.isDisplayed()
                    && idmPageLocators.LogoutIconMyProfilePage.isDisplayed())
                ExtentsReportManager.extentReportLogging("pass","Returns MyProfileScreen  Text ");
                return true;
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-checkGivenDataDisplayedInMyProfileScreen()<br />" + e);
           throw e;
        }
    }

    public void clicksOnEditProfileButton() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.editProfileMyProfilePage,60);
            idmPageLocators.editProfileMyProfilePage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on EditProfile ");
            idmPageLocators.editProfilePageHeadingMyProfilePage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on EditProfile ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);throw e;
        }
    }

    public boolean validatesTheFirstnameSurnameEmailDobIsDisplayedAndNotEditableInEditProfileScreen() throws Exception {
        try {
            Thread.sleep(10000);
           // System.out.println(driver.findElement(AppiumBy.id("FirstName")).isDisplayed());
//            waitForVisibilityFluentWait(idmPageLocators.firstNameEditProfilePage);
//            System.out.println(firstNameEditProfilePage.isDisplayed());
//            if (firstNameEditProfilePage.isEnabled() && surNameEditProfilePage.isEnabled() &&
//                    emailEditProfilePage.isEnabled() && dayOfBirthEditProfilePage.isEnabled() &&
//                    monthOfBirthEditProfilePage.isEnabled() && yearOfBirthEditProfilePage.isEnabled())
            return true;
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-validatesTheFirstnameSurnameEmailDobIsDisplayedAndNotEditableInEditProfileScreen()<br />" + e);
           throw e;
        }
//        return false;
    }

    public void enterAddressLineOne(String addr1) {
        AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "Address Line One");
        try {
            waitForVisibilityFluentWait(idmPageLocators.addressLineOneEditProfilePage,60);
            idmPageLocators.addressLineOneEditProfilePage.clear();
            idmPageLocators.addressLineOneEditProfilePage.sendKeys(addr1);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineOneEditProfilePage");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineOne()<br />" + e);
           throw e;

        }
    }

    public void enterAddressLinetwo(String addr2) {
        try {
            waitForVisibilityFluentWait(idmPageLocators.addressLineTwoEditProfilePage,60);
            idmPageLocators.addressLineTwoEditProfilePage.clear();
            idmPageLocators.addressLineTwoEditProfilePage.sendKeys(addr2);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineTwoEditProfilePage");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLinetwo()<br />" + e);
           throw e;

        }
    }

    public void enterAddressLineThree(String addr3) {
        try {
            waitForVisibilityFluentWait(idmPageLocators.addressLineThreeEditProfilePage,60);
            idmPageLocators.addressLineThreeEditProfilePage.clear();
            idmPageLocators.addressLineThreeEditProfilePage.sendKeys(addr3);
            ExtentsReportManager.extentReportLogging("pass","Enters addressLineThreeEditProfilePage");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineThree()<br />" + e);
           throw e;

        }
    }

    public void enterAddressLineTown(String town) {
        try {
            waitForVisibilityFluentWait(idmPageLocators.townEditProfilePage,60);
            idmPageLocators.townEditProfilePage.clear();
            idmPageLocators.townEditProfilePage.sendKeys(town);
            ExtentsReportManager.extentReportLogging("pass","Enters townEditProfilePage");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-enterAddressLineTown()<br />" + e);
           throw e;

        }
    }

    public void selectCountry(String country) {
        try {
            elementToBeClickableFluentWait(idmPageLocators.countryEditProfilePage,60);
            idmPageLocators.countryEditProfilePage.click();
            AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, country);
            driver.findElement(
                            By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"" + country
                                    + "\"]"))
                    .click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on countryEditProfilePage ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-selectCountry()<br />" + e);
           throw e;

        }
    }

    public void clicksSaveDetailsInEditProfileScreen() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.saveDetailsEditProfilePage,60);
            idmPageLocators.saveDetailsEditProfilePage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on saveDetailsEditProfilePage ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksSaveDetailsInEditProfileScreen()<br />" + e);
           throw e;
        }
    }

    public String getSuccessMessage() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.successMessageEditProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns successMessageEditProfilePage  Text ");
            return idmPageLocators.successMessageEditProfilePage.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getSuccessMessage()<br />" + e);
           throw e;
        }
    }

    public String getAddr1Text() {
        try {
            AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "Address Line One");
            waitForVisibilityFluentWait(idmPageLocators.addressLineOneEditProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns addressLineOneEditProfilePage  Text ");
            return idmPageLocators.addressLineOneEditProfilePage.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getAddr1Text()<br />" + e);
           throw e;
        }
    }

    public String getAddr2Text() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.addressLineTwoEditProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns addressLineTwoEditProfilePage  Text ");
            return idmPageLocators.addressLineTwoEditProfilePage.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getAddr2Text()<br />" + e);
           throw e;
        }
    }

    public String getAddr3Text() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.addressLineThreeEditProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns addressLineThreeEditProfilePage  Text ");
            return idmPageLocators.addressLineThreeEditProfilePage.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getAddr3Text()<br />" + e);
           throw e;
        }
    }

    public String getTownText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.townEditProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns townEditProfilePage  Text ");
            return idmPageLocators.townEditProfilePage.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getTownText()<br />" + e);
           throw e;
        }
    }

    public String getCountryText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.countryEditProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
            return idmPageLocators.countryEditProfilePage.getText();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);
           throw e;
        }
    }

    public void clicksOnAccountDeletionAndClicksCloseIconInDeletionScreen() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.accountDeletionMyProfilePage,60);
            idmPageLocators.accountDeletionMyProfilePage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on accountDeletionMyProfilePage ");
            elementToBeClickableFluentWait(idmPageLocators.closeIconAccountDeletionPage,60);
            idmPageLocators.closeIconAccountDeletionPage.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on closeIconAccountDeletionPage ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnAccountDeletionAndClicksCloseIconInDeletionScreen()<br />" + e);
           throw e;
        }

    }

    public void clicksOnContinueButton() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.continuButtonLoginIos,60);
            idmPageLocators.continuButtonLoginIos.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on continuButtonLoginIos ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnContinueButton()<br />" + e);
           throw e;
        }

    }

    public String getEditProfileText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.editProfileMyProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns editProfileMyProfilePage Text ");
            return idmPageLocators.editProfileMyProfilePage.getDomAttribute("label");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getEditProfileText()<br />" + e);
           throw e;
        }
    }

    public String getChangePasswordText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.changePasswordMyProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns changePasswordMyProfilePage Text ");
            return idmPageLocators.changePasswordMyProfilePage.getDomAttribute("label");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnContactUs()<br />" + e);
           throw e;
        }
    }

    public String getChangeEmailText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.changeEmailAddressMyProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns changeEmailAddressMyProfilePage Text ");
            return idmPageLocators.changeEmailAddressMyProfilePage.getDomAttribute("label");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getChangeEmailText()<br />" + e);
           throw e;
        }
    }

    public String getPreferenceText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.preferenceCentreMyProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns preferenceCentreMyProfilePage Text ");
            return idmPageLocators.preferenceCentreMyProfilePage.getDomAttribute("label");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getPreferenceText()<br />" + e);
           throw e;
        }
    }

    public String getLogoutText() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.LogoutIconMyProfilePage,60);
            ExtentsReportManager.extentReportLogging("pass","Clicks on LogoutIconMyProfilePage ");
            return idmPageLocators.LogoutIconMyProfilePage.getDomAttribute("label");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-getLogoutText()<br />" + e);
           throw e;
        }
    }

    public void clicksOnSignInWithGoogleButton() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.signInWithGoogleButton,60);
            idmPageLocators.signInWithGoogleButton.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on signInWithGoogleButton ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnSignInWithGoogleButton()<br />" + e);
           throw e;
        }
    }

    public void entersTheValidEmailInGoogleScreen(String username) {

      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                elementToBeClickableFluentWait(idmPageLocators.emailPhoneTextFieldSignInScreen,60);
                idmPageLocators.emailPhoneTextFieldSignInScreen.sendKeys(username);
                AndroidGenericLibrary.hideKeyBoard(driver);

            } else {
                elementToBeClickableFluentWait(idmPageLocators.emailPhoneTextFieldSignInScreen,60);
                idmPageLocators.emailPhoneTextFieldSignInScreen.click();
                idmPageLocators.emailPhoneTextFieldSignInScreen.sendKeys(username);
                idmPageLocators.doneButtonKeyBoard.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on doneButtonKeyBoard ");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-entersTheValidEmailInGoogleScreen()<br />" + e);
           throw e;
        }
    }

    public void clickNextButtonSignInScreen() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.nextButtonSignInScreen,60);
            idmPageLocators.nextButtonSignInScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on nextButtonSignInScreen ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickNextButtonSignInScreen()<br />" + e);
           throw e;
        }
    }

    public void entersTheValidPasswordInGoogleScreen(String password) throws Exception {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                Thread.sleep(5000);
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.M));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.N));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.U));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.S));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.O));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.C));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.I));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.A));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.L));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.AT));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
            } else {
                elementToBeClickableFluentWait(idmPageLocators.passwordTextFieldSignInScreen,60);
                idmPageLocators.passwordTextFieldSignInScreen.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on loginButton ");
                idmPageLocators.passwordTextFieldSignInScreen.sendKeys("manuscocial@1234");
                idmPageLocators.doneButtonKeyBoard.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on doneButtonKeyBoard ");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-entersTheValidPasswordInGoogleScreen()<br />" + e);
           throw e;

        }

    }

    public void clickNextButtonPasswordSignInScreen() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.nextButtonPasswordSignInScreen,60);
            idmPageLocators.nextButtonPasswordSignInScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on nextButtonPasswordSignInScreen ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickNextButtonPasswordSignInScreen()<br />" + e);
           throw e;
        }
    }

    public void clickOnAdvancedButton() throws Exception {
        try {
            elementToBeClickableFluentWait(idmPageLocators.advancedButtonSignInScreen,60);
            idmPageLocators.advancedButtonSignInScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on advancedButtonSignInScreen ");
            Thread.sleep(2000);
            elementToBeClickableFluentWait(idmPageLocators.proceedLinkSignInScreen,60);
            idmPageLocators.proceedLinkSignInScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on proceedLinkSignInScreen ");

        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clickOnAdvancedButton()<br />" + e);
           throw e;
        }
    }

    public void clicksOnContinueAlert() throws Exception {
        try {
            switchToNativeView(((AndroidDriver) driver));
            Thread.sleep(2000);
            elementToBeClickableFluentWait(idmPageLocators.continueButtonGoogleLogin,60);
            idmPageLocators.closeButtonGoogleLogin.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on closeButtonGoogleLogin ");
            new MyUnitedPage().clicksContinueInMUAppPopup();
            clicksOnLogInButton();
            clicksOnSignInWithGoogleButton();

        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnContinueAlert()<br />" + e);
           throw e;
        }
    }

    public boolean validatesChangePasswordAnEmailIsNotDisplayed() {
        try {
            if (idmPageLocators.editProfileMyProfilePage.isDisplayed() && idmPageLocators.changePasswordMyProfilePage1.isEmpty()
                    && idmPageLocators.changeEmailAddressMyProfilePage1.isEmpty() && idmPageLocators.preferenceCentreMyProfilePage.isDisplayed()
                    && idmPageLocators.LogoutIconMyProfilePage.isDisplayed())
            	ExtentsReportManager.extentReportLogging("pass","Returns ChangePasswordAnEmail Text ");
                return true;
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-validatesChangePasswordAnEmailIsNotDisplayed()<br />" + e);
           throw e;
        }
    }

    public void clicksOnShowDetailsInIos() throws Exception {
        try {
            elementToBeClickableFluentWait(idmPageLocators.showDetailsLink,60);
            idmPageLocators.showDetailsLink.click();
            elementToBeClickableFluentWait(idmPageLocators.visitThisWebsiteLink,60);
            idmPageLocators.visitThisWebsiteLink.click();
            elementToBeClickableFluentWait(idmPageLocators.visitWebsiteButton,60);
            idmPageLocators.visitWebsiteButton.click();
            elementToBeClickableFluentWait(idmPageLocators.backButtonPrivateLink,60);
            idmPageLocators.backButtonPrivateLink.click();
            Thread.sleep(5000);
            ExtentsReportManager.extentReportLogging("pass","Clicks on ShowDetailsInIos ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnShowDetailsInIos()<br />" + e);
           throw e;
        }
    }


    public int validatesThreeScreensOnlyDisplayed() {
        try {
            waitForVisibilityFluentWait(idmPageLocators.screenCount.get(0),60);
            ExtentsReportManager.extentReportLogging("pass","Returns screenCount  Text ");
            return idmPageLocators.screenCount.size();
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-validatesThreeScreensOnlyDisplayed()<br />" + e);
           throw e;
        }
    }

    public void entersTheFollowingDetailsInSigninPage(DataTable table) {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	waitForVisibilityFluentWait(idmPageLocators.firstName,60);
                idmPageLocators.firstName.sendKeys(table.cell(1, 0));
                idmPageLocators.surName.sendKeys(table.cell(1, 1));
                idmPageLocators.email.sendKeys(table.cell(1, 2));
                idmPageLocators.password.sendKeys(table.cell(1, 3));
                idmPageLocators.confirmPassword.sendKeys(table.cell(1, 4));
                new Select(idmPageLocators.dayOfBirth).selectByVisibleText(table.cell(1, 5));
                new Select(idmPageLocators.monthOfBirth).selectByVisibleText(table.cell(1, 6));
                new Select(idmPageLocators.yearOfBirth).selectByVisibleText(table.cell(1, 7));
                new Select(idmPageLocators.country).selectByVisibleText(table.cell(1, 8));
            } else {
                waitForVisibilityFluentWait(idmPageLocators.firstName,60);
                idmPageLocators.firstName.sendKeys(table.cell(1, 0));
                idmPageLocators.doneButtonKeyBoard.click();
                idmPageLocators.surName.sendKeys(table.cell(1, 1));
                idmPageLocators.doneButtonKeyBoard.click();
                idmPageLocators.email.sendKeys(table.cell(1, 2));
                idmPageLocators.doneButtonKeyBoard.click();
                idmPageLocators.password.sendKeys(table.cell(1, 3));
                idmPageLocators.doneButtonKeyBoard.click();
                idmPageLocators.confirmPassword.sendKeys(table.cell(1, 4));
                idmPageLocators.doneButtonKeyBoard.click();

                idmPageLocators.dayOfBirth.click();
                driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=" + table.cell(1, 5) + "]")).click();
                idmPageLocators.monthOfBirth.click();
                driver.findElement(AppiumBy.accessibilityId(table.cell(1, 6))).click();
                idmPageLocators.yearOfBirth.click();
                driver.findElement(AppiumBy.accessibilityId(table.cell(1, 7))).click();
                idmPageLocators.country.click();
                driver.findElement(AppiumBy.accessibilityId(table.cell(1, 8))).click();
                ExtentsReportManager.extentReportLogging("pass","Enters The Following Details In SigninPage ");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-entersTheFollowingDetailsInSigninPage()<br />" + e);
           throw e;
        }
    }

    public void entersTheFollowingParentsDetailsInSigninPage(DataTable table) {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                new Select(idmPageLocators.relationship).selectByVisibleText(table.cell(1, 0));
                idmPageLocators.parentFirstName.sendKeys(table.cell(1, 1));
                idmPageLocators.parentSurName.sendKeys(table.cell(1, 2));
                idmPageLocators.parentEmail.sendKeys(table.cell(1, 3));
            } else {
                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
//                relationship.click();
//                driver.findElement(AppiumBy.accessibilityId(table.cell(1, 0))).click();
                idmPageLocators.parentFirstName.sendKeys(table.cell(1, 1));
                idmPageLocators.parentSurName.sendKeys(table.cell(1, 2));
                idmPageLocators.parentEmail.sendKeys(table.cell(1, 3));
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-entersTheFollowingParentsDetailsInSigninPage()<br />" + e);
           throw e;
        }
    }

    public void clicksOnForgetPasswordLink() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.forgetPassword,60);
            idmPageLocators.forgetPassword.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on forgetPassword ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnForgetPasswordLink()<br />" + e);
           throw e;
        }
    }

    public void entersTheFollowingDetailsInForgetPasswordScreen(DataTable table) {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.clientReferenceEmail,60);
                idmPageLocators.clientReferenceEmail.sendKeys(table.cell(1, 0));
                new Select(idmPageLocators.dayOfBirth).selectByVisibleText(table.cell(1, 1));
                new Select(idmPageLocators.monthOfBirth).selectByVisibleText(table.cell(1, 2));
                new Select(idmPageLocators.yearOfBirth).selectByVisibleText(table.cell(1, 3));
            } else {
                waitForVisibilityFluentWait(idmPageLocators.clientReferenceEmail,60);
                idmPageLocators.clientReferenceEmail.sendKeys(table.cell(1, 0));
                idmPageLocators.dayOfBirth.click();
                driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=" + table.cell(1, 1) + "]")).click();
                idmPageLocators.monthOfBirth.click();
                driver.findElement(AppiumBy.accessibilityId(table.cell(1, 2))).click();
                idmPageLocators.yearOfBirth.click();
                driver.findElement(AppiumBy.accessibilityId(table.cell(1, 3))).click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on clientReferenceEmail ");
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-entersTheFollowingDetailsInForgetPasswordScreen()<br />" + e);
           throw e;
        }
    }

    public void clicksOnChangeEmailAddressInMyProfileScreen() {
        try {
            elementToBeClickableFluentWait(idmPageLocators.changeEmailAddress,60);
            idmPageLocators.changeEmailAddress.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on changeEmailAddress ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnChangeEmailAddressInMyProfileScreen()<br />" + e);
           throw e;
        }
    }

    public void entersTheFollowingDetailsInTheChangeEmailAddressScreen(DataTable table) {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.newEmailAddress,60);
                idmPageLocators.newEmailAddress.sendKeys(table.cell(1, 0));
                idmPageLocators.confirmNewEmailAddress.sendKeys(table.cell(1, 1));
                idmPageLocators.password.sendKeys(table.cell(1, 2));

            } else {
                waitForVisibilityFluentWait(idmPageLocators.newEmailAddress,120);
                idmPageLocators.newEmailAddress.sendKeys(table.cell(1, 0));
                idmPageLocators.confirmNewEmailAddress.sendKeys(table.cell(1, 1));
                idmPageLocators.password1.sendKeys(table.cell(1, 2));
            }
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-entersTheFollowingDetailsInTheChangeEmailAddressScreen()<br />" + e);
           throw e;
        }
    }
    public void clicksOnLogInButtonInSubscribePage() {
    	try {
    		if (!idmPageLocators.loginButtonSubscribePage.isEmpty())
    		    idmPageLocators.loginButtonSubscribePage.get(0).click();
    		if (!idmPageLocators.loginButtonRegisterPage.isEmpty())
        		idmPageLocators.loginButtonRegisterPage.get(0).click();
            ExtentsReportManager.extentReportLogging("pass","Returning makeYourPredictions text ");
        } catch (Exception e) {
           ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnLogInButtonInSubscribePage()<br />" + e);
           throw e;
        }
    }
	public List<String> getTextForContentOfMyProfile() {
		String device = GlobalParams.getPlatformName();
		ArrayList<String> myProfileContentUI = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
			waitForVisibilityFluentWait(idmPageLocators.myProfileContent.get(0), 60);
			for (int i = 0; i < idmPageLocators.myProfileContent.size(); i++) {
				myProfileContentUI.add(idmPageLocators.myProfileContent.get(i).getText().toUpperCase());
			}
			}else {
				waitForVisibilityFluentWait(idmPageLocators.myProfileContent.get(0), 60);
				for (int i = 0; i < idmPageLocators.myProfileContent.size(); i++) {
					myProfileContentUI.add(idmPageLocators.myProfileContent.get(i).getDomAttribute("label").toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns the my profile content in My United list");
			}
			return myProfileContentUI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getTextForContentOfMyProfile()<br />" + e);
			throw e;
		}
	}



	public String getTextForDailyStreaks() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.dailStreaksIDM, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 4");
                return idmPageLocators.dailStreaksIDM.getText();
            } else {
                waitForVisibilityFluentWait(idmPageLocators.dailStreaksIDM, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 4 ");
                return idmPageLocators.dailStreaksIDM.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextForDailyStreaks()<br />" + e);
            throw e;
        }
	}



	public String getTextForAppearences() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(idmPageLocators.appearencesIDM, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 4");
                return idmPageLocators.appearencesIDM.getText();
            } else {
                waitForVisibilityFluentWait(idmPageLocators.appearencesIDM, 60);
                ExtentsReportManager.extentReportLogging("pass", "Returns welcome text in screen 4 ");
                return idmPageLocators.appearencesIDM.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextForAppearences()<br />" + e);
            throw e;
        }
	}
		
	
			}
	
