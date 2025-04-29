@Sanity_AndroidOSLessThan13 @Onboarding_Android
Feature: Onboarding

  Scenario: [Onboarding]TC001 Verify the all three screens of the manchester app onboarding  for less than OS 13
    Given user navigates to manu android application
    Then user validates all objects in screen one using api
    And user navigates to screen three
    Then user validates all objects in screen three using Api
    And user navigates to screen four
    Then user validates all objects in screen four using Api

  Scenario: [Onboarding]TC005 Select a favorite player from "Who is your favourite United player?" and tap to confirm should land user to screen with headline "Sign for United"  for less than OS 13
    Given user navigates to manu android application
    And user navigates to screen three
    And user swipes to select the favorite player and validates player name using Api
    And user clicks confirm button
    Then user validates all objects in screen four using Api

  Scenario Outline: [My United]TC006 Validate shirt number not zero in My United screen for less than OS 13
    Given user navigates to manu android application
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
    Then user validate t shirt number not zero

    Examples: 
      | username             | password |
      | manupreprod@yopmail.com | Manu@123 |
