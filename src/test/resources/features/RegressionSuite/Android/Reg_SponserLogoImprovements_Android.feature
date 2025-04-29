@Regression_Android @Reg_SponserLogoImprovements_Android
Feature: Regression -Sponser Logo Improvements Test Cases

  Scenario: DMD-6882,DMD-6884,DMD-6885,DMD-6886
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    And user navigates to previous match in fixtures page
    And user  clicks on match review in fixtures page
    And user clicks on post match analysis
    #DMD-6882_Validate the alignment of sponsor logo on the Match Center Stats page, when sponsor details available_TC01
    Then user validates the sponser logo is displayed in match center
    #DMD-6884-Validate the alignment of sponsor logo on the Line Ups page of Match Center_TC03
    And user clicks on lineup in match center
    Then user validates the sponser logo is displayed in match center
    #DMD-6885_Validate the alignment of sponsor logo on the Influencers page of Match Center_TC04
    And user clicks on influencers in match center
    Then user validates the sponser logo is displayed in match center
    #DMD-6886_Validate the alignment of sponsor logo on the Histogram page of Match Center_TC05
    Then user validates the sponser logo is displayed in match center

  Scenario: DMD-6883_Validate the alignment of sponsor logo on the Match Center Stats page, when no sponsor details available_TC02
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    And user navigates to previous match in fixtures page
    And user  clicks on match review in fixtures page
    And user clicks on post match analysis
    Then user validates no sponsor logo in stats tab match center

  Scenario: DMD-6887,DMD-6888,DMD-6889,DMD-6890,DMD-6891
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    And user navigates to previous match in fixtures page
    And user  clicks on match review in fixtures page
    And user clicks on post match analysis
    #DMD-6887_Validate the alignment of sponsor logo on the Predictions home screen page of Match Center_TC06
    And user clicks on predictions tab in match center
    Then user validates the Cadbury sponsor logo in predictions page in match center
    #DMD-6888_Validate the alignment of sponsor logo on the Predictions Man of the Match page of Match Center_TC07
    And user clicks on man of the match in predictions page
    Then user validates the sponser logo is displayed in predictions match center
    And user clicks on back icon in predictions page
    #DMD-6889_Validate the alignment of sponsor logo on the Predictions First Scorer page of Match Center_TC08
    And user clicks on first scorer in predictions page
    Then user validates dxc sponsor logo in first scorer
    And user clicks on back icon in predictions page
    #DMD-6890_Validate the alignment of sponsor logo on the Predictions Line Up page of Match Center_TC09
    And user clicks on line up page in predictions page
    Then user validates the sponser logo is displayed in predictions match center
    And user clicks on back icon in predictions page
    #DMD-6891_Validate the alignment of sponsor logo on the Predictions Correct Score page of Match Center_TC10
    And user clicks on correct scrore page in predictions page
    Then user validates the sponser logo is displayed in predictions match center
