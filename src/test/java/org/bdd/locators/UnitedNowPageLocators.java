package org.bdd.locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en_lol.AN;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;


public class UnitedNowPageLocators {

//    @AndroidFindBy(xpath = "com.mu.muclubapp.preprod_mu_dxc:id/mDateTxt")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/mDateTxt')]")
    @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement dayAndDateUnitedPage;

    @AndroidFindBy(accessibility = "Filter Feed by")
    @iOSXCUITFindBy(accessibility = "filterIcon")
    public List<WebElement> filterIconUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.Switch[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/switchFeed\"]")
    @AndroidFindBy(xpath = "//android.widget.Switch[contains(@resource-id, ':id/switchFeed')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeSwitch")
    public List<WebElement> disabledSwitchFilterPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/Clear_all_Title")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/Clear_all_Title')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeSwitch")
    public WebElement selectAllButtonFilterPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textView")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/textView\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
    public List<WebElement> filterListFilterPage;
                         
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/image_left")
    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, \":id/image_left\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Fixtures\"]")
    public WebElement calenderIconUnitedPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"UNITED\"]")
    @iOSXCUITFindBy(accessibility = "UNITEDTab Item")
    public WebElement unitedTabUnitedPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ALL TEAMS\"]")
    @iOSXCUITFindBy(accessibility = "ALL TEAMSTab Item")
    public WebElement allTeamsTabUnitedPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Men\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select a team. Men is selected\"]")
    public WebElement menUnitedPage;

    @AndroidFindBy(id = "android:id/text1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public List<WebElement> menDropDownUnitedPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/filter_image")
    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, \":id/filter_image\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]")
    public WebElement threeDotsIconUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/title\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypePopover//XCUIElementTypeOther[2]//XCUIElementTypeButton")
    public List<WebElement> leagueRadioBtnUnitedPage;

    @AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout//android.widget.RelativeLayout")
    @iOSXCUITFindBy(accessibility = "All 2024/25, selected, radio")
    public List<WebElement> allLabelUnitedPage;

//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[1]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[1]")
                            
    @iOSXCUITFindBy(accessibility = "All 2024/25, selected, radio")
    public WebElement allRadioBtnUnitedPage;
    
//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[1]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[1]")
    @iOSXCUITFindBy(accessibility = "All 2024/25, selected, radio")
    public List<WebElement> allRadioBtnUnitedPage1;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_header")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement allLeaguesUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\" and @text=\"Premier League\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/title\") and @text=\"Premier League\"")
    public WebElement premierLabelUnitedPage;

//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[2]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[2]")
    @iOSXCUITFindBy(accessibility = "Premier League, radio")
    public WebElement premierRadioBtnUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\" and @text=\"FA Cup\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/title') and @text='FA Cup']")
    public WebElement faCupLabelUnitedPage;

//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[3]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[3]")
    @iOSXCUITFindBy(accessibility = "FA Cup, radio")
    public WebElement faCupRadioBtnUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\" and @text=\"League Cup\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/title\") and @text=\"League Cup\"]")
    public WebElement leagueCupLabelUnitedPage;

//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[4]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[4]")
    @iOSXCUITFindBy(accessibility = "League Cup, radio")
    public WebElement leagueCupRadioBtnUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\" and @text=\"Europa League\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/title\") and @text=\"Europa League\"]")
    public WebElement europeLegueLAbelUnitedPage;

//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[5]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[5]")
    @iOSXCUITFindBy(accessibility = "Europa League, radio")
    public WebElement europeLegueRadioBtnUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\" and @text=\"Friendly\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/title\") and @text=\"Friendly\"]")
    public WebElement friendlyLabelUnitedPage;

