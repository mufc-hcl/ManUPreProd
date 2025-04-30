@Sanity_Android @Onboarding_Android
Feature: Onboarding

  Scenario: [Onboarding]TC001 Verify the all four screens of the manchester app onboarding
    Given user navigates to manu android application
    Then user validates all objects in screen one using api
    And user navigates to screen two
    Then user validates all objects in screen two using Api
    And user navigates to screen three
    Then user validates all objects in screen three using Api
    And user navigates to screen four
    Then user validates all objects in screen four using Api


  Scenario Outline: [Onboarding]TC002 TC003 Native dialouge asking user to allow dont allow notifications should display
    Given user navigates to manu android application
    And user navigates to screen two
    And user clicks on allow button
    Then user validate all objects in allow notifcation screen
      | notification                                   | allow | dontallow   |
      | Allow Man Utd to send you notifications? | Allow | Don’t allow |
    And user clicks on "<notificationbutton>" button in notification screen
    Then user validates all objects in screen three using Api

    Examples: 
      | notificationbutton |
      | allow_button       |
      | deny_button        |

  Scenario: [Onboarding]TC004 Native dialouge asking user click on ask me later
    Given user navigates to manu android application
    And user navigates to screen two
    And user clicks on ask me later
    Then user validates all objects in screen three using Api

  Scenario: [Onboarding]TC005 Select a favorite player from "Who is your favourite United player?" and tap to confirm should land user to screen with headline "Sign for United"
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user swipes to select the favorite player and validates player name using Api
    And user clicks confirm button
    Then user validates all objects in screen four using Api

  Scenario: [Onboarding]TC006 Tap on Skip or swipe left to right should land user to screen with headline "Sign for United"
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user click on skip button in screen three
    Then user validates all objects in screen four using Api
#need to create seperate testng file to verify
    #  Scenario: [Onboarding]TC0011 Verify the all three screens of the app onboarding for android users with OS<13
  #    Given user initiated the Android Session with os version less than Thirteen
  #    Then user validates three screens only displayed
