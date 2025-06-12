package org.bdd.stepdef.ios;

import java.util.ArrayList;
import java.util.List;

import org.bdd.pages.*;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.GlobalParams;
import org.bdd.utils.apiResponse.MyUnitedAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyUnitedIosStepDef {
    public SoftAssert soft = new SoftAssert();
    public IdmPage idmPage = new IdmPage();
    public MyUnitedPage myUnitedPage = new MyUnitedPage();
    public ExplorePage explorePage = new ExplorePage();
    public MyUnitedAPIResponse myUnitedAPIResponse = new MyUnitedAPIResponse();

    @And("^user click on Rate app in the General Screen in ios$")
    public void userClickOnRateAppInTheGeneralScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnRateAppInTheGeneralScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on Rate app in the General Screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Rate app in the General Screen in ios <br />" + e);
            throw e;
        }
    }

    @And("^user click on Language in the General Screen in ios$")
    public void userClickOnLanguageInTheGeneralScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnLanguageInTheGeneralScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on Language in the General Screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Language in the General Screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on chinese Language in langugae Screen in ios$")
    public void userClicksOnChineseLanguageInLangugaeScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnChineseLanguageInLangugaeScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on chinese Language in langugae Screen in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on chinese Language in langugae Screen in ios <br />" + e);

            throw e;

        }

    }

    @And("^user clicks on confirm button in Language Screen in ios$")
    public void userClicksOnConfirmButtonInLanguageScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnConfirmButtonInLanguageScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on confirm button in Language Screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on confirm button in Language Screen in ios <br />" + e);
            throw e;
        }
    }

    @Then("^user validates chinese calender Icon in ios$")
    public void userValidatesChineseCalenderIconInIos() throws Throwable {
        try {
            boolean flag = myUnitedPage.validateChineseCalenderIcon();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated chinese calender Icon in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating chinese calender Icon in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on My United in bottom tab which is in chinese Language in ios$")
    public void userClickOnMyUnitedInBottomTabWhichIsInChineseLanguageInIos() throws Throwable {
        try {
            myUnitedPage.clickOnMyUnitedInBottomTabWhichIsInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on My United in bottom tab which is in chinese Language in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on My United in bottom tab which is in chinese Language in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on setting icon on top righhand side which is in chinese Language in ios$")
    public void userClickOnSettingIconOnTopRighhandSideWhichIsInChineseLanguageInIos() throws Throwable {
        try {
            myUnitedPage.clickOnSettingIconInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on setting icon on top righhand side which is in chinese Language in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on setting icon on top righhand side which is in chinese Language in ios<br />"
                            + e);
            throw e;
        }
    }

    @And("^user click on GENERAL link in setting screen which is in chinese Language in ios$")
    public void userClickOnGENERALLinkInSettingScreenWhichIsInChineseLanguageInIos() throws Throwable {
        try {
            myUnitedPage.clickOnGENERALLinkInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on GENERAL link in setting screen which is in chinese Language in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on GENERAL link in setting screen which is in chinese Language in ios<br />"
                            + e);
            throw e;
        }
    }

    @And("^user click on Language in the General Screen which is in chinese Language in ios$")
    public void userClickOnLanguageInTheGeneralScreenWhichIsInChineseLanguageInIos() throws Throwable {
        try {
            myUnitedPage.clickOnLanguageGeneralInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on Language in the General Screen which is in chinese Language in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Language in the General Screen which is in chinese Language in ios <br />"
                            + e);
            throw e;
        }
    }

    @And("^user clicks on English Language in langugae Screen in ios$")
    public void userClicksOnEnglishLanguageInLangugaeScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnEnglishLanguageInLangugaeScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on English Language in langugae Screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on English Language in langugae Screen in ios <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on confirm button in Language Screen which is in chinese Language in ios$")
    public void userClicksOnConfirmButtonInLanguageScreenWhichIsInChineseLanguageInIos() throws Throwable {
        try {
            myUnitedPage.clickOnConfirmButtonInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on confirm button in Language Screen which is in chinese Language in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on confirm button in Language Screen which is in chinese Language in ios<br />"
                            + e);
            throw e;
        }
    }

    @Then("^user validates calender Icon in ios$")
    public void userValidatesCalenderIconInIos() throws Throwable {
        try {
            boolean flag = myUnitedPage.validateCalenderIcon();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated calender Icon in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating calender Icon in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Stickers icon in myunited screen in ios$")
    public void userClicksOnStickersIconInMyunitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnStickersIconInMyunitedScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on Stickers icon in myunited screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Stickers icon in myunited screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates My united Stickers text in inbox screen in ios$")
    public void userValidatesMyUnitedStickersTextInInboxScreenInIos(DataTable table) throws Throwable {
        try {
            String expMyMessages = table.cell(1, 0);
            String actualMyMessages = myUnitedPage.getMyMessageTitleText();
            soft.assertEquals(actualMyMessages, expMyMessages);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated My united Stickers text in inbox screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating My united Stickers text in inbox screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back button in Stickers screen in ios$")
    public void userClicksOnBackButtonInStickersScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnBackButtonInStickersScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on back button in Stickers screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on back button in Stickers screen in ios <br />" + e);
            throw e;
        }
    }

    @Then("^user validates My united text in myunited screen in ios$")
    public void userValidatesMyUnitedTextInMyunitedScreenInIos(DataTable table) throws Throwable {
        try {
            String expMyUnitedText = table.cell(1, 0);
            String actualMyUnitedText = myUnitedPage.getMyUnitedText();
            soft.assertEquals(actualMyUnitedText, expMyUnitedText);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated My united text in myunited screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating My united text in myunited screen in ios<br />" + e);
            throw e;
        }

    }

    @Then("^user validates my stickers carousel in My united screen in ios$")
    public void userValidatesMyStickersCarouselInMyUnitedScreenInIos() throws Throwable {
        try {
            String actualMyStickers = myUnitedPage.getMyStickersCarouselMyUnited();
            soft.assertEquals(actualMyStickers, "MY STICKERS");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated my stickers carousel in My united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating my stickers carousel in My united screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on view all button in ios$")
    public void userClicksOnViewAllButtonInIos() throws Throwable {
        try {
            myUnitedPage.clickOnViewAllButton();
            ExtentsReportManager.extentReportLogging("info", "clicked on view all button in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on view all button in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on first sticker in Stickers Screen in ios$")
    public void userClicksOnFirstStickerInStickersScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnFirstStickerInStickersScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on first sticker in Stickers Screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on first sticker in Stickers Screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user select print image from share option in ios$")
    public void userSelectPrintImageFromShareOptionInIos() throws Throwable {
        try {
            myUnitedPage.selectsPrintImageFromShareOptionInIos();
            ExtentsReportManager.extentReportLogging("info", "selected print image from share option in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in selecting print image from share option in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on share icon in print screen in ios$")
    public void userClickOnShareIconInPrintScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnShareIconInPrintScreenInIos();
            ExtentsReportManager.extentReportLogging("info", "clicked on share icon in print screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on share icon in print screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on Chromium in print screen$")
    public void userClickOnChromiumInPrintScreen() throws Throwable {
        try {
            myUnitedPage.clickOnChromiumInPrintScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on Chromium in print screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on Chromium in print screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates print screen in ios$")
    public void userValidatesPrintScreenInIos(DataTable table) throws Throwable {
        try {
            String expCancelIcon = table.cell(1, 0);
            String expOptionsIcon = table.cell(1, 1);
            String expShareIcon = table.cell(1, 2);
            String actualCancelIcon = myUnitedPage.getCancleIconText();
            String actualOptionsIcon = myUnitedPage.getOptionsIconText();
            String actualShareIcon = myUnitedPage.getShareIconText();
            soft.assertEquals(actualCancelIcon, expCancelIcon);
            soft.assertEquals(actualOptionsIcon, expOptionsIcon);
            soft.assertEquals(actualShareIcon, expShareIcon);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated print screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating print screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^navigates to the Stickers section in ios$")
    public void navigatesToTheStickersSectionInIos() throws Throwable {
        try {
            myUnitedPage.scrollDownToStickersIos();
            ExtentsReportManager.extentReportLogging("info", "navigated to the Stickers section in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in navigating to the Stickers section in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on close from notification in ios$")
    public void userClicksOnCloseFromNotificationInIos() throws Throwable {
        try {
            idmPage.clicksOnCloseFromNotification();
            ExtentsReportManager.extentReportLogging("info", "clicked on close from notification in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on close from notification in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Points this season card in My united screen in ios$")
    public void userValidatesPointsThisSeasonCardInMyUnitedScreenInIos() throws Throwable {
        try {
            String actualPointsThisSeason = myUnitedPage.getPointsThisSeasonCardTextMyUnited();
            soft.assertEquals(actualPointsThisSeason, "POINTS THIS SEASON, 0");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated Points this season card in My united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating Points this season card in My united screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Season card in My united screen in ios$")
    public void userClicksOnSeasonCardInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnSeasonCardInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on Season card in My united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on Season card in My united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates season card in ios$")
    public void userValidatesSeasonCardInIos(DataTable table) throws Throwable {
        try {
            String expPredictions = table.cell(1, 0);
            String expMyBestScore = table.cell(1, 1);
            String expMatches = table.cell(1, 2);

            String actualPredictions = myUnitedPage.getPredictionsTextSeasonCard();
            String actualMyBestScore = myUnitedPage.getMyBestScoreTextSeasonCard();
            String actualMatches = myUnitedPage.getMatchesTextSeasonCard();
            soft.assertEquals(actualPredictions, expPredictions);
            soft.assertEquals(actualMyBestScore, expMyBestScore);
            soft.assertEquals(actualMatches, expMatches);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated season card in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating season card in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in season card screen in ios$")
    public void userClicksOnBackIconInSeasonCardScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnBackIconInSeasonCardScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on back icon in season card screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on back icon in season card screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on get official membership CTA button in my united screen in ios$")
    public void userClicksOnGetOfficialMembershipCTAButtonInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnGetOfficialMembershipCTAButtonInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on get official membership CTA button in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on get official membership CTA button in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validate tickets title in get official membership screen in ios$")
    public void userValidateTicketsTitleInGetOfficialMembershipScreenInIos(DataTable table) throws Throwable {
        try {
            String expTickets = table.cell(1, 0);
            String actualTickets = myUnitedPage.getTicketsTitleInGetOfficialMembershipScreen();
            soft.assertEquals(actualTickets, expTickets);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated tickets title in get official membership screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating tickets title in get official membership screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on close icon in get official membership screen in ios$")
    public void userClickOnCloseIconInGetOfficialMembershipScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnCloseIconInGetOfficialMembershipScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on close icon in get official membership screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on close icon in get official membership screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on buy shirt CTA button in my united screen in ios$")
    public void userClickOnBuyShirtCTAButtonInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnBuyShirtCTAButtonInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on buy shirt CTA button in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on buy shirt CTA button in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates shop now is displayed in ios$")
    public void userValidatesShopNowIsDisplayedInIos() throws Throwable {
        try {
            boolean flag = myUnitedPage.getShopNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated shop now is displayed in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating shop now is displayed in ios<br />" + e);
            throw e;
        }
    }

    @And("^user navigates points screen in ios$")
    public void userNavigatesPointsScreenInIos() throws Throwable {
        try {
            myUnitedPage.navigatesPointsScreenInIos();
            ExtentsReportManager.extentReportLogging("info", "navigated points screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating points screen in ios<br />" + e);
            throw e;
        }
    }

    String actualTShirtNumber = "", expectedTshirtNumber = "";

    @And("^user updates the t shirt numbers at buttom of the screen and click on back to top button in ios$")
    public void userUpdatesTheTShirtNumbersAtButtomOfTheScreenAndClickOnBackToTopButtonInIos() throws Throwable {
        try {

            myUnitedPage.clickOnEditButtonIos();
            expectedTshirtNumber = myUnitedPage.settShirtNumber();
            myUnitedPage.clickOnSaveTshirtButton();
            myUnitedPage.clickOnBackToTopButton();
            ExtentsReportManager.extentReportLogging("info",
                    "updated the t shirt numbers at buttom of the screen and click on back to top button in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in updating the t shirt numbers at buttom of the screen and click on back to top button in ios<br />"
                            + e);
            throw e;
        }
    }

    @Then("^user validate t shirt number from the previous step in ios$")
    public void userValidateTShirtNumberFromThePreviousStepInIos() throws Throwable {
        try {
            actualTShirtNumber = myUnitedPage.getTshirtNumber();
            soft.assertEquals(actualTShirtNumber, expectedTshirtNumber);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated t shirt number from the previous step in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating t shirt number from the previous step in ios<br />" + e);
            throw e;
        }
    }

    @And("^user validate t shirt name is displayed in ios$")
    public void userValidateTShirtNameIsDisplayedInIos(DataTable table) throws Throwable {
        try {
            String expShirtName = table.cell(1, 0);
            String actualShirtName = myUnitedPage.getSirtNameMyUnited();
            soft.assertEquals(actualShirtName, expShirtName);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated t shirt name is displayed in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating t shirt name is displayed in ios<br />" + e);
            throw e;
        }
    }

    @And("^user navigates to app debut in ios$")
    public void userNavigatesToAppDebutInIos() throws Throwable {
        try {
            myUnitedPage.navigatesToAppDebutInIos();
            ExtentsReportManager.extentReportLogging("info", "navigated to app debut in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to app debut in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user scrolls down to validates this season card in My united now screen in ios$")
    public void userScrollsDownToValidatesThisSeasonCardInMyUnitedNowScreenInIos(DataTable table) throws Throwable {
        try {
            String expScoreCard = table.cell(1, 0);
            String expMyUnited = table.cell(1, 1);
            String actualScoreCard = myUnitedPage.getScoredCardThisSeason();
            String actualMyUnited = myUnitedPage.getMyUnitedThisSeason();
            soft.assertEquals(actualScoreCard, expScoreCard);
            soft.assertEquals(actualMyUnited, expMyUnited);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "scrolled down to validates this season card in My united now screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in scrolling down to validates this season card in My united now screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on total score card in my united screen in ios$")
    public void userClicksOnTotalScoreCardInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnTotalScoreCard();
            ExtentsReportManager.extentReportLogging("info", "clicked on total score card in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on total score card in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates content in total score card in ios$")
    public void userValidatesContentInTotalScoreCardInIos(DataTable table) throws Throwable {
        try {
            String expMyUnitedTotalScore = table.cell(1, 0);
//		String expPrediction = table.cell(1, 1);
//		String expDailySteaks = table.cell(1, 2);
//		String expAppearance = table.cell(1, 3);
            String actualMyUnitedTotalScore = myUnitedPage.getTotalScoreCard();
//		String actualPrediction = myUnitedPage.getPredictionTotalScoreCard();
//		String actualDailySteaks = myUnitedPage.getDailyStreaksTotalScoreCard();
//		String actualApprearance = myUnitedPage.getAppearanceTotalScoreCard();
            soft.assertEquals(actualMyUnitedTotalScore, expMyUnitedTotalScore);
//		soft.assertEquals(actualPrediction, expPrediction);
//		soft.assertEquals(actualDailySteaks, expDailySteaks);
//		soft.assertEquals(actualApprearance, expAppearance);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated content in total score card in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating content in total score card in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in total score card in ios$")
    public void userClicksOnBackIconInTotalScoreCardInIos() throws Throwable {
        try {
            myUnitedPage.clickOnBackIconInTotalScoreCard();
            ExtentsReportManager.extentReportLogging("info", "clicked on back icon in total score card in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on back icon in total score card in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validate daily streaks card in my united screen in ios$")
    public void userValidateDailyStreaksCardInMyUnitedScreenInIos(DataTable table) throws Throwable {
        try {
            String expDailyStreaks = table.cell(1, 0);
            String expConsecutive = table.cell(1, 1);
            String expView = table.cell(1, 2);
            String actualDailyStreaks = myUnitedPage.getDailyStreaksInDailyStreaksCard();
            String actualConsecutive = myUnitedPage.getConsecutiveDaysinTheAppInDailyStreaksCard();
            String actualView = myUnitedPage.getViewInDailyStreaksCard();
            soft.assertEquals(actualDailyStreaks, expDailyStreaks);
            soft.assertEquals(actualConsecutive, expConsecutive);
            soft.assertEquals(actualView, expView);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated daily streaks card in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating daily streaks card in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on daily streaks card in my united screen in ios$")
    public void userClicksOnDailyStreaksCardInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnViewButtonInDailyStreaksCard();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on daily streaks card in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on daily streaks card in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates content in daily streaks card in ios$")
    public void userValidatesContentInDailyStreaksCardInIos(DataTable table) throws Throwable {
        try {
            String expDailyStreaks = table.cell(1, 0);
//		String expBestScore = table.cell(1, 1);
            String expShare = table.cell(1, 1);
            String actualDailyStreaks = myUnitedPage.getDailyStreaksScreenTitleInDailyStreaksCard();
//		String actualBestScore = myUnitedPage.getBestScoreTextInRectangleInDailyStreaksCard();
            String actualShare = myUnitedPage.getShareInDailyStreaksCard();
            soft.assertEquals(actualDailyStreaks, expDailyStreaks);
//		soft.assertEquals(actualBestScore, expBestScore);
            soft.assertEquals(actualShare, expShare);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated content in daily streaks card in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating content in daily streaks card in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in daily streaks card in ios$")
    public void userClicksOnBackIconInDailyStreaksCardInIos() throws Throwable {
        try {
            myUnitedPage.clickBackIconInDailyStreaksCard();
            ExtentsReportManager.extentReportLogging("info", "clicked on back icon in daily streaks card in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on back icon in daily streaks card in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates appearance card in my united screen in ios$")
    public void userValidatesAppearanceCardInMyUnitedScreenInIos(DataTable table) throws Throwable {
        try {
            String expAppearance = table.cell(1, 0);
            String expThisSeason = table.cell(1, 1);
            String expView = table.cell(1, 2);
            String actualAppearance = myUnitedPage.getAppearanceTitleAppearancecard();
            String actualThisSeason = myUnitedPage.getthisAppearancecard();
            String actualView = myUnitedPage.getViewAppearancecard();
            soft.assertEquals(actualAppearance, expAppearance);
            soft.assertEquals(actualThisSeason, expThisSeason);
            soft.assertEquals(actualView, expView);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated appearance card in my united screen in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating appearance card in my united screen in ios<br />" + e);

            throw e;

        }

    }

    @And("^user clicks on appearance card in my united screen in ios$")
    public void userClicksOnAppearanceCardInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnViewButtonAppearancecard();
            ExtentsReportManager.extentReportLogging("info", "clicked on appearance card in my united screen in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on appearance card in my united screen in ios<br />" + e);

            throw e;

        }

    }

    @Then("^user validates content in appearance card in ios$")
    public void userValidatesContentInAppearanceCardInIos(DataTable table) throws Throwable {
        try {
            String expAppearance = table.cell(1, 0);
            String expShare = table.cell(1, 1);
            String actualAppearance = myUnitedPage.getAppearanceInsideTitleAppearancecard();
            String actualShare = myUnitedPage.getShareAppearanceCard();
            soft.assertEquals(actualAppearance, expAppearance);
            soft.assertEquals(actualShare, expShare);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated content in appearance card in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating content in appearance card in ios<br />" + e);

            throw e;

        }

    }

    @And("^user clicks on back Icon in appearance card in ios$")
    public void userClicksOnBackIconInAppearanceCardInIos() throws Throwable {
        try {
            myUnitedPage.clickBackIconAppearanceCard();
            ExtentsReportManager.extentReportLogging("info", "clicked on back Icon in appearance card in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on back Icon in appearance card in ios<br />" + e);
            throw e;
        }
    }

    @And("^user scrolls down to my united All points season card$")
    public void userScrollsDownToMyUnitedAllPointsSeasonCard() throws Throwable {
        try {
            myUnitedPage.scrollsDownToMyUnitedAllPointsSeasonCard();
            ExtentsReportManager.extentReportLogging("info", "scrolled down to my united All points season card");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in scrolling down to my united All points season card<br />" + e);

            throw e;

        }

    }

    @And("^user scrolls down to favorite player screen in ios$")
    public void userScrollsDownToFavoritePlayerScreenInIos() throws Throwable {
        try {
            myUnitedPage.scrollsDownToFavoritePlayerScreenInIos();
            ExtentsReportManager.extentReportLogging("info", "scrolled down to favorite player screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in scrolling down to favorite player screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on edit button in my united screen in ios$")
    public void userClicksOnEditButtonInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnEditButtonInFavoritePlayers();
            ExtentsReportManager.extentReportLogging("info", "clicked on edit button in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on edit button in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the below details in choose player screen in ios$")
    public void userValidatesTheBelowDetailsInChoosePlayerScreenInIos(DataTable table) throws Throwable {
        try {
            String expChoosePlayer = table.cell(1, 0);
            String expMen = table.cell(1, 1);
            String expWomen = table.cell(1, 2);
            String actualChoosePlayer = myUnitedPage.getChoosePlayerInFavPlayerScreen();
            String actualMen = myUnitedPage.getMenInFavPlayerScreen();
            String actualWomen = myUnitedPage.getWomenInFavPlayerScreen();
            soft.assertEquals(actualChoosePlayer, expChoosePlayer);
            soft.assertEquals(actualMen, expMen);
            soft.assertEquals(actualWomen, expWomen);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the below details in choose player screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the below details in choose player screen in ios<br />" + e);
            throw e;
        }
    }
    static String playerName;
    @And("^user selects a favorite player in players screen in ios$")
    public void userSelectsAFavoritePlayerInPlayersScreenInIos() throws Throwable {
        try {
            playerName=myUnitedPage.clickOnFavoritePlayerInPlayersScreen();
            ExtentsReportManager.extentReportLogging("info", "selected a favorite player in players screen in ios: "+playerName);
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail","Error in selecting a favorite player in players screen in ios<br />" + e);
            throw e;
        }

    }

    @Then("^user validates player details updated in my united screen in ios$")
    public void userValidatesPlayerDetailsUpdatedInMyUnitedScreenInIos(DataTable table) throws Throwable {
        try {
//            String expPlayerName = table.cell(1, 0);
            String expPlayerName = playerName;
            String expBuyShirt = table.cell(1, 0);
            String actualPlayerName = myUnitedPage.getPlayerNameInUnitedScreen();
            String actualBuyShirt = myUnitedPage.getBuyShirtButtonScreen();
            soft.assertEquals(actualPlayerName.replaceAll(" ",""), expPlayerName.replaceAll(" ",""));
            soft.assertEquals(actualBuyShirt, expBuyShirt);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated player details updated in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating player details updated in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the star icon is displayed in ios$")
    public void userValidatesTheStarIconIsDisplayedInIos() throws Throwable {
        try {
            myUnitedPage.validatesTheStarIconInsDisplayed();
            ExtentsReportManager.extentReportLogging("info", "validated the star icon is displayed in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the star icon is displayed in ios<br />" + e);
            throw e;
        }
    }

    @And("^clicks on  buy shirt button in my united screen in ios$")
    public void clicksOnBuyShirtButtonInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnBuyShirtButtonInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on  buy shirt button in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on  buy shirt button in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates shop page in ios$")
    public void userValidatesShopPageInIos(DataTable table) throws Throwable {
        try {
            String expShop = table.cell(1, 0);
            String actualShop = myUnitedPage.getShopTitleShopScreen();
            soft.assertEquals(actualShop, expShop);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated shop page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating shop page in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on cross icon in shop screen in ios$")
    public void userClickOnCrossIconInShopScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnCrossIconInShopScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on cross icon in shop screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on cross icon in shop screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on edit icon in my united screen in ios$")
    public void userClickOnEditIconInMyUnitedScreenInIos() throws Throwable {
        try {
//		myUnitedPage.clickOnMyUnitedBtn();
            myUnitedPage.clickOnEditIconInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on edit icon in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on edit icon in my united screen in ios<br />" + e);
            throw e;
        }
    }
    static String playerName2;
    @And("^user edits the favorite player in player screen in ios$")
    public void userEditsTheFavoritePlayerInPlayerScreenInIos() throws Throwable {
        try {
             playerName2=myUnitedPage.clickEditsTheFavoritePlayerInPlayerScreen();
            ExtentsReportManager.extentReportLogging("info", "edited the favorite player in player screen in ios:"+playerName2);
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in editing the favorite player in player screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates edited player details in my united screen in ios$")
    public void userValidatesEditedPlayerDetailsInMyUnitedScreenInIos() throws Throwable {
        try {
            String expPlayerName = playerName2;
            String actualPlayerName = myUnitedPage.getEditedPlayerNameInMyUnitedScreen();
            String actualCountryFlag = myUnitedPage.getCountryFlagMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info","Actual player "+actualPlayerName+"<br />Expected Player"+expPlayerName);
            soft.assertEquals(actualPlayerName.replaceAll(" ",""), expPlayerName.replaceAll(" ",""));
            if(!actualCountryFlag.equalsIgnoreCase("noFlag")) {
                ExtentsReportManager.extentReportLogging("info", "Flag displayed for the player");
            }else {
                ExtentsReportManager.extentReportLogging("info", "No flag displayed for the player");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated edited player details in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail","Error in validating edited player details in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on country flag in my united screen in ios$")
    public void userClicksOnCountryFlagInMyUnitedScreenInIos() throws Throwable {
        try {
            myUnitedPage.clickOnCountryFlagInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on country flag in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on country flag in my united screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on notification icon in settings screen in ios$")
    public void userClicksOnNotificationIconInSettingsScreenInIos() throws Throwable {
        try {
            explorePage.clicksOnNotificationIconInSettingsScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on notification icon in settings screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on notification icon in settings screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the given alerts in notifications screen in ios$")
    public void userValidatesTheGivenAlertsInNotificationsScreenInIos(DataTable table) throws Throwable {
        try {
            String expUnitedNowAlertText = table.cell(1, 0);
            String expMatchAlertText = table.cell(1, 1);
            String actualUnitedNowAlertText = explorePage.getUntiedNowAlertsTextNotificationPage();
            String actualMatchAlertText = explorePage.getMatchAlertsTextNotificationPage();
            soft.assertEquals(actualUnitedNowAlertText, expUnitedNowAlertText);
            soft.assertEquals(actualMatchAlertText, expMatchAlertText);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the given alerts in notifications screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the given alerts in notifications screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on united now alert in notification screen in ios$")
    public void userClicksOnUnitedNowAlertInNotificationScreenInIos() throws Throwable {
        try {
            explorePage.clicksOnUnitedNowAlertInNotificationScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on united now alert in notification screen in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on united now alert in notification screen in ios<br />" + e);

            throw e;

        }

    }

    @And("^user validates the general alerts in united now alerts screenin ios$")
    public void userValidatesTheGeneralAlertsInUnitedNowAlertsScreeninIos() throws Throwable {
        try {
            explorePage.validatesTheGeneralAlerts();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the general alerts in united now alerts screenin ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the general alerts in united now alerts screenin ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back button in United now alerts screen in ios$")
    public void userClicksOnBackButtonInUnitedNowAlertsScreenInIos() throws Throwable {
        try {
            explorePage.clicksOnBackButtonInUnitedNowAlertsScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on back button in United now alerts screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on back button in United now alerts screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on match alert in notification screenin ios$")
    public void userClicksOnMatchAlertInNotificationScreeninIos() throws Throwable {
        try {
            explorePage.clicksOnMatchAlertInNotificationScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on match alert in notification screenin ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on match alert in notification screenin ios<br />" + e);
            throw e;
        }
    }

    @And("^user validates the match alerts in match alerts screen in ios$")
    public void userValidatesTheMatchAlertsInMatchAlertsScreenInIos() throws Throwable {
        try {
            explorePage.validatesTheMatchAlertsInMatchAlertsScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the match alerts in match alerts screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the match alerts in match alerts screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on latest alert switch in united now alerts screen in ios$")
    public void userClickOnLatestAlertSwitchInUnitedNowAlertsScreenInIos() throws Throwable {
        try {
            explorePage.clickOnLatestAlertSwitchInUnitedNowAlertsScreen();
            ExtentsReportManager.extentReportLogging("info",
                    "clicked on latest alert switch in united now alerts screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on latest alert switch in united now alerts screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user selects go to settings from enable alerts dialog box in ios$")
    public void userSelectsGoToSettingsFromEnableAlertsDialogBoxInIos() throws Throwable {
        try {
            explorePage.selectsGoToSettingsFromEnableAlertsDialogBox();
            ExtentsReportManager.extentReportLogging("info",
                    "selected go to settings from enable alerts dialog box in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in selecting go to settings from enable alerts dialog box in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on notifications switch in settings in ios$")
    public void userClicksOnNotificationsSwitchInSettingsInIos() throws Throwable {
        try {
            explorePage.clicksOnNotificationsSwitchInSettings();
            ExtentsReportManager.extentReportLogging("info", "clicked on notifications switch in settings in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on notifications switch in settings in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks back icon in the settings in ios$")
    public void userClicksBackIconInTheSettingsInIos() throws Throwable {
        try {
            explorePage.clicksBackIconInTheSettings();
            ExtentsReportManager.extentReportLogging("info", "clicked back icon in the settings in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking back icon in the settings in ios<br />" + e);
            throw e;
        }
    }

    @And("^user validates the general alerts in united now alerts screen in ios$")
    public void userValidatesTheGeneralAlertsInUnitedNowAlertsScreenInIos() throws Throwable {
        try {
            explorePage.validatesTheGeneralAlerts();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the general alerts in united now alerts screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the general alerts in united now alerts screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on match alert in notification screen in ios$")
    public void userClicksOnMatchAlertInNotificationScreenInIos() throws Throwable {
        try {
            explorePage.clicksOnMatchAlertInNotificationScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on match alert in notification screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on match alert in notification screen in ios<br />" + e);
            throw e;
        }
    }

    @And("^user click on My United Logged in bottom tab in ios$")
    public void userClickOnMyUnitedLoggedInBottomTabInIos() throws Throwable {
        try {
            myUnitedPage.clickOnMyUnitedBtn();
            ExtentsReportManager.extentReportLogging("info", "click on My United Logged in bottom tab in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on My United Logged in bottom tab in ios<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on test continue and clicks on back icon$")
    public void userClicksOnTestContinueAndClicksOnBackIcon() throws Throwable {
        try {
            myUnitedPage.ClicksOnTestContinue();
            ExtentsReportManager.extentReportLogging("info", "clicked on test continue and clicks on back icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on test continue and clicks on back icon<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on No tracking$")
    public void userClicksOnNoTracking() throws Throwable {
        try {
            myUnitedPage.clicksOnNoTracking();
            ExtentsReportManager.extentReportLogging("info", "clicked on No tracking");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on No tracking<br />" + e);
            throw e;
        }
    }

    @Then("user validates my united benefits displayed in onboarding screen in ios")
    public void userValidatesMyUnitedBenefitsDisplayedInOnboardingScreenInIos() {
        try {
            boolean flag = myUnitedPage.validatesMyUnitedBenefitsDisplayedInOnboardingScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info",
                    "validated my united benefits displayed in onboarding screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating my united benefits displayed in onboarding screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles in onboarding screen in ios")
    public void userValidatesBenefitsTilesInOnboardingScreenInIos() {
        try {
            boolean flag = myUnitedPage.ValidatesBenefitsTilesInOnboardingScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated benefits tiles in onboarding screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating benefits tiles in onboarding screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles when image is onex image in ios")
    public void userValidatesBenefitsTilesWhenImageIsOnexImageInIos() {
        try {
            boolean flag = myUnitedPage.validatesBenefiltsTilesWhenImageIsOnexImage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info",
                    "validated benefits tiles when image is onex image in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating benefits tiles when image is onex image in ios<br />" + e);
            throw e;
        }
    }

    @Then("user validates view benefits displayed in myunited screen in ios")
    public void userValidatesViewBenefitsDisplayedInMyunitedScreenInIos() {
        try {
            boolean flag = myUnitedPage.validatesViewBenefitsDisplayedInMyunitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info",
                    "validated view benefits displayed in myunited screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating view benefits displayed in myunited screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles in myunited screen in ios")
    public void userValidatesBenefitsTilesInMyunitedScreenInIos() {
        try {
            boolean flag = myUnitedPage.validatesBenefitsTilesInMyunitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated benefits tiles in myunited screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating benefits tiles in myunited screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles when image is onex image in my united page in ios")
    public void userValidatesBenefitsTilesWhenImageIsOnexImageInMyUnitedPageInIos() {
        try {
            boolean flag = myUnitedPage.validatesBenefitsTilesWhenImageIsOnexImageInMyUnitedPage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info",
                    "validated benefits tiles when image is onex image in my united page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating benefits tiles when image is onex image in my united page in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks on edit profile button in ios")
    public void userClicksOnEditProfileButtonInIos() {
        try {
            myUnitedPage.clicksOnEditProfileButtonInIos();
            ExtentsReportManager.extentReportLogging("info", "clicked on edit profile button in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking on edit profile button in ios<br />" + e);
            throw e;
        }
    }

    @And("user edits the postal code in edit profile page in ios")
    public void userEditsThePostalCodeInEditProfilePageInIos() {
        try {
            myUnitedPage.editsThePostalcodeInEditProfilePageInIos();
            ExtentsReportManager.extentReportLogging("info", "edited the postal code in edit profile page in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in editing the postal code in edit profile page in ios<br />" + e);
            throw e;
        }
    }

    @And("user clicks save details in edit profile screen in ios")
    public void userClicksSaveDetailsInEditProfileScreenInIos() {
        try {
            myUnitedPage.clicksSaveDetailsInEditProfileScreenInIos();
            ExtentsReportManager.extentReportLogging("info", "clicked save details in edit profile screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicking save details in edit profile screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("user validates the success message in edit profile screen in ios")
    public void userValidatesTheSuccessMessageInEditProfileScreenInIos(DataTable table) {
        try {
            String expSuccessMessage = table.cell(1, 0);
            String actualSuccessMessage = myUnitedPage.validatesTheSuccessMessageInEditProfileScreenInIos();
            soft.assertEquals(actualSuccessMessage, expSuccessMessage);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated the success message in edit profile screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in validating the success message in edit profile screen in ios<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Inbox Icon is not displayed in My United Page in ios$")
    public void userValidatesInboxIconIsNotDisplayedInMyUnitedPageInIos() {
        try {
            boolean flag = myUnitedPage.validatesInboxIconIsNotDisplayedInMyUnitedPageinios();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits tiles in onboarding screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating benefits tiles in onboarding screen <br />" + e);
            throw e;
        }
    }

	@Then("^user validates my tickets component in my united screen in ios$")
	public void userValidatesMyTicketsComponentInMyUnitedScreenInIos() throws Throwable {
		try {
            boolean flag = myUnitedPage.userValidatesMyTicketsComponentInMyUnitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated my tickets component in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my tickets component in my united screen <br />" + e);
            throw e;
        }
	}

	@Then("^user validates content in my tickets component in ios$")
	public void userValidatesContentInMyTicketsComponentInIos() throws Throwable {
		try {
			 myUnitedPage.userClicksOnMyTicketsComponentInMyUnitedScreen();
            boolean flag = myUnitedPage.userValidatesContentInMyTicketsComponent();
            myUnitedPage.userClicksOnBackIconInMyTickets();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated content in my tickets component");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating content in my tickets component<br />" + e);
            throw e;
        }
	}

	@Then("^user validates stadium component in my united screen in ios$")
	public void userValidatesStadiumComponentInMyUnitedScreenInIos() throws Throwable {
		try {
            boolean flag = myUnitedPage.userValidatesStadiumComponentInMyUnitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated stadium component in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating stadium component in my united screen<br />" + e);
            throw e;
        }
	}

	@Then("^user validates content in stadium component in ios$")
	public void userValidatesContentInStadiumComponentInIos() throws Throwable {
		try {
			myUnitedPage.userClicksOnStadiumComponentInMyUnitedScreen();
            boolean flag = myUnitedPage.userValidatesContentInStadiumComponent();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validates content in stadium component");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating content in stadium component<br />" + e);
            throw e;
        }
	}

	@Then("^user validates become a member and buy shirt CTA button in my united screen in ios using Api$")
	public void userValidatesBecomeAMemberAndBuyShirtCTAButtonInMyUnitedScreenInIosUsingApi() throws Throwable {
		try {

            String BecomeAMemberFromAPI = myUnitedAPIResponse.getBecomeAMemberApi("BecomeAMember/BuyShirtEndpoint");
            ExtentsReportManager.extentReportLogging("info", "BecomeAMemberfrom api <br />" + BecomeAMemberFromAPI);
            String actualBecomeAMember = myUnitedPage.getBecomeAMember();
            ExtentsReportManager.extentReportLogging("info", "BecomeAMember from ui <br />" + actualBecomeAMember);
            soft.assertEquals(actualBecomeAMember.toUpperCase(), BecomeAMemberFromAPI.toUpperCase());

            String buyShirtAPI = myUnitedAPIResponse.getBuyShirtApi("BecomeAMember/BuyShirtEndpoint");
            ExtentsReportManager.extentReportLogging("info", "BuyShirtEndpoint from api <br />" + buyShirtAPI);
            String actualBuyShirt = myUnitedPage.getBuyShirt();
            ExtentsReportManager.extentReportLogging("info", "BuyShirtEndpoint from ui <br />" + actualBuyShirt);

            soft.assertEquals(actualBuyShirt.toUpperCase(), buyShirtAPI.toUpperCase());
            
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validates become a member and buy shirt CTA button in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validated become a member and buy shirt CTA button in my united screen<br />" + e);
            throw e;
        }
    }

	@Then("^user validates stickers in My united screen using Api in ios using Api$")
	public void userValidatesStickersInMyUnitedScreenUsingApiInIosUsingApi() throws Throwable {
		try {
            List expectedStickersList = new ArrayList<>();
            List actualStickersList = new ArrayList<>();
            expectedStickersList = myUnitedAPIResponse.getStickersFromMyUnitedApi("StickersEndPoint");
            actualStickersList = myUnitedPage.getStickersFromMyUnitedUI();
            ExtentsReportManager.extentReportLogging("info","Expected Stickers"+ expectedStickersList);
            ExtentsReportManager.extentReportLogging("info","Actual Stickers"+ actualStickersList);
            soft.assertTrue(expectedStickersList.containsAll(actualStickersList));
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "user validates stickers in My united screen using Api");

        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "validating stickers in My united screen using Api<br />" + e);
            throw e;
        }
}

	@And("^user clicks on preference center in ios$")
	public void userClicksOnPreferenceCenterInIos() throws Throwable {

		try {
			myUnitedPage.userClicksOnPreferenceCenterInIos();
            ExtentsReportManager.extentReportLogging("info", "Clicked search button in united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking search button in united screen <br />" + e);
            throw e;
        }
	}

	@Then("^user gets the title of the preference center screen in ios$")
	public void userGetsTheTitleOfThePreferenceCenterScreenInIos(DataTable table) throws Throwable {
		try {
            String expPreferenceCenter = table.cell(1, 0);
            String actualPreferenceCenter = myUnitedPage.getsTheTitleOfThePreferenceCenterScreen();
            soft.assertEquals(actualPreferenceCenter.toUpperCase(), expPreferenceCenter.toUpperCase());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "getting the title of the preference center screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in getting the title of the preference center screen<br />" + e);
            throw e;
        }
	}

	@And("^user selecting one of the checklist in the preference center screen in ios$")
	public void userSelectingOneOfTheChecklistInThePreferenceCenterScreenInIos() throws Throwable {
		try {
            myUnitedPage.selectingOneOfTheChecklistInThePreferenceCenterScreen();
            ExtentsReportManager.extentReportLogging("info", "selected one of the checklist in the preference center screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "selecting one of the checklist in the preference center screen <br />" + e);
            throw e;
        }
	}

	@And("^user clicks on save preference button in ios$")
	public void userClicksOnSavePreferenceButtonInIos() throws Throwable {
		try {
            myUnitedPage.clicksOnSavePreferenceButton();
            ExtentsReportManager.extentReportLogging("info", "clicked on save preference button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "clicking on save preference button<br />" + e);
            throw e;
        }
	}

	@Then("^user validates preference updated message in ios$")
	public void userValidatesPreferenceUpdatedMessageInIos(DataTable table) throws Throwable {
		try {
            String expPrefUpdate = table.cell(1, 0);
            String actualPrefUpdate = myUnitedPage.validatesPreferenceUpdatedMessage();
            soft.assertEquals(actualPrefUpdate, expPrefUpdate);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated preference updated message");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating preference updated message<br />" + e);
            throw e;
        }
	
	}

	
	@Then("^user validates the edited player details in my united screen in ios$")
    public void userValidateEditedPlayerDetailsInMyUnitedScreenInIos() throws Throwable {
        try {
        	String expPlayerName  = GlobalParams.getPlayerName();
            String actualPlayerName = myUnitedPage.getEditedPlayerNameInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info","Actual player "+actualPlayerName+"<br />Expected Player "+expPlayerName);
            soft.assertEquals(actualPlayerName.replaceAll(" ",""), expPlayerName.replaceAll(" ",""));          
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info",
                    "validated edited player details in my united screen in ios");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail","Error in validating edited player details in my united screen in ios<br />" + e);
            throw e;
        }
    }
	
	 static String playerName1;
    @And("^user edits a favorite player in player screen in ios$")
    public void userEditsaFavoritePlayerInPlayerScreenInIos() throws Throwable {
        try {
        	playerName1=myUnitedPage.clickEditsTheFavoritePlayer1InPlayerScreen();
            GlobalParams.setPlayerName(playerName1);
            ExtentsReportManager.extentReportLogging("info", "edited the favorite player in player screen in ios: "+playerName1);
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Error in editing the favorite player in player screen in ios<br />" + e);
            throw e;
        }
    }


	@And("user enter the New email {string} and Confirm email{string}valid password {string} in ios")
	public void userEnterTheNewEmailAndConfirmEmailValidPasswordInIos(String usernameNew, String confirmusernameNew, String password)
			throws Throwable {
		try {
//			  myUnitedPage.switchToWebView();
			  myUnitedPage.enterUsername(usernameNew);
			  myUnitedPage.enterConfirmUsername(confirmusernameNew);
			  myUnitedPage.enterPassword(password);
	            ExtentsReportManager.extentReportLogging("info", "Entered the valid username and password");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in entering valid username and password<br />" + e);
	            throw e;
	        }
	}

	@And("^user clicks on update email address in my profile in ios$")
	public void userClicksOnUpdateEmailAddressInMyProfileInIos() throws Throwable {
		try {
            myUnitedPage.clicksOnUpdateEmailAddressInMyProfile();
            ExtentsReportManager.extentReportLogging("info", "clicked on save preference button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "clicking on save preference button<br />" + e);
            throw e;
        }
	}

	@Then("^user validates email change successfully message in ios$")
	public void userValidatesEmailChangeSuccessfullyMessageInIos(DataTable table) throws Throwable {
		try {
            String expEmailUpdate = table.cell(1, 0);
            String actualEmailUpdate = myUnitedPage.userValidatesEmailChangeSuccessfullyMessage();
            soft.assertEquals(actualEmailUpdate, expEmailUpdate);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated preference updated message");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating preference updated message<br />" + e);
            throw e;
        }
	}

	@And("^user clicks on close icon in email update success screen in ios$")
	public void userClicksOnCloseIconInEmailUpdateSuccessScreenInIos() throws Throwable {
		try {
            myUnitedPage.clicksOnCloseIconInEmailUpdateSuccessScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on save preference button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "clicking on save preference button<br />" + e);
            throw e;
        }
	}

	@And("user enters the old email{string} and confirm email{string}valid password {string} in ios")
	public void userEntersTheOldEmailAndConfirmEmailValidPasswordInIos(String username, String confirmOldusername, String password)
			throws Throwable {
		try {
//			  myUnitedPage.switchToWebView();
			  myUnitedPage.enterUsername(username);
			  myUnitedPage.enterConfirmUsername(confirmOldusername);
			  myUnitedPage.enterPassword(password);
	            ExtentsReportManager.extentReportLogging("info", "Entered the valid username and password");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in entering valid username and password<br />" + e);
	            throw e;
	        }
	}

	@And("^user changes the following textbox in edit profile screen in ios$")
	public void userChangesTheFollowingTextboxInEditProfileScreenInIos(DataTable table) throws Throwable {
		  try {
			  myUnitedPage.enterAddressLineOne(table.cell(1, 0));
			  myUnitedPage.enterAddressLinetwo(table.cell(1, 1));
			  myUnitedPage.enterAddressLineThree(table.cell(1, 2));
			  myUnitedPage.enterAddressLineTown(table.cell(1, 3));
			  myUnitedPage.enterPinCode(table.cell(1, 4));
	            ExtentsReportManager.extentReportLogging("info", "Changed the textbox in edit profile screen");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in changing the textbox in edit profile screen<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the success message in edit profile in ios$")
	public void userValidatesTheSuccessMessageInEditProfileInIos(DataTable table) throws Throwable {
			try {
	            String expSuccessMessage = table.cell(1, 0);
	            String actualSuccessMessage = myUnitedPage.validateSuccessMessageInEditProfile();
	            soft.assertEquals(actualSuccessMessage, expSuccessMessage);
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "validated the success message in edit profile in ios");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail",
	                    "Error in validating success message in edit profile in ios<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the given data in edit profile screen in ios$")
	public void userValidatesTheGivenDataInEditProfileScreenInIos(DataTable table) throws Throwable {
		 try {
	            String expectedAddr1 = table.cell(1, 0);
	            String expectedAddr2 = table.cell(1, 1);
	            String expectedAddr3 = table.cell(1, 2);
	            String expectedTown = table.cell(1, 3);
	            String expectedCountry = table.cell(1, 4);

	            String actualAddr1 = myUnitedPage.getAddr1Text();
	            String actualAddr2 = myUnitedPage.getAddr2Text();
	            String actualAddr3 = myUnitedPage.getAddr3Text();
	            String actualTown = myUnitedPage.getTownText();
	            String actualCountry = myUnitedPage.getPincodeText();

	            soft.assertEquals(actualAddr1, expectedAddr1);
	            soft.assertEquals(actualAddr2, expectedAddr2);
	            soft.assertEquals(actualAddr3, expectedAddr3);
	            soft.assertEquals(actualTown, expectedTown);
	            soft.assertEquals(actualCountry, expectedCountry);
	            ExtentsReportManager.extentReportLogging("info", "Verified given data in edit profile screen");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in given data in edit profile screen<br />" + e);
	            throw e;
	        }
	}

	@And("^user clears all data in textbox in edit profile screen in ios$")
	public void userClearsAllDataInTextboxInEditProfileScreenInIos() throws Throwable {
		try {
            myUnitedPage.ClearsAllDataInTextboxInEditProfileScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on save preference button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "clicking on save preference button<br />" + e);
            throw e;
        }
	}

	@And("^user navigates to About you in my united screen in ios$")
	public void userNavigatesToAboutYouInMyUnitedScreenInIos() throws Throwable {
		try {
            boolean flag = myUnitedPage.navigatesToAboutYouInMyUnitedScreenIos();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "navigates to About you in my united");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "navigates to About you in my united<br />" + e);
            throw e;
        }
	}

	@Then("^User validates text containing user Firstname lastName Country and Age details personalised in ios$")
	public void userValidatesTextContainingUserFirstnameLastNameCountryAndAgeDetailsPersonalisedInIos()
			throws Throwable {
		try {
            boolean flag = myUnitedPage.validatesTextContainingUserFirstnameLastNameCountryAndAgeDetailsinios();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validates textFirstname lastName Country and Age details personalised");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "validates textFirstname lastName Country and Age details personalised<br />" + e);
            throw e;
        }
	}

	@Then("^user validates the background colour of profile screen in ios$")
	public void userValidatesTheBackgroundColourOfProfileScreenInIos() throws Throwable {
		 try {
		        myUnitedPage.validateBackgroundColorInIos();
		        ExtentsReportManager.extentReportLogging("pass", "Background color validated successfully");
		    } catch (AssertionError e) {
		        ExtentsReportManager.extentReportLogging("fail", "Background color validation failed<br />" + e);
		        throw e;
		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail", "Exception during background color validation<br />" + e);
		        throw e;
		    }
	}

}
	

	
	
	

