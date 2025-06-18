package org.bdd.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ExplorePageLocators {

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/mLatestNewsTxt\')]")
	@iOSXCUITFindBy(accessibility= "WHAT'S NEW")
	public WebElement whatsNew;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/mLatestNewsTxt\')]")
	@iOSXCUITFindBy(accessibility= "WHAT'S NEW")
	public List<WebElement> whatsNew1;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id, \':id/framelayout_tabwidget_parent\')]")
	public WebElement popScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/navigation_bar_item_small_label_view') and @text='My United']")
	@iOSXCUITFindBy(accessibility = "My United, you are not logged in.")
	public WebElement myUnitedButton;

	@AndroidFindBy(accessibility = "Settings")
	@iOSXCUITFindBy(accessibility = "Settings")
	public WebElement settingIcon;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
	public WebElement closeIconInAppMsgIosBrazeTest;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
	public List<WebElement> closeIconInAppMsgIosBrazeTests;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"GENERAL\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"general\"]")
	public WebElement general;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"HELP\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"help\"]")
	public WebElement help;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CONTACT US\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"contact us\"]")
	public WebElement contactUs;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_title\')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"CONTACT US\"])[1]")
	public WebElement contactUsScreenText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"FAQS\"]")
	//@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/title') and contains(@text, 'FAQ')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"faqs\"]")
	public WebElement faqSHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_title\')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"FAQS\"])[1]")
	public WebElement faqsFaqsPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"ACCESSIBILITY\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"accessibility\"]")
	public WebElement accessibilityHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_title\')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"ACCESSIBILITY\"])[1]")
	public WebElement accessibilityAccessibilityPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"TERMS OF USE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"terms of use\"]")
	public WebElement termsOfUseHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_title\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TERMS OF USE\"]")
	public WebElement termsOfUseTermsOfUsePage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"PRIVACY POLICY\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"privacy policy\"]")
	public WebElement privacyPolicyHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_title\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PRIVACY POLICY\"]")
	public WebElement privacyPolicyPrivacyPolicyPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"SEND APP FEEDBACK\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"send app feedback\"]")
	public WebElement sendAppFeedbackHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Feedback\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FEEDBACK\"]")
	public WebElement feedBackPageTitle;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/edit_text_email\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email Address*\"]")
	public WebElement emailAddressTextBoxFeedBackPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/edittext_feedback_subject\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Subject*\"]")
	public WebElement subjectTextBoxFeedBackPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/edittext_feedback_cmnt\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"Feedback*\"]")
	public WebElement feedbackCommentTextBoxFeedBackPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/btn_submit\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SUBMIT\"]")
	public WebElement submitButtonFeedBackPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/snackbar_text\')]")
	public WebElement successMessageFeedBackPage;

