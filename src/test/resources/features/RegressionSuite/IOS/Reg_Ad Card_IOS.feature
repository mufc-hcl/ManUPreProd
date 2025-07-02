@Regression_IOS @Reg_AdCard_IOS
Feature: Ad card feature

  @TC001_ios_AdCard
  Scenario: [AD CARD] DMD-2263-TC001_Ad Card - Internal Link to Other screen of the App
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    #And user navigates to adcard for internal link in united now screen in ios
    And user navigates to adcard for "Internal Link to Other screen of the App" in united now screen using api

  @TC002_ios_AdCard
  Scenario: [AD CARD] DMD-2262-TC002_Ad Card - External Link to external Browser
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    #And user navigates to adcard for external link in united now screen in ios
    #Then user validates  adcard external link in external browser in ios
     And user navigates to adcard for "External Link to external Browser" in united now screen using api

  @TC003_ios_AdCard
  Scenario: [AD CARD] DMD-2265-TC003_Ad Card - Internal Link to Next Gen
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    #And user navigates to adcard for internal link to next Gen in united now page in ios
    And user navigates to adcard for "Internal Link to Next Gen" in united now screen using api

  @TC004_ios_AdCard
  Scenario: [AD CARD] DMD-2264-TC004_Ad Card - Internal link to historical match next gen
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
    And user enter the valid email "manupreprod@yopmail.com" and valid password "Manu@123" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on united now tab in ios
    #And user navigates to adcard for internal link to historical match next Gen in united now page in ios
 		And user navigates to adcard for "Internal link to historical match next gen" in united now screen using api