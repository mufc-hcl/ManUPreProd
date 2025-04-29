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

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/ok_btn")
    @iOSXCUITFindBy(accessibility = "Confirm")
    public WebElement confirmButtonInlanguageScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/greetingsText")
    // @iOSXCUITFindBy(xpath = "")
    public WebElement welcomeTextInChineseUnitedScreen;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
    public WebElement dontAllowBtnAudioRefreshed;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
    public WebElement dontAllowBtnPhotosAndVideosRefreshed;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/navigation_bar_item_small_label_view\" and @text=\"我的联合\"]")
    @iOSXCUITFindBy(accessibility = "我的曼联")
    public WebElement myUnitedBtnInChinese;

    @AndroidFindBy(accessibility = "设置")
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

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/ok_btn")
    @iOSXCUITFindBy(accessibility = "确定")
    public WebElement confirmBtnInChineseLanguage;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/image_left")
    @iOSXCUITFindBy(accessibility = "Fixtures")
    public WebElement calenderIconUnitedPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/txtHeaderTitle\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED\"]")
    public WebElement myUnitedTitleUnitedPage;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/imgSticker_inflate")
    public List<WebElement> inboxIconUnitedPage;

    @iOSXCUITFindBy(accessibility = "Stickers")
    public WebElement stickersIconUnitedPage;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY MESSAGES\"]")
    public WebElement myMessageTitleInboxUnitedPage;

    @AndroidFindBy(accessibility = "Back")
    public WebElement backIconInboxUnitedPage;
    @iOSXCUITFindBy(accessibility = "Back")
    public WebElement backIconStickersUnitedPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"POINTS THIS SEASON\"]")
    @iOSXCUITFindBy(accessibility = "POINTS THIS SEASON, 0")
    public List<WebElement>  pointThisSeasonCardMyunitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/first_header")
    @iOSXCUITFindBy(accessibility = "PREDICTIONS")
    public WebElement predictionHeaderSeasonCard;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/second_header")
    @iOSXCUITFindBy(accessibility = "MY BEST SCORE")
    public WebElement myBestScoreHeaderSeasonCard;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/third_header")
    @iOSXCUITFindBy(accessibility = "MATCHES")
    public WebElement matchesHeaderSeasonCard;

    @AndroidFindBy(accessibility = "back")
    @iOSXCUITFindBy(accessibility = "MATCHES")
    public WebElement backIconSeasonCardScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/textview_image_carousel_header")
    @iOSXCUITFindBy(accessibility = "MY STICKERS")
    public WebElement myStickersTextMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/view_all")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View All\"]")
    public WebElement viewAllIconMyUnitedScreen;

    @AndroidFindBy(accessibility = "Back")
    @iOSXCUITFindBy(accessibility = "MY STICKERS")
    public WebElement backIconStickersScreen;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/sticker_item_parent\"])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    public WebElement firstStickerInStickersScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textView\" and @text=\"Search image\"]")
    @iOSXCUITFindBy(accessibility = "MY STICKERS")
    public WebElement searchImageLinkStickersScreen;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"com.google.android.googlequicksearchbox:id/search_box_transition_outline\"]")
    public WebElement imageSharedGoogleLensScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/edit_shirt_no_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"Edit\" AND label == \"Edit\" AND type == \"XCUIElementTypeButton\"")
    public WebElement tShirtEditButton;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_jerseyNo_EdtTxt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public WebElement tShirtTextBox;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/edit_shirt_no_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
    public WebElement tShirtsaveButton;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/back_to_top_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"BACK TO TOP\" AND label == \"BACK TO TOP\" AND value == \"BACK TO TOP\"")
    public WebElement backToTopButton;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_number")
    @iOSXCUITFindBy(accessibility = "Shirt Number")
    public WebElement tShirtNumberMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_name")
    @iOSXCUITFindBy(accessibility = "T")
    public WebElement tShirtNameMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/updatemembership")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"GET OFFICIAL MEMBERSHIP\"]")
    public WebElement getOfficialMemberCTABtnMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS\"]")
    public WebElement ticketsInGetOfficialMemberCTABtn;

    @AndroidFindBy(accessibility = "Close")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"Share\"")
    public WebElement closeIconInGetOfficialMemberCTABtn;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/start_day_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"BUY SHIRT\"]")
    public WebElement buyTShirtCTABtnMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOP\"]")
    public WebElement ShopTitleBuyTShirtCTABtn;

    @AndroidFindBy(accessibility = "Close")
    public WebElement closeIconInBuyTShirtCTABtn;

    @AndroidFindBy(accessibility = "t-36198991+d-2349102737+z-96-3385046520")
    public WebElement shopNowTextBuyTShirtCTABtn;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_title")
    public WebElement myUnitedSeasonOne;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_description")
    @iOSXCUITFindBy(accessibility = "150 MY UNITED All Points This Season")
    public WebElement scoreThisSeasonSeasonOne;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_total_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement myUnitedSeasonTwo;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_total_description")
    public WebElement totalScoreSeasonTwo;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_view_button")
    public WebElement viewButtonSeasonTwo;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_total_breakdown_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED TOTAL SCORE\"]")
    public WebElement myUnitedScoreSeasonTwo;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/prediction_label")
    @iOSXCUITFindBy(accessibility = "Predictions 0  pts")
    public WebElement predictionsSeasonTwo;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/dailystreaks_label")
    @iOSXCUITFindBy(accessibility = "Daily Streaks 100  pts")
    public WebElement dailyStreaksSeasonTwo;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_label")
    @iOSXCUITFindBy(accessibility = "Appearances 50  pts")
    public WebElement appearanceSeasonTwo;

    @AndroidFindBy(accessibility = "Back")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public WebElement backIconSeasonTwo;

    // Daily Streaks Card
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/streaks_score")
    public WebElement numberHeadingSeasonThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/streaks_title")
    public WebElement dailyStreaksSeasonThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/streaks_description")
    public WebElement consecutiveDaysinTheAppSeasonThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/streaks_view_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement viewSeasonThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_lineup_pred_title")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"DAILY STREAKS\"])[1]")
    public WebElement dailyStreaksScreenTitleThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/daily_streaks_score")
    public WebElement scoreNumberInCircleThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/dailystreak_description")
    public WebElement descriptionThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/daily_streak_best_score")
    public WebElement scoreNumberInRectangleThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/daily_streak_best_score_title")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"DAILY STREAKS\"])[2]")
    public WebElement bestScoreTextInRectangleThree;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/share_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SHARE\"]")
    public WebElement shareThree;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public WebElement backIconThree;

    // Appearance card
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_score")
    public WebElement numberHeadingSeasonFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_title")
    public WebElement appearanceTitleFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_description")
    public WebElement thisSeasonFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_view_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement viewSeasonFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_lineup_pred_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"APPEARANCES\"]")
    public WebElement appearancesInsideTitleFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_score")
    public WebElement appearanceScoreFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/appearance_description")
    public WebElement descriptionFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/last_appearance")
    public WebElement lastAppearanceFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/share_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SHARE\"]")
    public WebElement shareFour;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public WebElement backIconFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/favorite_player_heading")
    public List<WebElement> pickYourfavoritePlayerMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/edit_fav_player")
    public WebElement addIconfavoritePlayerMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CHOOSE PLAYER\"]")
    public WebElement choosePlayerTitleFavoritePlayerScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Men\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Men\"]")
    public WebElement menIconFavoritePlayerScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Women\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Women\"]")
    public WebElement womenIconFavoritePlayerScreen;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/ib_selection\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"plus circle gray\"])[1]")
    public WebElement selectPlayerNameFavoritePlayerScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/star_player_img")
    @iOSXCUITFindBy(accessibility = "star player icon")
    public WebElement starIconOnFavPalyer;

    @AndroidFindBy(accessibility = "Lisandro Martinez")
    @iOSXCUITFindBy(accessibility = "TomHeatonFROMEnglish")
    public WebElement playerNameInMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/buy_shirt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Buy Shirt\"]")
    public WebElement buyShirtIconMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/text_view_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOP\"]")
    public WebElement shopTitleFavPlayerShopScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_img")
    public WebElement playerImageInMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/imageinboxclose")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Share\"]")
    public WebElement crossIconInShopScreen;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/ib_selection\"])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
    public WebElement selectEditedPlayerScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/edit_fav_player")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]")
    public WebElement editIconfavoritePlayerMyUnitedScreen;

    @AndroidFindBy(accessibility = "Brandon Williams")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public WebElement editedPlayerNameMyUnitedScreen;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_country")
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
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_modal_header_text")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public List<WebElement> muappPopup1;
    @AndroidFindBy(accessibility = "OK")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public List<WebElement> okButtonMuApp;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_modal_header_text")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public List<WebElement> idfaVariantPopup;
    @AndroidFindBy(accessibility = "No")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public WebElement noButtonIdfaVariant;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_slideup_message")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public List<WebElement> inAppPopup;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_slideup_chevron")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public WebElement inAppSlideIcon;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_modal_header_text\"]")
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
    @iOSXCUITFindBy(accessibility = "Ask App Not to Track")
    public WebElement notToTrack;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/com_braze_inappmessage_modal_text_layout\"]")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public List<WebElement> mutvINAppPopUp;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    @iOSXCUITFindBy(accessibility = "BrandonWilliamsFROMEngland")
    public List<WebElement> closeIconMutvINAppPopUp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public List<WebElement> brazeINAppPopUp;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Manchester United Stage App\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement brazeINAppPopUp1;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_benefit")
    @iOSXCUITFindBy(accessibility = "MY UNITED BENEFITS")
    public List<WebElement> myUnitedBenefits;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/myunited_benefit")
    @iOSXCUITFindBy(accessibility = "VIEW BENEFITS")
    public List<WebElement> viewBenefits;
    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/parentLayout\"])")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY UNITED BENEFITS\"]/../../following-sibling::XCUIElementTypeCell")
    public List<WebElement> myUnitedBenefitsTiles;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/image\"])[1]")
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
    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textview2\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"plus circle gray\"])[1]/../XCUIElementTypeStaticText")
    public WebElement selectPlayerNameFavoritePlayerScreen1;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/textview2\"])[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
    public WebElement selectPlayerNameFavoritePlayerScreen2;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_first_name")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]/../XCUIElementTypeStaticText[1]")
    public WebElement playerFirstNameInMyUnitedScreen;
    
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/player_last_name")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]/../XCUIElementTypeStaticText[2]")
    public WebElement playerLastNameInMyUnitedScreen;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/ticket_card_title\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"MY TICKETS\"]")
    public WebElement myTicketsComponentMyUnited;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/text_view_title\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"My Tickets\"]")
     public WebElement myTicketsContentMyUnited;
    
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/back_imgView\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
     public WebElement backIconinMyTicketsMyUnited;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/stadium_card_title\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"STADIUM\"]")
     public WebElement stadiumComponentMyUnited;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/stadiumview_title\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"STADIUM\"]")
     public WebElement stadiumComponentContentMyUnited;
    
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/rv_search\"]/android.widget.LinearLayout/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY STICKERS\"]/../../../XCUIElementTypeCollectionView/XCUIElementTypeCell")
     public List<WebElement> stickersMyUnited;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/summary\" and @text=\"Chinese, Simplified\"]")
    //@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MY STICKERS\"]/../../../XCUIElementTypeCollectionView/XCUIElementTypeCell")
     public WebElement languageSwitchMyUnited;
    
}
