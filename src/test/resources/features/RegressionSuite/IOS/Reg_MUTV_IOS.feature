@Regression_IOS @MUTV_IOS_Reggression
Feature: MUTV IOS Regression features

  Scenario: DMD-2138,DMD-2139,DMD-2140,DMD-2141,DMD-2142
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    #DMD-2138 - MUTV - Verify MUTV tab is displayed in the Navigation bar
    Then user validates mutv tab in the navigation bar in ios
    #DMD-2139-MUTV - Verify Search option in MUTV screen
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    Then user validates the search icon in mutv screen in ios
    #DMD-2140 - MUTV - Verify Schedule icon is displayed in MUTV screen
    Then user validates schedule icon is displayed in MUTV screen in ios
    #DMD-2141 - MUTV - Verify My List icon is displayed in the MUTV screen
    Then user validates my list icon is displayed in the MUTV screen in ios
    #DMD-2142-MUTV - MUTV - Verify Hero container is displayed in MUTV when enabled from CMS
    Then user validates hero container is displayed in mutv when enabled from CMS in ios

  #And user clicks on the hero carousel dots in Mutv screen in ios
  #DMD-2143-MUTV - MUTV - Verify Hero container is not displayed in MUTV when it is not enabled from CMS
  #Then user validates hero container is not displayed in mutv when enabled from CMS in ios
  #DMD-2142- MUTV - Verify Hero container is displayed in MUTV when enabled from CMS
  #Then user validates Hero container is displayed in MUTV when enabled from CMS in ios
  Scenario: DMD-2145,DMD-2146,DMD-2147,DMD-2148,DMD-2149
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
    #DMD-2145- MUTV - Verify Episode carousels are displayed in the MUTV screen
    Then user validates Episode carousels are displayed in the MUTV screen in ios
    #DMD-2146 - MUTV - Verify View All button is displayed for Episode carousels
    Then user validates View All button is displayed for Episode carousels in ios
    #DMD-2147 - MUTV - Verify tapping in View all button displays Episode landing screen.
    And user clicks on view all mutv page in ios
    Then user validates Episode landing screen in ios
    #DMD-2148 - MUTV - Verify Video landing screen is displayed when user taps on Full episode type videos
    And user clicks on Full episode type videos in Video landing screen
    Then user validates the Video landing screen is displayed when user taps on Full episode type videos
    #DMD-2149- MUTV - Verify tapping on clip type video plays the videos in full screen.
    And user clicks on play icon in Video landing screen in ios
    Then validate tapping on clip type video plays the videos in full screen

  Scenario Outline: DMD-2150,DMD-2151,DMD-2152,DMD-2153,DMD-2157,DMD-2159
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
    #DMD-2150- MUTV - Verify My List is displayed in the Top left of the MUTV screen
    Then user validates my list icon is displayed in the MUTV screen in ios
    #DMD-2151- MUTV - Verify tapping on My List icon displays My List screen.
    And user clicks on MyList icon in ios
    #DMD-2158- MUTV - Verify "+" icon is displayed when there is no favorite item added to My List
    Then user validates plus icon is displayed in ios
    #DMD-2157- MUTV - Verify "Find Something to Add" button is displayed when there is no favorite item added to My List
    Then user verify the following details in ios
      | title   | desc                                                                                                                              | add button            |
      | MY LIST | Add your favourite shows and episodes to your list to enjoy them at any time – just hit the My List + icon on any show or episode | FIND SOMETHING TO ADD |
    #DMD-2152- MUTV - Verify tapping on back button in the My List icon navigates user back to the MUTV screen.
    And user clicks on back button and navigates to mutv screen in ios
    #DMD-2153 - MUTV - Verify user is able add Video to the My List from Video landing screen
    And user clicks on one video in ios
    And user clicks on plus mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validate video in ios
    #DMD-2159- MUTV - Verify item is removed from My list when user taps on My list icon in Video/Audio landing screen after adding.
    And user clicks on video icon in mylist screen in ios
    And user clicks on uncheck mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user click on greater than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validate no videos in mylist screen in ios

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2155 MUTV - Verify My List can be marked behind registration
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
    And user selects the video and check CBR badge in ios
    Then user validate Register screen is displayed in ios
      | signUp title | Desc              |
      | SIGN UP      | REGISTER FOR FREE |
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in subscribe screen in ios
    And user clicks on plus mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    And user clicks on test continue and clicks on back icon
    Then user validates the CBR video in My list screen in ios

    #And user clicks on CBR video icon in mylist screen in ios
    #And user clicks on uncheck mylist icon in ios
    #And user click on less than symbol button in my list screen in ios
    #And user click on greater than symbol button in my list screen in ios
    #And user clicks on MyList icon in ios
    #Then user validate no videos in mylist screen in ios
    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2156  - MUTV - Verify My List can be marked behind Subscription
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
    And user selects the video and check CBS badge in ios
    Then validate subscribe screen is displayed in ios
      | subscription title | Desc                            |
      | SUBSCRIBE          | START YOUR SUBSCRIPTION JOURNEY |
    And user clicks on login button in subscribe screen
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in subscribe screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on plus mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validates the CBS video in My list screen in ios

    #And user clicks on CBS video icon in mylist screen in ios
    #And user clicks on uncheck mylist icon in ios
    #And user click on less than symbol button in my list screen in ios
    #And user click on greater than symbol button in my list screen in ios
    #And user clicks on MyList icon in ios
    Examples: 
      | username             | password   |
      | qa1_user@yopmail.com | Molina146$ |

  Scenario Outline: DMD-2154- MUTV - Verify user is able add Podcast Audio to the My List from Audio landing screen
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
    And user clicks on MyList icon in ios
    And user clicks on plus icon in ios
    And user clicks on one podcast audio in ios
    And user clicks on plus icon in podcast audio screen
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validate Podcast Audio in ios

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
