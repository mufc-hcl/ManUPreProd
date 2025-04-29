@Regression_Android @Reg_CBR&CBS_Android
Feature: Regression -CBR&CBS Test Cases


Scenario Outline: DMD-2173,DMD-2174,DMD-2175,DMD-2176
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
    #DMD-2173-CBR&CBS - Register badge should be displayed on the content that is marked behind registration
    And user selects the video and checks CBR badge
     #DMD-2174- CBR&CBS - CBR screen should be displayed when user tries to open the content that is marked behind registration
    Then validate register screen is displayed
    #DMD-2176- CBR&CBS - Verify user is able to open the content behind registration by logining in from CBR screen
    And user clicks on log in button for CBR Video
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    #DMD-2177- CBR&CBS - Verify Mylist can be marked behind registration.
    And user clicks on plus mylist icon
    And user click on less than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate video
    #DMD-2175- CBR&CBS - Verify CBR badge is not displayed for the logged in user.
    And user clicks on back button and navigates to mutv screen
     And user selects the video and checks CBR badge
    Then user validates the CBR badge is not displayed for Logged in user 

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
      
      Scenario Outline: TC007 & TC008 &TC009 Verify that CBS badges display for previous and future schedule program but not for the current program for logout user,for subscribe display
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
    #DMD-2178- CBR&CBS - Subscribe badge should be displayed on the content that is marked behind Subscription
    And user selects the video and check CBS badge
    #DMD-2179 - CBR&CBS - Subscription journey screen should be displayed when user tries to open the content that is marked behind Subscription
    Then validate subscribe screen is displayed
    And user clicks on log in button in subscribe page
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    Then user verify play button for the subscribed user
    And user clicks play button in the podcast screen
    #DMD-2186 - CBR&CBS - Verify Mylist can be marked behind Subscription.
       And user clicks on plus mylist icon
    And user click on less than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate video
    
    Examples:
      | username             | password   |
      | qa1_user@yopmail.com | Molina146$ |
      
      
     Scenario Outline: DMD-2180
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
    #DMD-2180- CBR&CBS - Verify Subscribe badge is displayed for the logged in user.
       And user selects the video and check CBS badge
        Then validate subscribe screen is not displayed
        
        Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |