package org.bdd.locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.bdd.utils.AndroidGenericLibrary.swipeWithCoordinates;

public class IdmPageLocators {

	@AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id, ':id/already_signed_txt')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOG IN\"]")
	public WebElement loginButton;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/sign_in_text\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SIGN FOR UNITED\"]")
	public WebElement signForUnitedButton;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Privacy Policy\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Privacy Policy\"]")
	public WebElement privacyPolicyText;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CREATE AN ACCOUNT\"]")
	public WebElement createAccoutText;
	@FindBy(id = "Username")
	@iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeTextField\"")
	public WebElement emailTextBox;
	@FindBy(id = "Password")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	public WebElement passwordTextBox;
	@FindBy(id = "loginButton")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"LOG IN\"])[2]")
	public WebElement loginButtonLoginScreen;
	@AndroidFindBy(accessibility = "Close")
	public WebElement closeButtonLevelNotification;
	//android.widget.TextView[contains(@resource-id, ':id/mLatestNewsTxt')]
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/first_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DAILY STREAKS\"]")
	public WebElement dailyStreaksText;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/second_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TOTAL SCORE\"]")
	public WebElement totalScoreText;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/third_header')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"APPEARANCES\"]")
	public WebElement AppearanceText;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/myunited_fan_level')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"👑 LEVEL 2\"]")
	public WebElement fanLevelText;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"MY PROFILE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"my profile\"]")
	public WebElement myProfileIconSettingPage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"EDIT PROFILE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"edit profile\"]")
	public WebElement editProfileMyProfilePage;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/text_view_title')]")
	public WebElement editProfilePageHeadingMyProfilePage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CHANGE PASSWORD\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"change password\"]")
	public WebElement changePasswordMyProfilePage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CHANGE PASSWORD\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"change password\"]")
	public List<WebElement> changePasswordMyProfilePage1;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CHANGE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"change email address\"]")
	public WebElement changeEmailAddressMyProfilePage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CHANGE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"change email address\"]")
	public List<WebElement> changeEmailAddressMyProfilePage1;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"PREFERENCE CENTRE\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"preference centre\"]")
	public WebElement preferenceCentreMyProfilePage;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"LOGOUT\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"logout\"]")
	public WebElement LogoutIconMyProfilePage;
	@FindBy(id = "FirstName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[1]")
	public WebElement firstName;
	@FindBy(id = "LastName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[2]")
	public WebElement surName;
	@FindBy(id = "Email")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[3]")
	public WebElement email;
	@FindBy(id = "Password")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField[1]")
	public WebElement password;
	@FindBy(id = "PasswordConfirm")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField[2]")
	public WebElement confirmPassword;
	@FindBy(id = "DayOfBirth")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Date of Birth\" and @value=\"Day\"]")
	public WebElement dayOfBirth;
	@FindBy(id = "MonthOfBirth")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Month of birth\"]")
	public WebElement monthOfBirth;
	@FindBy(id = "YearOfBirth")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Year of birth\"]")
	public WebElement yearOfBirth;
	@FindBy(id = "CountryISO")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@value=\"Select country\"]")
	public WebElement country;
	@FindBy(id = "AddressLineOne")
	public WebElement addressLineOneEditProfilePage;
	@FindBy(id = "AddressLineTwo")
	public WebElement addressLineTwoEditProfilePage;
	@FindBy(id = "AddressLineThree")
	public WebElement addressLineThreeEditProfilePage;
	@FindBy(id = "AddressCity")
	public WebElement townEditProfilePage;
	@FindBy(id = "country-input")
	public WebElement countryEditProfilePage;
	@FindBy(xpath = "//android.widget.Button[@text=\"SAVE DETAILS\"]")
	public WebElement saveDetailsEditProfilePage;
	@FindBy(xpath = "//android.widget.TextView[@text=\"Your details have been updated.\"]")
	public WebElement successMessageEditProfilePage;
	//@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/ok_btn\"]")