//    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/radio\"])[6]")
    @AndroidFindBy(xpath = "(//android.widget.RadioButton[contains(@resource-id, \":id/radio\")])[6]")
    @iOSXCUITFindBy(accessibility = "Friendly, radio")
    public WebElement friendlyRadioBtnUnitedPage;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/title\" and @text=\"FA Community Shield\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/title\") and @text=\"FA Community Shield\"]")
    @iOSXCUITFindBy(accessibility = "Friendly, radio")
    public WebElement fACommunityShieldRadioBtnUnitedPage;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/bottom_textView\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/bottom_textView\")]")
    @iOSXCUITFindBy(accessibility = "There are currently no fixtures available in this competition.")
    public List<WebElement> noFixturesTextUnitedPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_league_yo_header")
    @AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id, \":id/textview_league_yo_header\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[8]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement leagueRow1UnitedPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_league_yo_header")
    @AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id, ':id/textview_league_yo_header')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[8]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public List<WebElement> leagueRow1UnitedPage1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[3]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public List<WebElement> leagueCupOpt4UnitedNow;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[3]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement leagueCupOpt4UnitedNow1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[5]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public List<WebElement> faLeagueOpt6UnitedNow;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[5]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement faLeagueOpt6UnitedNow1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[3]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public List<WebElement> friendlyLeagueOpt6UnitedNow;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[3]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement friendlyLeagueOpt6UnitedNow1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public List<WebElement> europeLeagueOpt5UnitedNow;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]//XCUIElementTypeOther[2]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement europeLeagueOpt5UnitedNow1;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/txtTeamTickets")
    @AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id, \":id/txtTeamTickets\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[3]//XCUIElementTypeButton//XCUIElementTypeStaticText")
    public WebElement textFixtureAndResults;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeOther[3]//XCUIElementTypeButton//XCUIElementTypeStaticText")
    public WebElement matchDayInAllUnitedNow;

    @iOSXCUITFindBy(accessibility = "DATE TBC")
    public WebElement dateTBCInAllUnitedNow;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"MATCH REVIEW\"])[2]")
    public WebElement matchReviewInAllUnitedNow;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"MATCH REVIEW\"])[2]")
    public List<WebElement> matchReviewInAllUnitedNowIos;

    @iOSXCUITFindBy(accessibility = "Premier League, radio")
    public WebElement premierLeagueUNIOs;
    @iOSXCUITFindBy(accessibility = "FA Cup, radio")
    public WebElement faCupUNIOs;
    @iOSXCUITFindBy(accessibility = "League Cup, radio")
    public WebElement leagueCupUNIOs;
    @iOSXCUITFindBy(accessibility = "Europa League, radio")
    public WebElement europeLeagueUNIOs;
    @iOSXCUITFindBy(accessibility = "Friendly, radio")
    public WebElement friendlyUNIOs;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/relativelayoutTables")
    @AndroidFindBy(xpath ="//android.widget.RelativeLayout[contains(@resource-id, \":id/relativelayoutTables\")]")
    @iOSXCUITFindBy(accessibility = "Results")
    public WebElement resultsIconUnitedPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/greetingsText")
    @AndroidFindBy(xpath ="//android.widget.TextView[contains(@resource-id, \":id/greetingsText\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public WebElement greetingsMsgUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_league_name")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/tv_league_name\")]")
    public WebElement friendlyStoriesCouroselUnitedNowPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_hometeam")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/tv_hometeam\")]")
    public WebElement manutdStoriesCouroselUnitedNowPage;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_awayteam")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/tv_awayteam\")]")
    public WebElement liverPoolStoriesCouroselUnitedNowPage;

//    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/rv_hightlights\"]/android.widget.LinearLayout[1]")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[contains(@resource-id, \":id/rv_hightlights\")]/android.widget.LinearLayout[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Match Result\"]")
    public List<WebElement> storiesCouroselUnitedNowPage;

//    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/rv_hightlights\"]/android.widget.LinearLayout[1]")
    @AndroidFindBy(xpath = "(//android.view.View[contains(@resource-id, \":id/highlight_progress_view\")])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Match Result\"]")
    public  WebElement storiesCouroselUnitedNowPage1;
    
//    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/cv_comingUpCarousel\"])[1]/android.widget.LinearLayout")
    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[contains(@resource-id, \":id/cv_comingUpCarousel\")])[1]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]")
    public List<WebElement> comingUpCouroselUnitedNowPage;
    
//    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/cv_comingUpCarousel\"])[1]/android.widget.LinearLayout")
    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[contains(@resource-id, \":id/cv_comingUpCarousel\")])[1]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]")
    public WebElement comingUpCouroselUnitedNowPage1;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/send_love_txt")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/send_love_txt\")]")
    public WebElement viewProfileUnitedCouroselUnitedNowPage;

//    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textview_match_tables\"])[1]")
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, \":id/textview_match_tables\")])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Table\"])[1]")
    public List<WebElement> tableIconSchedulePage;
    
