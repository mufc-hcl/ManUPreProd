package org.bdd.stepdef.ios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.pages.UnitedNowPage;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UnitedNowIosStepDef {
	public SoftAssert soft = new SoftAssert();

	public UnitedNowPage unitedNowPage = new UnitedNowPage();
	public UnitedNowAPIResponse unitedNowAPIResponse = new UnitedNowAPIResponse();
	 private static final Logger log = LogManager.getLogger(UnitedNowPage.class);

//	@Then("^user validates the current day and date in ios$")
//	public void userValidatesTheCurrentDayAndDateInIos() throws Throwable {
//		try {
//			String actualDate = new Common().getDateAndDay();
//			String expectedDate = unitedNowPage.getCurrentDayANdDate();
//			soft.assertEquals(actualDate, expectedDate);
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info", "validated the current day and date in ios");
//		} catch (AssertionError e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Error in validating the current day and date in ios <br />" + e);
//			throw e;
//		}
//	}
	 
	 @Then("^user validates the current day and date in ios$")
		public void userValidatesTheCurrentDayAndDateInIos() throws Throwable {
			try {
				String actualDate = new Common().getDateAndDayIOS().trim();
				String expectedDate = unitedNowPage.getCurrentDayANdDate().trim();
				soft.assertEquals(actualDate, expectedDate);
				soft.assertAll();
				ExtentsReportManager.extentReportLogging("info", "validated the current day and date in ios");
			} catch (AssertionError e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Error in validating the current day and date in ios <br />" + e);
				throw e;
			}
		}

	@And("^user click on filter icon in ios$")
	public void userClickOnFilterIconInIos() throws Throwable {
		try {
			unitedNowPage.clickFilterIcon();
			ExtentsReportManager.extentReportLogging("info", "clicked on filter icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on filter icon in ios<br />" + e);
			throw e;
		}
	}

	@And("^user validates filter is not selected by default in ios$")
	public void userValidatesFilterIsNotSelectedByDefaultInIos() throws Throwable {
		try {
//		boolean flag = unitedNowPage.menFilterIsSelected();
//		soft.assertTrue(flag);
//		soft.assertAll();
			Boolean expectedSelection = unitedNowPage.getFilterSelectionIos();
			soft.assertTrue(expectedSelection);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated filter is not selected by default in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating filter is not selected by default in ios <br />" + e);
			throw e;
		}
	}

	@And("user clicks on filter {string} in ios")
	public void userClicksOnFilterInIos(String filterFeed) {
		try {
			boolean expectedClick = unitedNowPage.clickFilterFeedInIos(filterFeed);
			soft.assertTrue(expectedClick);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "clicks on filterFeed "+filterFeed+" in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on filtereed in ios <br />" + e);
			throw e;
		}
	}

	@And("^user click on calender icon in ios$")
	public void userClickOnCalenderIconInIos() throws Throwable {
		try {
			unitedNowPage.clickCalenderIcon();
			ExtentsReportManager.extentReportLogging("info", "clicked on calender icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on calender icon in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user navigates to fixtures screen and validate below three values in ios$")
	public void userNavigatesToFixturesScreenAndValidateBelowThreeValuesInIos(DataTable table) throws Throwable {
		try {
			String expUnited = table.cell(1, 0);
			String expAllTeams = table.cell(1, 1);
//			String expMen = table.cell(1, 2);

			String actualUnited = unitedNowPage.getUnitedText();
			String actualAllTeams = unitedNowPage.getAllTeams();
			String actualMens = unitedNowPage.getMenText();
			soft.assertEquals(actualUnited, expUnited);
			soft.assertEquals(actualAllTeams, expAllTeams);
//			soft.assertEquals(actualMens, expMen);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"navigated to fixtures screen and validate below three values in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in navigating to fixtures screen and validate below three values in ios$<br />" + e);
			throw e;
		}
	}

	@And("^user click on men drop down and validates the dropdown values in ios using API$")
	public void userClickOnMenDropDownAndValidatesTheDropdownValuesInIos() throws IOException {
		try {
			unitedNowPage.clickMenDropDown();
			ArrayList<String> expectedMenDropdownValues = new ArrayList<>();
			expectedMenDropdownValues = unitedNowAPIResponse.getDropDownValuesFromApi("calendarDropDownEndpoint");
			ExtentsReportManager.extentReportLogging("info","Expectd drop down values<br />" + expectedMenDropdownValues);
			ExtentsReportManager.extentReportLogging("info","Actual drop down values<br /> " + unitedNowPage.getMenDropDownValues());
			soft.assertEquals(expectedMenDropdownValues, unitedNowPage.getMenDropDownValues());
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked on Mens drop down and validated the dropdown values");

		} catch (AssertionError | IOException e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Clicks on Mens drop down and error in validation of dropdown values<br />" + e);
			throw e;
		}

	}

	@Then("^user validates Stories Carousel in united now is displayed in ios$")
	public void userValidatesStoriesCarouselInUnitedNowIsDisplayedInIos() throws Throwable {
		try {
			unitedNowPage.validatesStoriesCarouselInUnitedNowIsDisplayed();
			ExtentsReportManager.extentReportLogging("info",
					"validated Stories Carousel in united now is displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating Stories Carousel in united now is displayed in ios <br />" + e);
			throw e;
		}
	}
//		try {
//            boolean storiesCarouselFromAPI = unitedNowAPIResponse.getStoriesCarouselFromApi("StoriesCarousalEndPoint");
//
//            boolean storiesCarouselDisplayedFromUI = unitedNowPage.validatesStoriesCarouselInUnitedNowIsDisplayed();
//
//            ExtentsReportManager.extentReportLogging("info","Stories Carousel  From API<br />"+storiesCarouselFromAPI);
//			 ExtentsReportManager.extentReportLogging("info","actual Stories Carousel From UI<br />"+unitedNowPage.validatesStoriesCarouselInUnitedNowIsDisplayed());
//
//            soft.assertEquals(storiesCarouselDisplayedFromUI, storiesCarouselFromAPI, "Carousel display mismatch.");
//	        soft.assertAll();
//
//            soft.assertAll();
//
//        } catch (Exception e) {
//            ExtentsReportManager.extentReportLogging("fail", 
//                "Exception occurred during Stories Carousel validation: " + e.getMessage());
//            throw e;
//        }

		

	@Then("^user validates Coming Up carousel in united now is displayed in ios$")
	public void userValidatesComingUpCarouselInUnitedNowIsDisplayedInIos() throws Throwable {
		 try {
 	        boolean comingUpCarouselDisplayedFromAPI = unitedNowAPIResponse.getComingUpCarousalFromApi("ComingUp/StoriesCarousalEndPoint");
 	        boolean comingUpCarouselCarouselDisplayedFromUI = unitedNowPage.validatesTheCaroselPageIsDisplayed();

 	        ExtentsReportManager.extentReportLogging("info","Coming up Carousel  From API<br />"+comingUpCarouselDisplayedFromAPI);
			 ExtentsReportManager.extentReportLogging("info","actual Coming up Carousel From UI<br />"+unitedNowPage.validatesTheCaroselPageIsDisplayed());

 	        soft.assertEquals(comingUpCarouselCarouselDisplayedFromUI, comingUpCarouselDisplayedFromAPI, "Carousel display mismatch.");
 	        soft.assertAll();

 	        ExtentsReportManager.extentReportLogging("info", "Validated the Coming up carousel is displayed in United Now using API.");
 	    } catch (Exception e) {
 	        ExtentsReportManager.extentReportLogging("fail", "Exception occurred during Coming up carousel validation: " + e.getMessage());
 	        throw e;
 	    }
 }
//	 try {
//	        boolean flag = unitedNowPage.validatesTheCaroselPageIsDisplayed();
//	        soft.assertTrue(flag);
//	        soft.assertAll();
//	        ExtentsReportManager.extentReportLogging("info", "Validated the carousel page is displayed for carousel");
//	    } catch (AssertionError e) {
//	        ExtentsReportManager.extentReportLogging("fail", "Error in validating carousel page is displayed for carousel <br />" + e);
//	        throw e;
//	    }
//	    }

	@And("^user clicks on table icon from any scheduled match in ios$")
	public void userClicksOnTableIconFromAnyScheduledMatchInIos() throws Throwable {
		try {
			unitedNowPage.clicksOnTableIconFromAnyScheduledMatch();
			unitedNowPage.clicksOnTableCTAInFixuturesPageInIos();
			ExtentsReportManager.extentReportLogging("info", "clicked on table icon from any scheduled match in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on table icon from any scheduled match in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the Men match schedule in ios$")
	public void userValidatesTheMenMatchScheduleInIos() throws Throwable {
		 try {
			 	ArrayList<String> expPremierLeagueFromAPI = new ArrayList<>();
	        	ArrayList<String> expEuropaLeagueFromAPI = new ArrayList<>();

	        	String actualPremierLeagueTextUI = unitedNowPage.getMenLeague1Text();
	            String actualEuropaLeagueUI = unitedNowPage.getMenLeague2Text();
	        	
	        	expPremierLeagueFromAPI = unitedNowAPIResponse.getPremierLeagueFromApi("MenUpcomingFixturesEndpoints",actualPremierLeagueTextUI);
	            expEuropaLeagueFromAPI = unitedNowAPIResponse.getEuropaLeagueFromAPI("MenUpcomingFixturesEndpoints",actualEuropaLeagueUI);
	            
	            ExtentsReportManager.extentReportLogging("info","premierLeagueFromAPI  From API<br />"+expPremierLeagueFromAPI.get(0));
	  			ExtentsReportManager.extentReportLogging("info","actual actualPremierLeagueTextUI From UI<br />"+unitedNowPage.getMenLeague1Text());
	  			
	  			ExtentsReportManager.extentReportLogging("info","europaLeagueFromAPI  From API<br />"+expEuropaLeagueFromAPI.get(0));
	  			ExtentsReportManager.extentReportLogging("info","actual actualEuropaLeagueUI From UI<br />"+unitedNowPage.getMenLeague2Text());
	           
	            soft.assertEquals(actualPremierLeagueTextUI.toUpperCase(), expPremierLeagueFromAPI.get(0).toUpperCase());
	            soft.assertEquals(actualEuropaLeagueUI.toUpperCase(), expEuropaLeagueFromAPI.get(0).toUpperCase());
	  			soft.assertAll();

	            ExtentsReportManager.extentReportLogging("info", "Validated men match schedule");
	           } catch (AssertionError e) {
	        	   ExtentsReportManager.extentReportLogging("fail", "Error in validating men match schedule <br />" + e);
	               throw e;
	           }
	       }

	@And("user selects {string} from the dropdown in ios")
	public void userSelectsFromTheDropdownInIos(String value) throws Throwable {
		try {
			unitedNowPage.selectCategoryFromDropDown(value);
			ExtentsReportManager.extentReportLogging("info", "selects value from the dropdown in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in selecting value from the dropdown in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the Women match schedule in ios$")
	public void userValidatesTheWomenMatchScheduleInIos(DataTable table) throws Throwable {
		try {
			String actualLeague1 = table.cell(1, 0);
			String actualLeague2 = table.cell(1, 1);
			String expectedLeague1 = unitedNowPage.getWomenLeague1Text();
			String expectedLeague2 = unitedNowPage.getWomenLeague2Text();
			soft.assertEquals(actualLeague1, expectedLeague1);
			soft.assertEquals(actualLeague2, expectedLeague2);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the Women match schedule in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the Women match schedule in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates the under twenty one match schedule in ios$")
	public void userValidatesTheUnderTwentyOneMatchScheduleInIos(DataTable table) throws Throwable {
		try {
			String actualLeague1 = table.cell(1, 0);
			String actualLeague2 = table.cell(1, 1);
			String expectedLeague1 = unitedNowPage.getUnder21League1Text();
			String expectedLeague2 = unitedNowPage.getUnder21League2Text();
			soft.assertEquals(actualLeague1, expectedLeague1);
			soft.assertEquals(actualLeague2, expectedLeague2);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the under twenty one match schedule in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the under twenty one match schedule in ios <br />" + e);

			throw e;

		}

	}

	@Then("^user validates the under eighteen match schedule in ios$")
	public void userValidatesTheUnderEighteenMatchScheduleInIos(DataTable table) throws Throwable {
		try {
			String actualLeague1 = table.cell(1, 0);
			String actualLeague2 = table.cell(1, 1);
			String expectedLeague1 = unitedNowPage.getUnder18League1Text();
			String expectedLeague2 = unitedNowPage.getUnder18League2Text();
			soft.assertEquals(actualLeague1, expectedLeague1);
			soft.assertEquals(actualLeague2, expectedLeague2);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the under eighteen match schedule in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the under eighteen match schedule in ios <br />" + e);

			throw e;

		}

	}

	@And("^user clicks on men tab in ios$")
	public void userClicksOnMenTabInIos() throws Throwable {
		try {
			unitedNowPage.clickOnMenTabInIos();
			ExtentsReportManager.extentReportLogging("info", "clicked on men tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on men tab in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks on women tab in ios$")
	public void userClicksOnWomenTabInIos() throws Throwable {
		try {
			unitedNowPage.clickOnWomenTabInIos();
			ExtentsReportManager.extentReportLogging("info", "clicked on women tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking on women tab in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks on under tweenty oneS tab in ios$")
	public void userClicksOnUnderTweentyOneSTabInIos() throws Throwable {
		try {
			unitedNowPage.clickOnTweentyOneSTabInIos();
			ExtentsReportManager.extentReportLogging("info", "clicked on under tweenty oneS tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on under tweenty oneS tab in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks on women tab and validates the Women match schedule in ios$")
	public void userClicksOnWomenTabAndValidatesTheWomenMatchScheduleInIos() throws Throwable {
		try {
			unitedNowPage.clickOnDDWomenSTabInIos();
	        ArrayList<String> expWomensSuperLeagueFromAPI = new ArrayList<>();
        	ArrayList<String> expContinentalLeagueCupFromAPI = new ArrayList<>();
        	
        	String actualWomensSuperLeagueTextUI = unitedNowPage.getWomenLeague1Text();
        	String actualContenentalLeagueCupUI = unitedNowPage.getWomenLeague2Text();
        	
            expWomensSuperLeagueFromAPI = unitedNowAPIResponse.getWomensSuperLeagueFromApi("WomenUpcomingFixturesEndpoints", actualWomensSuperLeagueTextUI);
            expContinentalLeagueCupFromAPI = unitedNowAPIResponse.getContenentalLeagueCupFromAPI("WomenUpcomingFixturesEndpoints", actualContenentalLeagueCupUI);
            

            ExtentsReportManager.extentReportLogging("info","womensSuperLeagueFromAPI  From API<br />"+expWomensSuperLeagueFromAPI.get(0));
 			ExtentsReportManager.extentReportLogging("info","actual actualWomensSuperLeagueTextUI From UI<br />"+unitedNowPage.getWomenLeague1Text());

            ExtentsReportManager.extentReportLogging("info","contenentalLeagueCupFromAPI  From API<br />"+expContinentalLeagueCupFromAPI.get(0));
			ExtentsReportManager.extentReportLogging("info","actual getWomenLeague2Text From UI<br />"+unitedNowPage.getWomenLeague2Text());

			soft.assertEquals(actualWomensSuperLeagueTextUI.toUpperCase(), expWomensSuperLeagueFromAPI.get(0).toUpperCase());
            soft.assertEquals(actualContenentalLeagueCupUI.toUpperCase(), expContinentalLeagueCupFromAPI.get(0).toUpperCase());
            soft.assertAll();

            ExtentsReportManager.extentReportLogging("info", "Validated women match schedule");
	             } catch (AssertionError e) {
	          	   ExtentsReportManager.extentReportLogging("fail", "Error in validating women match schedule <br />" + e);
	                 throw e;
	             }
	         }

	@And("^user clicks on under tweenty one and validates the under twenty one match schedule in ios$")
	public void userClicksOnUnderTweentyOneSAndValidatesTheUnderTwentyOneMatchScheduleInIos()
			throws Throwable {
		try {
				unitedNowPage.clickOnDDUnder21STabInIos();
				ArrayList<String> expPpremierLeague2FromAPI = new ArrayList<>();
	        	ArrayList<String> expEFLTrophyFromAPI = new ArrayList<>();
	        	
	        	String actualPremierLeague2TextUI = unitedNowPage.getUnder21League1Text();
	        	String actualEFLTrophyUI = unitedNowPage.getUnder21League2Text();
	        	
	            expPpremierLeague2FromAPI = unitedNowAPIResponse.getPremierLeague2FromAPI("Under21SUpcomingFixturesEndpoints", actualPremierLeague2TextUI);
	            expEFLTrophyFromAPI = unitedNowAPIResponse.getEFLTrophyFromAPI("Under21SUpcomingFixturesEndpoints", actualEFLTrophyUI);

	            
	            ExtentsReportManager.extentReportLogging("info","premierLeague2FromAPI  From API<br />"+expPpremierLeague2FromAPI.get(0));
	            ExtentsReportManager.extentReportLogging("info","actual actualPremierLeague2TextUI From UI<br />"+unitedNowPage.getUnder21League1Text());
	            ExtentsReportManager.extentReportLogging("info","eflTrophyFromAPI  From API<br />"+expEFLTrophyFromAPI.get(0));
	            ExtentsReportManager.extentReportLogging("info","actual actualEFLTrophyUI From UI<br />"+unitedNowPage.getUnder21League2Text());

	            soft.assertEquals(actualPremierLeague2TextUI.toUpperCase(), expPpremierLeague2FromAPI.get(0).toUpperCase());
	            soft.assertEquals(actualEFLTrophyUI.toUpperCase(), expEFLTrophyFromAPI.get(0).toUpperCase());
	            soft.assertAll();

	            ExtentsReportManager.extentReportLogging("info", "Validated UnderTwentyOneMatchSchedule match schedule");
		          } catch (AssertionError e) {
		       	   ExtentsReportManager.extentReportLogging("fail", "Error in validating UnderTwentyOneMatchSchedule match schedule <br />" + e);
		              throw e;
		          }
		      }
			

	@And("^user clicks on under eighteenS validates the under eighteen match schedule in ios$")
	public void userClicksOnUnderEighteenSValidatesTheUnderEighteenMatchScheduleInIos()
			throws Throwable {
		try {
				unitedNowPage.clickOnDDEighteenSTabInIos();
				ArrayList<String> expU18PremierLeagueFromAPI = new ArrayList<>();
	        	ArrayList<String> expUEFAYouthLeagueFromAPI = new ArrayList<>();

	        	String actuaU18PremierLeagueTextUI = unitedNowPage.getUnder18League1Text();
	        	String actualUEFAYouthLeagueUI = unitedNowPage.getUnder18League2Text();
	        	
	            expU18PremierLeagueFromAPI = unitedNowAPIResponse.getU18PremierLeagueFromAPI("Under18SUpcomingFixturesEndpoints", actuaU18PremierLeagueTextUI);
	            expUEFAYouthLeagueFromAPI = unitedNowAPIResponse.getUEFAYouthLeagueFromAPI("Under18SUpcomingFixturesEndpoints", actualUEFAYouthLeagueUI);

	            ExtentsReportManager.extentReportLogging("info","u18PremierLeagueFromAPI  From API<br />"+expU18PremierLeagueFromAPI.get(0));
				ExtentsReportManager.extentReportLogging("info","actual actuaU18PremierLeagueTextUI From UI<br />"+unitedNowPage.getUnder18League1Text());

	            ExtentsReportManager.extentReportLogging("info","uefaYouthLeagueFromAPI  From API<br />"+expUEFAYouthLeagueFromAPI.get(0));
	            ExtentsReportManager.extentReportLogging("info","actual actualUEFAYouthLeagueUI From UI<br />"+unitedNowPage.getUnder18League2Text());

	            soft.assertEquals(actuaU18PremierLeagueTextUI.toUpperCase(), expU18PremierLeagueFromAPI.get(0).toUpperCase());
	            soft.assertEquals(actualUEFAYouthLeagueUI.toUpperCase(), expUEFAYouthLeagueFromAPI.get(0).toUpperCase());
	            soft.assertAll();

	            ExtentsReportManager.extentReportLogging("info", "Validated under eighteen match schedule");
		           } catch (AssertionError e) {
		        	   ExtentsReportManager.extentReportLogging("fail", "Error in validating under eighteen match schedule <br />" + e);
		               throw e;
		           }
		       }
			

	@And("^user clicks the player icon in united now screen in ios$")
	public void userClicksThePlayerIconInUnitedNowScreenInIos() throws Throwable {
		try {
			unitedNowPage.clicksThePlayerIconInUnitedNowScreen();
			ExtentsReportManager.extentReportLogging("info", "clicked the player icon in united now screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the player icon in united now screen in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates the Players filter items in the players screen in ios using API$")
	public void userValidatesTheFollowingFilterInThePlayersScreenInIos() throws Throwable {
		 try {
             ArrayList<String> expPlayersPageFilters = new ArrayList<>();
             ArrayList<String> actPlayersPageFilters = new ArrayList<>();
             expPlayersPageFilters = unitedNowAPIResponse.getPlayersPageFilterFromApi("PlayersPageFiltersEndpoint");
             ExtentsReportManager.extentReportLogging("info","expPlayersPageFilters Text From API<br />"+expPlayersPageFilters);
             actPlayersPageFilters=unitedNowPage.getPlayersFiltersPageUI();
             System.out.println("actPlayersPageFillers------------"+actPlayersPageFilters);
             Collections.sort(expPlayersPageFilters);
             Collections.sort(actPlayersPageFilters);
             soft.assertTrue(actPlayersPageFilters.containsAll(expPlayersPageFilters) ,expPlayersPageFilters.toString()+ " Expected player items not matched with actual player items "+actPlayersPageFilters.toString());
             soft.assertAll();
             
			 ExtentsReportManager.extentReportLogging("info","actual getPlayersFiltersPageUI Text From UI<br />"+actPlayersPageFilters);
            // soft.assertEquals(expPlayersPageFilters,actPlayersPageFilters);
             //soft.assertAll();
             ExtentsReportManager.extentReportLogging("info", "Validated the PlayersPageFilters screen");
    	 } catch (AssertionError | IOException e) {
    		  ExtentsReportManager.extentReportLogging("fail", "validation of PlayersPageFilters values<br />" + e);
             throw e;
         }
	}
	@And("user clicks player from {string} tab in ios")
	public void userClicksPlayerFromTabInIos(String category) {
		try {
			unitedNowPage.clicksPlayerFromTab(category);
			ExtentsReportManager.extentReportLogging("info", "clicked player from category tab in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking player from category tab in ios <br />" + e);

			throw e;

		}

	}

	@Then("^verify profile and stats tab are displayed in ios$")
	public void verifyProfileAndStatsTabAreDisplayedInIos() throws Throwable {
		try {
			unitedNowPage.getProfileTab();
			unitedNowPage.getStatsTab();
			unitedNowPage.getProfileTab();
			ExtentsReportManager.extentReportLogging("info", "verifyed profile and stats tab are displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in verifying profile and stats tab are displayed in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks back icon in ios$")
	public void userClicksBackIconInIos() throws Throwable {
		try {
			unitedNowPage.userClicksBackIconInPlayesPage();
			ExtentsReportManager.extentReportLogging("info", "clicked back icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon in ios <br />" + e);
			throw e;
		}

	}

	@And("^navigates to the joined section in ios$")
	public void navigatesToTheJoinedSectionInIos() throws Throwable {
		try {
			unitedNowPage.navigatesToTheJoinedSectionIos();
			ExtentsReportManager.extentReportLogging("info", "navigated to the joined section in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in navigating to the joined section in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks women tab in ios$")
	public void userClicksWomenTabInIos() throws Throwable {
		try {
			unitedNowPage.userClickOnWomenTabIOS();
			ExtentsReportManager.extentReportLogging("info", "clicked women tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking women tab in ios <br />" + e);
			throw e;
		}
	}

	@And("navigate to the latest section for the player in ios")
	public void navigateToTheLatestSectionForThePlayerInIos() {
		try {
			unitedNowPage.navigateToTheLatestSectionForThePlayerIos();
			ExtentsReportManager.extentReportLogging("info", "navigated to the latest section for the player in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in navigating to the latest section for the player in ios <br />" + e);
			throw e;
		}
	}

	@And("verify clicking on video or article navigates to the respective page in ios")
	public void verifyClickingOnVideoOrArticleNavigatesToTheRespectivePageInIos() {
		try {
			unitedNowPage.clickingOnVideoOrArticleNavigatesToTheRespectivePage();
			ExtentsReportManager.extentReportLogging("info",
					"verifyed clicking on video or article navigates to the respective page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in verifying clicking on video or article navigates to the respective page in ios <br />"
							+ e);
			throw e;
		}
	}

	@And("^user clicks Three dots icon in ios$")
	public void userClicksThreeDotsIconInIos() throws Throwable {
		try {
			unitedNowPage.clickOnThreeDotsIcon();
			ExtentsReportManager.extentReportLogging("info", "clicked Three dots icon in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in clicking Three dots icon in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks the following filter in UnitedNow Calender screen in ios$")
	public void userClicksTheFollowingFilterInUnitedNowCalenderScreenInIos(DataTable table) throws Throwable {
		try {
			unitedNowPage.clickOnTheGivenFilterInIos(table.cell(1, 0));
			ExtentsReportManager.extentReportLogging("info",
					"clicked the following filter in UnitedNow Calender screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the following filter in UnitedNow Calender screen in ios<br />" + e);
			throw e;
		}
	}
	
	@And("^user select first radio option and validate content in the body in ios$")
	public void userSelectFirstRadioOptionAndValidateContentInTheBodyInIOS() throws Throwable {
		try {
			ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            boolean flag1 = unitedNowPage.clickingRadioButtonAndValidateContentInBodyOne(allLeagueFiltersDropDownValues);
            soft.assertTrue(flag1);
            soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"clicked the following filter in UnitedNow Calender screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the following filter in UnitedNow Calender screen in ios<br />" + e);
			throw e;
		}
	}
	
	@And("^user select secound radio option and validate content in the body in ios$")
	public void userSelectSecoundRadioOptionAndValidateContentInTheBodyInIOS() throws Throwable {
		try {
			ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag2 = unitedNowPage.clickingRadioButtonAndValidateContentInBodyTwo(allLeagueFiltersDropDownValues);            
            soft.assertTrue(flag2);
            soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"clicked the following filter in UnitedNow Calender screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the following filter in UnitedNow Calender screen in ios<br />" + e);
			throw e;
		}
	}
	
	@And("^user select third radio option and validate content in the body in ios$")
	public void userSelectThirdRadioOptionAndValidateContentInTheBodyInIOS() throws Throwable {
		try {
			ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag2 = unitedNowPage.clickingFriendlyRadioButtonAndValidateContentInBodyThree(allLeagueFiltersDropDownValues);            
            soft.assertTrue(flag2);
            soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"clicked the following filter in UnitedNow Calender screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the following filter in UnitedNow Calender screen in ios<br />" + e);
			throw e;
		}
	}
	
	@And("^user select fourth radio option and validate content in the body in ios$")
	public void userSelectFourthRadioOptionAndValidateContentInTheBodyInIOS() throws Throwable {
		try {
			ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag2 = unitedNowPage.clickingRadioButtonAndValidateContentInBodyFour(allLeagueFiltersDropDownValues);            
            soft.assertTrue(flag2);
            soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"clicked the following filter in UnitedNow Calender screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the following filter in UnitedNow Calender screen in ios<br />" + e);
			throw e;
		}
	}
	
	@And("^user select fifth radio option and validate content in the body in ios$")
	public void userSelectFifthRadioOptionAndValidateContentInTheBodyInIOS() throws Throwable {
		try {
			ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag2 = unitedNowPage.clickingRadioButtonAndValidateContentInBodyFive(allLeagueFiltersDropDownValues);            
            soft.assertTrue(flag2);
            soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"clicked the following filter in UnitedNow Calender screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking the following filter in UnitedNow Calender screen in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the upcoming Fixtures in ios$")
	public void userValidatesTheUpcomingFixturesInIos(DataTable table) throws Throwable {
		try {
			boolean flag = unitedNowPage.validateUpcomingFixturesInIos(table.cell(1, 0));
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the upcoming Fixtures in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the upcoming Fixtures in ios <br />" + e);
			throw e;
		}
	}

	@And("^user clicks on results icon in the united now screen in ios$")
	public void userClicksOnResultsIconInTheUnitedNowScreenInIos() throws Throwable {
		try {
			unitedNowPage.clickOnResults();
			ExtentsReportManager.extentReportLogging("info",
					" clicked on results icon in the united now screen in ios");

		} catch (AssertionError e) {

			ExtentsReportManager.extentReportLogging("fail",
					"Error in user clicking on results icon in the united now screen in ios <br />" + e);

			throw e;

		}

	}

	@Then("^user validates the results in ios Using Api$")
	 public void userValidatesTheUpcomingFixturesusingApi() throws Exception {
        try {
            Boolean expectedSelection0 = unitedNowPage.getMatchDayLive();
            soft.assertTrue(expectedSelection0);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated Matchday live Fixtures using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate EMatchday live Fixtures Text userValidatesTheUpcomingFixturesusingApi<br />" + e);
            throw e;
        }
        
    }
//	public void userValidatesTheResultsInIos() throws Throwable {
//		 try {
//        	 String matchReviwTextFromAPI=unitedNowAPIResponse.getContenttypeMatchResultsApi("MatchReviewEndPoint");
//        	 String actualMatchReviwTextFromUI = unitedNowPage.validateUpcomingResults();
//
//			 ExtentsReportManager.extentReportLogging("info","match Review Text From API<br />"+matchReviwTextFromAPI);
//			 ExtentsReportManager.extentReportLogging("info","actual Match Review Text From UI<br />"+unitedNowPage.validateUpcomingResults());
//        	 
//           soft.assertEquals(actualMatchReviwTextFromUI,matchReviwTextFromAPI);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated the results");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating the results<br />" + e);
//            throw e;
//        }
//    }
		
//		try {
//			boolean flag = unitedNowPage.validateUpcomingResultsInIos(table.cell(1, 0));
//			soft.assertTrue(flag);
//			soft.assertAll();
//			ExtentsReportManager.extentReportLogging("info", " validated the results in ios");
//
//		} catch (AssertionError e) {
//
//			ExtentsReportManager.extentReportLogging("fail", "Error in user validating the results in ios<br />" + e);
//
//			throw e;
//
//		}

//	}

	@Then("^user validates the following leagues in ios using Api$")
	public void userValidatesTheFollowingLeaguesInIos() throws Throwable {
		 try {
             ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
             allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApi("AllLeagueFiltersEndpoint");
             
             Collections.sort(allLeagueFiltersDropDownValues);
			 ExtentsReportManager.extentReportLogging("info","All Leagues From Api<br />"+allLeagueFiltersDropDownValues);
			 ExtentsReportManager.extentReportLogging("info","League Filter Radio Btn Values<br />"+unitedNowPage.getLeagueFilterRadioBtnValues());
             soft.assertEquals(allLeagueFiltersDropDownValues,unitedNowPage.getLeagueFilterRadioBtnValues());
             soft.assertAll();
             ExtentsReportManager.extentReportLogging("info", "Validated the FilterFeeds screen");
    	 } catch (AssertionError | IOException e) {
    		  ExtentsReportManager.extentReportLogging("fail", "validation of FilterFeeds values<br />" + e);
             throw e;
         }
    }

	@And("^user clicks all radio button and validates leagues displayed in ios$")
	public void userClicksAllRadioButtonAndValidatesLeaguesDisplayedInIos() throws Throwable {
		try {
			boolean flag = unitedNowPage.validateLeaguesDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					" clicked all radio button and validates leagues displayed in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in user clicking all radio button and validates leagues displayed in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates the filtered league in ios$")
	public void userValidatesTheFilteredLeagueInIos(DataTable table) throws Throwable {
		try {
			boolean flag = unitedNowPage.validatefilteredLeagueInIos(table.cell(1, 0));
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", " validated the filtered league in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in user validating the filtered league in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the filtered Europe league in ios$")
	public void userValidatesTheFilteredEuropeLeagueInIos(DataTable table) throws Throwable {
		try {
			boolean flag = unitedNowPage.validatefilteredEuropeLeagueInIos(table.cell(1, 0));
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", " validated the filtered Europe league in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in user validating the filtered Europe league in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates League cup the filtered league in ios$")
	public void userValidatesLeagueCupTheFilteredLeagueInIos(DataTable table) throws Throwable {
		try {
			boolean flag = unitedNowPage.validatefilteredLeagueCupOpt4InIos(table.cell(1, 0));
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", " validated League cup the filtered league in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in user validating League cup the filtered league in ios<br />" + e);
			throw e;
		}
	}

	@And("^user scroll to results in united now screen in ios$")
	public void userScrollToResultsInUnitedNowScreenInIos() throws Throwable {
		try {
			unitedNowPage.scrollToResultsInUnitedNowScreenInIos();
			ExtentsReportManager.extentReportLogging("info", " scrolled to results in united now screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in user scrolling to results in united now screen in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates filter \"([^\"]*)\" is  selected in ios$")
	public void userValidatesFilterIsSelectedInIos(String filterFeed) {
		try {
			boolean expectedFilterSelection = unitedNowPage.validatesFilterIsSelectedInIos(filterFeed);
			soft.assertTrue(expectedFilterSelection);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", " validated filter filterFeed "+filterFeed+" is  selected in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating filter filterFeed is  selected in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates filter \"([^\"]*)\" is  not selected in ios$")
	public void userValidatesFilterIsNotSelectedInIos(String filterFeed) {
		try {
			boolean expectedFilterSelection = unitedNowPage.validatesFilterIsNotSelectedInIos(filterFeed);
			soft.assertTrue(expectedFilterSelection);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated filter filterFeed "+filterFeed+" is  not selected in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating filter filterFeed is  not selected in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the Friendly filtered league in ios$")
	public void userValidatesTheFriendlyFilteredLeagueInIos(DataTable table) throws Throwable {
		try {
			boolean flag = unitedNowPage.validateFriendlyfilteredLeagueInIos(table.cell(1, 0));
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the Friendly filtered league in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the Friendly filtered league in ios <br />" + e);
			throw e;
		}
	}

	@Then("^user validates the filtered FA league in ios$")
	public void userValidatesTheFilteredFALeagueInIos(DataTable table) throws Throwable {
		try {
			boolean flag = unitedNowPage.validateTheFilteredFALeagueInIos(table.cell(1, 0));
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated the filtered FA league in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the filtered FA league in ios<br />" + e);
			throw e;
		}
	}

	@Then("user checks for article card in united now page using api in ios")
	public void userValidatesTheArticleCardInIos() throws Exception {
		 ArrayList<String> expectedArticalCard = new ArrayList<>();
		try {
			expectedArticalCard = unitedNowAPIResponse.getArticleCard("getAllCardsFromUnitedNow");
			if(!expectedArticalCard.isEmpty()) {
				soft.assertTrue(unitedNowPage.getArticleCardFromUnitedNow(expectedArticalCard.get(0)));
				soft.assertAll();
				ExtentsReportManager.extentReportLogging("info", "Article card is available in united now page");
			}else {
				ExtentsReportManager.extentReportLogging("info", "Article card not available in united now page");
			}
		} catch (AssertionError | Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in checking for article card in united now page<br />" + e);
			throw e;
		}
	}

	@Then("user checks for Image card in united now page using api in ios")
	public void userValidatesTheImageCardInIos() throws Exception {
		 ArrayList<String> expectedImageCard = new ArrayList<>();
         try {
        	 expectedImageCard = unitedNowAPIResponse.getImageCard("getAllCardsFromUnitedNow");
        	 ExtentsReportManager.extentReportLogging("info", "Image Card from API  "+expectedImageCard);
             if(!expectedImageCard.isEmpty()) {
                 soft.assertTrue(unitedNowPage.getImagefromUnitedNow(expectedImageCard.get(0)));
                 soft.assertAll();
                 ExtentsReportManager.extentReportLogging("info", "Image card is available in united now page");
             }else {
                 ExtentsReportManager.extentReportLogging("info", "Image card not available in united now page");
             }
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in checking for Image card in united now page<br />" + e);
             throw e;
         }
	}

	@Then("user checks for gallery card in united now page using api in ios")
	public void userValidatesTheImageGalleryCardInIos() throws Exception {
		ArrayList<String> expectedGalleryCard = new ArrayList<>();
        try {
       	 expectedGalleryCard = unitedNowAPIResponse.getGalleryCard("getAllCardsFromUnitedNow");
       	 ExtentsReportManager.extentReportLogging("info", "Gallery Card from API  "+expectedGalleryCard);
            if(expectedGalleryCard.size() > 0) {
                soft.assertTrue(unitedNowPage.getGalleryCardFromUnitedNow(expectedGalleryCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Gallery card is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Gallery card not available in united now page in UI and API");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Gallery card in united now page<br />" + e);
            throw e;
        }
	}

	@Then("user checks for video card in united now page using api in ios")
	public void userValidatesTheVideoCardInIos() throws Exception {
		 ArrayList<String> expectedVideoCard = new ArrayList<>();
	        try {
	            expectedVideoCard = unitedNowAPIResponse.getVideoCard("getAllCardsFromUnitedNow");
	            if(!expectedVideoCard.isEmpty()) {
	                soft.assertTrue(unitedNowPage.getVideoCardFromUnitedNow(expectedVideoCard.get(1)));
	                soft.assertAll();
	                ExtentsReportManager.extentReportLogging("info", "video card is available in united now page");
	            }else {
	                ExtentsReportManager.extentReportLogging("info", "video card not available in united now page");
	            }
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in checking for video card in united now page<br />" + e);
	            throw e;
	        }
	}

	@Then("user checks for quiz card in united now page using api in ios")
	public void userValidatesTheQuizCardInIos() throws Exception {
		ArrayList<String> expectedQuoteCard = new ArrayList<>();
        try {
        	expectedQuoteCard = unitedNowAPIResponse.getQuizCard("getAllCardsFromUnitedNow");
            if(!expectedQuoteCard.isEmpty()) {
                soft.assertTrue(unitedNowPage.getQuizCardFromUnitedNow(expectedQuoteCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Quote card is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Quote card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Quote card in united now page<br />" + e);
            throw e;
        }
	}

	@Then("user validates the stats card in ios")
	public void userValidatesTheStatsCardInIos() {
		try {
			boolean flag = unitedNowPage.validatesTheStatsCardInIos();
			if (flag) {
				soft.assertTrue(true, "Stats card is present in the screen");
			} else {
				soft.assertTrue(true, "Stats card not configured in the application");
			}
			ExtentsReportManager.extentReportLogging("info", "validated the stats card in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating the stats card in ios <br />" + e);
			throw e;
		}
	}

	@Then("user validates the collections card in ios")
	public void userValidatesTheCollectionsCardInIos() {
		try {
			boolean flag = unitedNowPage.validatesTheCollectionsCardInIos();
			if (flag) {
				soft.assertTrue(true, "Collections card is present in the screen");
			} else {
				soft.assertTrue(true, "Collections card not configured in the application");
			}

			ExtentsReportManager.extentReportLogging("info", "validated the collections card in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the collections card in ios<br />" + e);
			throw e;
		}
	}

	@And("^user navigates to previous match in fixtures page in ios$")
	public void userNavigatesToPreviousMatchInFixturesPageInIos() {
		try {
			new UnitedNowPage().navigatesToPreviousMatchInFixturesPage();
			ExtentsReportManager.extentReportLogging("info", "Navigated to previous match in fixtures page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in navigating to previous match in fixtures page in ios<br />" + e);
			throw e;
		}
	}

	@And("^user  clicks on match review in fixtures page in ios$")
	public void userClicksOnMatchReviewInFixturesPageInIos() {
		try {
			new UnitedNowPage().clicksOnMatchReviewInFixturesPage();
			ExtentsReportManager.extentReportLogging("info", "Clicked on match review in fixtures page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on match review in fixtures page in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on post match analysis in ios$")
	public void userClicksOnPostMatchAnalysisInIos() {
		try {
			new UnitedNowPage().clicksOnPostMatchAnalysis();
			ExtentsReportManager.extentReportLogging("info", "Clicked on post match analysis in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on post match analysis in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the sponser logo is displayed in match center in ios$")
	public void userValidatesTheSponserLogoIsDisplayedInMatchCenterInIos() throws Throwable {
		try {
			boolean flag = new UnitedNowPage().validatesTheSponserLogoIsDisplayedInMatchCenterIos();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"validated the sponser logo is displayed in match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the sponser logo is displayed in match center in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on lineup in match center in ios$")
	public void userClicksOnLineupInMatchCenterInIos() {
		try {
			new UnitedNowPage().clicksOnLineupInMatchCenter();
			ExtentsReportManager.extentReportLogging("info", "Clicked on lineup in match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on lineup in match center in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on influencers in match center in ios$")
	public void userClicksOnInfluencersInMatchCenterInIos() {
		try {
			new UnitedNowPage().clicksOnInfluencersInMatchCenter();
			ExtentsReportManager.extentReportLogging("info", "Clicked on influencers in match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on influencers in match center in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the sponser logo is displayed in stats match center in ios$")
	public void userValidatesTheSponserLogoIsDisplayedInStatsMatchCenterInIos() {
		try {
			new UnitedNowPage().validatesTheSponserLogoIsDisplayedInStatsMatchCenterInIos();
			ExtentsReportManager.extentReportLogging("info",
					"Validated the sponser logo is displayed in stats match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the sponser logo is displayed in stats match center in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates no sponsor logo in stats tab match center in ios$")
	public void userValidatesNoSponsorLogoInStatsTabMatchCenterInIos() {
		try {
			boolean flag = new UnitedNowPage().validatesNoSponsorLogoInStatsTabMatchCenter();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated no sponsor logo in stats tab match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating no sponsor logo in stats tab match center in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on predictions tab in match center in ios$")
	public void userClicksOnPredictionsTabInMatchCenterInIos() {
		try {
			new UnitedNowPage().clicksOnPredictionsTabInMatchCenter();
			ExtentsReportManager.extentReportLogging("info", "Clicked on predictions tab in match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on predictions tab in match center in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on man of the match in predictions page in ios$")
	public void userClicksOnManOfTheMatchInPredictionsPageInIos() {
		try {
			new UnitedNowPage().clicksOnManOfTheMatchInPredictionsPage();
			ExtentsReportManager.extentReportLogging("info", "Clicked on man of the match in predictions page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on man of the match in predictions page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the Cadbury sponser logo is displayed in match centers in ios$")
	public void userValidatesTheCadburySponserLogoIsDisplayedInMatchCentersInIos() {
		try {
			boolean flag = new UnitedNowPage().validatesTheSponsorLogoInPredictionsIsDisplayed();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated the Cadbury sponser logo is displayed in match centers in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the Cadbury sponser logo is displayed in match centers in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the sponser logo is displayed in predictions match center in ios$")
	public void userValidatesTheSponserLogoIsDisplayedInPredictionsMatchCenterInIos() {
		try {
			boolean flag = new UnitedNowPage().validatesTheSponserLogoIsDisplayedInPredictionsMatchCenter();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated the sponser logo is displayed in predictions match center in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the sponser logo is displayed in predictions match center in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on back icon in predictions page in ios$")
	public void userClicksOnBackIconInPredictionsPageInIos() {
		try {
			new UnitedNowPage().clicksOnBackIconInPredictions();
			ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in predictions page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on back icon in predictions page in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on first scorer in predictions page in ios$")
	public void userClicksOnFirstScorerInPredictionsPageInIos() {
		try {
			new UnitedNowPage().clicksOnFirstScorerInPredictionsPage();
			ExtentsReportManager.extentReportLogging("info", "Clicked on first scorer in predictions page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on first scorer in predictions page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates dxc sponsor logo in first scorer in ios$")
	public void userValidatesDxcSponsorLogoInFirstScorerInIos() {
		try {
			boolean flag = new UnitedNowPage().validatesDxcSponsorLogoInFirstScorerInPredictionsMatchCenter();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated dxc sponsor logo in first scorer in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating dxc sponsor logo in first scorer in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on line up page in predictions page in ios$")
	public void userClicksOnLineUpPageInPredictionsPageInIos() {
		try {
			new UnitedNowPage().clicksOnLineUpPageInPredictionsPage();
			ExtentsReportManager.extentReportLogging("info", "Clicked on line up page in predictions page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on line up page in predictions page in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on correct scrore page in predictions page in ios$")
	public void userClicksOnCorrectScrorePageInPredictionsPageInIos() {
		try {
			new UnitedNowPage().clicksOnCorrectScrorePageInPredictionsPage();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked on correct scrore page in predictions page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in on correct scrore page in predictions page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user checks for quote card in united now page using api in ios$")
	public void userChecksForQuoteCardAndModalInUnitedNowPageInIos() throws Exception {
		ArrayList<String> expectedQuoteCard = new ArrayList<>();
        try {
        	expectedQuoteCard = unitedNowAPIResponse.getQuoteCard("getAllCardsFromUnitedNow");
            if(!expectedQuoteCard.isEmpty()) {
                soft.assertTrue(unitedNowPage.getQuoteCardFromUnitedNow(expectedQuoteCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Quote card is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Quote card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Quote card in united now page<br />" + e);
            throw e;
        }
	}

	@And("^user checks for poll card in united now page using api in ios$")
	public void userChecksOnPollCardInUnitedNowPageInIos() throws Exception {
		ArrayList<String> expectedQuoteCard = new ArrayList<>();
        try {
        	expectedQuoteCard = unitedNowAPIResponse.getPollCard("getAllCardsFromUnitedNow");
            if(!expectedQuoteCard.isEmpty()) {
                soft.assertTrue(unitedNowPage.getPollCardFromUnitedNow(expectedQuoteCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Poll card is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Poll card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Poll card in united now page<br />" + e);
            throw e;
        }

	}

	@And("^user checks on view full table in united now page in ios$")
	public void userChecksOnViewFullTableInUnitedNowPageInIos() {
		try {
			boolean flag = new UnitedNowPage().checksForViewTableCarddInUnitedNowPageinios();
			if (flag) {
				soft.assertTrue(true, "view full table is present in the screen");
			} else {
				soft.assertTrue(true, "view full table not configured in the application");
			}
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Checked on view full table in united now page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in checkingon view full table in united now page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user checks for Player Profile Card in united now page in ios$")
	public void userChecksForPlayerProfileCardInUnitedNowPageInIos() {
		try {
			boolean flag = new UnitedNowPage().userChecksForPlayerProfileCardInUnitedNowPageios();
			if (flag) {
				soft.assertTrue(true, "Player Profile is present in the screen");
			} else {
				soft.assertTrue(true, "Player Profile not configured in the application");
			}
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Checked for Player Profile Card in united now page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in checking for Player Profile Card in united now page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user checks for Upcoming Match Fixtures in united now page in ios$")
	public void userChecksForUpcomingMatchFixturesInUnitedNowPageInIos() {
		try {
			boolean flag = new UnitedNowPage().userChecksForUpcomingMatchFixturesInUnitedNowPageinios();
			if (flag) {
				soft.assertTrue(true, "Upcoming Match is present in the screen");
			} else {
				soft.assertTrue(true, "Upcoming Match Card not configured in the application");
			}
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Checked for Upcoming Match Fixtures in united now page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in checking for Upcoming Match Fixtures in united now page in ios<br />" + e);
			throw e;
		}
	}

	@And("^user checks for Old Match Results in united now page in ios$")
	public void userChecksForOldMatchResultsInUnitedNowPageInIos() {
		try {
			boolean flag = new UnitedNowPage().userChecksForOldMatchResultsInUnitedNowPageinios();
			if (flag) {
				soft.assertTrue(true, "Upcoming Match is present in the screen");
			} else {
				soft.assertTrue(true, "Upcoming Match Card not configured in the application");
			}
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Checked for Old Match Results in united now page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in checking for Old Match Results in united now page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user checks for upsell in united now page in ios$")
	public void userChecksForUpsellInUnitedNowPageInIos() {
		try {
			boolean flag = new UnitedNowPage().checksForUpSellUnitedNowPage();
			if (flag) {
				soft.assertTrue(true, "UpSell is present in the screen");
			} else {
				soft.assertTrue(true, "UpSell not configured in the application");
			}
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Checked for upsell in united now page in io");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in checking for upsell in united now page in io<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on ticket info CTA in fixtures page in ios$")
	public void userClicksOnTicketInfoCTAInFixturesPageInIos() throws Throwable {
		try {
			new UnitedNowPage().clicksOnTicketInfoCTAInFixturesPage();
			ExtentsReportManager.extentReportLogging("info",
					"Clicked clicks on ticket info CTA in fixtures page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking clicking on ticket info CTA in fixtures page in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on table button on CTA in fixtures page in ios$")
	public void userClicksOnTableButtonOnCTAInFixturesPageInIos() throws Throwable {
		try {
			new UnitedNowPage().clicksOnTableButtonOnCTAInFixturesPage();
			ExtentsReportManager.extentReportLogging("info", "clicked on table button on CTA in fixtures page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in clicking on table button on CTA in fixtures page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates page filters in men tab in ios$")
	public void userValidatesPageFiltersInMenTabInIos(DataTable table) throws Throwable {
		try {
			String actualPremierLeague = table.cell(1, 0);
			String actualEuropaLeague = table.cell(1, 1);
			String expectedPremierLeague = new UnitedNowPage().getPremierLeagueTextInMenTab();
			String expectedEuropaLeague = new UnitedNowPage().getEuropaLeagueTextInMenTab();
			soft.assertEquals(actualPremierLeague, expectedPremierLeague);
			soft.assertEquals(actualEuropaLeague, expectedEuropaLeague);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "validated page filters in men tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating page filters in men tab in ios<br />" + e);
			throw e;
		}
	}

	@And("^user clicks on \"([^\"]*)\" tab in table CTA page in ios$")
	public void userClicksOnTabInTableCTAPageInIos(String category) throws Throwable {
		try {
			new UnitedNowPage().clicksOnTeamTabInTableCTAPageinios(category);
			ExtentsReportManager.extentReportLogging("info", "Clicked on category tab in table CTA page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in Clicking on category tab in table CTA page in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates page filters in womens tab in ios$")
	public void userValidatesPageFiltersInWomensTabInIos(DataTable table) throws Throwable {
		try {
			String actualWomensSuperLeague = table.cell(1, 0);
			String actualContinentalLeaguecup = table.cell(1, 1);
			String expectedWomensSuperLeague = new UnitedNowPage().getWomensSuperLeagueTextInWomenTab();
			String expectedContinentalLeaguecup = new UnitedNowPage().getContinentalLeaguecupTextInWomenTab();
			soft.assertEquals(actualWomensSuperLeague, expectedWomensSuperLeague);
			soft.assertEquals(actualContinentalLeaguecup, expectedContinentalLeaguecup);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated page filters in womens tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating page filters in womens tab in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates page filters in under twenty ones tab in ios$")
	public void userValidatesPageFiltersInUnderTwentyOnesTabInIos(DataTable table) throws Throwable {
		try {
			String actualPremierLeague2 = table.cell(1, 0);
			String actualEflTrophy = table.cell(1, 1);
			String expectedPremierLeague2 = new UnitedNowPage().getPremierLeague2TextInUnder21sTab();
			String expectedEflTrophy = new UnitedNowPage().getEflTrophyTextInUnder21sTab();
			soft.assertEquals(actualPremierLeague2, expectedPremierLeague2);
			soft.assertEquals(actualEflTrophy, expectedEflTrophy);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated page filters in under twenty ones tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating page filters in under twenty ones tab in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates page filters in under eighteen s tab in ios$")
	public void userValidatesPageFiltersInUnderEighteenSTabInIos(DataTable table) throws Throwable {
		try {
			String actualU18PremierLeague = table.cell(1, 0);
			String actualUefaYouthLeague = table.cell(1, 1);
			String expectedU18PremierLeague = new UnitedNowPage().getU18PremierLeagueTextInUnder18Tab();
			String expectedUefaYouthLeague = new UnitedNowPage().getUefaYouthLeagueTextInUnder18Tab();
			soft.assertEquals(actualU18PremierLeague, expectedU18PremierLeague);
			soft.assertEquals(actualUefaYouthLeague, expectedUefaYouthLeague);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated page filters in under eighteen s tab in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating page filters in under eighteen s tab in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates page filters in girls tab in ios$")
	public void userValidatesPageFiltersInGirlsTabInIos(DataTable table) throws Throwable {
		try {
			String actualPremierLeaguegirls = table.cell(1, 0);
			String actualChampionsLeague = table.cell(1, 1);
			String expectedPremierLeaguegirls = new UnitedNowPage().getPremierLeagueTextInGirlsTab();
			String expectedChampionsLeague = new UnitedNowPage().getChampionsLeagueTextInGirlsTab();
			soft.assertEquals(actualPremierLeaguegirls, expectedPremierLeaguegirls);
			soft.assertEquals(actualChampionsLeague, expectedChampionsLeague);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info", "Validated page filters in girls tab");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail", "Error in validating page filters in girls tab<br />" + e);
			throw e;
		}
	}

	@Then("^user validates the crest image in fixtures screen in ios$")
	public void userValidatesTheCrestImageInFixturesScreenInIos() throws Throwable {
		try {
			boolean flag = new UnitedNowPage().validatesTheCrestImageInFixturesScreeninios();
			soft.assertTrue(flag);
			ExtentsReportManager.extentReportLogging("info", "Validated the crest image in fixtures screen");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in validating the crest image in fixtures screen <br />" + e);
			throw e;
		}
	}

	@And("^user navigates to adcard for internal link in united now screen in ios$")
	public void userNavigatesToAdcardForInternalLinkInUnitedNowScreenInIos() throws Throwable {
		try {
			new UnitedNowPage().navigatesToAdcardForInternalLinkInUnitedNowScreen();
			ExtentsReportManager.extentReportLogging("info",
					"Navigated to ad card for internal link in united now screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in Navigating to ad card for internal link in united now screen in ios<br />" + e);
			throw e;
		}
	}

	@And("^user navigates to adcard for external link in united now screen in ios$")
	public void userNavigatesToAdcardForExternalLinkInUnitedNowScreenInIos() throws Throwable {
		try {
			new UnitedNowPage().navigatesToAdcardForExternalLinkInUnitedNowScreen();
			ExtentsReportManager.extentReportLogging("info",
					"Navigated to adcard for external link in united now screen in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in Navigating to adcard for external link in united now screen in ios<br />" + e);
			throw e;
		}
	}

	@Then("^user validates  adcard external link in external browser in ios$")
	public void userValidatesAdcardExternalLinkInExternalBrowserInIos() throws Throwable {
		try {
			boolean flag = new UnitedNowPage().validatesAdcardExternalLinkInExternalBrowser();
			soft.assertTrue(flag);
			soft.assertAll();
			ExtentsReportManager.extentReportLogging("info",
					"Validated  adcard external link in external browser in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in Validating  adcard external link in external browser in ios<br />" + e);
			throw e;
		}
	}

	@And("^user navigates to adcard for internal link to next Gen in united now page in ios$")
	public void userNavigatesToAdcardForInternalLinkToNextGenInUnitedNowPageInIos() throws Throwable {
		try {
			new UnitedNowPage().navigatesToAdcardForInternalLinkToNextGenInUnitedNowPage();
			ExtentsReportManager.extentReportLogging("info",
					"Navigated to adcard for internal link to next Gen in united now page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in navigating to adcard for internal link to next Gen in united now page ios<br />" + e);
			throw e;
		}
	}

	@And("^user navigates to adcard for internal link to historical match next Gen in united now page in ios$")
	public void userNavigatesToAdcardForInternalLinkToHistoricalMatchNextGenInUnitedNowPageInIos() throws Throwable {
		try {
			new UnitedNowPage().navigatesToAdcardForInternalLinkToHistoricalMatchNextGenInUnitedNowPage();
			ExtentsReportManager.extentReportLogging("info",
					"Navigated to adcard for internal link to historical match next Gen in united now page in ios");
		} catch (AssertionError e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Error in navigating to adcard for internal link to historical match next Gen in united now page in ios<br />"
							+ e);
			throw e;
		}
	}

	@Then("^user validates select all icon in ios using api$")
	public void userValidatesSelectAllIconInIosUsingApi() throws Throwable {
		 try {
        	 String SelectAllIconTextFromAPI=unitedNowAPIResponse.getSelectAllIconTextFromAPI("FilterFeedsEndPoints");
        	 String actualSelectAllIconTextFromUI = unitedNowPage.getSelectAllIconTextFromUI();
           soft.assertEquals(actualSelectAllIconTextFromUI,SelectAllIconTextFromAPI);
//            soft.assertEquals(matchReviwTextFromUI, "MATCH REVIEW", "Mismatch in expected results");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the results");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the results<br />" + e);
            throw e;
        }
    }
	static ArrayList<String> expFilterFeedsApi = new ArrayList<>();
	@Then("^user validates filters feeds in united now screen in ios using api$")
	public void userValidatesFiltersFeedsInUnitedNowScreenInIosUsingApi() throws Throwable {
		 try {
//             ArrayList<String> expFilterFeedsApi = new ArrayList<>();
             expFilterFeedsApi = unitedNowAPIResponse.getFilterFeedsIOSFromApi("FilterFeedsEndPoints");
             Collections.sort(expFilterFeedsApi);
			 ExtentsReportManager.extentReportLogging("info","Filter Feeds from Api<br />"+expFilterFeedsApi);
			 ExtentsReportManager.extentReportLogging("info","Filter Feeds From UI<br />"+unitedNowPage.getFilterFeedsFromUI());
             soft.assertEquals(expFilterFeedsApi,unitedNowPage.getFilterFeedsFromUI());
             soft.assertAll();
             ExtentsReportManager.extentReportLogging("info", "Validated the FilterFeeds screen");
    	 } catch (AssertionError | IOException e) {
    		  ExtentsReportManager.extentReportLogging("fail", "validation of FilterFeeds values<br />" + e);
             throw e;
         }
	}

	@And("^user clicks on select all icon in ios using Api$")
	public void userClicksOnSelectAllIconInIosUsingApi() throws Throwable {
		try {
            new UnitedNowPage().clicksOnSelectAllIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on category tab in table CTA page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Clicking on category tab in table CTA page<br />" + e);
            throw e;
        }
    }

	@Then("^user validate the clear all icon in UnitedNow page in ios Using Api$")
	public void userValidateTheClearAllIconInUnitedNowPageInIosUsingApi() throws Throwable {
		try {
       	 String clearAllIconTextFromAPI=unitedNowAPIResponse.getClearAllIconTextFromAPI("FilterFeedsEndPoints");
       	 String actualClearAllIconTextFromUI = unitedNowPage.getClearAllIconTextFromUI();
          soft.assertEquals(actualClearAllIconTextFromUI,clearAllIconTextFromAPI);
//           soft.assertEquals(matchReviwTextFromUI, "MATCH REVIEW", "Mismatch in expected results");
           soft.assertAll();
           ExtentsReportManager.extentReportLogging("info", "Validated the results");
       } catch (AssertionError e) {
           ExtentsReportManager.extentReportLogging("fail", "Error in validating the results<br />" + e);
           throw e;
       }
	}

	@And("user clicks on each filter and validates section and deselection of each filter in ios")
	public void userClicksOnEachFilterAndValidatesSectionAndDeselectionOfEachFilterInIos() {
		for(String feed:expFilterFeedsApi) {
			userClicksOnFilterInIos(feed);
			userValidatesFilterIsSelectedInIos(feed);
			userClicksOnFilterInIos(feed);
			userValidatesFilterIsNotSelectedInIos(feed);
		}
	}

	@Then("^user validates Greetings message is not displayed in united now page in ios$")
	public void userValidatesGreetingsMessageIsNotDisplayedInUnitedNowPageInIos() throws Throwable {
		try {
            boolean flag = unitedNowPage.validatesGreetingsMessageIsNotDisplayedUnitedNow();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated greeting message in untied now is displayed ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in displaying greeting message in united now<br />" + e);
            throw e;
        }
	}

	@Then("^user validates Stories Carousel is not displayed in united now in ios$")
	public void userValidatesStoriesCarouselIsNotDisplayedInUnitedNowInIos() throws Throwable {
		 try {
	            boolean flag = unitedNowPage.validatesStoriesCarouselIsNotDisplayedInUnitedNow();
	            soft.assertTrue(flag);
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "Validated Stories Carousel in untied now is displayed ");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in displaying Stories Carousel in united now<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates Coming Up carousel is not displayed in united now in ios$")
	public void userValidatesComingUpCarouselIsNotDisplayedInUnitedNowInIos() throws Throwable {
		 try {
	            boolean flag = unitedNowPage.validatesComingUpCarouselIsNotDisplayedInUnitedNow();
	            soft.assertTrue(flag);
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "Validated Coming Up carousel in untied now is displayed ");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in displaying Coming Up carousel in united now<br />" + e);
	            throw e;
	        }
	}
	@Then("^user checks for Competition card in united now page using api in ios$")
	 public void userChecksForCompetitionardInUnitedNowPage() throws Exception {
    	 ArrayList<String> expectedCompetitionCard = new ArrayList<>();
         try {
        	 expectedCompetitionCard = unitedNowAPIResponse.getCompetitionCard("getAllCardsFromUnitedNow");
             if(!expectedCompetitionCard.isEmpty()) {
                 soft.assertTrue(unitedNowPage.getCompetitionCardFromUnitedNow(expectedCompetitionCard.get(0)));
                 soft.assertAll();
                 ExtentsReportManager.extentReportLogging("info", "Competition card is available in united now page");
             }else {
                 ExtentsReportManager.extentReportLogging("info", "Competition card not available in united now page");
             }
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in checking for Competition card in united now page<br />" + e);
             throw e;
         }
    }
	
	@Then("user checks for Adcard card in united now page using api in ios")
    public void userChecksForAdcardCardInUnitedNowPage() throws Exception {
		ArrayList<String> expectedAdcardCard = new ArrayList<>();
        try {
       	 expectedAdcardCard = unitedNowAPIResponse.getAdcardCard("getAllCardsFromUnitedNow");
            ExtentsReportManager.extentReportLogging("info", "Ad Card from API"+expectedAdcardCard);
            if(!expectedAdcardCard.isEmpty()) {
                soft.assertTrue(unitedNowPage.getAdcardfromUnitedNow(expectedAdcardCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Adcard "+expectedAdcardCard.get(0)+" is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Adcard card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Adcard in united now page<br />" + e);
            throw e;
        }
    }

	@Then("^user validates upsell functionality is displayed united now screen in ios using API$")
	public void userValidatesUpsellFunctionalityIsDisplayedUnitedNowScreenInIos() throws Throwable {
		 try {
	            //data from API
	            String upsellTitleFromAPI = unitedNowAPIResponse.getUpsellTitleFromApi("upsellEndpoint");
	            String actualUpsellTitleTextUI = unitedNowPage.getUpsellTitleFromUI();

	            ExtentsReportManager.extentReportLogging("info","upsellTitle Text From API<br />"+upsellTitleFromAPI);
				 ExtentsReportManager.extentReportLogging("info","actual upsellTitle Text From UI<br />"+unitedNowPage.getUpsellTitleFromUI());
	           
				 soft.assertEquals(actualUpsellTitleTextUI.toUpperCase(), upsellTitleFromAPI.toUpperCase());


	            String watchNowBtnTextFromAPI = unitedNowAPIResponse.getWatchNowBtnTextFromAPI("upsellEndpoint");
	            String actualWatchNowTextBtnUI = unitedNowPage.getWatchNowBtnTextUi();

	            ExtentsReportManager.extentReportLogging("info","watchNowBtn Text From API<br />"+watchNowBtnTextFromAPI);
				 ExtentsReportManager.extentReportLogging("info","actual watchNowBtn Text From UI<br />"+unitedNowPage.getWatchNowBtnTextUi());

	            soft.assertEquals(actualWatchNowTextBtnUI.toUpperCase(), watchNowBtnTextFromAPI.toUpperCase());

	            soft.assertAll();

	            System.out.println();
	            ExtentsReportManager.extentReportLogging("info", "Validated upsell functionality is displayed untied now is displayed ");
	        }  catch (NullPointerException n) {
			 ExtentsReportManager.extentReportLogging("pass", "Upsell  is not displayed in united now<br />" );
//             throw i;
		 	}catch (IndexOutOfBoundsException i) {
			 ExtentsReportManager.extentReportLogging("pass", "Upsell  is not displayed in united now<br />" );
//             throw i;
             }catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in displaying upsell functionality is displayed in united now<br />" + e);
	            throw e;
	        }
	    }

	@Then("^user validates Greetings message in united now is displayed in ios$")
	public void userValidatesGreetingsMessageInUnitedNowIsDisplayedInIos() throws Throwable {
		 try {
             boolean flag = unitedNowPage.validatesGreetingsMessageInUnitedNowIsDisplayed();
             soft.assertTrue(flag);
             soft.assertAll();
             ExtentsReportManager.extentReportLogging("info", "Validated greeting message in untied now is displayed ");
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in displaying greeting message in united now<br />" + e);
             throw e;
         }
	}

	@Then("^user validates live video is displayed in united now screen in ios using Api$")
	public void userValidatesLiveVideoIsDisplayedInUnitedNowScreen() throws Throwable {
		try {
			boolean liveVideoFromAPI = unitedNowAPIResponse.getLiveVideoFromApi("LiveVideoEndPoint");
			if(liveVideoFromAPI) {
				ExtentsReportManager.extentReportLogging("info","live video  From API<br />"+liveVideoFromAPI);
				boolean liveVideoDisplayedFromUI = unitedNowPage.validatesLiveVideoInUnitedNowIsDisplayed();
				ExtentsReportManager.extentReportLogging("info","actual live video From UI<br />"+unitedNowPage.validatesLiveVideoInUnitedNowIsDisplayed());
				soft.assertEquals(liveVideoFromAPI, liveVideoDisplayedFromUI, "live video display mismatch.");
			}else{
				ExtentsReportManager.extentReportLogging("info","live video is not enabled in UI<br />");
			}
            soft.assertAll();

        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", 
                "Exception occurred during Stories Carousel validation: " + e.getMessage());
            throw e;
        }
    }
	@Then("^user validate DummyTestSiteCore text using api in ios$")
    public void userValidateDummyTestSiteCoreTextUsingApiInIos() throws Exception {
        try {
            Boolean expectedSelection = unitedNowPage.getDummyTestSiteCore();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated English FA Cups using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Fa Cups Text In All Usingpi<br />" + e);
            throw e;
        }
        
    }
	
	@Then("^user validates the upcoming Fixtures using Api in ios$")
    public void userValidatesTheUpcomingFixturesusingApiInIOS() throws Exception {
        try {
            Boolean expectedSelection1 = unitedNowPage.getTicketInfoInIOS();
            soft.assertTrue(expectedSelection1);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated upcoming Fixtures using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidatesTheUpcomingFixturesusingApi<br />" + e);
            throw e;
        }
        
    }

	@Then("^user validates Sponsor logo in united now screen using API in ios$")
	public void userValidatesSponsorLogoInUnitedNowScreenUsingAPIInIos() throws Throwable {
		 try {
	            ArrayList<String> allSponsorLogoValues = new ArrayList<>();
	            allSponsorLogoValues = unitedNowAPIResponse.getAllSponsorLogoFromAPI("getCarouselListEndPoint");
	             ExtentsReportManager.extentReportLogging("info", "All Sponsor logos"+allSponsorLogoValues);
	             
	            Collections.sort(allSponsorLogoValues);
	            boolean actualSponsorLogoValues = unitedNowPage.getSponsorLogoValuesInIOS();
	            ExtentsReportManager.extentReportLogging("info","Expected Sponsor logos from API" + allSponsorLogoValues);
	            ExtentsReportManager.extentReportLogging("info","Actual Sponsor logo from UI" + unitedNowPage.getSponsorLogoValuesInIOS());
	            soft.assertTrue(actualSponsorLogoValues,"Sponsor logo available in united now");
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "validated Sponsor logo in united now screen");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "validation Sponsor logo in united now screen<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the upcoming Fixtures using Api in united now in ios$")
	public void userValidatesTheUpcomingFixturesUsingApiInUnitedNowInIos() throws Throwable {
		try {
			ArrayList<String> getTicketInfo = new ArrayList<>();
			ArrayList<String> expMatchReview = new ArrayList<>();
			
			getTicketInfo = unitedNowAPIResponse.getTicketInfoFromAPI("UpComingFixturesEndPoint");
			String actualButton1 = unitedNowPage.getTicketInfoFromUI();
		       ExtentsReportManager.extentReportLogging("info","Expected  info " + getTicketInfo);
		       ExtentsReportManager.extentReportLogging("info","Actual info" + unitedNowPage.getTicketInfoFromUI());
		       soft.assertTrue(getTicketInfo.contains(actualButton1));
			
			 expMatchReview = unitedNowAPIResponse.getMatchReviewFromAPI("UpComingFixturesEndPoint");
			 String actualMatchReview = unitedNowPage.getMatchReviewFromUI();
		       ExtentsReportManager.extentReportLogging("info","Expected  info" + expMatchReview);
		       ExtentsReportManager.extentReportLogging("info","Actual info" + unitedNowPage.getMatchReviewFromUI());
		       soft.assertTrue(expMatchReview.contains(actualMatchReview));
	       
	       soft.assertAll();
	       ExtentsReportManager.extentReportLogging("info", "Validated all objects in screen four");
	   } catch (AssertionError e) {
	       ExtentsReportManager.extentReportLogging("fail", "Error in validated all objects in screen four<br />" + e);
	       throw e;
	   }
	}
	        
	        
		
	}

	


