package org.bdd.locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

public class MyUnitedPageLocators {

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"RATE APP\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"rate app\"]")
	public WebElement rateAppInGeneralScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.android.vending:id/0_resource_name_obfuscated\"]")

	public WebElement googlePlayText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Language\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"language\"]")
	public WebElement languageInGeneralScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Chinese, Simplified\"]")
	@iOSXCUITFindBy(accessibility = "简体中文. Chinese, Simplified")
	public WebElement selectChineseLanguage;
	// android.widget.TextView[contains(@resource-id, ':id/mLatestNewsTxt')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/ok_btn')]")
	@iOSXCUITFindBy(accessibility = "Confirm")
	public WebElement confirmButtonInlanguageScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/greetingsText')]")
	// @iOSXCUITFindBy(xpath = "")
	public WebElement welcomeTextInChineseUnitedScreen;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	public WebElement dontAllowBtnAudioRefreshed;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	public WebElement dontAllowBtnPhotosAndVideosRefreshed;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'navigation_bar_item_small_label_view') and (@text=\"我的联合\" or @text=\"My United\")]")
	@iOSXCUITFindBy(accessibility = "我的曼联")
	public WebElement myUnitedBtnInChinese;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"设置\" or @content-desc=\"Settings\"]")
	@iOSXCUITFindBy(accessibility = "设置")
	public WebElement settingsIconMyUnitedInChinese;

	@AndroidFindBy(id = "android:id/title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"一般信息\"]")
	public WebElement generalIconSettingsPageInChinese;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"语言\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"语言\"]")
	public WebElement languageGeneralScreenInChinese;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"English\"]")
	@iOSXCUITFindBy(accessibility = "English. 英语")
	public WebElement selectEnglishLanguage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/ok_btn')]")
	@iOSXCUITFindBy(accessibility = "确定")
	public WebElement confirmBtnInChineseLanguage;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"比赛\" or contains(@resource-id, 'image_left')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"赛程\" or @name=\"Fixtures\"]")
	public WebElement calenderIconUnitedPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/image_left')]")
	@iOSXCUITFindBy(accessibility = "Fixtures")
	public List<WebElement> calenderIconUnitedPage1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/txtHeaderTitle')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED\"]")
	public WebElement myUnitedTitleUnitedPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/imgSticker_inflate')]")
	public List<WebElement> inboxIconUnitedPage;

	@iOSXCUITFindBy(accessibility = "Stickers")
	public WebElement stickersIconUnitedPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY MESSAGES\"]")
	public WebElement myMessageTitleInboxUnitedPage;

	@AndroidFindBy(accessibility = "Back")
	public WebElement backIconInboxUnitedPage;
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backIconStickersUnitedPage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"POINTS THIS SEASON\"]")
	@iOSXCUITFindBy(accessibility = "POINTS THIS SEASON, 0")
	public List<WebElement> pointThisSeasonCardMyunitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/first_header')]")
	@iOSXCUITFindBy(accessibility = "PREDICTIONS")
	public WebElement predictionHeaderSeasonCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/second_header')]")
	@iOSXCUITFindBy(accessibility = "MY BEST SCORE")
	public WebElement myBestScoreHeaderSeasonCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/third_header')]")
	@iOSXCUITFindBy(accessibility = "MATCHES")
	public WebElement matchesHeaderSeasonCard;

	@AndroidFindBy(accessibility = "back")
	@iOSXCUITFindBy(accessibility = "MATCHES")
	public WebElement backIconSeasonCardScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/textview_image_carousel_header')]")
	@iOSXCUITFindBy(accessibility = "MY STICKERS")
	public WebElement myStickersTextMyUnitedScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/textview_image_carousel_header')]")
	@iOSXCUITFindBy(accessibility = "MY STICKERS")
	public List<WebElement> myStickersTextMyUnitedScreen1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/view_all')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View All\"]")
	public WebElement viewAllIconMyUnitedScreen;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(accessibility = "MY STICKERS")
	public WebElement backIconStickersScreen;

	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[contains(@resource-id, ':id/sticker_item_parent')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public WebElement firstStickerInStickersScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \"textView\") and contains(@text, \"Search\")]")
	@iOSXCUITFindBy(accessibility = "MY STICKERS")
	public WebElement searchImageLinkStickersScreen;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='com.google.android.googlequicksearchbox:id/search_box_transition_outline']")
	public WebElement imageSharedGoogleLensScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/edit_shirt_no_btn')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name == \"Edit\" AND label == \"Edit\" AND type == \"XCUIElementTypeButton\"")
	public WebElement tShirtEditButton;

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'player_jerseyNo_EdtTxt')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	public WebElement tShirtTextBox;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/edit_shirt_no_btn')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement tShirtsaveButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/back_to_top_btn')]")
	@iOSXCUITFindBy(iOSNsPredicate = "name == \"BACK TO TOP\" AND label == \"BACK TO TOP\" AND value == \"BACK TO TOP\"")
	public WebElement backToTopButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/player_number')]")
	@iOSXCUITFindBy(accessibility = "Shirt Number")
	public WebElement tShirtNumberMyUnitedScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/navigation_bar_item_small_label_view') and @text='United Now']")
    @iOSXCUITFindBy(accessibility = "United Now")
    public WebElement unitedNowTab;
	

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/player_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	public WebElement tShirtNameMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/updatemembership')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"BECOME A MEMBER\" or @name=\"GET OFFICIAL MEMBERSHIP\"]")
	public WebElement getOfficialMemberCTABtnMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS\"]")
	public WebElement ticketsInGetOfficialMemberCTABtn;

	@AndroidFindBy(accessibility = "Close")
	@iOSXCUITFindBy(iOSNsPredicate = "name == \"Share\"")
	public WebElement closeIconInGetOfficialMemberCTABtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/start_day_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"BUY SHIRT\"]")
	public WebElement buyTShirtCTABtnMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOP\"]")
	public WebElement ShopTitleBuyTShirtCTABtn;

	@AndroidFindBy(accessibility = "Close")
	public WebElement closeIconInBuyTShirtCTABtn;

	@AndroidFindBy(accessibility = "t-36198991+d-2349102737+z-96-3385046520")
	public WebElement shopNowTextBuyTShirtCTABtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_title')]")
	public WebElement myUnitedSeasonOne;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_description')]")
	@iOSXCUITFindBy(accessibility = "150 MY UNITED All Points This Season")
	public WebElement scoreThisSeasonSeasonOne;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_description')]")
	@iOSXCUITFindBy(accessibility = "150 MY UNITED All Points This Season")
	public List<WebElement> scoreThisSeasonSeasonOne1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_total_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement myUnitedSeasonTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_total_description')]")
	public WebElement totalScoreSeasonTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_view_button')]")
	public WebElement viewButtonSeasonTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_total_breakdown_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED TOTAL SCORE\"]")
	public WebElement myUnitedScoreSeasonTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/prediction_label')]")
	@iOSXCUITFindBy(accessibility = "Predictions 0  pts")
	public WebElement predictionsSeasonTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/dailystreaks_label')]")
	@iOSXCUITFindBy(accessibility = "Daily Streaks 100  pts")
	public WebElement dailyStreaksSeasonTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_label')]")
	@iOSXCUITFindBy(accessibility = "Appearances 50  pts")
	public WebElement appearanceSeasonTwo;

	@AndroidFindBy(accessibility = "Back")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	public WebElement backIconSeasonTwo;

	// Daily Streaks Card
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/streaks_score')]")
	public WebElement numberHeadingSeasonThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/streaks_title')]")
	public WebElement dailyStreaksSeasonThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/streaks_description')]")
	public WebElement consecutiveDaysinTheAppSeasonThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/streaks_view_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement viewSeasonThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_lineup_pred_title')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"DAILY STREAKS\"])[1]")
	public WebElement dailyStreaksScreenTitleThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/daily_streaks_score')]")
	public WebElement scoreNumberInCircleThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/dailystreak_description')]")
	public WebElement descriptionThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/daily_streak_best_score')]")
	public WebElement scoreNumberInRectangleThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/daily_streak_best_score_title')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"DAILY STREAKS\"])[2]")
	public WebElement bestScoreTextInRectangleThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/share_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SHARE\"]")
	public WebElement shareThree;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	public WebElement backIconThree;

	// Appearance card
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_score')]")
	public WebElement numberHeadingSeasonFour;
						
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement appearanceTitleFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public List<WebElement> appearanceTitleFour1;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, \":id/match_appearance_card\")]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement appereanceFourCardMyunited;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_description')]")
	public WebElement thisSeasonFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/appearance_view_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement viewSeasonFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_view_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[position()=2 or position()=3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public List<WebElement> viewSeasonFour1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_lineup_pred_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"APPEARANCES\"]")
	public WebElement appearancesInsideTitleFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_score')]")
	public WebElement appearanceScoreFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/appearance_description')]")
	public WebElement descriptionFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/last_appearance')]")
	public WebElement lastAppearanceFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/share_button')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SHARE\"]")
	public WebElement shareFour;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	public WebElement backIconFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/favorite_player_heading')]")
	public List<WebElement> pickYourfavoritePlayerMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/edit_fav_player')]")
	public WebElement addIconfavoritePlayerMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CHOOSE PLAYER\"]")
	public WebElement choosePlayerTitleFavoritePlayerScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Men\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men\"]")
	public WebElement menIconFavoritePlayerScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Women\"]")
	public WebElement womenIconFavoritePlayerScreen;

	// @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,
	// 'textview2')])[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, 'textview2')])[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='plus circle gray'])[1]")
	public WebElement selectPlayerNameFavoritePlayerScreen;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'id/star_player_img')]")
	@iOSXCUITFindBy(accessibility = "star player icon")
	public WebElement starIconOnFavPalyer;

	@AndroidFindBy(accessibility = "Lisandro Martinez")
	@iOSXCUITFindBy(accessibility = "TomHeatonFROMEnglish")
	public WebElement playerNameInMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/buy_shirt')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buy Shirt\"]")
	public WebElement buyShirtIconMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOP\"]")
	public WebElement shopTitleFavPlayerShopScreen;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'player_img')]")
	public WebElement playerImageInMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/imageinboxclose')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Share\"]")
	public WebElement crossIconInShopScreen;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id, ':id/ib_selection')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	public WebElement selectEditedPlayerScreen;

	@AndroidFindBy(xpath = "(//android.widget.ImageButton[contains(@resource-id, ':id/ib_selection')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	public WebElement selectEditedPlayerScreen1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/edit_fav_player')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]")
	public WebElement editIconfavoritePlayerMyUnitedScreen;

	@AndroidFindBy(accessibility = "Brandon Williams")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public WebElement editedPlayerNameMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/player_country")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]/../XCUIElementTypeStaticText[3]")
	public List<WebElement> countryFlagPlayerMyUnitedScreen;

	@AndroidFindBy(accessibility = "比赛")
	@iOSXCUITFindBy(accessibility = "赛程")
	public WebElement calenderIconChineseUnitedNowIos;

	@iOSXCUITFindBy(accessibility = "print")
	public WebElement sharePointPrintFileStickersIos;

	@iOSXCUITFindBy(accessibility = "Share")
	public WebElement printIconPrintScreenIos;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Chromium\"]")
	public WebElement chromiumIconPrintScreenIos;
	@iOSXCUITFindBy(accessibility = "Cancel")
	public WebElement cancleIconPrintScreenIos;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Options\"]")
	public WebElement optionsIconPrintScreenIos;
	@iOSXCUITFindBy(accessibility = "Share")
	public WebElement shareIconPrintScreenIos;
	@iOSXCUITFindBy(accessibility = "MY STICKERS")
	public List<WebElement> stickersMyUnitedScreenIos;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"FAVOURITE PLAYER\"]")
	public List<WebElement> pointsThisSeasonMyUnitedIos;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"BACK TO TOP\"]")
	public List<WebElement> editTshirtNumMYUnitedInIos;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"United Predictions\"]")
	public List<WebElement> allPointsThisSeasonMYUnitedInIos;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	public List<WebElement> favoritePlayerMYUnitedInIos;
	@AndroidFindBy(accessibility = "Tom Heaton")
	@iOSXCUITFindBy(accessibility = "LisandroMartinezFROMArgentinian")
	public WebElement playerNameInMyUnitedScreen1;
	@iOSXCUITFindBy(accessibility = "My United")
	public WebElement myUnitedTabLoggedIn;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED STICKERS\"]")
	public WebElement stickersTitleStickersScreenIos;
	@iOSXCUITFindBy(accessibility = "Stickers")
	public WebElement stickersLableMyUnitedPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"iwtwmh\"]")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> muappPopup;
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"i2a63l\"]")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public WebElement continueMuApp;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/com_braze_inappmessage_modal_header_text")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> muappPopup1;
	@AndroidFindBy(accessibility = "OK")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> okButtonMuApp;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/com_braze_inappmessage_modal_header_text")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> idfaVariantPopup;
	@AndroidFindBy(accessibility = "No")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public WebElement noButtonIdfaVariant;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/com_braze_inappmessage_slideup_message")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> inAppPopup;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/com_braze_inappmessage_slideup_chevron")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public WebElement inAppSlideIcon;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/com_braze_inappmessage_modal_header_text')]")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> closeButtonMuApp;
	@iOSXCUITFindBy(accessibility = "CONTINUE")
	public List<WebElement> continueTestMyUnitedPage;
	@iOSXCUITFindBy(accessibility = "CONTINUE")
	public WebElement continueTestMyUnitedPage1;
	@iOSXCUITFindBy(accessibility = "InAppMessage/chevron")
	public List<WebElement> inAppMessageTestMyUnitedPage1;
	@iOSXCUITFindBy(accessibility = "InAppMessage/chevron")
	public WebElement inAppMessageTestMyUnitedPage;
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backIconMyUnitedAppTest;
	@iOSXCUITFindBy(accessibility = "Back")
	public WebElement backIconMyUnitedAppTest1;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No\"]")
	public WebElement trackingMyUnited;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No\"]")
	public List<WebElement> trackingMyUnited1;
	@iOSXCUITFindBy(accessibility = "Ask App Not to Track")
	public List<WebElement> notToTrack1;	
	@iOSXCUITFindBy(accessibility = "Close")
	public List<WebElement> closeButtonLogin;
	@iOSXCUITFindBy(accessibility = "Ask App Not to Track")
	public WebElement notToTrack;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, ':id/com_braze_inappmessage_modal_text_layout')]")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> mutvINAppPopUp;
	@AndroidFindBy(xpath = "//*[@content-desc='CLOSE']")
	@iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
	public List<WebElement> closeIconMutvINAppPopUp;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public List<WebElement> brazeINAppPopUp;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
	public WebElement brazeINAppPopUp1;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_benefit')]")
	@iOSXCUITFindBy(accessibility = "MY UNITED BENEFITS")
	public List<WebElement> myUnitedBenefits;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_benefit')]")
	@iOSXCUITFindBy(accessibility = "VIEW BENEFITS")
	public List<WebElement> viewBenefits;
	@AndroidFindBy(xpath = "(//android.widget.LinearLayout[contains(@resource-id, ':id/parentLayout')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED BENEFITS\"]/../../following-sibling::XCUIElementTypeCell")
	public List<WebElement> myUnitedBenefitsTiles;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, ':id/image\"])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MY UNITED BENEFITS\"]/../../following-sibling::XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeImage)[1]")
	public List<WebElement> myUnitedBenefitsTilesOneXImage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"VIEW BENEFITS\"]/../../following-sibling::XCUIElementTypeCell")
	public List<WebElement> viewBenefitsTiles;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"VIEW BENEFITS\"]/../../following-sibling::XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeImage)[1]")
	public List<WebElement> viewBenefitsTilesOneXImage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"edit profile\"]")
	public WebElement editProfileMyProfilePage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Postcode / Zip Code\"]/following-sibling::XCUIElementTypeTextField")
	public WebElement postalCodeEditProfilePage;
	@iOSXCUITFindBy(accessibility = "SAVE DETAILS")
	public WebElement saveDetailsEditProfilePage;
	@iOSXCUITFindBy(accessibility = "Your details have been updated.")
	public WebElement successMessageEditProfilePage;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, 'textview2')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"plus circle gray\"])[1]/../XCUIElementTypeStaticText")
	public WebElement selectPlayerNameFavoritePlayerScreen1;

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, 'textview2')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	public WebElement selectPlayerNameFavoritePlayerScreen2;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'player_first_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]/../XCUIElementTypeStaticText[1]")
	public WebElement playerFirstNameInMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'player_last_name')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]/../XCUIElementTypeStaticText[2]")
	public WebElement playerLastNameInMyUnitedScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'itemFirstTxt')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	public WebElement myTicketsComponentMyUnited;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \"id/ticket_card_title\")]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"My Tickets\"]")
	public WebElement myTicketsComponentMyUnitedPreProd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"My Tickets\"]")
	public WebElement myTicketsContentMyUnited;

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, ':id/back_imgView')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	public WebElement backIconinMyTicketsMyUnited;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'itemSecondTxt')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	public WebElement stadiumComponentMyUnited;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \"id/stadium_card_title\")]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Matchday Help\"]")
	public WebElement stadiumComponentMyUnitedPreProd;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/stadiumview_title')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	public WebElement stadiumComponentContentMyUnited;

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[contains(@resource-id, ':id/rv_search\"]/android.widget.LinearLayout/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY STICKERS\"]/../../../XCUIElementTypeCollectionView/XCUIElementTypeCell")
	public List<WebElement> stickersMyUnited;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Chinese, Simplified\"]")
	// @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY
	// STICKERS\"]/../../../XCUIElementTypeCollectionView/XCUIElementTypeCell")
	public WebElement languageSwitchMyUnited;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \"title\") and contains(@text, \"PREFERENCE\")]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, \"preference\")]")
	public WebElement preferenceCenterInMyUnited;

	@AndroidFindBy(xpath = "(//*[contains(@text,'PREFERENCE CENTRE')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"PREFERENCE CENTRE\"])[2]")
	public WebElement titleOfPreferenceCenter;

	@AndroidFindBy(xpath = "(//*[contains(@text,'SMS')])[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SMS\"]")
	public WebElement selectingChecklistInPreferenceCenter;

	@AndroidFindBy(xpath = "(//*[contains(@text,'SAVE PREFERENCES')])[1]")
	@iOSXCUITFindBy(accessibility = "SAVE PREFERENCES")
	public WebElement saveButtonInPreferenceCenter;

	@AndroidFindBy(xpath = "(//*[contains(@text,'Thank you, your preferences have been updated.')])")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you, your preferences have been updated.\"]")
	public WebElement updatedPreferenceCenter;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"NewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"New email address\"]")
	public WebElement newEmailTextBoxMyProfile;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"NewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"New email address\"]")
	public List<WebElement> newEmailTextBoxMyProfile1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"NewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]")
	public List<WebElement> newEmailTextBoxMyProfilePreprod1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"NewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]")
	public WebElement newEmailTextBoxMyProfilePreprod;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"ReenterNewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]")
	public WebElement confirmEmailTextBoxMyProfilePreprod;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"ReenterNewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]")
	public List<WebElement> confirmEmailTextBoxMyProfilePreprod1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"ReenterNewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Confirm new email address\"]")
	public WebElement confirmEmailTextBoxMyProfile;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"ReenterNewLoginEmail\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Confirm new email address\"]")
	public List<WebElement> confirmEmailTextBoxMyProfile1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
	public WebElement passwordTextBoxMyProfile;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
	public List<WebElement> passwordTextBoxMyProfile1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	public WebElement passwordTextBoxMyProfilePreprod;
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	public List<WebElement> passwordTextBoxMyProfilePreprod1;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"UPDATE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you, your preferences have been updated.\"]")
	public WebElement updateEmailAddressInChangeEmail;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"UPDATE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you, your preferences have been updated.\"]")
	public List<WebElement> updateEmailAddressInChangeEmail1;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"UPDATE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UPDATE EMAIL ADDRESS\"]")
	public WebElement updateEmailAddressInChangeEmailPreprod;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"UPDATE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UPDATE EMAIL ADDRESS\"]")
	public List<WebElement> updateEmailAddressInChangeEmailPreprod1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CHANGE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CHANGE EMAIL ADDRESS\"]")
	public WebElement emailUpdateSuccessMessage;

	@AndroidFindBy(accessibility = "Close")
	@iOSXCUITFindBy(accessibility = "Close")
	public WebElement closeIconEmailUpdateScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"House/apartment number and street name\"]")
	public WebElement addLineOneEditProfile;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Test Addr1\"]")
	public WebElement addLineOneEditProfile1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[5]")
	public WebElement addLineTwoEditProfile;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Test Addr2\"]")
	public WebElement addLineTwoEditProfile1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[6]")
	public WebElement addLineThreeEditProfile;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Test Addr3\"]")
	public WebElement addLineThreeEditProfile1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[7]")
	public WebElement townOrcityEditProfile;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Test Town\"]")
	public WebElement townOrcityEditProfile1;

	@iOSXCUITFindBy(accessibility = "Your details have been updated.")
	public WebElement successMessageInEditProfile;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[8]")
	public WebElement pinCodeInEditProfile;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Test12345\"]")
	public WebElement pinCodeInEditProfile1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \"txt_abt_me\")]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ABOUT YOU\"]")
	public List<WebElement> aboutYouMyUnitedScreen;

	@AndroidFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Manupreprod Preprod is one of our most dedicated fans from India. The 24 year-old's App Debut came on 30 Apr 2025. Manupreprod's favourite Player is Tom Heaton. Thanks for your continued incredible support!\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Manupreprod Preprod is one of our most dedicated fans from India. The 24 year-old's App Debut came on 30 Apr 2025. Manupreprod's favourite Player is Tom Heaton. Thanks for your continued incredible support!\"]")
	public WebElement descAboutYouMyuniteScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='CurrentPassword']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='CurrentPassword']")
	public WebElement currentPasswordMyuniteScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='NewPassword']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='NewPassword']")
	public WebElement newPasswordMyuniteScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ConfirmNewPassword']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='ConfirmNewPassword']")
	public WebElement confirmNewPasswordMyuniteScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='UPDATE PASSWORD']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='UPDATE PASSWORD']")
	public WebElement updatePasswordMyuniteScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PASSWORD UPDATED']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='PASSWORD UPDATED']")
	public WebElement pwUpdatedtxtMyuniteScreen;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Your password has been changed successfully. Please use your new password to log in.'])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Your password has been changed successfully. Please use your new password to log in.']")
	public WebElement pwUpdateMsgMyuniteScreen;

	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='CurrentPassword']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField[1]")
	public WebElement currentPasswordChangePasswordScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='NewPassword']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField[2]")
	public WebElement newPasswordChangePasswordScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ConfirmNewPassword']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[4]/XCUIElementTypeSecureTextField[3]")
	public WebElement confirmNewPasswordChangePasswordScreen;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='UPDATE PASSWORD']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='UPDATE PASSWORD']")
	public WebElement updatePasswordChangePasswordScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PASSWORD UPDATED']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='PASSWORD UPDATED']")
	public WebElement pwUpdatedtxtChangePasswordScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your password has been changed successfully. Please use your new password to log in.']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Your password has been changed successfully. Please use your new password to log in.']")
	public WebElement pwUpdateMsgChangePasswordScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/title' and @text='CHANGE PASSWORD']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='change password']")
	public WebElement changePasswordMyProfilePage;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \"navigation_bar_item_icon_view\")])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Shop\"]")
	public WebElement shopTabIcon;
	@AndroidFindBy(xpath = "//*[contains(@resource-id, ':id/navigation_bar_item_small_label_view') and @text='My United']")
	@iOSXCUITFindBy(accessibility = "My United, you are not logged in.")
	public WebElement myUnitedButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, \":id/navigation_bar_item_large_label_view\")]")
	@iOSXCUITFindBy(xpath = "//*[@name='TICKETS']")
	public WebElement myUnitedTabLogin;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"MyUnited  CBS Null Value2 . MyUnited  CBS Null Value2\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable")
	public WebElement brazeContentCardMyUnited;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"MyUnited  CBS Null Value2 . MyUnited  CBS Null Value2\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable")
	public List<WebElement> brazeContentCardMyUnited1;
	
}
