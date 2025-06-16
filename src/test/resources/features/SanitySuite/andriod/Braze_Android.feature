@Sanity_Android @Braze_Android
Feature: Braze Funtionality

  @Android_TC001_Braze
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
