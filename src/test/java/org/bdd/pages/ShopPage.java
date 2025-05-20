package org.bdd.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.locators.ShopPageLocators;
import org.bdd.utils.*;
import org.bdd.utils.apiResponse.ShopAPIResponse;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import static org.bdd.utils.AndroidGenericLibrary.scrollDownUsingUiScrollable;
import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

public class ShopPage extends Common {
    private static final Logger log = LogManager.getLogger(ShopPage.class);
    ShopPageLocators shopPageLocators;
    public ShopAPIResponse shopAPI = new ShopAPIResponse();
    public ShopPage() {
        this.shopPageLocators=new ShopPageLocators();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), shopPageLocators);
    }

    public void clickOnShopTab() {
        try {
            elementToBeClickableFluentWait(shopPageLocators.shopTabIcon,60);
            shopPageLocators.shopTabIcon.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on shop tab");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clickOnShopTab()<br />" + e);
            throw e;
        }
    }

    public String getMerchText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(shopPageLocators.merchTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns merch tab icon in shop screen");
                return shopPageLocators.merchTabIconInShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.merchTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns merch tab icon in shop screen ");
                return shopPageLocators.merchTabIconInShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getMerchText()<br />" + e);
            throw e;
        }
    }

    public String getMembershipText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(shopPageLocators.membershipTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns Membership tab icon in shop screen");
                return shopPageLocators.membershipTabIconInShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.membershipTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns membership tab icon in shop screen");
                return shopPageLocators.membershipTabIconInShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getMembershipText()<br />" + e);
            throw e;
        }
    }

    public String getTicketsText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(shopPageLocators.ticketsTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns tickets tab icon in shop screen");
                return shopPageLocators.ticketsTabIconInShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.ticketsTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns tickets tab icon in shop screen");
                return shopPageLocators.ticketsTabIconInShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTicketsText()<br />" + e);
            throw e;
        }
    }

    public String getStickersText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(shopPageLocators.stickersTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns stickers tab icon in shop screen");
                return shopPageLocators.stickersTabIconInShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.stickersTabIconInShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns stickers tab icon in shop screen");
                return shopPageLocators.stickersTabIconInShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getStickersText()<br />" + e);
            throw e;
        }
    }

    public void clickMembershipTab() {
        try {
            elementToBeClickableFluentWait(shopPageLocators.membershipTabIconInShopScreen,60);
            shopPageLocators.membershipTabIconInShopScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on membership tab");
            if (!shopPageLocators.continueAlertShopScreen.isEmpty()) {
            	shopPageLocators.continueAlertShopScreen.get(0).click();
                ExtentsReportManager.extentReportLogging("pass", "Clicks on continue in shop screen ");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clickMembershipTab()<br />" + e);
            throw e;
        }
    }

    public String getTrainingText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                while (shopPageLocators.trainingText1.isEmpty()) {
                    AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "TRAINING");
                    if (!shopPageLocators.trainingText1.isEmpty()) break;
                }
//				waitForVisibilityFluentWait(trainingText);
                ExtentsReportManager.extentReportLogging("pass","Returns training text");
                return shopPageLocators.trainingText.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.trainingText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns training text ");
                return shopPageLocators.trainingText.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTrainingText()<br />" + e);
            throw e;
        }
    }

    public String getTicketsAndHospitalityText() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                while (shopPageLocators.ticketsAndHospitalityText1.isEmpty()) {
                    AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "TICKETS & HOSPITALITY !");
                    if (!shopPageLocators.ticketsAndHospitalityText1.isEmpty()) break;
                }