//	public WebElement okButton;
//	// @iOSXCUITFindBy(xpath ="")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/ok_btn')]")
	public WebElement yesIconLogoutAlertBox;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Account deletion\"]")
	public WebElement accountDeletionMyProfilePage;
	@AndroidFindBy(accessibility = "Close")
	public WebElement closeIconAccountDeletionPage;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement continuButtonLoginIos;
	@AndroidFindBy(accessibility = "Sign in with Google")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"Sign in with Google\"]")
	public WebElement signInWithGoogleButton;
	@FindBy(id = "identifierId")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or phone\"]")
	public WebElement emailPhoneTextFieldSignInScreen;
	@FindBy(id = "identifierNext")
	@iOSXCUITFindBy(accessibility = "Next")
	public WebElement nextButtonSignInScreen;
	@FindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(accessibility = "Enter your password")
	public WebElement passwordTextFieldSignInScreen;
	@FindBy(id = "passwordNext")
	public WebElement nextButtonPasswordSignInScreen;
	@FindBy(id = "details-button")
	public WebElement advancedButtonSignInScreen;
	@FindBy(id = "proceed-link")
	public WebElement proceedLinkSignInScreen;
	@AndroidFindBy(id = "com.android.chrome:id/message_primary_button")
	public WebElement continueButtonGoogleLogin;
	@iOSXCUITFindBy(accessibility = "Done")
	public WebElement doneButtonKeyBoard;
	@iOSXCUITFindBy(accessibility = "Show Details")
	public WebElement showDetailsLink;
	@iOSXCUITFindBy(accessibility = "visit this website")
	public WebElement visitThisWebsiteLink;
	@iOSXCUITFindBy(accessibility = "Visit Website")
	public WebElement visitWebsiteButton;
	@iOSXCUITFindBy(accessibility = "BackButton")
	public WebElement backButtonPrivateLink;
	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView[contains(@resource-id, ':id/tabDots\')]/android.widget.LinearLayout/android.widget.LinearLayout")
	public List<WebElement> screenCount;
	@FindBy(id = "Relationship")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@value=\" \"]")
	public WebElement relationship;
	@FindBy(id = "ParentFirstName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[4]")
	public WebElement parentFirstName;
	@FindBy(id = "ParentLastName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[5]")
	public WebElement parentSurName;
	@FindBy(id = "ParentsEmail")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeTextField[6]")
	public WebElement parentEmail;
	@FindBy(xpath = "(//p[@class='multi-anchor']/a)[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot password?\"]")
	public WebElement forgetPassword;
	@FindBy(id = "EmailAddressOrClientReference")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	public WebElement clientReferenceEmail;
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"CHANGE EMAIL ADDRESS\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"change email address\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement changeEmailAddress;
	@FindBy(id = "NewLoginEmail")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]")
	public WebElement newEmailAddress;
	@FindBy(id = "ReenterNewLoginEmail")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]")
	public WebElement confirmNewEmailAddress;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	public WebElement password1;
	@AndroidFindBy(accessibility = "Close tab")
	public WebElement closeButtonGoogleLogin;
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/tv_paywall_already_subscribed')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOG IN\"]")
	public List<WebElement> loginButtonSubscribePage;
	@AndroidFindBy(accessibility = "log in Button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOG IN\"]")
	public List<WebElement> loginButtonRegisterPage;
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout//android.widget.RelativeLayout//android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell//XCUIElementTypeStaticText[1]")
	public List<WebElement> myProfileContent;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/first_score\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"4\"]")
	public WebElement  dailStreaksIDM;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, ':id/third_score\')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"33\"]")
	public WebElement  appearencesIDM;

	@FindBy(xpath = "(//*[contains(text(),'Privacy Policy')])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Privacy Policy\"]")
	public WebElement privacyPolicyText1;
	
	
	
}