//    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textview_match_tables\"])[1]")
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, \":id/textview_match_tables\")])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Table\"])[1]")
    public WebElement tableIconSchedulePage1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PREMIER LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther/XCUIElementTypeStaticText")
    public WebElement menLeague1TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"EUROPA LEAGUE\"]")
    @iOSXCUITFindBy(accessibility = "EUROPA LEAGUETab Item")
    public WebElement menLeague2TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WOMEN'S SUPER LEAGUE\"]")
    @iOSXCUITFindBy(accessibility = "WOMEN'S SUPER LEAGUETab Item")
    public WebElement womenLeague1TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CONTINENTAL LEAGUE CUP\"]")
    @iOSXCUITFindBy(accessibility = "CONTINENTAL LEAGUE CUPTab Item")
    public WebElement womenLeague2TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PREMIER LEAGUE 2\"]")
    @iOSXCUITFindBy(accessibility = "PREMIER LEAGUE 2Tab Item")
    public WebElement under21League1TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"EFL TROPHY\"]")
    @iOSXCUITFindBy(accessibility = "EFL TROPHYTab Item")
    public WebElement under21League2TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"U18 PREMIER LEAGUE\"]")
    @iOSXCUITFindBy(accessibility = "U18 PREMIER LEAGUETab Item")
    public WebElement under18League1TextScheduleScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"UEFA YOUTH LEAGUE\"]")
    @iOSXCUITFindBy(accessibility = "UEFA YOUTH LEAGUETab Item")
    public WebElement under18League2TextScheduleScreen;

//    @AndroidFindBy(xpath = "(//android.widget.Spinner[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/team_spinner\"])[2]")
    @AndroidFindBy(xpath = "(//android.widget.Spinner[contains(@resource-id, \":id/team_spinner\")])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men\"]")
    public WebElement arrowButtonSchedulePage;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Women\"]")
    @iOSXCUITFindBy(accessibility = "Women, radio")
    public WebElement womenMatchSchedulePage;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Under-21s\"]")
    @iOSXCUITFindBy(accessibility = "Under-21s, radio")
    public WebElement under21MatchSchedulePage;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Under-18s\"]")
    @iOSXCUITFindBy(accessibility = "Under-18s, radio")
    public WebElement under18MatchSchedulePage;

    @AndroidFindBy(accessibility = "Players")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Players\"]")
    public WebElement playerIconUnitedNowPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MEN\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MENTab Item\"]")
    public WebElement menTabPlayersScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WOMEN\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"WOMENTab Item\"]")
    public WebElement womenTabPlayersScreen;

    @AndroidFindBy(xpath = "//android.widget.ScrollView//android.widget.LinearLayout//android.widget.HorizontalScrollView//android.widget.LinearLayout//android.widget.LinearLayout[3]//android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNDER-21STab Item\"]")
    public WebElement under23TabPlayersScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"UNDER-18S\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNDER-18STab Item\"]")
    public WebElement under18TabPlayersScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LEGENDS\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LEGENDSTab Item\"]")
    public WebElement legendTabPlayersScreen;

