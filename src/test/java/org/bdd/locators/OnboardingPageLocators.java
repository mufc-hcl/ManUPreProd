package org.bdd.locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

public class OnboardingPageLocators {

    @AndroidFindBy(className = "email")
    public WebElement LetsGoButtonID;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='ALLOW']")
    public WebElement AllowBtn;

    // screen 1 all locators(welcome screen)
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_welcome_header']")
    @iOSXCUITFindBy(accessibility = "WELCOME TO THE MAN UTD APP")
    public WebElement welcomeToTheManUtdApp;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_title")
    @iOSXCUITFindBy(accessibility = "FOOTBALL IS NOTHING WITHOUT FANS")
    public WebElement quoteScreen1;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_desc")
    @iOSXCUITFindBy(accessibility = "...Sir Matt Busby said it best. Our app keeps you connected directly to United!")
    public WebElement descScreen1;

    @AndroidFindBy(accessibility = "Lets Go")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LET'S GO\"]")
    public WebElement letsGOButtonScreen1;
    @AndroidFindBy(accessibility = "OnBoard: Allow Notification Page")
    public WebElement screenOneDot;
    @AndroidFindBy(accessibility = "OnBoard: Allow Notification Page")
    public List<WebElement> screenTwoDot;

    @AndroidFindBy(accessibility = "OnBoard: Choose Favourite Player Page")
    public WebElement screenThreeDot;

    @AndroidFindBy(accessibility = "OnBoard: Sign Up & Login Page")
    public WebElement screenFourDot;

//screen 2 all locators(welcome screen)

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_welcome_header")
    @iOSXCUITFindBy(accessibility = "NEVER MISS A THING")
    public WebElement welcomeTextScreen2;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_title")
    @iOSXCUITFindBy(accessibility = "UNITED NOTIFICATIONS")
    public WebElement quoteScreen2;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_desc")
    @iOSXCUITFindBy(accessibility = "Turn on notifications and be first to hear about team news, transfers and all the moments that matter")
    public WebElement descScreen2;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/ask_me_later_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ASK ME LATER\"]")
    public WebElement askMeLaterScreen2;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/bottom_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ALLOW\"]")
    public WebElement allowBtnScreen2;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"“Man Utd Stg” Would Like to Send You Notifications\"]")
    public WebElement allowNotificationScreen2;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")
    @iOSXCUITFindBy(accessibility = "Allow")
    public WebElement allowBtnNoftScreen2;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    public WebElement dontAllowBtnNoftScreen2;

    // screen 3 all locators(welcome screen)
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_fav_player_header")
    @iOSXCUITFindBy(accessibility = "WHO IS YOUR FAVOURITE UNITED PLAYER?")
    public WebElement welcomeTextScreen3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Men']")
    public WebElement menButtonScreen3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Women']")
    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    public WebElement womenButtonScreen3;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_title")
    public WebElement swipeToSelectScreen3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_desc']")
    @iOSXCUITFindBy(accessibility = "Select your favourite player for access to exclusive content, regular updates and related offers")
    public WebElement selectionScreen3;

    @AndroidFindBy(accessibility = "Disabled Confirm button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONFIRM\"]")
    public WebElement confirmButtonScreen3;

    @AndroidFindBy(accessibility = "Skip")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeButton[@name=\"SKIP\"]")
    public WebElement skipButtonScreen3;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/tv_onboarding_bottom_title']")
    public WebElement selectedPlayerName;

    @AndroidFindBy(accessibility = "Confirm")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"CONFIRM\" AND label == \"CONFIRM\" AND type == \"XCUIElementTypeButton\"")
    public WebElement enabledConfirmButtonScreen3;

    // screen 4 all locators(welcome screen)
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/onboarding_login_header']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"SIGN FOR UNITED\"])[1]")
    public WebElement welcomeTextScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/signup_screen_text' and @text='FULL MUTV ACCESS']")
    @iOSXCUITFindBy(accessibility = "Full MUTV Access")
    public WebElement fullMutvAccessScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/signup_screen_text' and @text='UNITED PREDICTIONS']")
    @iOSXCUITFindBy(accessibility = "UNITED PREDICTIONS")
    public WebElement unitedPredictionsScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/signup_screen_text' and @text='OFFERS & REWARDS']")
    @iOSXCUITFindBy(accessibility = "OFFERS & REWARDS")
    public WebElement offersAndRewardsScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/united_textview']")
    @iOSXCUITFindBy(accessibility = "GET EXCLUSIVE ACCESS")
    public WebElement getExclisiveScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/tv_desc']")
    @iOSXCUITFindBy(accessibility = "This is the one true home of United. Get closer than ever before, sign for United today. Already got an account? Log In")
    public WebElement descScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='sign for united']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SIGN FOR UNITED\"]")
    public WebElement signForUnitedScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Skip button']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SKIP\"]")
    public WebElement skipBtnScreen4;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.mu.muclubapp.preprod_mu_dxc:id/myunited_benefit']")
    @iOSXCUITFindBy(accessibility = "MY UNITED BENEFITS")
    public WebElement myUnitedBenefitsScreen4;

    @iOSXCUITFindBy(id = "Cancel")
    public WebElement cancelButtonAppleIdScreen;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell")
    public List<WebElement> selectedPlayerIos;
    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/bottom_button")
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"ALLOW\" AND label == \"ALLOW\" AND type == \"XCUIElementTypeButton\"")
    public List<WebElement> allowButtonScreen2;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.mu.muclubapp.preprod_mu_dxc:id/parentLayout\"])")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView//XCUIElementTypeCell[2]")
    public WebElement myUnitedBenefitsCardsScreenFour;

    @AndroidFindBy(id = "com.mu.muclubapp.preprod_mu_dxc:id/back_to_top")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"BACK TO TOP\"]")
    public WebElement backToTopScreenFour;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Log in\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Log in\"]")
    public WebElement loginBtnInSignINPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LOG IN\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"LOG IN\"]")
    public WebElement loginTextLoginPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Don't have an account? \"]")
    @iOSXCUITFindBy(accessibility = "Don't have an account?")
    public WebElement descLoginPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CREATE AN ACCOUNT\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CREATE AN ACCOUNT\"]")
    public WebElement createAccSignPageText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Join now for free and be part of United's global fan community to enjoy exclusive content perks & rewards\"]")
    @iOSXCUITFindBy(accessibility = "Join now for free and be part of United's global fan community to enjoy exclusive content perks & rewards")
    public WebElement DescSignPageText;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout//android.widget.FrameLayout//androidx.recyclerview.widget.RecyclerView//android.widget.FrameLayout//android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Join now for free and be part of United's global fan community to enjoy exclusive content perks & rewards")
	public List<WebElement> playerslist;

}
