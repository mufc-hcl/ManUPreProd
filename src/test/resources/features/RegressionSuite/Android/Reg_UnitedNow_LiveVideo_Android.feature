@Regression_Android @MUTV_LiveVideo_Android
Feature: United Now Live Video feature

  Scenario Outline: DMD-2279 DMD-2280 DMD-2283 Validate Live Video and audio Appearing on Non Match Day and Match day and validate Live Video section
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on continue in personal your experience popupwindow
    And user click on close in app myUnited popup
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on rightArrow button in test slide up message
    And user clicks on close from notification
    And user clicks on united now in bottom tab
    And user clicks on rightArrow button in test slide up message
    And user clicks on image popup button in top Braze in-app message 1 for logout user
    #And user validate audio button presented
    Then user validate video button presented
    And user validate text in live video section
      | watchnow  |
      | WATCH NOW |
    And user clicks on WatchNow button and live content
      | Live |
      | LIVE |
    And user validate maximize button presented
    And user validate pause button presented
    And user clicks on pause and validate video stopped

    #And user clicks on play and validate video started
    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