//    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/player\"])[1]/android.view.View")
    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[contains(@resource-id, \":id/player\")])[1]/android.view.View")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell)[1]")
    public WebElement selectPlayerPlayersScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name=\"MEN\"]")
    public WebElement selectedMenRadioBtnInFilters;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PROFILE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Profile\"]")
    public List<WebElement> profileTabPlayersInfoPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PROFILE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Profile\"]")
    public WebElement profileTabPlayersInfoPage1;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"STATS\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Stats\"]")
    public List<WebElement> statsTabPlayersInfoPage;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"STATS\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Stats\"]")
    public WebElement statsTabPlayersInfoPage1;

    @AndroidFindBy(accessibility = "Play")
    @iOSXCUITFindBy(accessibility = "icon video play")
    public List<WebElement> playButtonVideoLatestSection;
    
    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public WebElement backButton;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/gradient_view")
    @AndroidFindBy(xpath = "//android.view.View[contains(@resource-id, \":id/gradient_view\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[1]")
    public WebElement articleCard;
    
    @AndroidFindBy(accessibility = "Back")
    @iOSXCUITFindBy(accessibility = "BACK")
    public List<WebElement> backButton1;
    
    @AndroidFindBy(accessibility = "Close")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close\"]")
    public WebElement closeButton;

    @iOSXCUITFindBy(accessibility = "Men, selected, radio")
    public WebElement menDDTabUnitedPage;

    @iOSXCUITFindBy(accessibility = "Women, radio")
    public WebElement womentDDTabUnitedPage;

    @iOSXCUITFindBy(accessibility = "Under-21s, radio")
    public WebElement under21sDDTabUnitedPage;

    @iOSXCUITFindBy(accessibility = "Under-18s, radio")
    public WebElement under18sDDTabUnitedPage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men\"]")
    public WebElement menTabSchedulePageIos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Women\"]")
    public WebElement womenTabSchedulePageIos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Under-21s\"]")
    public WebElement under21STabSchedulePageIos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Under-18s\"]")
    public WebElement under18STabSchedulePageIos;

    @iOSXCUITFindBy(accessibility = "Girls, radio")
    public WebElement girlsTabSchedulePageIos;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/txtDateInfo\" and @text=\"JOINED\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/txtDateInfo\") and @text=\"JOINED\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,\"JOINED\")]")
    public List<WebElement> joinedTitlePlayersPageIos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"WOMENTab Item\"]")
    public WebElement womenTabInPlayersPageIos;
    @iOSXCUITFindBy(accessibility = "LATEST")
    public List<WebElement> latestTextInPlayersPageIos;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_image_carousel_header")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textview_image_carousel_header\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MATCH CENTRE\"]")
    public List<WebElement> matchStats;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/send_love_txt")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/send_love_txt\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]")
    public List<WebElement> birthdayCouroselUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_match_fixtures")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/tv_match_fixtures\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]")
    public List<WebElement> predictionCouroselUnitedNowPage;
    
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]")
    public WebElement closeButtonPredictionCouroselUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/predictions_top_unsigned_headline")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/predictions_top_unsigned_headline\")]")
    @iOSXCUITFindBy(accessibility = "MATCH PREDICTIONS")
    public WebElement predictionPageTitle;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/contextual_button")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/contextual_button\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MAKE YOUR PREDICTIONS\"]")
    public List<WebElement> makeYourPredictionsUnitedNowScreen;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/txtTeamTickets")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/txtTeamTickets\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    public List<WebElement> textFixtureAndResults1;
    
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Influencers\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Players\"]")
    public WebElement influencerIconUnitedNowPage;
    
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Player comparison\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Players\"]")
    public WebElement playerComparisonIconUnitedNowPage;
    
    @iOSXCUITFindBy(accessibility = "Lineup")
    public WebElement lineUpIconUnitedNowPage;
    
    @iOSXCUITFindBy(accessibility = "Close")
    public WebElement CloseIconSignUpPage;
    
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SHOP NOW\"])[1]")
    public List<WebElement> shopNowUnitedNowPage;
    
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SET REMINDER\"])[1]")
    public List<WebElement> setReminderUnitedNowPage;
    
    @iOSXCUITFindBy(accessibility = "WISH THEM")
    public List<WebElement> wishThemUnitedNowPage;
    
    @iOSXCUITFindBy(accessibility = "navbar shop leftarrow")
    public List<WebElement> backArrowShopNowPage;
    
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]")
    public List<WebElement> closeButtonPredictionCouroselUnitedNowPage1;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Close Button\"]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]")
    public List<WebElement> closeButtonPredictionCouroselUnitedNowPage2;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_small_label_view\" and @text=\"United Now\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/navigation_bar_item_small_label_view') and @text='United Now']")
    @iOSXCUITFindBy(accessibility = "United Now")
    public WebElement unitedNowTab;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/mLatestNewsTxt")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/mLatestNewsTxt\")]")
    @iOSXCUITFindBy(accessibility = "WHAT'S NEW")
    public List<WebElement> whatsNew1;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/gradient_view")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/gradient_view\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[contains(@name,\"article card\")]")
    public List<WebElement> articleCardUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/image_view_background")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/image_view_background\")]")
    @iOSXCUITFindBy(accessibility = "Image")
    public List<WebElement> imageCardUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/manuTextViewGallery")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/image_view_background\")]")
    @iOSXCUITFindBy(accessibility = "VIEW GALLERY")
    public List<WebElement> imageGalleryCardUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textView_displayitem")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textView_displayitem\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Item\")]")
    public WebElement imageGalleryCardCount;
    
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Dismiss Live Stream\"]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIEl")
    public List<WebElement> closeButtonLiveStreamUnitedNowPage;
    
    @AndroidFindBy(accessibility = "Play")
    @iOSXCUITFindBy(accessibility = "play button")
    public List<WebElement> playButtonVideoCardUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/manuTextViewHeading")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/manuTextViewHeading\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"QUIZ\")]")
    public List<WebElement> quizCardVideoCardUnitedNowPage;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LIVE MATCH CENTRE\"]")
    public List<WebElement> liveMatchCenterUnitedNowScreen;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LIVE MATCH CENTRE\"]")
    public WebElement liveMatchCenterUnitedNowScreen1;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textViewCTA")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewCTA\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MATCH STATS\"]")
    public List<WebElement> statsCardVideoCardUnitedNowPage;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/manuTextViewSubHeading")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/manuTextViewSubHeading\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"collections\"]")
    public List<WebElement> collectionsCardVideoCardUnitedNowPage;
    
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Girls\"]")
    public WebElement girlsMatchSchedulePage;
    
    @AndroidFindBy(id = "i2a63l")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public List<WebElement> ontinueInPersonlise;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_slideup_chevron")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/com_braze_inappmessage_slideup_chevron\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public List<WebElement> rightArrowSlideup;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_slideup_container")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/com_braze_inappmessage_slideup_container\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public List<WebElement> imagePopUpWindow;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/live_audio_icon")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/live_audio_icon\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement audioButton;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/live_video_img")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/live_video_img\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement videoButton;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textViewStatus")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewStatus\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement watchNow;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/live")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/live\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement live;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/play")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/live\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement pauseButton;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/full_screen")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/full_screen\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement maximizeButton;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/play")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/play\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement playButton;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_modal_button_dual_two")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/com_braze_inappmessage_modal_button_dual_two\")]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public List<WebElement> closeInAppMyUnited;
    
    @iOSXCUITFindBy(accessibility = "Girls, radio")
    public WebElement girlsTabUnitedPage;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textViewHeading\" and @text=\"ADCARD FOR INTERNAL LINK\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewHeading\") and @text=\"ADCARD FOR INTERNAL LINK\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ADCARD FOR INTERNAL LINK\"]")
    public List<WebElement> adCardInternalLink;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textViewHeading\" and @text=\"AD CARD - EXTERNAL LINK STORE SITE 2\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewHeading\") and @text=\"AD CARD - EXTERNAL LINK STORE SITE 2\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\\\"AD CARD - EXTERNAL LINK STORE SITE 2\\\"]")
    public List<WebElement> adCardExternalLink;
    
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/url_bar\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"Google\"]")
    public WebElement titleOfAdcardExternalLink;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textViewHeading\" and @text=\"AD CARD - INTERNAL LINK TO NEXT GEN\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewHeading\") and @text=\"AD CARD - INTERNAL LINK TO NEXT GEN\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AD CARD - INTERNAL LINK TO NEXT GEN\"]")
    public List<WebElement> adCardInternalLinkToNextGen;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textViewHeading\" and @text=\"ADCARD FOR HISTORICAL MATCH NEXT GEN AUTOMATION\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewHeading\") and @text=\"ADCARD FOR HISTORICAL MATCH NEXT GEN AUTOMATION\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ADCARD FOR HISTORICAL MATCH NEXT GEN AUTOMATION\"]")
    public List<WebElement> adCardInternalLinkToHistoricalMatchNextGen;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_large_label_view\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/navigation_bar_item_large_label_view\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"United Now\"]")
    public WebElement unitedNowTabNavigations;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_small_label_view\" and @text=\"MUTV\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/navigation_bar_item_large_label_view\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"MUTV\"]")
    public WebElement mutvTabNavigations;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_small_label_view\" and @text=\"Shop\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/navigation_bar_item_small_label_view\") and @text=\"Shop\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Shop\"]")
    public WebElement shopTabNavigations;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_small_label_view\" and @text=\"My United\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/navigation_bar_item_small_label_view\") and @text=\"My United\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My United, you are not logged in.\"]")
    public WebElement myunitedTabNavigations;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_header")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textview_header\")]")
    @iOSXCUITFindBy(accessibility = "AUGUST 2024")
    public List<WebElement> oldmatchMatchInFixtures;
    
