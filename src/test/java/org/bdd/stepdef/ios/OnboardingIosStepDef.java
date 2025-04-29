package org.bdd.stepdef.ios;

import org.bdd.pages.OnboardingPage;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.OnboardingAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.Random;

public class OnboardingIosStepDef {
	public SoftAssert soft = new SoftAssert();
	public OnboardingPage onboardingPage = new OnboardingPage();
	public OnboardingAPIResponse onboardingAPIResponse = new OnboardingAPIResponse();

	@Then("^user validates all objects in screen one in ios using Api$")
	public void userValidatesAllObjectsInScreenOneInIos() throws Throwable {
		 try {
	        	//data from API
	            String welcomeTextFromAPIScOne = onboardingAPIResponse.getWelcomeTextApi("onBoardingScreenOneEndPoint");
	           String quoteFromAPIScOne = onboardingAPIResponse.getQuoteApi("onBoardingScreenOneEndPoint");
	           String descFromAPIScOne = onboardingAPIResponse.getDescApi("onBoardingScreenOneEndPoint");
	            String letsGOButtonFromAPIScOne = onboardingAPIResponse.getLetsGoButtonApi("onBoardingScreenOneEndPoint");
	            
	                  
	          //Data from UI
	          String actualWelcomeText = onboardingPage.getTextforWelcomeHeading();
	            soft.assertEquals(actualWelcomeText.toUpperCase(), welcomeTextFromAPIScOne.toUpperCase());
	            
	            String actualQuote = onboardingPage.getQuoteScreen1();
	            soft.assertEquals(actualQuote.toUpperCase(), quoteFromAPIScOne.toUpperCase());
	            
	            String actualDesc = onboardingPage.getDescScreen1();
	            soft.assertEquals(actualDesc.toUpperCase(), descFromAPIScOne.toUpperCase());
	            
	           String actualLetsGoButton = onboardingPage.getLetsGOButtonScreen1();
	            soft.assertEquals(actualLetsGoButton.toUpperCase(), letsGOButtonFromAPIScOne.toUpperCase());
	            
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen one");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in screen one <br />" + e);
	            throw e;
	        }
	}

	@And("^user navigates to screen two in ios$")
	public void userNavigatesToScreenTwoInIos() throws Throwable {
		try {
			onboardingPage.clickScreenTwoDotButton();
			ExtentsReportManager.extentReportLogging("info", "navigated to screen two in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail", "Error in navigating to screen two in ios<br />" + e);

			throw e;

		}

	}

	@Then("^user validates all objects in screen two in ios using Api$")
	public void userValidatesAllObjectsInScreenTwoInIos() throws Throwable {
		 try {
	            String welcomeTextFromAPIScTwo =onboardingAPIResponse.getWelcomeTextFromApiScTwoApi("onBoardingScreenOneEndPoint");
	            String quoteFromAPIScTwo = onboardingAPIResponse.getQuoteFromApiScTwoApi("onBoardingScreenOneEndPoint");
	            String descFromAPIScTwo = onboardingAPIResponse.getDescFromApiScTwoApi("onBoardingScreenOneEndPoint");
	            String allowButtonFromAPIScTwo = onboardingAPIResponse.getAllowButtonFromApiScTwoApi("onBoardingScreenOneEndPoint");
	            String askMeLaterButtonFromAPIScTwo = onboardingAPIResponse.getAskMeLaterButtonFromApiScTwoApi("onBoardingScreenOneEndPoint");

	            String actualWelcomeTextScTwo = onboardingPage.getTextForWelcomeHeadingScreen2();
	            soft.assertEquals(actualWelcomeTextScTwo.toUpperCase(), welcomeTextFromAPIScTwo.toUpperCase());
	            
	            String actualQuoteScTwo = onboardingPage.getQuoteScreen2();
	            soft.assertEquals(actualQuoteScTwo.toUpperCase(), quoteFromAPIScTwo.toUpperCase());
	            
	            String actualDescScTwo = onboardingPage.getDescScreen2();
	            soft.assertEquals(actualDescScTwo.toUpperCase(), descFromAPIScTwo.toUpperCase());
	            
	            String actualAllowButtonScTwo = onboardingPage.getAllowButtonScreen2();
	            soft.assertEquals(actualAllowButtonScTwo.toUpperCase(), allowButtonFromAPIScTwo.toUpperCase());
	            
	            String actualAskMeLaterButtonScTwo = onboardingPage.getAskMeLaterButtonScreen2();
	            soft.assertEquals(actualAskMeLaterButtonScTwo.toUpperCase(), askMeLaterButtonFromAPIScTwo.toUpperCase());
	            soft.assertAll();
	            
	            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen two");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in screen two <br />" + e);
	            throw e;
	        }
	    }

	@Then("^user validates all objects in screen three in ios using Api$")
	public void userValidatesAllObjectsInScreenThreeInIos() throws Throwable {
		try {
            String welcomeTextFromAPIScThree = onboardingAPIResponse.getWelcomeTextFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            //String menFromAPIScThree = onboardingAPIResponse.geMenFromAPIScThreeApi("onBoardingScreenThreeEndPoint");
            //String womenFromAPIScThree = onboardingAPIResponse.getWomenFromAPIScThreeApi("onBoardingScreenThreeEndPoint");
            //String swipeToSelectFromAPIScThree = onboardingAPIResponse.getSwipeToSelectFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String selectionFromAPIScThree = onboardingAPIResponse.getSelectionFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String confirmButtonFromAPIScThree = onboardingAPIResponse.getConfirmButtonFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String skipButtonFromAPIScThree = onboardingAPIResponse.getSkipButtonFromAPIScThreeApi("onBoardingScreenOneEndPoint");

            String actualWelcomeText = onboardingPage.getTextForWelcomeHeadingScreen3();
            soft.assertEquals(actualWelcomeText.toUpperCase(), welcomeTextFromAPIScThree.toUpperCase());
            
//            String actualMen = onboardingPage.getMenScreen3();
//            soft.assertEquals(actualMen.toUpperCase(), menFromAPIScThree.toUpperCase());
            
//            String actualWomen = onboardingPage.getWomenScreen3();
//            soft.assertEquals(actualWomen.toUpperCase(), womenFromAPIScThree.toUpperCase());
            
//            String actualSwipeToSelect = onboardingPage.getSwipeToSelectScreen3();
//            soft.assertEquals(actualSwipeToSelect.toUpperCase(), swipeToSelectFromAPIScThree.toUpperCase());
            
            String actualSelection = onboardingPage.getSelectionScreen3();
            soft.assertEquals(actualSelection.toUpperCase(), selectionFromAPIScThree.toUpperCase());
            
            String actualConfirmButton = onboardingPage.getConfirmButtonScreen3();
            soft.assertEquals(actualConfirmButton.toUpperCase(), confirmButtonFromAPIScThree.toUpperCase());
            
            String actualSkipButton = onboardingPage.getSkipButtonScreen3();
            soft.assertEquals(actualSkipButton.toUpperCase(), skipButtonFromAPIScThree.toUpperCase());
            
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen three");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in screen three<br />" + e);
            throw e;
        }
    }

	@Then("^user validates all objects in screen four in ios using Api$")
	public void userValidatesAllObjectsInScreenFourInIos() throws Throwable {
try {
        	
            String welcomeTextFromAPIScFour = onboardingAPIResponse.getWelcomeTextFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String button1FromAPIScFour = onboardingAPIResponse.getButton1FromAPIScFourApi("onBoardingScreenOneEndPoint");
            String button2FromAPIScFour = onboardingAPIResponse.getbutton2FromAPIScFourApi("onBoardingScreenOneEndPoint");
            String button3FromAPIScFour = onboardingAPIResponse.getbutton3FromAPIScFourApi("onBoardingScreenOneEndPoint");
            String getExclusiveAccessText = onboardingAPIResponse.getgetExclusiveAccessTextApi("onBoardingScreenOneEndPoint");
            //String descFromAPIScFour = onboardingAPIResponse.getDescFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String signForUnitedButtonFromAPIScFour = onboardingAPIResponse.getsignForUnitedButtonFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String skipButtonFromAPIScFour = onboardingAPIResponse.getskipButtonFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String myUnitedBenefitsFromAPIScFour = onboardingAPIResponse.getmyUnitedBenefitsFromAPIScFourApi("onBoardingScreenOneEndPoint");

            String actualWelcomeText = onboardingPage.getTextForWelcomeHeadingScreen4();
            soft.assertEquals(actualWelcomeText.toUpperCase(), welcomeTextFromAPIScFour.toUpperCase());
            
            String actualButton1 = onboardingPage.getbutton1Screen4();
            soft.assertEquals(actualButton1.toUpperCase(), button1FromAPIScFour.toUpperCase());
            
            String actualButton2 = onboardingPage.getButton2Screen4();
            soft.assertEquals(actualButton2.toUpperCase(), button2FromAPIScFour.toUpperCase());
            
            String actualButton3 = onboardingPage.getButton3Screen4();
            soft.assertEquals(actualButton3.toUpperCase(), button3FromAPIScFour.toUpperCase());
            
            String actualGetExclusiveAccessText = onboardingPage.getGetExclusiveAccessTextScreen4();
            soft.assertEquals(actualGetExclusiveAccessText.toUpperCase(), getExclusiveAccessText.toUpperCase());
            
//            String actualDesc = onboardingPage.getDescScreen4();
//            soft.assertEquals(actualDesc.toUpperCase(), descFromAPIScFour.toUpperCase());
            
            String actualSignForUnitedButton = onboardingPage.getSignForUnitedButtonScreen4();
            soft.assertEquals(actualSignForUnitedButton.toUpperCase(), signForUnitedButtonFromAPIScFour.toUpperCase());
            
            String actualSkipButton = onboardingPage.getSkipButtonScreen4();
            soft.assertEquals(actualSkipButton.toUpperCase(), skipButtonFromAPIScFour.toUpperCase());
            
            String actualMyUnitedBenefits = onboardingPage.getMyUnitedBenefitsScreen4();
            
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen four");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validated all objects in screen four<br />" + e);
            throw e;
        }
    }
	@And("^user clicks on allow button in ios$")
	public void userClicksOnAllowButtonInIos() throws Throwable {
		try {
			onboardingPage.userClickOnAllow();
			ExtentsReportManager.extentReportLogging("info", "clicked on allow button in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on allow button in ios<br />" + e);

			throw e;

		}

	}

	@Then("^user validate all objects in allow notifcation screen in ios$")
	public void userValidateAllObjectsInAllowNotifcationScreenInIos(DataTable table) throws Throwable {
		try {
			String notification = table.cell(1, 0);
			String allow = table.cell(1, 1);
			String dontallow = table.cell(1, 2);

			String actualNotification = onboardingPage.getNotification();
			soft.assertEquals(actualNotification, notification);
			String actualAllowBtn = onboardingPage.getAllow();
			soft.assertEquals(actualAllowBtn, allow);
			String actualDontAllow = onboardingPage.getDontAllow();
			soft.assertEquals(actualDontAllow, dontallow);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"validated all objects in allow notifcation screen in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating all objects in allow notifcation screen in ios <br />" + e);

			throw e;

		}

	}

	@And("user clicks on {string} button in notification screen in ios")
	public void userClicksOnButtonInNotificationScreenInIos(String allowOrDeny) throws Exception {
		try {

			if (allowOrDeny.equalsIgnoreCase("allow_button")) {
				onboardingPage.userClickOnAllowBtnInNotificationScreen();

			} else if ((allowOrDeny.equalsIgnoreCase("deny_button"))) {
				onboardingPage.userClickOnDenyBtnInNotificationScreen();
			} else {
				throw new Exception("No Match Found");
			}
			ExtentsReportManager.extentReportLogging("info",
					"clicked on allowOrDeny button in notification screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on allowOrDeny button in notification screen in ios  <br />" + e);
			throw e;
		}
	}

	@And("^user swipes to select the favorite player and validates player name using Api in ios$")
	public void userSwipesToSelectTheFavoritePlayerAndValidatesPlayerNameAsInIos()
			throws Throwable {
		try {
			ArrayList<String> expectedPlayerNames=onboardingAPIResponse.getPlayerNameFromApi("onBoardingScreenThreeMenuPlayer");
			int rand= new Random().nextInt(expectedPlayerNames.size());
			String expectedPlayerName=expectedPlayerNames.get(rand);
			String actualPlayerName = onboardingPage.selectFavoritePlayerIos(expectedPlayerName,expectedPlayerNames.size());
			soft.assertEquals(actualPlayerName, expectedPlayerName);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"swiped to select the favorite player and validates player name as expectedPlayerName");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in swipeing to select the favorite player and validates player name as expectedPlayerName <br />"
							+ e);
			throw e;
		}
	}

	@And("^user clicks confirm button in ios$")
	public void userClicksConfirmButtonInIos() throws Throwable {
		try {
			onboardingPage.clickConfirmButton();
			ExtentsReportManager.extentReportLogging("info", "clicked confirm button in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking confirm button in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates the sign in page in ios$")
	public void userValidatesTheSignInPageInIos(DataTable table) throws Throwable {
		try {
			String signInBtn = table.cell(1, 0);
			String Desc = table.cell(1, 1);
			String actualsignInBtn = onboardingPage.getCreateAccTextInSignInPage();
			soft.assertEquals(actualsignInBtn, signInBtn);
			String actualDesc = onboardingPage.getDescInSignInPage();
			soft.assertEquals(actualDesc, Desc);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the sign in page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating the sign in page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates benefits cards in screen four in ios$")
	public void userValidatesBenefitsCardsInScreenFourInIos() throws Throwable {
		try {
			boolean flag = onboardingPage.validatesBenefitsCardsInScreenFourIsDisplayedIos();
			soft.assertTrue(flag);
			ExtentsReportManager.extentReportLogging("info", "validated benefits cards in screen four in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating benefits cards in screen four in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks on log in button in sign in page in ios$")
	public void userClicksOnLogInButtonInSignInPageInIos() throws Throwable {
		try {
			onboardingPage.clicksOnLogInButtonInSignInPage();
			ExtentsReportManager.extentReportLogging("info", "clicked on log in button in sign in page in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on log in button in sign in page in ios <br />" + e);

			throw e;

		}

	}

	@Then("^user validates the login page in ios$")
	public void userValidatesTheLoginPageInIos(DataTable table) throws Throwable {
		try {
			String logInIcon = table.cell(1, 0);
			String Desc = table.cell(1, 1);
			String actuallogInIcon = onboardingPage.getLoginTextInLoginPage();
			soft.assertEquals(actuallogInIcon, logInIcon);
			String actualDesc = onboardingPage.getDescInLoginPage();
			soft.assertEquals(actualDesc, Desc);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the login page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating the login page in ios <br />" + e);
			throw e;
		}
	}
}