//	@AndroidFindBy(accessibility = "Search")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Search\"]")
	@iOSXCUITFindBy(accessibility = "Explore")
	public WebElement searchButtonUnitedPage;

	// search screen locators
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"HELP\"]")
	@iOSXCUITFindBy(accessibility = "HELP")
	public WebElement helpCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"HISTORY\"]")
	@iOSXCUITFindBy(accessibility = "HISTORY")
	public WebElement historyCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MANCHESTER UNITED'S STORY: THE GREATEST EVER TOLD\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MANCHESTER UNITED'S STORY: THE GREATEST EVER TOLD\"]")
	public WebElement storyInHistorySearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"MUTV\"]")
	@iOSXCUITFindBy(accessibility = "MUTV")
	public WebElement mutvCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/textview_heading\')]")
	@iOSXCUITFindBy(accessibility = "WELCOME TO MUTV")
	public WebElement mutvWelcomeTextMutvPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/textview_description\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"WELCOME TO MUTV\"]/../XCUIElementTypeStaticText[2]")
	public WebElement mutvDescriptionMutvPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Explore\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EXPLORE\"]")
	public WebElement mutvExploreButtonMutvPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"SHOP\"]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SHOP\"])[1]")
	public WebElement shopCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_title\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Shop\"]")
	public WebElement shopTitleShopPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"FIXTURES & TABLES\"]")
	@iOSXCUITFindBy(accessibility = "FIXTURES & TABLES")
	public WebElement fixturesAndTableCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"MY TICKETS\"]")
	@iOSXCUITFindBy(accessibility = "MY TICKETS")
	public WebElement myTicketsCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_heading') and contains(@text, 'BUY TICKETS')]")
	@iOSXCUITFindBy(accessibility = "BUY TICKETS")
	public WebElement buyTicketsCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	//@FindBy(xpath = "(//*[contains(text(),'TICKETS')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS\"]")
	public WebElement ticketTitleTicketPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"MEMBERSHIP\"]")
	@iOSXCUITFindBy(accessibility = "MEMBERSHIP")
	public WebElement membershipCouroselSearchPage;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"OFFICIAL MEMBERSHIP\"])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"OFFICIAL MEMBERSHIP\"])[2]")
	public WebElement officialMembership;
	
	//@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"UNITED MEMBERSHIP\"])[2]")
	//@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"UNITED MEMBERSHIP\"])[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"mutv-main-heading\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNITED MEMBERSHIP\"]")
	public WebElement unitedMembershipMembership;

	@iOSXCUITFindBy(xpath = "//*[@name='UNITED MEMBERSHIP']")
	public List<WebElement> unitedMembershipOptions;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Be part of the United family. 2024/25 Official Membership is now on sale.\"]")
	@iOSXCUITFindBy(accessibility = "Be part of the United family. 2024/25 Official Membership is now on sale.")
	public WebElement officialMembershipDesc;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Be part of the United family. 2024/25 United Membership is now on sale.\"]")
	@iOSXCUITFindBy(accessibility = "Be part of the United family. 2024/25 United Membership is now on sale.")
	public WebElement unitedMembershipDesc;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"FANS\"]")
	@iOSXCUITFindBy(accessibility = "FANS")
	public WebElement fansCouroselSearchPage;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"mutv-main-heading\"])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'FOOTBALL IS NOTHING WITHOUT FANS')]")
	public WebElement fansPageContent;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"MY UNITED\"]")
	@iOSXCUITFindBy(accessibility = "My United")
	public WebElement myUnitedCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/txtHeaderTitle\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED\"]")
	public WebElement myUnitedTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"PREDICTIONS\"]")
	@iOSXCUITFindBy(accessibility = "Predictions")
	public WebElement predictionsCouroselSearchPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\') and @text=\"PLAYERS\"]")
	@iOSXCUITFindBy(accessibility = "PLAYERS")
	public WebElement playersCouroselSearchPage;

	@AndroidFindBy(accessibility = "LATEST")
	@iOSXCUITFindBy(accessibility = "LATEST")
	public WebElement latestCouroselSearchPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"NOTIFICATIONS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"notifications\"]")
	public WebElement notificationButtonSettingsPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"UNITED NOW ALERTS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"united now alerts\"]")
	public WebElement unitedNowAlertsNotificationsPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"MATCH ALERTS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"match alerts\"]")
	public WebElement matchAlertsNotificationsPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Transfers, team news, injury updates, new contracts, and all daily updates direct from the club\"]")
	@iOSXCUITFindBy(accessibility = "Latest, Transfers, team news, injury updates, new contracts, and all daily updates direct from the club")
	public WebElement latestSwitchIconUnitedNowAlertsPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/ok_btn\')]")
	@iOSXCUITFindBy(accessibility = "Go to Settings")
	public WebElement goToSettingsButtonEnableAlerts;
	@AndroidFindBy(id = "android:id/switch_widget")
	@iOSXCUITFindBy(xpath = "Allow")
	public WebElement notificationSwitch;
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	public WebElement backButtonSettings;
	@AndroidFindBy(accessibility = "Navigate up")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	public WebElement backButtonUnitedNowAlertsPage;

	@AndroidFindBy(id = "android:id/summary")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	public List<WebElement> unitedNowAlertTexts;
	@AndroidFindBy(id = "android:id/title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
	public List<WebElement> matchAlertTexts;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/primary_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public WebElement okButtonCookiesScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public List<WebElement> okButtonCookiesScreen1;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"REJECT\"]")
	public List<WebElement> rejectBtnQA;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"REJECT\"]")
	public WebElement rejectBtnQA1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/contextual_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MAKE YOUR PREDICTIONS\"]")
	public List<WebElement> makeYourPredictionsUnitedNowScreen;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/contextual_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MAKE YOUR PREDICTIONS\"]")
	public WebElement makeYourPredictionsUnitedNowScreen1;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/textview_heading')]")
