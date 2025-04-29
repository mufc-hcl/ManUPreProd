@Regression_Android @Reg_EPG_Android
Feature: Regression -EPG Test Cases
  
  Scenario: DMD-2160,DMD-2161,DMD-2162,DMD-2163,DMD-2164,DMD-2165
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
    #DMD-2160-EPG - Verify that user can see EPG icon on top right in the MUTV screen
    Then user validates the epg icon in top right
    #DMD-2161-EPG - Verify that user is navigated to EPG schedule screen on clicking EPG icon
    And user clicks on Schedule icon
    Then user validates the schedule icon in epg schedule page
    #DMD-2162-EPG - Verify that user can see current program is selected default with white border and Play button
    Then user validates the current program with white border and play button
    #DMD-2163-EPG - Verify that default selected program has CURRENT TIME, VIDEOicon, RED DOT(blink), PLAYING NOW text, Program TITLE and PLAY BUTTON icon with red border
    Then user validates time,video icon,playing now text,title and play button
    #DMD-2165-EPG - Verify that CBR & CBS badges can display for previous and future schedule program
    Then user validates the CBR&CBS badges for future schedule program
    Then user validates the CBR and CBS Badges for previous schedule program
    #DMD-2164-EPG - Verify that on tapping PLAY BUTTON icon video starts play
    And user clicks on play button in schedule screen
    And user clicks on close button in ios

  Scenario Outline: DMD-2166,DMD-2167,DMD-2168,DMD-2169
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
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user clicks on Schedule icon
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
    #DMD-2166_EPG - Verify that Notification popup has MUTV icon and text, along with Program details
    Then user validates Mutv icon and description along with program details
    #DMD-2167_EPG - Verify that Notification popup has two buttons i.e., SET REMAINDER & CLOSE
    Then user validates set Reminder button and close button
    #DMD-2168_EPG - Verify that on clicking SET REMAINDER, popup should close and update the program with 'REMINDER SET' and tick mark
    And user clicks on set remainder icon
    Then validate the tick icon displayed in ios
    And user clicks on the tick icon in ios
    And user clicks on remainder set icon in ios
    Then validate the tick icon is removed in mutv schedule screen
    And user clicks on plus icon in mutv schedule screen
    #DMD-2169	EPG - EPG - Verify that on clicking CLOSE popup should close
    Then validate close icon is displayed
    And user clicks in close icon in remainder set page
    #DMD-2171_EPG - Verify that notification remainder can be removed by clicking on Tick icon and tap on REMAINDER SET button
      And user clicks on the tick icon in ios
    And user clicks on remainder set icon in ios
    Then validate the tick icon is removed in mutv schedule screen

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

      
      
      