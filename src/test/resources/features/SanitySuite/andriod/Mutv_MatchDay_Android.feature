@MatchDay_Android @MUTV_Matchday_Android

Feature: MUTV Feature

Scenario Outline: [MUTV]TC007 Verify that CBS badges display for  subscribe display,[MUTV]TC010 & TC011MUTV schedule screen should have the EPG schedule list with the current time , Video icon , White border, Playing Now text , [MUTV]TC012 Title and Play button with red color dot blinking,Validate the Set Reminder and Close functionality of the upcoming MUTV Schedules
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user selects the video and check CBS badge
    Then validate subscribe screen is displayed
    And user clicks on log in button in subscribe page
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    Then user verify play button for the subscribed user
    And user clicks play button in the podcast screen
    Then user clicks on the close button in the played video
    And user click on less than symbol button in my list screen
    And user clicks on Schedule icon
    And user validate MUTV Today Schecule description using api
    Then user validates time,video icon,playing now text,title and play button
    And user clicks on play button in schedule screen
    #    And user clicks pause button
    #    And user clicks play button
    And user clicks on close button
    And user clicks on plus icon in mutv schedule screen
    And user clicks on go to settings
    And user clicks on notification from app info screen
    And user clicks on notifications switch in settings
    And user clicks back icon in the settings
    And user clicks back icon in the settings
    And user clicks on set remainder icon
    And user clicks on man utd stage in alarm and reminder
    And user clicks on alarm switch in alarm and remainder
    And user clicks back icon in the settings
    And user clicks back icon in the settings
    And user clicks on plus icon in mutv schedule screen
    And user clicks on set remainder icon
    Then validate the tick icon displayed
    And user clicks on plus icon in mutv schedule screen
    And user clicks on remainder set icon
    Then validate the tick icon is removed in mutv schedule screen
    And user clicks on plus icon in mutv schedule screen
    Then validate close icon is displayed
    And user clicks in close icon in remainder set page

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |