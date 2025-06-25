@Sanity_Android @Braze_Android
Feature: Braze Funtionality

@TC001_Android_Braze
  Scenario Outline: [Braze]TC001 Upsell - Logout & Login User
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
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    And user clicks on united now in bottom tab
    Then user validates upsell functionality is displayed united now screen using API

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [My United]TC002 My United - Content Card - Logout & Login User - braze.
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
    Then user validates braze content card in myUnited Screen

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [MUTV] TC003 - Content Card - Logout & Login User - braze
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
    And user enter the valid email and valid password for subscribed user
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on Mutv tab
    And user clicks on explore icon
    Then user validates braze content card in MUTV

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

@TC004_Android_Braze
  Scenario: [Braze]TC004_United Now - Content Card - Logout & Login User
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks on close from notification
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user click on My United in bottom tab
    #And user clicks on log in button
    #And user enter the valid email "manupreprod@yopmail.com" and valid password "Manu@123"
    #And user clicks on login button in login screen
    #And user clicks on close from notification
    #And user clicks on united now tab
    Then user validates Braze card as second item in UN listing using api
   
