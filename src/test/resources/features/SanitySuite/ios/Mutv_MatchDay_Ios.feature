@MatchDay_IOS @MUTV_Matchday_IOS

Feature: MUTV Feature

Scenario Outline: [MUTV]TC007 Verify that CBS badges display for  subscribe display,[MUTV]TC010 & TC011MUTV schedule screen should have the EPG schedule list with the current time , Video icon , White border, Playing Now text , [MUTV]TC012 Title and Play button with red color dot blinking,Validate the Set Reminder and Close functionality of the upcoming MUTV Schedules
    Given user navigates to manu android application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    #    And user navigates to Mens Highlights CBS video in ios
    And user selects the video and check CBS badge in ios
    Then validate subscribe screen is displayed in ios
      | subscription title |
      | SUBSCRIBE          |
    And user clicks on login button in subscribe screen
    And user clicks on continue button in ios
    And user enter the valid email and valid password for subscribed user in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in subscribe screen in ios
    Then user clicks on the close button in the played video in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on Schedule icon in ios
    And user validate MUTV Today Schecule description using api
    Then user validates time,video icon,playing now text,title and play button in ios
    And user clicks on play button in schedule screen in ios
    #not able to find he locators to play and pause the video in the player hence not automated it
    #And user clicks pause button in ios
    #And user clicks play button in ios
    #And user clicks play button in ios
    And user clicks on close button in ios
    And user clicks on plus icon in mutv schedule screen
    And user clicks on set remainder icon
    Then validate the tick icon displayed in ios
    And user clicks on the tick icon in ios
    And user clicks on remainder set icon in ios
    Then validate the tick icon is removed in mutv schedule screen
    And user clicks on plus icon in mutv schedule screen
    Then validate close icon is displayed
    And user clicks in close icon in remainder set page

    #And user clicks on play Icon for CBS video
     Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |