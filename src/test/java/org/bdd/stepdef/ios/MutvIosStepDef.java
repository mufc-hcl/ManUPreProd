package org.bdd.stepdef.ios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.pages.*;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.PropertyFileManager;
import org.bdd.utils.apiResponse.MUTVAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MutvIosStepDef {
	public SoftAssert soft = new SoftAssert();
	public MutvPage mutvPage = new MutvPage();
	public IdmPage idmPage = new IdmPage();
	public MUTVAPIResponse mutvAPIResponse = new MUTVAPIResponse();
	private static final Logger log = LogManager.getLogger(ShopPage.class);

	@And("^user clicks on Mutv tab in ios$")
	public void userClicksOnMutvTabInIos() throws Throwable {
		try {
			mutvPage.clickOnMutvTab();
			ExtentsReportManager.extentReportLogging("info", "Clicked on MUTV tab");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking MUTV tab" + e);
			throw e;
		}

	}

	@And("^user clicks on explore icon in ios$")
	public void userClicksOnExploreIconInIos() throws Throwable {
		try {
			mutvPage.clickOnExploreIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked On Explore Icon In Ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking On Explore Icon In Ios" + e);
			throw e;
		}
	}

	@And("^user clicks on MyList icon in ios$")
	public void userClicksOnMyListIconInIos() throws Throwable {
		try {
			mutvPage.clickOnMyListIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked On  MyList icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking  MyList icon in ios" + e);
			throw e;
		}
	}

	@Then("^user verify the following details in ios using Api$")
	public void userVerifyTheFollowingDetailsInIos() throws Throwable {
		try {

            String myListTitleFromAPI = mutvAPIResponse.getMyListTitleFromAPI("MUTVMyListEndpoint");
            String actualMyList = mutvPage.getMyListTitle();
            soft.assertEquals(actualMyList.toUpperCase(), myListTitleFromAPI.toUpperCase());
            
//            String myListDescAPI = mutvAPIResponse.getMyListDescFromAPI("MUTVMyListEndpoint");
//            String actualMyListDescAPI = mutvPage.getMyListDesc();
//            soft.assertEquals(actualMyListDescAPI.toUpperCase(), myListDescAPI.toUpperCase());

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
	

	@And("^user clicks on back button and navigates to mutv screen in ios$")
	public void userClicksOnBackButtonAndNavigatesToMutvScreenInIos() throws Throwable {
		try {
			mutvPage.clickBackBtn();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked On  on back button and navigates to mutv screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking  on back button and navigates to mutv screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on Schedule icon in ios$")
	public void userClicksOnScheduleIconInIos() throws Throwable {
		try {
			mutvPage.clickScheduleIconMutvScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked On  on Schedule icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on Schedule icon in ios" + e);
			throw e;
		}
	}

	@Then("^user validate list containing schedules for next seven days in ios$")
	public void userValidateListContainingSchedulesForNextSevenDaysInIos() throws Throwable {

		try {
			mutvPage.clickOnDay(new Common().getDayandFutureDayIos(1));
			mutvPage.clickOnDay(new Common().getDayandFutureDayIos(2));
			mutvPage.clickOnDay(new Common().getDayandFutureDayIos(3));
			mutvPage.clickOnDay(new Common().getDayandFutureDayIos(4));
			mutvPage.clickOnDay(new Common().getDayandFutureDayIos(5));
			mutvPage.clickOnDay(new Common().getDayandFutureDayIos(6));
			ExtentsReportManager.extentReportLogging("info",
					"validated list containing schedules for next seven days in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating list containing schedules for next seven days in ios" + e);
			throw e;
		}

	}

	@And("^user clicks on Back icon in ios$")
	public void userClicksOnBackIconInIos() throws Throwable {
		try {
			mutvPage.clickOnBackIconScheduleMutvScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked on Back icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on Back icon in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on plus icon in ios$")
	public void userClicksOnPlusIconInIos() throws Throwable {
		try {
			mutvPage.clicksOnPlusIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked on plus icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on plus icon in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on one video in ios$")
	public void userClicksOnOneVideoInIos() throws Throwable {
		try {
			mutvPage.clicksOnOneVideo();
			ExtentsReportManager.extentReportLogging("info", "Clicked on one video in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on one video in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on plus mylist icon in ios$")
	public void userClicksOnPlusMylistIconInIos() throws Throwable {
		try {
			mutvPage.clickPlusSymbolMyListScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked on plus mylist icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on plus mylist icon in ios" + e);
			throw e;
		}
	}

	@And("^user click on less than symbol button in my list screen in ios$")
	public void userClickOnLessThanSymbolButtonInMyListScreenInIos() throws Throwable {
		try {
			mutvPage.ClickOnLessThanSymbolButtonInMyListScreen();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked on less than symbol button in my list screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on less than symbol button in my list screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validate video in ios$")
	public void userValidateVideoInIos() throws Throwable {

		try {
			boolean flag = mutvPage.getValidateVideoIsDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated video in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating video in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on video icon in mylist screen in ios$")
	public void userClicksOnVideoIconInMylistScreenInIos() throws Throwable {
		try {
			mutvPage.clickOnVediTitleLink();
			ExtentsReportManager.extentReportLogging("info", "Clicked on on video icon in mylist screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on video icon in mylist screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on uncheck mylist icon in ios$")
	public void userClicksOnUncheckMylistIconInIos() throws Throwable {
		try {
			mutvPage.clicksOnUncheckMylistIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked on uncheck mylist icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on uncheck mylist icon in ios" + e);
			throw e;
		}
	}

	@And("^user click on greater than symbol button in my list screen in ios$")
	public void userClickOnGreaterThanSymbolButtonInMyListScreenInIos() throws Throwable {
		try {
			mutvPage.clickOnGreaterThenSymbolInMyListScreen();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked on greater than symbol button in my list screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on greater than symbol button in my list screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validate no videos in mylist screen in ios$")
	public void userValidateNoVideosInMylistScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validateplusIconIsDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated no videos in mylist screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating no videos in mylist screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on the hero carousel dots in Mutv screen in ios$")
	public void userClicksOnTheHeroCarouselDotsInMutvScreenInIos() throws Throwable {
		try {
			boolean heroCarousel = mutvPage.clicksOnTheHeroCarouselDotsInMutvScreenIos();
            soft.assertTrue(heroCarousel,"Hero carousel is not present in mutv screen in ios");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Clicked on the hero carousel dots in Mutv screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on the hero carousel dots in Mutv screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validates time,video icon,playing now text,title and play button in ios$")
	public void userValidatesTimeVideoIconPlayingNowTextTitleAndPlayButtonInIos() throws Throwable {
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
			ExtentsReportManager.extentReportLogging("info",
					"validated time,video icon,playing now text,title and play button in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating time,video icon,playing now text,title and play button in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on close button in ios$")
	public void userClicksOnCloseButtonInIos() throws Throwable {
		try {
			mutvPage.clicksOnCloseButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on close button in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on close button in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on play button in schedule screen in ios$")
	public void userClicksOnPlayButtonInScheduleScreenInIos() throws Throwable {
		try {
			mutvPage.clicksOnPlayButtonInScheduleScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked on play button in schedule screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on play button in schedule screen in ios" + e);
			throw e;
		}
	}

	@And("user clicks on the tick icon in ios")
	public void userClicksOnTheTickIconInIos() {
		try {
			mutvPage.clicksOnTheTickIconInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on the tick icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on the tick icon in ios" + e);
			throw e;
		}
	}

	@Then("validate the tick icon displayed in ios")
	public void validateTheTickIconDisplayedInIos() {
		try {
			boolean flag = mutvPage.validateTheTickIconDisplayedInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the tick icon displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating the tick icon displayed in ios" + e);
			throw e;
		}
	}

	@And("user clicks on remainder set icon in ios")
	public void userClicksOnRemainderSetIconInIos() {
		try {
			mutvPage.clicksOnRemainderSetIconInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on remainder set icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on remainder set icon in ios" + e);
			throw e;
		}
	}

	@Then("validate close icon is displayed")
	public void validateCloseIconIsDisplayed() {
		try {
			boolean flag = mutvPage.validateCloseIconIsDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated close icon is displayed");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating close icon is displayed" + e);
			throw e;
		}
	}

	@And("user clicks in close icon in remainder set page")
	public void userClicksInCloseIconInRemainderSetPage() {
		try {
			mutvPage.clicksInCloseIconInRemainderSetPage();
			ExtentsReportManager.extentReportLogging("info", "Clicked in close icon in remainder set page");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking in close icon in remainder set page" + e);
			throw e;
		}
	}

	@And("^user selects the video and check CBS badge in ios$")
	public void userSelectsTheVideoAndCheckCBSBadgeInIos() throws Throwable {
		try {
			mutvPage.SelectsTheVideoAndCheckCBSBadgeInIos();
			ExtentsReportManager.extentReportLogging("info", "Selected the video and check CBS badge in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in selectinh the video and check CBS badge in ios" + e);
			throw e;
		}
	}

	@Then("^validate subscribe screen is displayed in ios$")
	public void validateSubscribeScreenIsDisplayedInIos(DataTable table) throws Throwable {
		try {
			String expSubscrptionTitle = table.cell(1, 0);
//			String expDesc = table.cell(1, 1);
			String actualSubscrptionTitle = mutvPage.getSubscrptionTitleSubcribePage();
//			String actualDesc = mutvPage.getDescriptionSubscribePage();
			soft.assertEquals(actualSubscrptionTitle, expSubscrptionTitle);
//			soft.assertEquals(actualDesc, expDesc);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated subscribe screen is displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating subscribe screen is displayed in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on login button in subscribe screen$")
	public void userClicksOnLoginButtonInSubscribeScreen() throws Throwable {
		try {
			mutvPage.clicksinAppMsgIOSBrazeTestCloseButton();
			mutvPage.ClicksOnLoginButtonInSubscribeScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked on login button in subscribe screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on login button in subscribe screen" + e);
			throw e;
		}
	}

	@And("^user clicks on play Icon for CBS video$")
	public void userClicksOnPlayIconForCBSVideo() throws Throwable {
		try {
			mutvPage.ClicksOnPlayIconForCBSVideo();
			ExtentsReportManager.extentReportLogging("info", "Clicked on play Icon for CBS video");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on play Icon for CBS video" + e);
			throw e;
		}

	}

	@And("^user clicks on login button in subscribe screen in ios$")
	public void userClicksOnLoginButtonInSubscribeScreenInIos() throws Throwable {
		try {
			mutvPage.clicksOnLoginButtonInSubscribeScreenInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on login button in subscribe screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on login button in subscribe screen in ios" + e);
			throw e;
		}
	}

	@And("^user selects the video and check CBR badge in ios$")
	public void userSelectsTheVideoAndCheckCBRBadgeInIos() throws Throwable {
		try {
			mutvPage.selectsTheVideoAndCheckCBRBadgeInIos();
			ExtentsReportManager.extentReportLogging("info", "Selected the video and check CBR badge in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in selecting the video and check CBR badge in ios" + e);
			throw e;
		}
	}

	@Then("^user validate Register screen is displayed in ios$")
	public void userValidateRegisterScreenIsDisplayedInIos(DataTable table) throws Throwable {
		try {
			String expSignUpTitle = table.cell(1, 0);
			String expDesc = table.cell(1, 1);
			String actualSignUpTitle = mutvPage.getSignUpTitleRegisterPage();
			String actualDesc = mutvPage.getDescSignUpTitleRegisterPage();
			soft.assertEquals(actualSignUpTitle, expSignUpTitle);
			soft.assertEquals(actualDesc, expDesc);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated Register screen is displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating Register screen is displayed in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on play Icon for CBR video$")
	public void userClicksOnPlayIconForCBRVideo() throws Throwable {
		try {
			mutvPage.clicksOnPlayIconForCBRVideo();
			ExtentsReportManager.extentReportLogging("info", "Clicked on play Icon for CBR video");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on play Icon for CBR video" + e);
			throw e;
		}
	}

	@And("^user clicks on view all mutv page$")
	public void userClicksOnViewAllMutvPage() throws Throwable {
		try {
			mutvPage.clicksOnViewAllMutvPage();
			ExtentsReportManager.extentReportLogging("info", "Clicked on view all mutv page");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on view all mutv page" + e);
			throw e;
		}
	}

	@Then("^user validates mutv tab in the navigation bar in ios$")
	public void userValidatesMutvTabInTheNavigationBarInIos() throws Throwable {
		try {
			boolean flag = mutvPage.MutvTabInTheNavigationBarIsDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated mutv tab in the navigation bar in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating mutv tab in the navigation bar in ios" + e);
			throw e;
		}
	}

	@Then("^user validates the search icon in mutv screen in ios$")
	public void userValidatesTheSearchIconInMutvScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesTheSearchIconInMutvIsDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated the search icon in mutv screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the search icon in mutv screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validates schedule icon is displayed in MUTV screen in ios$")
	public void userValidatesScheduleIconIsDisplayedInMUTVScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesScheduleIconIsDisplayedInMUTVScreenInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated schedule icon is displayed in MUTV screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating schedule icon is displayed in MUTV screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validates my list icon is displayed in the MUTV screen in ios$")
	public void userValidatesMyListIconIsDisplayedInTheMUTVScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesMyListIconIsDisplayedInTheMUTVScreenInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated my list icon is displayed in the MUTV screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating my list icon is displayed in the MUTV screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validates Hero container is displayed in MUTV when enabled from CMS in ios$")
	public void userValidatesHeroContainerIsDisplayedInMUTVWhenEnabledFromCMSInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesHeroContainerIsDisplayedInMUTVIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated Hero container is displayed in MUTV when enabled from CMS in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating Hero container is displayed in MUTV when enabled from CMS in ios" + e);
			throw e;
		}
	}

	@Then("^user validates Episode carousels are displayed in the MUTV screen in ios$")
	public void userValidatesEpisodeCarouselsAreDisplayedInTheMUTVScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesEpisodeCarouselsAreDisplayedIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated Episode carousels are displayed in the MUTV screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating Episode carousels are displayed in the MUTV screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validates View All button is displayed for Episode carousels in ios$")
	public void userValidatesViewAllButtonIsDisplayedForEpisodeCarouselsInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesViewAllButtonIsDisplayedForEpisodeCarouselsInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated View All button is displayed for Episode carousels in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating View All button is displayed for Episode carousels in ios" + e);
			throw e;
		}
	}

	@Then("^user validates Episode landing screen in ios$")
	public void userValidatesEpisodeLandingScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesEpisodeLandingScreenInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated Episode landing screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating Episode landing screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on play icon in Video landing screen in ios$")
	public void userClicksOnPlayIconInVideoLandingScreenInIos() throws Throwable {
		try {
			mutvPage.clicksOnPlayIconInVideoLandingScreenInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on play icon in Video landing screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on play icon in Video landing screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on Full episode type videos in Video landing screen$")
	public void userClicksOnFullEpisodeTypeVideosInVideoLandingScreen() throws Throwable {
		try {
			mutvPage.clicksOnFullEpisodeTypeVideosInVideoLandingScreen();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked on Full episode type videos in Video landing screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on Full episode type videos in Video landing screen" + e);
			throw e;
		}
	}

	@Then("^user validates the Video landing screen is displayed when user taps on Full episode type videos$")
	public void userValidatesTheVideoLandingScreenIsDisplayedWhenUserTapsOnFullEpisodeTypeVideos() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesFullEpisodeLandingScreenInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated the Video landing screen is displayed when user taps on Full episode type videos");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the Video landing screen is displayed when user taps on Full episode type videos"
							+ e);
			throw e;
		}
	}

	@And("^user clicks on view all mutv page in ios$")
	public void userClicksOnViewAllMutvPageInIos() throws Throwable {
		try {
			mutvPage.clicksOnViewAllMutvPageInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on view all mutv page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on view all mutv page in ios" + e);
			throw e;
		}
	}

	@Then("^validate tapping on clip type video plays the videos in full screen$")
	public void validateTappingOnClipTypeVideoPlaysTheVideosInFullScreen() throws Throwable {
		try {
			boolean flag = mutvPage.ValidatesClipTypeVideoPlaysTheVideosInFullScreen();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated tapping on clip type video plays the videos in full screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating tapping on clip type video plays the videos in full screen" + e);
			throw e;
		}
	}

	@Then("^user validates plus icon is displayed in ios$")
	public void userValidatesPlusIconIsDisplayedInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validatesPlusIconIsDisplayedInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated plus icon is displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating plus icon is displayed in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on plus icon in podcast audio screen$")
	public void userClicksOnPlusIconInPodcastAudioScreen() throws Throwable {
		try {
			mutvPage.clicksOnPlusIconInPodcastAudioScreen();
			ExtentsReportManager.extentReportLogging("info", "Clicked on plus icon in podcast audio screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on plus icon in podcast audio screen" + e);
			throw e;
		}
	}

	@Then("^user validates the CBR video in My list screen in ios$")
	public void userValidatesTheCBRVideoInMyListScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validatesTheCBRVideoInMyListScreenInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated the CBR video in My list screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the CBR video in My list screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validates the CBS video in My list screen in ios$")
	public void userValidatesTheCBSVideoInMyListScreenInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validatesTheCBSVideoInMyListScreenInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated the CBS video in My list screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the CBS video in My list screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on one podcast audio in ios$")
	public void userClicksOnOnePodcastAudioInIos() throws Throwable {
		try {
			mutvPage.clicksOnOnePodcastAudioInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on one podcast audio in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on one podcast audio in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on CBR video icon in mylist screen in ios$")
	public void userClicksOnCBRVideoIconInMylistScreenInIos() throws Throwable {
		try {
			mutvPage.clicksOnCBRVideoIconInMylistScreenInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on CBR video icon in mylist screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on CBR video icon in mylist screen in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on CBS video icon in mylist screen in ios$")
	public void userClicksOnCBSVideoIconInMylistScreenInIos() throws Throwable {
		try {
			mutvPage.clicksOnCBSVideoIconInMylistScreenInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked on CBS video icon in mylist screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on CBS video icon in mylist screen in ios" + e);
			throw e;
		}
	}

	@Then("^user validate Podcast Audio in ios$")
	public void userValidatePodcastAudioInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validatesPodcastAudioInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated Podcast Audio in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating Podcast Audio in ios" + e);
			throw e;
		}
	}

	@And("^user clicks on log in button for CBR Video$")
	public void userClicksOnLogInButtonForCBRVideo() throws Throwable {
		try {
			mutvPage.clicksOnLogInButtonForCBRVideo();
			ExtentsReportManager.extentReportLogging("info", "Clicked on log in button for CBR Video");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on log in button for CBR Video" + e);
			throw e;
		}
	}

	@Then("^user validates hero container is displayed in mutv when enabled from CMS in ios$")
	public void userValidatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMSInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMSinios();
			soft.assertTrue(flag);
			ExtentsReportManager.extentReportLogging("info",
					"Validated hero container is displayed in mutv when enabled from CMS in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating hero container is displayed in mutv when enabled from CMS in ios" + e);
			throw e;
		}
	}

	@Then("^user validates hero container is not displayed in mutv when enabled from CMS in ios$")
	public void userValidatesHeroContainerIsNotDisplayedInMutvWhenEnabledFromCMSInIos() throws Throwable {
		try {
			boolean flag = mutvPage.validatesHeroContainerIsDisplayedInMutvWhenEnabledFromCMSinios();
			soft.assertTrue(!flag);
			ExtentsReportManager.extentReportLogging("info",
					"Validated hero container is not displayed in mutv when enabled from CMS in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating hero container is not displayed in mutv when enabled from CMS in ios" + e);
			throw e;
		}
	}

	@And("^user navigates to Mens Highlights CBS video in ios$")
	public void userNavigatesToMensHighlightsCBSVideoInIos() throws Throwable {
		try {
			mutvPage.NavigatesToCBSVideoInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked navigates to Mens Highlights CBS video in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking navigates to Mens Highlights CBS video in ios" + e);
			throw e;
		}
	}

	@And("^user navigates to FAQs CBR video in ios$")
	public void userNavigatesToFAQsCBRVideoInIos() throws Throwable {
		try {
			mutvPage.NavigatesToCBRVideoInIos();
			ExtentsReportManager.extentReportLogging("info", "Clicked navigates to FAQs CBR video in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking navigates to FAQs CBR video in ios" + e);
			throw e;
		}
	}

//Question for validation
	@Then("^user validates the CBR badge is not displayed for Logged in user in ios$")
	public void userValidatesTheCBRBadgeIsNotDisplayedForLoggedInUserInIos() throws Throwable {
		try {
			mutvPage.validatesCBRScreeneIsNotDisplayedForLoggedInUser();
			ExtentsReportManager.extentReportLogging("info",
					"validated the CBR badge is not displayed for Logged in user in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the CBR badge is not displayed for Logged in user in ios" + e);
			throw e;
		}
	}

	// Question for validation
	@Then("^validate subscribe screen is not displayed$")
	public void validateSubscribeScreenIsNotDisplayed() throws Throwable {
		try {
			mutvPage.validatesCBSScreeneIsNotDisplayedForLoggedInUser();
			ExtentsReportManager.extentReportLogging("info", "validated subscribe screen is not displayed");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "validating subscribe screen is not displayed" + e);
			throw e;
		}
	}

	@Then("^user validates the epg icon in top right in ios$")
	public void userValidatesTheEpgIconInTopRightInIos() throws Throwable {
		 try {
	            boolean flag = new MutvPage().ValidatesTheEpgIconInTopRightIsDisplayed();
	            soft.assertTrue(flag);
	            ExtentsReportManager.extentReportLogging("info", "Validated the epg icon in top right");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in Validating the epg icon in top right<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the schedule icon in epg schedule page in ios$")
	public void userValidatesTheScheduleIconInEpgSchedulePageInIos() throws Throwable {
		  try {
	            boolean flag = new MutvPage().validatesTheScheduleIconInEpgSchedulePage();
	            soft.assertTrue(flag);
	            ExtentsReportManager.extentReportLogging("info", "Validated the epg icon in top right");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in Validating the epg icon in top right<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the current program with white border and play button in ios$")
	public void userValidatesTheCurrentProgramWithWhiteBorderAndPlayButtonInIos() throws Throwable {
		  try {
	            boolean flag = new MutvPage().validatePlayButtonInScheduleScreen();
	            soft.assertTrue(flag);
	            ExtentsReportManager.extentReportLogging("info", "Validated the current program with white border and play button");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating the current program with white border and play button<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the CBR&CBS badges for future schedule program in ios$")
	public void userValidatesTheCBRCBSBadgesForFutureScheduleProgramInIos() throws Throwable {
	    try {
            boolean flag = new MutvPage().validatesCBSBadgesForFutureScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
	}

	@Then("^user validates the CBR and CBS Badges for previous schedule program in ios$")
	public void userValidatesTheCBRAndCBSBadgesForPreviousScheduleProgramInIos() throws Throwable {
		try {
            boolean flag = new MutvPage().validatesCBSBadgesForPreviousScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
	}
	@Then("^user validates podcaset heading in MUTV screen using API in ios$")
	public void userValidatesPodcasetHeadingInMUTVScreenUsingAPIInIOS() throws Throwable {
		try {
			String expectedPodcastTextFromAPI = mutvAPIResponse.getMUTVPodcastTextFromApi("PosdcastTextInMUTVEndPoint");
			String actualWelcomeText = mutvPage.getPodcastTextFromMUTVScreen();
			ExtentsReportManager.extentReportLogging("info","Expected Podcast Text FromA PI"+ expectedPodcastTextFromAPI);
			ExtentsReportManager.extentReportLogging("info","Actual Podcast Text from UI"+ actualWelcomeText);
			soft.assertEquals(actualWelcomeText.toUpperCase(), expectedPodcastTextFromAPI.toUpperCase());
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated podcast in MUTV screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in podcast in MUTV screen<br />" + e);
			throw e;
		}
	}
	
	@And("^user clicks on view all in MUTV screen in ios$")
	public void userClicksOnViewAllInMUTVScreenInIOS() {
		try {
			mutvPage.scrolldownToViewAllAndClickonViewAll();
			ExtentsReportManager.extentReportLogging("info", "Clicked on explore icon");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking explore icon<br />" + e);
			throw e;
		}
	}
	
	@Then("^user validate list in EPC Ten MOST EMOTIONAL MOMENTS screen in ios$")
    public void userValidateListInEPCTenMOSTEMOTIONALMOMENTScreenInIos() throws Exception  {
        try {
            List expectedListUnderViewAll = new ArrayList<>();
            expectedListUnderViewAll = mutvAPIResponse.getViewAllfromMUTVApi("ViewAllListOne");
            ExtentsReportManager.extentReportLogging("info","Expected Shop menu items"+ expectedListUnderViewAll);
            ExtentsReportManager.extentReportLogging("info","Actual Shop menu items"+ mutvPage.getViewAllListOneInMUTVScreen());
            
            soft.assertEquals(expectedListUnderViewAll, mutvPage.getViewAllListOneInMUTVScreen());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "user vaidate View All list names details");

        } catch (AssertionError | IOException e) {
            ExtentsReportManager.extentReportLogging("fail", "Validating View all and error in validation of view all values values<br />" + e);
            throw e;
        }
    }

	@Then("^user validates the CBS/CBR badges is not displayed for current program in ios$")
	public void userValidatesTheCBSCBRBadgesIsNotDisplayedForCurrentProgramInIos() throws Throwable {
		try {
            boolean flag = new MutvPage().CBSCBRBadgesIsNotDisplayedForCurrentPrograminIos();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for current program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for current program<br />" + e);
            throw e;
        }
	}

	@Then("^user validates the CBS/CBR badges display for previous schedule program in ios$")
	public void userValidatesTheCBSCBRBadgesDisplayForPreviousScheduleProgramInIos() throws Throwable {
		try {
            boolean flag = new MutvPage().CBSCBRBadgesDisplayForPreviousScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for previous schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for previous schedule program<br />" + e);
            throw e;
        }
	}

	@Then("^user validates the CBS/CBR badges display for future schedule program in ios$")
	public void userValidatesTheCBSCBRBadgesDisplayForFutureScheduleProgramInIos() throws Throwable {
		try {
            boolean flag = new MutvPage().CBSCBRBadgesDisplayForFutureScheduleProgram();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "Validated the CBR&CBS badges for future schedule program");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the CBR&CBS badges for future schedule program<br />" + e);
            throw e;
        }
	}

	@And("^user checks for UTD Podcast in MUTV in ios$")
	public void userChecksForUTDPodcastInMUTVInIos() throws Throwable {
		try {	        
	    	   mutvPage.checksForUTDProdcastInMUTVInIos();
	        ExtentsReportManager.extentReportLogging("info", "checked for UTD Prodcast in MUTV");
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "checking for UTD Prodcast in MUTV.<br />" + e);
	        throw e;
	    }
	}

	@Then("^user clicks on first podcast in MUTV in ios$")
	public void userClicksOnFirstPodcastInMUTVInIos() throws Throwable {
		try {
            mutvPage.clicksOnFirstPodcastInMUTV();
            ExtentsReportManager.extentReportLogging("info", "clicked on first podcast in MUTV");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on first podcast in MUTV <br />" + e);
            throw e;
        }
	}

	@Then("^user validates play button in podcast audio screen in ios$")
	public void userValidatesPlayButtonInPodcastAudioScreenInIos() throws Throwable {
		try {	        
			boolean isValid  =mutvPage.validatesPlayButtonInPodcastAudioScreen();
			soft.assertTrue(isValid);
	    	  soft.assertAll();
	        ExtentsReportManager.extentReportLogging("info", "validated play button in podcast audio screen");
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "validating play button in podcast audio screen.<br />" + e);
	        throw e;
	    }
	}

	@And("^user clicks on back icon in podcast audio screen in ios$")
	public void userClicksOnBackIconInPodcastAudioScreenInIos() throws Throwable {
		try {
            mutvPage.clicksOnBackIconInPodcastAudioScreen();
            ExtentsReportManager.extentReportLogging("info", "clicked on back icon in podcast audio screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on back icon in podcast audio screen <br />" + e);
            throw e;
        }
	}

	@Then("^user validates prodcast audio minimized and playing in ios$")
	public void userValidatesProdcastAudioMinimizedAndPlayingInIos() throws Throwable {
		try {
	        boolean flag = mutvPage.validatesProdcastAudioMinimizedAndPlaying();
	        soft.assertTrue(flag);
	    	  soft.assertAll();
	        ExtentsReportManager.extentReportLogging("info", "validated prodcast audio minimized and playing");
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception while validating prodcast audio minimized and playing.<br />" + e);
	        throw e;
	    }
	}

	@And("^user checks for Top twenty collections in MUTV in ios$")
	public void userChecksForTopTwentyCollectionsInMUTVInIos() throws Throwable {
		try {	        
	    	   mutvPage.checksForTopTwentyCollectionsInMUTV();
	        ExtentsReportManager.extentReportLogging("info", "checked for top 20 collections in MUTV");
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "checked for top 20 collections in MUTV.<br />" + e);
	        throw e;
	    }
	}

	@And("^user clicks on first top collection video in MUTV in ios$")
	public void userClicksOnFirstTopCollectionVideoInMUTVInIos() throws Throwable {
		try {
            mutvPage.clicksOnFirstTopCollectionVideoInMUTV();
            ExtentsReportManager.extentReportLogging("info", "clicked on first top collection video in MUTV");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on first top collection video in MUTV <br />" + e);
            throw e;
        }
	}

	@And("^user clicks on play button in ios$")
	public void userClicksOnPlayButtonInIos() throws Throwable {
		try {
            mutvPage.clicksOnPlayButton();
            ExtentsReportManager.extentReportLogging("info", "clicked on play button");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on play button <br />" + e);
            throw e;
        }
	}

	@Then("^user clicks on the close button in the played video in ios$")
	public void userClicksOnTheCloseButtonInThePlayedVideoInIos() throws Throwable {
		try {
            mutvPage.clicksOnTheCloseButtonInThePlayedVideo();
            ExtentsReportManager.extentReportLogging("info", "Clicked on close button in played video");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking close button in played video<br />" + e);
            throw e;
        }
	}

	@And("^user clicks on login to add calender button in ios$")
	public void userClicksOnLoginToAddCalenderButtonInIos() throws Throwable {
		try {
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
			mutvPage.clicksOnLoginToAddCalenderButtonInIos();
			idmPage.clicksOnContinueButton();
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
			idmPage.clicksOnLogInButton();
			mutvPage.clicksOnLoginToAddCalenderButtonInIos();
			mutvPage.clickOnMyListIcon();
			ExtentsReportManager.extentReportLogging("info", "Clicked on log in button in ios");
		}} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on log in button in ios<br />" + e);
			throw e;
		}

	}

}

	


