package org.bdd.locators;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MutvPageLocators {
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/navigation_bar_item_small_label_view\') and @text=\"MUTV\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"MUTV\"]")
	public WebElement mutvTabMutvScreen;

	@AndroidFindBy(accessibility = "Explore")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"EXPLORE\"]")
	public WebElement exploreBtnMutvScreen;

	@AndroidFindBy(accessibility = "My Library")
	@iOSXCUITFindBy(accessibility = "My Library")
	public WebElement myListIconMutvScreen;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backIconMutvScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/txtHeaderTitle\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY LIST\"]")
	public WebElement myListTextMutvScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_library_add\')]")
	@iOSXCUITFindBy(accessibility = "Add Tracks to Library")
	public WebElement plusIconMutvScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/library_desc_text_view\')]")
	@iOSXCUITFindBy(accessibility = "Add your favourite shows and episodes to your list to enjoy them at any time – just hit the My List + icon on any show or episode")
	public WebElement descMyListMutvScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_library_download\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FIND SOMETHING TO ADD\"]")
	public WebElement addIconMyListMutvScreen;

	@AndroidFindBy(accessibility = "Check Program schedule")
	@iOSXCUITFindBy(accessibility = "MUTV Schedule")
	public WebElement sheduleIconMutvScreen;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backIconSheduleScreenMutv;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/tertiary_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not now\"]")
	public WebElement notNowButtonMatchAppearanceAlert;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	public WebElement dontAlowButtonAudioAlert;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	public WebElement dontAlowButtonPhotosAndVideosAlert;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/framelayout_tabwidget_parent\')]")
	public WebElement notificationUnitedNowBottomScreen;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'fs_close_button')]")
	@iOSXCUITFindBy(accessibility = "Add Tracks to Library")
	public WebElement closeIconInVideoMutv;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \':id/card_image\')])[1]")
	public WebElement oneVideoMutvScreen;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell)[1]")
	public WebElement oneVideoMutvScreenIos;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'podcast_mylist_icon')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	public WebElement plusSymbolMyListScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_player_cover_image\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeCell[1]")
	public WebElement vedioTitleLinkInMyListScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_mylist_icon\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	public WebElement tickSymbilMyList;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "Minimize")
	public WebElement lessThenSymbolInMyListScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_mylibrary_right_arrow\')]")
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement greaterThenSymbolInMyListScreen;

	@AndroidFindBy(accessibility = "Close")
	public WebElement closeButton;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/parentLayout\')]")
	public List<WebElement> videosMutvPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/header\')]")
	public WebElement headerCBRCBSPage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PLAYING NOW\"]")
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/header\')]")
	public List<WebElement> headerCBRCBSPage1;

	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView[contains(@resource-id, \':id/tabDots\')]/android.widget.LinearLayout/android.widget.LinearLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther")
	public List<WebElement> heroCarouselDotsMutvPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/epg_time\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	public WebElement epgTimeSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/epg_playing_now\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PLAYING NOW\"]")
	public WebElement playNowTextSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/epg_title_icon\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement videoIconSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/epg_title\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	public WebElement videoTitleSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/epg_play\')]")
	@iOSXCUITFindBy(accessibility = "play-icon")
	public WebElement playNowButtonSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/play\')]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther")
	public WebElement pauseButton;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_control_close\')]")
	@iOSXCUITFindBy(accessibility = "xCircleFill")
	public WebElement closeButtonVideo;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \':id/epg_play\')])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement plusIconMutvSchedulePage;
	@AndroidFindBy(id = "android:id/button1")
	public WebElement goToSettingsEnableAlert;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Off\"]")
	public WebElement notificationsAppInfoPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/btn_epg_reminder_ok\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SET REMINDER\"]")
	public WebElement setReminderIcon;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Not allowed\"])[1]")
	public WebElement manUtdStageAlarmReminder;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Allow setting alarms and reminders\"]")
	public WebElement reminderAlarmReminder;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \':id/card_image\')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\" 3 minutes , Marcus Rashford interview after Barcelona 2 Man , 22-23 · Episode 45 , double tap to open\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement videoMutvPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/current_time\')]")
	public WebElement currentPlayTimeVideoMutvPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/end_time\')]")
	public WebElement totalPlayTimeVideoMutvPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/tertiary_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not now\"]")
	public List<WebElement> notNowButtonMatchAppearanceAlert1;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement tickIconMutvSchedulePage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"REMINDER SET\"]")
	public WebElement reminderSetIcon;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/btn_epg_reminder_close\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CLOSE\"]")
	public WebElement closeIconMutvSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/podcast_shows_listen_btn\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CLOSE\"]")
	public WebElement playButtonPodcast;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[4]//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell[1]")
	public List<WebElement> CBSVideoMutvPage;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Close\"]")
    @iOSXCUITFindBy(accessibility = "Close")
    public List<WebElement> closeIconInCBSMUTV;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SUBSCRIBE\"])[1]")
	public WebElement titleCBSVideoMutvPage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SUBSCRIBE\"])[1]")
	public List<WebElement> titleCBSVideoMutvPage1;
	@iOSXCUITFindBy(accessibility = "START YOUR SUBSCRIPTION JOURNEY")
	public WebElement descCBSVideoMutvPage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Log In\"]")
	public WebElement logInBtnInSubscribeScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PLAY\"]")
	public WebElement playIconCBSVideoScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOG IN\"]")
	public WebElement loginBtnSubscribeScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[4]//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]")
	public List<WebElement> CBRVideoMutvPage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]")
	public List<WebElement> CBRVideoMutvPage1;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SIGN UP\"]")
	public WebElement signUpTitleRegisterScreen;
	@iOSXCUITFindBy(accessibility = "REGISTER FOR FREE")
	public WebElement descSignUpRegisterScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PLAY\"]")
	public WebElement playIconCBRVideoScreen;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"View All\"])[1]")
	public WebElement viewAllBtnMutvScreen;

	@iOSXCUITFindBy(accessibility = "FANS' Q&A")
	public List<WebElement> faqInMutvPage;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"View All\"])[1]")
	public WebElement viewAllBtnMutvScreen1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther")
	public WebElement heroCarouselMutvPage;

	@iOSXCUITFindBy(accessibility = "Explore")
	public WebElement searchIconMutvScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	public WebElement episodeCauroselMutvScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView")
	public WebElement episodeLandingMutvScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PLAY\"]")
	public WebElement playIconInEpisodeLandingScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	public WebElement fullEpisodeTypeVideoLandingScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]")
	public WebElement fullEpisodeTypeVideoios;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"controlViewAccessibilityIdentifier\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	public WebElement clipTypeVideo;
	@iOSXCUITFindBy(accessibility = "Add Tracks to Library")
	public WebElement plusIconInMyListScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	public WebElement plusIconInpodcastAudioScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeOther[4]")
	public WebElement cbrVideoInMyListScreen;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, \':id/parentLayout\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell//XCUIElementTypeOther//XCUIElementTypeOther[3]")
	public WebElement podcastAudioMyListScren;
	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[contains(@resource-id, \':id/parentLayout\')])[7]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeCollectionView//XCUIElementTypeCell[1]")
	public WebElement podcastAudioInMutvScreen;
	@AndroidFindBy(accessibility = "Search Podcast")
	public WebElement searchPodcast;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, \':id/frame\')]/android.widget.LinearLayout")
	public WebElement heroCardMutvPage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/header\')]")
	public List<WebElement> episodesCarousel;
	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"View all button\"])[1]")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[@name=\"View All\"])[1]")
	public WebElement viewAllButton;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/txtHeaderTitle\')]")
	public WebElement episodeLandingPage;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \':id/podcast_viewall_img\')])[2]")
	public WebElement fullEpisodeTypeVideo;
	@AndroidFindBy(accessibility = "Listen Now button")
	public WebElement playIconFullEpisodeTypeVideo;
	@AndroidFindBy(accessibility = "log in Button")
	public WebElement logInBtnRegisterScreen;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement heroCarouselDotsMutvPage1;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/com_braze_inappmessage_slideup_message\')]")
	@iOSXCUITFindBy(accessibility = "In app sanity")
	public List<WebElement> imagePopUpWindow;
	@AndroidFindBy(id = "android:id/text1")
	public WebElement viewProgramsPopUp;
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"i2a63l\"]")
	public WebElement personaliseExperiencePopUp;
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"i2a63l\"]")
	public List<WebElement> personaliseExperiencePopUp1;
	@iOSXCUITFindBy(accessibility = "FANS' Q&A")
	public List<WebElement> cbrVideoInMutvScreen;
	@iOSXCUITFindBy(iOSNsPredicate = "name == \"MEN'S HIGHLIGHTS!!\"")
	public List<WebElement> cbsVideoInMutvScreen;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/txtHeaderTitle\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MUTV SCHEDULE\"]")
	public WebElement scheduleTextInEPGPage;
	@iOSXCUITFindBy(accessibility = "MEN'S HIGHLIGHTS!!")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, \':id/epg_playing_now\')])[1]")
	public WebElement cbsBadgeInSchedulePage;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/text_mutv')]")
	public WebElement mutvIconInSetReminderSchedule;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/epg_shedule_time\')]")
	public WebElement showingTimeInSetReminderSchedule;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/epg_shedule_reminder_desc\')]")
	public WebElement descSetReminderSchedule;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/btn_epg_reminder_ok\')]")
	public WebElement setReminderButtonInSchedulePage;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/btn_epg_reminder_close\')]")
	public WebElement closeButtonInSchedulePage;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id, \':id/tv_title\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Full 90: United v Fulham\"]")
	public WebElement podcastTextInMUTV;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/podcast_viewall_title\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeOther//XCUIElementTypeOther[4]//XCUIElementTypeStaticText[2]")
	public List<WebElement> viewAllListOne;	
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	public List<WebElement> epgScheduleWeeklyDescription;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Search Podcast\"]")
	@iOSXCUITFindBy(accessibility = "Explore")
	public WebElement searchButtonUnitedPage;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/txtHeaderTitle\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY LIST\"]")
	public WebElement MyListTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/library_desc_text_view\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add your favourite shows and episodes to your list to enjoy them at any time – just hit the My List + icon on any show or episode\"]")
	public WebElement MyListDesc;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/podcast_library_download\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FIND SOMETHING TO ADD\"]")
	public WebElement FindSomeThingToAdd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/text_view_heading\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name]")
	public List<WebElement> carouselList;

	@AndroidFindBy(accessibility = "Listen Now button")
	public List<WebElement> playIconFullEpisodeTypeVideo1;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \':id/navigation_bar_item_small_label_view\') and @text=\"United Now\"]")
	public WebElement unitedNowTab;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"i0hp\"]")
	public WebElement buyORshopNowInUnitedNowPopUp1;
}



