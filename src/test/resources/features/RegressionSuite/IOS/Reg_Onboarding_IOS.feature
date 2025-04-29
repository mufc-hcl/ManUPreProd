@Regression_IOS @Reg_Onboarding_IOS
Feature: Onboarding Android Regression features
@Text
  Scenario Outline: DMD-2087,DMD-2089,DMD-2090,DMD-2091,DMD-2093,DMD-2094
       Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    #DMD-2087-ON BOARDING- On app launch user should see "Welcome to the Man UTD app" screen with text which are configurable from CMS and Let's go button.
     Then user validates all objects in screen one in ios
      | welcomeText                | quote                            | desc                                                                            | letsGOButton |
      | WELCOME TO THE MAN UTD APP | FOOTBALL IS NOTHING WITHOUT FANS | ...Sir Matt Busby said it best. Our app keeps you connected directly to United! | LET'S GO     |
     And user clicks lets go button in screen one in ios
    #DMD-2089- ON BOARDING - Tapping on Ask me later make user to opt out notifications and no native dialouge is shown.
    #And user clicks on dont allow Btn
    And user clicks on ask me later in screen two in ios
    #DMD-2090 - ON BOARDING - On tapping on either button or swipe left to right user should land in screen with headline "Who is your favourite United player?"
     Then user validates all objects in screen three in ios
      | welcomeText                          | selection                                                                                        | confirmButton | skipButton |
      | WHO IS YOUR FAVOURITE UNITED PLAYER? | Select your favourite player for access to exclusive content, regular updates and related offers | CONFIRM       | SKIP       |
    #DMD-2091 - ON BOARDING - Select Fav Player and tap on Confirm. The text in screen in configured from CMS.
    #And user navigates to screen three
    And user swipes to select the favorite player and validates player name as "<player>" in ios
    And user clicks confirm button in ios
    #DMD-2093 - ON BOARDING - The text, Benefits and other detsilas in screen are configurable from CMS.
     Then user validates all objects in screen four in ios
      | welcomeText     | button1          | button2            | button3          | getExclusiveAccessText | desc                                                                                                                    | signForUnitedButton | skipButton | myUnitedBenefits   |
      | SIGN FOR UNITED | Full MUTV Access | UNITED PREDICTIONS | OFFERS & REWARDS | GET EXCLUSIVE ACCESS   | This is the one true home of United. Get closer than ever before, sign for United today. Already got an account? Log In | SIGN FOR UNITED     | SKIP       | MY UNITED BENEFITS |
    #DMD-2094- ON BOARDING - Tap on Sign for United button from "Sign for United" Screen
    And user clicks on sign for united button in ios
   And user clicks on continue button in ios
    Then user validates the sign in page in ios
   |sign in|Desc|
   |CREATE AN ACCOUNT|Join now for free and be part of United's global fan community to enjoy exclusive content perks & rewards|

  Examples: 
      | player      |
      | Teden Mengi |

  
  Scenario Outline: DMD-2088,DMD-2096,DMD-2092,DMD-2097,DMD-2095
   Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
     And user clicks lets go button in screen one in ios
    #DMD-2088-ON BOARDING- Tapping on Allow should bring native dialouge asking user to allow or don't allow notifications
     And user clicks on allow button in ios
      Then user validate all objects in allow notifcation screen in ios
      | notification                                       | allow | dontallow   |
      | “Man Utd Stg” Would Like to Send You Notifications | Allow | Don’t Allow |
    #DMD-2096- ON BOARDING DEEPLINKING - Tap on push notifications before completing onbaording journey
       And user clicks on "<notificationbutton>" button in notification screen in ios
    #DMD-2092 - ON BOARDING - Tap on Skip or swipe left to rigth or tap on Confirm from "Who is your favourite United player?" should land user to screen with headline "Sign for United"
     And user clicks skip button in screen three in ios
    #DMD-2097- ON BOARDING DEEPLINKING - Check for all the card types applicable (Checked for Article & Video)
    Then user validates benefits cards in screen four in ios
    #DMD-2095- ON BOARDING - Tap on Login button from "Sign for United" Screen
    And user clicks on sign for united button in ios
     And user clicks on continue button in ios
    And user clicks on log in button in sign in page in ios
    Then user validates the login page in ios
      | Login  | Desc                   |
      | LOG IN | Don't have an account? |

    Examples: 
      | notificationbutton |
      | allow_button       |
      | deny_button        |