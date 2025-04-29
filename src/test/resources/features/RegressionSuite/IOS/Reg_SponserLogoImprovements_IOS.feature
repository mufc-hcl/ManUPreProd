@Regression_IOS @Reg_SponserLogoImprovements_IOS
Feature: Regression -Sponser Logo Improvements Test Cases IOS

  Scenario: DMD-6882,DMD-6884,DMD-6885,DMD-6886
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    And user navigates to previous match in fixtures page in ios
    And user  clicks on match review in fixtures page in ios
    And user clicks on post match analysis in ios
    #DMD-6882_Validate the alignment of sponsor logo on the Match Center Stats page, when sponsor details available_TC01
    Then user validates the sponser logo is displayed in stats match center in ios
    #DMD-6884-Validate the alignment of sponsor logo on the Line Ups page of Match Center_TC03
    And user clicks on lineup in match center in ios
    Then user validates the sponser logo is displayed in match center in ios
    #DMD-6885_Validate the alignment of sponsor logo on the Influencers page of Match Center_TC04
    And user clicks on influencers in match center in ios
    Then user validates the sponser logo is displayed in match center in ios
    #DMD-6886_Validate the alignment of sponsor logo on the Histogram page of Match Center_TC05
    Then user validates the sponser logo is displayed in match center in ios

  Scenario: DMD-6883_Validate the alignment of sponsor logo on the Match Center Stats page, when no sponsor details available_TC02
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    And user navigates to previous match in fixtures page in ios
    And user  clicks on match review in fixtures page in ios
    And user clicks on post match analysis in ios
   #DMD-6883_Validate the alignment of sponsor logo on the Match Center Stats page, when no sponsor details available_TC02
    Then user validates no sponsor logo in stats tab match center in ios

  Scenario: DMD-6887,DMD-6888,DMD-6889,DMD-6890,DMD-6891
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    And user navigates to previous match in fixtures page in ios
    And user  clicks on match review in fixtures page in ios
    And user clicks on post match analysis in ios
    #DMD-6887_Validate the alignment of sponsor logo on the Predictions home screen page of Match Center_TC06
    And user clicks on predictions tab in match center in ios
    Then user validates the Cadbury sponser logo is displayed in match centers in ios
    #DMD-6888 _Validate the alignment of sponsor logo on the Predictions Man of the Match page of Match Center_TC07
    And user clicks on man of the match in predictions page in ios
    Then user validates the sponser logo is displayed in predictions match center in ios
    And user clicks on back icon in predictions page in ios
    #DMD-6889_Validate the alignment of sponsor logo on the Predictions First Scorer page of Match Center_TC08
    And user clicks on first scorer in predictions page in ios
    Then user validates dxc sponsor logo in first scorer in ios
    And user clicks on back icon in predictions page in ios
    #DMD-6890_Validate the alignment of sponsor logo on the Predictions Line Up page of Match Center_TC09
    And user clicks on line up page in predictions page in ios
    Then user validates the sponser logo is displayed in predictions match center in ios
    And user clicks on back icon in predictions page in ios
    #DMD-6891_Validate the alignment of sponsor logo on the Predictions Correct Score page of Match Center_TC10
    And user clicks on correct scrore page in predictions page in ios
    Then user validates the sponser logo is displayed in predictions match center in ios
