package org.bdd.stepdef.android;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.bdd.pages.IdmPage;
import org.bdd.utils.AppiumDriverManager;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.GlobalParams;
import org.bdd.utils.PropertyFileManager;
import org.bdd.utils.apiResponse.IdmAPIResponse;
import org.bdd.utils.apiResponse.OnboardingAPIResponse;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class IdmAndroidStepDef {
    public SoftAssert soft = new SoftAssert();
    public IdmPage idmPage = new IdmPage();
    public IdmAPIResponse idmAPIResponse = new IdmAPIResponse();

    @And("user clicks on log in button")
    public void userClicksOnLogInButton() {
        try {
            idmPage.clicksOnLogInButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on log in button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on login button<br />" + e);
            throw e;
        }
    }

    @Then("user validates the google privacy policy in login screen")
    public void userValidatesTheGooglePrivacyPolicyInLoginScreen() {
        try {
            String actualPrivacyPoicyText = idmPage.getGooglePrivacyPoilcy();
            soft.assertEquals(actualPrivacyPoicyText, "Privacy Policy");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the google privacy policy in login screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the google privacy policy in login screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks on sign for united button")
    public void userClicksOnSignForUnitedButton() {
        try {
            idmPage.clicksOnSignForUnitedButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on sign in for united button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking sign in for united button<br />" + e);
            throw e;
        }
    }

    @Then("user validates the google privacy policy in Sign Up screen")
    public void userValidatesTheGooglePrivacyPolicyInSignUpScreen() {
        try {
            String actualPrivacyPoicyText = idmPage.getGooglePrivacyPolicyINCreateAnAccountScreen();
            soft.assertEquals(actualPrivacyPoicyText, "Privacy Policy");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the google privacy policy in sign up screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the google privacy policy in sign up screen <br />" + e);
            throw e;
        }
    }

    @And("user enter the valid email {string} and valid password {string}")
    public void userEnterTheValidEmailAndValidPassword(String username, String password) throws Exception {
        try {
            idmPage.switchToWebView();
            idmPage.enterUsername(username);
            idmPage.enterPassword(password);
            ExtentsReportManager.extentReportLogging("info", "Entered the valid username and password");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering valid username and password<br />" + e);
            throw e;
        }
    }

    @And("user clicks on login button in login screen")
    public void userClicksOnLoginButtonInLoginScreen() {
        try {
            idmPage.clicksOnLoginButtonInLoginScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on login button in login screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking login button in login screen<br />" + e);
            throw e;
        }
    }

    @Then("user navigated to my united screen and validates the following text using Api")
    public void userNavigatedToMyUnitedScreenAndValidatesTheFollowingText() throws Exception {
		  try {
		  String dailyStreaksFromAPI =idmAPIResponse.getdailyStreaksFromAPI("DailyStreaks/AppearencesEndpoint");
		  String actualdailyStreaks = idmPage.getTextForDailyStreaks();
		  soft.assertEquals(actualdailyStreaks.toUpperCase(),dailyStreaksFromAPI.toUpperCase());
		  
		  String appearencesFromAPI =idmAPIResponse.getappearencesFromAPI("DailyStreaks/AppearencesEndpoint");
		  String actualAppearences = idmPage.getTextForAppearences();
		  soft.assertEquals(actualAppearences.toUpperCase(),appearencesFromAPI.toUpperCase());
		  
		  soft.assertAll(); 
		  ExtentsReportManager.extentReportLogging("info","navigates to my united screen and validates the following text"); } 
		  catch(AssertionError e) 
		  { 
			  ExtentsReportManager.extentReportLogging("fail","Error in navigating to my united screen and validates the following text<br />" + e); 
			  throw e;
			  }
//		 
//    	
//        try {
//            String expectedDailyStreaks = table.cell(1, 0);
//            String expectedTotalScore = table.cell(1, 1);
//            String expectedAppearances = table.cell(1, 2);
//
//            String actualDailyStreaks = idmPage.getDailyStreaksText();
//            String actualTotalScore = idmPage.getTotalScoreText();
//            String actualAppearances = idmPage.getAppearanceText();
//            soft.assertEquals(actualDailyStreaks, expectedDailyStreaks);
//            soft.assertEquals(actualTotalScore, expectedTotalScore);
//            soft.assertEquals(actualAppearances, expectedAppearances);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Navigated to my united screen and validated the text");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to my united screen and validating the text<br />" + e);
//            throw e;
//        }

    }

    @And("user clicks on close from notification")
    public void userClicksOnCloseFromNotification() {
        try {
            idmPage.clicksOnCloseFromNotification();
            ExtentsReportManager.extentReportLogging("info", "Clicked on close from notification");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking the close from notification<br />" + e);
            throw e;
        }
    }

    @And("user clicks on My profile icon")
    public void userClicksOnMyProfileIcon() {
        try {
            idmPage.clicksOnMyProfileIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on my profile icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking my profile icon<br />" + e);
            throw e;
        }
    }

    @And("user clicks on Logout icon")
    public void userClicksOnLogoutIcon() {
        try {
            idmPage.clicksOnLogoutIcon();
            ExtentsReportManager.extentReportLogging("info", "CLicked on logout icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking logout icon<br />" + e);
            throw e;
        }
    }

    @And("user selects yes from the want to logout alert box")
    public void userSelectsYesFromTheWantToLogoutAlertBox() {
        try {
            idmPage.selectsYesFromTheWantToLogoutAlertBox();
            ExtentsReportManager.extentReportLogging("info", "Selected yes from logout alert box");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting yes from logout alert box <br />" + e);
            throw e;
        }
    }

    @Then("user is navigated to my unites screen and validates the following")
    public void userIsNavigatedToMyUnitesScreenAndValidatesTheFollowing(DataTable table) {
        try {
            String expectedSignForUnited = table.cell(1, 0);
//        String expectedLogin = table.cell(1, 1);

            String actualSignForUnited = idmPage.getSignForUnitedText();
//        String actualLogin = idmPage.getLoginText();
            soft.assertEquals(actualSignForUnited, expectedSignForUnited);
//        soft.assertEquals(actualLogin, expectedLogin);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Navigated to my united screen and validated the text");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to my united screen and validating the text <br />" + e);
            throw e;
        }
    }

    @Then("user validates the following in my profile screen using Api")
    public void userValidatesTheFollowingInMyProfileScreen() throws Exception {
        try {
            ArrayList<String> myProfileContentMyUnitedAPI = new ArrayList<>();
            myProfileContentMyUnitedAPI = idmAPIResponse.getContentOfMyProfileFromAPIScFourApi("MyProfileContent");
            List<String> actualmyProfileContentMyUnited = idmPage.getTextForContentOfMyProfile();

            ExtentsReportManager.extentReportLogging("info", "myProfileContentMyUnited++++++" + myProfileContentMyUnitedAPI);
            ExtentsReportManager.extentReportLogging("info", "actualmyProfileContentMyUnited++++++" + idmPage.getTextForContentOfMyProfile());

            soft.assertEquals(actualmyProfileContentMyUnited, myProfileContentMyUnitedAPI);

            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the details in my profile screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the details in my profile screen<br />" + e);
            throw e;
        }
    }


//        try {
//            boolean flag = idmPage.checkGivenDataDisplayedInMyProfileScreen();
//            soft.assertTrue(flag);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated the details in my profile screen");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating the details in my profile screen<br />" + e);
//            throw e;
//        }
//    }

    @And("user clicks on edit profile button")
    public void userClicksOnEditProfileButton() {
        try {
            idmPage.clicksOnEditProfileButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on edit profile button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on edit profile button<br />" + e);
            throw e;
        }
    }

    @Then("user validates the firstname,surname,email,dob is displayed and not editable in edit profile screen")
    public void userValidatesTheFirstnameSurnameEmailDobIsDisplayedAndNotEditableInEditProfileScreen() throws Exception {
        try {
            idmPage.switchToWebView();
            boolean flag = idmPage.validatesTheFirstnameSurnameEmailDobIsDisplayedAndNotEditableInEditProfileScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the details in edit profile screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validing the details in edit profile screen<br />" + e);
            throw e;
        }
    }

    @And("user changes the following textbox in edit profile screen")
    public void userChangesTheFollowingTextboxInEditProfileScreen(DataTable table) {
        try {
            idmPage.enterAddressLineOne(table.cell(1, 0));
            idmPage.enterAddressLinetwo(table.cell(1, 1));
            idmPage.enterAddressLineThree(table.cell(1, 2));
            idmPage.enterAddressLineTown(table.cell(1, 3));
            idmPage.selectCountry(table.cell(1, 4));
            ExtentsReportManager.extentReportLogging("info", "Changed the textbox in edit profile screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in changing the textbox in edit profile screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks save details in edit profile screen")
    public void userClicksSaveDetailsInEditProfileScreen() {
        try {
            idmPage.clicksSaveDetailsInEditProfileScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked save details in edit profile screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking save details in edit profile screen<br />" + e);
            throw e;
        }
    }

    @Then("user verify the success message and validates the given data in edit profile screen")
    public void userVerifyTheSuccessMessageAndValidatesTheGivenDataInEditProfileScreen(DataTable table) {
        try {
            idmPage.switchToWebView();
            String expectedSuccessMessage = table.cell(1, 0);
            String expectedAddr1 = table.cell(1, 1);
            String expectedAddr2 = table.cell(1, 2);
            String expectedAddr3 = table.cell(1, 3);
            String expectedTown = table.cell(1, 4);
            String expectedCountry = table.cell(1, 5);

            String actualSuccessMessage = idmPage.getSuccessMessage();
            String actualAddr1 = idmPage.getAddr1Text();
            String actualAddr2 = idmPage.getAddr2Text();
            String actualAddr3 = idmPage.getAddr3Text();
            String actualTown = idmPage.getTownText();
            String actualCountry = idmPage.getCountryText();

            soft.assertEquals(actualSuccessMessage, expectedSuccessMessage);
            soft.assertEquals(actualAddr1, expectedAddr1);
            soft.assertEquals(actualAddr2, expectedAddr2);
            soft.assertEquals(actualAddr3, expectedAddr3);
            soft.assertEquals(actualTown, expectedTown);
            soft.assertEquals(actualCountry, expectedCountry);
            ExtentsReportManager.extentReportLogging("info", "Verified success message");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying success message<br />" + e);
            throw e;
        }

    }

    @And("user clicks on account deletion and clicks close icon in deletion screen")
    public void userClicksOnAccountDeletionAndClicksCloseIconInDeletionScreen() {
        try {
            idmPage.clicksOnAccountDeletionAndClicksCloseIconInDeletionScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on account deletion and clicked on close icon in deletion screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking account seletion and clicking on close icon in deletion screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks on sign in with google button")
    public void userClicksOnSignInWithGoogleButton() {
        try {
            idmPage.clicksOnSignInWithGoogleButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on sign in with google button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking sign in with google button <br />" + e);
            throw e;
        }
    }

    @And("user enters the valid email {string} and valid password {string} in google screen")
    public void userEntersTheValidEmailAndValidPasswordInGoogleScreen(String username, String password) throws Exception {
        try {
            idmPage.switchToWebView();
            idmPage.entersTheValidEmailInGoogleScreen(username);
            idmPage.clickNextButtonSignInScreen();
            idmPage.entersTheValidPasswordInGoogleScreen(password);
//        idmPage.clickNextButtonPasswordSignInScreen();
            idmPage.clickOnAdvancedButton();
            ExtentsReportManager.extentReportLogging("info", "Entered valid email and password in google screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering valid email and password in google screen <br />" + e);
            throw e;
        }

    }

    @And("user clicks on continue alert")
    public void userClicksOnContinueAlert() throws Exception {
        try {
            idmPage.clicksOnContinueAlert();
            ExtentsReportManager.extentReportLogging("info", "Clicked on continue alert ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking continue alert<br />" + e);
            throw e;
        }
    }

    @Then("user validates change password an email is not displayed")
    public void userValidatesChangePasswordAnEmailIsNotDisplayed() {
        try {
            boolean flag = idmPage.validatesChangePasswordAnEmailIsNotDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated change password  ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating change password<br />" + e);
            throw e;
        }
    }

    @And("user initiated the ios Session")
    public void userInitiatedTheIosSession() throws IOException {
        try {
        	 AppiumDriverManager driverManager = new AppiumDriverManager();
             if (driverManager.getAppiumDriver() != null) {
                 driverManager.getAppiumDriver().quit();
                 driverManager.setAppiumDriver(null);
             }
             Properties props = new PropertyFileManager().getProperties();
             GlobalParams.setPlatformName(props.getProperty("ios_platformName"));
             GlobalParams.setDeviceName(props.getProperty("ios_deviceName"));
             GlobalParams.setOsversion(props.getProperty("ios_os_version"));
            new AppiumDriverManager().initializeIosDriver();
            ExtentsReportManager.extentReportLogging("info", "Initiated the ios session");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in initiating the ios session<br />" + e);
            throw e;
        }
    }

    @And("user initiated the Android Session with os version less than Thirteen")
    public void userInitiatedTheAndroidSessionWithOsVersionLessThan() throws IOException {
        try {
            new AppiumDriverManager().initializeAndroidDriverVersionLessthanThirteen();
            ExtentsReportManager.extentReportLogging("info", "Initiated the android session with os less than thirteen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in initiating android session with os less than thirteen <br />" + e);
            throw e;
        }
    }

    @Then("user validates three screens only displayed")
    public void userValidatesThreeScreensOnlyDisplayed() {
        try {
            int count = idmPage.validatesThreeScreensOnlyDisplayed();
            soft.assertTrue(count == 3);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the display of third screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in displaying third screen<br />" + e);
            throw e;
        }
    }

    @And("user enters the following details in signin page")
    public void userEntersTheFollowingDetailsInSigninPage(DataTable table) {
        try {
            idmPage.switchToWebView();
            idmPage.entersTheFollowingDetailsInSigninPage(table);
            ExtentsReportManager.extentReportLogging("info", "Entered the details in sign in page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering the details in sign in page<br />" + e);
            throw e;
        }

    }

    @And("user enters the following parents details in signin page")
    public void userEntersTheFollowingParentsDetailsInSigninPage(DataTable table) {
        try {
            idmPage.entersTheFollowingParentsDetailsInSigninPage(table);
            ExtentsReportManager.extentReportLogging("info", "Entered the parents details in the sign in page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering parents details in sign in page<br />" + e);
            throw e;
        }
    }

    @And("user clicks on forget password link")
    public void userClicksOnForgetPasswordLink() {
        try {
            idmPage.switchToWebView();
            idmPage.clicksOnForgetPasswordLink();
            ExtentsReportManager.extentReportLogging("info", "Clicked on forget password link");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking the forget password link <br />" + e);
            throw e;
        }
    }

    @And("user enters the following details in forget password screen")
    public void userEntersTheFollowingDetailsInForgetPasswordScreen(DataTable table) {
        try {
            idmPage.entersTheFollowingDetailsInForgetPasswordScreen(table);
            ExtentsReportManager.extentReportLogging("info", "Entered the details in forget password screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering the details in forget password screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks on change email address in my profile screen")
    public void userClicksOnChangeEmailAddressInMyProfileScreen() {
        try {
            idmPage.clicksOnChangeEmailAddressInMyProfileScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on changed email address in my profile screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on change email address in profile screen<br />" + e);
            throw e;
        }
    }

    @And("user enters the following details in the change email address screen")
    public void userEntersTheFollowingDetailsInTheChangeEmailAddressScreen(DataTable table) {
        try {
//        idmPage.switchToWebView();
            idmPage.entersTheFollowingDetailsInTheChangeEmailAddressScreen(table);
            ExtentsReportManager.extentReportLogging("info", "Entered the details in change email address screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering the details in change email address screen <br />" + e);
            throw e;
        }
    }
}
