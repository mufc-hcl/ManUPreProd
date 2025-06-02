package org.bdd.stepdef.ios;

import org.bdd.pages.ExplorePage;
import org.bdd.pages.MutvPage;
import org.bdd.pages.OnboardingPage;
import org.bdd.pages.UnitedNowPage;
import org.bdd.utils.AppiumDriverManager;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.GlobalParams;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.ArrayList;

public class ExploreIosStepdef {
    public SoftAssert soft = new SoftAssert();
    public OnboardingPage onboardingPage = new OnboardingPage();
    public MutvPage mutvPage = new MutvPage();
    public UnitedNowPage unitedNowPage = new UnitedNowPage();
    public ExplorePage explorePage = new ExplorePage();
    public UnitedNowAPIResponse unitedNowAPIResponse = new UnitedNowAPIResponse();

    @Given("user navigates to manu ios application")
    public void userNavigatesToManuIosApplication() {
        try {
            ExtentsReportManager.extentReportLogging("info", "navigated to manu ios application");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error navigates to manu ios application<br />" + e);
            throw e;
        }
    }

    @And("user clicks on cancel button in apple id screen")
    public void userClicksOnCancelButtonInAppleIdScreen() throws Exception {
        try {
            onboardingPage.clicksOnCancelButtonInAppleIdScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on cancel button in apple id screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking cancel button in apple id screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks lets go button in screen one in ios")
    public void userClicksLetsGoButtonInScreenOneInIos() {
        try {
            onboardingPage.clickLetsGOButtonScreen1();
            ExtentsReportManager.extentReportLogging("info", "Clicked on lets go button in screen one in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking lets go button in screen one in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks on ask me later in screen two in ios")
    public void userClicksOnAskMeLaterInScreenTwoInIos() {
        try {
            onboardingPage.clickAskMeLaterButtonScreen2();
            ExtentsReportManager.extentReportLogging("info", "Clicked on ask me later in screen two in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on ask me later in screen two in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks skip button in screen three in ios")
    public void userClicksSkipButtonInScreenThreeInIos() {
        try {
            onboardingPage.clickSkipButtonScreen3();
            ExtentsReportManager.extentReportLogging("info", "Clicked skip button in screen three in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking skip button in screen three in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on skip button in screen four in ios")
    public void userClickOnSkipButtonInScreenFourInIos() {
        try {
            onboardingPage.clickSkipButtonScreen4();
            ExtentsReportManager.extentReportLogging("info", "Clicked on skip button in screen four in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking skip button in screen four in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks on not now button in match appearance alert screen in ios")
    public void userClicksOnNotNowButtonInMatchAppearanceAlertScreenInIos() throws Exception {
        try {
            mutvPage.clickOnNotNowButtonInMatchAppearanceAlertScreen();
            explorePage.clickOnContinueButton();
            explorePage.askAppNotToTrack();
            ExtentsReportManager.extentReportLogging("info",
                    "Clicked on not now button in match appearance alert screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on not now button in match appearance alert screen in ios<br />" + e);
            throw e;
        }
    }

//	@Then("verify whatsnew in home page in ios")
//	public void verifyWhatsnewInHomePageInIos(DataTable table) {
//		try {
//			String expWhatsNew = table.cell(1, 0);
//			String actualWhatsNew = explorePage.getWhatsNew();
//			if (actualWhatsNew.toUpperCase().contains("WHAT'S NEW")) {
//				soft.assertEquals(actualWhatsNew, expWhatsNew.toUpperCase().split("#")[0]);
//			} else if (actualWhatsNew.toUpperCase().contains("LIVE MATCH BLOG")) {
//				soft.assertEquals(actualWhatsNew, expWhatsNew.toUpperCase().split("#")[1]);
//			}
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info", "validated whatsnew in home page in ios");
//		} catch (AssertionError e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Error in clicking Validating whatsnew in home page in ios<br />" + e);
//			throw e;
//		}
//	}

    @Then("verify whats new or live match blog in home page using api in ios")
    public void verifyWhatsnewOrLiveMatchBlogInHomePageUsingApiInIos() throws IOException {
        try {
//        String expWhatsNew = table.cell(1, 0);
            boolean contentType = unitedNowAPIResponse.getContentTypeFromSpotLightApi("spotLightEndPoint");
            String actualWhatsNeworLiveBlogTextFromUI = explorePage.getWhatsNewOrLiveBlog();
            System.out.println(actualWhatsNeworLiveBlogTextFromUI);
            if (!contentType) {
                String expWhatsNewTextFromApi = unitedNowAPIResponse.getWhatsNew("getUnitedNowConfigurationsEndpoint").toUpperCase();
                soft.assertEquals(actualWhatsNeworLiveBlogTextFromUI.toUpperCase(), expWhatsNewTextFromApi.toUpperCase());
                ExtentsReportManager.extentReportLogging("info", "Verified Whats New in home page");
            } else {
                String expLiveBlogTextFromApi = unitedNowAPIResponse.getLiveBlog("getUnitedNowConfigurationsEndpoint").toUpperCase();
                soft.assertEquals(actualWhatsNeworLiveBlogTextFromUI, expLiveBlogTextFromApi.toUpperCase());
                ExtentsReportManager.extentReportLogging("info", "Verified Live Match Blog in home page");
            } 
            soft.assertAll();
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking Validating whatsnew in home page in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on My United in bottom tab in ios")
    public void userClickOnMyUnitedInBottomTabInIos() {
        try {
            explorePage.clickMyUnitedTab();
            ExtentsReportManager.extentReportLogging("info", "Clicked on My United in bottom tab in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking sMy United in bottom tab in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on setting icon on top righhand side in ios")
    public void userClickOnSettingIconOnTopRighhandSideInIos() {
        try {
            explorePage.clickSettingIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on the setting icon on top right of the page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking setting icon on top right of the page<br />" + e);
            throw e;
        }
    }

    @And("user click on GENERAL link in setting screen in ios")
    public void userClickOnGENERALLinkInSettingScreenInIos() {
        try {
            explorePage.clickOnGeneral();
            ExtentsReportManager.extentReportLogging("info", "Clicked on GENERAL link in setting screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking GENERAL link in setting screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on HELP link in general screen in ios")
    public void userClickOnHELPLinkInGeneralScreenInIos() {
        try {
            explorePage.clickOnHelp();
            ExtentsReportManager.extentReportLogging("info", "Clicked on HELP link in general screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on HELP link in general screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on contact us link help screen in ios")
    public void userClickOnContactUsLinkHelpScreenInIos() {
        try {
            explorePage.clickOnContactUs();
            ExtentsReportManager.extentReportLogging("info", "Clicked on contact us link help screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on contact us link help screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("I verify the contactUs text in contact us screen in ios")
    public void iVerifyTheContactUsTextInContactUsScreenInIos(DataTable table) throws Exception {
        try {
            String expContactUs = table.cell(1, 0);
            String actualContactUs = explorePage.getContactUs();
            soft.assertEquals(actualContactUs, expContactUs);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verify the contactUs text in contact us screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verifing the contactUs text in contact us screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on faqs link help screen in ios")
    public void userClickOnFaqsLinkHelpScreenInIos() {
        try {
            explorePage.clickOnFaqs();
            ExtentsReportManager.extentReportLogging("info", "Clicked on faqs link help screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking faqs link help screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("I verify the faqs text in faqs screen in ios")
    public void iVerifyTheFaqsTextInFaqsScreenInIos(DataTable table) throws Exception {
        try {
            String expFaqs = table.cell(1, 0);
            String actualFaqs = explorePage.getFaqsText();
            soft.assertEquals(actualFaqs, expFaqs);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the faqs text in faqs screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verify the faqs text in faqs screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user click on accessibility link help screen in ios")
    public void userClickOnAccessibilityLinkHelpScreenInIos() {
        try {
            explorePage.clickOnAccessability();
            ExtentsReportManager.extentReportLogging("info", "Clicked on accessibility link help screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking accessibility link help screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("I verify the accessibility text in accessibility screen in ios")
    public void iVerifyTheAccessibilityTextInAccessibilityScreenInIos(DataTable table) throws Exception {
        try {
            String expAccessibility = table.cell(1, 0);
            String actualAccessibility = explorePage.getAccessabilityText();
            soft.assertEquals(actualAccessibility, expAccessibility);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the accessibility text in accessibility screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verifing the accessibility text in accessibility screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on Terms of Use link in help screen in ios$")
    public void userClickOnTermsOfUseLinkInHelpScreenInIos() throws Throwable {
        try {
            explorePage.clickOnTermsOfUse();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Terms of Use link in help screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking Terms of Use link in help screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the Terms of Use text in Terms of Use screen in ios$")
    public void iVerifyTheTermsOfUseTextInTermsOfUseScreenInIos(DataTable table) throws Throwable {
        try {
            String expTermsOfUse = table.cell(1, 0);
            String actualTermsOfUse = explorePage.getTermsOfUseText();
            soft.assertEquals(actualTermsOfUse, expTermsOfUse);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the Terms of Use text in Terms of Use screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verifing the Terms of Use text in Terms of Use screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on privacy policy link in help screen in ios$")
    public void userClickOnPrivacyPolicyLinkInHelpScreenInIos() throws Throwable {
        try {
            explorePage.clickOnPrivacyPolicy();
            ExtentsReportManager.extentReportLogging("info", "Clicked on privacy policy link in help screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking privacy policy link in help screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the privacy policy text in privacy policy  screen in ios$")
    public void iVerifyThePrivacyPolicyTextInPrivacyPolicyScreenInIos(DataTable table) throws Throwable {
        try {
            String expPrivacyPolicy = table.cell(1, 0);
            String actualPrivacyPolicy = explorePage.getPrivacyPolicyText();
            soft.assertEquals(actualPrivacyPolicy, expPrivacyPolicy);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the privacy policy text in privacy policy  screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "validating the privacy policy text in privacy policy  screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on feedback link in help screen in ios$")
    public void userClickOnFeedbackLinkInHelpScreenInIos() throws Throwable {
        try {
            explorePage.clickOnSendFeedback();
            ExtentsReportManager.extentReportLogging("info", "Clicked on feedback link in help screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on feedback link in help screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^I verify the feedback text in feedback screen in ios$")
    public void iVerifyTheFeedbackTextInFeedbackScreenInIos(DataTable table) throws Throwable {
        try {
            String expFeedback = table.cell(1, 0);
            String actualFeedback = explorePage.getFeedBackTitleText();
            soft.assertEquals(actualFeedback, expFeedback);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the feedback text in feedback screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verifing the feedback text in feedback screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user enters below details in the feedback screen in ios$")
    public void userEntersBelowDetailsInTheFeedbackScreenInIos(DataTable table) throws Throwable {
        try {
            String emailAddress = table.cell(1, 0);
            String subject = table.cell(1, 1);
            String feedback = table.cell(1, 2);
            explorePage.setFeedbackForm(emailAddress, subject, feedback);
            ExtentsReportManager.extentReportLogging("info", "entered below details in the feedback screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in entering below details in the feedback screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the success message in ios$")
    public void userValidatesTheSuccessMessageInIos(DataTable table) throws Throwable {
        try {
            String expSuccessMessage = table.cell(1, 0);
            String actualSuccessMessage = explorePage.getSuccessMessageAfterFeedbackSubmission();
            soft.assertEquals(actualSuccessMessage, expSuccessMessage);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validates the success message in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the success message in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks search button in united screen in ios")
    public void userClicksSearchButtonInUnitedScreenInIos() throws Exception {
        try {
            explorePage.clicksSearchInUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on search button in united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking search button in united screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks help carousel in search screen in ios")
    public void userClicksHelpCarouselInSearchScreenInIos() {
        try {
            explorePage.clicksHelpCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on help carousel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in help carousel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks history courosel in search screen in ios")
    public void userClicksHistoryCouroselInSearchScreenInIos() {
        try {
            explorePage.clicksHistoryCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on the history courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking history courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user verify the story in history screen in ios")
    public void userVerifyTheStoryInHistoryScreenInIos(DataTable table) {
        try {
            String expStoryInHistory = table.cell(1, 0);
            String actualStoryInHistory = explorePage.getStoryInHistoryScreen();
            soft.assertEquals(actualStoryInHistory, expStoryInHistory);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the story in history screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verifing the story in history screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks mutv courosel in search screen in ios")
    public void userClicksMutvCouroselInSearchScreenInIos() {
        try {
            explorePage.clicksMutvCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked mutv courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking mutv courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user verify the mutv screen in ios")
    public void userVerifyTheMutvScreenInIos(DataTable table) {
        try {
            String expMutvScreen = table.cell(1, 0);
            String expDescription = table.cell(1, 1);
            String expExplore = table.cell(1, 2);
            String actualMutvScreen = explorePage.getMutvWelcomeTextMutvPage();
            soft.assertEquals(actualMutvScreen, expMutvScreen);
            String actualDescription = explorePage.getMutvDescriptionMutvPage();
            soft.assertEquals(actualDescription, expDescription);
            String actualExplore = explorePage.getMutvExploreButtonMutvPage();
            soft.assertEquals(actualExplore, expExplore);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated the mutv screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying the mutv screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks shop courosel in search screen in ios")
    public void userClicksShopCouroselInSearchScreenInIos() {
        try {
            explorePage.clickShopCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on shop courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking shop courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user verify the shop screen in ios")
    public void userVerifyTheShopScreenInIos(DataTable table) {
        try {
            String expShop = table.cell(1, 0);
            String actualshop = explorePage.getShopTitleShopPage();
            soft.assertEquals(actualshop, expShop);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the shop screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying the shop screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks my tickets courosel in search screen in ios$")
    public void userClicksMyTicketsCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clickMyTicketsCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on my tickets courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking my tickets courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks membership courosel in search screen in ios$")
    public void userClicksMembershipCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clickMembershipCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on membership courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking membership courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the membership screen in ios$")
    public void userVerifyTheMembershipScreenInIos(DataTable table) throws Throwable {
        try {
            String expOfficialMembership = table.cell(1, 0);
//            String expOfficialMembershipdesc = table.cell(1, 1);
            String actualOfficaialMembership = explorePage.getOfficialMembership();
            soft.assertEquals(actualOfficaialMembership, expOfficialMembership);
//            String actualOfficialMembershipDesc = explorePage.getOfficialMembershipDesc();
//            soft.assertEquals(actualOfficialMembershipDesc, expOfficialMembershipdesc);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the membership screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in verifying the membership screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks my united courosel in search screen in ios$")
    public void userClicksMyUnitedCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clickMyUnitedCouroselInSearchPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on my united courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking my united courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the title in ios$")
    public void userVerifyTheTitleInIos(DataTable table) throws Throwable {
        try {
            String expMyUnitedTitle = table.cell(1, 0);
            String actualMyUnitedTitle = explorePage.getMyUnitedTitle();
            soft.assertEquals(actualMyUnitedTitle, expMyUnitedTitle);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the title in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying the title in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks players courosel in search screen in ios$")
    public void userClicksPlayersCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clicksPlayersCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on players courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking players courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks fixtures and table courosel in search screen in ios$")
    public void userClicksFixturesAndTableCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clicksFixturesAndTableCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "Clicked on fixtures and table courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking fixtures and table courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks buy tickets courosel in search screen in ios$")
    public void userClicksBuyTicketsCouroselInSearchScreenInIos() throws Throwable {
        try {
        	boolean buyTicket = explorePage.clicksBuyTicketsCouroselInSearchScreen();
            soft.assertTrue(buyTicket,"Buy ticket carousel is not present in search screen");
			soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on buy tickets courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking buy tickets courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the ticket screen in ios$")
    public void userVerifyTheTicketScreenInIos(DataTable table) throws Throwable {
        try {
            String expMyUnitedTitle = table.cell(1, 0);
            String actualMyUnitedTitle = explorePage.getTicketTitle();
            soft.assertEquals(actualMyUnitedTitle, expMyUnitedTitle);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the ticket screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying the ticket screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks fans courosel in search screen in ios$")
    public void userClicksFansCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clicksFansCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on fans courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking setting icon on top right of the page<br />" + e);
            throw e;
        }
    }

    @Then("^user verify the fans screen in ios$")
    public void userVerifyTheFansScreenInIos(DataTable table) throws Throwable {
        try {
            String expMyUnitedTitle = table.cell(1, 0);
            String actualMyUnitedTitle = explorePage.getFansPageContent();
            soft.assertTrue(expMyUnitedTitle.contains(actualMyUnitedTitle), "Fan screen text is not matched with API");
          //  soft.assertEquals(actualMyUnitedTitle, expMyUnitedTitle);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verified the fans screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying the fans screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks predictions courosel in search screen in ios$")
    public void userClicksPredictionsCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clicksPredictionsCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on predictions courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking predictions courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks latest courosel in search screen in ios$")
    public void userClicksLatestCouroselInSearchScreenInIos() throws Throwable {
        try {
            explorePage.clicksLatestCouroselInSearchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on latest courosel in search screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking latest courosel in search screen in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks on ok in the cookies screen in ios")
    public void userClicksOnOkInTheCookiesScreenInIos() throws Exception {
        try {
            explorePage.clicksOnOkButtonInCookiesScreenIos();
            explorePage.clickOnContinueButton();
            explorePage.askAppNotToTrack();
            ExtentsReportManager.extentReportLogging("info", "Clicked on ok in the cookies screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking ok in the cookies screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates hero card in Latest screen$")
    public void userValidatesHeroCardInLatestScreen() throws Throwable {
        try {
            boolean flag = explorePage.validatesHeroCardInLatestScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated hero card in Latest screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validates hero card in Latest screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on the any one of the card in latest screen$")
    public void userClicksOnTheAnyOneOfTheCardInLatestScreen() throws Throwable {
        try {
            explorePage.clicksOnTheAnyOneOfTheCardInLatestScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on the any one of the card in latest screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking the any one of the card in latest screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on page filters in latest screen$")
    public void userClicksOnPageFiltersInLatestScreen() throws Throwable {
        try {
            explorePage.clicksOnPageFiltersInLatestScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on page filters in latest screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking page filters in latest screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the latest item in latest screen$")
    public void userValidatesTheLatestItemInLatestScreen() throws Throwable {
        try {
            boolean flag = explorePage.validatesHeroCardInLatestScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validates the latest item in latest screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the latest item in latest screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on share icon in any of the Latest cards$")
    public void userClicksOnShareIconInAnyOfTheLatestCards() throws Throwable {
        try {
            explorePage.clicksOnShareIconInAnyOfTheLatestCards();
            ExtentsReportManager.extentReportLogging("info", "Clicked on share icon in any of the Latest cards");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on share icon in any of the Latest cards<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on message icon in share screen$")
    public void userClicksOnMessageIconInShareScreen() throws Throwable {
        try {
            explorePage.clicksOnMessageIconInShareScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on message icon in share screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking message icon in share screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on cross icon in latest card$")
    public void userClicksOnCrossIconInLatestCard() throws Throwable {
        try {
            explorePage.clicksOnCrossIconInLatestCard();
            ExtentsReportManager.extentReportLogging("info", "Clicked on cross icon in latest card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on cross icon in latest card<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on united now in bottom tab in ios$")
    public void userClicksOnUnitedNowInBottomTabInIos() throws Throwable {
        try {
            explorePage.clicksOnUnitedNowInBottomTabInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on united now in bottom tab in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on united now in bottom tab in ios<br />" + e);
            throw e;
        }
    }

    @And("^user search players or updates \"([^\"]*)\" in ios$")
    public void userSearchPlayersOrUpdatesInIos(String ExploreSearchText) throws Throwable {
        try {
            explorePage.searchPlayersOrUpdatesInIos(ExploreSearchText);
            ExtentsReportManager.extentReportLogging("info", "search players or updates ExploreSearchText in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in search players or updates ExploreSearchText in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search Auto suggestions is displayed in ios$")
    public void userValidatesSearchAutoSuggestionsIsDisplayed() throws Throwable {
        try {
            boolean flag = explorePage.validatesSearchAutoSuggestionsIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated search Auto suggestions is displayed in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating search Auto suggestions is displayed in ios<br />" + e);
            throw e;
        }
    }

    @And("^user validates without data in search screen ios$")
    public void userValidatesWithoutDataInSearchScreenIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesWithoutDataInSearchScreenIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated without data in search screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating without data in search screen ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on a player in search suggestions in ios$")
    public void userClicksOnAPlayerInSearchSuggestionsInIos() throws Throwable {
        try {
            explorePage.clicksOnPlayersInSearchSuggestions();
            ExtentsReportManager.extentReportLogging("info", "Clicked on  a player in search suggestions in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking  a player in search suggestions in ios<br />" + e);
            throw e;
        }
    }

    @And("^user enters image in search for \"([^\"]*)\" in page filter ios$")
    public void userEntersImageInSearchForInPageFilterIos(String ImageContent) throws Throwable {
        try {
            explorePage.enterImageInSearchForImageContentInPageFilter(ImageContent);
            ExtentsReportManager.extentReportLogging("info",
                    "entered image in search for ImageContent in page filter ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in entering image in search for ImageContent in page filter ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for image in ios$")
    public void userValidatesSearchResultForImageInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesSearchResultForImage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated search result for image in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating search result for image in ios<br />" + e);
            throw e;
        }
    }

    @And("^user enters Videos in search for \"([^\"]*)\" in page filter ios$")
    public void userEntersVideosInSearchForInPageFilterIos(String VideoContent) throws Throwable {
        try {
            explorePage.enterImageInSearchForVideosContentInPageFilter(VideoContent);
            ExtentsReportManager.extentReportLogging("info",
                    "entered Videos in search for VideoContent in page filter ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in entering Videos in search for VideoContent in page filter ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for Videos in ios$")
    public void userValidatesSearchResultForVideosInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesSearchResultForVideos();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated search result for Videos in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating search result for Videos in ios<br />" + e);
            throw e;
        }
    }

    @And("^user enters News in search for \"([^\"]*)\" in page filter ios$")
    public void userEntersNewsInSearchForInPageFilterIos(String NewsContent) throws Throwable {
        try {
            explorePage.enterImageInSearchForNewsContentInPageFilter(NewsContent);
            ExtentsReportManager.extentReportLogging("info",
                    "entered News in search for NewsContent in page filter ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in entering News in search for NewsContent in page filter ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for News in ios$")
    public void userValidatesSearchResultForNewsInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesSearchResultForNews();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated search result for News in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating search result for News in ios<br />" + e);
            throw e;
        }
    }

    @And("^user enters All in search for \"([^\"]*)\" in page filter ios$")
    public void userEntersAllInSearchForInPageFilterIos(String AllContent) throws Throwable {
        try {
            explorePage.enterImageInSearchForAllContentInPageFilter(AllContent);
            ExtentsReportManager.extentReportLogging("info", "entered All in search for AllContent in page filter ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in entering All in search for AllContent in page filter ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates search result for All in ios$")
    public void userValidatesSearchResultForAllInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesSearchResultForAll();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validating search result for All in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating search result for All in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on content related to search result in ios$")
    public void userClicksOnContentRelatedToSearchResult() throws Throwable {
        try {
            explorePage.clicksOnContentRelatedToSearchResult();
            ExtentsReportManager.extentReportLogging("info", "Clicked on content related to search result in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on content related to search result in ios<br />" + e);
            throw e;
        }
    }

    @And("^user search players or updates \"([^\"]*)\"Related Searches in ios$")
    public void userSearchPlayersOrUpdatesRelatedSearchesInIos(String ExploreSearchText) throws Throwable {
        try {
            explorePage.searchPlayersOrUpdatesRelatedSearches(ExploreSearchText);
            ExtentsReportManager.extentReportLogging("info",
                    "searched players or updates ExploreSearchText Related Searches in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in searching players or updates ExploreSearchText Related Searches in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the search result in ios$")
    public void userValidatesTheSearchResultInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesSearchResultisDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated the search result in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the search result in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the search result of the player in ios$")
    public void userValidatesTheSearchResultOfThePlayerInIos(DataTable table) throws Throwable {
        try {
            String expTitleSearchResult = table.cell(1, 0);
            String actualTitleSearchResult = explorePage.getTitleTextSearchResultOfPlayers();
            soft.assertEquals(actualTitleSearchResult, expTitleSearchResult);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated the search result of the player in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the search result of the player in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates page filters in fixtures and tables screen in ios$")
    public void userValidatesPageFiltersInFixturesAndTablesScreenInIos(DataTable table) throws Throwable {
        try {
            String expUnited = table.cell(1, 0);
            String expAllTeams = table.cell(1, 1);
            String actualUnited = explorePage.validateUnitedTabFixtures();
            String actualAllTeams = explorePage.validateAllTeamsTabFixtures();
            soft.assertEquals(actualUnited, expUnited);
            soft.assertEquals(actualAllTeams, expAllTeams);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validates page filters in fixtures and tables screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating page filters in fixtures and tables screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the Old Match Results in ios$")
    public void userValidatesTheOldMatchResultsInIos(DataTable table) throws Throwable {
        try {
            explorePage.scrollDownToMatchResults();
            String expOldMatchResult = table.cell(1, 0);
            String actualOldMatchResult = explorePage.validateOldMatchResultsInFixtures();
            soft.assertEquals(actualOldMatchResult, expOldMatchResult);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated the Old Match Results in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the Old Match Results in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on \"([^\"]*)\" team in Fixtures page$")
    public void userClicksOnTeamInFixturesPage(String TeamFilters) throws Throwable {
        try {
            explorePage.clicksPlayersCatogaryFromTab(TeamFilters);
            ExtentsReportManager.extentReportLogging("info", "Clicked on TeamFilters team in Fixtures page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on TeamFilters team in Fixtures page<br />" + e);
            throw e;
        }
    }

    @And("^user click on men drop down and validates team filters in fixtures ios$")
    public void userClickOnMenDropDownAndValidatesTeamFiltersInFixturesIos(DataTable table) throws Throwable {
        try {
            unitedNowPage.clickMenDropDown();
            String expMen = table.cell(1, 0);
            String expWomen = table.cell(1, 1);
            String expUnder21s = table.cell(1, 2);
            String expUnder18s = table.cell(1, 3);
            String expGirls = table.cell(1, 4);
            String actualMen = unitedNowPage.getMenInDropDownText();
            String actualWomen = unitedNowPage.getAWomenInDropDownText();
            String actualUnder21s = unitedNowPage.getUnder21sInDropDownText();
            String actualUnder18s = unitedNowPage.getUnder18sInDropDownText();
            String actualGirls = unitedNowPage.getGirlsTabInDropDownText();
            soft.assertEquals(actualMen, expMen);
            soft.assertEquals(actualWomen, expWomen);
            soft.assertEquals(actualUnder21s, expUnder21s);
            soft.assertEquals(actualUnder18s, expUnder18s);
            soft.assertEquals(actualGirls, expGirls);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "Clicked on men drop down and validates team filters in fixtures ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking men drop down and validates team filters in fixtures ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the table page filter all teams$")
    public void userValidatesTheTablePageFilterAllTeams(DataTable table) throws Throwable {
        try {
            boolean flag = explorePage.validateTheTablePageFilterAllTeams(table.cell(1, 0));
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated the table page filter all teams");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the table page filter all teams<br />" + e);
            throw e;
        }
    }

    @Then("^user validates match live stats and season stats for players in ios$")
    public void userValidatesMatchLiveStatsAndSeasonStatsForPlayersInIos(DataTable table) throws Throwable {
        try {
            String expMatchLive = table.cell(1, 0);
            String expSeasonStats = table.cell(1, 1);
            String actualMatchLive = explorePage.validatesMatchLiveStats();
            String actualSeasonStats = explorePage.validatesSeasonStatsForPlayers();
            soft.assertEquals(actualMatchLive, expMatchLive);
            soft.assertEquals(actualSeasonStats, expSeasonStats);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated match live stats and season stats for players in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating match live stats and season stats for players in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on view more btn in palyers screen ios$")
    public void userClicksOnViewMoreBtnInPalyersScreenIos() throws Throwable {
        try {
            explorePage.clickOnViewMoreBtnInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on view more btn in palyers screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on view more btn in palyers screen ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the search page in ios$")
    public void userValidatesTheSearchPageInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesTheSearchPageInIosIsDisplayed();
            soft.assertTrue(flag);
            explorePage.clicksOnExitBtnInSearchpage();
            ExtentsReportManager.extentReportLogging("info", "validated the search page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the search page in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the share icon in players screen in ios$")
    public void userValidatesTheShareIconInPlayersScreenInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesTheShareIconInPlayersScreenInIosDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated the share icon in players screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the share icon in players screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on share icon in players screen ios$")
    public void userClicksOnShareIconInPlayersScreenIos() throws Throwable {
        try {
            explorePage.clickOnShareIconInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on share icon in players screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on share icon in players screen ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on profile stats in players screen ios$")
    public void userClicksOnProfileStatsInPlayersScreenIos() throws Throwable {
        try {
            explorePage.clickOnProfileStatsInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on profile stats in players screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking setting icon on top right of the page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on stats tab in players screen ios$")
    public void userClicksOnStatsTabInPlayersScreenIos() throws Throwable {
        try {
            explorePage.clickOnStatsTabInPlayersScreenIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on stats tab in players screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on stats tab in players screen ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on EighteenS tab in ios$")
    public void userClicksOnEighteenSTabInIos() throws Throwable {
        try {
            unitedNowPage.clickOnEighteenSTabInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on EighteenS tab in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on EighteenS tab in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user clicks on Girls team and validates the under girls match schedule in ios$")
    public void userClicksOnGirlsTeamAndValidatesTheUnderGirlsMatchScheduleInIos(DataTable table) throws Throwable {
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
            ExtentsReportManager.extentReportLogging("info",
                    "Clicked on Girls team and validates the under girls match schedule in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Girls team and validates the under girls match schedule in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the items in history page ios$")
    public void userValidatesTheItemsInHistoryPageIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesTheItemsInHistoryPageIosDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated the items in history page ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the items in history page ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on any one of the history item in ios$")
    public void userClicksOnAnyOneOfTheHistoryItemInIos() throws Throwable {
        try {
            explorePage.clickOnAnyOneOfTheHistoryItemInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on any one of the history item in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on any one of the history item in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the CTA history item in ios$")
    public void userValidatesTheCTAHistoryItemInIos() throws Throwable {
        try {
            boolean flag = explorePage.validatesTheCTAHistoryItemDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated the CTA history item in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the CTA history item in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Table CTA Fixtures and tables page in ios$")
    public void userClicksOnTableCTAFixturesAndTablesPageInIos() throws Throwable {
        try {
            explorePage.clickOnTableCTAFixturesAndTablesPageInIos();
            explorePage.clickOnTableCTA();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Table CTA Fixtures and tables page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Table CTA Fixtures and tables page in ios<br />" + e);
            throw e;
        }
    }

    @And("^user selects a latest video in latest listing page in ios$")
    public void userSelectsALatestVideoInLatestListingPageInIos() throws Throwable {
        try {
            explorePage.selectsALatestVideoInLatestListingPage();
            ExtentsReportManager.extentReportLogging("info", "selected a latest video in latest listing page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in selecting a latest video in latest listing page in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the video playing in video destination page in ios$")
    public void userValidatesTheVideoPlayingInVideoDestinationPageInIos() throws Throwable {
        try {
            explorePage.clicksLatestVideoInListingPage();
            boolean flag = explorePage.validatesTheVideoPlayingInVideoDestinationPageDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info",
                    "validated the video playing in video destination page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the video playing in video destination page in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page in ios$")
    public void userClicksOnBuyTicketHospitalityTickeyInfoCTAInFixturesPageInIos() throws Throwable {
        try {
            explorePage.scrollDowToBuyTicketHospitalityTickeyInfoCTAInFixturesPageInIos();
            explorePage.clicksOnTicketsInfoBtnInIos();
            ExtentsReportManager.extentReportLogging("info",
                    "Clicked on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on match result in fixtures screen ios$")
    public void userClicksOnMatchResultInFixturesScreenIos() throws Throwable {
        try {
            explorePage.scrollDownToMatchResults();
            ExtentsReportManager.extentReportLogging("info", "Clicked on match result in fixtures screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on match result in fixtures screen ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on post match analysis in united screen ios$")
    public void userClicksOnPostMatchAnalysisInUnitedScreenIos() throws Throwable {
        try {
            explorePage.clicksOnPostMatchAnalysisInUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on post match analysis in united screen ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on post match analysis in united screen ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates match center in ios$")
    public void userValidatesMatchCenterInIos(DataTable table) throws Throwable {
        try {
            String expMatchCenter = table.cell(1, 0);
            String actualMatchCenter = explorePage.validateMatchCenter();
            soft.assertEquals(actualMatchCenter, expMatchCenter);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated match center in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating match center in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on cross icon in tickets page ios$")
    public void userClicksOnCrossIconInTicketsPageIos() throws Throwable {
        try {
            explorePage.clicksOnBackInTicketsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on cross icon in tickets page ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking cross icon in tickets page ios<br />" + e);
            throw e;
        }
    }

    @And("^user initiates the Ios Tablet Session$")
    public void userInitiatesTheIosTabletSession() throws Throwable {
        try {
            new AppiumDriverManager().initializeIosDriverTablet();
            ExtentsReportManager.extentReportLogging("info", "initiated the Ios Tablet Session");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in initiating the Ios Tablet Session<br />" + e);
            throw e;
        }
    }

    @And("user validates popular and categories section in the search screen in ios")
    public void userValidatesPopularAndCategoriesSectionInTheSearchScreenInIos() {
        try{
            soft.assertTrue(explorePage.validatesPopularAndCategoriesSectionInTheSearchScreen());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the popular and categories in search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of popular and categories in search screen<br />" + e);
            throw e;
        }
    }

    @And("user validates the popular content in the search screen in ios")
    public void userValidatesThePopularContentInTheSearchScreenInIos() {
        try{
            ArrayList<String> actualPopularContent=explorePage.getsPopularContentInTheSearchScreen();
            System.out.println(actualPopularContent);
            ExtentsReportManager.extentReportLogging("info", "Validated the popular content in the search screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of popular and categories in search screen<br />" + e);
            throw e;
        }
    }
    
    @And("^user enters less than three character in search for \"([^\"]*)\" in page filter in ios$")
    public void userEnterslessThanThreeCharacterInSearchForInPageFilter1InIos(String lessthanthreecharacter) throws Exception {
        try {
            explorePage.enterlessthanTwoCharacter(lessthanthreecharacter);
            ExtentsReportManager.extentReportLogging("info", "Entered news in search for news content in page filter ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering news in search for news content in page filter<br />" + e);
            throw e;
        }
    }
    
    @Then("^user validate no suggestion are displayed in ios$")
    public void userValidatesNoSuggestionSearchResultAreIsDisplayedInIos() {
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
    
    @And("^user enters three character in search for \"([^\"]*)\" in page filter in ios$")
    public void userEntersThreeCharacterInSearchForInPageFilter1InIos(String three) throws Exception {
        try {
            explorePage.enterThreeCharacter(three);
            ExtentsReportManager.extentReportLogging("info", "Entered news in search for news content in page filter ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in entering news in search for news content in page filter<br />" + e);
            throw e;
        }
    }
    
    @Then("^user validate suggestion are displayed in ios$")
    public void userValidatesSuggestionSearchResultAreIsDisplayedInIos() {
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
    
    @And("user clicks we have improved pop-up message in ios")
    public void userClicksOnWeHaveImprovedPopUpMessageInIos() {
        try {
            explorePage.clicksOnOkBackButtonInWeHaveImprovedInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked on ok in the cookies screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking ok in the cookies screen in ios<br />" + e);
            throw e;
        }
    }
    
    @And("^user select first item from suggestion in ios$")
    public void userSelectFirstitemFromSuggestionsInIos() {
        try {
            explorePage.userClickOnFirstItemFromListInIOS();
            ExtentsReportManager.extentReportLogging("info", "user select first item from suggestions");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error itmes from search auto suggestions <br />" + e);
            throw e;
        }
    }
    
    @And("^user validate data in search screen in ios$")
    public void userValidateDataInSearchScreenInIos() throws Exception {
    	try {
            boolean flag = explorePage.validateDataInSerchResult();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated search auto suggestions is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search auto suggestions <br />" + e);
            throw e;
        }
    }
    
    @And("^user search all data or updates \"([^\"]*)\" in ios$")
    public void userSearchAllDataInIos(String ExploreSearchText) throws Throwable {
        try {
            explorePage.searchAllDataInIos(ExploreSearchText);
            ExtentsReportManager.extentReportLogging("info", "search players or updates ExploreSearchText in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in search players or updates ExploreSearchText in ios<br />" + e);
            throw e;
        }
    }
        @Then("^user verify text in search screen in ios$")
        public void userVerifyTextInSsearchScreenInIos(DataTable table) throws Throwable {
            try {
                String expAll = table.cell(1, 0);
                String actAll = explorePage.getAll();
                soft.assertEquals(actAll, expAll);
                
                String expMutv = table.cell(1, 1);
                String actMutv = explorePage.getMutv();
                soft.assertEquals(actMutv, expMutv);
                
                String expNews = table.cell(1, 2);
                String actNews = explorePage.getNews();
                soft.assertEquals(actNews, expNews);
                
                String expVideos = table.cell(1, 3);
                String actVideos = explorePage.getVideos();
                soft.assertEquals(actVideos, expVideos);
                
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("pass", "verified All, Mutv, news and Videos text");
                
            } catch (AssertionError e) {
                ExtentsReportManager.extentReportLogging("fail", "Error in verifying the All , Mutv, News and Videos screen in ios<br />" + e);
                throw e;
            }
        }

		@And("^user checks for CBS content in search result in ios$")
		public void userChecksForCBSContentInSearchResultInIos() throws Throwable {
			try {
				explorePage.checksForCBSContentInSearchResult();
				ExtentsReportManager.extentReportLogging("info", "Selected the video and check CBS badge in ios");
			} catch (AssertionError e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Error in selectinh the video and check CBS badge in ios" + e);
				throw e;
			}
		}

		@And("^user checks for CBR content in search result in ios$")
		public void userChecksForCBRContentInSearchResultInIos() throws Throwable {
			try {
				explorePage.checksForCBRContentInSearchResult();
//				explorePage.clicksOnCBRContent();
				ExtentsReportManager.extentReportLogging("info", "Selected the video and check CBS badge in ios");
			} catch (AssertionError e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Error in selectinh the video and check CBS badge in ios" + e);
				throw e;
			}
		}

}
