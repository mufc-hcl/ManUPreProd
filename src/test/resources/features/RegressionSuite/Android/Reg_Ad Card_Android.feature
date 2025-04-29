@Regression_Android @AdCard_Android
Feature: Ad card feature


  Scenario: DMD-2263 AD CARD - AD CARD - Ad Card - Internal Link to Other screen of the App
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    And user navigates to adcard for internal link in united now screen


  Scenario: DMD-2262	AD CARD - AD CARD - Ad Card - External Link to external Browser
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    And user navigates to adcard for external link in united now screen
    Then user validates  adcard external link in external browser

  Scenario: DMD-2265 AD CARD - AD CARD - Ad Card - Internal Link to Next Gen
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    And user navigates to adcard for internal link to next Gen in united now page


  Scenario: DMD-2264 AD CARD - AD CARD - Ad Card - Internal link to historical match next gen
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    #And user clicks on continue in personal your experience popupwindow
    #And user click on close in app myUnited popup
    And user navigates to adcard for internal link to historical match next Gen in united now page
    
    
    
    
    
    
    