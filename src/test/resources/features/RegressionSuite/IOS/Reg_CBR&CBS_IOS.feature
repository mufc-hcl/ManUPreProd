@Regression_IOS @Reg_CBR&CBS_IOS
Feature: Regression -CBR&CBS Test Cases

  Scenario Outline: DMD-2173,DMD-2174,DMD-2175,DMD-2176
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    #DMD-2173-CBR&CBS - Register badge should be displayed on the content that is marked behind registration
    And user selects the video and check CBR badge in ios
    #DMD-2174- CBR&CBS - CBR screen should be displayed when user tries to open the content that is marked behind registration
    Then user validate Register screen is displayed in ios
      | signUp title | Desc              |
      | SIGN UP      | REGISTER FOR FREE |
    #DMD-2176- CBR&CBS - Verify user is able to open the content behind registration by logining in from CBR screen
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in subscribe screen in ios
    #DMD-2177- CBR&CBS - Verify Mylist can be marked behind registration.
    And user clicks on plus mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    And user clicks on test continue and clicks on back icon
    Then user validates the CBR video in My list screen in ios
    #DMD-2175- CBR&CBS - Verify CBR badge is not displayed for the logged in user.
    And user clicks on back button and navigates to mutv screen in ios
    And user selects the video and check CBR badge in ios
    Then user validates the CBR badge is not displayed for Logged in user in ios

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: TC007 & TC008 &TC009 Verify that CBS badges display for previous and future schedule program but not for the current program for logout user,for subscribe display
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    #DMD-2178- CBR&CBS - Subscribe badge should be displayed on the content that is marked behind Subscription
    And user selects the video and check CBS badge in ios
    #DMD-2179 - CBR&CBS - Subscription journey screen should be displayed when user tries to open the content that is marked behind Subscription
    Then validate subscribe screen is displayed in ios
      | subscription title | Desc                            |
      | SUBSCRIBE          | START YOUR SUBSCRIPTION JOURNEY |
    And user clicks on login button in subscribe screen
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in subscribe screen in ios
    And user clicks on test continue and clicks on back icon
    #DMD-2185 - CBR&CBS - Verify Mylist can be marked behind Subscription.
    And user clicks on plus mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validates the CBS video in My list screen in ios

    Examples: 
      | username             | password   |
      | qa1_user@yopmail.com | Molina146$ |

  Scenario Outline: DMD-2180
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
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    #DMD-2180- CBR&CBS - Verify Subscribe badge is displayed for the logged in user.
    And user selects the video and check CBS badge in ios
    Then validate subscribe screen is not displayed
    
    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
