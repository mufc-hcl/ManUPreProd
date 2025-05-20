package org.bdd.stepdef.android;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.pages.*;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.ShopAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ShopAndroidStepDef {
    public SoftAssert soft = new SoftAssert();

    public ShopPage shopPage = new ShopPage();
    public ExplorePage explorePage = new ExplorePage();
    public ShopAPIResponse shopAPI = new ShopAPIResponse();
    private static final Logger log = LogManager.getLogger(ShopPage.class);

    @And("^user clicks on shop tab$")
    public void userClicksOnShopTab() {
        try {
            shopPage.clickOnShopTab();
            ExtentsReportManager.extentReportLogging("info", "Clicked on shop tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking shop tab <br />" + e);
            throw e;
        }
    }

    @Then("^user validates all the tabs names in shop screen using API$")
    public void userValidatesAllTheTabsNamesInShopScreenUsingAPI() throws Exception {
        try {
            ArrayList<String> expectedShopMenuItems = new ArrayList<>();
            expectedShopMenuItems = shopAPI.getShopTabMenuItemsFromApi("SelectAllTextEndPoint");
            ExtentsReportManager.extentReportLogging("info","Expected Shop menu items" + expectedShopMenuItems);
            ExtentsReportManager.extentReportLogging("info","Actual Shop menu items" + shopPage.getShopTabText());
            soft.assertEquals(expectedShopMenuItems, shopPage.getShopTabText());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated all the tabs names in shop screen using API");

        } catch (Exception  e) {
            ExtentsReportManager.extentReportLogging("fail", "validates all the tabs names in shop screen using API<br />" + e);
            throw e;
        }
    }
    
    

    @And("^user clicks on Membership tab in shop screen using Api$")
    //public void userClicksOnMembershipTabInShopScreen() throws Throwable {
//    	 try {
//             ArrayList<String> expectedShopMenuItems = new ArrayList<>();
//             expectedShopMenuItems = shopAPI.getShopTabMenuItemsFromApi("shopMenuItesmEndPoint");
//             
//             ExtentsReportManager.extentReportLogging("info","Expected Shop menu items" + expectedShopMenuItems);
//             ExtentsReportManager.extentReportLogging("info","Actual Shop menu items" + shopPage.getShopTabText());
//             soft.assertEquals(expectedShopMenuItems, shopPage.getShopTabText());
//             soft.assertAll();
//             ExtentsReportManager.extentReportLogging("info", "validated all the tabs names in shop screen using API");
//
//         } catch (AssertionError | IOException e) {
//             ExtentsReportManager.extentReportLogging("fail", "validates all the tabs names in shop screen using API<br />" + e);
//             throw e;
//         }
//    }

     //   try {
   //        shopPage.clickMembershipTab();
//            ExtentsReportManager.extentReportLogging("info", "Clicked on membership tab in shop screen");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on membership tab in shop screen<br />" + e);
//            throw e;
//        }
    

//    @Then("^user validates small card carousels in Membership tab using Api$")
//    public void userValidatesHeroCarouselsAndSmallCardCarousels() throws Exception {
//
//        try {
//            //data from API
//            String expKitsTextFromAPI = shopAPI.getCarosel1ForKitsTextApi("ShopMembershipCarouselEndPoint");
//            String actualKitsTextFromAPI = shopPage.getTextforCarosel1ForKits();
//            ExtentsReportManager.extentReportLogging("info", " KITS from API <br />" + expKitsTextFromAPI.toUpperCase());
//            ExtentsReportManager.extentReportLogging("info", "KITS from UI <br />" + actualKitsTextFromAPI.toUpperCase());
//            ExtentsReportManager.extentReportLogging("info", "Verified  KITS from UI with API");
//            soft.assertEquals(actualKitsTextFromAPI.toUpperCase(), expKitsTextFromAPI.toUpperCase());
//
//            String expTrendingTextFromAPI = shopAPI.getMembershipBenifitsTextApi("ShopMembershipCarouselEndPoint");
//            String actualTrendingTextFromAPI = shopPage.getTextforMembershipBenifits();
//            ExtentsReportManager.extentReportLogging("info", "TRENDING TEXT from API <br />" + expTrendingTextFromAPI.toUpperCase());
//            ExtentsReportManager.extentReportLogging("info", "TRENDING TEXT from UI <br />" + actualTrendingTextFromAPI.toUpperCase());
//            ExtentsReportManager.extentReportLogging("info", "Verified TRENDING TEXT from UI with API");
//            soft.assertEquals(actualTrendingTextFromAPI.toUpperCase(), expTrendingTextFromAPI.toUpperCase());
//
//            String expPlayersTextFromAPI = shopAPI.getHelpAndInfoTextApi("ShopMembershipCarouselEndPoint");
//            String actualPlayersTextFromAPI = shopPage.getTextforHelpAndInfo();
//            ExtentsReportManager.extentReportLogging("info", "HELP & INFO from API <br />" + expPlayersTextFromAPI.toUpperCase());
//            ExtentsReportManager.extentReportLogging("info", "HELP & INFO from UI <br />" + actualPlayersTextFromAPI.toUpperCase());
//            ExtentsReportManager.extentReportLogging("info", "Verified MEMBERSHIP BENEFITS from UI with API");
//            soft.assertEquals(actualPlayersTextFromAPI.toUpperCase(), expPlayersTextFromAPI.toUpperCase());
//
//            soft.assertAll();
//
//            ExtentsReportManager.extentReportLogging("info", "Validated hero carousel and small card carousel");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating hero carousel and small card carousel<br />" + e);
//            throw e;
//        }
//    }

    @And("^user clicks on Stickers tab in shop screen$")
    public void userClicksOnStickersTabInShopScreen() {
        try {
            shopPage.clickOnStickersTabInShopScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on stickers tab in shop screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking stickers tab in shop screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates small card carousels in Tickets tab using Api$")
    public void userValidatesSmallCardCarousels() throws Exception {
        try {
            //data from API
            String expTrainingTextFromAPI = shopAPI.getCarosel1ForKitsTexFromCollectiblestApi("ShopTicketsTabEndPoint");
            String actualTrainingTextFromAPI = shopPage.getTextforCarosel1ForKitsCollectibles();
            ExtentsReportManager.extentReportLogging("info", "TRAINING from API <br />" + expTrainingTextFromAPI);
            ExtentsReportManager.extentReportLogging("info", "TRAINING from UI <br />" + actualTrainingTextFromAPI);
            ExtentsReportManager.extentReportLogging("info", "Verified CAROUSEL 1 FOR KITS from UI with API");
            soft.assertEquals(actualTrainingTextFromAPI.toUpperCase(), expTrainingTextFromAPI.toUpperCase());

//            String expCollectiblesClaimYours = shopAPI.getCollectiblesClaimYoursTextFromCollectiblesApi("ShopCollectiblesCarouselEndPoint");
//            String actualCollectiblesClaimYours = shopPage.getTextforCollectiblesClaimYoursCollectibles();
//            ExtentsReportManager.extentReportLogging("info", "COLLECTIBLES CLAIM YOURS from API <br />" + expCollectiblesClaimYours);
//            ExtentsReportManager.extentReportLogging("info", "COLLECTIBLES CLAIM YOURS UI <br />" + actualCollectiblesClaimYours);
//            ExtentsReportManager.extentReportLogging("info", "Verified COLLECTIBLES CLAIM YOURS from UI with API");
//            soft.assertEquals(actualCollectiblesClaimYours.toUpperCase(), expCollectiblesClaimYours.toUpperCase());
//
//            String expCollectionsAndRewards = shopAPI.getCollectionsAndRewardsTextFromCollectiblesApi("ShopCollectiblesCarouselEndPoint");
//            String actualCollectionsAndRewards = shopPage.getTextforCollectionsAndRewardsCollectibles();
//            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS & REWARDS from API <br />" + expCollectionsAndRewards);
//            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS & REWARDS from UI <br />" + actualCollectionsAndRewards);
//            ExtentsReportManager.extentReportLogging("info", "Verified COLLECTIONS & REWARDS from UI with API");
//            soft.assertEquals(actualCollectionsAndRewards.toUpperCase(), expCollectionsAndRewards.toUpperCase());

            soft.assertAll();

            ExtentsReportManager.extentReportLogging("info", "Validated hero carousel and small card carousel");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating hero carousel and small card carousel<br />" + e);
            throw e;
        }
    }

//        try {
//            String expKits = table.cell(1, 0);
//            String expTraining = table.cell(1, 1);
//            String expUnitedeEssentials = table.cell(1, 2);
//            String expTickets = table.cell(1, 3);
//            String expCollections = table.cell(1, 4);
//            String expCatogory2 = table.cell(1, 5);
//
//            String actualKits = shopPage.getKitsTexstStickers();
//            String actualTraining = shopPage.getTrainingTextStickers();
//            String actualUnitedEssentials = shopPage.getUnitedEssentialsTextStickers();
//            String actualTickets = shopPage.getTicketsAndHospitalityText();
//            String actualCollections = shopPage.getCollectionCourselTextStickers();
//            String actualCatogory2 = shopPage.getCatogory2TextStickers();
//            soft.assertEquals(actualKits, expKits);
//            soft.assertEquals(actualTraining, expTraining);
//            soft.assertEquals(actualUnitedEssentials, expUnitedeEssentials);
//            soft.assertEquals(actualTickets, expTickets);
//            soft.assertEquals(actualCollections, expCollections);
//            soft.assertEquals(actualCatogory2, expCatogory2);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated small card carousel");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating small card carousel<br />" + e);
//            throw e;
//        }
//    }

//    @And("^user clicks on Tickets tab in shop screen$")
//    public void userClicksOnTicketsTabInShopScreen() {
//        try {
//            shopPage.clicksOnTicketsTabInShopScreen();
//            ExtentsReportManager.extentReportLogging("info", "Clicked on tickets tab in shop screen");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on tickets tab in shop screen<br />" + e);
//            throw e;
//        }
//    }

    @Then("^user validates tickets screen in shop page$")
    public void userValidatesTicketsScreenInShopPage(DataTable table) {
        try {
            String expErrorMessage = table.cell(1, 0);
            String expRetry = table.cell(1, 1);
            String actualErrorMessage = shopPage.getErrorMessageInTicketsScreen();
            String actualRetry = shopPage.getRetryTextInTicketsScreen();
            soft.assertEquals(actualErrorMessage, expErrorMessage);
            soft.assertEquals(actualRetry, expRetry);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated tickets screen in shop page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating tickets in shop page <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Merch tab in shop screen$")
    public void userClicksOnMerchTabInShopScreen() {
        try {
            shopPage.clicksOnMerchTabInShopScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Merch tab in shop screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on Merch tab in shop screen <br />" + e);
            throw e;
        }
    }

    @And("^user clicks on the hero card dots in merch screen$")
    public void userClicksOnTheHeroCardDotsInMerchScreen() {
        try {
            shopPage.clicksOnHeroCardDotsInMerchScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked on hero card dots in merch screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on hero card dots in merch screen<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on Tickets tab in shop screen$")
    public void userClicksOnCollectiblesTabInShopScreen() throws Throwable {
        try {
            shopPage.clickCollectiblesTab();
            ExtentsReportManager.extentReportLogging("info", "clicked on Collectibles tab in shop screen in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicked on Collectibles tab in shop screen in ios<br />" + e);

            throw e;

        }
    }

    @And("^user clicks on Shop tab in shop screen$")
    public void userClicksOnStoreTabInShopScreen() throws Throwable {
        try {
            shopPage.clickStoreTab();
            ExtentsReportManager.extentReportLogging("info", "clicked on Store tab in shop screen in ios");

        } catch (AssertionError e) {

            ExtentsReportManager.extentReportLogging("fail",
                    "Error in clicked on Store tab in shop screen in ios<br />" + e);

            throw e;

        }
    }

    @Then("^user validates small card carousels in store tab using Api$")
    public void userValidatesSmallCardCarouselsInStoreTabUsingApi() throws Throwable {
        try {
            //data from API
            String expCarosel1ForKits = shopAPI.getCarosel1ForKitsTexFromStoretApi("ShopStoreCarouselEndPoint");
            String actualCarosel1ForKits = shopPage.getTextforCarosel1ForKitsStore();
            ExtentsReportManager.extentReportLogging("info", "TRAINING from API <br />" + expCarosel1ForKits);
            ExtentsReportManager.extentReportLogging("info", "TRAINING from UI <br />" + actualCarosel1ForKits);
            ExtentsReportManager.extentReportLogging("info", "Verified TRAINING from UI with API");
            soft.assertEquals(actualCarosel1ForKits.toUpperCase(), expCarosel1ForKits.toUpperCase());

            String expTrending = shopAPI.getTrendingTextFromStoreApi("ShopStoreCarouselEndPoint");
            String actualTrending = shopPage.getTextforTrendingStore();
            ExtentsReportManager.extentReportLogging("info", "UNITED ESSENTIALS from API <br />" + expTrending);
            ExtentsReportManager.extentReportLogging("info", "UNITED ESSENTIALS UI <br />" + actualTrending);
            ExtentsReportManager.extentReportLogging("info", "Verified UNITED ESSENTIALS from UI with API");
            soft.assertEquals(actualTrending.toUpperCase(), expTrending.toUpperCase());

//            String expPlayers = shopAPI.getPlayersTextFromCollectiblesApi("ShopStoreCarouselEndPoint");
//            String actualPlayers = shopPage.getTextforPlayersStore();
//            ExtentsReportManager.extentReportLogging("info", "PLAYERS API <br />" + expPlayers);
//            ExtentsReportManager.extentReportLogging("info", "PLAYERS UI <br />" + actualPlayers);
//            ExtentsReportManager.extentReportLogging("info", "Verified PLAYERS from UI with API");
//            soft.assertEquals(actualPlayers.toUpperCase(), expPlayers.toUpperCase());
//
//            String expTicketsAndHospitality = shopAPI.getTicketsAndHospitalityTextFromStoreApi("ShopStoreCarouselEndPoint");
//            String actualTicketsAndHospitality = shopPage.getTextforTicketsAndHospitalityStore();
//            ExtentsReportManager.extentReportLogging("info", "TICKETS & HOSPITALITY  from API <br />" + expTicketsAndHospitality);
//            ExtentsReportManager.extentReportLogging("info", "TICKETS & HOSPITALITY  from UI <br />" + actualTicketsAndHospitality);
//            ExtentsReportManager.extentReportLogging("info", "Verified TICKETS & HOSPITALITY  from UI with API");
//            soft.assertEquals(actualTicketsAndHospitality.toUpperCase(), expTicketsAndHospitality.toUpperCase());
//
//            String expTraining = shopAPI.getTrainingTextFromCollectiblesApi("ShopStoreCarouselEndPoint");
//            String actualTraining = shopPage.getTextforTrainingStore();
//            ExtentsReportManager.extentReportLogging("info", "TRAINING from API <br />" + expTraining);
//            ExtentsReportManager.extentReportLogging("info", "TRAINING from UI <br />" + actualTraining);
//            ExtentsReportManager.extentReportLogging("info", "Verified TRAINING from UI with API");
//            soft.assertEquals(actualTraining.toUpperCase(), expTraining.toUpperCase());
//
//            String expCollections = shopAPI.getCollectionsTextFromStoreApi("ShopStoreCarouselEndPoint");
//            String actualCollections = shopPage.getTextforCollectionsStore();
//            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS from API <br />" + expCollections);
//            ExtentsReportManager.extentReportLogging("info", "COLLECTIONS from UI <br />" + actualCollections);
//            ExtentsReportManager.extentReportLogging("info", "Verified COLLECTIONS from UI with API");
//            soft.assertEquals(actualCollections.toUpperCase(), expCollections.toUpperCase());

            soft.assertAll();

            ExtentsReportManager.extentReportLogging("info", "Validated hero carousel and small card carousel");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating hero carousel and small card carousel<br />" + e);
            throw e;
        }
    }

	@Then("^user validates hero card is displayed in shop screen in membership tab using Api$")
	public void userValidatesHeroCardIsDisplayedInShopScreenUsingApi() throws Throwable {
		 try {
	            boolean enableHeroCarousel = shopAPI.getHeroCarouselStatusAPI("HeroCarouselEnableEndPointMembership");
	            String titleOfTheHeroCarouselTextFromUI = shopPage.getTitleOfHeroCarouselMembership();
	            System.out.println(titleOfTheHeroCarouselTextFromUI);
	            if (!enableHeroCarousel) {
	                String expTitleTextFromApi = shopAPI.getTitleOfHeroCarouselMembershipFromApi("HeroCarouselEnableEndPointMembership");
	                soft.assertEquals(titleOfTheHeroCarouselTextFromUI, expTitleTextFromApi.toUpperCase());
	                ExtentsReportManager.extentReportLogging("info", "validated hero card is displayed in shop screen using Api");
	            } 
	            soft.assertAll();

	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validation hero card is displayed in shop screen using Api<br />" + e);
	            throw e;
	        }
	    }

	@Then("^user validates hero card is displayed in shop screen in Shop tab using Api$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInStoreTabUsingApi() throws Throwable {
		 try {
	            boolean enableHeroCarousel = shopAPI.getHeroCarouselStatusStoreAPI("HeroCarouselEnableEndPointStore");
	            String titleOfTheHeroCarouselTextFromUI = shopPage.getTitleOfHeroCarouselStore();
	            System.out.println(titleOfTheHeroCarouselTextFromUI);
	            if (!enableHeroCarousel) {
	                String expTitleTextFromApi = shopAPI.getTitleOfHeroCarouselStoreFromApi("HeroCarouselEnableEndPointStore");
	                soft.assertEquals(titleOfTheHeroCarouselTextFromUI, expTitleTextFromApi.toUpperCase());
	                ExtentsReportManager.extentReportLogging("info", "validated hero card is displayed in shop screen in Store tab using Api");
	            } 
	            soft.assertAll();

	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validation hero card is displayed in shop screen in Store tab using Api<br />" + e);
	            throw e;
	        }
	    }

	@Then("^user validates hero card is displayed in shop screen in Ticket using Api$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInCollectiblesUsingApi() throws Throwable {
		 try {
	            boolean enableHeroCarousel = shopAPI.getHeroCarouselStatusCollectiblesAPI("HeroCarouselEnableEndPointCollectibles");
	            String titleOfTheHeroCarouselTextFromUI = shopPage.getTitleOfHeroCarouselCollectibles();
	            System.out.println(titleOfTheHeroCarouselTextFromUI);
	            if (!enableHeroCarousel) {
	                String expTitleTextFromApi = shopAPI.getTitleOfHeroCarouselCollectiblesFromApi("HeroCarouselEnableEndPointCollectibles");
	                soft.assertEquals(titleOfTheHeroCarouselTextFromUI, expTitleTextFromApi.toUpperCase());
	                ExtentsReportManager.extentReportLogging("info", "validated hero card is displayed in shop screen in Store tab using Api");
	            } 
	            soft.assertAll();

	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validation hero card is displayed in shop screen in Store tab using Api<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates small card carousels in Merch tab$")
	public void userValidatesSmallCardCarouselsInMerchTabUsingApi() throws Throwable {
		try {
            boolean flag = shopPage.userValidatesSmallCardCarouselsInMerchTab();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated small card carousels in Merch tab ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating small card carousels in Merch tab<br />" + e);
            throw e;
        }
    }

	@Then("^user validates hero card is displayed in shop screen in merch tab$")
	public void userValidatesHeroCardIsDisplayedInShopScreenInMerchTab() throws Throwable {
		try {
            boolean flag = shopPage.userValidatesHeroCardIsDisplayedInShopScreenInMerchTab();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "validated hero card is displayed in shop screen in merch tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating hero card is displayed in shop screen in merch tab<br />" + e);
            throw e;
        }
    }

	@And("^user validates shop tabs and content in it using API$")
	public void userValidatesShopTabsAndContentInItUsingAPI() throws Throwable {
	        try {
	            ArrayList<String> expectedShopMenuItems = new ArrayList<>();
	            expectedShopMenuItems = shopAPI.getShopTabMenuItemsFromApi("shopMenuItesmEndPoint");
	            shopPage.clicksOnOkButtonInCookiesScreenInShop();
	            shopPage.clickingOnTabs(expectedShopMenuItems);
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "validated shop tabs and content in it using API");

	        } catch (Exception  e) {
	            ExtentsReportManager.extentReportLogging("fail", "validates shop tabs and content in it using API<br />" + e);
	            throw e;
	        }
	    }
	    
	@Given("^user validates the shop page when we have the web view enabled using API$")
	public void user_validates_the_shop_page_when_we_have_the_web_view_enabled_using_API() throws Exception {
		try {
			String expectedWebViewItem = shopAPI.getWebViewFromAPI("SelectAllTextEndPoint");
			boolean actualWebViewItem =  shopPage.validateWebViewInShopPage();
			soft.assertEquals("WebView",expectedWebViewItem);
			soft.assertTrue(actualWebViewItem,"Web view Item is not present in Shop Page");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated the Web View enabled in shop page using API " + expectedWebViewItem);
		} catch (Exception  e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the Web View enabled in shop page using API <br />" + e);
			throw e;
		}
	}
	
	@And("^user validates the Menu items available under the Hamburger page using API$")
	public void userValidateMenuItemsUnderTheHambergerPageUsingAPI() throws Exception {
		try {
			ArrayList<String> expectedHamburgerMenuItemsAPI = new ArrayList<>();
			expectedHamburgerMenuItemsAPI = shopAPI.getHamburgerMenuItemsFromApi("SelectAllTextEndPoint");
			ExtentsReportManager.extentReportLogging("info",
					"Menu items available under the Hamburger page using API " + expectedHamburgerMenuItemsAPI);
			boolean actualMenuIteminUI = shopPage.OpenandValidatesHamburgerCloseInShopPage(expectedHamburgerMenuItemsAPI);
			
			soft.assertTrue(actualMenuIteminUI,"Menu items not present in Shop Page");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated the Menu items available under the Hamburger page using UI and API ");

		} catch (Exception  e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the Menu items available under the Hamburger page <br />" + e);
			throw e;
		}
	}

	@Then("user adds the first product in the wishlist")
	public void user_adds_the_first_product_in_the_wishlist() throws Exception {
		try {
			shopPage.addFirstProductInWishlist();
			ExtentsReportManager.extentReportLogging("info", "Clicked on Wishlist for First Product");
		
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in adding first product to Wishlist in Store screen<br />" + e);
			throw e;
		}
	    
	}
	@Then("user adds the first product and select size as {string}")
	public void user_adds_the_first_product_and_select_size_as(String size) throws Exception {
		try {
			shopPage.addFirstProductAndSelectSize(size);
			ExtentsReportManager.extentReportLogging("info", "Clicked on First Product with size");
		
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in adding first product to bag in Store screen<br />" + e);
			throw e;
		}
	    
	}
	@Then("user clicks on Add to bag button")
	public void user_click_on_add_to_bag_button() throws Exception {
		try {
			shopPage.clickOnAddtoBagButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on Add to Bag button");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking  Add to Bag button <br />" + e);
			throw e;
		}
	    
	}
	@Then("user validates Added to Bag page")
	public void user_validates_added_to_bag_page() throws Exception {
		try {
			boolean actualAddedtoBagPage = shopPage.validateAddedToBagPage();
			
			soft.assertTrue(actualAddedtoBagPage,"'Added to bag' is not present in Shop Page");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated 'Added to Bag' page");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating Added to bag page <br />" + e);
			throw e;
		}
	    
	}
	@Then("user clicks on Bag button")
	public void user_click_on_bag_button() throws Exception {
	   
		try {
			shopPage.clickOnBagButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on Bag");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking Bag button <br />" + e);
			throw e;
		}
	}
	
	
	
	@Then("user validates Your Bag page with product")
	public void user_validates_your_bag_page_with_proudct() throws Exception {
		try {
			boolean actualYourBagPage = shopPage.validateYourBagPage();
			soft.assertTrue(actualYourBagPage,"'Your bag' with product is not present in Store Page");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated 'Your Bag' page with product");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating Your Bage page with product <br />" + e);
			throw e;
		}
	    
	}
	
	@Then("user clicks on wishlist button")
	public void user_click_on_wishlist_button() throws Exception {
	   
		try {
			shopPage.clickOnWishlistButton();
			ExtentsReportManager.extentReportLogging("info", "Clicked on wishlist button");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking wishlist button <br />" + e);
			throw e;
		}
	}
	
	@Then("user validates product in wishlist page")
	public void user_validates_product_in_wishlist_page() throws Exception {
		try {
			boolean actualProductAddedtoWishlist = shopPage.validateWishlistProduct();
			
			soft.assertTrue(actualProductAddedtoWishlist,"Product is not present in Wishlist Page");
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated product in wishlist page");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating product in wishlist page <br />" + e);
			throw e;
		}
	    
	}

    @And("user clicks on ok button in cookies screen in Store")
    public void userClicksOnOkButtonInCookiesScreen() throws Exception {
        try {
        	shopPage.clicksOnOkButtonInCookiesScreenInStore();
            ExtentsReportManager.extentReportLogging("info", "Clicked on OK button in cookies screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking ok button in cookies screen<br />" + e);
            throw e;
        }
    }

	@Then("^user validates all the tabs in shop screen not displayed when disabled from CMS$")
	public void userValidatesAllTheTabsInShopScreenNotDisplayedWhenDisabledFromCMS() throws Throwable {
		try {	        
	    	  boolean isAllTabsDisabled =  shopPage.validateAllTheTabsInShopScreenDisabledInMutvPage();
	    	  soft.assertTrue(isAllTabsDisabled);
	    	  soft.assertAll();
	        ExtentsReportManager.extentReportLogging("info", "all the tabs in shop screen should be disabled from CMS");
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Error in validating the disabled all the tabs in shop.<br />" + e);
	        throw e;
	    }
	}

	@Then("^user validates hero card in shop screen$")
	public void userValidatesHeroCardInShopScreen() throws Throwable {
		try {
            boolean flag = shopPage.validatesHeroCardInShopScreen();
            soft.assertTrue(flag);
            ExtentsReportManager.extentReportLogging("info", "validated hero card in Latest screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validates hero card in Latest screen<br />" + e);
            throw e;
        }
	}
	}
	
	
	




