package org.bdd.stepdef.ios;

import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.ShopAPIResponse;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.pages.*;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ShopIosStepDef {
	public SoftAssert soft = new SoftAssert();
	public ShopPage shopPage = new ShopPage();
	public ShopAPIResponse shopAPI = new ShopAPIResponse();
	private static final Logger log = LogManager.getLogger(ShopPage.class);

	@And("^user click on shop tab in bottom tab in ios$")
	public void userClickOnShopTabInBottomTabInIos() throws Throwable {
		shopPage.clickOnShopTab();
	}

	@Then("^user validates all the tabs names in shop screen using API in ios$")
	public void userValidatesAllTheTabsNamesInShopScreenUsingAPIInIos() throws Throwable {
		try {
			ArrayList<String> expectedShopMenuItems = new ArrayList<>();
			expectedShopMenuItems = shopAPI.getShopTabMenuItemsFromApi("SelectAllTextEndPoint");
			ExtentsReportManager.extentReportLogging("info", "Expected Shop menu items" + expectedShopMenuItems);
			ExtentsReportManager.extentReportLogging("info", "Actual Shop menu items" + shopPage.getShopTabText());
			soft.assertEquals(expectedShopMenuItems, shopPage.getShopTabText());
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked on Mens drop down and validated the dropdown values");

		} catch (AssertionError | IOException e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Clicks on Mens drop down and error in validation of dropdown values<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on Membership tab in shop screen in ios$")
	public void userClicksOnMembershipTabInShopScreenInIos() throws Throwable {
		try {
			shopPage.clickMembershipTab();
			ExtentsReportManager.extentReportLogging("info", "clicked on Membership tab in shop screen in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicked on Membership tab in shop screen in ios<br />" + e);

			throw e;

		}

	}

	@And("^user validates hero carousels is displayed in membership screen in ios$")
	public void userValidatesHeroCarouselsIsDisplayedInMembershipScreenInIos() throws Throwable {
		try {
			shopPage.validatesHeroCarouselsInMembershipInIosIsDisplayed();
			ExtentsReportManager.extentReportLogging("info",
					"validated hero carousels is displayed in membership screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating hero carousels is displayed in membership screen in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on the hero carousels dots in Membership screen in ios$")
	public void userClicksOnTheHeroCarouselsDotsInMembershipScreenInIos() throws Throwable {
		try {
			shopPage.clicksOnHeroCardDotsInMembershipScreen();
			ExtentsReportManager.extentReportLogging("info",
					"clicked on the hero carousels dots in Membership screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on the hero carousels dots in Membership screen in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates small card carousels in ios in Tickets tab using Api$")
	public void userValidatesHeroCarouselsAndSmallCardCarouselsInIos() throws Throwable {
		try {
			// data from API
			String expCarosel1ForKits = shopAPI.getCarosel1ForKitsTexFromCollectiblestApi("ShopTicketsTabEndPoint");
			String actualCarosel1ForKits = shopPage.getTextforCarosel1ForKitsCollectibles();
			ExtentsReportManager.extentReportLogging("info",
					"CAROUSEL 1 FOR KITS from API <br />" + expCarosel1ForKits);
			ExtentsReportManager.extentReportLogging("info",
					"CAROUSEL 1 FOR KITS from UI <br />" + actualCarosel1ForKits);
			ExtentsReportManager.extentReportLogging("info", "Verified CAROUSEL 1 FOR KITS from UI with API");
			soft.assertEquals(actualCarosel1ForKits.toUpperCase(), expCarosel1ForKits.toUpperCase());

//	            String expMembershipBenifits = shopAPI.getCollectiblesClaimYoursTextFromCollectiblesApi("ShopCollectiblesCarouselEndPoint");
//	            String actualMembershipBenifits = shopPage.getTextforCollectiblesClaimYoursCollectibles();
//	            ExtentsReportManager.extentReportLogging("info", "COLLECTIBLES CLAIM YOURS from API <br />"+expMembershipBenifits);
//	            ExtentsReportManager.extentReportLogging("info", "COLLECTIBLES CLAIM YOURS UI <br />"+actualMembershipBenifits);
//	            ExtentsReportManager.extentReportLogging("info", "Verified COLLECTIBLES CLAIM YOURS from UI with API");
//	            soft.assertEquals(actualMembershipBenifits.toUpperCase(), expMembershipBenifits.toUpperCase());
//	            
//	            String expHelpAndInfo = shopAPI.getCollectionsAndRewardsTextFromCollectiblesApi("ShopCollectiblesCarouselEndPoint");
//	            String actualHelpAndInfo = shopPage.getTextforCollectionsAndRewardsCollectibles();
//	            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS & REWARDS from API <br />"+expHelpAndInfo);
//	            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS & REWARDS from UI <br />"+actualHelpAndInfo);
//	            ExtentsReportManager.extentReportLogging("info", "Verified COLLECTIONS & REWARDS from UI with API");
//	            soft.assertEquals(actualHelpAndInfo.toUpperCase(), expHelpAndInfo.toUpperCase());

			soft.assertAll();

			ExtentsReportManager.extentReportLogging("info", "Validated hero carousel and small card carousel");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating hero carousel and small card carousel<br />" + e);
			throw e;
		}
	}

//		try {
//			shopPage.ValidatesHeroCarouselsShopTab();
//			String expTicket = table.cell(1, 0);
//			String expTrainingAndHospitality = table.cell(1, 1);
//			String actualTicket = shopPage.getTrainingText();
//			String actualTrainingAndHospitality = shopPage.getTicketsAndHospitalityText();
//			soft.assertEquals(actualTicket, expTicket);
//			soft.assertEquals(actualTrainingAndHospitality, expTrainingAndHospitality);
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info",
//					"validated hero carousels and small card carousels in ios");
//
//		} catch (AssertionError e) {
//
//			ExtentsReportManager.extentReportLogging("fail",
//					"Error in validating hero carousels and small card carousels in ios <br />" + e);
//
//			throw e;
//
//		}
//
//	}

	@And("^user clicks on Stickers tab in shop screen in ios$")
	public void userClicksOnStickersTabInShopScreenInIos() throws Throwable {
		try {
			shopPage.clickOnStickersTabInShopScreen();
			ExtentsReportManager.extentReportLogging("info", "clicked on Stickers tab in shop screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on Stickers tab in shop screen in ios<br />" + e);
			throw e;
		}
	}

//	@Then("^user validates small card carousels in ios in membership tab using Api$")
//	public void userValidatesSmallCardCarouselsInIos() throws Throwable {
//   	 try {
//        	//data from API
//            String expCarosel1ForKits = shopAPI.getCarosel1ForKitsTextApi("ShopMembershipCarouselEndPoint");
//            String actualCarosel1ForKits = shopPage.getTextforCarosel1ForKits();
//            ExtentsReportManager.extentReportLogging("info", "CAROUSEL 1 FOR KITS from API <br />"+expCarosel1ForKits);
//            ExtentsReportManager.extentReportLogging("info", "CAROUSEL 1 FOR KITS from UI <br />"+actualCarosel1ForKits);
//            ExtentsReportManager.extentReportLogging("info", "Verified CAROUSEL 1 FOR KITS from UI with API");
//            soft.assertEquals(actualCarosel1ForKits.toUpperCase(), expCarosel1ForKits.toUpperCase());
//            
//            String expMembershipBenifits = shopAPI.getMembershipBenifitsTextApi("ShopMembershipCarouselEndPoint");
//            String actualMembershipBenifits = shopPage.getTextforMembershipBenifits();
//            ExtentsReportManager.extentReportLogging("info", "MEMBERSHIP BENEFITS from API <br />"+expMembershipBenifits);
//            ExtentsReportManager.extentReportLogging("info", "MEMBERSHIP BENEFITS from UI <br />"+actualMembershipBenifits);
//            ExtentsReportManager.extentReportLogging("info", "Verified MEMBERSHIP BENEFITS from UI with API");
//            soft.assertEquals(actualMembershipBenifits.toUpperCase(), expMembershipBenifits.toUpperCase());
//            
//            String expHelpAndInfo = shopAPI.getHelpAndInfoTextApi("ShopMembershipCarouselEndPoint");
//            String actualHelpAndInfo = shopPage.getTextforHelpAndInfo();
//            ExtentsReportManager.extentReportLogging("info", "HELP & INFO from API <br />"+expHelpAndInfo);
//            ExtentsReportManager.extentReportLogging("info", "HELP & INFO from UI <br />"+actualHelpAndInfo);
//            ExtentsReportManager.extentReportLogging("info", "Verified MEMBERSHIP BENEFITS from UI with API");
//            soft.assertEquals(actualHelpAndInfo.toUpperCase(), expHelpAndInfo.toUpperCase());
//            
//            soft.assertAll();
//            
//            ExtentsReportManager.extentReportLogging("info", "Validated hero carousel and small card carousel");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating hero carousel and small card carousel<br />" + e);
//           throw e;
//       }
//   }

////		String expHeroCard = table.cell(1, 0);
//			String expKits = table.cell(1, 0);
//			String expTrending = table.cell(1, 1);
//			String expPlayers = table.cell(1, 2);
//			String expTraining = table.cell(1, 3);
//			String expTickets = table.cell(1, 4);
//			String expUnitedeEssentials = table.cell(1, 5);
//			String expCollections = table.cell(1, 6);
////		String expCatogory2 = table.cell(1, 6);
//
////		String actualHeroCard = shopPage.getHeroCardMembership();
//			String actualKits = shopPage.getKitsTexstMembership();
//			String actualTrending = shopPage.getTrendingMembershiPage();
//			String actualPlayers = shopPage.getPlayersMembershiPage();
//			String actualTraining = shopPage.getTrainingTextMembership();
//			String actualTickets = shopPage.getTicketsAndHospitalityText();
//			String actualUnitedEssentials = shopPage.getUnitedEssentialsTextMembership();
//			String actualCollections = shopPage.getCollectionCourselTextMembership();
////		String actualCatogory2 = shopPage.getCatogory2TextStickers();
//
////		soft.assertEquals(actualHeroCard, expHeroCard);
//			soft.assertEquals(actualKits, expKits);
//			soft.assertEquals(actualTrending, expTrending);
//			soft.assertEquals(actualPlayers, expPlayers);
//			soft.assertEquals(actualTraining, expTraining);
//			soft.assertEquals(actualTickets, expTickets);
//			soft.assertEquals(actualUnitedEssentials, expUnitedeEssentials);
//			soft.assertEquals(actualCollections, expCollections);
////		soft.assertEquals(actualCatogory2, expCatogory2);
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info", "validated small card carousels in ios");
//
//		} catch (AssertionError e) {
//
//			ExtentsReportManager.extentReportLogging("fail",
//					"Error in validating small card carousels in ios <br />" + e);
//
//			throw e;
//
//		}

//	@And("^user clicks on Tickets tab in shop screen in ios$")
//	public void userClicksOnTicketsTabInShopScreenInIos() throws Throwable {
//		try {
//			shopPage.clicksOnTicketsTabInShopScreen();
//			ExtentsReportManager.extentReportLogging("info", "clicked on Tickets tab in shop screen in ios");
//		} catch (AssertionError e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Error in clicking on Tickets tab in shop screen in ios<br />" + e);
//			throw e;
//		}
//	}

	@And("^user clicks on Merch tab in shop screen in ios$")
	public void userClicksOnMerchTabInShopScreenInIos() throws Throwable {
		try {
			shopPage.clicksOnMerchTabInShopScreen();
			ExtentsReportManager.extentReportLogging("info", "clicked on Merch tab in shop screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on Merch tab in shop screen in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on the hero card dots in merch screen in ios$")
	public void userClicksOnTheHeroCardDotsInMerchScreenInIos() throws Throwable {
		try {
			shopPage.clicksOnHeroCardDotsInMerchScreenIos();
			ExtentsReportManager.extentReportLogging("info", "clicked on the hero card dots in merch screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on the hero card dots in merch screen in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks on Tickets tab in shop screen in ios$")
	public void userClicksOnCollectiblesTabInShopScreenInIos() throws Throwable {
		try {
			shopPage.clickCollectiblesTab();
			ExtentsReportManager.extentReportLogging("info", "clicked on Collectibles tab in shop screen in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicked on Collectibles tab in shop screen in ios<br />" + e);

			throw e;

		}

	}

	@And("^user clicks on Shop tab in shop screen in ios$")
	public void userClicksOnStoreTabInShopScreenInIos() throws Throwable {
		try {
			shopPage.clickStoreTab();
			ExtentsReportManager.extentReportLogging("info", "clicked on Store tab in shop screen in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicked on Store tab in shop screen in ios<br />" + e);

			throw e;

		}
	}

	@Then("^user validates small card carousels in Shop tab in ios using Api$")
	public void userValidatesSmallCardCarouselsInStoreTabInIosUsingApi() throws Throwable {
		try {
			// data from API
			String expCarosel1ForKits = shopAPI.getCarosel1ForKitsTexFromStoretApi("ShopStoreCarouselEndPoint");
			String actualCarosel1ForKits = shopPage.getTextforCarosel1ForKitsStore();
			ExtentsReportManager.extentReportLogging("info",
					"CAROUSEL 1 FOR KITS from API <br />" + expCarosel1ForKits);
			ExtentsReportManager.extentReportLogging("info",
					"CAROUSEL 1 FOR KITS from UI <br />" + actualCarosel1ForKits);
			ExtentsReportManager.extentReportLogging("info", "Verified CAROUSEL 1 FOR KITS from UI with API");
			soft.assertEquals(actualCarosel1ForKits.toUpperCase(), expCarosel1ForKits.toUpperCase());

			String expPlayers = shopAPI.getPlayersTextFromCollectiblesApi("ShopStoreCarouselEndPoint");
			String actualPlayers = shopPage.getTextforPlayersStore();
			ExtentsReportManager.extentReportLogging("info", "PLAYERS API <br />" + expPlayers);
			ExtentsReportManager.extentReportLogging("info", "PLAYERS UI <br />" + actualPlayers);
			ExtentsReportManager.extentReportLogging("info", "Verified PLAYERS from UI with API");
			soft.assertEquals(actualPlayers.toUpperCase(), expPlayers.toUpperCase());

//	            String expTicketsAndHospitality = shopAPI.getTicketsAndHospitalityTextFromStoreApi("ShopStoreCarouselEndPoint");
//	            String actualTicketsAndHospitality = shopPage.getTextforTicketsAndHospitalityStore();
//	            ExtentsReportManager.extentReportLogging("info", "TICKETS & HOSPITALITY  from API <br />"+expTicketsAndHospitality);
//	            ExtentsReportManager.extentReportLogging("info", "TICKETS & HOSPITALITY  from UI <br />"+actualTicketsAndHospitality);
//	            ExtentsReportManager.extentReportLogging("info", "Verified TICKETS & HOSPITALITY  from UI with API");
//	            soft.assertEquals(actualTicketsAndHospitality.toUpperCase(), expTicketsAndHospitality.toUpperCase());
//	            
//	            String expTrending = shopAPI.getTrendingTextFromStoreApi("ShopStoreCarouselEndPoint");
//	            String actualTrending = shopPage.getTextforTrendingStore();
//	            ExtentsReportManager.extentReportLogging("info", "TRENDING from API <br />"+expTrending);
//	            ExtentsReportManager.extentReportLogging("info", "TRENDING UI <br />"+actualTrending);
//	            ExtentsReportManager.extentReportLogging("info", "Verified TRENDING from UI with API");
//	            soft.assertEquals(actualTrending.toUpperCase(), expTrending.toUpperCase());
//	            
//	            String expTraining = shopAPI.getTrainingTextFromCollectiblesApi("ShopStoreCarouselEndPoint");
//	            String actualTraining = shopPage.getTextforTrainingStore();
//	            ExtentsReportManager.extentReportLogging("info", "TRAINING from API <br />"+expTraining);
//	            ExtentsReportManager.extentReportLogging("info", "TRAINING from UI <br />"+actualTraining);
//	            ExtentsReportManager.extentReportLogging("info", "Verified TRAINING from UI with API");
//	            soft.assertEquals(actualTraining.toUpperCase(), expTraining.toUpperCase());
//	            
//	            String expCollections = shopAPI.getCollectionsTextFromStoreApi("ShopStoreCarouselEndPoint");
//	            String actualCollections = shopPage.getTextforCollectionsStore();
//	            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS from API <br />"+expCollections);
//	            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS from UI <br />"+actualCollections);
//	            ExtentsReportManager.extentReportLogging("info", "Verified COLLECTIONS from UI with API");
//	            soft.assertEquals(actualCollections.toUpperCase(), expCollections.toUpperCase());

			soft.assertAll();

			ExtentsReportManager.extentReportLogging("info", "Validated hero carousel and small card carousel");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating hero carousel and small card carousel<br />" + e);
			throw e;
		}
	}

	@Then("^user validates hero card is displayed in shop screen in membership tab using Api in ios$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInMembershipTabUsingApiInIos() throws Throwable {
		try {
			boolean enableHeroCarousel = shopAPI.getHeroCarouselStatusAPI("HeroCarouselEnableEndPointMembership");
			String titleOfTheHeroCarouselTextFromUI = shopPage.getTitleOfHeroCarouselMembership();
			System.out.println(titleOfTheHeroCarouselTextFromUI);
			if (!enableHeroCarousel) {
				String expTitleTextFromApi = shopAPI
						.getTitleOfHeroCarouselMembershipFromApi("HeroCarouselEnableEndPointMembership");
				soft.assertEquals(titleOfTheHeroCarouselTextFromUI, expTitleTextFromApi.toUpperCase());
				ExtentsReportManager.extentReportLogging("info",
						"validated hero card is displayed in shop screen using Api");
			}
			soft.assertAll();

		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validation hero card is displayed in shop screen using Api<br />" + e);
			throw e;
		}
	}

	@Then("^user validates hero card is displayed in shop screen in Store tab using Api in ios$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInStoreTabUsingApiInIos() throws Throwable {
		try {
			boolean enableHeroCarousel = shopAPI.getHeroCarouselStatusStoreAPI("HeroCarouselEnableEndPointStore");
			String titleOfTheHeroCarouselTextFromUI = shopPage.getTitleOfHeroCarouselStore();
			System.out.println(titleOfTheHeroCarouselTextFromUI);
			if (!enableHeroCarousel) {
				String expTitleTextFromApi = shopAPI
						.getTitleOfHeroCarouselStoreFromApi("HeroCarouselEnableEndPointStore");
				soft.assertEquals(titleOfTheHeroCarouselTextFromUI, expTitleTextFromApi.toUpperCase());
				ExtentsReportManager.extentReportLogging("info",
						"validated hero card is displayed in shop screen in Store tab using Api");
			}
			soft.assertAll();

		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validation hero card is displayed in shop screen in Store tab using Api<br />" + e);
			throw e;
		}
	}

	@Then("^user validates hero card is displayed in shop screen in Collectibles using Api in ios$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInCollectiblesUsingApiInIos() throws Throwable {
		try {
			boolean enableHeroCarousel = shopAPI
					.getHeroCarouselStatusCollectiblesAPI("HeroCarouselEnableEndPointCollectibles");
			String titleOfTheHeroCarouselTextFromUI = shopPage.getTitleOfHeroCarouselCollectibles();
			System.out.println(titleOfTheHeroCarouselTextFromUI);
			if (!enableHeroCarousel) {
				String expTitleTextFromApi = shopAPI
						.getTitleOfHeroCarouselCollectiblesFromApi("HeroCarouselEnableEndPointCollectibles");
				soft.assertEquals(titleOfTheHeroCarouselTextFromUI, expTitleTextFromApi.toUpperCase());
				ExtentsReportManager.extentReportLogging("info",
						"validated hero card is displayed in shop screen in Store tab using Api");
			}
			soft.assertAll();

		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validation hero card is displayed in shop screen in Store tab using Api<br />" + e);
			throw e;
		}
	}

	@Then("^user validates small card carousels in Merch tab in ios$")
	public void userValidatesSmallCardCarouselsInMerchTabInIos() throws Throwable {
		try {
			boolean flag = shopPage.userValidatesSmallCardCarouselsInMerchTab();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated small card carousels in Merch tab ");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating small card carousels in Merch tab<br />" + e);
			throw e;
		}
	}

	@Then("^user validates hero card is displayed in shop screen in merch tab in ios$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInMerchTabInIos() throws Throwable {
		try {
			boolean flag = shopPage.userValidatesHeroCardIsDisplayedInShopScreenInMerchTabInIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"validated hero card is displayed in shop screen in merch tab");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating hero card is displayed in shop screen in merch tab<br />" + e);
			throw e;
		}
	}

	@And("^user validates shop tabs and content in it using API in ios$")
	public void userValidatesShopTabsAndContentInItUsingAPIInIos() throws Throwable {
		try {
			ArrayList<String> expectedShopMenuItems = new ArrayList<>();
			expectedShopMenuItems = shopAPI.getShopTabMenuItemsFromApi("shopMenuItesmEndPoint");
			shopPage.clicksOnOkButtonInCookiesScreenInShop();
			boolean flag = shopPage.clickingOnTabs(expectedShopMenuItems);
			soft.assertTrue(flag, "shop tab content is not displayed");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated shop tabs and content in it using API");

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"validates shop tabs and content in it using API<br />" + e);
			throw e;
		}
	}

	@Then("^user validates all the tabs in shop screen not displayed when disabled from CMS in ios$")
	public void userValidatesAllTheTabsInShopScreenNotDisplayedWhenDisabledFromCMSInIos() throws Throwable {
		try {
			boolean isAllTabsDisabled = shopPage.validateAllTheTabsInShopScreenDisabledInMutvPage();
			soft.assertTrue(isAllTabsDisabled);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "all the tabs in shop screen should be disabled from CMS");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the disabled all the tabs in shop.<br />" + e);
			throw e;
		}
	}

	@Then("^user validates hero card in shop screen in ios$")
	public void userValidatesHeroCardInShopScreenInIos() throws Throwable {
		try {
			boolean flag = shopPage.validatesHeroCardInShopScreenInIos();
			soft.assertTrue(flag);
			ExtentsReportManager.extentReportLogging("info", "validated hero card in Latest screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validates hero card in Latest screen<br />" + e);
			throw e;
		}
	}
}
