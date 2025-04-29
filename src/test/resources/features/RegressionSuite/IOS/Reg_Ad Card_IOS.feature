@Regression_IOS @Reg_AdCard_IOS
Feature: Ad card feature

@IOS_AdCard
  Scenario: DMD-2263 AD CARD - AD CARD - Ad Card - Internal Link to Other screen of the App
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
    And user navigates to adcard for internal link in united now screen in ios

@IOS_AdCard
  Scenario: DMD-2262	AD CARD - AD CARD - Ad Card - External Link to external Browser
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
    And user navigates to adcard for external link in united now screen in ios
    Then user validates  adcard external link in external browser in ios

@IOS_AdCard
  Scenario: DMD-2265 AD CARD - AD CARD - Ad Card - Internal Link to Next Gen
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
    And user navigates to adcard for internal link to next Gen in united now page in ios

@IOS_AdCard
  Scenario: DMD-2264 AD CARD - AD CARD - Ad Card - Internal link to historical match next gen
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
    And user navigates to adcard for internal link to historical match next Gen in united now page in ios
    
    
    
    
    
    
    