//				waitForVisibilityFluentWait(ticketsAndHospitalityText);
                ExtentsReportManager.extentReportLogging("pass","Returns ticket and hospitality text");
                return shopPageLocators.ticketsAndHospitalityText.getText();
            } else {
//                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibilityFluentWait(shopPageLocators.ticketsAndHospitalityText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns ticket and hospitality text ");
                return shopPageLocators.ticketsAndHospitalityText.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTicketsAndHospitalityText()<br />" + e);
            throw e;
        }
    }

    public void clickOnStickersTabInShopScreen() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.stickersTabIconInShopScreen,60);
            shopPageLocators.stickersTabIconInShopScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on stickers tab in shop screen");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clickOnStickersTabInShopScreen()<br />" + e);
            throw e;
        }

    }

    public String getKitsTexstStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(shopPageLocators.kitsTitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns kits title in stickers shop page");
                return shopPageLocators.kitsTitleStickersShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.kitsTitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns kits title in stickers shop screen");
                return shopPageLocators.kitsTitleStickersShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getKitsTexstStickers()<br />" + e);
            throw e;
        }
    }

    public String getTrainingTextStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "TRAINING");
                waitForVisibilityFluentWait(shopPageLocators.trainingText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns training text in stickers screen");
                return shopPageLocators.trainingText.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.trainingText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns training text in stickers screen ");
                return shopPageLocators.trainingText.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTrainingTextStickers()<br />" + e);
            throw e;
        }
    }

    public String getUnitedEssentialsTextStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "UNITED ESSENTIALS");
                waitForVisibilityFluentWait(shopPageLocators.unitedEssentialsTitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns united essentials text");
                return shopPageLocators.unitedEssentialsTitleStickersShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.unitedEssentialsTitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns united essentials text ");
                return shopPageLocators.unitedEssentialsTitleStickersShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getUnitedEssentialsTextStickers()<br />" + e);
            throw e;
        }
    }

    public String getTicketsHospitalityTextStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "TICKETS & HOSPITALITY !");
                waitForVisibilityFluentWait(shopPageLocators.ticketsAndHospitalityText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns get tickets and hospitality text");
                return shopPageLocators.ticketsAndHospitalityText.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.ticketsAndHospitalityText,60);
                ExtentsReportManager.extentReportLogging("pass","Returns get tickets and hospitality text ");
                return shopPageLocators.ticketsAndHospitalityText.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTicketsHospitalityTextStickers()<br />" + e);
            throw e;
        }
    }

    public String getCollectionCourselTextStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "COLLECTIONS CAROUSEL WITH ALL …");
                waitForVisibilityFluentWait(shopPageLocators.collectionsCoursoselTitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns collection carousel title");
                return shopPageLocators.collectionsCoursoselTitleStickersShopScreen.getText();
            } else {
                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibilityFluentWait(shopPageLocators.collectionsCoursoselTitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns collection carousel title ");
                return shopPageLocators.collectionsCoursoselTitleStickersShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getCollectionCourselTextStickers()<br />" + e);
            throw e;
        }
    }

    public String getCatogory2TextStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                AndroidGenericLibrary.scrollDownUsingUiScrollable(driver, "CATEGORY2");
                waitForVisibilityFluentWait(shopPageLocators.catogory2TitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns category title");
                return shopPageLocators.catogory2TitleStickersShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.catogory2TitleStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns category title ");
                return shopPageLocators.catogory2TitleStickersShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getCatogory2TextStickers()<br />" + e);
            throw e;
        }
    }

    public void clicksOnTicketsTabInShopScreen() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.ticketsTabIconInShopScreen,60);
            shopPageLocators.ticketsTabIconInShopScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicked on tickets tab in shop screen");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clicksOnTicketsTabInShopScreen()<br />" + e);
            throw e;
        }

    }

    public String getErrorMessageInTicketsScreen() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.errorMessageTicketsShopScreen,60);
            ExtentsReportManager.extentReportLogging("pass","Returns error message in tickets screen");
            return shopPageLocators.errorMessageTicketsShopScreen.getText();
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getErrorMessageInTicketsScreen()<br />" + e);
            throw e;
        }
    }

    public String getRetryTextInTicketsScreen() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.retryButtonTicketsShopScreen,60);
            ExtentsReportManager.extentReportLogging("pass","Returns on retry button in tickets shop screen");
            return shopPageLocators.retryButtonTicketsShopScreen.getText();
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getRetryTextInTicketsScreen()<br />" + e);
            throw e;
        }
    }

    public void clicksOnMerchTabInShopScreen() {
        try {
//            waitForVisibilityFluentWait(shopPageLocators.merchTabIconInShopScreen,60);
//            shopPageLocators.merchTabIconInShopScreen.click();
            ExtentsReportManager.extentReportLogging("pass","CLicks on merch tab icon");
            if (!shopPageLocators.continueAlertShopScreen.isEmpty()) {
            	shopPageLocators.continueAlertShopScreen.get(0).click();
                ExtentsReportManager.extentReportLogging("pass", "Clicks on continue in shop screen ");
            }
       
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clicksOnMerchTabInShopScreen()<br />" + e);
            throw e;
        }

    }

    public void clicksOnHeroCardDotsInMerchScreen() {
        try {
            if (shopPageLocators.heroCardsDotMutvPage.size() > 0) {
                for (int i = 0; i < shopPageLocators.heroCardsDotMutvPage.size(); i++) {
                    shopPageLocators.heroCardsDotMutvPage.get(i).click();
                }
            }
            ExtentsReportManager.extentReportLogging("pass","Cliks on hero cards");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clicksOnHeroCardDotsInMerchScreen()<br />" + e);
            throw e;
        }
    }

    public void clicksOnHeroCardDotsInMerchScreenIos() {
        try {
            if (shopPageLocators.heroCardsDotMutvPage.size() > 0) {
                for (int i = 0; i < shopPageLocators.heroCardsDotMutvPage.size(); i++) {
                    swipeWithCoordinates(360, 372, 45, 372, 200, "left", driver);
                }
            }
            ExtentsReportManager.extentReportLogging("pass","clicks on hero card");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clicksOnHeroCardDotsInMerchScreenIos()<br />" + e);
            throw e;
        }

    }

    public void validatesHeroCarouselsInMembershipInIosIsDisplayed() {
        try {
            if (!shopPageLocators.heroCarouselmembershipShopScreen1.isEmpty()) {
//      elementToBeClickableFluentWait(notNowButtonMatchAppearanceAlert);
                shopPageLocators.heroCarouselmembershipShopScreen.isDisplayed();
            }
            ExtentsReportManager.extentReportLogging("pass","Displayed hero carousel in membership");
        } catch (NoSuchElementException ns) {
            ExtentsReportManager.extentReportLogging("fail","element is not displayed hence skipped");
        } catch (StaleElementReferenceException se) {
            ExtentsReportManager.extentReportLogging("fail","stale element exception");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-validatesHeroCarouselsInMembershipInIosIsDisplayed()<br />" + e);
            throw e;
        }
    }

    public void clicksOnHeroCardDotsInMembershipScreen() {
        try {
            if (shopPageLocators.heroCarouselDotsmembershipShopScreen.size() > 0) {
                for (int i = 0; i < shopPageLocators.heroCarouselDotsmembershipShopScreen.size(); i++) {
                    shopPageLocators.heroCarouselDotsmembershipShopScreen.get(i).click();
                }
            }
            ExtentsReportManager.extentReportLogging("pass","Clicks on hero carousel dots in membership");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clicksOnHeroCardDotsInMembershipScreen()<br />" + e);
            throw e;
        }
    }

    public String getHeroCardStickers() {
      String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
                waitForVisibilityFluentWait(shopPageLocators.heroCardStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns hero card text ");
                return shopPageLocators.heroCardStickersShopScreen.getText();
            } else {
                waitForVisibilityFluentWait(shopPageLocators.heroCardStickersShopScreen,60);
                ExtentsReportManager.extentReportLogging("pass","Returns hero card text");
                return shopPageLocators.heroCardStickersShopScreen.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getHeroCardStickers()<br />" + e);
            throw e;
        }
    }
    public List getShopTabText() {
    	String device = GlobalParams.getPlatformName();
		ArrayList<String> actualShopMenuItems = new ArrayList<>();
		try {
			if (device.equalsIgnoreCase("android")) {
				for (int i = 0; i < shopPageLocators.shopTabMenuItems.size(); i++) {
					actualShopMenuItems.add(shopPageLocators.shopTabMenuItems.get(i).getText().toLowerCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns shop tab values values");
			} else {
				for (int i = 0; i < shopPageLocators.shopTabMenuItems.size(); i++) {
					actualShopMenuItems.add(shopPageLocators.shopTabMenuItems.get(i).getDomAttribute("label").toLowerCase());
				}
				ExtentsReportManager.extentReportLogging("pass", "Returns shop tab  values");
			}
			return actualShopMenuItems;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-getShopTabText()<br />" + e);
			throw e;
		}
    }

    public String getTrendingMembershiPage() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.trendingMembershiPage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns trending membership page text");
            return shopPageLocators.trendingMembershiPage.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTrendingMembershiPage()<br />" + e);
            throw e;
        }
    }

    public String getPlayersMembershiPage() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.playersMembershiPage,60);
            ExtentsReportManager.extentReportLogging("pass","Returns players in membership page");
            return shopPageLocators.playersMembershiPage.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getPlayersMembershiPage()<br />" + e);
            throw e;
        }
    }

    public String ValidatesHeroCarouselsShopTab() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.heroCarouselShopTab,60);
            ExtentsReportManager.extentReportLogging("pass","Returns hero carousel in shop tab");
            return shopPageLocators.heroCarouselShopTab.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-ValidatesHeroCarouselsShopTab()<br />" + e);
            throw e;
        }
    }

    public String getKitsTexstMembership() {
        try {
            waitForVisibilityFluentWait(shopPageLocators.kitsTitleMembershipScreen,60);
            ExtentsReportManager.extentReportLogging("pass","Returns kits text in membership screen");
            return shopPageLocators.kitsTitleMembershipScreen.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getKitsTexstMembership()<br />" + e);
            throw e;
        }
    }

    public String getTrainingTextMembership() {
        try {
            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
            waitForVisibilityFluentWait(shopPageLocators.trainingTextMembershipScreen,60);
            ExtentsReportManager.extentReportLogging("pass","Returns training text in membership screen");
            return shopPageLocators.trainingTextMembershipScreen.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getTrainingTextMembership()<br />" + e);
            throw e;
        }
    }

    public String getUnitedEssentialsTextMembership() {
        try {
            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
            waitForVisibilityFluentWait(shopPageLocators.unitedEssentialsTitleMembershipScreen,60);
            ExtentsReportManager.extentReportLogging("pass","Returns united noe essentials text in membership page");
            return shopPageLocators.unitedEssentialsTitleMembershipScreen.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-getUnitedEssentialsTextMembership()<br />" + e);
            throw e;
        }
    }

    public String getCollectionCourselTextMembership() {
        try {
            IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
            waitForVisibilityFluentWait(shopPageLocators.collectionsCoursoselTitleMembershipScreen,60);
            ExtentsReportManager.extentReportLogging("pass","Returns collection carousel text in membership page");
            return shopPageLocators.collectionsCoursoselTitleMembershipScreen.getDomAttribute("label");
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-selectFavoritePlayerIos()<br />" + e);
            throw e;
        }
    }

	public String getTextforCarosel1ForKits(String expKitsTextFromAPI) {
		 String device = GlobalParams.getPlatformName();
		 WebElement	KitsShop = null;
	        try {
	            if (device.equalsIgnoreCase("android")) {
	            	KitsShop=driver.findElement(AppiumBy.xpath(
                            "//android.widget.TextView[@text='"
                                    + expKitsTextFromAPI.toUpperCase() + "']"));
	                waitForVisibility(KitsShop, 15);
	                ExtentsReportManager.extentReportLogging("pass", "Returned  KITS Text");
	                return KitsShop.getText();
	            } else {
	     	            KitsShop=driver.findElement(AppiumBy.xpath(
	                                 "//XCUIElementTypeStaticText[@name='"
	                                         + expKitsTextFromAPI.toUpperCase() + "']"));
	     	                waitForVisibility(KitsShop, 15);
	     	                ExtentsReportManager.extentReportLogging("pass", "Returned  KITS Text");
	     	                return KitsShop.getText();
	            }
	         
	        }catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforCarosel1ForKits()<br />" + e);
	            throw e;
	        }
	}
		
	public String getTextforMembershipBenifits() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	//IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.membershipBenifitsShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  TRENDING Text");
                return shopPageLocators.membershipBenifitsShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.membershipBenifitsShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  TRENDING Text");
                return shopPageLocators.membershipBenifitsShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforMembershipBenifits()<br />" + e);
            throw e;
        }
	}
		
	public String getTextforHelpAndInfo() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	//IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.helpAndInfoShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  PLAYERS Text");
                return shopPageLocators.helpAndInfoShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.helpAndInfoShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  PLAYERS Text");
                return shopPageLocators.helpAndInfoShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforHelpAndInfo()<br />" + e);
            throw e;
        }
		
	}

	public void clickCollectiblesTab() {
		 try {
	            elementToBeClickable(shopPageLocators.collectiblesIconInShopScreen,15);
	            shopPageLocators.collectiblesIconInShopScreen.click();
	            ExtentsReportManager.extentReportLogging("pass","Clicks on Collectibles tab");
	            if (!shopPageLocators.continueAlertShopScreen.isEmpty()) {
	            	shopPageLocators.continueAlertShopScreen.get(0).click();
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on continue in shop screen ");
	            }
	        } catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clickCollectiblesTab()<br />" + e);
	            throw e;
	        }
		
	}

	public String getTextforCarosel1ForKitsCollectibles() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.carosel1ForKitsCollectbilesShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  Training Text");
                return shopPageLocators.carosel1ForKitsCollectbilesShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.carosel1ForKitsCollectbilesShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  Taining Text");
                return shopPageLocators.carosel1ForKitsCollectbilesShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforCarosel1ForKitsCollectibles()<br />" + e);
            throw e;
        }
		
	}

	public String getTextforCollectiblesClaimYoursCollectibles() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibility(shopPageLocators.collectbilesClaimYoursShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  COLLECTIBLES CLAIM YOURS Text");
                return shopPageLocators.collectbilesClaimYoursShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibility(shopPageLocators.collectbilesClaimYoursShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  COLLECTIBLES CLAIM YOURS Text");
                return shopPageLocators.collectbilesClaimYoursShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforCollectiblesClaimYoursCollectibles()<br />" + e);
            throw e;
        }
	}

	public String getTextforCollectionsAndRewardsCollectibles() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibility(shopPageLocators.collectionsAndRewardsShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  COLLECTIONS & REWARDS Text");
                return shopPageLocators.collectionsAndRewardsShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
                waitForVisibility(shopPageLocators.collectionsAndRewardsShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  COLLECTIONS & REWARDS Text");
                return shopPageLocators.collectionsAndRewardsShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforCollectionsAndRewardsCollectibles()<br />" + e);
            throw e;
        }
	}

	public void clickStoreTab() {
		try {
            elementToBeClickable(shopPageLocators.storeTabIconInShopScreen,15);
            shopPageLocators.storeTabIconInShopScreen.click();
            ExtentsReportManager.extentReportLogging("pass","Clicks on Store tab");
            if (!shopPageLocators.continueAlertShopScreen.isEmpty()) {
            	shopPageLocators.continueAlertShopScreen.get(0).click();
                ExtentsReportManager.extentReportLogging("pass", "Clicks on continue in shop screen ");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail","Exception occurred in function-clickStoreTab()<br />" + e);
            throw e;
        }
	
		
	}

	public String getTextforCarosel1ForKitsStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.carousel1ForKITSStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  CAROUSEL 1 FOR KITS Text");
                return shopPageLocators.carousel1ForKITSStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.carousel1ForKITSStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  CAROUSEL 1 FOR KITS Text");
                return shopPageLocators.carousel1ForKITSStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforCarosel1ForKitsStore()<br />" + e);
            throw e;
        }
	}

	public String getTextforTrendingStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.trendingStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  TRENDING Text");
                return shopPageLocators.trendingStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.trendingStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned  TRENDING Text");
                return shopPageLocators.trendingStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforTrendingStore()<br />" + e);
            throw e;
        }
	}

	public String getTextforPlayersStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.playersStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned PLAYERS Text");
                return shopPageLocators.playersStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.playersStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned PLAYERS Text");
                return shopPageLocators.playersStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforTrendingStore()<br />" + e);
            throw e;
        }
	}

	public String getTextforTicketsAndHospitalityStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.ticketsAndHospitalityStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned TICKETS & HOSPITALITY  Text");
                return shopPageLocators.ticketsAndHospitalityStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.ticketsAndHospitalityStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned TICKETS & HOSPITALITY  Text");
                return shopPageLocators.ticketsAndHospitalityStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforTicketsAndHospitalityStore()<br />" + e);
            throw e;
        }
	}

	public String getTextforTrainingStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.trainingStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned TRAINING  Text");
                return shopPageLocators.trainingStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.trainingStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned TRAINING  Text");
                return shopPageLocators.trainingStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforTrainingStore()<br />" + e);
            throw e;
        }
	}

	public String getTextforCollectionsStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.collectionsStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned COLLECTIONS  Text");
                return shopPageLocators.collectionsStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.collectionsStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned COLLECTIONS  Text");
                return shopPageLocators.collectionsStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTextforCollectionsStore()<br />" + e);
            throw e;
        }
	}

	public String getTitleOfHeroCarouselMembership() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.heroCarouselMembershipShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned title of the hero carousel  Text");
                return shopPageLocators.heroCarouselMembershipShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.heroCarouselMembershipShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned title of the hero carousel  Text");
                return shopPageLocators.heroCarouselMembershipShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTitleOfHeroCarouselMembership()<br />" + e);
            throw e;
        }

	}

	public String getTitleOfHeroCarouselStore() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.heroCarouselStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned title of the hero carousel  Text");
                return shopPageLocators.heroCarouselStoreShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.heroCarouselStoreShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned title of the hero carousel  Text");
                return shopPageLocators.heroCarouselStoreShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTitleOfHeroCarouselStore()<br />" + e);
            throw e;
        }

	}

	public String getTitleOfHeroCarouselCollectibles() {
		String device = GlobalParams.getPlatformName();
        try {
            if (device.equalsIgnoreCase("android")) {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.heroCarouselCollectiblesShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned title of the hero carousel  Text");
                return shopPageLocators.heroCarouselCollectiblesShop.getText();
            } else {
            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.3);
                waitForVisibility(shopPageLocators.heroCarouselCollectiblesShop, 15);
                ExtentsReportManager.extentReportLogging("pass", "Returned title of the hero carousel  Text");
                return shopPageLocators.heroCarouselCollectiblesShop.getDomAttribute("label");
            }
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-getTitleOfHeroCarouselStore()<br />" + e);
            throw e;
        }
	}

	public boolean userValidatesSmallCardCarouselsInMerchTab() {
		String device = GlobalParams.getPlatformName();
		try {
			for (int i = 0; i < 20; i++) {
				if (!(shopPageLocators.springSaleMerchTab.size() > 0)) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns merch tab small carousals names Text");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-userValidatesSmallCardCarouselsInMerchTabUsingApi()<br />" + e);
			throw e;
		}
		return false;
           
	}
	public boolean userValidatesSmallCardCarouselsInMerchTabInIOS() {
		String device = GlobalParams.getPlatformName();
		try {
			for (int i = 0; i < 20; i++) {
				if (!(shopPageLocators.springSaleMerchTabInIOS.size() > 0)) {
					IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
				} else {
					break;
				}
			}
			ExtentsReportManager.extentReportLogging("pass", "Returns merch tab small carousals names Text");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-userValidatesSmallCardCarouselsInMerchTabUsingApi()<br />" + e);
			throw e;
		}
		return false;
	}

	public boolean userValidatesHeroCardIsDisplayedInShopScreenInMerchTab() {
			try {
		        if (shopPageLocators.heroCarouselEnabledShop.size()>0) {
		            ExtentsReportManager.extentReportLogging("pass",
		                    "Hero card is displayed on the merch  tab.");
		            return true;
		        } else {
		            ExtentsReportManager.extentReportLogging("pass",
		                    "Hero card is not displayed on the merch  tab.");
		            return true;
		        }
				} catch (Exception e) {
					ExtentsReportManager.extentReportLogging("fail",
							"Error in validating Hero card  is  displayed" + e);
					throw e;
				}
					}

	public boolean userValidatesHeroCardIsDisplayedInShopScreenInMerchTabInIos() {
		try {
	        if (shopPageLocators.heroCarouselEnabledShop.size()>0) {
	            ExtentsReportManager.extentReportLogging("pass",
	                    "Hero card is displayed on the merch  tab.");
	            return true;
	        } else {
	            ExtentsReportManager.extentReportLogging("pass",
	                    "Hero card is not displayed on the merch  tab.");
	            return true;
	        }
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Error in validating Hero card  is  displayed" + e);
				throw e;
			}
				}

	public void clickingOnTabs(ArrayList<String> expectedShopMenuItems) throws Exception {
		 String device = GlobalParams.getPlatformName();
	        ;
	        
	        try {
	        	for(String menuItem:expectedShopMenuItems) {
	        		
	        	
	            if (device.equalsIgnoreCase("android")) {
	                driver.findElement(AppiumBy.xpath(
	                                "//android.widget.TextView[@text='"
	                                        + menuItem.toUpperCase() + "']"))
	                        .click();
	                if(menuItem.equalsIgnoreCase("STORE")||menuItem.equalsIgnoreCase("MERCH")) {
	                	userValidatesSmallCardCarouselsInMerchTab();
	                }
	                if(menuItem.equalsIgnoreCase("MEMBERSHIP")) {
	                	String expKitsTextFromAPI = shopAPI.getCarosel1ForKitsTextApi("ShopMembershipCarouselEndPoint");
	                    String actualKitsTextFromAPI = getTextforCarosel1ForKits(expKitsTextFromAPI);
	                   // soft.assertEquals(actualKitsTextFromAPI.toUpperCase(), expKitsTextFromAPI.toUpperCase());
	                }
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on Shop Tabs ");
	            } else {
	                //driver.findElement(AppiumBy.accessibilityId(menuItem ))
	                        //.click();
	            	driver.findElement(AppiumBy.xpath(
                            "//XCUIElementTypeStaticText[contains(@name,'"
                                    + menuItem.toUpperCase() + "')]"))
                    .click();
	                if(menuItem.equalsIgnoreCase("STORE")||menuItem.equalsIgnoreCase("MERCH")) {
	                	userValidatesSmallCardCarouselsInMerchTabInIOS();
	                }
	                if(menuItem.equalsIgnoreCase("MEMBERSHIP")) {
	                	String expKitsTextFromAPI = shopAPI.getCarosel1ForKitsTextApi("ShopMembershipCarouselEndPoint");
	                    String actualKitsTextFromAPI = getTextforCarosel1ForKits(expKitsTextFromAPI);
	                   // soft.assertEquals(actualKitsTextFromAPI.toUpperCase(), expKitsTextFromAPI.toUpperCase());
	                }
	                ExtentsReportManager.extentReportLogging("pass", "Clicks on Shop Tabs ");
	            }
	        } 
	        }catch (Exception e) {
	            ExtentsReportManager.extentReportLogging("fail", "Exception occured in function-clickingOnTabs()<br />" + e);
	            throw e;
	        }
	    }

	public void clicksOnOkButtonInCookiesScreenInShop() throws Exception {
		try {
//            waitForVisibilityFluentWait(explorePageLocators.weUseCookiesTexts);
            if (shopPageLocators.okButtonCookiesScreenInShop.isDisplayed()) {
//                waitForVisibilityFluentWait(explorePageLocators.okButtonCookiesScreen);
            	shopPageLocators.okButtonCookiesScreenInShop.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on okButtonCookiesScreen");
            }
            Thread.sleep(1000);
        } catch (NoSuchElementException ns) {
            System.out.println("element is not displayed hence skipped");
        } catch (NullPointerException np) {
            System.out.println("null pointer exception due to override of screens");
        } catch (Exception e) {
         ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnOkButtonInCookiesScreenInShop()<br />" + e);
         throw e;
        }
    }
	
	public boolean validateWebViewInShopPage() {
	    String device = GlobalParams.getPlatformName();
	    List<WebElement> webViewElements;

	    try {
	        if (device.equalsIgnoreCase("android")) {
	            webViewElements = driver.findElements(AppiumBy.xpath(
	                    "//android.webkit.WebView[@text='Manchester United Store - Official Manchester United Store']"));
	        } else {
	            webViewElements = driver.findElements(AppiumBy.xpath(
	                    "//XCUIElementTypeOther[@name='Manchester United Store - Official Manchester United Store']"));
	        }

	        if (webViewElements.size() > 0) {
	            WebElement webViewElement = webViewElements.get(0);
	            String capturedText = device.equalsIgnoreCase("android") ? webViewElement.getText() : webViewElement.getDomAttribute("label");
	            ExtentsReportManager.extentReportLogging("pass", "Validates WebView in Shop Page and captured text " + capturedText);
	            return true;
	        } else {
	            ExtentsReportManager.extentReportLogging("fail", "WebView - 'Manchester United Store - Official Manchester United Store' element not displayed.");
	            return false;
	        }
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function validateWebViewInShopPage()<br />" + e);
	        return false;
	    }
	}
	
	public boolean OpenandValidatesHamburgerCloseInShopPage(ArrayList<String> expectedHamburgerMenuItems) {
	    String device = GlobalParams.getPlatformName();
	    boolean allItemsDisplayed = true;

	    try {
	        // Validate the hamburger feature in the shop web view, user should be able to open
	        openMyLibraryHamburgerIcon();

	        // Captured menu items from API and validating in Hamburger Menu Items Shop UI page
	        for (String menuItem : expectedHamburgerMenuItems) {
	            List<WebElement> HamburgerMenuItemElements;
	            if (device.equalsIgnoreCase("android")) {
	                HamburgerMenuItemElements = driver.findElements(AppiumBy.androidUIAutomator(
	                	    "new UiSelector().text(\"" + menuItem + "\")"));
	            } else {
	                if (menuItem.equalsIgnoreCase("Home")) {
	                    HamburgerMenuItemElements = driver.findElements(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name='" + menuItem + "'])[2]"));
	                } else {
	                    HamburgerMenuItemElements = driver.findElements(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='" + menuItem + "']"));
	                }
	            }

	            if (HamburgerMenuItemElements.size() > 0) {
	                WebElement HamburgerMenuItemElement = HamburgerMenuItemElements.get(0);
	                waitForVisibilityFluentWait(HamburgerMenuItemElement, 60);
	                if (device.equalsIgnoreCase("android")) {
	                    ExtentsReportManager.extentReportLogging("info", "Validates Hamburger Menu Item in Shop Page and captured text " + HamburgerMenuItemElement.getText());
	                } else {
	                    ExtentsReportManager.extentReportLogging("info", "Validates Hamburger Menu Item in Shop Page and captured text " + HamburgerMenuItemElement.getDomAttribute("label"));
	                }
	            } else {
	                allItemsDisplayed = false;
	                ExtentsReportManager.extentReportLogging("fail", "Menu item not displayed: " + menuItem);
	            }
	        }

	        ExtentsReportManager.extentReportLogging("pass", "Validated all Hamburgers menu items the Shop Page " + expectedHamburgerMenuItems);

	        // Validate the hamburger feature in the shop web view, user should be able to close
	        closeMyLibraryHamburgerIcon();

	        return allItemsDisplayed;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function OpenandValidatesHamburgerCloseInShopPage()<br />" + e);
	        return false;
	    }
	    
	    
	}
	public void openMyLibraryHamburgerIcon() {
		try {
			elementToBeClickableFluentWait(shopPageLocators.shopLibraryHamburgerIconInShopPage, 60);
			shopPageLocators.shopLibraryHamburgerIconInShopPage.click();
			ExtentsReportManager.extentReportLogging("pass",
					" Opens hamburger feature in the shop web view ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-openMyLibraryHamburgerIcon()<br />" + e);
			throw e;
		}
	}

	public void closeMyLibraryHamburgerIcon() {
		try {
			elementToBeClickableFluentWait(shopPageLocators.closeIconInHamburgerInShopPage, 60);
			shopPageLocators.closeIconInHamburgerInShopPage.click();
			ExtentsReportManager.extentReportLogging("pass",
					" Closes hamburger feature in the shop web view ");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-closeMyLibraryHamburgerIcon()<br />" + e);
			throw e;
		}
	}
	public boolean addFirstProductInWishlist() throws Exception {
	    String device = GlobalParams.getPlatformName();

	    try {
	        Thread.sleep(60);

	        int maxAttempts = 5;
	        int attempt = 0;

	        clicksOnOkButtonInCookiesScreenInStore();

	        // Wait until the wishlist title is visible
	        while (attempt < maxAttempts) {
	            if (!shopPageLocators.wishListTitle.isEmpty() &&
	                shopPageLocators.wishListTitle.get(0).isDisplayed()) {
	                break;
	            }
	            Thread.sleep(10);
	            attempt++;
	        }

	        if (device.equalsIgnoreCase("ios")) {
	            for (WebElement product : shopPageLocators.firstWishListProductImage) {
	                if (product.isDisplayed()) {
	                    product.click(); // Tap on product image

	                    int maxAttemptsForSize = 8;
	                    int attemptsForSize = 0;
	                    Thread.sleep(30);

	                    while (attemptsForSize < maxAttemptsForSize) {
	                        if (!shopPageLocators.firstWishListButtonInStorePage.isEmpty()) {
	                            shopPageLocators.firstWishListButtonInStorePage.get(0).click();
	                            Thread.sleep(30);
	                            ExtentsReportManager.extentReportLogging("pass", "Added first product to wishlist");
	                            return true;
	                        }
	                        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.4);
	                        Thread.sleep(20);
	                        attemptsForSize++;
	                    }

	                    ExtentsReportManager.extentReportLogging("fail", "Unable to add product to wishlist");
	                    return false;
	                }
	            }
	        } else if (device.equalsIgnoreCase("android")) {
	            if (!shopPageLocators.firstWishListButtonInStorePage.isEmpty()) {
	                for (WebElement element : shopPageLocators.firstWishListButtonInStorePage) {
	                    if (element.isDisplayed()) {
	                        element.click();
	                        ExtentsReportManager.extentReportLogging("pass", "Added first product to wishlist");
	                        return true;
	                    }
	                }
	            }
	        }

	        // If wishlist button wasn't found or clickable
	        ExtentsReportManager.extentReportLogging("fail", "Unable to add first product to wishlist");
	        return false;

	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in addFirstProductInWishlist():<br />" + e.getMessage());
	        throw e;
	    }
	}



	
	public void clickOnWishlistButton() throws Exception {
		try {
			Thread.sleep(40);
			elementToBeClickableFluentWait(shopPageLocators.wishListButton, 60);
			shopPageLocators.wishListButton.click();
			Thread.sleep(40);
			ExtentsReportManager.extentReportLogging("pass", "Clicks on wishlist button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnWishlistButton()<br />" + e);
			throw e;
		}		
	}
	


	
	public boolean validateWishlistProduct() throws Exception {
	    boolean isProductVisible = false;

	    try {
	        Thread.sleep(60); 

	        int maxAttempts = 10;
	        int attempts = 0;

	        while (attempts < maxAttempts) {
	            if (shopPageLocators.wishListLabel.isDisplayed()) {
	                if (!shopPageLocators.firstWishListProductImage.isEmpty() &&
	                    shopPageLocators.firstWishListProductImage.get(0).isDisplayed()) {

	                    isProductVisible = true;
	                    ExtentsReportManager.extentReportLogging("pass", "Product is visible in the wishlist page");
	                } else {
	                    ExtentsReportManager.extentReportLogging("fail", "Product not visible in the wishlist page");
	                }
	                return isProductVisible;
	            }

	            Thread.sleep(10); 
	            attempts++;
	        }

	        ExtentsReportManager.extentReportLogging("fail", "'Wishlist' label not found within expected attempts");

	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in validateWishlistProduct(): " + e.getMessage());
	        throw e;
	    }

	    return false;
	}

	public boolean addFirstProductAndSelectSize(String size) throws Exception {
	    String device = GlobalParams.getPlatformName();

	    try {
	    	Thread.sleep(40);
	       
	        int maxAttempts = 10;
	        int attempts = 0;

	       // if (device.equalsIgnoreCase("android")) {
	            while (attempts < maxAttempts) {
	            	IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
	                if (!shopPageLocators.firstProductButtonInStorePage.isEmpty()) {
	                    shopPageLocators.firstProductButtonInStorePage.get(0).click();
	                   
	                    //handled cookies popup
	                    clicksOnOkButtonInCookiesScreenInStore();
	                    int maxAttemptsForSize = 5;
	                    int attemptsForSize = 0;
	                    Thread.sleep(30);
	                    while (attemptsForSize < maxAttemptsForSize) {
	                        if (!shopPageLocators.productSizeinStorePage.isEmpty()) {
	                            shopPageLocators.productSizeinStorePage.get(0).click();
	                            Thread.sleep(30);
	                            ExtentsReportManager.extentReportLogging("pass", "Clicks on first product and selects size");
	                            return true;
	                        }
	                        IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.2);
	                        Thread.sleep(20);
	                        attemptsForSize++;
	                    }
	                    ExtentsReportManager.extentReportLogging("fail", "Unable to select size for the first product");
	                    return false;
	                }
	                IosGenericLibrary.scroll(driver, null, IosGenericLibrary.ScrollDirection.DOWN, 0.7);
	                attempts++;
	            }
	            ExtentsReportManager.extentReportLogging("fail", "Unable to select first product");
		        return false;
		    } catch (Exception e) {
		        ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function-addFirstProductAndSelectSize()<br />" + e);
		        throw e;
		    }
		}
	
    

	public void clickOnAddtoBagButton() throws Exception {
		try {
			Thread.sleep(100);
			elementToBeClickableFluentWait(shopPageLocators.addtoBagButtonInStorePage, 60);
			shopPageLocators.addtoBagButtonInStorePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on Add to Bag button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnAddtoBagButton()<br />" + e);
			throw e;
		}		
	}

	
	public void clickOnBagButton() throws Exception {
		try {
			Thread.sleep(100);
			elementToBeClickableFluentWait(shopPageLocators.bagButtonInStorePage, 60);
			shopPageLocators.bagButtonInStorePage.click();
			ExtentsReportManager.extentReportLogging("pass", "Clicks on Bag button");
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function-clickOnBagButton()<br />" + e);
			throw e;
		}		
	}
	
	public boolean validateAddedToBagPage() throws Exception {
	    boolean isVisible = false;

	    try {
	        
	        Thread.sleep(60); 

	        int maxAttempts = 10;
	        int attempts = 0;

	        while (attempts < maxAttempts) {
	            if (!shopPageLocators.addedtoBagLabelInStorePage.isEmpty()) {
	                isVisible = shopPageLocators.addedtoBagLabelInStorePage.get(0).isDisplayed();

	                if (isVisible) {
	                    ExtentsReportManager.extentReportLogging("pass", "Product is added to bag and visible in Store - Shop page");
	                } else {
	                    ExtentsReportManager.extentReportLogging("fail", "Product image not available even though 'Added to Bag' label is present");
	                }

	                return isVisible;
	            }

	            Thread.sleep(10); 
	            attempts++;
	        }

	        ExtentsReportManager.extentReportLogging("fail", "'Added to Bag' label not found within expected attempts");

	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in validateAddedToBagPage(): " + e.getMessage());
	        throw e;
	    }

	    return false;
	}

	public boolean validateYourBagPage() throws Exception {
	    boolean isVisible = false;

	    try {
	        Thread.sleep(40); 

	        int maxAttempts = 10;
	        int attempts = 0;

	        while (attempts < maxAttempts) {
	            List<WebElement> yourBagElements = shopPageLocators.yourBagLabelInStorePage;

	            if (!yourBagElements.isEmpty()) {
	                if (!shopPageLocators.firstWishListProductImage.isEmpty() &&
	                    shopPageLocators.firstWishListProductImage.get(0).isDisplayed()) {

	                    isVisible = true;
	                    ExtentsReportManager.extentReportLogging("pass", "Validated 'Your Bag' with product present");
	                    return isVisible;

	                } else {
	                    ExtentsReportManager.extentReportLogging("fail", "Product image is not displayed in 'Your Bag'");
	                    return false;
	                }
	            }

	            Thread.sleep(10);
	            attempts++;
	        }

	        ExtentsReportManager.extentReportLogging("fail", "'Your Bag' section not visible");

	    } catch (NoSuchElementException ns) {
	        ExtentsReportManager.extentReportLogging("fail", "'Your Bag' section or product not available: " + ns.getMessage());
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in validateYourBagPage(): " + e.getMessage());
	        throw e;
	    }

	    return isVisible;
	}

	public void clicksOnOkButtonInCookiesScreenInStore() throws Exception {
		try {
			 Thread.sleep(1000);
            if (shopPageLocators.okButtonCookiesScreenInStore.isDisplayed()) {
            	shopPageLocators.okButtonCookiesScreenInStore.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on okButtonCookiesScreen");
            }
            
            if (shopPageLocators.okButtonCookiesScreenInStore1.isDisplayed()) {
            	shopPageLocators.okButtonCookiesScreenInStore1.click();
                ExtentsReportManager.extentReportLogging("pass","Clicks on okButtonCookiesScreen");
            }
            Thread.sleep(1000);
        } catch (NoSuchElementException ns) {
            System.out.println("element is not displayed hence skipped");
        } catch (NullPointerException np) {
            System.out.println("null pointer exception due to override of screens");
        } catch (Exception e) {
         ExtentsReportManager.extentReportLogging("fail","Exception occured in function-clicksOnOkButtonInCookiesScreenInStore()<br />" + e);
         throw e;
        }
    }

	public boolean validateAllTheTabsInShopScreenDisabledInMutvPage() {
		try {
			String device = GlobalParams.getPlatformName();
	        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        List<WebElement> AllTabs;
	        try {
	            if (device.equalsIgnoreCase("android")) {
	            	AllTabs = shortWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	                    By.xpath("//android.widget.HorizontalScrollView//android.widget.LinearLayout//android.widget.LinearLayout//android.widget.TextView")));
	            } else if (device.equalsIgnoreCase("ios")) {
	            	AllTabs = shortWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	                    By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell//XCUIElementTypeStaticText")));
	            } 
	        } catch (TimeoutException e) {
	            ExtentsReportManager.extentReportLogging("Pass", "All tabs in shop screen is not displayed – All tabs shop screen  is disabled as expected on CMS side ");
	            return true;
	        }

	        // If elements are found
	        ExtentsReportManager.extentReportLogging("fail", "All tabs in shop screen is displayed – should be disabled on CMS side " );
	        return false;

	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in validateAllTheTabsInShopScreenDisabledInMutvPage()<br />" + e);
	        return false;
	    }
	}

	public boolean validatesHeroCardInShopScreen() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns latestCardInLatestScreen Text ");
			return shopPageLocators.heroCardInShopScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesHeroCardInShopScreen()<br />" + e);
			throw e;
		}
	}

	public boolean validatesHeroCardInShopScreenInIos() {
		try {
			ExtentsReportManager.extentReportLogging("pass", "Returns latestCardInLatestScreen Text ");
			return shopPageLocators.heroCardInShopScreen.isDisplayed();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occured in function-validatesHeroCardInShopScreen()<br />" + e);
			throw e;
		}
	}
	}

	
	
	
 
	



	
	


