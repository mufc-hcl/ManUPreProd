package org.bdd.stepdef.android;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.pages.UnitedNowCardsPage;
import org.bdd.pages.UnitedNowPage;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.apiResponse.UnitedNowAPIResponse;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.reactivex.rxjava3.internal.operators.single.SingleFromUnsafeSource;

public class UnitedNowAndroidStepDef {
    public SoftAssert soft = new SoftAssert();
    public UnitedNowPage unitedNowPage = new UnitedNowPage();
    public UnitedNowCardsPage unitedNowCardsPage = new UnitedNowCardsPage();
    public UnitedNowAPIResponse unitedNowAPIResponse = new UnitedNowAPIResponse();

    private static final Logger log = LogManager.getLogger(UnitedNowPage.class);

//    @Then("user validates the current day and date")
//    public void userValidatesTheCurrentDayAndDate() {
//        try {
//            String actualDate = new Common().getDateAndDay();
//            String expectedDate = unitedNowPage.getCurrentDayANdDate();
//            soft.assertEquals(actualDate, expectedDate);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated current day and date");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating current day and date<br />" + e);
//            throw e;
//        }
//    }
    
    @Then("user validates the current day and date")
    public void userValidatesTheCurrentDayAndDate() {
        try {
            String actualDate = new Common().getDateAndDay();
            String expectedDate = unitedNowPage.getCurrentDayANdDate();
            soft.assertEquals(actualDate, expectedDate);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated current day and date");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating current day and date<br />" + e);
            throw e;
        }
    }

    @And("user click on filter icon")
    public void userClickOnFilterIcon() {
        try {
            unitedNowPage.clickFilterIcon1();
            ExtentsReportManager.extentReportLogging("info", "Clicked on filter icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter icon<br />" + e);
            throw e;
        }
    }

    @Then("user validates filter is not selected by default")
    public void userValidatesFilterIsNotSelectedByDefault() {
        try {
            Boolean expectedSelection = unitedNowPage.getFilterSelection();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated filter is not selected by default ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating filter is not selected by default<br />" + e);
            throw e;
        }
    }

    @And("user clicks on filter {string}")
    public void userClicksOnFilter(String filterFeed) {
        try {
            boolean expectedClick = unitedNowPage.clickFilterFeed(filterFeed);
            soft.assertTrue(expectedClick);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on filter feed: "+filterFeed);
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter feed:<br />" + e);
            throw e;
        }
    }

    @Then("user validates filter {string} is  selected")
    public void userValidatesFilterIsSelected(String filterFeed) {
        try {
            boolean expectedFilterSelection = unitedNowPage.validatesFilterIsSelected(filterFeed);
            soft.assertTrue(expectedFilterSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated filter feed "+filterFeed+" is selected ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating filter feed is selected<br />" + e);
            throw e;
        }
    }

    @Then("user validates filter {string} is  not selected")
    public void userValidatesFilterIsNotSelected(String filterFeed) {
        try {
            boolean expectedFilterSelection = unitedNowPage.validatesFilterIsNotSelected(filterFeed);
            soft.assertTrue(expectedFilterSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated filter feed "+filterFeed+" is not selected");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating filter feed is not selected<br />" + e);
            throw e;
        }
    }

    @And("^user click on calender icon$")
    public void userClickOnCalenderIcon() throws Exception {
        try {
            unitedNowPage.clickCalenderIconAnd();
            ExtentsReportManager.extentReportLogging("info", "Clicked on calendar icon ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on calender icon<br />" + e);
            throw e;
        }
    }

    @Then("^user navigates to fixtures screen and validate below three values$")
    public void userNavigatesToFixturesScreenAndValidateBelowThreeValues(DataTable table) {
        try {
            String expUnited = table.cell(1, 0);
            String expAllTeams = table.cell(1, 1);
//            String expMen = table.cell(1, 2);

            String actualUnited = unitedNowPage.getUnitedText();
            String actualAllTeams = unitedNowPage.getAllTeams();
            String actualMens = unitedNowPage.getMenText();
            soft.assertEquals(actualUnited, expUnited);
            soft.assertEquals(actualAllTeams, expAllTeams);
//            soft.assertEquals(actualMens, expMen);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Navigated to fixtures screen and validated the values");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to fixtures screen and validating the values <br />" + e);
            throw e;
        }
    }

    @And("^user click on men drop down and validates the dropdown values using API$")
    public void userClickOnMenDropDownAndValidatesTheDropdownValues() throws IOException {
        try {
            unitedNowPage.clickMenDropDown();
            ArrayList<String> expectedMenDropdownValues = new ArrayList<>();
            expectedMenDropdownValues = unitedNowAPIResponse.getDropDownValuesFromApi("calendarDropDownEndpoint");
            soft.assertEquals(expectedMenDropdownValues, unitedNowPage.getMenDropDownValues());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on Mens drop down and validated the dropdown values");

        } catch (AssertionError | IOException e) {
            ExtentsReportManager.extentReportLogging("fail", "Clicks on Mens drop down and error in validation of dropdown values<br />" + e);
            throw e;
        }

    }

    @And("^user clicks Three dots icon$")
    public void userClicksThreeDotsIcon() {
        try {
            unitedNowPage.clickOnThreeDotsIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked three dots icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking three dots icon <br />" + e);
            throw e;
        }
    }

    @Then("^user validates the following leagues using Api$")
    public void userValidatesTheFollowingLeagues() throws Exception {
        try {
            ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            List<String> actualDropDownValues = unitedNowPage.getLeagueFilterRadioBtnValues();
            Collections.sort(allLeagueFiltersDropDownValues);
            Collections.sort(actualDropDownValues);

            log.info("Expected All league filters from API" + allLeagueFiltersDropDownValues);
            log.info("Actual All league filters from UI" + unitedNowPage.getLeagueFilterRadioBtnValues());
            
            soft.assertEquals(allLeagueFiltersDropDownValues, actualDropDownValues);
            soft.assertAll();
            
            ExtentsReportManager.extentReportLogging("info", "Validated the FilterFeeds screen");
        } catch (AssertionError | IOException e) {
            ExtentsReportManager.extentReportLogging("fail", "validation of FilterFeeds values<br />" + e);
            throw e;
        }
    }


    @And("^user select first radio option and validate content in the body$")
    public void userSelectFirstRadioOptionAndValidateContentInTheBody() throws Throwable {
        try {
        	ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            boolean flag = unitedNowPage.clickingRadioButtonAndValidateContentInBodyOne(allLeagueFiltersDropDownValues);
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked the filter in united now calendar screen and validating content in the body");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter in united now and content mismatch<br />" + e);
            throw e;
        }

    }
    
    @And("^user select secound radio option and validate content in the body$")
    public void userSelectSecoundRadioOptionAndValidateContentInTheBody() throws Throwable {
        try {
        	ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag = unitedNowPage.clickingRadioButtonAndValidateContentInBodyTwo(allLeagueFiltersDropDownValues);
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked the filter in united now calendar screen and validating content in the body");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter in united now and content mismatch<br />" + e);
            throw e;
        }

    }
    
    @And("^user select third radio option and validate content in the body$")
    public void userSelectThirdRadioOptionAndValidateContentInTheBody() throws Throwable {
        try {
        	ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag = unitedNowPage.clickingRadioButtonAndValidateContentInBodyThree(allLeagueFiltersDropDownValues);
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked the filter in united now calendar screen and validating content in the body");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter in united now and content mismatch<br />" + e);
            throw e;
        }

    }
    
    @And("^user select fourth radio option and validate content in the body$")
    public void userSelectFourthRadioOptionAndValidateContentInTheBody() throws Throwable {
        try {
        	ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag = unitedNowPage.clickingRadioButtonAndValidateContentInBodyFour(allLeagueFiltersDropDownValues);
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked the filter in united now calendar screen and validating content in the body");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter in united now and content mismatch<br />" + e);
            throw e;
        }

    }
    
    @And("^user select fifth radio option and validate content in the body$")
    public void userSelectFifthRadioOptionAndValidateContentInTheBody() throws Throwable {
        try {
        	ArrayList<String> allLeagueFiltersDropDownValues = new ArrayList<>();
            allLeagueFiltersDropDownValues = unitedNowAPIResponse.getAllLeaguesFromApinew("AllLeagueFiltersEndpoint");
            unitedNowPage.clickOnThreeDotsIcon();
            boolean flag = unitedNowPage.clickingRadioButtonAndValidateContentInBodyFive(allLeagueFiltersDropDownValues);
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked the filter in united now calendar screen and validating content in the body");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter in united now and content mismatch<br />" + e);
            throw e;
        }

    }
    
    @And("^user clicks the following filter in UnitedNow Calender screen$")
    public void userClicksTheFollowingFilterInUnitedNowCalenderScreen(DataTable table) throws Throwable {
        try {
            unitedNowPage.clickOnTheGivenFilter(table.cell(1, 0));
            ExtentsReportManager.extentReportLogging("info", "Clicked the filter in united now calendar");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking filter in united now<br />" + e);
            throw e;
        }

    }

    @And("user clicks all radio button and validates leagues displayed")
    public void userClicksAllRadioButtonAndValidatesLeaguesDisplayed() {
        try {
            boolean flag = unitedNowPage.validateLeaguesDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked all radio button and validated leagues displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking all radio button and validating league is displayed or not<br />" + e);
            throw e;
        }
    }

    @Then("user validates the filtered league")
    public void userValidatesTheFilteredLeague(DataTable table) {
        try {
            boolean flag = unitedNowPage.validatefilteredLeague(table.cell(1, 0));
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the filter league");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating filter league<br />" + e);
            throw e;
        }
    }

    @Then("user validates the upcoming Fixtures")
    public void userValidatesTheUpcomingFixtures(DataTable table) throws Exception {
//        try {
//            //data from API
//            String dateTBCFromAPI = unitedNowAPIResponse.getDateTBCTextFromAPI("UpComingFixturesEndPoint");
//            String actualDateTBCTextUI = unitedNowPage.getDateTBCUpcomingFixturesUi();
//
//            System.out.println("dateTBCFromAPI++++++" + dateTBCFromAPI);
//            System.out.println("actualDateTBCTextUI----------" + unitedNowPage.getDateTBCUpcomingFixturesUi());
//
//            soft.assertEquals(actualDateTBCTextUI.toUpperCase(), dateTBCFromAPI.toUpperCase());
//
//
//            String ticketInfoFromAPI = unitedNowAPIResponse.getTicketInfoTextFromAPI("UpComingFixturesEndPoint");
//            String actualTicketInfoUI = unitedNowPage.getTicketInfoUpcomingFixturesUi();
//
//            System.out.println("ticketInfoFromAPI++++++" + ticketInfoFromAPI);
//            System.out.println("actualTicketInfoUI----------" + unitedNowPage.getTicketInfoUpcomingFixturesUi());
//
//            soft.assertEquals(actualTicketInfoUI.toUpperCase(), ticketInfoFromAPI.toUpperCase());
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated upcoming Fixtures ");
//
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating upcoming Fixtures <br />" + e);
//            throw e;
//        }
        try {
           boolean flag = unitedNowPage.validateUpcomingFixtures(table.cell(1, 0));
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated upcoming fixtures");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating upcoming fixtures<br />" + e);
            throw e;
        }
    }


