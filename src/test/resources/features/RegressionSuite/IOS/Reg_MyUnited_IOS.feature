@Regression_IOS @Reg_Myunited_IOS
Feature: Regression -MyUnited Test Cases
@tes11
  Scenario Outline: DMD-2233,DMD-2238
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    #  DMD-2238-MY UNITED - MY UNITED - Favourite Player from Profile
    And user scrolls down to favorite player screen in ios
    And user click on My United in bottom tab in ios
    Then user navigated to my united screen and validates the following text in ios
      | Streaks       | Total       | Appearances |
      | DAILY STREAKS | TOTAL SCORE | APPEARANCES |
    And user click on setting icon on top righhand side in ios
    And user clicks on My profile icon in ios
  #DMD-2233-MY UNITED - MY UNITED - Native Login/Log Out
    Then user validates the below in my profile screen in ios
      | edit profile | changePassword  | changeEmail          | preference        | logout |
      | edit profile | change password | change email address | preference centre | logout |
    And user clicks on Logout icon in ios
    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2254,DMD-2255,DMD-2256 Validate the stickers carousel and then click on 'View All' then click on the back icon from the My United Stickers page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    #	DMD-2254	MY UNITED - STICKERS - Stickers carousel
    #	DMD-2255	MY UNITED - STICKERS - Stickers sharing
    #	DMD-2256	MY UNITED - STICKERS - Stickers update when updating the app
    And navigates to the Stickers section in ios
    Then user validates my stickers carousel in My united screen in ios
    And user clicks on view all button in ios
    And user clicks on first sticker in Stickers Screen in ios
    And user select print image from share option in ios
    Then user validates print screen in ios
      | cancel | options | share icon |
      | Cancel | Options | Share      |
    And user click on share icon in print screen in ios
    And user click on Chromium in print screen

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2241-MY UNITED - MY UNITED - Settings-General-Language
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user click on setting icon on top righhand side in ios
    And user click on GENERAL link in setting screen in ios
     #DMD-2241-MY UNITED - MY UNITED - Settings-General-Language
    And user click on Language in the General Screen in ios
    And user clicks on chinese Language in langugae Screen in ios
    And user clicks on confirm button in Language Screen in ios
    Then user validates chinese calender Icon in ios
    And user click on My United in bottom tab which is in chinese Language in ios
    And user click on setting icon on top righhand side which is in chinese Language in ios
    And user click on GENERAL link in setting screen which is in chinese Language in ios
    And user click on Language in the General Screen which is in chinese Language in ios
    And user clicks on English Language in langugae Screen in ios
    And user clicks on confirm button in Language Screen which is in chinese Language in ios
    Then user validates calender Icon in ios

  Scenario:  DMD-2235	MY UNITED - MY UNITED - Sign Up [>13 and <13]
   #Partial script till entering the values in the signup screen
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on sign for united button in ios
    And user clicks on continue button in ios
    And user enters the following details in signin page in ios
      | firstname | surname | emailaddress       | password | confirmpassword | dob | mob | yob  | country        |
      | firstname | surname | test@testemail.com | xxxx     | xxxx            | 1   | May | 2015 | United Kingdom |
    And user enters the following parents details in signin page in ios
      | relationship | firstname  | surname       | emailaddress        |
      | Parent       | parentname | parentsurname | parentmail@test.com |

  Scenario Outline: DMD-2236	MY UNITED - MY UNITED - Settings--Notifictaion(Allow)
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on allow button in ios
    And user clicks on "<notificationbutton>" button in notification screen in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user click on setting icon on top righhand side in ios
    And user clicks on notification icon in settings screen in ios
    Then user validates the given alerts in notifications screen in ios
      | Alert1            | Alert2       |
      | united now alerts | match alerts |
    And user clicks on united now alert in notification screen in ios
    And user validates the general alerts in united now alerts screenin ios
    And user clicks on back button in United now alerts screen in ios
    And user clicks on match alert in notification screenin ios
    And user validates the match alerts in match alerts screen in ios

    Examples:
      | notificationbutton |
      | allow_button       |
  @tes11
  Scenario: Scenario: DMD-2237-MY UNITED - MY UNITED - Settings-General->Help
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user click on setting icon on top righhand side in ios
    And user click on GENERAL link in setting screen in ios
    And user click on HELP link in general screen in ios
    And user click on contact us link help screen in ios
    Then I verify the contactUs text in contact us screen in ios
      | contactUs  |
      | CONTACT US |
    And user clicks on Back icon
    And user click on HELP link in general screen in ios
    And user click on faqs link help screen in ios
    Then I verify the faqs text in faqs screen in ios
      | faqs |
      | FAQS |
    And user clicks on Back icon
    And user click on HELP link in general screen in ios
    And user click on accessibility link help screen in ios
    Then I verify the accessibility text in accessibility screen in ios
      | accessibility |
      | ACCESSIBILITY |
    And user clicks on Back icon
    And user click on HELP link in general screen in ios
    And user click on Terms of Use link in help screen in ios
    Then I verify the Terms of Use text in Terms of Use screen in ios
      | Terms of Use |
      | TERMS OF USE |
    And user clicks on Back icon
    And user click on HELP link in general screen in ios
    And user click on privacy policy link in help screen in ios
    Then I verify the privacy policy text in privacy policy  screen in ios
      | privacy policy |
      | PRIVACY POLICY |
    And user clicks on Back icon
    And user click on HELP link in general screen in ios
    And user click on feedback link in help screen in ios
    Then I verify the feedback text in feedback screen in ios
      | feedback |
      | FEEDBACK |
    And user enters below details in the feedback screen in ios
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  Scenario: DMD-2237-MY UNITED - MY UNITED - Settings-General->Rate App
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    #DMD-2237-MY UNITED - MY UNITED - Settings-General->Rate App
    And user click on setting icon on top righhand side in ios
    And user click on GENERAL link in setting screen in ios
    And user click on Rate app in the General Screen in ios

  Scenario Outline: TC006 Validate if user is able to see the name on jersey and the shirt number updated at the bottom of the My United screen should reflect on the Jersey  t shirt name
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user navigates to app debut in ios
    And user updates the t shirt numbers at buttom of the screen and click on back to top button in ios
    #Then user validate t shirt number from the previous step in ios
    And user validate t shirt name is displayed in ios
      | tshrit name |
      | T           |

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: TC007 Click on the Primary and Secondary CTA buttons displayed below the jersey card section
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on get official membership CTA button in my united screen in ios
    Then user validate tickets title in get official membership screen in ios
      | tickets title |
      | TICKETS       |
    And user click on close icon in get official membership screen in ios
    And user click on buy shirt CTA button in my united screen in ios

    #Then user validates shop now is displayed in ios
    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: TC008 Validate the My United Season Score card , Total Score card , Daily Streaks card , Appearances card navigations
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user scrolls down to my united All points season card
    And user clicks on total score card in my united screen in ios
    Then user validates content in total score card in ios
      | my united total score |
      | MY UNITED TOTAL SCORE |
    And user clicks on back icon in total score card in ios
    And user clicks on daily streaks card in my united screen in ios
    Then user validates content in daily streaks card in ios
      | daily streaks | share |
      | DAILY STREAKS | SHARE |
    And user clicks on back icon in daily streaks card in ios
    And user clicks on appearance card in my united screen in ios
    Then user validates content in appearance card in ios
      | appearance  | share |
      | APPEARANCES | SHARE |
    And user clicks on back Icon in appearance card in ios

    Examples:
      | username             | password | Daily streaks |
      | Manutest@yopmail.com | Manu@123 | DAILY STREAKS |

  Scenario Outline: DMD-2238-MY UNITED - MY UNITED - Favourite Player from Profile
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user scrolls down to favorite player screen in ios
    And user clicks on edit button in my united screen in ios
    Then user validates the below details in choose player screen in ios
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |
    And user selects a favorite player in players screen in ios
    Then user validates player details updated in my united screen in ios
      | player name          | buy shirt CTA |
      | TomHeatonFROMEnglish | Buy Shirt     |
    Then user validates the star icon is displayed in ios
    And user click on edit icon in my united screen in ios
    Then user validates the below details in choose player screen in ios
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |
    And user edits the favorite player in player screen in ios
    Then user validates the star icon is displayed in ios
    Then user validates edited player details in my united screen in ios
      | player name                | country flag     |
      | BrandonWilliamsFROMEngland | Country  England |
    #assertion county flag
    And user clicks on country flag in my united screen in ios
    Then user validates the below details in choose player screen in ios
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |


  Scenario: DMD-2252-MY UNITED - MY UNITED BENEFITS - Check the above use cases in Onboarding screen journey
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    #DMD-2253	MY UNITED - MY UNITED BENEFITS - Check 'View Benefit' link in onboarding screen journey
    Then user validates my united benefits displayed in onboarding screen in ios
    #DMD-2245	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles in Onboarding screen journey
    Then user validates benefits tiles in onboarding screen in ios
    #DMD-2248	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles when image is 1X image
    Then user validates benefits tiles when image is onex image in ios

  Scenario: DMD-2253,DMD-2245,DMD-2248-Check 'View Benefit' link in onboarding screen journey
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    #DMD-2253	MY UNITED - MY UNITED BENEFITS - Check 'MY UNITED BENEFITS' link in my united screen journey
    Then user validates view benefits displayed in myunited screen in ios
    #DMD-2245	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles in my united screen journey
    Then user validates benefits tiles in myunited screen in ios
    #DMD-2248	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles when image is 1X image
    Then user validates benefits tiles when image is onex image in my united page in ios

  Scenario Outline: DMD-2242-MY UNITED - MY UNITED - Edit Profile
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user click on setting icon on top righhand side in ios
    And user clicks on My profile icon in ios
    And user clicks on edit profile button in ios
#    DMD-2242-MY UNITED - MY UNITED - Edit Profile
    And user edits the postal code in edit profile page in ios
    And user clicks save details in edit profile screen in ios
    Then user validates the success message in edit profile screen in ios
    |SuccessMessage|
    |Your details have been updated.|

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
