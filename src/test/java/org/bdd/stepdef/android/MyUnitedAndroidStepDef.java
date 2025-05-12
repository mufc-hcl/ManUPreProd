package org.bdd.stepdef.android;

import java.util.ArrayList;
import java.util.List;

import org.bdd.pages.MyUnitedPage;
import org.bdd.pages.UnitedNowPage;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.MyUnitedAPIResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyUnitedAndroidStepDef {


    public SoftAssert soft = new SoftAssert();
    public MyUnitedPage myUnitedPage = new MyUnitedPage();
    public UnitedNowPage unitedNowPage = new UnitedNowPage();
    public MyUnitedAPIResponse myUnitedAPIResponse = new MyUnitedAPIResponse();

    @And("^user click on Rate app in the General Screen$")
    public void userClickOnRateAppInTheGeneralScreen() {
        try {
            myUnitedPage.clickOnRateAppInTheGeneralScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on rate in general screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking rate in general screen <br />" + e);
            throw e;
        }
    }

    @Then("^user validate google play$")
    public void userValidateGooglePlay(DataTable table) {
        try {
            String expGooglePlay = table.cell(1, 0);
            String actualGooglePlay = myUnitedPage.getGooglePlayText();
            soft.assertEquals(actualGooglePlay, expGooglePlay);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated google play");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating google play<br />" + e);
            throw e;
        }
    }

    @And("^user click on Language in the General Screen$")
    public void userClickOnLanguageInTheGeneralScreen() {
        try {
            myUnitedPage.clickOnLanguageInTheGeneralScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on language in general screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on language in general screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on chinese Language in langugae Screen$")
    public void userClicksOnChineseLanguageInLangugaeScreen() {
        try {
            myUnitedPage.clickOnChineseLanguageInLangugaeScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on chinese language in language screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on chinese language in language screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on confirm button in Language Screen$")
    public void userClicksOnConfirmButtonInLanguageScreen() {
        try {
            myUnitedPage.clickOnConfirmButtonInLanguageScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on confirm button in language screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking confirm button in language screen <br />" + e);
            throw e;
        }
    }

    @Then("^user validates Welcome Text in Chinese$")
    public void userValidatesWelcomeTextInChinese(DataTable table) {
        try {
            String expChineseLanguage = table.cell(1, 0);
            String actualChineseLanguage = myUnitedPage.getWelcomeTextInChinese();
            soft.assertEquals(actualChineseLanguage, expChineseLanguage);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated welcome text in chinese");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating welcome text in chinese <br />" + e);
            throw e;
        }
    }

    @And("^user selects the dont allow button in audio notification alert after Refresh$")
    public void userSelectsTheDontAllowButtonInAudioNotificationAlertAfterRefresh() {
        try {
            myUnitedPage.clickDontAllowButtonInAudioNotificationAlertAfterRefresh();
            ExtentsReportManager.extentReportLogging("info", "Selected dont allow button in audio notification alert after refresh");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting dont allow button in audio notification alert after refresh<br />" + e);
            throw e;
        }
    }

    @And("^user selects Dont allow in the photos and videos access in alert after Refresh$")
    public void userSelectsDontAllowInThePhotosAndVideosAccessInAlertAfterRefresh() {
        try {
            myUnitedPage.clickDontAllowInThePhotosAndVideosAccessInAlertAfterRefresh();
            ExtentsReportManager.extentReportLogging("info", "Selected dont allow in photos and videos access in alert after refresh");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting dont allow in photos and videos access in alert after refresh<br />" + e);
            throw e;
        }
    }

    @And("^user click on setting icon on top righhand side which is in chinese Language$")
    public void userClickOnSettingIconOnTopRighhandSideWhichIsInChineseLanguage() {
        try {
            myUnitedPage.clickOnSettingIconInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on setting icon on top right hand side which is in chinese language");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on setting icon on top right hand side which is in chinese language<br />" + e);
            throw e;
        }
    }

    @And("^user click on GENERAL link in setting screen which is in chinese Language$")
    public void userClickOnGENERALLinkInSettingScreenWhichIsInChineseLanguage() {
        try {
            myUnitedPage.clickOnGENERALLinkInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on general link in setting screen which is in chinese language");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on general link in setting screen which is in chinese language<br />" + e);
            throw e;
        }
    }

    @And("^user click on Language in the General Screen which is in chinese Language$")
    public void userClickOnLanguageInTheGeneralScreenWhichIsInChineseLanguage() {
        try {
            myUnitedPage.clickOnLanguageGeneralInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on language in general screen which is in chinese language");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking language in general screen which is in chinese language<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on English Language in langugae Screen$")
    public void userClicksOnEnglishLanguageInLangugaeScreen() {
        try {
            myUnitedPage.clickOnEnglishLanguageInLangugaeScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on english language in language screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking english language in language screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on confirm button in Language Screen which is in chinese Language$")
    public void userClicksOnConfirmButtonInLanguageScreenWhichIsInChineseLanguage() {
        try {
            myUnitedPage.clickOnConfirmButtonInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on confirm button in language screen which is in chinese language");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on confirm button in language screen which is in chinese language<br />" + e);
            throw e;
        }
    }

    @And("^user click on My United in bottom tab which is in chinese Language$")
    public void userClickOnMyUnitedInBottomTabWhichIsInChineseLanguage() {
        try {
            myUnitedPage.clickOnMyUnitedInBottomTabWhichIsInChineseLanguage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on my untied in bottom tab which is in chinese language");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on my united in bottom tab which is in chinese language <br />" + e);
            throw e;
        }
    }

    @Then("^user validates calender Icon$")
    public void userValidatesCalenderIcon() {
        try {
            boolean flag = myUnitedPage.validateCalenderIcon();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated calender icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the calendar icon<br />" + e);
            throw e;
        }
    }
    @Then("^user validates My united text in myunited screen$")
    public void userValidatesMyUnitedTextInMyunitedScreen(DataTable table) throws Exception {
    	 try {
             String expMyUnitedText = table.cell(1, 0);
             String actualMyUnitedText = myUnitedPage.getMyUnitedText();
             soft.assertEquals(actualMyUnitedText, expMyUnitedText);
             soft.assertAll();
             ExtentsReportManager.extentReportLogging("info", "Validated my united text in my united screen");
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in validating my united text in mu united screen <br />" + e);
             throw e;
         }
    }


    @Then("^user validates My message text in inbox screen$")
    public void userValidatesMyMessageTextInInboxScreen(DataTable table) {
        try {
            String expMyMessages = table.cell(1, 0);
            String actualMyMessages = myUnitedPage.getMyMessageTitleText();
            soft.assertEquals(actualMyMessages, expMyMessages);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated my message text in inbox screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my message text in inbox screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back button in inbox screen$")
    public void userClicksOnBackButtonInInboxScreen() {
        try {
            myUnitedPage.clickOnBackButtonInInboxScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back button in inbox screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back button in inbox screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Points this season card in My united screen$")
    public void userValidatesPointsThisSeasonCardInMyUnitedScreen() {
        try {
            String actualPointsThisSeason = myUnitedPage.getPointsThisSeasonCardTextMyUnited();
            soft.assertEquals(actualPointsThisSeason, "POINTS THIS SEASON");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated points this season card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating points this seasons card in my united screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Season card in My united screen$")
    public void userClicksOnSeasonCardInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnSeasonCardInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on seasons card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking seasons card in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates season card$")
    public void userValidatesSeasonCard(DataTable table) {
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
            ExtentsReportManager.extentReportLogging("info", "Validated seasons card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating seasons card<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in season card screen$")
    public void userClicksOnBackIconInSeasonCardScreen() {
        try {
            myUnitedPage.clickOnBackIconInSeasonCardScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in seasons card screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clikcing back icon in season card screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates my stickers carousel in My united screen$")
    public void userValidatesMyStickersCarouselInMyUnitedScreen() {
        try {
            String actualMyStickers = myUnitedPage.getMyStickersCarouselMyUnited();
            soft.assertEquals(actualMyStickers, "MY STICKERS");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated my stickers carousel in my untied screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my stickers carousel in my united screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on view all button$")
    public void userClicksOnViewAllButton() throws Throwable {
        try {
            myUnitedPage.clickOnViewAllButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on view all button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking view all button<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in stickers screen$")
    public void userClicksOnBackIconInStickersScreen() {
        try {
            myUnitedPage.clickOnBackIconInStickersScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in stickers screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon in stickers screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on first sticker in Stickers Screen$")
    public void userClicksOnFirstStickerInStickersScreen() {
        try {
            myUnitedPage.clickOnFirstStickerInStickersScreen();
            ExtentsReportManager.extentReportLogging("info", "CLicked on first stickers in stickers screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking first stickers in stickers screen<br />" + e);
            throw e;
        }
    }

    @And("^user select search image from share option$")
    public void userSelectSearchImageFromShareOption() {
        try {
            myUnitedPage.selectsSearchImageFromShareOption();
            ExtentsReportManager.extentReportLogging("info", "Selected search image from share options");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting search image from share options<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the sticker in Google lens page$")
    public void userValidatesTheStickerInGoogleLensPage() {
        try {
            boolean flag = myUnitedPage.validatesTheStickerInGoogleLensPage();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated stickers in google lens page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating stickers in google lens page<br />" + e);
            throw e;
        }
    }

    String actualTShirtNumber = "", expectedTshirtNumber = "";

    @And("^user updates the t shirt numbers at buttom of the screen and click on back to top button$")
    public void userUpdatesTheTShirtNumbersAtButtomOfTheScreenAndClickOnBackToTopButton() {
        try {
            myUnitedPage.clickOnEditButton();
            expectedTshirtNumber = myUnitedPage.settShirtNumber();
            myUnitedPage.clickOnSaveTshirtButton();
            myUnitedPage.clickOnBackToTopButton();
            ExtentsReportManager.extentReportLogging("info", "Updated t shirt no at bottom of the screen and clicked on back to top button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in updating the t shirt no and clicking on back to top button<br />" + e);
            throw e;
        }

    }

    @Then("^user validate t shirt number from the previous step$")
    public void userValidateTShirtNumberFromThePreviousStep() throws Throwable {
        try {
            actualTShirtNumber = myUnitedPage.getTshirtNumber();
            soft.assertEquals(actualTShirtNumber, expectedTshirtNumber);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated t shirt no from previous step");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating t shirt no from previous step <br />" + e);
            throw e;
        }

    }

    @And("^user validate t shirt name is displayed$")
    public void userValidateTShirtNameIsDisplayed() {
        try {
            boolean flag = myUnitedPage.getTshirtName();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated t shirt name is displayed or not ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating t shirt name display<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on get official membership CTA button in my united screen$")
    public void userClicksOnGetOfficialMembershipCTAButtonInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnGetOfficialMembershipCTAButtonInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on get official membership CTA button in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on get official membership CTA button in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validate tickets title in get official membership screen$")
    public void userValidateTicketsTitleInGetOfficialMembershipScreen(DataTable table) {
        try {
            String expTickets = table.cell(1, 0);
            String actualTickets = myUnitedPage.getTicketsTitleInGetOfficialMembershipScreen();
            soft.assertEquals(actualTickets, expTickets);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated tickets title in get official membership screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating tickets title in get official membership screen<br />" + e);
            throw e;
        }
    }

    @And("^user click on close icon in get official membership screen$")
    public void userClickOnCloseIconInGetOfficialMembershipScreen() {
        try {
            myUnitedPage.clickOnCloseIconInGetOfficialMembershipScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on close icon in get official membership screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking close icon in get membership screen <br />" + e);
            throw e;
        }
    }

    @And("^user click on buy shirt CTA button in my united screen$")
    public void userClickOnBuyShirtCTAButtonInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnBuyShirtCTAButtonInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on buy shirt CTA button in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking buy shirt CTA button in my united screen <br />" + e);
            throw e;
        }
    }

    @Then("^user validates shop now is displayed$")
    public void userValidatesShopNowIsDisplayed() {
        try {
            boolean flag = myUnitedPage.getShopNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated shop now is displayed or not ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating shop now is displayed or not<br />" + e);
            throw e;
        }
    }

    @Then("^user scrolls down to validates this season card in My united now screen$")
    public void userScrollsDownToValidatesThisSeasonCardInMyUnitedNowScreen(DataTable table) {
        try {
            String expScoreCard = table.cell(1, 0);
            String expMyUnited = table.cell(1, 1);
            String actualScoreCard = myUnitedPage.getScoredCardThisSeason();
            String actualMyUnited = myUnitedPage.getMyUnitedThisSeason();
            soft.assertEquals(actualScoreCard, expScoreCard);
            soft.assertEquals(actualMyUnited, expMyUnited);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Scrolled down to validate this season card in my united now screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in scrolling down to validate this season card in my united now screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on total score card in my united screen$")
    public void userClicksOnTotalScoreCardInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnTotalScoreCard();
            ExtentsReportManager.extentReportLogging("info", "CLicked on total score card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking total score card in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates content in total score card$")
    public void userValidatesContentInTotalScoreCard(DataTable table) {
        try {
            String expMyUnitedTotalScore = table.cell(1, 0);
            String expPrediction = table.cell(1, 1);
            String expDailySteaks = table.cell(1, 2);
            String expAppearance = table.cell(1, 3);
            String actualMyUnitedTotalScore = myUnitedPage.getTotalScoreCard();
            String actualPrediction = myUnitedPage.getPredictionTotalScoreCard();
            String actualDailySteaks = myUnitedPage.getDailyStreaksTotalScoreCard();
            String actualApprearance = myUnitedPage.getAppearanceTotalScoreCard();
            soft.assertEquals(actualMyUnitedTotalScore, expMyUnitedTotalScore);
            soft.assertEquals(actualPrediction, expPrediction);
            soft.assertEquals(actualDailySteaks, expDailySteaks);
            soft.assertEquals(actualApprearance, expAppearance);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated content in total score card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating content in total score card<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in total score card$")
    public void userClicksOnBackIconInTotalScoreCard() {
        try {
            myUnitedPage.clickOnBackIconInTotalScoreCard();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in total score card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon in total score card<br />" + e);
            throw e;
        }
    }

    @And("user scroll right to left to navigate daily streaks cards {string}")
    public void userScrollRightToLeftToNavigateDailyStreaksCard(String expectedDailystreaks) {
        try {
            String actualDailyStreaks = myUnitedPage.selectDailySteaksInDailyStreaksCards(expectedDailystreaks);
            Assert.assertEquals(actualDailyStreaks, expectedDailystreaks);
            ExtentsReportManager.extentReportLogging("info", "Scrolled right to left to navigate daily streaks cards");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in scrolling right to left to navigate daily streaks cards<br />" + e);
            throw e;
        }
     
    }
    
    @And("^user scroll right to left to navigate appearence cards \"([^\"]*)\"$")
	public void userScrollRightToLeftToNavigateAppearenceCards(String expectedAppearence) throws Throwable {
    	try {
            String actualAppearence = myUnitedPage.selectAppearenceInAppearenceCard(expectedAppearence);
            Assert.assertEquals(actualAppearence, expectedAppearence);
            ExtentsReportManager.extentReportLogging("info", "Scrolled right to left to navigate daily streaks cards");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in scrolling right to left to navigate appearence cards<br />" + e);
            throw e;
        }
	}

    @Then("^user validate daily streaks card in my united screen$")
    public void userValidateDailyStreaksCardInMyUnitedScreen(DataTable table) {
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
            ExtentsReportManager.extentReportLogging("info", "validated daily streaks card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating daily streaks card in my untied screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on daily streaks card in my united screen$")
    public void userClicksOnDailyStreaksCardInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnViewButtonInDailyStreaksCard();
            ExtentsReportManager.extentReportLogging("info", "CLicked on daily streaks card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error <br />" + e);
            throw e;
        }
    }

    @Then("^user validates content in daily streaks card$")
    public void userValidatesContentInDalyStreaksCard(DataTable table) {
        try {
            String expDailyStreaks = table.cell(1, 0);
            // String expDesc = table.cell(1, 1);
            String expBestScore = table.cell(1, 1);
            String expShare = table.cell(1, 2);
            String actualDailyStreaks = myUnitedPage.getDailyStreaksScreenTitleInDailyStreaksCard();
            // String actualDesc = myUnitedPage.getDescriptionInDailyStreaksCard();
            String actualBestScore = myUnitedPage.getBestScoreTextInRectangleInDailyStreaksCard();
            String actualShare = myUnitedPage.getShareInDailyStreaksCard();
            soft.assertEquals(actualDailyStreaks, expDailyStreaks);
            // soft.assertEquals(actualDesc, expDesc);
            soft.assertEquals(actualBestScore, expBestScore);
            soft.assertEquals(actualShare, expShare);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated content in daily streak card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating content in daily streak card<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in daily streaks card$")
    public void userClicksOnBackIconInDailyStreaksCard() {
        try {
            myUnitedPage.clickBackIconInDailyStreaksCard();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in daily streaks card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on back icon in daily streaks card <br />" + e);
            throw e;
        }
    }

    @Then("^user validates appearance card in my united screen$")
    public void userValidatesAppearanceCardInMyUnitedScreen(DataTable table) {
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
            ExtentsReportManager.extentReportLogging("info", "Validated appearance card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating appearance card in my united screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on appearance card in my united screen$")
    public void userClicksOnAppearanceCardInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnViewButtonAppearancecard();
            ExtentsReportManager.extentReportLogging("info", "CLicked on appearance card in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on appearance card in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates content in appearance card$")
    public void userValidatesContentInAppearanceCard(DataTable table) {
        try {
            String expAppearance = table.cell(1, 0);
            // String expMatchDay = table.cell(1, 1);
            String expShare = table.cell(1, 1);
            String actualAppearance = myUnitedPage.getAppearanceInsideTitleAppearancecard();
            // String actualMatchDay = myUnitedPage.getDescriptionAppearancecard();
            String actualShare = myUnitedPage.getShareAppearanceCard();
            soft.assertEquals(actualAppearance, expAppearance);
            // soft.assertEquals(actualMatchDay, expMatchDay);
            soft.assertEquals(actualShare, expShare);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated content in appearance card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating content in appearance card<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back Icon in appearance card$")
    public void userClicksOnBackIconInAppearanceCard() {
        try {
            myUnitedPage.clickBackIconAppearanceCard();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in appearance card");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon in appearance card<br />" + e);
            throw e;
        }
    }

    @And("navigates to the joined section")
    public void navigatesToTheJoinedSection() {
        try {
            unitedNowPage.navigatesToTheJoinedSection();
            ExtentsReportManager.extentReportLogging("info", "Navigated to joined section");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to joined section <br />" + e);
            throw e;
        }
    }

    @And("^user scrolls down to favorite player screen$")
    public void userScrollsDownToFavoritePlayerScreen() {
        try {
            myUnitedPage.scrollsDownToFavoritePlayerScreen();
            ExtentsReportManager.extentReportLogging("info", "Scrolled down to favourite player screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in scrolling down to favourite player screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on edit button in my united screen$")
    public void userClicksOnEditButtonInMyUnitedScreen() throws Throwable {
        try {
            myUnitedPage.clickOnEditButtonInFavoritePlayers();
            ExtentsReportManager.extentReportLogging("info", "Clicked on edit button in my untied screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on edit button in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the below details in choose player screen$")
    public void userValidatesTheBelowDetailsInChoosePlayerScreen(DataTable table) throws Throwable {
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
            ExtentsReportManager.extentReportLogging("info", "Validated the details in choose player screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the details in choose player screen<br />" + e);
            throw e;
        }
    }

    static String playerName;

    @And("^user selects a favorite player in players screen$")
    public void userSelectsAFavoritePlayerInPlayersScreen() {
        try {
            playerName = myUnitedPage.clickOnFavoritePlayerInPlayersScreen();
            ExtentsReportManager.extentReportLogging("info", "Selected a favourite player in players screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting favourite players in players screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the star icon is displayed$")
    public void userValidatesTheStarIconIsDisplayed() {
        try {
            myUnitedPage.validatesTheStarIconInsDisplayed();
            ExtentsReportManager.extentReportLogging("info", "Validated the star icon is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the star icon is displayed<br />" + e);
            throw e;
        }
    }

    @Then("^user validates player details updated in my united screen$")
    public void userValidatesPlayerDetailsUpdatedInMyUnitedScreen(DataTable table) {
        try {
//            String expPlayerName = table.cell(1, 0);
            String expPlayerName = playerName;
            String expBuyShirt = table.cell(1, 0);
            String actualPlayerName = myUnitedPage.getPlayerNameInUnitedScreen();
            String actualBuyShirt = myUnitedPage.getBuyShirtButtonScreen();
            soft.assertEquals(actualPlayerName, expPlayerName);
            soft.assertEquals(actualBuyShirt, expBuyShirt);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated players details updated in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating players details updated in my united screen <br />" + e);
            throw e;
        }
    }

    @And("^clicks on  buy shirt button in my united screen$")
    public void clicksOnBuyShirtButtonInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnBuyShirtButtonInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "CLicked on buy shirt in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking but shirt button in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates shop page$")
    public void userValidatesShopPage(DataTable table) {
        try {
            String expShop = table.cell(1, 0);
            String actualShop = myUnitedPage.getShopTitleShopScreen();
            soft.assertEquals(actualShop, expShop);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated shop page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating shop page <br />" + e);
            throw e;
        }
    }

    @And("^user validates payer image n my united screen$")
    public void userValidatesPayerImageNMyUnitedScreen() {
        try {
            myUnitedPage.payerImageNMyUnitedScreenIsDisplayed();
            ExtentsReportManager.extentReportLogging("info", "Validated player image in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating players image in my united screen <br />" + e);
            throw e;
        }
    }

    @And("^user click on cross icon in shop screen$")
    public void userClickOnCrossIconInShopScreen() {
        try {
            myUnitedPage.clickOnCrossIconInShopScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked cross icon in shop screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking cross icon in shop screen<br />" + e);
            throw e;
        }
    }

    @And("^user click on edit icon in my united screen$")
    public void userClickOnEditIconInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnEditIconInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on edit icon in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking edit icon in my united screen <br />" + e);
            throw e;
        }
    }

    static String playerName2;

    @And("^user edits the favorite player in player screen$")
    public void userEditsTheFavoritePlayerInPlayerScreen() {
        try {
            playerName2 = myUnitedPage.clickEditsTheFavoritePlayerInPlayerScreen();
            ExtentsReportManager.extentReportLogging("info", "Edited favourite player in player screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in editing favourite player in players screen<br />" + e);
            throw e;
        }

    }

    @Then("^user validates edited player details in my united screen$")
    public void userValidatesEditedPlayerDetailsInMyUnitedScreen() {
        try {
            String expPlayerName = playerName2;
            String actualPlayerName = myUnitedPage.getEditedPlayerNameInMyUnitedScreen();
            String actualCountryFlag = myUnitedPage.getCountryFlagMyUnitedScreen();
            soft.assertEquals(actualPlayerName, expPlayerName);
            if (!actualCountryFlag.equalsIgnoreCase("noFlag")) {
                ExtentsReportManager.extentReportLogging("info", "Flag displayed for the player");
            } else {
                ExtentsReportManager.extentReportLogging("info", "No flag displayed for the player");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated edited player details in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating edited player details in my united screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on country flag in my united screen$")
    public void userClicksOnCountryFlagInMyUnitedScreen() {
        try {
            myUnitedPage.clickOnCountryFlagInMyUnitedScreen();
            ExtentsReportManager.extentReportLogging("info", "CLicked on country flag in my untied screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on country flag in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates calender Icon in chinese$")
    public void userValidatesCalenderIconInChinese() {
        try {
            boolean flag = myUnitedPage.validateChineseCalenderIcon();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated calendar icon in chinese");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating calendar icon in chinese<br />" + e);
            throw e;
        }
    }


    @And("user clicks continue in MUApp popup")
    public void userClicksContinueInMUAppPopup() {
        try {
            myUnitedPage.clicksContinueInMUAppPopup();
            ExtentsReportManager.extentReportLogging("info", "Clicked continue in muapp popup");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking continue in muapp popup<br />" + e);
            throw e;
        }
    }

    @And("user clicks on in app message notification at bottom of screen")
    public void userClicksOnInAppMessageNotificationAtBottomOfScreen() {
        try {
            myUnitedPage.clicksOnInAppMessageNotificationAtBottomOfScreen();
            ExtentsReportManager.extentReportLogging("info", "CLicked on in app message notification at bottom of screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking in app message notification at bottom of screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates my united benefits displayed in onboarding screen")
    public void userValidatesMyUnitedBenefitsDisplayedInOnboardingScreen() {
        try {
            boolean flag = myUnitedPage.validatesMyUnitedBenefitsDisplayedInOnboardingScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated my united benefits displayed in onboarding screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my united benefits displayed in onboarding screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles in onboarding screen")
    public void userValidatesBenefitsTilesInOnboardingScreen() {
        try {
            boolean flag = myUnitedPage.ValidatesBenefitsTilesInOnboardingScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits tiles in onboarding screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating benefits tiles in onboarding screen <br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles when image is onex image")
    public void userValidatesBenefitsTilesWhenImageIsOneXImage() {
        try {
            boolean flag = myUnitedPage.validatesBenefiltsTilesWhenImageIsOnexImage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits tiles when image is one x image");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating benefits tiles when image is one x image<br />" + e);
            throw e;
        }
    }

    @Then("user validates view benefits displayed in myunited screen")
    public void userValidatesViewBenefitsDisplayedInMyunitedScreen() {
        try {
            boolean flag = myUnitedPage.validatesViewBenefitsDisplayedInMyunitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated view benefits displayed in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating view benefits displayed in my united screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles in myunited screen")
    public void userValidatesBenefitsTilesInMyunitedScreen() {
        try {
            boolean flag = myUnitedPage.validatesBenefitsTilesInMyunitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits tiles in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error <br />" + e);
            throw e;
        }
    }

    @Then("user validates benefits tiles when image is onex image in my united page")
    public void userValidatesBenefitsTilesWhenImageIsOnexImageInMyUnitedPage() {
        try {
            boolean flag = myUnitedPage.validatesBenefitsTilesWhenImageIsOnexImageInMyUnitedPage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits tiles when image is one x image in my united page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating benefits tiles when image is one x image in my united page <br />" + e);
            throw e;
        }
    }

    @Then("^user validates Inbox Icon is not displayed in My United Page$")
    public void userValidatesInboxIconIsNotDisplayedInMyUnitedPage() throws Throwable {
        try {
            boolean flag = myUnitedPage.validatesInboxIconIsNotDisplayedInMyUnitedPage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated benefits tiles in onboarding screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating benefits tiles in onboarding screen <br />" + e);
            throw e;
        }
    }

	@Then("^user validates my tickets component in my united screen$")
	public void userValidatesMyTicketsComponentInMyUnitedScreen() throws Throwable {
		try {
            boolean flag = myUnitedPage.userValidatesMyTicketsComponentInMyUnitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated my tickets component in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my tickets component in my united screen <br />" + e);
            throw e;
        }
	}


	@Then("^user validates stadium component in my united screen$")
	public void userValidatesStadiumComponentInMyUnitedScreen() throws Throwable {
		try {
            boolean flag = myUnitedPage.userValidatesStadiumComponentInMyUnitedScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated stadium component in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating stadium component in my united screen<br />" + e);
            throw e;
        }
	}

	@Then("^user validates content in stadium component$")
	public void userValidatesContentInStadiumComponent() throws Throwable {
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

	@Then("^user validates content in my tickets component$")
	public void userValidatesContentInMyTicketsComponent() throws Throwable {
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

	@Then("^user validates become a member and buy shirt CTA button in my united screen using Api$")
	public void userValidatesBecomeAMemberAndBuyShirtCTAButtonInMyUnitedScreen() throws Throwable {
		try {

            String BecomeAMemberFromAPI = myUnitedAPIResponse.getBecomeAMemberApi("BecomeAMember/BuyShirtEndpoint");
            String actualBecomeAMember = myUnitedPage.getBecomeAMember();
            soft.assertEquals(actualBecomeAMember.toUpperCase(), BecomeAMemberFromAPI.toUpperCase());

            String buyShirtAPI = myUnitedAPIResponse.getBuyShirtApi("BecomeAMember/BuyShirtEndpoint");
            String actualBuyShirt = myUnitedPage.getBuyShirt();
            soft.assertEquals(actualBuyShirt.toUpperCase(), buyShirtAPI.toUpperCase());
            
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validates become a member and buy shirt CTA button in my united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validated become a member and buy shirt CTA button in my united screen<br />" + e);
            throw e;
        }
    }

	@Then("^user validates stickers in My united screen using Api$")
	public void userValidatesStickersInMyUnitedScreenUsingApi() throws Throwable {
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
    @Then("^user validate t shirt number not zero$")
    public void userValidateTShirtNumberNotZero() throws Throwable {
        try {
            String actualTShirtNumberNotZero = myUnitedPage.getTshirtNumber();
            soft.assertNotEquals(actualTShirtNumberNotZero, 0);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated t shirt no from previous step");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating t shirt no from previous step <br />" + e);
            throw e;
        }

    }

	@And("^user scrolls right to left to navigate appearence$")
	public void userScrollsRightToLeftToNavigateAppearence() throws Throwable {
		try {
			  myUnitedPage.userScrollsRightToLeftToNavigateAppearence();
          ExtentsReportManager.extentReportLogging("info", "validated content in my tickets component");
      } catch (AssertionError e) {
          ExtentsReportManager.extentReportLogging("fail", "Error in validating content in my tickets component<br />" + e);
          throw e;
      }
	}
    }

	
   
	

