package org.bdd.stepdef.ios;

import org.bdd.pages.*;
import org.bdd.utils.AppiumDriverManager;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.GlobalParams;
import org.bdd.utils.PropertyFileManager;
import org.bdd.utils.apiResponse.IdmAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class IdmIosStepDef {
	public SoftAssert soft = new SoftAssert();
	public IdmPage idmPage = new IdmPage();
	public MyUnitedPage myUnitedPage = new MyUnitedPage();
	public IdmAPIResponse idmAPIResponse = new IdmAPIResponse();

	@And("^user clicks on log in button in ios$")
	public void userClicksOnLogInButtonInIos() throws Throwable {
		try {
			idmPage.clicksOnLogInButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on log in button in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on log in button in ios<br />" + e);
			throw e;
		}

	}

	@And("user enter the valid email {string} and valid password {string} in ios")
	public void userEnterTheValidEmailAndValidPasswordInIos(String username, String password) throws Exception {
		try {
//	        idmPage.switchToWebView();
			idmPage.enterUsername(username);
			idmPage.enterPasswordInIos(password);
			ExtentsReportManager.extentReportLogging("info",
					"entered the valid email {username} and valid password {password} in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in entering the valid email {username} and valid password {password} in ios<br />" + e);
			throw e;
		}
	}
	
	@And("user enter the valid email and valid password for subscribed user in ios")
    public void userEnterTheValidEmailAndValidPasswordsubscribeduserinios() throws Exception {
        try {
        	Properties props = new PropertyFileManager().getProperties();
        	String username = null;
        	String password = null;
            if (Common.apiEnv().equalsIgnoreCase("stage")) {
            	username = props.getProperty("username_stage");
            	password = props.getProperty("password_stage");
            }
            else if (Common.apiEnv().equalsIgnoreCase("prod")) {
            	username = props.getProperty("username_preprod");
            	password = props.getProperty("password_preprod");
            }
            idmPage.enterUsername(username);
			idmPage.enterPasswordInIos(password);
            ExtentsReportManager.extentReportLogging("info", "Entered the valid username and password in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering valid username and password in ios<br />" + e);
            throw e;
        }
    }

	@And("^user clicks on continue button in ios$")
	public void userClicksOnContinueButtonInIos() throws Throwable {
		try {
			idmPage.clicksOnContinueButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on continue button in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on login button in login screen in ios$")
	public void userClicksOnLoginButtonInLoginScreenInIos() throws Throwable {
		try {
			idmPage.clicksOnLoginButtonInLoginScreenInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on login button in login screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on login button in login screen in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user navigated to my united screen and validates the following text in ios using Api$")
	public void userNavigatedToMyUnitedScreenAndValidatesTheFollowingTextInIos() throws Throwable {
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
	}
//		try {
//			String expectedDailyStreaks = table.cell(1, 0);
//			String expectedTotalScore = table.cell(1, 1);
//			String expectedAppearances = table.cell(1, 2);
//		        String expectedLevel = table.cell(1, 3);
//
//			String actualDailyStreaks = idmPage.getDailyStreaksText();
//			String actualTotalScore = idmPage.getTotalScoreText();
//			String actualAppearances = idmPage.getAppearanceText();
//		        String actualLevel = idmPage.getLevelText();
//			soft.assertEquals(actualDailyStreaks, expectedDailyStreaks);
//			soft.assertEquals(actualTotalScore, expectedTotalScore);
//			soft.assertEquals(actualAppearances, expectedAppearances);
//		        soft.assertEquals(actualLevel, expectedLevel);
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info",
//					"navigated to my united screen and validates the following text in ios");
//		} catch (AssertionError e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"navigating to my united screen and validates the following text in ios<br />" + e);
//			throw e;
//		}
//	}

	@And("^user clicks on My profile icon in ios$")
	public void userClicksOnMyProfileIconInIos() throws Throwable {
		try {
			idmPage.clicksOnMyProfileIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked on My profile icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on My profile icon in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the following in my profile screen in ios$")
	public void userValidatesTheFollowingInMyProfileScreenInIos() throws Throwable {
		try {
			boolean flag = idmPage.checkGivenDataDisplayedInMyProfileScreen();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validates the following in my profile screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the following in my profile screen in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on Logout icon in ios$")
	public void userClicksOnLogoutIconInIos() throws Throwable {
		try {
			idmPage.clicksOnLogoutIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked on Logout icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on Logout icon in ios<br />" + e);
			throw e;
		}
	}

	@And("^user selects yes from the want to logout alert box in ios$")
	public void userSelectsYesFromTheWantToLogoutAlertBoxInIos() throws Throwable {
		try {
			idmPage.selectsYesFromTheWantToLogoutAlertBox();
			ExtentsReportManager.extentReportLogging("info", "selected yes from the want to logout alert box in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in selecting yes from the want to logout alert box in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the below in my profile screen in ios using Api$")
	public void userValidatesTheBelowInMyProfileScreenInIos() throws Throwable {
		 try {
		        ArrayList<String> myProfileContentMyUnitedAPI = new ArrayList<>();
		        myProfileContentMyUnitedAPI = idmAPIResponse.getContentOfMyProfileFromAPIScFourApi("MyProfileContent");
	            List<String> actualmyProfileContentMyUnited = idmPage.getTextForContentOfMyProfile();
	            
	            ExtentsReportManager.extentReportLogging("info","myProfileContentMyUnited++++++"+myProfileContentMyUnitedAPI);
	            ExtentsReportManager.extentReportLogging("info","actualmyProfileContentMyUnited++++++"+idmPage.getTextForContentOfMyProfile());
	             
	            soft.assertEquals(actualmyProfileContentMyUnited, myProfileContentMyUnitedAPI);
	            
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "Validated the details in my profile screen");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating the details in my profile screen<br />" + e);
	            throw e;
	        }
	    }
	
//		try {
//			String expectedEditProfile = table.cell(1, 0);
//			String expectedChangePassword = table.cell(1, 1);
//			String expectedChangeEmail = table.cell(1, 2);
//			String expectedPreferance = table.cell(1, 3);
//			String expectedLogout = table.cell(1, 4);
//
//			String actualEditProfile = idmPage.getEditProfileText();
//			String actualChangePassword = idmPage.getChangePasswordText();
//			String actualChangeEmail = idmPage.getChangeEmailText();
//			String actualPreferance = idmPage.getPreferenceText();
//			String actualLogout = idmPage.getLogoutText();
//			soft.assertEquals(actualEditProfile, expectedEditProfile);
//			soft.assertEquals(actualChangePassword, expectedChangePassword);
//			soft.assertEquals(actualChangeEmail, expectedChangeEmail);
//			soft.assertEquals(actualPreferance, expectedPreferance);
//			soft.assertEquals(actualLogout, expectedLogout);
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info", "validated the below in my profile screen in ios");
//		} catch (AssertionError e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Error in validating the below in my profile screen in ios<br />" + e);
//			throw e;
//		}
//	}

	@Then("^user validates the google privacy policy in login screen in ios$")
	public void userValidatesTheGooglePrivacyPolicyInLoginScreenInIos() throws Throwable {
		try {
			String actualPrivacyPoicyText = idmPage.getGooglePrivacyPoilcy();
			soft.assertEquals(actualPrivacyPoicyText, "Privacy Policy");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"validated the google privacy policy in login screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on sign for united button in ios$")
	public void userClicksOnSignForUnitedButtonInIos() throws Throwable {
		try {
			idmPage.clicksOnSignForUnitedButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on sign for united button in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on sign for united button in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the google privacy policy in Sign Up screen in ios$")
	public void userValidatesTheGooglePrivacyPolicyInSignUpScreenInIos() throws Throwable {
		try {
			String actualPrivacyPoicyText = idmPage.getGooglePrivacyPolicyINCreateAnAccountScreen();
			soft.assertEquals(actualPrivacyPoicyText, "Privacy Policy");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"validated the google privacy policy in Sign Up screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the google privacy policy in Sign Up screen in ios<br />" + e);
			throw e;
		}
	}

	@And("user enters the valid email {string} and valid password {string} in google screen in ios")
	public void userEntersTheValidEmailAndValidPasswordInGoogleScreenInIos(String username, String password)
			throws Exception {
		try {
			idmPage.entersTheValidEmailInGoogleScreen(username);
			idmPage.clickNextButtonSignInScreen();
			idmPage.entersTheValidPasswordInGoogleScreen(password);
			idmPage.clickNextButtonSignInScreen();
			ExtentsReportManager.extentReportLogging("info",
					"entered the valid email String username, String password in google screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in entered the valid email String username, String password in google screen in ios<br />"
							+ e);
			throw e;
		}
	}

	@And("user clicks on show details in ios")
	public void userClicksOnShowDetailsInIos() throws Exception {
		if (Common.apiEnv().equalsIgnoreCase("stage")) {
			try {
				idmPage.clicksOnShowDetailsInIos();
				 myUnitedPage.ClicksOnTestContinue();
				 // myUnitedPage.clicksOnNoTracking();
				 idmPage.clicksOnLogInButton();
				 idmPage.clicksOnContinueButton();
				 idmPage.clicksOnSignInWithGoogleButton();
				ExtentsReportManager.extentReportLogging("info", "Clicked on show details in ios");
			} catch (AssertionError e) {
				ExtentsReportManager.extentReportLogging("fail", "Error in clicking on show details in ios<br />" + e);
				throw e;
			}
		}
	}

	@Then("user validates player name updated in my united screen in ios")
	public void userValidatesPlayerNameUpdatedInMyUnitedScreenInIos(DataTable table) {
		try {
			String expPlayerName = table.cell(1, 0);
			String actualPlayerName = myUnitedPage.getPlayerNameInUnitedScreenInIos();
			soft.assertEquals(actualPlayerName, expPlayerName);
			ExtentsReportManager.extentReportLogging("info",
					"validated player name updated in my united screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating player name updated in my united screen in ios<br />" + e);
			throw e;
		}
	}

	@And("user initiates the android session")
	public void userInitiatesTheAndroidSession() throws IOException {
		 try {
        	 AppiumDriverManager driverManager = new AppiumDriverManager();
             if (driverManager.getAppiumDriver() != null) {
                 driverManager.getAppiumDriver().quit();
                 driverManager.setAppiumDriver(null);
             }
             Properties props = new PropertyFileManager().getProperties();
             GlobalParams.setPlatformName(props.getProperty("android_platformName"));
             GlobalParams.setDeviceName(props.getProperty("android_deviceName"));
             GlobalParams.setOsversion(props.getProperty("android_os_version"));
            new AppiumDriverManager().initializeAndroidDriver();
            ExtentsReportManager.extentReportLogging("info", "initiated the android session");
			} catch (AssertionError e) {
				ExtentsReportManager.extentReportLogging("fail", "Error in initiating the android session<br />" + e);
				throw e;
			}
		
	}

	@Then("user validates player name updated in my united screen in android")
	public void userValidatesPlayerNameUpdatedInMyUnitedScreenInAndroid(DataTable table) {
		try {
			String expPlayerName = table.cell(1, 0);
			String actualPlayerName = myUnitedPage.getPlayerNameInUnitedScreenInAndroid();
			soft.assertEquals(actualPlayerName, expPlayerName);
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("user enters the following details in signin page in ios")
	public void userEntersTheFollowingDetailsInSigninPageInIos(DataTable table) {
		try {
			idmPage.entersTheFollowingDetailsInSigninPage(table);
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("user enters the following parents details in signin page in ios")
	public void userEntersTheFollowingParentsDetailsInSigninPageInIos(DataTable table) {
		try {
			idmPage.entersTheFollowingParentsDetailsInSigninPage(table);
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("user clicks on forget password link in ios")
	public void userClicksOnForgetPasswordLinkInIos() {
		try {
			idmPage.clicksOnForgetPasswordLink();
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("user enters the following details in forget password screen in ios")
	public void userEntersTheFollowingDetailsInForgetPasswordScreenInIos(DataTable table) {
		try {
			idmPage.entersTheFollowingDetailsInForgetPasswordScreen(table);
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("user clicks on change email address in my profile screen in ios")
	public void userClicksOnChangeEmailAddressInMyProfileScreenInIos() {
		try {
			idmPage.clicksOnChangeEmailAddressInMyProfileScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}

	@And("user enters the following details in the change email address screen in ios")
	public void userEntersTheFollowingDetailsInTheChangeEmailAddressScreenInIos(DataTable table) {
		try {
			idmPage.entersTheFollowingDetailsInTheChangeEmailAddressScreen(table);
			ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking membership carousel in search screen<br />" + e);
			throw e;
		}
	}
	@And("^user clicks on united now tab in ios$")
    public void userClicksOnUnitedNowTabInIOS() throws Throwable {
        try {
            new UnitedNowPage().clicksOnUnitedNowTab();
            ExtentsReportManager.extentReportLogging("info", "Clicked on United now tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Clicking on United tab <br />" + e);
            throw e;
        }
    }
	
	@Then("user validates captured player name updated in my united screen in ios")
	public void userValidatesCapturedPlayerNameInMyUnitedScreenInIos() {
		try {
			String expPlayerName  = GlobalParams.getPlayerName();
			boolean isPlayerVisible = myUnitedPage.getPlayerNameInUnitedScreenInIos(expPlayerName);
			 soft.assertTrue(isPlayerVisible);
	    	  soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"validated player name updated in my united screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating player name updated in my united screen in ios<br />" + e);
			throw e;
		}
	}
	
    @Given("user enter the valid email {string} and valid password")
	public void user_enter_the_valid_email_and_valid_password(String userName) throws Exception {
		 try {		
			   String password = Common.getOldPassword();	    
				if (GlobalParams.getPlatformName().equalsIgnoreCase("android")) { 
					 idmPage.switchToWebView();
					 idmPage.enterUsername(userName);			                
			         idmPage.enterPassword(password);
				 }
				else {
					idmPage.enterUsername(userName);
					idmPage.enterPasswordInIos(password);
				}
	            ExtentsReportManager.extentReportLogging("info", "Entered the valid username "+ userName +" and old password "+password);
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in entering valid username and password<br />" + e);
	            throw e;
	        }
	}
	


}
