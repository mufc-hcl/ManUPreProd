package org.bdd.stepdef.android;

import org.bdd.pages.ExplorePage;
import org.bdd.pages.MutvPage;
import org.bdd.utils.AppiumDriverManager;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.ExploreAPIResponse;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.ArrayList;

public class ExploreAndroidStepDef {
    public SoftAssert soft = new SoftAssert();
    public ExplorePage explorePage = new ExplorePage();
    public UnitedNowAPIResponse unitedNowAPIResponse = new UnitedNowAPIResponse();
    public ExploreAPIResponse exploreAPIResponse = new ExploreAPIResponse();
    public MutvPage mutvPage = new MutvPage();

//    @Then("^verify whats new or live match blog in home page using api$")
//    public void verifyWhatsNewOrLiveMatchBlogInHomePageUsingApi() throws Throwable {
//        try {
//            explorePage.closePopScreen();
////        String expWhatsNew = table.cell(1, 0);
//            boolean contentType = unitedNowAPIResponse.getContentTypeFromSpotLightApi("spotLightEndPoint");
//            String actualWhatsNeworLiveBlogTextFromUI = explorePage.getWhatsNewOrLiveBlog();
//            System.out.println(actualWhatsNeworLiveBlogTextFromUI);
//            if (!contentType) {
//                String expWhatsNewTextFromApi = unitedNowAPIResponse.getWhatsNew("getUnitedNowConfigurationsEndpoint").toUpperCase();
//                soft.assertEquals(actualWhatsNeworLiveBlogTextFromUI, expWhatsNewTextFromApi.toUpperCase());
//                ExtentsReportManager.extentReportLogging("info", "Verified Whats New in home page");
//            } else {
//                String expLiveBlogTextFromApi = unitedNowAPIResponse.getLiveBlog("getUnitedNowConfigurationsEndpoint").toUpperCase();
//                soft.assertEquals(actualWhatsNeworLiveBlogTextFromUI, expLiveBlogTextFromApi.toUpperCase());
//                ExtentsReportManager.extentReportLogging("info", "Verified Live Match Blog in home page");
//            }
//            soft.assertAll();
//
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validation of Whats New in home page<br />" + e);
//            throw e;
//        }
//    }
    
    @Then("^verify whats new or live match blog in home page using api$")
    public void verifyWhatsNewOrLiveMatchBlogInHomePageUsingApi() throws Throwable {
        try {
            String actualWhatsNeworLiveBlogTextFromUI = explorePage.getWhatsNewText();
            String expWhatsNewTextFromApi = unitedNowAPIResponse.getWhatsNew("getUnitedNowConfigurationsEndpoint").toUpperCase();
            soft.assertEquals(actualWhatsNeworLiveBlogTextFromUI, expWhatsNewTextFromApi.toUpperCase());
            ExtentsReportManager.extentReportLogging("info", "Verified Whats New in home page");
            soft.assertAll();
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of Whats New in home page<br />" + e);
            throw e;
        }
    }

    @And("^user click on My United in bottom tab$")
    public void userClickOnMyUnitedInBottomTab() {
        try {
        	mutvPage.clickOnNotNowButtonInMatchAppearanceAlertScreen();
            explorePage.clickMyUnitedTab();
            ExtentsReportManager.extentReportLogging("info", "Clicked on my united in the bottom tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error while clicking my united in the bottom tab<br />" + e);
            throw e;
        }
    }

    @And("^user click on setting icon on top righhand side$")
    public void userClickOnSettingIconOnTopRighhandSide() throws Throwable {
        try {
            explorePage.clickSettingIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on the setting icon on top right of the page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking setting icon on top right of the page<br />" + e);
            throw e;
        }
    }

    @And("^user click on GENERAL link in setting screen$")
    public void userClickOnGENERALLinkInSettingScreen() throws Throwable {
        try {
        	explorePage.clickOnBrazeWebViewPopup();
            explorePage.clickOnGeneral();
            ExtentsReportManager.extentReportLogging("info", "Clicked on General link in the setting screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking general link in the setting screen<br />" + e);
            throw e;
        }
    }

    @And("^user click on HELP link in general screen$")
    public void userClickOnHELPLinkInGeneralScreen() {
        try {
            explorePage.clickOnHelp();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Help link in general screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking Help link in general screen <br />" + e);
            throw e;
        }
    }

    @And("^user click on contact us link help screen$")
    public void userClickOnContactUsLinkHelpScreen() throws Exception {
        try {
        	explorePage.clickOnBrazeWebViewPopup();
            explorePage.clickOnContactUs();
            ExtentsReportManager.extentReportLogging("info", "CLicked on contact us link in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on contact us link in help screen <br />" + e);
            throw e;
        }
    }

