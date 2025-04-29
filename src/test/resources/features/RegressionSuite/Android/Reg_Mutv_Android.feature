@Regression_Android @Reg_MUTV_Android
Feature: Regression -MUTV Test Cases

  Scenario: DMD-2138,DMD-2139,DMD-2140,DMD-2142,DMD-2143,DMD-2145,DMD-2146,DMD-2147,DMD-2148,DMD-2149
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #DMD-2138-MUTV - MUTV - Verify MUTV tab is displayed in the Navigation bar
    Then user validates the Mutv Tab in the navigation bar
    And user clicks on Mutv tab
    And user clicks on explore icon
    #DMD-2139-MUTV - MUTV - Verify Search option in MUTV screen
    Then user validates the search option in mutv screen
    #DMD-2140-MUTV - MUTV - Verify Schedule icon is displayed in MUTV screen
    Then user validates schedule icon displayed in mutv screen
    #DMD-2142-MUTV - MUTV - Verify Hero container is displayed in MUTV when enabled from CMS
    Then user validates hero container is displayed in mutv when enabled from CMS
    And user clicks on the hero carousel dots in Mutv screen
    #DMD-2143-MUTV - MUTV - Verify Hero container is not displayed in MUTV when it is not enabled from CMS
    #Then user validates hero container is not displayed in mutv when enabled from CMS
    #DMD-2145MUTV - MUTV - Verify Episode carousels are displayed in the MUTV screen
    Then user validates episode carousels are displayed in mutv screen
    #DMD-2146-MUTV - MUTV - Verify View All button is displayed for Episode carousels
    Then user navigates to one of the episode carousel and validates the view all button
    #DMD-2147MUTV - MUTV - Verify tapping in View all button displays Episode landing screen.
    Then user taps and verify episode landing screen is displayed
    #DMD-2148-MUTV - MUTV - Verify Video landing screen is displayed when user taps on Full episode type videos
    Then user taps Full episode type videos and verify video landing page is displayed
    #DMD-2149-MUTV - MUTV - Verify tapping on clip type video plays the videos in full screen.
    Then user taps clip and video plays in full screen

  Scenario Outline: DMD-2141,DMD-2150,DMD-2151,DMD-2152,DMD-2153,DMD-2157,DMD-2158,DMD-2159
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
    #    And user clicks on in app message notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    #DMD-2141-MUTV - MUTV - Verify My List icon is displayed in the MUTV screen
    #DMD-2150-MUTV - MUTV - Verify My List is displayed in the Top left of the MUTV screen
    Then user validates my list icon is displayed in top left of mutv screen
    And user clicks on MyList icon
    #DMD-2151-MUTV - MUTV - Verify tapping on My List icon displays My List screen.
    Then user validates my list screen is displayed
    #DMD-2152-MUTV - MUTV - Verify tapping on back button in the My List icon navigates user back to the MUTV screen.
    Then user taps back icon and validate mutv page is displayed
    And user clicks on MyList icon
    #DMD-2157-MUTV - MUTV - Verify "Find Something to Add" button is displayed when there is no favorite item added to My List
    Then user validates find Something to Add button is displayed
    #DMD-2158-MUTV - MUTV - Verify "+" icon is displayed when there is no favorite item added to My List
    Then user validates plus icon is displayed
    And user clicks on plus icon
    #DMD-2153-MUTV - MUTV - Verify user is able add Video to the My List from Video landing screen
    And user clicks on one video
    And user clicks on plus mylist icon
    And user click on less than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate video
    And user clicks on video icon in mylist screen
    #DMD-2159-MUTV - MUTV - Verify item is removed from My list when user taps on My list icon in Video/Audio landing screen after adding.
    And user clicks on uncheck mylist icon
    And user click on less than symbol button in my list screen
    Then user validate no videos in mylist screen

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2156
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
    #DMD-2156-MUTV - MUTV - Verify My List can be marked behind Subscription
    And user selects the video and check CBS badge
    Then validate subscribe screen is displayed
    And user clicks on log in button in subscribe page
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    Then user verify play button for the subscribed user
    And user clicks play button in the podcast screen

    Examples: 
      | username             | password   |
      | qa1_user@yopmail.com | Molina146$ |

  Scenario Outline: DMD-2155
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
    #DMD-2155-MUTV - MUTV - Verify My List can be marked behind registration
    And user selects the video and checks CBR badge
    Then validate register screen is displayed
    And user clicks on log in button for CBR Video
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on plus mylist icon
    And user click on less than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate video

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2154 MUTV - Verify user is able add Podcast Audio to the My List from Audio landing screen
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
    #    And user clicks on in app message notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user clicks on MyList icon
    Then user validates my list screen is displayed
    Then user taps back icon and validate mutv page is displayed
    And user clicks on MyList icon
    And user clicks on plus icon
    And user clicks on one podcast audio in mutv screen
    And user clicks on plus mylist icon
    And user click on less than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate podcast audio in my list screen

    #And user clicks on video icon in mylist screen
    #DMD-2159-MUTV - MUTV - Verify item is removed from My list when user taps on My list icon in Video/Audio landing screen after adding.
    #And user clicks on uncheck mylist icon
    #And user click on less than symbol button in my list screen
    #Then user validate no videos in mylist screen
    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
