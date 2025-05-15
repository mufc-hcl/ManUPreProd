@CMS_disable_IOS
Feature: Validate functionality when disabled from CMS

  @CMS_disable_IOS_TC001_MUTV
  Scenario: [MUTV]TC001 Validate the MUTV hero carousel when disabled from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    And user validates the MUTV hero carousel is not displayed when disabled from CMS

  Scenario: [SHOP - NATIVE]TC002 Click on the shop tab and navigate to the shop screen with all the shop filters if disabled from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on shop tab in bottom tab in ios
    Then user validates all the tabs in shop screen not displayed when disabled from CMS in ios
