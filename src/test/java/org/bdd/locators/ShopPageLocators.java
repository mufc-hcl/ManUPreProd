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

public class ShopPageLocators {

	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id, \"navigation_bar_item_icon_view\")])[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Shop\"]")
	public WebElement shopTabIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MERCH\"]")
	@iOSXCUITFindBy(accessibility = "MERCH")
	public WebElement merchTabIconInShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"MEMBERSHIP\"]")
	@iOSXCUITFindBy(accessibility = "MEMBERSHIP")
	public WebElement membershipTabIconInShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"TICKETS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS\"]")
	public WebElement collectiblesIconInShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SHOPTAB\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOPTAB\"]")
	public WebElement storeTabIconInShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"TICKETS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS\"]")
	public WebElement ticketsTabIconInShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"STICKERS\"]")
	@iOSXCUITFindBy(accessibility = "STICKERS")
	public WebElement stickersTabIconInShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TRAINING')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TRAINING\"])[1]")
	public WebElement trainingText;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TICKETS & HOSPITALITY')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS & HOSPITALITY !\"]")
	public WebElement ticketsAndHospitalityText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HERO CARD\"]")
	public WebElement heroCardStickersShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'KITS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"KITS\"]")
	public WebElement kitsTitleStickersShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'UNITED ESSENTIALS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNITED ESSENTIALS\"]")
	public WebElement unitedEssentialsTitleStickersShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'COLLECTIONS CAROUSEL')]")
	@iOSXCUITFindBy(id = "COLLECTIONS CAROUSEL WITH ALL ...")
	public WebElement collectionsCoursoselTitleStickersShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'CATEGORY2')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CATEGORY2\"]")
	public WebElement catogory2TitleStickersShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'id/oops_text_view')]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"KITS\"]")
	public WebElement errorMessageTicketsShopScreen;

	@AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/error_retry_btn")
	public WebElement retryButtonTicketsShopScreen;

	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView[contains(@resource-id, 'tabDots')]/android.widget.LinearLayout/android.widget.LinearLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther")
	public List<WebElement> heroCardsDotMutvPage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement heroCarouselmembershipShopScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public List<WebElement> heroCarouselmembershipShopScreen1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell/XCUIElementTypeOther")
	public List<WebElement> heroCarouselDotsmembershipShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TRAINING')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRAINING\"]")
	public List<WebElement> trainingText1;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TICKETS & HOSPITALITY')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS & HOSPITALITY !\"]")
	public List<WebElement> ticketsAndHospitalityText1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SHOPTAB\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SHOPTAB\"]")
	public WebElement sHopTabIconInShopScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRENDING\"]")
	public WebElement trendingMembershiPage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PLAYERS\"]")
	public WebElement playersMembershiPage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]")
	public WebElement heroCarouselShopTab;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"KITS\"]")
	public WebElement kitsTitleMembershipScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNITED ESSENTIALS\"]")
	public WebElement unitedEssentialsTitleMembershipScreen;

	@iOSXCUITFindBy(id = "COLLECTIONS CAROUSEL WITH ALL ...")
	public WebElement collectionsCoursoselTitleMembershipScreen;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TRAINING\"])[1]")
	public WebElement trainingTextMembershipScreen;

	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView//android.widget.LinearLayout//android.widget.LinearLayout//android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell//XCUIElementTypeStaticText")
	public List<WebElement> shopTabMenuItems;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'KITS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"KITS\"]")
	public WebElement carosel1ForKitsShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TRENDING')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRENDING\"]")
	public WebElement membershipBenifitsShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'PLAYERS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PLAYERS\"]")
	public WebElement helpAndInfoShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRAINING\"]")
	public WebElement carosel1ForKitsCollectbilesShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'COLLECTIBLES CLAIM YOURS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COLLECTIBLES CLAIM YOURS\"]")
	public WebElement collectbilesClaimYoursShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'COLLECTIONS & REWARDS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COLLECTIONS & REWARDS\"]")
	public WebElement collectionsAndRewardsShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TRAINING')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"TRAINING\"])[2]")
	public WebElement carousel1ForKITSStoreShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'UNITED ESSENTIALS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRENDING\"]")
	public WebElement trendingStoreShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'PLAYERS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"UNITED ESSENTIALS\"]")
	public WebElement playersStoreShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TICKETS & HOSPITALITY')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TICKETS & HOSPITALITY \"]")
	public WebElement ticketsAndHospitalityStoreShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'TRAINING')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRAINING\"]")
	public WebElement trainingStoreShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textview_header_new') and contains(@text, 'COLLECTIONS')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COLLECTIONS\"]")
	public WebElement collectionsStoreShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textViewHeading')]")
	// @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COLLECTIONS\"]")
	public WebElement heroCarouselMembershipShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textViewHeading')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personalise your shirt\"]")
	public WebElement heroCarouselCollectiblesShop;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'textViewHeading')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Invalid Thumbnail and Valid BG Video !\"]")
	public WebElement heroCarouselStoreShop;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'continueBtn')]")
	@iOSXCUITFindBy(xpath = "//*[contains(@text,'CONTINUE')]")
	public List<WebElement> continueAlertShopScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Spring Sale\"]")
	public List<WebElement> springSaleMerchTab;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Spring Sale\"]")
	public List<WebElement> springSaleMerchTabInIOS;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Shop By Category\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Shop By Category\"]")
	public WebElement shopByCategoryMerchTab;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"__nuxt\"]/android.view.View/android.view.View[1]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeLink")
	public List<WebElement> heroCarouselEnabledShop;

	@AndroidFindBy(xpath = "//*[contains(@resource-id, 'framelayout_tabwidget_parent')]")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"OK\"`]")
	public WebElement okButtonCookiesScreenInShop;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='My Library']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='navbar shop menu']")
	public WebElement shopLibraryHamburgerIconInShopPage;

	// without env
	// //android.widget.ImageView[@resource-id="com.mu.muclubapp.staging_mu_dxc:id/imgClose"]
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, ':id/imgClose')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Button']")
	public WebElement closeIconInHamburgerInShopPage;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"__nuxt\"]/android.view.View[2]/android.view.View[1]/android.widget.TextView ")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeStaticText")
	public List<WebElement> hamburgerMenuItems;

	// android.view.ViewGroup[@resource-id="com.mu.muclubapp.staging_mu_dxc:id/framelayout_tabwidget_parent"]
	// android.view.ViewGroup[contains(@resource-id,
	// ':id/framelayout_tabwidget_parent')]
	// android.webkit.WebView[@resource-id="com.mu.muclubapp.staging_mu_dxc:id/web_view"]
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id, ':id/web_view')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public WebElement okButtonCookiesScreenInStore;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id, ':id/framelayout_tabwidget_parent')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public WebElement okButtonCookiesScreenInStore1;

	@AndroidFindBy(xpath = "(//android.view.View[contains(@resource-id, 'product-')]/android.view.View[1]/android.widget.Button)[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
	public List<WebElement> firstProductButtonInStorePage;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Wishlist']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Wishlist\"])[1]")
	public List<WebElement> firstWishListButtonInStorePage;

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"M\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"M\"]")
	public List<WebElement> productSizeinStorePage;

