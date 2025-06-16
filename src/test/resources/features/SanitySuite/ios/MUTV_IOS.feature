@Sanity_IOS @MUTV_IOS
Feature: MUTV IOS feature

@MUTV_001
  Scenario: [MUTV]TC001 &TC002 Verify tapping on My List icon displays My List screen and tapping on back button should take user back to MUTV screen ,Verify "Find Something to Add" button along with "+" icon is displayed when there is no favorite item added to My List
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
    And user clicks on MyList icon in ios
    And user clicks on login to add calender button in ios
    #And user clicks on continue button in ios
    #And user enter the valid email and valid password for subscribed user in ios
    #And user clicks on log in button in ios
    #And user clicks on login to add calender button in ios
    #And user clicks on MyList icon in ios
    Then user verify the following details in ios using Api
    #| title   | desc                                                                                                                              | add button            |
    #| MY LIST | Add your favourite shows and episodes to your list to enjoy them at any time – just hit the My List + icon on any show or episode | FIND SOMETHING TO ADD |
    And user clicks on back button and navigates to mutv screen in ios
    

  Scenario: [MUTV]TC003 & TC004 Verify tapping on Schedule icon displays MUTV Schedule screen and tapping on back button should take user back to MUTV screen,In the MUTV Schedule screen user should see the list of the EPG schedules for next 7 days
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
    And user clicks on Schedule icon in ios
    And user validate MUTV Today Schecule description using api
    Then user validate list containing schedules for next seven days in ios
    And user clicks on Back icon in ios


  Scenario: [MUTV]TC005 & TC006 Verify user is able add Video to the My List from Video landing screen_Verify item is removed from My list when user taps on My list icon in Video/Audio landing screen after adding.
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
    And user enter the valid email and valid password for subscribed user in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    And user clicks on MyList icon in ios
    And user clicks on plus icon in ios
    #    And user clicks on view all mutv page
    And user clicks on one video in ios
    And user clicks on plus mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validate video in ios
    And user clicks on video icon in mylist screen in ios
    And user clicks on uncheck mylist icon in ios
    And user click on less than symbol button in my list screen in ios
    And user click on greater than symbol button in my list screen in ios
    And user clicks on MyList icon in ios
    Then user validate no videos in mylist screen in ios

Scenario Outline: [MUTV]TC007 Subscribe badge should be displayed on the content that is marked behind Subscription
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

    #And user clicks on play Icon for CBS video
     Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [MUTV]TC008 CBR screen should be displayed when user tries to open the content that is marked behind registration and on login user should be taken to the respective screen
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
    And user enter the valid email and valid password for subscribed user in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in subscribe screen in ios
    And user clicks on play Icon for CBR video

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |


  Scenario: [MUTV]TC009 Validate the MUTV hero carousel when enabled from CMS  and having one or more cards in the carousel
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
    And user clicks on the hero carousel dots in Mutv screen in ios


  Scenario Outline: [MUTV]TC010 & TC011 MUTV schedule screen should have the EPG schedule list with the current time , Video icon , White border, Playing Now text , Title and Play button with red color dot blinking
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
    And user enter the valid email and valid password for subscribed user in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    And user clicks on Schedule icon in ios
    And user validate MUTV Today Schecule description using api
    Then user validates time,video icon,playing now text,title and play button in ios
    And user clicks on play button in schedule screen in ios
    #not able to find he locators to play and pause the video in the player hence not automated it
    #And user clicks pause button in ios
    #And user clicks play button in ios
    #And user clicks play button in ios
    And user clicks on close button in ios

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |


  Scenario Outline: [MUTV]TC012 Validate the Set Reminder and Close functionality of the upcoming MUTV Schedules
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on allow button in ios
    And user clicks on "<notificationbutton>" button in notification screen in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email and valid password for subscribed user in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    And user clicks on Schedule icon in ios
    And user clicks on plus icon in mutv schedule screen
    And user clicks on set remainder icon
    Then validate the tick icon displayed in ios
    And user clicks on the tick icon in ios
    And user clicks on remainder set icon in ios
    Then validate the tick icon is removed in mutv schedule screen
    And user clicks on plus icon in mutv schedule screen
    Then validate close icon is displayed
    And user clicks in close icon in remainder set page

    Examples: 
      | notificationbutton | username                | password |
      | allow_button       | manupreprod@yopmail.com | Manu@123 |

  
  #below two test caess added by Automation team and moving to regression pack
  #Scenario Outline: [MUTV]TC015 Verify podcaset in MUTV screen
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on ask me later in screen two in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user clicks on not now button in match appearance alert screen in ios
  #And user clicks on Mutv tab in ios
  #And user clicks on explore icon in ios
  #		Then user validates podcaset heading in MUTV screen using API in ios
  #
  #Scenario Outline: [MUTV]TC016 Verify View all EPC Ten MOST EMOTIONAL MOMENTS in MUTV screen
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on ask me later in screen two in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user clicks on not now button in match appearance alert screen in ios
  #And user clicks on Mutv tab in ios
  #And user clicks on explore icon in ios
  #And user clicks on view all in MUTV screen in ios
  #Then user validate list in EPC Ten MOST EMOTIONAL MOMENTS screen in ios
 
 
  Scenario: [MUTV]TC013 Verify that CBS/CBR badges display for previous and future schedule program but not for the current program for logout user
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
    And user clicks on Schedule icon in ios
    Then user validates the CBS/CBR badges is not displayed for current program in ios
    Then user validates the CBS/CBR badges display for previous schedule program in ios
    Then user validates the CBS/CBR badges display for future schedule program in ios
    
    
     #Scenario Outline: [MUTV]TC014 Verify on tapping Podcastit opens the same and start playing along with its expected controls
    #Given user navigates to manu android application
    #And user clicks on cancel button in apple id screen
    #And user clicks lets go button in screen one in ios
    #And user clicks on ask me later in screen two in ios
    #And user clicks skip button in screen three in ios
    #And user click on skip button in screen four in ios
    #And user clicks on ok in the cookies screen in ios
    #And user clicks on not now button in match appearance alert screen in ios
    #And user clicks on Mutv tab in ios
    #And user clicks on explore icon in ios
    #And user checks for UTD Podcast in MUTV in ios
    #Then user clicks on first podcast in MUTV in ios
    #And user clicks on log in button in ios
    #And user clicks on continue button in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    #And user clicks on login button in subscribe screen in ios
    #Then user validates play button in podcast audio screen in ios
    #And user clicks on back icon in podcast audio screen in ios
    #And user clicks on united now tab in ios
    #Then user validates prodcast audio minimized and playing in ios
    #And user click on My United Logged in bottom tab in ios
    #Then user validates prodcast audio minimized and playing in ios
    #And user clicks on Mutv tab in ios
    #And user checks for Top twenty collections in MUTV in ios
    #And user clicks on first top collection video in MUTV in ios
    #And user clicks on play button in ios
    #Then user clicks on the close button in the played video in ios
    #
    #
    #
     #Examples: 
      #| username                | password |
      #| manupreprod@yopmail.com | Manu@123 |
      
   @mutv_IOS_20   
 Scenario Outline: [MUTV15] - Content Card - Logout & Login User - braze
 Given user navigates to manu android application
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
    And user enter the valid email and valid password for subscribed user in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    And user validates braze content card in MUTV
    
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |