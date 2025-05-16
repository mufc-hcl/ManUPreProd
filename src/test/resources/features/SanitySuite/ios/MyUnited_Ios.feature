@Sanity_IOS @Myunited_IOS
Feature: My United features

  Scenario: [My United]TC001 Settings --> General --> Language / Help / Rate app
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
    And user click on Rate app in the General Screen in ios

  Scenario: [My United]TC002 Settings --> General-Language --> Change to Chinese / English and validate if the changes are applied
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
    And user click on Language in the General Screen in ios
    And user clicks on chinese Language in langugae Screen in ios
    And user clicks on confirm button in Language Screen in ios
    #Then user validates chinese calender Icon in ios
    Then user validates calender Icon in ios
    And user click on My United in bottom tab which is in chinese Language in ios
    And user click on setting icon on top righhand side which is in chinese Language in ios
    And user click on GENERAL link in setting screen which is in chinese Language in ios
    And user click on Language in the General Screen which is in chinese Language in ios
    And user clicks on English Language in langugae Screen in ios
    And user clicks on confirm button in Language Screen which is in chinese Language in ios
    Then user validates calender Icon in ios

  Scenario Outline: [My United]TC003 Validate the My United screen title and on clicking the Stickers icon user should be taken to the my united stickers screen and then tap on back icon user should be taken to My United screen
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
    Then user validates Inbox Icon is not displayed in My United Page in ios

    #And user clicks on Stickers icon in myunited screen in ios
    #Then user validates My united Stickers text in inbox screen in ios
    #| Text               |
    #| MY UNITED STICKERS |
    #And user clicks on back button in Stickers screen in ios
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC005 Validate the stickers carousel and then click on 'View All' then click on the back icon from the My United Stickers page
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
    And navigates to the Stickers section in ios
    Then user validates my stickers carousel in My united screen in ios
    Then user validates stickers in My united screen using Api in ios using Api
    And user clicks on view all button in ios
    And user clicks on first sticker in Stickers Screen in ios
    And user select print image from share option in ios
    Then user validates print screen in ios
      | cancel | options | share icon |
      | Cancel | Options | Share      |
    And user click on share icon in print screen in ios
    And user click on Chromium in print screen

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC004 Validate the Season card navigation
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
    And user navigates points screen in ios
    Then user validates Points this season card in My united screen in ios
    And user clicks on Season card in My united screen in ios
    Then user validates season card in ios
      | predictions | my best score | matches |
      | PREDICTIONS | MY BEST SCORE | MATCHES |
    And user clicks on back icon in season card screen in ios

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC007 Click on the Primary and Secondary CTA buttons displayed below the jersey card section
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
    Then user validates become a member and buy shirt CTA button in my united screen in ios using Api

    #And user clicks on get official membership CTA button in my united screen in ios
    #Then user validate tickets title in get official membership screen in ios
    #| tickets title |
    #| TICKETS       |
    #And user click on close icon in get official membership screen in ios
    #And user click on buy shirt CTA button in my united screen in ios
    #Then user validates shop now is displayed in ios
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
@AWSFailure1
  Scenario Outline: [My United]TC006 Validate if user is able to see the name on jersey and the shirt number updated at the bottom of the My United screen should reflect on the Jersey  t shirt name
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
      | Preprod     |

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC008 Validate the My United Season Score card , Total Score card , Daily Streaks card , Appearances card navigations
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
    #Then user validates content in total score card in ios
    #| my united total score | prediction         | daily streaks          | appearance          |
    #| MY UNITED TOTAL SCORE | Predictions 0  pts | Daily Streaks 100  pts | Appearances 50  pts |
    Then user validates content in total score card in ios
      | my united total score |
      | MY UNITED TOTAL SCORE |
    And user clicks on back icon in total score card in ios
    #And user scroll right to left to navigate daily streaks cards "<Daily streaks>"
    And user clicks on daily streaks card in my united screen in ios
    Then user validates content in daily streaks card in ios
      | daily streaks | share |
      | DAILY STREAKS | SHARE |
    And user clicks on back icon in daily streaks card in ios
    And user scrolls right to left to navigate appearence
    And user clicks on appearance card in my united screen in ios
    Then user validates content in appearance card in ios
      | appearance  | share |
      | APPEARANCES | SHARE |
    And user clicks on back Icon in appearance card in ios

    Examples:
      | username             | password |
      | manupreprod@yopmail.com | Manu@123 |


  Scenario Outline: [My United]TC009 Add / Edit Favourite Player from Profile for Login user
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
      | buy shirt CTA |
      | Buy Shirt     |
    Then user validates the star icon is displayed in ios
    And user click on edit icon in my united screen in ios
    And user edits the favorite player in player screen in ios
    Then user validates the star icon is displayed in ios
    Then user validates edited player details in my united screen in ios

    #    #assertion county flag
    #    And user clicks on country flag in my united screen in ios
    #    Then user validates the below details in choose player screen in ios
    #      | choose player | men | women |
    #      | CHOOSE PLAYER | Men | Women |
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
      
  Scenario Outline: [My United]TC010 Settings --> Notifications --> Both United and Match alerts on and off toggles(allow notification)
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

  #Scenario Outline: [My United]TC011 Settings --> Notifications --> Both United and Match alerts on and off toggles(deny notification)
  #Given user navigates to manu ios application
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on allow button in ios
  #And user clicks on "<notificationbutton>" button in notification screen in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user click on My United in bottom tab in ios
  #And user click on setting icon on top righhand side in ios
  #And user clicks on notification icon in settings screen in ios
  #Then user validates the given alerts in notifications screen in ios
  #| Alert1            | Alert2       |
  #| united now alerts | match alerts |
  #And user clicks on united now alert in notification screen in ios
  #And user click on latest alert switch in united now alerts screen in ios
  #And user selects go to settings from enable alerts dialog box in ios
  #And user clicks on notifications switch in settings in ios
  #And user clicks back icon in the settings in ios
  #And user validates the general alerts in united now alerts screen in ios
  #And user clicks on back button in United now alerts screen in ios
  #And user clicks on match alert in notification screen in ios
  #And user validates the match alerts in match alerts screen in ios
  #
  #Examples:
  #| notificationbutton |
  #| deny_button        |
  
      

    Scenario Outline: [My United]TC012 Validate the My Tickets & Stadium components navigation on the My United page for login user
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
    Then user validates my tickets component in my united screen in ios
    Then user validates content in my tickets component in ios
    Then user validates stadium component in my united screen in ios
    Then user validates content in stadium component in ios

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
 
  Scenario Outline: [My United]TC013 Settings --> My Profile --> Preference Center navigation
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
    And user clicks on preference center in ios
    Then user gets the title of the preference center screen in ios
      | Preference Center |
      | PREFERENCE CENTRE |
    #save preference buttonelement is not visible, Appium/WebDriver cannot click it directly
    #And user selecting one of the checklist in the preference center screen in ios
    #And user clicks on save preference button in ios
    #Then user validates preference updated message in ios
      #| Thank you, your preferences have been updated. |
      #| Thank you, your preferences have been updated. |

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

     
    Scenario Outline: [My United]TC014 Settings --> My Profile --> Change email address for Login user
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
    And user clicks on change email address in my profile screen in ios
    And user enter the New email "<usernameNew>" and Confirm email"<confirmusernameNew>"valid password "<password>" in ios
    And user clicks on update email address in my profile in ios
    Then user validates email change successfully message in ios
      | EmailUpdate Success Message |
      | CHANGE EMAIL ADDRESS        |
    And user clicks on close icon in email update success screen in ios
    And user clicks on change email address in my profile screen in ios
    And user enters the old email"<username>" and confirm email"<confirmOldusername>"valid password "<password>" in ios
    And user clicks on update email address in my profile in ios
    Then user validates email change successfully message in ios
      | EmailUpdate Success Message |
      | CHANGE EMAIL ADDRESS        |

    Examples: 
      | username             | confirmOldusername   | usernameNew          | confirmusernameNew   | password |
      | oldemail@yopmail.com | oldemail@yopmail.com | emailnew@yopmail.com | emailnew@yopmail.com | Manu@123 |
      