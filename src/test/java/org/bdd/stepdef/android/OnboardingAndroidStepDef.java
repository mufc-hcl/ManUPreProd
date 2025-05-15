package org.bdd.stepdef.android;

import org.bdd.pages.ExplorePage;
import org.bdd.pages.OnboardingPage;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.OnboardingAPIResponse;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class OnboardingAndroidStepDef {
    public SoftAssert soft = new SoftAssert();
    public OnboardingPage onboardingPage = new OnboardingPage();
    public OnboardingAPIResponse onboardingAPIResponse = new OnboardingAPIResponse();

    @Given("user navigates to manu android application")
    public void userNavigatesToManuAndroidApplication() {
    	 try {
             ExtentsReportManager.extentReportLogging("info", "navigated to manu android application");
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error navigates to manu android application<br />" + e);
             throw e;
         }
    }

    @Then("user validates all objects in screen one using api")
    public void userValidatesAllObjectsInScreenOne() throws Exception {
        try {
            //data from API
            String welcomeTextFromAPIScOne = onboardingAPIResponse.getWelcomeTextApi("onBoardingScreenOneEndPoint");
            String actualWelcomeText = onboardingPage.getTextforWelcomeHeading();
            soft.assertEquals(actualWelcomeText.toUpperCase(), welcomeTextFromAPIScOne.toUpperCase());

            String quoteFromAPIScOne = onboardingAPIResponse.getQuoteApi("onBoardingScreenOneEndPoint");
            String actualQuote = onboardingPage.getQuoteScreen1();
            soft.assertEquals(actualQuote.toUpperCase(), quoteFromAPIScOne.toUpperCase());

            String descFromAPIScOne = onboardingAPIResponse.getDescApi("onBoardingScreenOneEndPoint");
            String actualDesc = onboardingPage.getDescScreen1();
            soft.assertTrue(descFromAPIScOne.contains("Sir Matt Busby said it best"));
            //soft.assertEquals(actualDesc.toUpperCase(), descFromAPIScOne.toUpperCase());
            

            String letsGOButtonFromAPIScOne = onboardingAPIResponse.getLetsGoButtonApi("onBoardingScreenOneEndPoint");
            String actualLetsGoButton = onboardingPage.getLetsGOButtonScreen1();
            soft.assertEquals(actualLetsGoButton.toUpperCase(), letsGOButtonFromAPIScOne.toUpperCase());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen one");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in screen one <br />" + e);
            throw e;
        }
    }

    @And("user navigates to screen two")
    public void userNavigatesToScreenTwo() throws InterruptedException {
        try {
            onboardingPage.clickScreenTwoDotButton();
            ExtentsReportManager.extentReportLogging("info", "Navigated to screen two");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to screen two <br />" + e);
            throw e;
        }
    }

    @Then("user validates all objects in screen two using Api")
    public void userValidatesAllObjectsInScreenTwo() throws Exception {
        try {
            String welcomeTextFromAPIScTwo = onboardingAPIResponse.getWelcomeTextFromApiScTwoApi("onBoardingScreenOneEndPoint");
            String actualWelcomeTextScTwo = onboardingPage.getTextForWelcomeHeadingScreen2();
            soft.assertEquals(actualWelcomeTextScTwo.toUpperCase(), welcomeTextFromAPIScTwo.toUpperCase());

            String quoteFromAPIScTwo = onboardingAPIResponse.getQuoteFromApiScTwoApi("onBoardingScreenOneEndPoint");
            String actualQuoteScTwo = onboardingPage.getQuoteScreen2();
            soft.assertEquals(actualQuoteScTwo.toUpperCase(), quoteFromAPIScTwo.toUpperCase());

            String descFromAPIScTwo = onboardingAPIResponse.getDescFromApiScTwoApi("onBoardingScreenOneEndPoint");
            String actualDescScTwo = onboardingPage.getDescScreen2();
            soft.assertEquals(actualDescScTwo.toUpperCase(), descFromAPIScTwo.toUpperCase());

            String allowButtonFromAPIScTwo = onboardingAPIResponse.getAllowButtonFromApiScTwoApi("onBoardingScreenOneEndPoint");
            String actualAllowButtonScTwo = onboardingPage.getAllowButtonScreen2();
            soft.assertEquals(actualAllowButtonScTwo.toUpperCase(), allowButtonFromAPIScTwo.toUpperCase());

            String askMeLaterButtonFromAPIScTwo = onboardingAPIResponse.getAskMeLaterButtonFromApiScTwoApi("onBoardingScreenOneEndPoint");
            String actualAskMeLaterButtonScTwo = onboardingPage.getAskMeLaterButtonScreen2();
            soft.assertEquals(actualAskMeLaterButtonScTwo.toUpperCase(), askMeLaterButtonFromAPIScTwo.toUpperCase());
            soft.assertAll();

            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen two");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in screen two <br />" + e);
            throw e;
        }
    }

    @And("user navigates to screen three")
    public void userNavigatesToScreenThree() {
        try {
            onboardingPage.clickScreenThreeDotButton();
            ExtentsReportManager.extentReportLogging("info", "Navigated to screen three");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to screen three <br />" + e);
            throw e;
        }
    }

    @Then("user validates all objects in screen three using Api")
    public void userValidatesAllObjectsInScreenThree() throws Exception {
        try {
            String welcomeTextFromAPIScThree = onboardingAPIResponse.getWelcomeTextFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String actualWelcomeText = onboardingPage.getTextForWelcomeHeadingScreen3();
            soft.assertEquals(actualWelcomeText.toUpperCase(), welcomeTextFromAPIScThree.toUpperCase());

//       String menFromAPIScThree = onboardingAPIResponse.geMenFromAPIScThreeApi("onBoardingScreenThreeEndPoint");
//            String actualMen = onboardingPage.getMenScreen3();
//            soft.assertEquals(actualMen.toUpperCase(), menFromAPIScThree.toUpperCase());
            
//            ArrayList<String> menFromAPIScThree = new ArrayList<>();
//            menFromAPIScThree = onboardingAPIResponse.geMenFromAPIScThreeApi("onBoardingScreenThreeEndPoint");
//           ArrayList<String> actualMen = onboardingPage.getMenScreen3();
//           ExtentsReportManager.extentReportLogging("info","Expected  player categeory tabs from API" + menFromAPIScThree);
//           ExtentsReportManager.extentReportLogging("info","Actual player categeory tabs From UI" + onboardingPage.getMenScreen3());
//           soft.assertTrue(menFromAPIScThree.contains(actualMen));
//
//            String womenFromAPIScThree = onboardingAPIResponse.getWomenFromAPIScThreeApi("onBoardingScreenThreeEndPoint");
//            String actualWomen = onboardingPage.getWomenScreen3();
//            soft.assertEquals(actualWomen.toUpperCase(), womenFromAPIScThree.toUpperCase());

            String swipeToSelectFromAPIScThree = onboardingAPIResponse.getSwipeToSelectFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String actualSwipeToSelect = onboardingPage.getSwipeToSelectScreen3();
            soft.assertEquals(actualSwipeToSelect.toUpperCase(), swipeToSelectFromAPIScThree.toUpperCase());

            String selectionFromAPIScThree = onboardingAPIResponse.getSelectionFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String actualSelection = onboardingPage.getSelectionScreen3();
            soft.assertEquals(actualSelection.toUpperCase(), selectionFromAPIScThree.toUpperCase());

            String confirmButtonFromAPIScThree = onboardingAPIResponse.getConfirmButtonFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String actualConfirmButton = onboardingPage.getConfirmButtonScreen3();
            soft.assertEquals(actualConfirmButton.toUpperCase(), confirmButtonFromAPIScThree.toUpperCase());

            String skipButtonFromAPIScThree = onboardingAPIResponse.getSkipButtonFromAPIScThreeApi("onBoardingScreenOneEndPoint");
            String actualSkipButton = onboardingPage.getSkipButtonScreen3();
            soft.assertEquals(actualSkipButton.toUpperCase(), skipButtonFromAPIScThree.toUpperCase());

            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen three");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in screen three<br />" + e);
            throw e;
        }
    }

    @And("user navigates to screen four")
    public void userNavigatesToScreenFour() {
        try {
            onboardingPage.clickScreenFourDotButton();
            ExtentsReportManager.extentReportLogging("info", "Navigated to screen four");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to screen four<br />" + e);
            throw e;
        }
    }

    @Then("user validates all objects in screen four using Api")
    public void userValidatesAllObjectsInScreenFour() throws Exception {
        try {

            String welcomeTextFromAPIScFour = onboardingAPIResponse.getWelcomeTextFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String actualWelcomeText = onboardingPage.getTextForWelcomeHeadingScreen4();
            soft.assertEquals(actualWelcomeText.toUpperCase(), welcomeTextFromAPIScFour.toUpperCase());

            ArrayList<String> button1FromAPIScFour = onboardingAPIResponse.getButton1FromAPIScFourApi("onBoardingScreenOneEndPoint");
//            ArrayList<String> actualButton1 = onboardingPage.getbutton1Screen4();
//            soft.assertEquals(actualButton1.toUpperCase(), button1FromAPIScFour.toUpperCase());
            
            ArrayList<String> signUpThreeTabs = new ArrayList<>();
            signUpThreeTabs = onboardingAPIResponse.getButton1FromAPIScFourApi("onBoardingScreenOneEndPoint");
           ArrayList<String> actualButton1 = onboardingPage.getbutton1Screen4();
           ExtentsReportManager.extentReportLogging("info","Expected  sign up three tabs" + signUpThreeTabs);
           ExtentsReportManager.extentReportLogging("info","Actual Shop menu items" + onboardingPage.getbutton1Screen4());
           soft.assertEquals(actualButton1, onboardingPage.getbutton1Screen4());
            

//            String button2FromAPIScFour = onboardingAPIResponse.getbutton2FromAPIScFourApi("onBoardingScreenOneEndPoint");
//            String actualButton2 = onboardingPage.getButton2Screen4();
//            soft.assertEquals(actualButton2.toUpperCase(), button2FromAPIScFour.toUpperCase());
//
//            String button3FromAPIScFour = onboardingAPIResponse.getbutton3FromAPIScFourApi("onBoardingScreenOneEndPoint");
//            String actualButton3 = onboardingPage.getButton3Screen4();
//            soft.assertEquals(actualButton3.toUpperCase(), button3FromAPIScFour.toUpperCase());

            String getExclusiveAccessText = onboardingAPIResponse.getgetExclusiveAccessTextApi("onBoardingScreenOneEndPoint");
            String actualGetExclusiveAccessText = onboardingPage.getGetExclusiveAccessTextScreen4();
            soft.assertEquals(actualGetExclusiveAccessText.toUpperCase(), getExclusiveAccessText.toUpperCase());

            String descFromAPIScFour = onboardingAPIResponse.getDescFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String actualDesc = onboardingPage.getDescScreen4();
            soft.assertTrue(actualDesc.contains(descFromAPIScFour));
            
            
            String signForUnitedButtonFromAPIScFour = onboardingAPIResponse.getsignForUnitedButtonFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String actualSignForUnitedButton = onboardingPage.getSignForUnitedButtonScreen4();
            soft.assertEquals(actualSignForUnitedButton.toUpperCase(), signForUnitedButtonFromAPIScFour.toUpperCase());

            String skipButtonFromAPIScFour = onboardingAPIResponse.getskipButtonFromAPIScFourApi("onBoardingScreenOneEndPoint");
            String actualSkipButton = onboardingPage.getSkipButtonScreen4();
            soft.assertEquals(actualSkipButton.toUpperCase(), skipButtonFromAPIScFour.toUpperCase());

//            String myUnitedBenefitsFromAPIScFour = onboardingAPIResponse.getmyUnitedBenefitsFromAPIScFourApi("onBoardingScreenOneEndPoint");
//            String actualMyUnitedBenefits = onboardingPage.getMyUnitedBenefitsScreen4();
//            soft.assertEquals(actualMyUnitedBenefits.toUpperCase(), myUnitedBenefitsFromAPIScFour.toUpperCase());

            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen four");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validated all objects in screen four<br />" + e);
            throw e;
        }
    }

    @Given("user clicks on allow button")
    public void user_clicks_on_allow_button() {
        try {
            onboardingPage.userClickOnAllow();
            ExtentsReportManager.extentReportLogging("info", "Clicked on allow button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on allow button <br />" + e);
            throw e;
        }
    }

    @Then("user validate all objects in allow notifcation screen")
    public void userValidateAllObjectsInAllowNotifcationScreen(DataTable table) {
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
            ExtentsReportManager.extentReportLogging("info", "Validated all objects in allow notification screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating all objects in allow notification screen<br />" + e);
            throw e;
        }

    }

    @And("user clicks on {string} button in notification screen")
    public void userClicksOnButtonInNotificationScreen(String allowOrDeny) throws Exception {
        try {

            if (allowOrDeny.equalsIgnoreCase("allow_button")) {
                onboardingPage.userClickOnAllowBtnInNotificationScreen();

            } else if ((allowOrDeny.equalsIgnoreCase("deny_button"))) {
                onboardingPage.userClickOnDenyBtnInNotificationScreen();
            } else {
                throw new Exception("No Match Found");
            }
            ExtentsReportManager.extentReportLogging("info", "Clicked on button in notification screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on button in notification screen<br />" + e);
            throw e;
        }

    }

    @And("user swipes to select the favorite player and validates player name using Api")
    public void userSwipesToSelectTheFavoritePlayerAndValidatesPlayerNameAs() throws Exception {
        try {

            ArrayList<String> expectedPlayerNames=onboardingAPIResponse.getPlayerNameFromApi("onBoardingScreenThreeMenuPlayer");
            int rand= new Random().nextInt(expectedPlayerNames.size());
            String expectedPlayerName=expectedPlayerNames.get(rand);
            String actualPlayerName = onboardingPage.selectFavoritePlayer(expectedPlayerName,expectedPlayerNames.size());
            Assert.assertEquals(actualPlayerName, expectedPlayerName);
            ExtentsReportManager.extentReportLogging("info", "Swiped to select the favourite player and validated player name ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in swiping to select the favourite player and validated player name <br />" + e);
            throw e;
        }
    }

    @And("user clicks confirm button")
    public void userClicksConfirmButton() {
        try {
            onboardingPage.clickConfirmButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked confirm button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking confirm button<br />" + e);
            throw e;
        }
    }

    @And("user click on skip button in screen three")
    public void userClickOnSkipButtonInScreenThree() {
        try {
            onboardingPage.clickSkipButtonScreen3();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Skip button in screen three");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking skip button in screen three<br />" + e);
            throw e;
        }
    }

    @And("user clicks on lets go button")
    public void userClicksOnLetsGoButton() {
        try {
            onboardingPage.clickLetsGOButtonScreen1();
            ExtentsReportManager.extentReportLogging("info", "Clicked on lets go button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking lets go button<br />" + e);
            throw e;
        }
    }

    @And("user clicks on ask me later")
    public void userClicksOnAskMeLater() {
        try {
            onboardingPage.clickAskMeLaterButtonScreen2();
            ExtentsReportManager.extentReportLogging("info", "CLicked on ask me later");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking as me later  <br />" + e);
            throw e;
        }
    }

    @And("user click on skip button in screen four")
    public void userClickOnSkipButtonInScreenFour() {
        try {
            onboardingPage.clickSkipButtonScreen4();
            ExtentsReportManager.extentReportLogging("info", "Clicked on skip button in screen four");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking sjip button in screen four<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on dont allow Btn$")
    public void userClicksOnDontAllowBtn() {
        try {
            onboardingPage.userClickOnDenyBtnInNotificationScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on dont allow button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking dont allow button <br />" + e);
            throw e;
        }
    }

    @Then("^user validates benefits cards in screen four$")
    public void userValidatesBenefitsCardsInScreenFour() {
        try {
            boolean flag = onboardingPage.validatesBenefitsCardsInScreenFourIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits cards in screen four");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating benefits cards in screen four<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on log in button in sign in page$")
    public void userClicksOnLogInButtonInSignInPage() throws Throwable {
        try {
            onboardingPage.clicksOnLogInButtonInSignInPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on log in button in sign in page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking login button in sign in page <br />" + e);
            throw e;
        }
    }

    @Then("^user validates the login page$")
    public void userValidatesTheLoginPage(DataTable table) {
        try {
            String logInIcon = table.cell(1, 0);
            String Desc = table.cell(1, 1);
            String actuallogInIcon = onboardingPage.getLoginTextInLoginPage();
            soft.assertEquals(actuallogInIcon, logInIcon);
            String actualDesc = onboardingPage.getDescInLoginPage();
            soft.assertEquals(actualDesc, Desc);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the login page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating login page <br />" + e);
            throw e;
        }
    }

    @Then("^user validates the sign in page$")
    public void userValidatesTheSignInPage(DataTable table) throws Throwable {
        try {
            String signInBtn = table.cell(1, 0);
            String Desc = table.cell(1, 1);
            String actualsignInBtn = onboardingPage.getCreateAccTextInSignInPage();
            soft.assertEquals(actualsignInBtn, signInBtn);
            String actualDesc = onboardingPage.getDescInSignInPage();
            soft.assertEquals(actualDesc, Desc);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Vlaidated the sign");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error <br />" + e);
            throw e;
        }
    }

}