//		@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	public WebElement weUseCookiesTexts;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/tertiary_text')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not now\"]")
	public List<WebElement> notNowButtonMatchAppearanceAlert1;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/tertiary_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not now\"]")
	public WebElement notNowButtonMatchAppearanceAlert;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"iwtwmh\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not now\"]")
	public List<WebElement> personaliseYourExpAlert;
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"i2a63l\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not now\"]")
	public List<WebElement> continueIconPersonaliseYourExpAlert;
	@iOSXCUITFindBy(accessibility = "LIVE MATCH BLOG")
	public WebElement liveBlogUniteNowPage;
	@iOSXCUITFindBy(accessibility = "LIVE MATCH BLOG")
	public List<WebElement> liveBlogUniteNowPage1;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LIVE MATCH CENTRE\"]")
	public List<WebElement> liveMatchCenterUnitedNowScreen;
	@AndroidFindBy(xpath = "(//android.widget.FrameLayout[contains(@resource-id, \':id/card_view\')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeScrollView[2]//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell[1]")
	public WebElement latestCardInLatestScreen;
	@AndroidFindBy(accessibility = "Latest Tab")
	@iOSXCUITFindBy(accessibility = "LATESTTab Item")
	public WebElement latestTabInLatestScreen;
	@AndroidFindBy(accessibility = "Men Tab")
	@iOSXCUITFindBy(accessibility = "MENTab Item")
	public WebElement menTabInLatestScreen;
	@AndroidFindBy(accessibility = "Women Tab")
	@iOSXCUITFindBy(accessibility = "WOMENTab Item")
	public WebElement womenTabInLatestScreen;
	@AndroidFindBy(accessibility = "Under-21s Tab")
	@iOSXCUITFindBy(accessibility = "UNDER-21STab Item")
	public WebElement under21sTabInLatestScreen;
	@AndroidFindBy(accessibility = "Under-18s Tab")
	@iOSXCUITFindBy(accessibility = "UNDER-18STab Item")
	public WebElement under18sTabInLatestScreen;
	@AndroidFindBy(accessibility = "Club Tab")
	@iOSXCUITFindBy(accessibility = "CLUBTab Item")
	public WebElement clubTabInLatestScreen;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Share\"])")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"share\"])[1]")
	public WebElement shareIconLatestScreen;
	@AndroidFindBy(xpath = "//android.widget.ListView[contains(@resource-id, \':id/listview\')]/android.widget.LinearLayout[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Messages\"]/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement messageIconShareScreen;
	@AndroidFindBy(accessibility = "Close")
	@iOSXCUITFindBy(accessibility = "Close")
	public List<WebElement> crossIconInDestinationScreen;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backIconInDestinationScreen1;

	@AndroidFindBy(accessibility = "Close")
	@iOSXCUITFindBy(accessibility = "Close")
	public WebElement crossIconInDestinationScreen1;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "Back")
	public List<WebElement> backIconInDestinationScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"United Now\"]")
	public WebElement unitedNowTabInBottomScreen;

	@iOSXCUITFindBy(accessibility = "search-icon-inactive-light")
	public WebElement searchInputInExplorePage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/search_src_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField")
	public WebElement searchInputTextInExplorePage;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "Exit search")
	public WebElement exitBtnInSearchPagePlayers;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/edit_text_search\')]")
	@iOSXCUITFindBy(className = "XCUIElementTypeSearchField")
	public List<WebElement> autoSuggestionExploreScreen;

	@AndroidFindBy(accessibility = "Suggested search")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell")
	public WebElement autoSuggestionWithDataExploreScreen;

	@AndroidFindBy(accessibility = "Search button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther")
	public WebElement selectingSuggestionsExploreScreen;

	@AndroidFindBy(accessibility = "Clear")
	@iOSXCUITFindBy(accessibility = "Clear text")
	public WebElement clearIconInExploreScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeLink")
	public List<WebElement> pageFiltersInSearchResultScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/textview_searchsuggestion_listitem\')][1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell")
	public WebElement selectPlayerInSuggestions;

	@AndroidFindBy(accessibility = "Clear")
	@iOSXCUITFindBy(accessibility = "image")
	public WebElement searchResultForImage;
	@AndroidFindBy(accessibility = "Clear")
	@iOSXCUITFindBy(accessibility = "video")
	public WebElement searchResultForVideos;
	@AndroidFindBy(accessibility = "Clear")
	@iOSXCUITFindBy(accessibility = "news")
	public WebElement searchResultForNews;
	@AndroidFindBy(accessibility = "Clear")
	@iOSXCUITFindBy(accessibility = "all")
	public WebElement searchResultForAll;

	@iOSXCUITFindBy(accessibility = "bruno")
	public WebElement searchResultForSearchedContent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"'EVERYONE IS A PART OF THIS CLUB'\"]")
	public WebElement titleTextSearchResultPage;

	@AndroidFindBy(accessibility = "Clear")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]")
	public WebElement firstcontentInPageFilter;

	@iOSXCUITFindBy(accessibility = "UNITEDTab Item")
	public WebElement unitedTabInFixturesAndTables;

	@iOSXCUITFindBy(accessibility = "ALL TEAMSTab Item")
	public WebElement allTeamsTabInFixturesAndTables;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"POST-MATCH ANALYSIS\"]")
	public WebElement postMatchInUnitedNowPage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MATCH REVIEW\"])")
	public WebElement matchResultsInFixtures;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MATCH REVIEW\"])")
	public List<WebElement> matchResultsInFixtures1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select a team. Men is selected\"]")
	public WebElement menTabIntableFilter;
	@iOSXCUITFindBy(accessibility = "Men, selected, radio")
	public WebElement menTabFixturesListingPage;
	@iOSXCUITFindBy(accessibility = "Women, radio")
	public WebElement womenTabFixturesListingPage;
	@iOSXCUITFindBy(accessibility = "Under-21s, radio")
	public WebElement under21STabFixturesListingPage;
	@iOSXCUITFindBy(accessibility = "Under-18s, radio")
	public WebElement under18STabFixturesListingPage;
	@iOSXCUITFindBy(accessibility = "Girls, radio")
	public WebElement girlsTabFixturesListingPage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement allTableFiltersinFixturesPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/statsheading\')]")
	@iOSXCUITFindBy(accessibility = "LAST MATCH")
	public WebElement matchLivePlayersPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/statsheading\')]")
	@iOSXCUITFindBy(accessibility = "SEASON STATS")
	public WebElement seasonStatsPlayersPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/manutextview_viewall\')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name == \"VIEW MORE\"")
	public WebElement viewMoreBtnLatestSectionPlayersPage;

	@AndroidFindBy(accessibility = "Share")
	@iOSXCUITFindBy(accessibility = "share")
	public WebElement shareIconPlayersPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PROFILE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Profile\"]")
	public WebElement profileTabPlayersInfoPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"STATS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Stats\"]")
	public WebElement statsTabPlayersInfoPage;
	@iOSXCUITFindBy(accessibility = "Girls, selected, radio")
	public WebElement girlsDDTabUnitedPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ENGLISH PGA U16 WOMENS CUP\"]")
	@iOSXCUITFindBy(accessibility = "ENGLISH PGA U16 WOMENS CUPTab Item")
	public WebElement girlsLeague1TextScheduleScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ENGLISH PGA U21 WOMENS LEAGUE\"]")
	@iOSXCUITFindBy(accessibility = "ENGLISH PGA U21 WOMENS LEAGUETab Item")
	public WebElement girlsLeague2TextScheduleScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ENGLISH WOMENS SUPER LEAGUE\"]")
	@iOSXCUITFindBy(accessibility = "ENGLISH WOMENS SUPER LEAGUETab Item")
	public WebElement girlsLeague3TextScheduleScreen;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"content\"]/android.view.View[2]/android.view.View/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeLink[3]//XCUIElementTypeImage")
	public WebElement itemInHistoryPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MANCHESTER UNITED: THE STORY SO FAR\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MANCHESTER UNITED: THE STORY SO FAR\"]")
	public WebElement titleCTAHistoryItem;

	
	@iOSXCUITFindBy(accessibility = "Girls, radio")
	public WebElement girlsDDInTableFixturesPgae;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Table\"])[1]")
	public List<WebElement> tableCTABtnInFixtures;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, \':id/textview_match_tables\')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Table\"])[1]")
	public WebElement tableCTABtnInFixtures1;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/image_view_icon\')]")
	@iOSXCUITFindBy(accessibility = "icon video play")
	public List<WebElement> latestVideoListingPage;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/image_view_icon\')]")
	@iOSXCUITFindBy(accessibility = "Video with upsell and icons")
	public WebElement latestVideoListingPage1;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/text_more_info\')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MORE INFO\"])[1]")
	public WebElement moreInfoBtnInVideoModel;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TICKET INFO\"])[1]")
	public List<WebElement> ticketInfoBtnFixturesPage;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Buy Tickets open in external window\"])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TICKET INFO\"])[1]")
	public WebElement ticketInfoBtnFixturesPage1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MATCH CENTRE\"]")
	public WebElement matchCenterFormatchResult;

	@AndroidFindBy(accessibility = "Close")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Share\"]")
	public WebElement backIconInTicketsPage;

	@iOSXCUITFindBy(accessibility = "back")
	public WebElement backIconInPridictionsPage;

	@iOSXCUITFindBy(accessibility = "Profile Tab")
	public WebElement profileTabInPlayersPage;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, \':id/linear_layout_dfp\')]")
	public List<WebElement> dfpAdCardInLatestScreen;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, \':id/linear_layout_dfp\')]")
	public WebElement dfpAdCardInLatestScreen1;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, \':id/adViewContainer\')]")
	public List<WebElement> dfpAdCardInPlayersScreen;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, \':id/adViewContainer\')]")
	public WebElement dfpAdCardInPlayersScreen1;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \':id/imgTeamIconA\')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage")
	public WebElement crestAImageInFixturesScreen;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \':id/imgTeamIconB\')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement crestBImageInFixturesScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/tertiary_cta')]")
	public List<WebElement> ReggressionPopUpUniteNow;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name]")
	public List<WebElement> carouselList;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\')]")
	@iOSXCUITFindBy(accessibility = "POPULAR")
	public List<WebElement> popularSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\')]")
	@iOSXCUITFindBy(accessibility = "CATEGORIES")
	public List<WebElement> categoriesSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"popular\"]/..//androidx.recyclerview.widget.RecyclerView/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value]")
	public List<WebElement> popularSectionData;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/edit_text_search\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
	public WebElement searchInputTextInUnitedNowSearchScreen;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/search_src_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField")
	public WebElement typesearchInputTextInUnitedNowSearchScreen;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/listview_search_suggestion')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell")
	public List<WebElement> suggestion;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage")
	public WebElement backUnitedNowSearch;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"We've improved our search to help you find what you're looking for! Try it out here\"]")
	public List<WebElement> weHaveImprovedList;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"We've improved our search to help you find what you're looking for! Try it out here\"]")
	public WebElement weHaveImproved;
	
	@FindBy(xpath = "//*[@id=\"component-tabs\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All\"]")
	public WebElement allData;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MUTV\"])[1]")
	public WebElement mutv;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"News\"]")
	public WebElement news;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Videos\"]")
	public WebElement video;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ask App Not to Track\"]")
	public WebElement askAppNotToTrack;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public WebElement clicksOnContinueButton;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/tertiary_text')]")
	@iOSXCUITFindBy(xpath = "//*[@name='Accept all']")
	public List<WebElement> acceptAllInBuyTickets;
	
	@FindBy(xpath = "(//*[contains(text(),'TICKETS')])")
	@iOSXCUITFindBy(xpath = "//*[@name='TICKETS']")
	public List<WebElement> ticketTitleTicketPages;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/framelayout_tabwidget_parent')]")
	public List<WebElement> notificationUnitedNowBottomScreen;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[contains(@name, \"Register\")])[1]")
	public WebElement CBRcontentSearchResults;
}