//    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/txtTeamTickets\"])[4]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id, \":id/txtTeamTickets\")])[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MATCH REVIEW\"])[3]")
    public WebElement matchReviewInFixtures;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/contextual_button")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/contextual_button\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"POST-MATCH ANALYSIS\"]")
    public List<WebElement> postMtachAnalysis;
    
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close\"]")
    @iOSXCUITFindBy(accessibility = "Close")
    public List<WebElement> closeIconInMatchCenter;
    
    @AndroidFindBy(accessibility = " MUTV   opens external window")
    @iOSXCUITFindBy(xpath = "MUTV")
    public WebElement mutvSponsorLogoInLineUpMatchCenter;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_large_label_view\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/navigation_bar_item_large_label_view\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My United, you are not logged in.\"]")
    public WebElement myunitedTabNavigationsAfterLogin;
    
    @AndroidFindBy(accessibility = "Line-Ups")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LINE-UPS\"]")
    public List<WebElement> lineUpsInMatchCenter;
    
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Influencers\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"INFLUENCERS\"]")
    public List<WebElement> influencersTabInMatchCenter;
    
    @AndroidFindBy(accessibility = " MUTV")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"MUTV\"]")
    public List<WebElement> mutvSponsorLogoInLineUpMatchCenter1;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/tabTextView\" and @text=\"PREDICTIONS\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/tabTextView\") and @text=\"PREDICTIONS\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PREDICTIONS\"]")
    public List<WebElement> predictionsTabInMatchCenter;
    
    @AndroidFindBy(accessibility = " Cadbury   opens external window")
    @iOSXCUITFindBy(accessibility = "Cadbury")
    public WebElement sponsorLogoPredictionsMatchCenter;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/prediction_home_grid_heading\" and @text=\"MAN OF THE MATCH\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/prediction_home_grid_heading\") and @text=\"MAN OF THE MATCH\"]")
    @iOSXCUITFindBy(accessibility = "MAN OF THE MATCH")
    public List<WebElement> manOfTheMatchInPredictions;
    
    @AndroidFindBy(accessibility = " MUTV   opens external window")
    @iOSXCUITFindBy(accessibility = "MUTV")
    public WebElement mutvSponserLogoInPredictionsPage;
    
    @AndroidFindBy(accessibility = "Back")
    @iOSXCUITFindBy(accessibility = "Back")
    public WebElement backIconInPredictionsPage;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/prediction_home_grid_heading\" and @text=\"FIRST SCORER\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/prediction_home_grid_heading\") and @text=\"FIRST SCORER\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FIRST SCORER\"]")
    public WebElement firstScorerPredictionsMatchCenter;
    
    @AndroidFindBy(accessibility = " DXC   opens external window")
    @iOSXCUITFindBy(xpath = "DXC")
    public WebElement dxcSponserLogoInPredictionsPage;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/prediction_home_grid_heading\" and @text=\"LINE-UPS\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/prediction_home_grid_heading\") and @text=\"LINE-UPS\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"LINE-UPS\"])[2]")
    public WebElement lineUpPagePredictionsMatchCenter;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/prediction_home_grid_heading\" and @text=\"CORRECT SCORE\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/prediction_home_grid_heading\") and @text=\"LINE-UPS\"]")
    @iOSXCUITFindBy(accessibility = "CORRECT SCORE")
    public WebElement correctScorerPredictionsMatchCenter;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/linearlayout_poll")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/linearlayout_poll\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
    public List<WebElement> pollCard;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"saysErik ten Hag will hold his pre-match press conference upon arrival in Portugal on Wednesday evening. Get the latest news and then watch it on-demand from 19:00 BST. double tap to activate\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Erik ten Hag will hold his pre-match press conference upon arrival in Portugal on Wednesday evening. Get the latest news and then watch it on-demand from 19:00 BST.\"]")
    public List<WebElement> quoteCard;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_see_all")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/text_see_all\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW ALL TABLES\"]")
    public List<WebElement> fullTableView;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/viewPlayerProfile")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/viewPlayerProfile\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View Profile\"]")
    public List<WebElement> playerProfileCard;
    
    @AndroidFindBy(xpath = "//android.webkit.WebView")
