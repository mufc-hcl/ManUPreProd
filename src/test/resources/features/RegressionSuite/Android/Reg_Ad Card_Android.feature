@Regression_Android @AdCard_Android
Feature: Ad card feature

  @TC001_android_AdCard
  Scenario: [AD CARD]DMD-2263 -TC001_Ad Card - Internal Link to Other screen of the App
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user navigates to adcard for "Internal Link to Other screen of the App" in united now screen using api

  #Then user checks for Adcard card in united now page using api
  @TC002_android_AdCard
  Scenario: [AD CARD] DMD-2262-TC002_Ad Card - External Link to external Browser
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
   # And user navigates to adcard for external link in united now screen
    And user navigates to adcard for "External Link to external Browser" in united now screen using api

  @TC003_android_AdCard
  Scenario: [AD CARD] DMD-2265 TC003_Ad Card - Internal Link to Next Gen
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    And user navigates to adcard for "Internal Link to Next Gen" in united now screen using api

  @TC004_android_AdCard
  Scenario: [AD CARD]  DMD-2264 TC004_Ad Card - Internal link to historical match next gen
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
    And user enter the valid email "manupreprod@yopmail.com" and valid password "Manu@123"
    And user clicks on login button in login screen
    And user clicks on close from notification
    And user clicks on united now tab
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    And user navigates to adcard for "Internal link to historical match next gen" in united now screen using api
