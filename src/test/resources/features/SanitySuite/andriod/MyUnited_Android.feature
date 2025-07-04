@Sanity_Android @MyUnited_Android
Feature: My United features

  Scenario: [My United]TC001 Settings --> General --> Language / Help / Rate app
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on the notification at bottom of screen
    And user click on My United in bottom tab
    And user click on setting icon on top righhand side
    And user click on GENERAL link in setting screen
    And user click on Rate app in the General Screen
    Then user validate google play
      | googlePlay Text                                                       |
      | Sign in to find the latest Android apps, games, movies, music, & more |

  Scenario: [My United]TC002 Settings --> General-Language --> Change to Chinese / English and validate if the changes are applied
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on the notification at bottom of screen
    And user click on My United in bottom tab
    And user click on setting icon on top righhand side
    And user click on GENERAL link in setting screen
    And user click on Language in the General Screen
    And user clicks on chinese Language in langugae Screen
    And user clicks on confirm button in Language Screen
    #And user selects the dont allow button in audio notification alert after Refresh
    #And user selects Dont allow in the photos and videos access in alert after Refresh
    #Then user validates calender Icon in chinese
    Then user validates calender Icon
    And user click on My United in bottom tab which is in chinese Language
    And user click on setting icon on top righhand side which is in chinese Language
    And user click on GENERAL link in setting screen which is in chinese Language
    And user click on Language in the General Screen which is in chinese Language
    And user clicks on English Language in langugae Screen
    And user clicks on confirm button in Language Screen which is in chinese Language
    Then user validates calender Icon

  Scenario Outline: [My United]TC003 Validate the My United screen title and on clicking the inbox icon user should be taken to the inbox screen and then tap on back icon user should be taken to My United screen
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates Inbox Icon is not displayed in My United Page

    #And user clicks on inbox icon in myunited screen
    #Then user validates My message text in inbox screen
    #| my messages text   |
    #| My United Stickers |
    #And user clicks on back button in inbox screen
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC004 Validate the Season card navigation
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates Points this season card in My united screen
    And user clicks on Season card in My united screen
    Then user validates season card
      | predictions | my best score | matches |
      | PREDICTIONS | MY BEST SCORE | MATCHES |
    And user clicks on back icon in season card screen

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC005 Validate the stickers carousel and then click on 'View All' then click on the back icon from the My United Stickers page
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
    Then user validates my stickers carousel in My united screen
    Then user validates stickers in My united screen using Api
    And user clicks on view all button
    And user clicks on first sticker in Stickers Screen
    And user select search image from share option
    Then user validates the sticker in Google lens page

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC006 Validate if user is able to see the name on jersey and the shirt number updated at the bottom of the My United screen should reflect on the Jersey  t shirt name
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    And user updates the t shirt numbers at buttom of the screen and click on back to top button
    #tshirt num commented due to defetct
    Then user validate t shirt number from the previous step
    And user validate t shirt name is displayed

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC007 Click on the Primary and Secondary CTA buttons displayed below the jersey card section
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates become a member and buy shirt CTA button in my united screen using Api

    #And user clicks on get official membership CTA button in my united screen
    #Then user validate tickets title in get official membership screen
    #| tickets title |
    #| Tickets       |
    #And user click on close icon in get official membership screen
    #And user click on buy shirt CTA button in my united screen
    #Then user validates shop now is displayed
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC008 Validate the My United Season Score card , Total Score card , Daily Streaks card , Appearances card navigations
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
    Then user scrolls down to validates this season card in My united now screen
      | score this season | my united |
      | Score this season | MY UNITED |
    And user clicks on total score card in my united screen
    Then user validates content in total score card
      | my united total score | prediction  | daily streaks | appearance  |
      | MY UNITED TOTAL SCORE | Predictions | Daily Streaks | Appearances |
    And user clicks on back icon in total score card
    Then user validate daily streaks card in my united screen
      | daily streaks | consecutive                 | view |
      | DAILY STREAKS | Consecutive days in the app | VIEW |
    And user clicks on daily streaks card in my united screen
    Then user validates content in daily streaks card
      | daily streaks | best score | share |
      | DAILY STREAKS | BEST SCORE | SHARE |
    And user clicks on back icon in daily streaks card
    And user scrolls right to left to navigate appearence
    Then user validates appearance card in my united screen
      | appearance  | this season | view |
      | APPEARANCES | This Season | VIEW |
    And user clicks on appearance card in my united screen
    Then user validates content in appearance card
      | appearance  | share |
      | APPEARANCES | SHARE |
    And user clicks on back Icon in appearance card

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC009 Add / Edit Favourite Player from Profile for Login user
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
    And user scrolls down to favorite player screen
    And user validates payer image n my united screen
    And user clicks on edit button in my united screen
    Then user validates the below details in choose player screen
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |
    And user selects a favorite player in players screen
    Then user validates player details updated in my united screen
      | buy shirt CTA |
      | Buy Shirt     |
    Then user validates the star icon is displayed
    #    And clicks on  buy shirt button in my united screen
    #    Then user validates shop page
    #      | shop |
    #      | Shop |
    #    And user click on cross icon in shop screen
    And user click on edit icon in my united screen
    And user edits the favorite player in player screen
    Then user validates the star icon is displayed
    Then user validates edited player details in my united screen

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC010 Settings --> Notifications --> Both United and Match alerts on and off toggles(allow notification)
    Given user navigates to manu android application
    And user navigates to screen two
    And user clicks on allow button
    And user clicks on "<notificationbutton>" button in notification screen
    And user click on skip button in screen three
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on the notification at bottom of screen
    And user click on My United in bottom tab
    And user click on setting icon on top righhand side
    And user clicks on notification icon in settings screen
    Then user validates the given alerts in notifications screen
      | Alert1            | Alert2       |
      | UNITED NOW ALERTS | MATCH ALERTS |
    And user clicks on united now alert in notification screen
    And user validates the general alerts in united now alerts screen
    And user clicks on back button in United now alerts screen
    And user clicks on match alert in notification screen
    And user validates the match alerts in match alerts screen

    Examples: 
      | notificationbutton |
      | allow_button       |

  #Scenario Outline: [My United]TC011 Settings --> Notifications --> Both United and Match alerts on and off toggles(deny notification)
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user clicks on allow button
  #And user clicks on "<notificationbutton>" button in notification screen
  #And user click on skip button in screen three
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #    And user clicks on the notification at bottom of screen
  #And user click on My United in bottom tab
  #     And user clicks on log in button
  #    And user enter the valid email "<username>" and valid password "<password>"
  #    And user clicks on login button in login screen
  #    And user clicks on close from notification
  #And user click on setting icon on top righhand side
  #And user clicks on notification icon in settings screen
  #Then user validates the given alerts in notifications screen
  #| Alert1            | Alert2       |
  #| UNITED NOW ALERTS | MATCH ALERTS |
  #And user clicks on united now alert in notification screen
  #And user click on latest alert switch in united now alerts screen
  #And user selects go to settings from enable alerts dialog box
  #And user clicks on notifications switch in settings
  #And user clicks back icon in the settings
  #And user validates the general alerts in united now alerts screen
  #And user clicks on back button in United now alerts screen
  #And user clicks on match alert in notification screen
  #And user validates the match alerts in match alerts screen
  #
  #Examples:
  #| username                | password | notificationbutton |
  #| manupreprod@yopmail.com | Manu@123 | deny_button        |
  Scenario Outline: [My United]TC012 Validate the My Tickets & Stadium components navigation on the My United page for login user
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    Then user validates my tickets component in my united screen
    #Then user validates content in my tickets component
    Then user validates stadium component in my united screen

    #Then user validates content in stadium component
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  @wert
  Scenario Outline: [My United]TC013 Settings --> My Profile --> Preference Center navigation
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    And user click on setting icon on top righhand side
    And user clicks on My profile icon
    And user clicks on preference center
    Then user gets the title of the preference center screen
      | Preference Center |
      | PREFERENCE CENTRE |
    And user selecting one of the checklist in the preference center screen
    And user clicks on save preference button
    Then user validates preference updated message
      | Thank you, your preferences have been updated. |
      | Thank you, your preferences have been updated. |

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  @wert
  Scenario Outline: [My United]TC015 Settings --> My Profile --> Edit Profile --> Make changes and Save. Validate if the new changes are added to the profile
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
    And user click on setting icon on top righhand side
    And user clicks on My profile icon
    And user clicks on edit profile button

    #Edit profile navigates to web page and locator were not available hence not feasable in adroid
    #Then user validates the firstname,surname,email,dob is displayed and not editable in edit profile screen
    #And user clears all data in textbox in edit profile screen in ios
    #And user clicks save details in edit profile screen
    #And user changes the following textbox in edit profile screen in ios
    #| Addr1      | Addr2      | Addr3      | Town      | pincode   |
    #| Test Addr1 | Test Addr2 | Test Addr3 | Test Town | Test12345 |
    #And user clicks save details in edit profile screen in ios
    #Then user validates the success message in edit profile in ios
    #| Success Message                 |
    #| Your details have been updated. |
    #Then user validates the given data in edit profile screen in ios
    #| Addr1      | Addr2      | Addr3      | Town      | pincode   |
    #| Test Addr1 | Test Addr2 | Test Addr3 | Test Town | Test12345 |
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  @Matchday_Android
  Scenario Outline: [My United]TC016 Verify on my United screen user are displayed with About you section with text containing user FN, LN, Country< age details personalised.
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
    Then user validates My united text in myunited screen
      | my united text |
      | MY UNITED      |
    And user navigates to About you in my united screen
    Then user validates text containing user Firstname lastName Country and Age details personalised

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC017 Native Login [>13 and <13] and Social Login
    #Social login possible only for >13 and its covered in IDM TC008 and TC009
    #Social login <13 - Under 13 registrations are not allowed to be linked to a social account" in Manu app
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
    And user validate t shirt name is displayed as "<Name>"

    #<13 (manutesting13)  and >13 (manupreprod) native app
    Examples: 
      | username                  | password | Name      |
      | manutesting13@yopmail.com | Manu@123 | TESTING13 |
      | manupreprod@yopmail.com   | Manu@123 | PREPROD   |

  @Matchday_Android
  Scenario Outline: [My United]TC018 Verify Tapping on My United from botton nav takes user to My United screen and if user is logged in they are presented with profile screen with Red, Platinum, gold background based on user memership type.
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
    Then user validates the background colour of profile screen

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