//	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ADD TO BAG\"]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD TO BAG\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'ADD TO BAG') or contains(@text, 'ADD TO BASKET')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name, 'ADD TO BAG') or contains(@name, 'ADD TO BASKET')]")
	public WebElement addtoBagButtonInStorePage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Added to bag!']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Added to bag!'])[2]")
	public List<WebElement> addedtoBagLabelInStorePage;

	// XCUIElementTypeStaticText[@name="1 product"]
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Your Bag') or contains(@text, 'Basket')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name, 'Your Bag') or contains(@name, 'Basket')]")
	public List<WebElement> yourBagLabelInStorePage;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='CHECKOUT']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CHECKOUT']")
	public List<WebElement> checkoutinStorePage;

	// @AndroidFindBy(xpath =
	// "//android.view.ViewGroup[@resource-id=\"com.mu.muclubapp.staging_mu_dxc:id/framelayout_tabwidget_parent\"]")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id, ':id/framelayout_tabwidget_parent')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeLink[@name='BAG'])[2]")
	public WebElement bagButtonInStorePage;

	// @AndroidFindBy(xpath =
	// "//android.widget.ImageView[@resource-id=\"com.mu.muclubapp.staging_mu_dxc:id/img_wishlist\"]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, ':id/img_wishlist')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='navbar wishlist black']")
	public WebElement wishListButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wishlist 1 product']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Wishlist 1 product']")
	public WebElement wishListLabel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wishlist']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wishlist']")
	public List<WebElement> wishListTitle;

	@AndroidFindBy(xpath = "(//android.widget.Image)[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[1]")
	public List<WebElement> firstWishListProductImage;

	@AndroidFindBy(accessibility = "go back")
	@iOSXCUITFindBy(accessibility = "go back")
	public WebElement backArrowInWishlistScreen;
	
	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"__nuxt\"]/android.view.View[2]/android.view.View[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[1]")
	public WebElement heroCardInShopScreen;

}