//	@iOSXCUITFindBy(accessibility = "Monday 19 August")
    public List<WebElement> addCard;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_header")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textview_header\")]")
    @iOSXCUITFindBy(accessibility = "MARCH 2025")
    public List<WebElement> upcomingMatch;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_header")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textview_header\")]")
    @iOSXCUITFindBy(accessibility = "FEBRUARY 2025")
    public List<WebElement> oldMatch;
    
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Buy Tickets open in external window\"])[1]")
    // @iOSXCUITFindBy(accessibility = "Monday 19 August")
    public WebElement ticketInfoCTAInFixturesPage;
    
//    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textview_match_tables\"])[1]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id, \":id/textview_match_tables\")])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Table\"]")
    public WebElement tableButtonOnCTAInFixturesPage;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PREMIER LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PREMIER LEAGUETab Item\"]")
    public WebElement premierLeagueTabinTableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"EUROPA LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EUROPA LEAGUETab Item\"]")
    public WebElement europaLeagueTabinTableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Women\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Women, radio\"]")
    public WebElement womenTabInTableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Under-21s\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Under-21s, radio\"]")
    public WebElement under21sTabInTableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Under-18s\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Under-18s, radio\"]")
    public WebElement under18sTabInTableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Girls\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Girls, radio\"]")
    public WebElement girlsTabInTableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Men\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men, selected, radio\"]")
    public WebElement menTabInTableCTA;
    
    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"android:id/text1\"])[2]")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men\"]")
    public WebElement tableCTACategory;
    
