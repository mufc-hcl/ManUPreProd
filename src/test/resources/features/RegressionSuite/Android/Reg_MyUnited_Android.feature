@Regression_Android @Reg_Myunited_Android
Feature: Regression -MyUnited Test Cases

  Scenario Outline: DMD-2233,DMD-2238
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
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    Then user navigated to my united screen and validates the following text using Api
      | Streaks       | Total       | Appearances |
      | DAILY STREAKS | TOTAL SCORE | APPEARANCES |
#  DMD-2238-MY UNITED - MY UNITED - Favourite Player from Profile
    And user scrolls down to favorite player screen
    And user validates payer image n my united screen
    And user click on setting icon on top righhand side
    And user clicks on My profile icon
#DMD-2233-MY UNITED - MY UNITED - Native Login/Log Out
    Then user validates the following in my profile screen
      | Edit profile Icon | Change password Icon | Change email icon | Preference centre icon | Logout icon |
    And user clicks on Logout icon
    And user selects yes from the want to logout alert box
    And user clicks on not now button in match appearance alert screen

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2254,DMD-2255,DMD-2256 Validate the stickers carousel and then click on 'View All' then click on the back icon from the My United Stickers page
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
#	DMD-2254	MY UNITED - STICKERS - Stickers carousel
#	DMD-2255	MY UNITED - STICKERS - Stickers sharing
#	DMD-2256	MY UNITED - STICKERS - Stickers update when updating the app
    Then user validates my stickers carousel in My united screen
    And user clicks on view all button
    And user clicks on first sticker in Stickers Screen
    And user select search image from share option
    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2241-MY UNITED - MY UNITED - Settings-General-Language
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
    #DMD-2241-MY UNITED - MY UNITED - Settings-General-Language
    And user click on Language in the General Screen
    And user clicks on chinese Language in langugae Screen
    And user clicks on confirm button in Language Screen
    #And user selects the dont allow button in audio notification alert after Refresh
    #And user selects Dont allow in the photos and videos access in alert after Refresh
    Then user validates calender Icon in chinese
    And user click on My United in bottom tab which is in chinese Language
    And user click on setting icon on top righhand side which is in chinese Language
    And user click on GENERAL link in setting screen which is in chinese Language
    And user click on Language in the General Screen which is in chinese Language
    And user clicks on English Language in langugae Screen
    And user clicks on confirm button in Language Screen which is in chinese Language
    Then user validates calender Icon

  Scenario Outline: DMD-2242	MY UNITED - MY UNITED - Edit Profile
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
    #work around step to navigate to edit profile when not displayed
    #    And user clicks on account deletion and clicks close icon in deletion screen
