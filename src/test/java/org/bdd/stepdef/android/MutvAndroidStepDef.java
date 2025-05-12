package org.bdd.stepdef.android;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bdd.pages.ExplorePage;
import org.bdd.pages.IdmPage;
import org.bdd.pages.MutvPage;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.MUTVAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MutvAndroidStepDef {
    public SoftAssert soft = new SoftAssert();
    public MutvPage mutvPage = new MutvPage();
    public IdmPage idmPage = new IdmPage();
    public MUTVAPIResponse mutvAPIResponse = new MUTVAPIResponse();

    @And("^user clicks on Mutv tab$")
    public void userClicksOnMutvTab() {
        try {
            mutvPage.clickOnMutvTab();
            ExtentsReportManager.extentReportLogging("info", "Clicked on mutv tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking mutv tab<br />" + e);
            throw e;
        }

    }

    @And("^user clicks on explore icon$")
    public void userClicksOnExploreIcon() {
        try {
            mutvPage.clickOnExploreIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on explore icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking explore icon<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back button and navigates to mutv screen$")
    public void userClicksOnBackButtonAndNavigatesToMutvScreen() {
        try {
            mutvPage.clickBackBtn();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back button and navigates to mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on back icon and navigating to mutv screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on MyList icon$")
    public void userClicksOnMyListIcon() throws Throwable {
        try {
            mutvPage.clickOnMyListIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on my list icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking my list icon<br />" + e);
            throw e;
        }
    }


    @And("^user clicks on Schedule icon$")
    public void userClicksOnScheduleIcon() {
        try {
            mutvPage.clickScheduleIconMutvScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on schedule icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking schedule icon<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Back icon$")
    public void userClicksOnBackIcon() throws Throwable {
        try {
            mutvPage.clickOnBackIconScheduleMutvScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon<br />" + e);
            throw e;
        }
    }

    @Then("^user validate list containing schedules for next seven days$")
    public void userValidateListContainingSchedulesForNextSevenDays() throws Throwable {
        try {
            mutvPage.clickOnDay(new Common().getDayandFutureDay(1));
            mutvPage.clickOnDay(new Common().getDayandFutureDay(2));
            mutvPage.clickOnDay(new Common().getDayandFutureDay(3));
            mutvPage.clickOnDay(new Common().getDayandFutureDay(4));
            mutvPage.clickOnDay(new Common().getDayandFutureDay(5));
            mutvPage.clickOnDay(new Common().getDayandFutureDay(6));
            ExtentsReportManager.extentReportLogging("info", "Validated list containing schedules for next seven days");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the list containing schedules for next seven days<br />" + e);
            throw e;
        }
    }

    @And("user clicks on not now button in match appearance alert screen")
    public void userClicksOnNotNowButtonInMatchAppearanceAlertScreen() {
        try {
            mutvPage.clickOnNotNowButtonInMatchAppearanceAlertScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on not now button in match appearance alert screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking not now button in match appearance alert screen<br />" + e);
            throw e;
        }
    }

    @And("user selects the dont allow button in audio notification alert")
    public void userSelectsTheDontAllowButtonInAudioNotificationAlert() {
        try {
            mutvPage.selectsTheDontAllowButtonInAudioNotificationAlert();
            ExtentsReportManager.extentReportLogging("info", "Selected dont allow button in audio notification alert");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting dont allow button in audio notification alert <br />" + e);
            throw e;
        }
    }

    @And("user selects not allow in the photos and videos access in alert")
    public void userSelectsNotAllowInThePhotosAndVideosAccessInAlert() {
        try {
            mutvPage.selectsNotAllowInThePhotosAndVideosAccessInAlert();
            ExtentsReportManager.extentReportLogging("info", "Selected not allow in photos and videos access in alert");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting not allow in photos and videos access in alert <br />" + e);
            throw e;
        }
    }

    @And("user clicks on the notification at bottom of screen")
    public void userClicksOnTheNotificationAtBottomOfScreen() {
        try {
            mutvPage.clicksOnTheNotificationAtBottomOfScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on notification at bottom of screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking notification at bottom of screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on plus icon$")
    public void userClicksOnPlusIcon() {
        try {
            mutvPage.clicksOnPlusIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on plus icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking plus icon<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on one video$")
    public void userClicksOnOneVideo() {
        try {
            mutvPage.clicksOnOneVideo();
            ExtentsReportManager.extentReportLogging("info", "Clicked on one video");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on one video<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on plus mylist icon$")
    public void userClicksOnPlusMylistIcon() {
        try {
            mutvPage.clickPlusSymbolMyListScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on plus in my list icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking plus in my list icon<br />" + e);
            throw e;
        }
    }

    @Then("^user validate video$")
    public void userValidateVideo() {
        try {
            boolean flag = mutvPage.getValidateVideoIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated video");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating video<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on video icon in mylist screen$")
    public void userClicksOnVideoIconInMylistScreen() {
        try {
            mutvPage.clickOnVediTitleLink();
            ExtentsReportManager.extentReportLogging("info", "Clicked on video icon in my list screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on video icon in my list screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on uncheck mylist icon$")
    public void userClicksOnUncheckMylistIcon() {
        try {
            mutvPage.clicksOnUncheckMylistIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on uncheck in my list icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking uncheck in my list icon<br />" + e);
            throw e;
        }
    }

    @And("^user click on less than symbol button in my list screen$")
    public void userClickOnLessThanSymbolButtonInMyListScreen() {
        try {
            mutvPage.ClickOnLessThanSymbolButtonInMyListScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on less than symbol button in my list screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on less than symbol button in my list screen<br />" + e);
            throw e;
        }
    }

    @And("^user click on greater than symbol button in my list screen$")
    public void userClickOnGreaterThanSymbolButtonInMyListScreen() {
        try {
            mutvPage.clickOnGreaterThenSymbolInMyListScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on greater than symbol button in my list screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking freater than symbol button in my list screen <br />" + e);
            throw e;
        }
    }

    @Then("^user validate no videos in mylist screen$")
    public void userValidateNoVideosInMylistScreen() {
        try {
            boolean flag = mutvPage.validateplusIconIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated no videos in my list screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating no videos in my list screen <br />" + e);
            throw e;
        }
    }

    @And("user selects the video and check CBS badge")
    public void userSelectsTheVideoAndCheckCBSBadge() {
        try {
            mutvPage.selectsTheVideoAndCheckCBSBadge();
            ExtentsReportManager.extentReportLogging("info", "Selected the video and check CBS Badge");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error <br />" + e);
            throw e;
        }
    }

    @Then("validate subscribe screen is displayed")
    public void userValidateSubscribeScreenIsDisplayed() {
        try {
            boolean flag = mutvPage.validateSubscribeScreenIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated subscribe screen ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating subscribe screen <br />" + e);
            throw e;
        }
    }

    @And("user selects the video and checks CBR badge")
    public void userSelectsTheVideoAndChecksCBRBadge() {
        try {
            mutvPage.selectsTheVideoAndChecksCBRBadge();
            ExtentsReportManager.extentReportLogging("info", "Selected video and checked CBR badge");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting video and checking CBR badge<br />" + e);
            throw e;
        }
    }

    @Then("validate register screen is displayed")
    public void userValidateRegisterScreenIsDisplayed() {
        try {
            boolean flag = mutvPage.validateRegisterScreenIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated register screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validation of register screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks close button in subscribe screen")
    public void userClicksCloseButtonInSubscribeScreen() {
        try {
            mutvPage.clicksCloseButtonInSubscribeScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked close button in subscribe screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking close button in subscribe screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on the hero carousel dots in Mutv screen$")
    public void userClicksOnTheHeroCarouselDotsInMutvScreen() {
        try {
            mutvPage.clicksOnTheHeroCarouselDotsInMutvScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on hero carousel dots in mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking hero carousel dots in mutv screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates time,video icon,playing now text,title and play button")
    public void userValidatesTimeVideoIconPlayingNowTextTitleAndPlayButton() {
        try {
            boolean flag = mutvPage.validateTimeInScheduleScreen();
            soft.assertTrue(flag);
            flag = mutvPage.validateVideoIconInScheduleScreen();
            soft.assertTrue(flag);
            flag = mutvPage.validatePlayingNowTextInScheduleScreen();
            soft.assertTrue(flag);
            flag = mutvPage.validateVideoTitleInScheduleScreen();
            soft.assertTrue(flag);
            flag = mutvPage.validatePlayButtonInScheduleScreen();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated time,video,icon,playing now,title and play button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating time,video,icon,playing now,title and play button<br />" + e);
            throw e;
        }
    }

    @And("user clicks on play button in schedule screen")
    public void userClicksOnPlayButtonInScheduleScreen() {
        try {
            mutvPage.clicksOnPlayButtonInScheduleScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on play button in schedule screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking play button in schedule screen<br />" + e);
            throw e;
        }
    }

    @And("user clicks pause button")
    public void userClicksPauseButton() throws Exception {
        try {
            mutvPage.clicksPauseButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked pause button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking pause button<br />" + e);
            throw e;
        }
    }

    @And("user clicks on close button")
    public void userClicksOnCloseButton() {
        try {
            mutvPage.clicksOnCloseButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked on close button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking close button<br />" + e);
            throw e;
        }
    }

    @And("user clicks play button")
    public void userClicksPlayButton() throws Exception {
        try {
            mutvPage.clicksPauseButton();
            ExtentsReportManager.extentReportLogging("info", "Clicked play button ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking play button<br />" + e);
            throw e;
        }
    }

    @And("user clicks on plus icon in mutv schedule screen")
    public void userClicksOnPlusIconInMutvScheduleScreen() {
        try {
            mutvPage.clicksOnPlusIconInMutvScheduleScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on plus icon in mutv schedule screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking plus icon in mutv schedule screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks on go to settings")
    public void userClicksOnGoToSettings() {
        try {
            mutvPage.clicksOnGoToSettings();
            ExtentsReportManager.extentReportLogging("info", "Clicked on goto setting ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking goto setting<br />" + e);
            throw e;
        }
    }

    @And("user clicks on notification from app info screen")
    public void userClicksOnNotificationFromAppInfoScreen() {
        try {
            mutvPage.clicksOnNotificationFromAppInfoScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on notification from app info screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking notification from app info screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks on set remainder icon")
    public void userClicksOnSetRemainderIcon() {
        try {
            mutvPage.clicksOnSetRemainderIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on set remainder icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking set remainder icon<br />" + e);
            throw e;
        }
    }

    @And("user clicks on man utd stage in alarm and reminder")
    public void userClicksOnManUtdStageInAlarmAndReminder() {
        try {
            mutvPage.clicksOnManUtdStageInAlarmAndReminder();
            ExtentsReportManager.extentReportLogging("info", "Clicked on man utd stage in alarm and remainder");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking man utd stage in alarm<br />" + e);
            throw e;
        }
    }

    @And("user clicks on alarm switch in alarm and remainder")
    public void userClicksOnAlarmSwitchInAlarmAndRemainder() {
        try {
            mutvPage.clicksOnAlarmSwitchInAlarmAndRemainder();
            ExtentsReportManager.extentReportLogging("info", "Clicked on alarm switch in alarm and remainder");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on alarm switch in alarm and remainder<br />" + e);
            throw e;
        }
    }

    @And("user clicks on remainder set icon")
    public void userClicksOnRemainderSetIcon() {
        try {
            mutvPage.clicksOnRemainderSetIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on remainder set icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking remainder set icon<br />" + e);
            throw e;
        }
    }

    @Then("validate the tick icon displayed")
    public void validateTheTickIconDisplayed() {
        try {
            boolean flag = mutvPage.validateTheTickIconDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the tick icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the tick icon<br />" + e);
            throw e;
        }
    }

    @Then("validate the tick icon is removed in mutv schedule screen")
    public void validateTheTickIconIsRemovedInMutvScheduleScreen() {
        try {
            boolean flag = mutvPage.validateTheTickIconDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the tick icon is removed from mutv schedule screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating tick icon is removed from mutv schedule screen<br />" + e);
            throw e;
        }
    }

    @And("click on a video in mutv page")
    public void clickOnAVideoInMutvPage() {
        try {
            mutvPage.clickOnAVideoInMutvPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on a video in mutv page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking a video in mutv page<br />" + e);
            throw e;
        }
    }

    static Double currentPlayTimeInD;
    static Double currentPlayTimeInD1;
    static Double totalPlayTimeInD;

    @And("user obtained the current video time")
    public void userObtainedTheCurrentVideoTime() {
        try {
            String currentPlayTime = mutvPage.obtainedTheCurrentVideoTime();
            currentPlayTimeInD = Double.parseDouble(currentPlayTime.replaceAll("[^0-9.]", ""));
            ExtentsReportManager.extentReportLogging("info", "Obtained current video time");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in getting video time <br />" + e);
            throw e;
        }
    }

    @And("user plays the video for twenty seconds")
    public void userPlaysTheVideoForTwentySeconds() throws Exception {
        try {
            mutvPage.playsTheVideoForTwentySeconds();
            String currentPlayTime = mutvPage.obtainedTheCurrentVideoTime();
            currentPlayTimeInD1 = Double.parseDouble(currentPlayTime.replaceAll("[^0-9.]", ""));
            ExtentsReportManager.extentReportLogging("info", "Played the video for twenty seconds");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in playing video from twenty seconds<br />" + e);
            throw e;
        }
    }

    @Then("user validates the video is played using play time")
    public void userValidatesTheVideoIsPlayedUsingPlayTime() {
        try {
            String totalPlayTime = mutvPage.obtainedTheTotalVideoTime();
            totalPlayTimeInD = Double.parseDouble(totalPlayTime.replaceAll("[^0-9.]", ""));
            Double timeDiff = currentPlayTimeInD1 - currentPlayTimeInD;
            soft.assertTrue(timeDiff > 15);
            ExtentsReportManager.extentReportLogging("info", "Validated video is played using play time");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the video played using play time <br />" + e);
            throw e;
        }
    }

    @And("user clicks on pause icon in the played video")
    public void userClicksOnPauseIconInThePlayedVideo() throws Exception {
        try {
            mutvPage.clicksOnPauseIconInThePlayedVideo();
            ExtentsReportManager.extentReportLogging("info", "Clicked on pause icon in played video");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking pause icon in played video<br />" + e);
            throw e;
        }
    }

    @And("user clicks on the close button in the played video")
    public void userClicksOnTheCloseButtonInThePlayedVideo() {
        try {
            mutvPage.clicksOnTheCloseButtonInThePlayedVideo();
            ExtentsReportManager.extentReportLogging("info", "Clicked on close button in played video");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking close button in played video<br />" + e);
            throw e;
        }
    }

    @And("user clicks on log in button in subscribe page")
    public void userClicksOnLogInButtonInSubscribePage() {
        try {
            idmPage.clicksOnLogInButtonInSubscribePage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on log in button in subscribe page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking login button in subscribe page <br />" + e);
            throw e;
        }
    }

    @And("user clicks play button in the podcast screen")
    public void userClicksPlayButtonInThePodcastScreen() {
        try {
            mutvPage.clicksPlayButtonInThePodcastScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked played button in podcast screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking played button in podcast screen <br />" + e);
            throw e;
        }
    }

    @Then("user verify play button for the subscribed user")
    public void userVerifyPlayButtonForTheSubscribedUser() {
        try {
            soft.assertTrue(mutvPage.verifyPlayButtonForTheSubscribedUser());
            ExtentsReportManager.extentReportLogging("info", "Verified play button for subscribed user");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verifying play button for subscribed user <br />" + e);
            throw e;
        }
    }

    @Then("user validates the Mutv Tab in the navigation bar")
    public void userValidatesTheMutvTabInTheNavigationBar() {
        try {
            boolean flag = mutvPage.validatesTheMutvTabInTheNavigationBar();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated mutv tab in navigation bar");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating mutv tab in navigation bar<br />" + e);
            throw e;
        }
    }

    @Then("user validates the search option in mutv screen")
    public void userValidatesTheSearchOptionInMutvScreen() {
        try {
            boolean flag = mutvPage.validatesTheSearchOptionInMutvScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated search option in mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating search option in mutv screen <br />" + e);
            throw e;
        }
    }

    @Then("user validates schedule icon displayed in mutv screen")
    public void userValidatesScheduleIconDisplayedInMutvScreen() {
        try {
            boolean flag = mutvPage.validatesScheduleIconDisplayedInMutvScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated schedule icon displayed in mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating schedule icon displayed in mutv screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates hero container is displayed in mutv when enabled from CMS")
    public void userValidatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMS() {
        try {
            boolean flag = mutvPage.validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMS();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated hero container is displayed in mutv when enabled from CMS");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in valdiating hero container is displayed in mutv when enabled from CMS <br />" + e);
            throw e;
        }
    }

    @Then("user validates hero container is not displayed in mutv when enabled from CMS")
    public void userValidatesHeroContainerIsNotDisplayedInMutvWhenEnabledFromCMS() {
        try {
            boolean flag = mutvPage.validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMS();
            soft.assertTrue(!flag);
            ExtentsReportManager.extentReportLogging("info", "Validated hero container is not displayed in mutv when enabled from CMS");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating hero container is not displayed in mutv when enabled from CMS<br />" + e);
            throw e;
        }
    }

    @Then("user validates episode carousels are displayed in mutv screen")
    public void userValidatesEpisodeCarouselsAreDisplayedInMutvScreen() {
        try {
            List<Boolean> flag = mutvPage.validatesEpisodeCarouselsAreDisplayedInMutvScreen();
            for (Boolean l : flag) {
                if (!l.equals(true)) {
                    soft.assertTrue(l);
                }

            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated episode carousel are displayed in mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating episode carousel diaplayed in mutv screen<br />" + e);
            throw e;
        }
    }

    @Then("user navigates to one of the episode carousel and validates the view all button")
    public void userNavigatesToOneOfTheEpisodeCarouselAndValidatesTheViewAllButton() {
        try {
            boolean flag = mutvPage.navigatesToOneOfTheEpidsodeCaroselAndValidatesTheViewAllButton();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Navigated to one of episode carousel and validated the view all button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to one of episode carousel and validating view all button <br />" + e);
            throw e;
        }
    }

    @Then("user taps and verify episode landing screen is displayed")
    public void userTapsAndVerifyEpisodeLandingScreenIsDisplayed() {
        try {
            boolean flag = mutvPage.tapsAndVerifyEpisodeLandingScreenIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Tapped and verified episode landing screen is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in tapping and validating episode landing screen is displayed<br />" + e);
            throw e;
        }
    }

    @Then("user taps Full episode type videos and verify video landing page is displayed")
    public void userTapsFullEpisodeTypeVideosAndVerifyVideoLandingPageIsDisplayed() {
        try {
            boolean flag = mutvPage.tapsFullEpisodeTypeVideosAndVerifyVideoLandingPageIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Tapped full episode type videos and verified video landing page is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in tapping full episode type videos and verifies video landing page <br />" + e);
            throw e;
        }
    }

    @Then("user taps clip and video plays in full screen")
    public void userTapsClipAndVideoPlaysInFullScreen() {
        try {
            boolean flag = mutvPage.tapsClipAndVideoPlaysInFullScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Tapped clip and video played in full screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in tapping clip and video played in full screen <br />" + e);
            throw e;
        }
    }

    @Then("user validates my list icon is displayed in top left of mutv screen")
    public void userValidatesMyListIconIsDisplayedInTopLeftOfMutvScreen() {
        try {
            boolean flag = mutvPage.validatesMyListIconIsDisplayedInTopLeftOfMutvScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated my list icon is displayed in top left of mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my list icon is displayed in top left of mutv screen <br />" + e);
            throw e;
        }
    }

    @Then("user validates my list screen is displayed")
    public void userValidatesMyListScreenIsDisplayed() {
        try {
            boolean flag = mutvPage.validatesMyListScreenIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated my list screen is displayed or not");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating my list screen is displayed<br />" + e);
            throw e;
        }
    }

    @Then("user taps back icon and validate mutv page is displayed")
    public void userTapsBackIconAndValidateMutvPageIsDisplayed() {
        try {
            boolean flag = mutvPage.tapsBackIconAndValidateMutvPageIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Tapped back icon and validated mutv page is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in tapping back icon and validating mutv page is displayed<br />" + e);
            throw e;
        }
    }

    @Then("user validates find Something to Add button is displayed")
    public void userValidatesFindSomethingToAddButtonIsDisplayed() {
        try {
            boolean flag = mutvPage.userValidatesFindSomethingToAddButtonIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated find something to add button is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating find something to add button is displayed <br />" + e);
            throw e;
        }
    }

    @Then("user validates plus icon is displayed")
    public void userValidatesPlusIconIsDisplayed() {
        try {
            boolean flag = mutvPage.validatesPlusIconIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated plus icon is displayed or not");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating plus icon is displayed or not<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on braze in app msg$")
    public void userClicksOnBrazeInAppMsg() {
        try {
            mutvPage.clicksOnImagePopUpWindow();
            mutvPage.clicksOnShopNowPopUP();
            ExtentsReportManager.extentReportLogging("info", "Clicked on braze in app msg");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on braze in app msg<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on one podcast audio in mutv screen$")
    public void userClicksOnOnePodcastAudioInMutvScreen() {
        try {
            mutvPage.clicksOnOnePodcastAudioInMutvScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on podcast audio in mutv screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on podcast audio in mutv screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validate podcast audio in my list screen$")
    public void userValidatePodcastAudioInMyListScreen() {
        try {
            boolean flag = mutvPage.validatePodcastAudioInMyListScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated podcast audio in my list screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating podcast audio in my list screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the CBR badge is not displayed for Logged in user$")
    public void userValidatesTheCBRBadgeIsNotDisplayedForLoggedInUser() {
        try {
            mutvPage.validatesCBRScreeneIsNotDisplayedForLoggedInUser();
            ExtentsReportManager.extentReportLogging("info", "Validated CBR badge is not displayed for logged in user");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating CBR badge is not displayed for logged in user<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the epg icon in top right$")
    public void userValidatesTheEpgIconInTopRight() {
        try {
            boolean flag = new MutvPage().ValidatesTheEpgIconInTopRightIsDisplayed();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the epg icon in top right");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Validating the epg icon in top right<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the schedule icon in epg schedule page$")
    public void userValidatesTheScheduleIconInEpgSchedulePage() {
        try {
            boolean flag = new MutvPage().validatesTheScheduleIconInEpgSchedulePage();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the epg icon in top right");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Validating the epg icon in top right<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the current program with white border and play button$")
    public void userValidatesTheCurrentProgramWithWhiteBorderAndPlayButton() {
        try {
            boolean flag = new MutvPage().validatePlayButtonInScheduleScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the current program with white border and play button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the current program with white border and play button<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the CBR&CBS badges for future schedule program$")
    public void userValidatesTheCBRCBSBadgesForFutureScheduleProgram() {
        try {
            boolean flag = new MutvPage().validatesCBSBadgesForFutureScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the CBR and CBS Badges for previous schedule program$")
    public void userValidatesTheCBRAndCBSBadgesForPreviousScheduleProgram() {
        try {
            boolean flag = new MutvPage().validatesCBSBadgesForPreviousScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Mutv icon and description along with program details$")
    public void userValidatesMutvIconAndDescriptionAlongWithProgramDetails() throws Throwable {
        try {
            boolean flag = new MutvPage().validatesMutvIconAndDescriptionAlongWithProgramDetails();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
    }

    @Then("^user validates set Reminder button and close button$")
    public void userValidatesSetReminderButtonAndCloseButton() throws Throwable {
        try {
            boolean flag = new MutvPage().validatesSetReminderButtonAndCloseButton();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
    }

    @Then("^user validates podcaset heading in MUTV screen using API$")
    public void userValidatesPodcasetHeadingInMUTVScreenUsingAPI() throws Throwable {
        try {
            String expectedPodcastTextFromAPI = mutvAPIResponse.getMUTVPodcastTextFromApi("PosdcastTextInMUTVEndPoint");
            String actualWelcomeText = mutvPage.getPodcastTextFromMUTVScreen();
            ExtentsReportManager.extentReportLogging("info", "Expected Podcast Text FromA PI" + expectedPodcastTextFromAPI);
            ExtentsReportManager.extentReportLogging("info", "Actual Podcast Text from UI" + actualWelcomeText);
            soft.assertEquals(actualWelcomeText.toUpperCase(), expectedPodcastTextFromAPI.toUpperCase());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated podcast in MUTV screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in podcast in MUTV screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on view all in MUTV screen$")
    public void userClicksOnViewAllInMUTVScreen() {
        try {
            mutvPage.scrolldownToViewAllAndClickonViewAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on explore icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking explore icon<br />" + e);
            throw e;
        }
    }

    @Then("^user validate list in EPC Ten MOST EMOTIONAL MOMENTS screen$")
    public void userValidateListInEPCTenMOSTEMOTIONALMOMENTScreen() throws Exception {
        try {
            List expectedListUnderViewAll = new ArrayList<>();
            expectedListUnderViewAll = mutvAPIResponse.getViewAllfromMUTVApi("ViewAllListOne");
            ExtentsReportManager.extentReportLogging("info", "Expected Shop menu items" + expectedListUnderViewAll);
            ExtentsReportManager.extentReportLogging("info", "Actual Shop menu items" + mutvPage.getViewAllListOneInMUTVScreen());

            soft.assertEquals(expectedListUnderViewAll, mutvPage.getViewAllListOneInMUTVScreen());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "user vaidate View All list names details");

        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Validating View all and error in validation of view all values values<br />" + e);
            throw e;
        }
    }

	@And("^user validate MUTV Today Schecule description using api$")
	public void userValidateMUTVTodayScheculeDescriptionUsingApi() throws Throwable {
		 try {
	            List expectedMUTVCalendarWeekly = new ArrayList<>();
	            List actualMUTVCalendarWeekly = new ArrayList<>();
	            expectedMUTVCalendarWeekly = mutvAPIResponse.getMUTVCalendarWidgetTextDexcriptionApi("GetEPGScheduleWeekly");
	            actualMUTVCalendarWeekly = mutvPage.getEpgScheduleWeeklyDescriptionListOneInMUTVScreen();
	            ExtentsReportManager.extentReportLogging("info","Expected calendar weekly items"+ expectedMUTVCalendarWeekly);
	            ExtentsReportManager.extentReportLogging("info","Actual calendar weekly items"+ actualMUTVCalendarWeekly);
	            soft.assertTrue(expectedMUTVCalendarWeekly.containsAll(actualMUTVCalendarWeekly));
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "user vaidate calendar weekly list names details");

	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Validating View all and error in validation of calendar weekly values<br />" + e);
	            throw e;
	        }
	}

    @And("user clicks search button in mutv screen")
    public void userClicksSearchButtonInMutvScreen() {
        try {
            mutvPage.clicksSearchInMutvScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked search button in united screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking search button in united screen <br />" + e);
            throw e;
        }
    }

	@Then("^user verify the following details using Api$")
	public void userVerifyTheFollowingDetailsUsingApi() throws Throwable {
		try {

            String myListTitleFromAPI = mutvAPIResponse.getMyListTitleFromAPI("MUTVMyListEndpoint");
            String actualMyList = mutvPage.getMyListTitle();
            soft.assertEquals(actualMyList.toUpperCase(), myListTitleFromAPI.toUpperCase());

            String myListDescAPI = mutvAPIResponse.getMyListDescFromAPI("MUTVMyListEndpoint");
            String actualMyListDescAPI = mutvPage.getMyListDesc();
            soft.assertEquals(actualMyListDescAPI.toUpperCase(), myListDescAPI.toUpperCase());

            String findSomeThingToAddAPI = mutvAPIResponse.getFindSomeThingToAddFromAPI("MUTVMyListEndpoint");
            String actualFindSomeThingToAdd = mutvPage.getFindSomeThingToAdd();
            soft.assertEquals(actualFindSomeThingToAdd.toUpperCase(), findSomeThingToAddAPI.toUpperCase());

            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "verifying the following details using Api");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in verify the following details using Api<br />" + e);
            throw e;
        }
    }
	

    @Then("user verify all carousel is displayed in mutv page using api")
    public void userVerifyAllCarouselIsDisplayedInMutvPageUsingApi() throws IOException {
        try {
            ArrayList<String> carouselListFromAPI = mutvAPIResponse.getMutvCarouselListFromEndPoint("getMutvCarouselListEndPoint");
            ArrayList<String> carouselListFromUI = mutvPage.getCarouselListFromSearchPage();
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

	@Then("^user validates the CBS/CBR badges display for previous schedule program$")
	public void userValidatesTheCBSCBRBadgesDisplayForPreviousScheduleProgram() throws Throwable {
		try {
            boolean flag = new MutvPage().CBSCBRBadgesDisplayForPreviousScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for previous schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for previous schedule program<br />" + e);
            throw e;
        }
	}

	@Then("^user validates the CBS/CBR badges display for future schedule program$")
	public void userValidatesTheCBSCBRBadgesDisplayForFutureScheduleProgram() throws Throwable {
		try {
            boolean flag = new MutvPage().CBSCBRBadgesDisplayForFutureScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
	}

	@Then("^user validates the CBS/CBR badges is not displayed for current program$")
	public void userValidatesTheCBSCBRBadgesIsNotDisplayedForCurrentProgram() throws Throwable {
		try {
            boolean flag = new MutvPage().CBSCBRBadgesIsNotDisplayedForCurrentProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for current program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for current program<br />" + e);
            throw e;
        }
	}
}