//    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/imgTeamIconA\"])[2]")
    @AndroidFindBy(xpath = "(//*[contains(@resource-id, \":id/imgTeamIconA\")])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage")
	public WebElement crestAImageInFixturesScreen;

//	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/imgTeamIconB\"])[2]")
	@AndroidFindBy(xpath = "(//*[contains(@resource-id, \":id/imgTeamIconB\")])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement crestBImageInFixturesScreen;
    
   
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men\"]")
    public WebElement menDropDowntableCTA;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Women\"]")
    public WebElement womenDropDowntableCTA;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Under-21s\"]")
    public WebElement under21sDropDowntableCTA;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Under-18s\"]")
    public WebElement under18sDropDowntableCTA;
    
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Girls\"]")
    public WebElement girlsDropDowntableCTA;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"WOMEN'S SUPER LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"WOMEN'S SUPER LEAGUETab Item\"]")
    public WebElement womenSuperLeagueInWomenTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CONTINENTAL LEAGUE CUP\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CONTINENTAL LEAGUE CUPTab Item\"]")
    public WebElement continentalLeagueCupInWomenTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PREMIER LEAGUE 2\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PREMIER LEAGUE 2Tab Item\"]")
    public WebElement premierLeagueInUnder21sTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"EFL TROPHY\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EFL TROPHYTab Item\"]")
    public WebElement eflTrophyInunder21sTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"U18 PREMIER LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"U18 PREMIER LEAGUETab Item\"]")
    public WebElement u18PremierLeagueInUnder18sTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"UEFA YOUTH LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UEFA YOUTH LEAGUETab Item\"]")
    public WebElement uefaYouthLeagueInUnder18sTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PREMIER LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ENGLISH PGA U16 WOMENS CUPTab Item\"]")
    public WebElement premierLeagueInGirlsTab;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CHAMPIONS LEAGUE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ENGLISH PGA U21 WOMENS LEAGUETab Item\"]")
    public WebElement championsLeagueInGirlsTab;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textViewHeading")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewHeading\")]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Upsell stg automation\"])[1]")
    public List<WebElement> upSell;
    
    @iOSXCUITFindBy(accessibility = " MUTV")
    public WebElement mutvLogoStatsTab;
    
    @AndroidFindBy(xpath = "//android.widget.ScrollView//android.widget.LinearLayout//android.widget.HorizontalScrollView//android.widget.LinearLayout//android.widget.LinearLayout//android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]//XCUIElementTypeOther//XCUIElementTypeStaticText")
    public List<WebElement> playersPageFilters;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/Clear_all_Title\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/Clear_all_Title\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SELECT ALL\"]")
    public WebElement selectAllIconFiltersUnitedNowPage;
    