//

    @Then("user validates the results using api")
    public void userValidatesTheResults() throws Exception {
        try {
            String matchReviwTextFromAPI = unitedNowAPIResponse.getContenttypeMatchResultsApi("MatchReviewEndPoint");
            String actualMatchReviwTextFromUI = unitedNowPage.validateUpcomingResults();

            soft.assertEquals(actualMatchReviwTextFromUI, matchReviwTextFromAPI);
//            soft.assertEquals(matchReviwTextFromUI, "MATCH REVIEW", "Mismatch in expected results");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the results");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the results<br />" + e);
            throw e;
        }
    }

    @And("user clicks on results icon in the united now screen")
    public void userClicksOnResultsIconInTheUnitedNowScreen() {
        try {
            unitedNowPage.clickOnResults();
            ExtentsReportManager.extentReportLogging("info", "Clicked on results icon in united now screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking results icon in united now screen <br />" + e);
            throw e;
        }
    }

    @And("user clicks on table icon from any scheduled match")
    public void userClicksOnTableIconFromAnyScheduledMatch() {
        try {
            unitedNowPage.clicksOnTableIconFromAnyScheduledMatch();
            unitedNowPage.clicksOnTableCTAInFixuturesPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on table icon from any scheduled match");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on table icon from any scheduled match<br />" + e);
            throw e;
        }
    }

    @Then("user validates the Men match schedule using API")
    public void userValidatesTheMenMatchSchedule() throws Exception {
        try {

        	ArrayList<String> expPremierLeagueFromAPI = new ArrayList<>();
        	ArrayList<String> expEuropaLeagueFromAPI = new ArrayList<>();

        	String actualPremierLeagueTextUI = unitedNowPage.getMenLeague1Text();
        	String actualEuropaLeagueUI = unitedNowPage.getMenLeague2Text();
        	
            expPremierLeagueFromAPI = unitedNowAPIResponse.getPremierLeagueFromApi("MenUpcomingFixturesEndpoints",actualPremierLeagueTextUI);
            expEuropaLeagueFromAPI = unitedNowAPIResponse.getEuropaLeagueFromAPI("MenUpcomingFixturesEndpoints", actualEuropaLeagueUI);
            
            
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


    @And("user selects {string} from the dropdown")
    public void userSelectsFromTheDropdown(String value) {
        try {
            unitedNowPage.selectCategoryFromDropDown(value);
            ExtentsReportManager.extentReportLogging("info", "Selects values from drop down");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in selecting values from drop down<br />" + e);
            throw e;
        }
    }

    @Then("user validates the Women match schedule using API")
    public void userValidatesTheWomenMatchSchedule() throws Exception {
        try {

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

    @Then("user validates the under twenty one match schedule using API")
    public void userValidatesTheUnderTwentyOneMatchSchedule() throws Exception {
        try {
        	
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


    @Then("user validates the under eighteen match schedule using API")
    public void userValidatesTheUnderEighteenMatchSchedule() throws Exception {
        try {
        	
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
    
    @Then("user validates the under gitls match schedule using API")
    public void userValidatesTheUnderGirlsMatchSchedule() throws Exception {
        try {
        	
        	ArrayList<String> expEnglishPGAU16WomensCupFromAPI = new ArrayList<>();
        	ArrayList<String> expEnglishWomensSuperLeagueFromAPI = new ArrayList<>();
        	
        	expEnglishPGAU16WomensCupFromAPI = unitedNowAPIResponse.getEnglishPGAU16WomensCupFromAPI("GirlsUpcomingFixturesEndpoints");
        	expEnglishWomensSuperLeagueFromAPI = unitedNowAPIResponse.getEnglishWomensSuperLeagueFromAPI("GirlsUpcomingFixturesEndpoints");
            
            
            String actEnglishPGAU16WomensCupTextUI = unitedNowPage.getEnglishPGAU16WomensCupText();
            String actuaEnglishWomensSuperLeagueUI = unitedNowPage.getEnglishWomensSuperLeagueCupText();

            ExtentsReportManager.extentReportLogging("info","u18PremierLeagueFromAPI  From API<br />"+expEnglishPGAU16WomensCupFromAPI.get(0));
			ExtentsReportManager.extentReportLogging("info","actual actuaU18PremierLeagueTextUI From UI<br />"+unitedNowPage.getUnder18League1Text());

            ExtentsReportManager.extentReportLogging("info","uefaYouthLeagueFromAPI  From API<br />"+expEnglishWomensSuperLeagueFromAPI.get(0));
            ExtentsReportManager.extentReportLogging("info","actual actualUEFAYouthLeagueUI From UI<br />"+unitedNowPage.getUnder18League2Text());

            soft.assertEquals(actEnglishPGAU16WomensCupTextUI.toUpperCase(), expEnglishPGAU16WomensCupFromAPI.get(0).toUpperCase());
            soft.assertEquals(actuaEnglishWomensSuperLeagueUI.toUpperCase(), expEnglishWomensSuperLeagueFromAPI.get(0).toUpperCase());
            soft.assertAll();

            ExtentsReportManager.extentReportLogging("info", "Validated girls match schedule");
            
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating Girls match schedule <br />" + e);
            throw e;
        }
    }


    @And("user clicks the player icon in united now screen")
    public void userClicksThePlayerIconInUnitedNowScreen() throws InterruptedException {
        try {
            unitedNowPage.clicksThePlayerIconInUnitedNowScreen();
            ExtentsReportManager.extentReportLogging("info", "Clicked the player icon in united now screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking players icon in united now screen<br />" + e);
            throw e;
        }
    }

    @Then("user validates the Players filter items in the players screen using Api")
    public void userValidatesTheFollowingFilterInThePlayersScreen() throws Exception {
        try {
            ArrayList<String> expPlayersPageFilters = new ArrayList<>();
            expPlayersPageFilters = unitedNowAPIResponse.getPlayersPageFilterFromApi("PlayersPageFiltersEndpoint");
            expPlayersPageFilters.removeAll(Collections.singleton(null));
           
            System.out.println("expPlayersPageFilters+++++++++++"+expPlayersPageFilters);
            ArrayList<String> actPlayersPageFillers = unitedNowPage.getPlayersFiltersPageUI();
            System.out.println("actPlayersPageFillers------------"+actPlayersPageFillers);
            Collections.sort(expPlayersPageFilters);
            Collections.sort(actPlayersPageFillers);
            soft.assertTrue(actPlayersPageFillers.containsAll(expPlayersPageFilters) ,expPlayersPageFilters.toString()+ " Expected player items not matched with actual player items "+actPlayersPageFillers.toString());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the PlayersPageFilters screen");
        } catch (AssertionError | IOException e) {
            ExtentsReportManager.extentReportLogging("fail", "validation of PlayersPageFilters values<br />" + e);
            throw e;
        }

    }

    @And("user clicks player from {string} tab")
    public void userClicksPlayerFromTab(String category) {
        try {
            unitedNowPage.clicksPlayerFromTab(category);
            ExtentsReportManager.extentReportLogging("info", "Clicked players from category tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking players from category tab<br />" + e);
            throw e;
        }
    }

    @Then("verify profile and stats tab are displayed")
    public void verifyProfileAndStatsTabAreDisplayed() throws Exception {
        try {
            unitedNowPage.getProfileTab();
            unitedNowPage.getStatsTab();
            unitedNowPage.getProfileTab();
//        unitedNowPage.scrollToBioGraphy();
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in displaying profile and stats tab<br />" + e);
            throw e;
        }
    }

    @And("navigate to the latest section for the player")
    public void navigateToTheLatestSectionForThePlayer() {
        try {
//        unitedNowPage.getProfileTab();
            unitedNowPage.navigateToTheLatestSectionForThePlayer();
            ExtentsReportManager.extentReportLogging("info", "Navigated to the latest section for the players");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to the latest section for the players <br />" + e);
            throw e;
        }
    }

    @And("verify clicking on video or article navigates to the respective page")
    public void verifyClickingOnVideoOrArticleNavigatesToTheRespectivePage() {
        try {
            unitedNowPage.clickingOnVideoOrArticleNavigatesToTheRespectivePage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on video or article navigated to respective page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking video or article and navigating to respective page<br />" + e);
            throw e;
        }
    }

    @And("user clicks back icon")
    public void userClicksBackIcon() {
        try {
            unitedNowPage.userClicksBackIconInPlayesPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked back icon");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking back icon<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Greetings message in united now is displayed$")
    public void userValidatesGreetingsMessageInUnitedNowIsDisplayed() throws Exception {
    	 try {
             boolean flag = unitedNowPage.validatesGreetingsMessageInUnitedNowIsDisplayed();
             soft.assertTrue(flag);
             soft.assertAll();
             ExtentsReportManager.extentReportLogging("info", "Validated greeting message in united now is displayed ");
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in displaying greeting message in united now<br />" + e);
             throw e;
         }
    	
    }

    @Then("^user validates Stories Carousel in united now is displayed$")
    public void userValidatesStoriesCarouselInUnitedNowIsDisplayed() {
        try {
            unitedNowPage.validatesStoriesCarouselInUnitedNowIsDisplayed();
            ExtentsReportManager.extentReportLogging("info", "Validated stories carousel in united now is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in displaying stories carousel in united now<br />" + e);
            throw e;
        }
    }
    
    @Then("^user validates Stories Carousel in united now is displayed using API$")
    public void userValidatesStoriesCarouselInUnitedNowIsDisplayedAPI() throws Exception {
    	ArrayList<String> storiesCarouselFromAPI = new ArrayList<>();
        try {
        	storiesCarouselFromAPI = unitedNowAPIResponse.getStoriesCarouselTitles("StoriesCarousalEndPoint");
            ExtentsReportManager.extentReportLogging("info", "Story Carousel from API "+storiesCarouselFromAPI);
            if(!storiesCarouselFromAPI.isEmpty()) {
                soft.assertTrue(unitedNowPage.validatesStoriesCarouselInUNUI(storiesCarouselFromAPI.get(0),false, 20,"Story Carousel"));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Story Carousel is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Story Carousel is not available in united now page");
            }
  		
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", 
	                "Exception occurred during Stories Carousel validation: " + e.getMessage());
	            throw e;
    		}
    }
    	
    @Then("^user validates Coming Up carousel in united now is displayed using API$")
    public void userValidatesComingUpCarouselInUnitedNowIsDisplayed() throws Exception {
    	  try {
    	        boolean comingUpCarouselDisplayedFromAPI = unitedNowAPIResponse.getComingUpCarousalFromApi("ComingUp/StoriesCarousalEndPoint");
    	        boolean comingUpCarouselCarouselDisplayedFromUI = unitedNowPage.validatesTheCaroselPageIsDisplayed();

    	        ExtentsReportManager.extentReportLogging("info","ComingUp Carousel  From API<br />"+comingUpCarouselDisplayedFromAPI);
   			   ExtentsReportManager.extentReportLogging("info","actual ComingUp Carousel From UI<br />"+comingUpCarouselCarouselDisplayedFromUI);

    	        soft.assertEquals(comingUpCarouselCarouselDisplayedFromUI, comingUpCarouselDisplayedFromAPI, "Carousel display mismatch.");
    	        soft.assertAll();

    	        ExtentsReportManager.extentReportLogging("info", "Validated the carousel is displayed in United Now page.");
    	    } catch (Exception e) {
    	        ExtentsReportManager.extentReportLogging("fail", "Exception occurred during carousel validation: " + e.getMessage());
    	        throw e;
    	    }
    }
//    	
//        try {
//            boolean flag = unitedNowPage.validatesTheCaroselPageIsDisplayed();
//            soft.assertTrue(flag);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated the carousel page is displayed for carousel");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in validating carousel page is displayed for carousel <br />" + e);
//            throw e;
//        }
//    }

    @And("user clicks on the stories carousel")
    public void userClicksOnTheStoriesCarousel() {
        try {
            unitedNowPage.clicksOnTheStoriesCarousel();
            ExtentsReportManager.extentReportLogging("info", "Clicked on stories carousel");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking stories carousel<br />" + e);
            throw e;
        }
    }

    @Then("user validates the story page is displayed")
    public void userValidatesTheStoryPageIsDisplayed() {
        try {
            boolean flag = unitedNowPage.validatesTheStoryPageIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated story page is displayed");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in displaying story page <br />" + e);
            throw e;
        }
    }

    @And("user clicks on the coming up carousel")
    public void userClicksOnTheComingUpCarousel() {
        try {
            unitedNowPage.clicksOnTheComingUpCarousel();
            ExtentsReportManager.extentReportLogging("info", "Clicked on coming up carousel");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking coming up carousel <br />" + e);
            throw e;
        }
    }

    @Then("user validates the carosel page is displayed for the carousel")
    public void userValidatesTheCaroselPageIsDisplayedForTheCarousel() {
        try {
            boolean flag = unitedNowPage.validatesTheCaroselPageIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the carousel page is displayed for carousel");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating carousel page is displayed for carousel <br />" + e);
            throw e;
        }
    }

    @And("user clicks on continue in personal your experience popupwindow")
    public void userClicksOnContinueInPersonalYourExperiencePopupwindow() {
        try {
            unitedNowPage.clicksOnContinueInPersonlisePopUpWindow();
            ExtentsReportManager.extentReportLogging("info", "Clicked on continue in personal your experience popup window");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on continue in personal your experience pop up window<br />" + e);
            throw e;
        }
    }

    @And("user click on close in app myUnited popup")
    public void userClickOnCloseInAppMyUnitedPopup() {
        try {
            unitedNowPage.clicksOncloseInAppMyUnited();
            ExtentsReportManager.extentReportLogging("info", "CLicked on close in app my united popup ");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking close in app my united popup<br />" + e);
            throw e;
        }
    }

    @And("user clicks on rightArrow button in test slide up message")
    public void userClicksOnRightArrowButtonInTestSlideUpMessage() {
        try {
            unitedNowPage.rightArrowSlideup();
            ExtentsReportManager.extentReportLogging("info", "Clicked on right arrow button in test slide up message");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on right arrow button in test slide up message<br />" + e);
            throw e;
        }
    }


    @And("user clicks on united now in bottom tab")
    public void userClicksOnUnitedNowInBottomTab() {
        try {
            unitedNowPage.clicksOnUnitedNowInBottomTab();
            ExtentsReportManager.extentReportLogging("info", "Clicked on united now in bottom tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on united now in bottom tab<br />" + e);
            throw e;
        }
    }

    @And("user clicks on image popup button in top Braze in-app message 1 for logout user")
    public void userClicksOnImagePopupButtonInTop() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            ExtentsReportManager.extentReportLogging("info", "Clicked on image popup button in top braze in app message 1 for logout user");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking image popup in top braze message <br />" + e);
            throw e;
        }
    }

    @Then("^user validate audio button presented$")
    public void userValidateAudioButtonPresented() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            boolean flag = unitedNowPage.validateAudioButtonInUnitedNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated audio button presented");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating audio button presented<br />" + e);
            throw e;
        }

    }

    @And("^user validate video button presented$")
    public void userValidateVideoButtonPresented() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            boolean flag = unitedNowPage.validateVideoButtonInUnitedNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated video button presented");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating video button presented <br />" + e);
            throw e;
        }

    }

    @Then("^user validate text in live video section$")
    public void userValidateTextInLiveVideoSection(DataTable table) {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            String watchNow = table.cell(1, 0);
            String actualWatchNowText = unitedNowPage.getwatchNowtextInLiveVideoSection();
            soft.assertEquals(actualWatchNowText, watchNow);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated text in live video section");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating text in live video section<br />" + e);
            throw e;
        }
    }

    @Then("^user clicks on WatchNow button and live content$")
    public void userClicksOnWatchNowButtonAndLiveContent(DataTable table) {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            unitedNowPage.clicksWatchNowButton();
            String expectedlive = table.cell(1, 0);
            String actualLiveText = unitedNowPage.getLiveTestFromLiveVideo();
            soft.assertEquals(actualLiveText, expectedlive);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on watch now button and live content");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on watch now button and live content<br />" + e);
            throw e;
        }
    }

    @And("^user validate maximize button presented$")
    public void userValidateMaximizeButtonPresented() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            boolean flag = unitedNowPage.validatemaximizeButtonInUnitedNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated maximize button presented");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating maximize button presented<br />" + e);
            throw e;
        }

    }

    @And("^user validate pause button presented$")
    public void userValidatePauseButtonPresented() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            boolean flag = unitedNowPage.validatePauseButtonInUnitedNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated pause button presented");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating pause button presented <br />" + e);
            throw e;
        }

    }

    @And("^user clicks on pause and validate video stopped$")
    public void userClicksOnPauseAndValidateVideoStopped() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            unitedNowPage.userClicksOnPauseButton();
            boolean flag = unitedNowPage.validatePlayButtonInUnitedNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on pause and validate video stopped");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking pause and validating video stopped <br />" + e);
            throw e;
        }

    }

    @And("^user clicks on play and validate video started$")
    public void userClicksOnPlayAndValidateVideoStarted() {
        try {
            unitedNowPage.clicksOnImagePopUpWindowBrazeInappMessage1ForLogoutUser();
            unitedNowPage.userClicksOnPlayButton();
            boolean flag = unitedNowPage.validatePauseButtonInUnitedNowIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Clicked on play and validate video started");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating play and video started<br />" + e);
            throw e;
        }

    }

    @Then("user checks for Image card in united now page using api")
    public void userChecksForImageCardInUnitedNowPage() throws Exception {
        	 ArrayList<String> expectedImageCard = new ArrayList<>();
             try {
            	 expectedImageCard = unitedNowAPIResponse.getImageCard("getAllCardsFromUnitedNow");
                 ExtentsReportManager.extentReportLogging("info", "Image Card from API"+expectedImageCard);
                 if(!expectedImageCard.isEmpty()) {
                     soft.assertTrue(unitedNowPage.getImagefromUnitedNow(expectedImageCard.get(0)));
                     soft.assertAll();
                     ExtentsReportManager.extentReportLogging("info", "Image card "+expectedImageCard.get(0)+" is available in united now page");
                 }else {
                     ExtentsReportManager.extentReportLogging("info", "Image card  not available in united now page");
                 }
             } catch (AssertionError e) {
                 ExtentsReportManager.extentReportLogging("fail", "Error in checking for Competition card in united now page<br />" + e);
                 throw e;
             }
    }

    @Then("user checks for gallery card in united now page using api")
    public void userChecksForGalleryCardInUnitedNowPage() throws Exception {

    	 ArrayList<String> expectedGalleryCard = new ArrayList<>();
         try {
        	 expectedGalleryCard = unitedNowAPIResponse.getGalleryCard("getAllCardsFromUnitedNow");
             ExtentsReportManager.extentReportLogging("info", "Gallery Card from API  "+expectedGalleryCard);
             if(!expectedGalleryCard.isEmpty()) {
                 soft.assertTrue(unitedNowPage.getGalleryCardFromUnitedNow(expectedGalleryCard.get(0)));
            	 //soft.assertTrue(unitedNowPage.getActualCardFromUnitedNowUI(expectedGalleryCard.get(0),true, 30,"Gallery"));
                 soft.assertAll();
                 ExtentsReportManager.extentReportLogging("info", "Gallery card is available in united now page");
             }else {
                 ExtentsReportManager.extentReportLogging("info", "Gallery card not available in united now page");
             }
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in checking for Gallery card in united now page<br />" + e);
             throw e;
         }
    }

    @Then("user checks for video card in united now page using api")
    public void userChecksForVideoCardInUnitedNowPage() throws Exception {
        ArrayList<String> expectedVideoCard = new ArrayList<>();
        try {
            expectedVideoCard = unitedNowAPIResponse.getVideoCard("getAllCardsFromUnitedNow");
            ExtentsReportManager.extentReportLogging("info", "video Card from API"+expectedVideoCard);
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

    @Then("user checks for quiz card in united now page using api")
    public void userChecksForQuizCardInUnitedNowPage() throws Exception {
    	ArrayList<String> expectedQuizCard = new ArrayList<>();
        try {
            expectedQuizCard = unitedNowAPIResponse.getQuizCard("getAllCardsFromUnitedNow");
            ExtentsReportManager.extentReportLogging("info", "Quiz Card from API"+expectedQuizCard);
            if(!expectedQuizCard.isEmpty()) {
                soft.assertTrue(unitedNowPage.getQuizCardFromUnitedNow(expectedQuizCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Quiz card is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Quiz card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Quiz card in united now page<br />" + e);
            throw e;
        }
    	
    }

    @Then("user checks for stats card in united now page")
    public void userChecksForStatsCardInUnitedNowPage() {
        try {
            boolean flag = unitedNowPage.checksForStatsCardInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "Stats card is present in the screen");
            } else {
                soft.assertTrue(true, "Stats card not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for stats card in untied now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for stats card in united now page<br />" + e);
            throw e;
        }
    }

    @Then("user checks for collections card in united now page")
    public void userChecksForCollectionsCardInUnitedNowPage() {
        try {
            boolean flag = unitedNowPage.checksForCollectionsCardInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "Collections card is present in the screen");
            } else {
                soft.assertTrue(true, "Collections card not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for collections card in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for collections card in united now page<br />" + e);
            throw e;
        }
    }

    @And("^user navigates to adcard for internal link in united now screen$")
    public void userNavigatesToAdcardForInternalLinkInUnitedNowScreen() throws Throwable {
        try {
            new UnitedNowPage().navigatesToAdcardForInternalLinkInUnitedNowScreen();
            ExtentsReportManager.extentReportLogging("info", "Navigated to ad card for internal link in united now screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Navigating to ad card for internal link in united now screen<br />" + e);
            throw e;
        }
    }

    @And("^user navigates to adcard for external link in united now screen$")
    public void userNavigatesToAdcardForExternalLinkInUnitedNowScreen() throws Throwable {
        try {
            new UnitedNowPage().navigatesToAdcardForExternalLinkInUnitedNowScreen();
            ExtentsReportManager.extentReportLogging("info", "Navigated to adcard for external link in united now screen");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Navigating to adcard for external link in united now screen<br />" + e);
            throw e;
        }
    }

    @Then("^user validates  adcard external link in external browser$")
    public void userValidatesAdcardExternalLinkInExternalBrowser() throws Throwable {
        try {
            boolean flag = new UnitedNowPage().validatesAdcardExternalLinkInExternalBrowser();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated  adcard external link in external browser");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Validating  adcard external link in external browser<br />" + e);
            throw e;
        }
    }

    @And("^user navigates to adcard for internal link to next Gen in united now page$")
    public void userNavigatesToAdcardForInternalLinkToNextGenInUnitedNowPage() throws Throwable {
        try {
            new UnitedNowPage().navigatesToAdcardForInternalLinkToNextGenInUnitedNowPage();
            ExtentsReportManager.extentReportLogging("info", "Navigated to adcard for internal link to next Gen in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to adcard for internal link to next Gen in united now page<br />" + e);
            throw e;
        }
    }

    @And("^user navigates to adcard for internal link to historical match next Gen in united now page$")
    public void userNavigatesToAdcardForInternalLinkToHistoricalMatchNextGenInUnitedNowPage() {
        try {
            new UnitedNowPage().navigatesToAdcardForInternalLinkToHistoricalMatchNextGenInUnitedNowPage();
            ExtentsReportManager.extentReportLogging("info", "Navigated to adcard for internal link to historical match next Gen in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to adcard for internal link to historical match next Gen in united now page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Four Navigation items$")
    public void userValidatesFourNavigationItems(DataTable table) {
        try {
            String actualUnitedNowTab = table.cell(1, 0);
            String actualMutvTab = table.cell(1, 1);
            String actualShopTab = table.cell(1, 2);
            String actualMyUnitedTab = table.cell(1, 3);
            String expectedUnitedNowTab = new UnitedNowPage().getUnitedNowTab();
            String expectedMutvTab = new UnitedNowPage().getMutvTab();
            String expectedShopTab = new UnitedNowPage().getShopTab();
            String expectedMyUnitedTab = new UnitedNowPage().getMyUnitedTab();
            soft.assertEquals(actualUnitedNowTab, actualUnitedNowTab);
            soft.assertEquals(actualMutvTab, expectedMutvTab);
            soft.assertEquals(actualShopTab, expectedShopTab);
            soft.assertEquals(actualMyUnitedTab, expectedMyUnitedTab);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Navigated Four Navigation items");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating Four Navigation items<br />" + e);
            throw e;
        }

    }

    @And("^user navigates to previous match in fixtures page$")
    public void userNavigatesToPreviousMatchInFixturesPage() {
        try {
            new UnitedNowPage().navigatesToPreviousMatchInFixturesPage();
            ExtentsReportManager.extentReportLogging("info", "Navigated to previous match in fixtures page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in navigating to previous match in fixtures page<br />" + e);
            throw e;
        }
    }

    @And("^user  clicks on match review in fixtures page$")
    public void userClicksOnMatchReviewInFixturesPage() {
        try {
            new UnitedNowPage().clicksOnMatchReviewInFixturesPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on match review in fixtures page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on match review in fixtures page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on post match analysis$")
    public void userClicksOnPostMatchAnalysis() {
        try {
            new UnitedNowPage().clicksOnPostMatchAnalysis();
            ExtentsReportManager.extentReportLogging("info", "Clicked on post match analysis");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on post match analysis<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the sponser logo is displayed in match center$")
    public void userValidatesTheSponserLogoIsDisplayedInMatchCenter() {
        try {
            boolean flag = new UnitedNowPage().validatesTheSponserLogoIsDisplayedInMatchCenter();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the sponser logo is displayed in match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the sponser logo is displayed in match center<br />" + e);
            throw e;
        }
    }

    @Then("^user validates Four Navigation items after login$")
    public void userValidatesFourNavigationItemsAfterLogin(DataTable table) {
        try {
            String actualUnitedNowTab = table.cell(1, 0);
            String actualMutvTab = table.cell(1, 1);
            String actualShopTab = table.cell(1, 2);
            String actualMyUnitedTab = table.cell(1, 3);
            String expectedUnitedNowTab = new UnitedNowPage().getUnitedNowTab();
            String expectedMutvTab = new UnitedNowPage().getMutvTab();
            String expectedShopTab = new UnitedNowPage().getShopTab();
            String expectedMyUnitedTab = new UnitedNowPage().getMyUnitedTabAfterLogin();
            soft.assertEquals(actualUnitedNowTab, actualUnitedNowTab);
            soft.assertEquals(actualMutvTab, expectedMutvTab);
            soft.assertEquals(actualShopTab, expectedShopTab);
            soft.assertEquals(actualMyUnitedTab, expectedMyUnitedTab);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated  Four Navigation items after login");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating  Four Navigation items after login<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on lineup in match center$")
    public void userClicksOnLineupInMatchCenter() {
        try {
            new UnitedNowPage().clicksOnLineupInMatchCenter();
            ExtentsReportManager.extentReportLogging("info", "Clicked on lineup in match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on lineup in match center<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on influencers in match center$")
    public void userClicksOnInfluencersInMatchCenter() {
        try {
            new UnitedNowPage().clicksOnInfluencersInMatchCenter();
            ExtentsReportManager.extentReportLogging("info", "Clicked on influencers in match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on influencers in match center<br />" + e);
            throw e;
        }
    }

    @Then("^user validates no sponsor logo in stats tab match center$")
    public void userValidatesNoSponsorLogoInStatsTabMatchCenter() {
        try {
            boolean flag = new UnitedNowPage().validatesNoSponsorLogoInStatsTabMatchCenter();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validating no sponsor logo in stats tab match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating no sponsor logo in stats tab match center<br />" + e);
            throw e;
        }

    }

    @And("^user clicks on predictions tab in match center$")
    public void userClicksOnPredictionsTabInMatchCenter() {
        try {
            new UnitedNowPage().clicksOnPredictionsTabInMatchCenter();
            ExtentsReportManager.extentReportLogging("info", "Validating no sponsor logo in stats tab match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating no sponsor logo in stats tab match center<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the Cadbury sponsor logo in predictions page in match center$")
    public void userValidatesTheCadburySponsorLogoInPredictionsPageInMatchCenter() {
        try {
            boolean flag = new UnitedNowPage().validatesTheSponsorLogoInPredictionsIsDisplayed();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validating the Cadbury sponsor logo in predictions page in match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the Cadbury sponsor logo in predictions page in match center<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on man of the match in predictions page$")
    public void userClicksOnManOfTheMatchInPredictionsPage() {
        try {
            new UnitedNowPage().clicksOnManOfTheMatchInPredictionsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on man of the match in predictions page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on man of the match in predictions page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates the sponser logo is displayed in predictions match center$")
    public void userValidatesTheSponserLogoIsDisplayedInPredictionsMatchCenter() {
        try {
            boolean flag = new UnitedNowPage().validatesTheSponserLogoIsDisplayedInPredictionsMatchCenter();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validating the sponser logo is displayed in predictions match center");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the sponser logo is displayed in predictions match center<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on back icon in predictions page$")
    public void userClicksOnBackIconInPredictionsPage() {
        try {
            new UnitedNowPage().clicksOnBackIconInPredictions();
            ExtentsReportManager.extentReportLogging("info", "Clicked on back icon in predictions page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on back icon in predictions page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on first scorer in predictions page$")
    public void userClicksOnFirstScorerInPredictionsPage() {
        try {
            new UnitedNowPage().clicksOnFirstScorerInPredictionsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on first scorer in predictions page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on first scorer in predictions page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates dxc sponsor logo in first scorer$")
    public void userValidatesDxcSponsorLogoInFirstScorer() {
        try {
            boolean flag = new UnitedNowPage().validatesDxcSponsorLogoInFirstScorerInPredictionsMatchCenter();
            soft.assertTrue(flag);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated dxc sponsor logo in first scorer");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating dxc sponsor logo in first scorer<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on line up page in predictions page$")
    public void userClicksOnLineUpPageInPredictionsPage() {
        try {
            new UnitedNowPage().clicksOnLineUpPageInPredictionsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on line up page in predictions page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on line up page in predictions page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on correct scrore page in predictions page$")
    public void userClicksOnCorrectScrorePageInPredictionsPage() {
        try {
            new UnitedNowPage().clicksOnCorrectScrorePageInPredictionsPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on correct scrore page in predictions page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on correct scrore page in predictions page<br />" + e);
            throw e;
        }
    }

    @And("^user checks for poll card in united now page using api$")
    public void userChecksOnPollCardInUnitedNowPage() throws Exception {
    	ArrayList<String> expectedPollCard = new ArrayList<>();
        try {
        	expectedPollCard = unitedNowAPIResponse.getPollCard("getAllCardsFromUnitedNow");
            ExtentsReportManager.extentReportLogging("info", "Poll Card from API "+expectedPollCard);
            if(!expectedPollCard.isEmpty()) {
                //soft.assertTrue(unitedNowPage.getPollCardFromUnitedNow(expectedPollCard.get(0)));
            	soft.assertTrue(unitedNowPage.getActualCardFromUnitedNowUI(expectedPollCard.get(0),false, 20,"Poll"));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Poll card "+expectedPollCard.get(0)+"is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Poll card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Poll card in united now page<br />" + e);
            throw e;
        }
    }

    @Then("^user checks for quote card in united now page using api$")
    public void userChecksForQuoteCardAndModalInUnitedNowPage() throws Exception {
    	ArrayList<String> expectedQuoteCard = new ArrayList<>();
        try {
        	expectedQuoteCard = unitedNowAPIResponse.getQuoteCard("getAllCardsFromUnitedNow");
            ExtentsReportManager.extentReportLogging("info", "Quote Card from API"+expectedQuoteCard);
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

    @And("^user checks on view full table in united now page$")
    public void userChecksOnViewFullTable() {
        try {
            boolean flag = new UnitedNowPage().checksForViewTableCarddInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "view full table is present in the screen");
            } else {
                soft.assertTrue(true, "view full table not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked on view full table in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking on view full table in united now page<br />" + e);
            throw e;
        }
    }

    @Then("^user checks for Player Profile Card in united now page$")
    public void userChecksForPlayerProfileCardInUnitedNowPage() {
        try {
            boolean flag = new UnitedNowPage().userChecksForPlayerProfileCardInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "Player Profile is present in the screen");
            } else {
                soft.assertTrue(true, "Player Profile not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for Player Profile Card in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Player Profile Card in united now page<br />" + e);
            throw e;
        }
    }

    @Then("^user checks for Add card in united now page$")
    public void userChecksForAddCardInUnitedNowPage() {
        try {
            boolean flag = new UnitedNowPage().userChecksForAddCardInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "Add Card is present in the screen");
            } else {
                soft.assertTrue(true, "Add Card not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for Add card in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Add card in united now page<br />" + e);
            throw e;
        }
    }

    @Then("^user checks for Upcoming Match Fixtures in united now page$")
    public void userChecksForUpcomingMatchFixturesInUnitedNowPage() {
        try {
            boolean flag = new UnitedNowPage().userChecksForUpcomingMatchFixturesInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "Upcoming Match is present in the screen");
            } else {
                soft.assertTrue(true, "Upcoming Match Card not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for Upcoming Match Fixtures in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for Upcoming Match Fixtures in united now page<br />" + e);
            throw e;
        }
    }

    @And("^user checks for Old Match Results in united now page$")
    public void userChecksForOldMatchResultsInUnitedNowPage() {
        try {
            boolean flag = new UnitedNowPage().userChecksForOldMatchResultsInUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "Upcoming Match is present in the screen");
            } else {
                soft.assertTrue(true, "Upcoming Match Card not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for for Old Match Results in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for for Old Match Results in united now page<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on ticket info CTA in fixtures page$")
    public void userClicksOnTicketInfoCTAInFixturesPage() {
        try {
            new UnitedNowPage().clicksOnTicketInfoCTAInFixturesPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on ticket info CTA in fixtures page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on ticket info CTA in fixtures page<br />" + e);
            throw e;
        }
    }

    @Then("^user clicks on table button on CTA in fixtures page$")
    public void userClicksOnTableButtonOnCTAInFixturesPage() {
        try {
            new UnitedNowPage().clicksOnTableButtonOnCTAInFixturesPage();
            ExtentsReportManager.extentReportLogging("info", "Clicked on table button on CTA in fixtures page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on table button on CTA in fixtures page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates page filters in men tab\\.$")
    public void userValidatesPageFiltersInMenTab(DataTable table) {
        try {
            String actualPremierLeague = table.cell(1, 0);
            String actualEuropaLeague = table.cell(1, 1);
            String expectedPremierLeague = new UnitedNowPage().getPremierLeagueTextInMenTab();
            String expectedEuropaLeague = new UnitedNowPage().getEuropaLeagueTextInMenTab();
            soft.assertEquals(actualPremierLeague, expectedPremierLeague);
            soft.assertEquals(actualEuropaLeague, expectedEuropaLeague);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated page filters in men tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating page filters in men tab<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on \"([^\"]*)\" tab in table CTA page$")
    public void userClicksOnTabInTableCTAPage(String category) {
        try {
            new UnitedNowPage().clicksOnTeamTabInTableCTAPage(category);
            ExtentsReportManager.extentReportLogging("info", "Clicked on category tab in table CTA page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Clicking on category tab in table CTA page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates page filters in womens tab\\.$")
    public void userValidatesPageFiltersInWomensTab(DataTable table) {
        try {
            String actualWomensSuperLeague = table.cell(1, 0);
            String actualContinentalLeaguecup = table.cell(1, 1);
            String expectedWomensSuperLeague = new UnitedNowPage().getWomensSuperLeagueTextInWomenTab();
            String expectedContinentalLeaguecup = new UnitedNowPage().getContinentalLeaguecupTextInWomenTab();
            soft.assertEquals(actualWomensSuperLeague, expectedWomensSuperLeague);
            soft.assertEquals(actualContinentalLeaguecup, expectedContinentalLeaguecup);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated page filters in womens tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating page filters in womens tab<br />" + e);
            throw e;
        }
    }

    @Then("^user validates page filters in under twenty ones tab\\.$")
    public void userValidatesPageFiltersInUnderTwentyOnesTab(DataTable table) {
        try {
            String actualPremierLeague2 = table.cell(1, 0);
            String actualEflTrophy = table.cell(1, 1);
            String expectedPremierLeague2 = new UnitedNowPage().getPremierLeague2TextInUnder21sTab();
            String expectedEflTrophy = new UnitedNowPage().getEflTrophyTextInUnder21sTab();
            soft.assertEquals(actualPremierLeague2, expectedPremierLeague2);
            soft.assertEquals(actualEflTrophy, expectedEflTrophy);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated page filters in under twenty ones tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating page filters in under twenty ones tab<br />" + e);
            throw e;
        }
    }

    @Then("^user validates page filters in under eighteen s tab\\.$")
    public void userValidatesPageFiltersInUnderEighteenSTab(DataTable table) {
        try {
            String actualU18PremierLeague = table.cell(1, 0);
            String actualUefaYouthLeague = table.cell(1, 1);
            String expectedU18PremierLeague = new UnitedNowPage().getU18PremierLeagueTextInUnder18Tab();
            String expectedUefaYouthLeague = new UnitedNowPage().getUefaYouthLeagueTextInUnder18Tab();
            soft.assertEquals(actualU18PremierLeague, expectedU18PremierLeague);
            soft.assertEquals(actualUefaYouthLeague, expectedUefaYouthLeague);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated page filters in under eighteen s tab");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating page filters in under eighteen s tabbr />" + e);
            throw e;
        }
    }

    @Then("^user validates page filters in girls tab\\.$")
    public void userValidatesPageFiltersInGirlsTab(DataTable table) {
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

    @Then("^user checks for upsell in united now page$")
    public void userChecksForUpsellInUnitedNowPage() {
        try {
            boolean flag = new UnitedNowPage().checksForUpSellUnitedNowPage();
            if (flag) {
                soft.assertTrue(true, "UpSell is present in the screen");
            } else {
                soft.assertTrue(true, "UpSell not configured in the application");
            }
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Checked for upsell in united now page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for upsell in united now page<br />" + e);
            throw e;
        }
    }

    @Then("^user validates select all icon using api$")
    public void userValidatesSelectAllIconUsingApi() throws Throwable {
        try {
            String SelectAllIconTextFromAPI = unitedNowAPIResponse.getSelectAllIconTextFromAPI("FilterFeedsEndPoints");
            String actualSelectAllIconTextFromUI = unitedNowPage.getSelectAllIconTextFromUI();
            soft.assertEquals(actualSelectAllIconTextFromUI, SelectAllIconTextFromAPI);
//            soft.assertEquals(matchReviwTextFromUI, "MATCH REVIEW", "Mismatch in expected results");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the results");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the results<br />" + e);
            throw e;
        }
    }

    @And("^user clicks on select all icon$")
    public void userClicksOnSelectAllIcon() throws Throwable {
        try {
            new UnitedNowPage().clicksOnSelectAllIcon();
            ExtentsReportManager.extentReportLogging("info", "Clicked on category tab in table CTA page");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in Clicking on category tab in table CTA page<br />" + e);
            throw e;
        }
    }

    @Then("^user validate the clear all icon in UnitedNow page Using Api$")
    public void userValidateTheClearAllIconInUnitedNowPage() throws Throwable {
        try {
            String clearAllIconTextFromAPI = unitedNowAPIResponse.getClearAllIconTextFromAPI("FilterFeedsEndPoints");
            String actualClearAllIconTextFromUI = unitedNowPage.getClearAllIconTextFromUI();
            soft.assertEquals(actualClearAllIconTextFromUI, clearAllIconTextFromAPI);
//            soft.assertEquals(matchReviwTextFromUI, "MATCH REVIEW", "Mismatch in expected results");
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the results");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in validating the results<br />" + e);
            throw e;
        }
    }
   static ArrayList<String> expFilterFeedsApi = new ArrayList<>();
    @Then("^user validates filters feeds in united now screen using api$")
    public void userValidatesFiltersFeedsInUnitedNowScreenUsingApi() throws Throwable {
        try {
//            ArrayList<String> expFilterFeedsApi = new ArrayList<>();
            expFilterFeedsApi = unitedNowAPIResponse.getFilterFeedsFromApi("FilterFeedsEndPoints");
            Collections.sort(expFilterFeedsApi);
            soft.assertEquals(expFilterFeedsApi, unitedNowPage.getFilterFeedsFromUI());
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated the FilterFeeds screen");
        } catch (AssertionError | IOException e) {
            ExtentsReportManager.extentReportLogging("fail", "validation of FilterFeeds values<br />" + e);
            throw e;
        }
    }

    @And("user clicks on each filter and validates section and deselection of each filter")
    public void userClicksOnEachFilterAndValidatesSectionAndDeselectionOfEachFilter() {
        for(String feed:expFilterFeedsApi) {
            userClicksOnFilter(feed);
            userValidatesFilterIsSelected(feed);
            userClicksOnFilter(feed);
            userValidatesFilterIsNotSelected(feed);
        }
    }

    @Then("user checks for article card in united now page using api")
    public void userChecksForArticleCardInUnitedNowPage() throws Exception {
       ArrayList<String> expectedArticalCard = new ArrayList<>();
        try {
            expectedArticalCard = unitedNowAPIResponse.getArticleCard("getAllCardsFromUnitedNow");
            ExtentsReportManager.extentReportLogging("info", "Article Card from API "+expectedArticalCard);
            if(!expectedArticalCard.isEmpty()) {
                soft.assertTrue(unitedNowPage.getArticleCardFromUnitedNow(expectedArticalCard.get(0)));
                soft.assertAll();
                ExtentsReportManager.extentReportLogging("info", "Article card is available in united now page");
            }else {
                ExtentsReportManager.extentReportLogging("info", "Article card not available in united now page");
            }
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in checking for article card in united now page<br />" + e);
            throw e;
        }
    }

	@Then("^user validates Greetings message is not displayed in united now page$")
	public void userValidatesGreetingsMessageIsNotDisplayedInUnitedNowPage() throws Throwable {
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

	@Then("^user validates Stories Carousel is not displayed in united now$")
	public void userValidatesStoriesCarouselIsNotDisplayedInUnitedNow() throws Throwable {
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

	@Then("^user validates Coming Up carousel is not displayed in united now$")
	public void userValidatesComingUpCarouselIsNotDisplayedInUnitedNow() throws Throwable {
			 try {
	    	        boolean comingUpCarouselDisplayedFromAPI = unitedNowAPIResponse.getComingUpCarousalFromApi("ComingUp/StoriesCarousalEndPoint");
	    	        boolean comingUpCarouselCarouselDisplayedFromUI = unitedNowPage.validatesComingUpCarouselIsNotDisplayedInUnitedNow();

	    	        ExtentsReportManager.extentReportLogging("info","comingUpCarousel  From API<br />"+comingUpCarouselDisplayedFromAPI);
	   			 ExtentsReportManager.extentReportLogging("info","actual comingUpCarousel From UI<br />"+unitedNowPage.validatesTheCaroselPageIsDisplayed());

	    	        soft.assertEquals(comingUpCarouselCarouselDisplayedFromUI, comingUpCarouselDisplayedFromAPI, "Carousel display mismatch.");
	    	        soft.assertAll();

	    	        ExtentsReportManager.extentReportLogging("info", "Validated the comingUpCarousel is displayed in United Now using API.");
	    	    } catch (Exception e) {
	    	        ExtentsReportManager.extentReportLogging("fail", "Exception occurred during comingUpCarousel validation: " + e.getMessage());
	    	        throw e;
	    	    }
		 }
//	            boolean flag = unitedNowPage.validatesComingUpCarouselIsNotDisplayedInUnitedNow();
//	            soft.assertTrue(flag);
//	            soft.assertAll();
//	            ExtentsReportManager.extentReportLogging("info", "Validated Coming Up carousel in untied now is displayed ");
//	        } catch (AssertionError e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Error in displaying Coming Up carousel in united now<br />" + e);
//	            throw e;
//	        }
		    @And("^user clicks on united now tab$")
		    public void userClicksOnUnitedNowTab() throws Throwable {
		        try {
		            new UnitedNowPage().clicksOnUnitedNowTab();
		            ExtentsReportManager.extentReportLogging("info", "Clicked on United now tab");
		        } catch (AssertionError e) {
		            ExtentsReportManager.extentReportLogging("fail", "Error in Clicking on United tab <br />" + e);
		            throw e;
		        }
		    }

	@Then("^user validates upsell functionality is displayed united now screen using API$")
	public void userValidatesUpsellFunctionalityIsDisplayedUnitedNowScreen() throws Throwable {
		 try {
	            //data from API
	            String upsellTitleFromAPI = unitedNowAPIResponse.getUpsellTitleFromApi("upsellEndpoint");
	            ExtentsReportManager.extentReportLogging("info","upsellTitle Text From API<br />"+upsellTitleFromAPI);
	            
	            if(upsellTitleFromAPI != null) {
	            	String actualUpsellTitleTextUI = unitedNowPage.getUpsellTitleFromUI();
					ExtentsReportManager.extentReportLogging("info","actual upsellTitle Text From UI<br />"+actualUpsellTitleTextUI);

					soft.assertEquals(actualUpsellTitleTextUI.toUpperCase(), upsellTitleFromAPI.toUpperCase());
		            String watchNowBtnTextFromAPI = unitedNowAPIResponse.getWatchNowBtnTextFromAPI("upsellEndpoint");
		            ExtentsReportManager.extentReportLogging("info","watchNowBtn Text From API<br />"+watchNowBtnTextFromAPI);
		            String actualWatchNowTextBtnUI = unitedNowPage.getWatchNowBtnTextUi();		           
					 ExtentsReportManager.extentReportLogging("info","actual watchNowBtn Text From UI<br />"+actualWatchNowTextBtnUI);

		            soft.assertEquals(actualWatchNowTextBtnUI.toUpperCase(), watchNowBtnTextFromAPI.toUpperCase());
		            soft.assertAll();
		            ExtentsReportManager.extentReportLogging("info", "Validated upsell functionality is displayed united now is displayed ");
	            }else {
	                ExtentsReportManager.extentReportLogging("info", "Upsell functionality is not available in united now page and API");
	            }
	            
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in displaying upsell functionality is displayed in united now<br />" + e);
	            throw e;
	        }catch (IndexOutOfBoundsException i) {
             ExtentsReportManager.extentReportLogging("pass", "Upsell  is not displayed in united now<br />" );
//             throw i;
         }
	    }
//		 try {
//	            boolean flag = unitedNowPage.validatesUpsellFunctionalityIsDisplayedInUnitedNow();
//	            soft.assertTrue(flag);
//	            soft.assertAll();
//	            ExtentsReportManager.extentReportLogging("info", "Validated upsell functionality is displayed untied now is displayed ");
//	        } catch (AssertionError e) {
//	            ExtentsReportManager.extentReportLogging("fail", "Error in displaying upsell functionality is displayed in united now<br />" + e);
//	            throw e;
//	        }
//	}

	@Then("^user validates live video is displayed in united now screen using Api$")
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


    @Then("user checks for Competition card in united now page using api")
    public void userChecksForCompetitionCardInUnitedNowPage() throws Exception {
    	 ArrayList<String> expectedCompetitionCard = new ArrayList<>();
         try {
        	 expectedCompetitionCard = unitedNowAPIResponse.getCompetitionCard("getAllCardsFromUnitedNow");
             ExtentsReportManager.extentReportLogging("info", "Competition Card from API "+expectedCompetitionCard);
             if(!expectedCompetitionCard.isEmpty()) {
                 soft.assertTrue(unitedNowPage.getCompetitionCardFromUnitedNow(expectedCompetitionCard.get(0)));
                 soft.assertAll();
                 ExtentsReportManager.extentReportLogging("info", "Competition card "+expectedCompetitionCard.get(0)+" is available in united now page");
             }else {
                 ExtentsReportManager.extentReportLogging("info", "Competition card not available in united now page");
             }
         } catch (AssertionError e) {
             ExtentsReportManager.extentReportLogging("fail", "Error in checking for Competition card in united now page<br />" + e);
             throw e;
         }
    }
    
    @Then("user checks for Adcard card in united now page using api")
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

	@And("^user validates stories carousel is displayed in Match or Result card using API$")
	public void userValidatesStoriesCarouselIsDisplayedInMatchOrResultPhaseUsingAPI() throws Throwable {
		 try {
	            //data from API
	            String expectedStoriesCarouselinMatchResult = unitedNowAPIResponse.getStoriesCarouseMatchResultsApi("spotLightEndPoint");
	            String actualStoriesCarouselinMatchResult = unitedNowPage.getStoriesCarouselinMatchResultFromUI();
	            soft.assertEquals(actualStoriesCarouselinMatchResult.toUpperCase(), expectedStoriesCarouselinMatchResult.toUpperCase());
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "Validated stories carousel is displayed in Match or Result phase$");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating stories carousel is displayed in Match or Result phase$ <br />" + e);
	            throw e;
	        }
	}
    
//	@Then("^user validate EnglishFaCups text using api$")
//    public void userValidateEnglishFaCupsTextInAllUsingpi() throws Exception {
//        try {
//            Boolean expectedSelection = unitedNowPage.getEnglishFaCups();
//            soft.assertTrue(expectedSelection);
//            soft.assertAll();
//            ExtentsReportManager.extentReportLogging("info", "Validated English FA Cups using API");
//        } catch (AssertionError e) {
//            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Fa Cups Text In All Usingpi<br />" + e);
//            throw e;
//        }
//        
//    }
	
	@Then("^user validate English Premier League text using api$")
    public void uservalidateEnglishPremierLeagueTextUsingApi() throws Exception {
        try {
            Boolean expectedSelection = unitedNowPage.validateContentInTheRadioOptions();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated English Premier League using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Premier League Text<br />" + e);
            throw e;
        }
        
    }
	
	@Then("^user validate FA Cup text using api$")
    public void userValidateFACupTextUsingApi() throws Exception {
        try {
            Boolean expectedSelection = unitedNowPage.getFACup();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated English FA Cup League using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Fa Cups Text In All Usingpi<br />" + e);
            throw e;
        }
        
    }
	
	@Then("^user validate Europa League text using api$")
    public void userValidateEuropaLeagueTextUsingApi() throws Exception {
        try {
            Boolean expectedSelection = unitedNowPage.getEuropaLeague();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated Europa League using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidateEuropaLeagueTextUsingApi<br />" + e);
            throw e;
        }
        
    }
	
	@Then("^user validate Friendly text using api$")
    public void userValidateFriendlyTextUsingApi() throws Exception {
        try {
            Boolean expectedSelection = unitedNowPage.getFriendly();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated Europa League using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidateEuropaLeagueTextUsingApi<br />" + e);
            throw e;
        }
        
    }
	
	@Then("^user validate League Cup text using api$")
    public void userValidateLeagueCupTextUsingApi() throws Exception {
        try {
            Boolean expectedSelection = unitedNowPage.getLeagueCup();
            soft.assertTrue(expectedSelection);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated Europa League using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidateEuropaLeagueTextUsingApi<br />" + e);
            throw e;
        }
        
    }
	
	@Then("^user validates the upcoming Fixtures using Api$")
    public void userValidatesTheUpcomingFixturesusingApi() throws Exception {
        try {
//            Boolean expectedSelection0 = unitedNowPage.getDateTBC();
//            soft.assertTrue(expectedSelection0);
            Boolean expectedSelection1 = unitedNowPage.getTicketInfoAndMatchReview();
            soft.assertTrue(expectedSelection1);
            soft.assertAll();
            ExtentsReportManager.extentReportLogging("info", "Validated upcoming Fixtures using API");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidatesTheUpcomingFixturesusingApi<br />" + e);
            throw e;
        }
        
    }

	@Then("^user validates Sponsor logo in united now screen using API$")
	public void userValidatesSponsorLogoInUnitedNowScreen() throws Throwable {
		 try {
	            ArrayList<String> allSponsorLogoValues = new ArrayList<>();
	            allSponsorLogoValues = unitedNowAPIResponse.getAllSponsorLogoFromAPI("getCarouselListEndPoint");
	             ExtentsReportManager.extentReportLogging("info", "All Sponsor logos"+allSponsorLogoValues);
	             
	            Collections.sort(allSponsorLogoValues);
	            boolean actualSponsorLogoValues = unitedNowPage.getSponsorLogoValues();
	            ExtentsReportManager.extentReportLogging("info","Expected Sponsor logos from API" + allSponsorLogoValues);
	            ExtentsReportManager.extentReportLogging("info","Actual Sponsor logo from UI" + unitedNowPage.getSponsorLogoValues());
	            soft.assertTrue(actualSponsorLogoValues, "Sponsor logo available in united now");
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "validated Sponsor logo in united now screen");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "validation Sponsor logo in united now screen<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates the upcoming Fixtures using Api in united now$")
	public void userValidatesTheUpcomingFixturesUsingApiInUnitedNow() throws Throwable {
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
	
	@And("^user clicks on close in live video$")
    public void userClicksCloseLiveVideo() throws Exception {
        try {
        	unitedNowPage.closeLiveVideo();
            ExtentsReportManager.extentReportLogging("info", "Clicked on close in live video");
        } catch (AssertionError e) {
            ExtentsReportManager.extentReportLogging("fail", "Error in clicking on close in live video<br />" + e);
            throw e;
        }
    }
        
	@Then("user validates scroll and validates 30 items loaded in UN listing")
	public void validateScrollAndItemCountInUNListing() {
		 try {
	            boolean actualDFPAdsValues = unitedNowCardsPage.validateAtLeast30DistinctCardsAndMore(200); 
	            ExtentsReportManager.extentReportLogging("info","validates scroll and validates 30 items loaded in UN listing");
	            soft.assertTrue(actualDFPAdsValues, "validates 30 items not loaded in UN listing after scroll");
	            soft.assertAll();
	            ExtentsReportManager.extentReportLogging("info", "validated 30 items loaded in UN listing");
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating 30 items in UN listing after scroll<br />" + e);
	            throw e;
	        }
	}

	@Then("^user validates it is Fixures Results or no spotlight$")
	public void userValidatesItsFixuresResultsOrNoSpotlight() throws Throwable {
		try {
          Boolean spotlight = unitedNowPage.validateFixturesResultsOrNoSpotlight();
          soft.assertTrue(spotlight);
          soft.assertAll();
          ExtentsReportManager.extentReportLogging("info", "Validated upcoming Fixtures using API");
      } catch (AssertionError e) {
          ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidatesTheUpcomingFixturesusingApi<br />" + e);
          throw e;
      }
	}

	@Then("^user validates and clicks on it is Fixures Results or no spotlight$")
	public void userValidatesAndClicksOnItIsFixuresResultsOrNoSpotlight() throws Throwable {
		try {
	          unitedNowPage.validatesAndClicksOnItIsFixuresResultsOrNoSpotlight();
	          soft.assertAll();
	          ExtentsReportManager.extentReportLogging("info", "Validated upcoming Fixtures using API");
	      } catch (AssertionError e) {
	          ExtentsReportManager.extentReportLogging("fail", "Error in user Validate English Europa League Text userValidatesTheUpcomingFixturesusingApi<br />" + e);
	          throw e;
	      }
	}

	@Then("^user validates deeplink to Match listing or respective match centre$")
	public void userValidatesDeeplinkToMatchListingOrRespectiveMatchCentre() throws Throwable {
		try {
	          Boolean spotlight = unitedNowPage.validatesDeeplinkToMatchListingOrRespectiveMatchCentre();
	          soft.assertTrue(spotlight);
	          soft.assertAll();
	          ExtentsReportManager.extentReportLogging("info", "validated deeplink to Match listing or respective match centre");
	      } catch (AssertionError e) {
	          ExtentsReportManager.extentReportLogging("fail", "Error in user validateing deeplink to Match listing or respective match centre<br />" + e);
	          throw e;
	      }
	}
	@Then("^user validates DFP ads after every 10 items in UN listing$")
	public void userValidatesDFPadsUnitedListing() throws Throwable {
		 try {
	            //boolean actualDFPAdsValues = unitedNowPage.validateDfpAfterCards(50,10);
			 int actualDFPAdsPosition = unitedNowCardsPage.getDfpAdPosition(25);
	           if (actualDFPAdsPosition==-1)
	           {
	        	   ExtentsReportManager.extentReportLogging("WARNING", "Data for DFP Ads is not added by the CMS and is unavailable after the first 10 items in the UN listing");
	           }else {
	          soft.assertTrue((actualDFPAdsPosition==11), "DFP Ads expected position is 11 that is after 10 items in UN listing but actual position is   "+ actualDFPAdsPosition);
	            soft.assertAll();
	            
	            ExtentsReportManager.extentReportLogging("info", "validated DFP Ads after every 10 items in UN listing");
	           }
	        } catch (AssertionError e) {
	            ExtentsReportManager.extentReportLogging("fail", "Error in validating DFP Ads after every 10 items in UN listing<br />" + e);
	            throw e;
	        }
	}
        
	}

