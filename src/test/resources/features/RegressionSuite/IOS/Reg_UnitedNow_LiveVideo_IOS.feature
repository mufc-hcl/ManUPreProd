#@Regression_IOS @MUTV_LiveVideo_IOS
Feature: United Now Live Video feature

  Scenario Outline: DMD-2279 DMD-2280 DMD-2283 Validate Live Video and audio Appearing on Non Match Day and Match day and validate Live Video section
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
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on rightArrow button in test slide up message in ios
    And user clicks on close from notification in ios
    And user clicks on united now in bottom tab in ios
    And user clicks on rightArrow button in test slide up message in ios
    And user clicks on image popup button in top in ios
    #And user validate audio button presented in ios
    Then user validate video button presented in ios
    And user validate text in live video section in ios
      | watchnow  |
      | WATCH NOW |
    And user clicks on WatchNow button and live content in ios
      | Live |
      | LIVE |
    And user validate maximize button presented in ios
    And user validate pause button presented in ios
    #And user clicks on pause and validate video stopped in ios
    #And user clicks on play and validate video started in ios
    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