//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/Clear_all_Title\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/Clear_all_Title\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CLEAR ALL\"]")
    public WebElement clearAllIconFiltersUnitedNowPage;
    
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout//android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeTable//XCUIElementTypeCell//XCUIElementTypeStaticText")
    public List<WebElement> filterFeedInUnitedNowScreen;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_info")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/text_view_info\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[1]")
    public WebElement articleCardText;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/manuTextViewHeading")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/manuTextViewHeading\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[1]")
    public WebElement pollCardText;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/manuTextViewHeading")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/manuTextViewHeading\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[1]")
    public WebElement competitionCardText;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/txtDateTBC")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/txtDateTBC\")]")
    public WebElement dateTBCFixturesUnitedPage1;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/txtTeamTickets")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/txtTeamTickets\")]")
    public WebElement ticketInfoFixturesUnitedPage1;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/greetingsText")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/greetingsText\")]")
    public List<WebElement> greetingsMsgUnitedNowPageNotDisplayed;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_info")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[1]")
//    public WebElement articleCardText

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textViewHeading")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewHeading\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    public List<WebElement> upsellTextInUnitedNowScreen;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textViewStatus")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/textViewStatus\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeButton/XCUIElementTypeStaticText")
    public WebElement watchNowCTAInUnitedNowScreen;
    
//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_info")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/text_view_info\")]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
    public WebElement liveVideoInUnitedNowScreen;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_small_label_view\" and @text=\"United Now\"]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/navigation_bar_item_small_label_view\") and @text='United Now']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
    public WebElement unitedNowTab1;

//    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/spotlight_btn")
    @AndroidFindBy(xpath = "//*[contains(@resource-id, \":id/spotlight_btn\")]")
    public WebElement storiesCarousel;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'English Premier League')])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
    public List<WebElement> englishFACups;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'English Premier League')])[1]")
    @iOSXCUITFindBy(xpath = "(//*[contains(@value,\"English Premier League\")])[2]")
    public List<WebElement> englishPremierLeague;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'English Premier League')])[1]")
    @iOSXCUITFindBy(xpath = "(//*[contains(@value,'English FA Cup')])[1]")
    public List<WebElement> faCup;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'UEFA Europa League')])[1]")
    @iOSXCUITFindBy(xpath = "(//*[contains(@value,'UEFA Europa League')])[1]")
    public List<WebElement> uEFAEuropaLeague;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,League Cup')])[1]")
    @iOSXCUITFindBy(xpath = "(//*[contains(@value,'English League Cup')])[1]")
    public List<WebElement> leagueCup;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'Friendly')])[1]")
    @iOSXCUITFindBy(xpath = "(//*[contains(@value,'Friendly')])[1]")
    public List<WebElement> friendly;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'DATE TBC')])[1]")
    public List<WebElement> dateTBC;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'TICKET INFO')])[1]")
    @iOSXCUITFindBy(id = "(//*[contains(@name,'TICKET INFO')])[1]")
    public List<WebElement> ticketInfo;
    
    @AndroidFindBy(xpath = "(//*[contains(@text,'MATCH REVIEW')])[1]")
    @iOSXCUITFindBy(id = "(//XCUIElementTypeStaticText[@name=\"MATCH REVIEW\"])[1]")
    public List<WebElement> matchReview;
    
    @iOSXCUITFindBy(xpath = "(//*[contains(@name,'MATCHDAY LIVE')])[1]")
    public List<WebElement> matchDayLive;
    
    @iOSXCUITFindBy(id = "Planned matchWednesday5MarchDummy Test SiteCore 11022025")
    public List<WebElement> dummyTestSiteCore;


}