#    DMD-2242	MY UNITED - MY UNITED - Edit Profile
    And user clicks on edit profile button

    #    Then user validates the firstname,surname,email,dob is displayed and not editable in edit profile screen
    #    And user changes the following textbox in edit profile screen
    #      | Addr1      | Addr2      | Addr3      | Town      | Country |
    #      | Test Addr1 | Test Addr2 | Test Addr3 | Test Town | India   |
    #    And user clicks save details in edit profile screen
    #    Then user verify the success message and validates the given data in edit profile screen
    #      | Success Message                 | Addr1      | Addr2      | Addr3      | Town      | Country |
    #      | Your details have been updated. | Test Addr1 | Test Addr2 | Test Addr3 | Test Town | India   |
    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2237-MY UNITED - MY UNITED - Settings-General->Help
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
    #DMD-2237	MY UNITED - MY UNITED - Settings-General
    And user click on setting icon on top righhand side
    And user click on GENERAL link in setting screen
    And user click on HELP link in general screen
    And user click on contact us link help screen
    Then I verify the contactUs text in contact us screen
      | contactUs  |
      | Contact Us |
    And user clicks on Back icon
    And user click on faqs link help screen
    Then I verify the faqs text in faqs screen
      | faqs |
      | Faqs |
    And user clicks on Back icon
    And user click on accessibility link help screen
    Then I verify the accessibility text in accessibility screen
      | accessibility |
      | Accessibility |
    And user clicks on Back icon
    And user click on Terms of Use link in help screen
    Then I verify the Terms of Use text in Terms of Use screen
      | Terms of Use |
      | Terms Of Use |
    And user clicks on Back icon
    And user click on privacy policy link in help screen
    Then I verify the privacy policy text in privacy policy  screen
      | privacy policy |
      | Privacy Policy |
    And user clicks on Back icon
    And user click on feedback link in help screen
    Then I verify the feedback text in feedback screen
      | feedback |
      | Feedback |
    And user enters below details in the feedback screen
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |
#    Then user validates the success message
#      | success message             |
#      | Feedback sent successfully. |

  Scenario: DMD-2237-MY UNITED - MY UNITED - Settings-General->Rate App
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
    #DMD-2237-MY UNITED - MY UNITED - Settings-General->Rate App
    And user click on GENERAL link in setting screen
    And user click on Rate app in the General Screen
    Then user validate google play
      | googlePlay Text                                                       |
      | Sign in to find the latest Android apps, games, movies, music, & more |

  Scenario Outline: DMD-2236	MY UNITED - MY UNITED - Settings--Notification->Allow
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
    # DMD-2236	MY UNITED - MY UNITED - Settings--Notification->Allow
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

  Scenario Outline: DMD-2236-MY UNITED - MY UNITED - Settings--Notification->Deny notification
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
    #DMD-2236-MY UNITED - MY UNITED - Settings--Notification->Deny notification
    Then user validates the given alerts in notifications screen
      | Alert1            | Alert2       |
      | UNITED NOW ALERTS | MATCH ALERTS |
    And user clicks on united now alert in notification screen
    And user click on latest alert switch in united now alerts screen
    And user selects go to settings from enable alerts dialog box
    And user clicks on notifications switch in settings
    And user clicks back icon in the settings
    And user validates the general alerts in united now alerts screen
    And user clicks on back button in United now alerts screen
    And user clicks on match alert in notification screen
    And user validates the match alerts in match alerts screen

    Examples:
      | notificationbutton |
      | deny_button        |

  Scenario Outline: TC006 Validate if user is able to see the name on jersey and the shirt number updated at the bottom of the My United screen should reflect on the Jersey  t shirt name
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
    #back to top
    And user updates the t shirt numbers at buttom of the screen and click on back to top button
    Then user validate t shirt number from the previous step
    And user validate t shirt name is displayed

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: TC007 Click on the Primary and Secondary CTA buttons displayed below the jersey card section
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
    And user clicks on get official membership CTA button in my united screen
    Then user validate tickets title in get official membership screen
      | tickets title |
      | Tickets       |
    And user click on close icon in get official membership screen
    And user click on buy shirt CTA button in my united screen

    #Then user validates shop now is displayed
    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: TC008 Validate the My United Season Score card , Total Score card , Daily Streaks card , Appearances card navigations
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
    Then user scrolls down to validates this season card in My united now screen
      | score this season | my united |
      | Score this season | MY UNITED |
    And user clicks on total score card in my united screen
    Then user validates content in total score card
      | my united total score | prediction  | daily streaks | appearance  |
      | MY UNITED TOTAL SCORE | Predictions | Daily Streaks | Appearances |
    And user clicks on back icon in total score card
    And user scroll right to left to navigate daily streaks cards "<Daily streaks>"
    Then user validate daily streaks card in my united screen
      | daily streaks | consecutive                 | view |
      | DAILY STREAKS | Consecutive days in the app | VIEW |
    And user clicks on daily streaks card in my united screen
    Then user validates content in daily streaks card
      | daily streaks | best score | share |
      | DAILY STREAKS | BEST SCORE | SHARE |
    And user clicks on back icon in daily streaks card
    Then user validates appearance card in my united screen
      | appearance  | this season | view |
      | APPEARANCES | This Season | VIEW |
    And user clicks on appearance card in my united screen
    Then user validates content in appearance card
      | appearance  | share |
      | APPEARANCES | SHARE |
    And user clicks on back Icon in appearance card

    Examples:
      | username             | password | Daily streaks |
      | Manutest@yopmail.com | Manu@123 | DAILY STREAKS |

  Scenario Outline: DMD-2238-MY UNITED - MY UNITED - Favourite Player from Profile
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
    #DMD-2238-MY UNITED - MY UNITED - Favourite Player from Profile
    And user scrolls down to favorite player screen
    And user validates payer image n my united screen
    And user clicks on edit button in my united screen
    Then user validates the below details in choose player screen
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |
    And user selects a favorite player in players screen
    Then user validates player details updated in my united screen
      | player name | buy shirt CTA |
      | Lisandro    | Buy Shirt     |
    Then user validates the star icon is displayed
    #    And clicks on  buy shirt button in my united screen
    #    Then user validates shop page
    #      | shop |
    #      | Shop |
    #    And user click on cross icon in shop screen
    And user click on edit icon in my united screen
    Then user validates the below details in choose player screen
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |
    And user edits the favorite player in player screen
    Then user validates the star icon is displayed
    Then user validates edited player details in my united screen
      | player name | country flag |
      | Brandon     | England      |
    And user clicks on country flag in my united screen
    Then user validates the below details in choose player screen
      | choose player | men | women |
      | CHOOSE PLAYER | Men | Women |

    Examples:
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2252-MY UNITED - MY UNITED BENEFITS - Check the above use cases in Onboarding screen journey
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    #DMD-2253	MY UNITED - MY UNITED BENEFITS - Check 'View Benefit' link in onboarding screen journey
    Then user validates my united benefits displayed in onboarding screen
    #DMD-2245	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles in Onboarding screen journey
    Then user validates benefits tiles in onboarding screen
    #DMD-2248	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles when image is 1X image
    Then user validates benefits tiles when image is onex image


  Scenario: DMD-2253,DMD-2245,DMD-2248-Check 'View Benefit' link in onboarding screen journey
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
    #DMD-2253	MY UNITED - MY UNITED BENEFITS - Check 'MY UNITED BENEFITS' link in my united screen journey
    Then user validates view benefits displayed in myunited screen
    #DMD-2245	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles in my united screen journey
    Then user validates benefits tiles in myunited screen
    #DMD-2248	MY UNITED - MY UNITED BENEFITS - Check Benefit tiles when image is 1X image
    Then user validates benefits tiles when image is onex image in my united page

#    Then user validates benefits tiles