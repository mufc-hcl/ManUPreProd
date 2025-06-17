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
@executes
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
    Then user validates My united text in myunited screen in ios
      | my united text |
      | MY UNITED      |
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
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
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
@MyU1
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
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
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
      | username                | password |
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
  
  @MyU1
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
    #Then user validates content in my tickets component in ios
    Then user validates stadium component in my united screen in ios
    #Then user validates content in stadium component in ios

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
@MyU1
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
@MyU1
  Scenario Outline: [My United]TC015 Settings --> My Profile --> Edit Profile --> Make changes and Save. Validate if the new changes are added to the profile
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
    #And user clears all data in textbox in edit profile screen in ios
    #And user clicks save details in edit profile screen in ios
    And user changes the following textbox in edit profile screen in ios
      | Addr1      | Addr2      | Addr3      | Town      | pincode   |
      | Test Addr1 | Test Addr2 | Test Addr3 | Test Town | Test12345 |
    And user clicks save details in edit profile screen in ios
    Then user validates the success message in edit profile in ios
      | Success Message                 |
      | Your details have been updated. |
    Then user validates the given data in edit profile screen in ios
      | Addr1      | Addr2      | Addr3      | Town      | pincode   |
      | Test Addr1 | Test Addr2 | Test Addr3 | Test Town | Test12345 |

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC016 Verify on my United screen user are displayed with About you section with text containing user FN, LN, Country< age details personalised.
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
    And user navigates to About you in my united screen in ios
    Then User validates text containing user Firstname lastName Country and Age details personalised in ios

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC017 Native Login [>13 and <13] and Social Login
    #Social login possible only for >13 and its covered in IDM TC008 and TC009
    #Social login <13 - Under 13 registrations are not allowed to be linked to a social account" in Manu app
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
    And user validate t shirt name is displayed as "<Name>"

    #<13 (manutesting13)  and >13 (manupreprod) native app
    Examples: 
      | username                  | password | Name      |
      | manutesting13@yopmail.com | Manu@123 | TESTING13 |
      | manupreprod@yopmail.com   | Manu@123 | PREPROD   |

  Scenario Outline: [My United]TC018 Verify Tapping on My United from botton nav takes user to My United screen and if user is logged in they are presented with profile screen with Red, Platinum, gold background based on user memership type.
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
    Then user validates the background colour of profile screen in ios

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
      
          Scenario Outline: [My United]TC020 Validate the My tickets page displaying SeatGeek tickets page in both online and offline mode when tickets are already accessed in good network
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #    And user clicks on the notification at bottom of screen
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    Then user validates my tickets component in my united screen
    And user clicks on my tickets component in my united screen
    
     Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
      
      
     