    @Then("^I verify the contactUs text in contact us screen$")
    public void iVerifyTheContactUsTextInContactUsScreen(DataTable table) throws Throwable {
        try {
            String expContactUs = table.cell(1, 0);
            String actualContactUs = explorePage.getContactUs();
            soft.assertEquals(actualContactUs, expContactUs);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the contact us text in contact us screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying contact us text in contact us screen<br />" + e);
            throw e;
        }
    }
    // faqs

    @And("^user click on faqs link help screen$")
    public void userClickOnFaqsLinkHelpScreen() {
        try {
            explorePage.clickOnFaqs();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Faq link in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking Faq link in help screen <br />" + e);
            throw e;
        }
    }

    @Then("^I verify the faqs text in faqs screen$")
    public void IVerifyTheFaqsTextInFaqsScreen(DataTable table) throws Throwable {
        try {
            String expFaqs = table.cell(1, 0);
            String actualFaqs = explorePage.getFaqsText();
            soft.assertEquals(actualFaqs, expFaqs);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified Faq text in Faqs screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of Faq text in Faqs Screen<br />" + e);
            throw e;
        }
    }

    // accessibility

    @And("^user click on accessibility link help screen$")
    public void userClickOnAccessibilityLinkHelpScreen() {
        try {
            explorePage.clickOnAccessability();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Accessibility link in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking accessibility link in help screen<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the accessibility text in accessibility screen$")
    public void IVerifyTheAccessibilityTextInAccessibilityScreen(DataTable table) throws Throwable {
        try {
            String expAccessbility = table.cell(1, 0);
            String actualAccessibility = explorePage.getAccessabilityText();
            soft.assertEquals(actualAccessibility, expAccessbility);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the accessibility text in accessibility text in accessibility screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying accessibility text <br />" + e);
            throw e;
        }
    }

    // terms of use

    @And("^user click on Terms of Use link in help screen$")
    public void userClickOnTermsOfUseLinkInHelpScreen() {
        try {
            explorePage.clickOnTermsOfUse();
            ExtentsReportManager.extentReportLogging("info", "Clicked on terms of use link in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on terms of use link in help screen<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the Terms of Use text in Terms of Use screen$")
    public void IVerifyTheTermsOfUseTextInTermsOfUseScreen(DataTable table) throws Throwable {
        try {
            String expTermsOfUse = table.cell(1, 0);
            String actualTermsOfUse = explorePage.getTermsOfUseText();
            soft.assertEquals(actualTermsOfUse, expTermsOfUse);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified Terms of use text");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of terms of use screen<br />" + e);
            throw e;
        }
    }

    @And("^user click on privacy policy link in help screen$")
    public void userClickOnPrivacyPolicyLinkInHelpScreen() {
        try {
            explorePage.clickOnPrivacyPolicy();
            ExtentsReportManager.extentReportLogging("info", "Clicked on privacy policy link in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on privacy link in help screen<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the privacy policy text in privacy policy  screen$")
    public void IVerifyThePrivacyPolicyTextInPrivacyPolicyScreen(DataTable table) throws Throwable {
        try {
            String expPrivacyPolicy = table.cell(1, 0);
            String actualPrivacyPolicy = explorePage.getPrivacyPolicyText();
            soft.assertEquals(actualPrivacyPolicy, expPrivacyPolicy);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the privacy text");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of privacy text<br />" + e);
            throw e;
        }
    }
    // sendAppFeedbackHelp

    @And("^user click on feedback link in help screen$")
    public void userClickOnFeedbackLinkInHelpScreen() {
        try {
            explorePage.clickOnSendFeedback();
            ExtentsReportManager.extentReportLogging("info", "Clicked on feedback link in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking feedback link<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the feedback text in feedback screen$")
    public void IVerifyTheFeedbackTextInFeedbackScreen(DataTable table) {
        try {
            String expFeedback = table.cell(1, 0);
            String actualFeedback = explorePage.getFeedBackTitleText();
            soft.assertEquals(actualFeedback, expFeedback);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the feedback text");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of feedback text <br />" + e);
            throw e;
        }
    }

    @And("^user enters below details in the feedback screen$")
    public void userEntersBelowDetailsInTheFeedbackScreen(DataTable table) {
        try {
            String emailAddress = table.cell(1, 0);
            String subject = table.cell(1, 1);
            String feedback = table.cell(1, 2);
            explorePage.setFeedbackForm(emailAddress, subject, feedback);
            ExtentsReportManager.extentReportLogging("info", "Entered the details in feedback screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering details in feedback screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the success message$")
    public void userValidatesTheSuccessMessage(DataTable table) {
        try {
            String expSuccessMessage = table.cell(1, 0);
            String actualSuccessMessage = explorePage.getSuccessMessageAfterFeedbackSubmission();
            soft.assertEquals(actualSuccessMessage, expSuccessMessage);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the success message");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating success message <br />" + e);
            throw e;
        }

    }

    @And("^user clicks search button in united screen$")
    public void userClicksSearchButtonInUnitedScreen() throws Exception {
        try {
            explorePage.clicksSearchInUnitedScreenAnd();
            ExtentsReportManager.extentReportLogging("info", "Clicked search button in united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking search button in united screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks help carousel in search screen")
    public void userClicksHelpCarouselInSearchScreen() {
        try {
            explorePage.clicksHelpCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked help carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking help carousel in search screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks help courosel in search screen$")
    public void userClicksHelpCouroselInSearchScreen() {
        try {
            explorePage.clicksHelpCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked help carousel in help screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking help carousel in help screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks history courosel in search screen$")
    public void userClicksHistoryCouroselInSearchScreen() {
        try {
            explorePage.clicksHistoryCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "CLicked history carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking history carousel in search screen<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the story in history screen$")
    public void userVerifyTheStoryInHistoryScreen(DataTable table) {
        try {
            String expStoryInHistory = table.cell(1, 0);
            String actualStoryInHistory = explorePage.getStoryInHistoryScreen();
            soft.assertEquals(actualStoryInHistory, expStoryInHistory);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified story in history screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of story in history screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks mutv courosel in search screen$")
    public void userClicksMutvCouroselInSearchScreen() {
        try {
            explorePage.clicksMutvCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked mutv carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking mutv carousel in search screen<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the mutv screen$")
    public void userVerifyTheMutvScreen(DataTable table) {
        try {
            String expMutvScreen = table.cell(1, 0);
//            String expDescription = table.cell(1, 1);
            String expExplore = table.cell(1, 1);
            String actualMutvScreen = explorePage.getMutvWelcomeTextMutvPage();
            soft.assertEquals(actualMutvScreen, expMutvScreen);
//            String actualDescription = explorePage.getMutvDescriptionMutvPage();
//            soft.assertEquals(actualDescription, expDescription);
            String actualExplore = explorePage.getMutvExploreButtonMutvPage();
            soft.assertEquals(actualExplore, expExplore);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of mutv screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks shop courosel in search screen$")
    public void userClicksShopCouroselInSearchScreen() {
        try {
            explorePage.clickShopCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked shop carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking shop carousel in search screen <br />" + e);
            throw e;
        }
    }

    @Then("^user verify the shop screen$")
    public void userVerifyTheShopScreen(DataTable table) {
        try {
            String expShop = table.cell(1, 0);
            String actualshop = explorePage.getShopTitleShopPage();
            soft.assertEquals(actualshop, expShop);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the shop screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of shop screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks my tickets courosel in search screen$")
    public void userClicksMyTicketsCouroselInSearchScreen() {
    	if (!Common.apiEnv().equalsIgnoreCase("prod")) {
        try {
        	 
            explorePage.clickMyTicketsCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked my tickets carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking my tickets carousel in search screen <br />" + e);
            throw e;
        }
    	}
    	else
    	{
    		 ExtentsReportManager.extentReportLogging("info", "My tickets carousel in search screen is not available in Preprod");
    	}
    }

    @And("^user clicks membership courosel in search screen$")
    public void userClicksMembershipCouroselInSearchScreen() {
        try {
            explorePage.clickMembershipCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked membership carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking membership carousel in search screen<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the membership screen$")
    public void userVerifyTheMembershipScreen(DataTable table) {
        try {
            String expOfficialMembership = table.cell(1, 0);
           // String expOfficialMembershipdesc = table.cell(1, 1);
            String actualOfficaialMembership = explorePage.getOfficialMembership();
            soft.assertEquals(actualOfficaialMembership, expOfficialMembership);
         //   String actualOfficialMembershipDesc = explorePage.getOfficialMembershipDesc();
           // soft.assertEquals(actualOfficialMembershipDesc, expOfficialMembershipdesc);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified membership screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of membership screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks my united courosel in search screen$")
    public void userClicksMyUnitedCouroselInSearchScreen() {
        try {
            explorePage.clickMyUnitedCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked my united carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking my united carousel in search screen<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the title$")
    public void userVerifyTheTitle(DataTable table) {
        try {
            String expMyUnitedTitle = table.cell(1, 0);
            String actualMyUnitedTitle = explorePage.getMyUnitedTitle();
            soft.assertEquals(actualMyUnitedTitle, expMyUnitedTitle);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the my united title");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of my united title<br />" + e);
            throw e;
        }
    }

    @And("user clicks players courosel in search screen")
    public void userClicksPlayersCouroselInSearchScreen() {
        try {
            explorePage.clicksPlayersCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked players carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking players carousel in search screen<br />" + e);
            throw e;
        }
    }


    @And("user clicks fixtures and table courosel in search screen")
    public void userClicksFixturesAndTableCouroselInSearchScreen() {
        try {
            explorePage.clicksFixturesAndTableCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked fixtures and table carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking fixtures and table carousel in search screen<br />" + e);
            throw e;
        }
    }


    @And("user clicks buy tickets courosel in search screen")
    public void userClicksBuyTicketsCouroselInSearchScreen() {
        try {
            boolean buyTicket = explorePage.clicksBuyTicketsCouroselInSearchScreen();
            soft.assertTrue(buyTicket,"Buy ticket carousel is not present in search screen");
			soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked buy tickets carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking buy tickets carousel in search screen <br />" + e);
            throw e;
        }
    }

    @Then("user verify the ticket screen")
    public void userVerifyTheTicketScreen(DataTable table) {
        try {
            String expMyUnitedTitle = table.cell(1, 0);
            String actualMyUnitedTitle = explorePage.getTicketTitle();
            soft.assertEquals(actualMyUnitedTitle, expMyUnitedTitle);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the tickets screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of tickets screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks fans courosel in search screen")
    public void userClicksFansCouroselInSearchScreen() {
        try {
            explorePage.clicksFansCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked fans carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking fans carousel in search screen<br />" + e);
            throw e;
        }
    }

    @Then("user verify the fans screen")
    public void userVerifyTheFansScreen(DataTable table) {
        try {
            String expMyUnitedTitle = table.cell(1, 0);
            String actualMyUnitedTitle = explorePage.getFansPageContent();
            soft.assertTrue(expMyUnitedTitle.contains(actualMyUnitedTitle), "Fan screen text is not matched with API");
            //soft.assertEquals(actualMyUnitedTitle, expMyUnitedTitle);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified the fans screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verification of fan screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks predictions courosel in search screen")
    public void userClicksPredictionsCouroselInSearchScreen() {
        try {
            explorePage.clicksPredictionsCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked Predications carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking predictions carousel in search screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks latest courosel in search screen")
    public void userClicksLatestCouroselInSearchScreen() {
        try {
            explorePage.clicksLatestCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked latest carousel in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking latest carousel in search screen<br />" + e);
            throw e;
        }

    }


    @And("user clicks on notification icon in settings screen")
    public void userClicksOnNotificationIconInSettingsScreen() {
        try {
            explorePage.clicksOnNotificationIconInSettingsScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked Notification icon in settings screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking notification icon in settings screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates the given alerts in notifications screen")
    public void userValidatesTheGivenAlertsInNotificationsScreen(DataTable table) {
        try {
            String expUnitedNowAlertText = table.cell(1, 0);
            String expMatchAlertText = table.cell(1, 1);
            String actualUnitedNowAlertText = explorePage.getUntiedNowAlertsTextNotificationPage();
            String actualMatchAlertText = explorePage.getMatchAlertsTextNotificationPage();
            soft.assertEquals(actualUnitedNowAlertText, expUnitedNowAlertText);
            soft.assertEquals(actualMatchAlertText, expMatchAlertText);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the alerts in the notifications screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating alerts in notification screen  <br />" + e);
            throw e;
        }
    }

    @And("user clicks on united now alert in notification screen")
    public void userClicksOnUnitedNowAlertInNotificationScreen() {
        try {
            explorePage.clicksOnUnitedNowAlertInNotificationScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on united now alert in notification screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking united now alert in notification screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks on match alert in notification screen")
    public void userClicksOnMatchAlertInNotificationScreen() {
        try {
            explorePage.clicksOnMatchAlertInNotificationScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked match alert in notification screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking match alert in notification screen<br />" + e);
            throw e;
        }
    }

    @And("user click on latest alert switch in united now alerts screen")
    public void userClickOnLatestAlertSwitchInUnitedNowAlertsScreen() {
        try {
            explorePage.clickOnLatestAlertSwitchInUnitedNowAlertsScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on latest alert switch in united now alerts screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking latest alert switch in united now alerts screen<br />" + e);
            throw e;
        }
    }

    @And("user selects go to settings from enable alerts dialog box")
    public void userSelectsGoToSettingsFromEnableAlertsDialogBox() {
        try {
            explorePage.selectsGoToSettingsFromEnableAlertsDialogBox();
            ExtentsReportManager.extentReportLogging("info", "Selected goto in settings from enable alerts dialog box");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting goto in settings from enable alerts dialog box <br />" + e);
            throw e;
        }
    }

    @And("user clicks on notifications switch in settings")
    public void userClicksOnNotificationsSwitchInSettings() {
        try {
            explorePage.clicksOnNotificationsSwitchInSettings();
            ExtentsReportManager.extentReportLogging("info", "Clicked on notifications switch in settings ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking notifications switch in settings  <br />" + e);
            throw e;
        }
    }

    @And("user clicks back icon in the settings")
    public void userClicksBackIconInTheSettings() {
        try {
            explorePage.clicksBackIconInTheSettings();
            ExtentsReportManager.extentReportLogging("info", "Clicked back icon in the settings");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon in the settings <br />" + e);
            throw e;
        }
    }

    @And("user clicks on back button in United now alerts screen")
    public void userClicksOnBackButtonInUnitedNowAlertsScreen() {
        try {
            explorePage.clicksOnBackButtonInUnitedNowAlertsScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back button in untied now alerts screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back button in united now alerts screen<br />" + e);
            throw e;
        }
    }

    @And("user validates the general alerts in united now alerts screen")
    public void userValidatesTheGeneralAlerts() {
        try {
            explorePage.validatesTheGeneralAlerts();
            ExtentsReportManager.extentReportLogging("info", "Validated the general alerts in united now alerts screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating general alerts in united now alerts screen <br />" + e);
            throw e;
        }
    }

    @And("user validates the match alerts in match alerts screen")
    public void userValidatesTheMatchAlertsInMatchAlertsScreen() {
        try {
            explorePage.validatesTheMatchAlertsInMatchAlertsScreen();
            ExtentsReportManager.extentReportLogging("info", "Validated match alerts in match alerts screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating match alerts in match alerts screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks on ok button in cookies screen")
    public void userClicksOnOkButtonInCookiesScreen() throws Exception {
        try {
            explorePage.clickOnReggNotNowInMyUnited();
            explorePage.clicksOnOkButtonInCookiesScreen();
           // explorePage.clickOnReggNotNowInMyUnited();
            mutvPage.clicksinAppMsgIOSBrazeTestCloseButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on OK button in cookies screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking ok button in cookies screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the items in history page$")
    public void userValidatesTheItemsInHistoryPage() {
        try {
            boolean flag = explorePage.validatesTheItemsInHistoryPageDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the items in history page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating items in history page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on any one of the history item$")
    public void userClicksOnAnyOneOfTheHistoryItemInIos() {
        try {
            explorePage.clickOnAnyOneOfTheHistoryItemInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked  any one of history item");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking any one item in history item <br />" + e);
            throw e;
        }
    }

    @Then("^user validates the CTA history item$")
    public void userValidatesTheCTAHistoryItemInIos() {
        try {
            boolean flag = explorePage.validatesTheCTAHistoryItemDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated CTA history item");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating CTA history item<br />" + e);
            throw e;
        }
    }

    @And("^user validates without data in search screen$")
    public void userValidatesWithoutDataInSearchScreen() {
        try {
            boolean flag = explorePage.validatesWithoutDataInSearchScreenIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated without data in search screen ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating without data in search screen <br />" + e);
            throw e;
        }
    }


    @And("^user clicks on a player in search suggestions$")
    public void userClicksOnAPlayerInSearchSuggestions() {
        try {
            explorePage.clicksOnPlayersInSearchSuggestions();
            ExtentsReportManager.extentReportLogging("info", "Clicked on player in search suggestions");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking players in search suggestions<br />" + e);
            throw e;
        }
    }

    @And("^user search players or updates \"([^\"]*)\" in United page$")
    public void userSearchPlayersOrUpdatesInUnitedPage(String ExploreSearchText) {
        try {
            explorePage.searchPlayersOrUpdates(ExploreSearchText);
            ExtentsReportManager.extentReportLogging("info", "Searched players or updates in united page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in search players or updates in united page <br />" + e);
            throw e;
        }
    }

    @And("^user enters image in search for \"([^\"]*)\" in page filter$")
    public void userEntersImageInSearchForInPageFilter(String ImageContent) {
        try {
            explorePage.enterImageInSearchForImageContentInPageFilter(ImageContent);
            ExtentsReportManager.extentReportLogging("info", "Enters image in search for " + ImageContent + " in page filter");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering image in search in page filter <br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for image$")
    public void userValidatesSearchResultForImage() {
        try {
            boolean flag = explorePage.validatesSearchResultForImage();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search result for image");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search result for image<br />" + e);
            throw e;
        }
    }

    @And("^user enters Videos in search for \"([^\"]*)\" in page filter$")
    public void userEntersVideosInSearchForInPageFilter(String VideoContent) {
        try {
            explorePage.enterImageInSearchForVideosContentInPageFilter(VideoContent);
            ExtentsReportManager.extentReportLogging("info", "Entered videos in search for video content in page filter");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering videos in search for videos content in page filter <br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for Videos$")
    public void userValidatesSearchResultForVideos() {
        try {
            boolean flag = explorePage.validatesSearchResultForVideos();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search results for videos");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search results for videos<br />" + e);
            throw e;
        }
    }

    @And("^user enters News in search for \"([^\"]*)\" in page filter$")
    public void userEntersNewsInSearchForInPageFilter(String NewsContent) {
        try {
            explorePage.enterImageInSearchForNewsContentInPageFilter(NewsContent);
            ExtentsReportManager.extentReportLogging("info", "Entered news in search for news content in page filter ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering news in search for news content in page filter<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for News$")
    public void userValidatesSearchResultForNews() {
        try {
            boolean flag = explorePage.validatesSearchResultForNews();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search results for news");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search results for news<br />" + e);
            throw e;
        }
    }

    @And("^user enters All in search for \"([^\"]*)\" in page filter$")
    public void userEntersAllInSearchForInPageFilter(String AllContent) {
        try {
            explorePage.enterImageInSearchForAllContentInPageFilter(AllContent);
            ExtentsReportManager.extentReportLogging("info", "Entered all in search for all content in page filter");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error entering all search for all content in page filter<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for All$")
    public void userValidatesSearchResultForAll() {
        try {
            boolean flag = explorePage.validatesSearchResultForAll();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search result for all");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search result for all <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on content related to search result$")
    public void userClicksOnContentRelatedToSearchResult() {
        try {
            explorePage.clicksOnContentRelatedToSearchResult();
            ExtentsReportManager.extentReportLogging("info", "Clicked on content related to search result");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on content related to search results<br />" + e);
            throw e;
        }
    }

    @And("^user search players or updates \"([^\"]*)\"Related Searches$")
    public void userSearchPlayersOrUpdatesRelatedSearches(String ExploreSearchText) {
        try {
            explorePage.searchPlayersOrUpdatesRelatedSearches(ExploreSearchText);
            ExtentsReportManager.extentReportLogging("info", "Searched players or updates related searches");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in searching players or updates related searches <br />" + e);
            throw e;
        }
    }

    @Then("^user validates the search result$")
    public void userValidatesTheSearchResult() {
        try {
            boolean flag = explorePage.validatesSearchResultisDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search result");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search result<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the search result of the player$")
    public void userValidatesTheSearchResultOfThePlayer(DataTable table) {
        try {
            String expTitleSearchResult = table.cell(1, 0);
            String actualTitleSearchResult = explorePage.getTitleTextSearchResultOfPlayers();
            soft.assertEquals(actualTitleSearchResult, expTitleSearchResult);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search result of the players");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search result of players <br />" + e);
            throw e;
        }
    }

    @Then("^user validates search Auto suggestions is displayed$")
    public void userValidatesSearchAutoSuggestionsIsDisplayed() {
        try {
            boolean flag = explorePage.validatesSearchAutoSuggestionsIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search auto suggestions is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search auto suggestions <br />" + e);
            throw e;
        }
    }

    @And("^user swipes to left in shop page$")
    public void userSwipesToLeftInShopPage() {
        try {
            explorePage.swipwToLeft();
            ExtentsReportManager.extentReportLogging("info", "Swipes to left in Shop page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in swiping to left in shop page <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Back icon in predictions page$")
    public void userClicksOnBackIconInPredictionsPage() {
        try {
            explorePage.clicksOnBackIconInPredictionsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in prediction page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon in prediction page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Table CTA Fixtures and tables page$")
    public void userClicksOnTableCTAFixturesAndTablesPage() {
        try {
            explorePage.clickOnTableCTA();
            ExtentsReportManager.extentReportLogging("info", "Clicked on table CTA fixtures and tables page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on table CTA fixtures an table page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the under girls match schedule$")
    public void userValidatesTheUnderGirlsMatchSchedule(DataTable table) {
        try {
            explorePage.clickOnDDGirlsTabInIos();
            String actualLeague1 = table.cell(1, 0);
            String actualLeague2 = table.cell(1, 1);
            String actualLeague3 = table.cell(1, 2);
            String expectedLeague1 = explorePage.getGirlsLeague1Text();
            String expectedLeague2 = explorePage.getGirlsLeague2Text();
            String expectedLeague3 = explorePage.getGirlsLeague3Text();
            soft.assertEquals(actualLeague1, expectedLeague1);
            soft.assertEquals(actualLeague2, expectedLeague2);
            soft.assertEquals(actualLeague3, expectedLeague3);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated under girls match schedule");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating under girls match schedule<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page$")
    public void userClicksOnBuyTicketHospitalityTickeyInfoCTAInFixturesPage() {
        try {
            explorePage.clicksOnTicketsInfoBtnInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on buy ticket or hospitality or ticket info CTA in fixtures page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking buy tickets or hospitality or ticket info CTA in fixtures page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on cross icon in tickets page$")
    public void userClicksOnCrossIconInTicketsPage() {
        try {
            explorePage.clicksOnBackInTicketsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on cross icon in tickets page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking cross icon in tickets page <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on stats tab in players screen$")
    public void userClicksOnStatsTabInPlayersScreen() {
        try {
            explorePage.clickOnStatsTabInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on stats tab in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on stats tab in players screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates match live stats and season stats for players$")
    public void userValidatesMatchLiveStatsAndSeasonStatsForPlayers(DataTable table) {
        try {
            String expMatchLive = table.cell(1, 0);
            String expSeasonStats = table.cell(1, 1);
            String actualMatchLive = explorePage.validatesMatchLiveStats();
            String actualSeasonStats = explorePage.validatesSeasonStatsForPlayers();
            soft.assertEquals(actualMatchLive, expMatchLive);
            soft.assertEquals(actualSeasonStats, expSeasonStats);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated match live stats and season stats for players");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating match live stats and season stats for players<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on profile tab in players screen$")
    public void userClicksOnProfileTabInPlayersScreen() {
        try {
            explorePage.clickOnProfileTabInPlayersScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on profile tab in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking profile tab in players screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on view more btn in palyers screen$")
    public void userClicksOnViewMoreBtnInPalyersScreen() {
        try {
            explorePage.clickOnViewMoreBtnInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "CLicked on view more button in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking view more button in players screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the search page$")
    public void userValidatesTheSearchPage() {
        try {
            boolean flag = explorePage.validatesTheSearchPageInIosIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            explorePage.clicksOnExitBtnInSearchpage();
            ExtentsReportManager.extentReportLogging("info", "Validated search page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the share icon in players screen$")
    public void userValidatesTheShareIconInPlayersScreen() {
        try {
            boolean flag = explorePage.validatesTheShareIconInPlayersScreenInIosDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated share icon in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating share icon in players screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on share icon in players screen$")
    public void userClicksOnShareIconInPlayersScreen() {
        try {
            explorePage.clickOnShareIconInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error <br />" + e);
            throw e;
        }
    }

    @And("^user selects a latest video in latest listing page$")
    public void userSelectsALatestVideoInLatestListingPage() {
        try {
            explorePage.selectsALatestVideoInLatestListingPage();
            explorePage.clicksLatestVideoInListingPage();
            ExtentsReportManager.extentReportLogging("info", "Selected latest video in latest listing page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting latest video in latest listing page <br />" + e);
            throw e;
        }
    }

    @Then("^user validates the video playing in video destination page$")
    public void userValidatesTheVideoPlayingInVideoDestinationPage() {
        try {
            boolean flag = explorePage.validatesTheVideoPlayingInVideoDestinationPageDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the video playing in video destination page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating video playing in video destination page<br />" + e);
            throw e;
        }
    }

    @And("^user scrolls down to DFP Ads card in latest screen$")
    public void userScrollsDownToDFPAdsCardInLatestScreen() {
        try {
            explorePage.scrollsDownToDFPAdsCardInLatestScreen();
            ExtentsReportManager.extentReportLogging("info", "Scrolled down to DFP ads cards in latest screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in scrolling down to DFP ads cards in the latest screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the DFP Ad card and Click on Dfp ad card$")
    public void userValidatesTheDFPAdCardAndClickOnDfpAdCard() {
        try {
            boolean flag = explorePage.validatesTheDFPAdCardAndClickOnDfpAdCard();
            soft.assertTrue(flag);
            soft.assertAll();
            explorePage.clickOnDfpAdCardLatestScreen();
            ExtentsReportManager.extentReportLogging("info", "Validates the DFP ads card and clicked on the DFP ad card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the DFP ads card and clicking on DFP ad card <br />" + e);
            throw e;
        }
    }

    @And("^user scrolls down to DFP Ads card in Players screen$")
    public void userScrollsDownToDFPAdsCardInPlayersScreen() {
        try {
            explorePage.scrollsDownToDFPAdsCardInPlayersScreen();
            ExtentsReportManager.extentReportLogging("info", "Scrolled down to DFP ads card in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in scrolling down to DFP ads card in players screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the DFP Ad card and Click on Dfp ad card Players Screen$")
    public void userValidatesTheDFPAdCardAndClickOnDfpAdCardPlayersScreen() {
        try {
            boolean flag = explorePage.validatesTheDFPAdCardAndClickOnDfpAdCardPlayersScreen();
            soft.assertTrue(flag);
            explorePage.clickOnDfpAdCardPlayersScreen();
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the DFP Ad card and clicked on DFP ad card in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating DFP ad card and clicking on DFP ad card in players screen<br />" + e);
            throw e;
        }
    }

    @And("^user initiates the android Tablet Session$")
    public void userInitiatesTheAndroidTabletSession() throws Throwable {
        try {
            new AppiumDriverManager().initializeAndroidDriverTablet();
            ExtentsReportManager.extentReportLogging("info", "Initiated the android tablet session");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in initiating android tablet session<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the crest image in fixtures screen$")
    public void userValidatesTheCrestImageInFixturesScreen() {
        try {
            boolean flag = explorePage.validatesTheCrestImageInFixturesScreen();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the crest image in fixtures screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the crest image in fixtures screen <br />" + e);
            throw e;
        }
    }

    @Then("user verify all carousel is displayed using api")
    public void userVerifyAllCarouselIsDisplayedUsingApi() throws IOException {
        try {
            ArrayList<String> carouselListFromAPI = exploreAPIResponse.getCarouselListFromEndPoint("getCarouselListEndPoint");
            ArrayList<String> carouselListFromUI = explorePage.getCarouselListFromSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Carousel list from API <br />" + carouselListFromAPI);
            ExtentsReportManager.extentReportLogging("info", "Carousel list from UI <br />" + carouselListFromUI);
            soft.assertTrue( carouselListFromAPI.containsAll(carouselListFromUI));
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Verified List of Carousel from UI with API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of Whats New in home page<br />" + e);
            throw e;
        }
    }

    @And("user validates popular and categories section in the search screen")
    public void userValidatesPopularAndCategoriesSectionInTheSearchScreen() {
        try{
            soft.assertTrue(explorePage.validatesPopularAndCategoriesSectionInTheSearchScreen());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the popular and categories in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of popular and categories in search screen<br />" + e);
            throw e;
        }
    }

    @And("user validates the popular content in the search screen")
    public void userValidatesThePopularContentInTheSearchScreen() {
        try{
            ArrayList<String> actualPopularContent=explorePage.getsPopularContentInTheSearchScreen();
            System.out.println(actualPopularContent);
            ExtentsReportManager.extentReportLogging("info", "Validated the popular content in the search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of popular and categories in search screen<br />" + e);
            throw e;
        }
    }

    @And("^user enters less than three character in search for \"([^\"]*)\" in page filter$")
    public void userEnterslessThanThreeCharacterInSearchForInPageFilter1(String lessthanthreecharacter) throws Exception {
        try {
            explorePage.enterCharactersInSearch(lessthanthreecharacter);
            ExtentsReportManager.extentReportLogging("info", "Entered news in search for news content in page filter ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering news in search for news content in page filter<br />" + e);
            throw e;
        }
    }
    
    @And("^user enters three character in search for \"([^\"]*)\" in page filter$")
    public void userEntersThreeCharacterInSearchForInPageFilter1(String lessthanthreecharacter) throws Exception {
        try {
            explorePage.enterCharactersInSearch(lessthanthreecharacter);
            ExtentsReportManager.extentReportLogging("info", "Entered news in search for news content in page filter ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering news in search for news content in page filter<br />" + e);
            throw e;
        }
    }
    
    @Then("^user validate no suggestion are displayed$")
    public void userValidatesNoSuggestionSearchResultAreIsDisplayed() {
        try {
            boolean flag = explorePage.validatesNoSearchResultForThreeCharactersIninUtedNow();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated No results is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in No results is displayed <br />" + e);
            throw e;
        }
    }
    
    
    @Then("^user validate suggestion are displayed$")
    public void userValidatesSuggestionSearchResultAreIsDisplayed() {
        try {
            boolean flag = explorePage.validatesSearchResultForThreeCharactersIninUtedNow();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search auto suggestions is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search auto suggestions <br />" + e);
            throw e;
        }
    }
    
    @And("^user select first item from suggestion$")
    public void userSelectFirstitemFromSuggestions() {
        try {
            explorePage.userClickOnFirstItemFromList();
            ExtentsReportManager.extentReportLogging("info", "user select first item from suggestions");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error itmes from search auto suggestions <br />" + e);
            throw e;
        }
    }
    
    @And("^user validate data in search screen$")
    public void userValidateDataInSearchScreen() throws Exception {
    	try {
    		explorePage.switchToWebView();
            boolean flag = explorePage.validateDataInSerchResult();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search auto suggestions is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search auto suggestions <br />" + e);
            throw e;
        }
    }
}
