@Sanity_IOS @Onboarding_IOS
Feature: Onboarding

  Scenario: [Onboarding]TC001 Verify the all four screens of the manchester app onboarding
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    Then user validates all objects in screen one in ios using Api
    And user clicks lets go button in screen one in ios
    Then user validates all objects in screen two in ios using Api
    And user clicks on ask me later in screen two in ios
    Then user validates all objects in screen three in ios using Api
    And user clicks skip button in screen three in ios
    Then user validates all objects in screen four in ios using Api

  Scenario Outline: [Onboarding]TC002 TC003 Native dialouge asking user to allow dont allow notifications should display
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on allow button in ios
    #Then user validate all objects in allow notifcation screen in ios
      #| notification                                       | allow | dontallow   |
      #| “Man Utd” Would Like to Send You Notifications | Allow | Don’t Allow |
    And user clicks on "<notificationbutton>" button in notification screen in ios
    Then user validates all objects in screen three in ios using Api

    Examples: 
      | notificationbutton |
      | allow_button       |
      | deny_button        |

  Scenario: [Onboarding]TC004 Native dialouge asking user click on ask me later
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    Then user validates all objects in screen three in ios using Api

  Scenario: [Onboarding]TC005 Select a favorite player from "Who is your favourite United player?" and tap to confirm should land user to screen with headline "Sign for United"
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user swipes to select the favorite player and validates player name using Api in ios
    And user clicks confirm button in ios
    Then user validates all objects in screen four in ios using Api

  Scenario: [Onboarding]TC006 Tap on Skip or swipe left to right should land user to screen with headline "Sign for United"
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    Then user validates all objects in screen four in ios using Api
