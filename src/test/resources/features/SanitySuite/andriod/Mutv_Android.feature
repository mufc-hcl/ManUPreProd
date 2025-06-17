@Sanity_Android @MUTV_Android
Feature: MUTV Feature

  Scenario: [MUTV]TC001 &TC002 Verify tapping on My List icon displays My List screen and tapping on back button should take user back to MUTV screen ,Verify "Find Something to Add" button along with "+" icon is displayed when there is no favorite item added to My List
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
    And user clicks on MyList icon
    Then user verify the following details using Api
    #| title   | desc                                                                                                                              | add button            |
    #| MY LIST | Add your favourite shows and episodes to your list to enjoy them at any time – just hit the My List + icon on any show or episode | FIND SOMETHING TO ADD |
    And user clicks on back button and navigates to mutv screen

  Scenario: [MUTV]TC003 & TC004 Verify tapping on Schedule icon displays MUTV Schedule screen and tapping on back button should take user back to MUTV screen,In the MUTV Schedule screen user should see the list of the EPG schedules for next 7 days
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on the notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user clicks on Schedule icon
    And user validate MUTV Today Schecule description using api
    Then user validate list containing schedules for next seven days
    And user clicks on Back icon
    

  Scenario Outline: [MUTV]TC005 & TC006 Verify user is able add Video to the My List from Video landing screen_Verify item is removed from My list when user taps on My list icon in Video/Audio landing screen after adding.
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
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    #    And user clicks on in app message notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user clicks on MyList icon
    And user clicks on plus icon
    And user clicks on one video
    And user clicks on plus mylist icon
    And user click on less than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate video
    And user clicks on video icon in mylist screen
    And user clicks on uncheck mylist icon
    And user click on less than symbol button in my list screen
    And user click on greater than symbol button in my list screen
    And user clicks on MyList icon
    Then user validate no videos in mylist screen
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
    

  Scenario Outline: [MUTV]TC007 Verify that CBS badges display for  subscribe display
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

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: [MUTV]TC008 Verify that CBR badges display for register signup screen
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
    And user selects the video and checks CBR badge
    Then validate register screen is displayed
    And user clicks on log in button in subscribe page
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |


  Scenario: [MUTV]TC009 Validate the MUTV hero carousel when enabled from CMS  and having one or more cards in the carousel
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #    And user clicks on the notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user clicks on the hero carousel dots in Mutv screen

  Scenario Outline: [MUTV]TC010 & TC011 MUTV schedule screen should have the EPG schedule list with the current time , Video icon , White border, Playing Now text , Title and Play button with red color dot blinking
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
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user clicks on Schedule icon
    And user validate MUTV Today Schecule description using api
    Then user validates time,video icon,playing now text,title and play button
    And user clicks on play button in schedule screen
    #    And user clicks pause button
    #    And user clicks play button
    And user clicks on close button

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
      

  Scenario Outline: [MUTV]TC012 Validate the Set Reminder and Close functionality of the upcoming MUTV Schedules
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
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
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
      


  Scenario Outline: [MUTV]TC013 Verify tapping on clip type video plays the videos in full screen
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
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    And user clicks on Mutv tab
    And user clicks on explore icon
    And click on a video in mutv page
    #    And user obtained the current video time
    #    And user plays the video for twenty seconds
    #    Then user validates the video is played using play time
    And user clicks on pause icon in the played video
    And user clicks on the close button in the played video

     Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  #below two test caess added by Automation team and moving to regression pack
  #@APITestAndroid
  #Scenario Outline: [MUTV]TC015 Verify podcaset in MUTV screen
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #And user clicks on Mutv tab
  #And user clicks on explore icon
  #Then user validates podcaset heading in MUTV screen using API
  #@APITestAndroid
  #Scenario Outline: [MUTV]TC016 Verify View all EPC Ten MOST EMOTIONAL MOMENTS in MUTV screen
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #And user clicks on Mutv tab
  #And user clicks on explore icon
  #And user clicks on view all in MUTV screen in ios
  #Then user validate list in EPC Ten MOST EMOTIONAL MOMENTS screen
  
  Scenario: :[Explore]TC014 Mutv search screen testcases
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
    #Validate the Global search screen is launched without any issue by clicking on the Search Icon from United Now screen
    And user clicks search button in mutv screen
    And user validates popular and categories section in the search screen
    And user validates the popular content in the search screen
    Then user verify all carousel is displayed in mutv page using api
    #DMD-2229- EXPLORE - SEARCH - Search return Result (without Data)
    And user validates without data in search screen

  Scenario: [MUTV]TC015 Verify that CBS/CBR badges display for previous and future schedule program but not for the current program for logout user
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
    And user clicks on Schedule icon
    Then user validates the CBS/CBR badges is not displayed for current program
    Then user validates the CBS/CBR badges display for previous schedule program
    Then user validates the CBS/CBR badges display for future schedule program
    
    #@MUTV_56
    #Scenario Outline: [MUTV]TC016 Verify on tapping Podcast it opens the same and start playing along with its expected controls
     #Given user navigates to manu android application
    #And user navigates to screen two
    #And user navigates to screen three
    #And user navigates to screen four
    #And user click on skip button in screen four
    #And user clicks on ok button in cookies screen
    #And user clicks continue in MUApp popup
    #And user clicks on not now button in match appearance alert screen
    #And user clicks on braze in app msg
    #And user clicks on Mutv tab
    #And user clicks on explore icon
    #And user checks for UTD Podcast in MUTV
    #Then user clicks on first podcast in MUTV
    #And user clicks on log in button in subscribe page
    #And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
     #And user clicks on login button in login screen
    #And user clicks continue in MUApp popup
    #And user clicks on close from notification
    #Then user validates play button in podcast audio screen
    #And user clicks on back icon in podcast audio screen
    #And user clicks on united now in bottom tab
    #Then user validates prodcast audio minimized and playing
    #And user click on My United in bottom tab
    #Then user validates prodcast audio minimized and playing
    #And user clicks on Mutv tab
    #And user checks for Top twenty collections in MUTV
    #And user clicks on first top collection video in MUTV
    #And user clicks on play button 
    #Then user clicks on the close button in the played video 
    #Examples: 
      #| username                | password |
      #| manupreprod@yopmail.com | Manu@123 |
      
     
     #Scenario Outline: [MUTV]TC019 Verify on tapping Podcastit opens the same and start playing along with its expected controls
     #Given user navigates to manu android application
    #And user navigates to screen two
    #And user navigates to screen three
    #And user navigates to screen four
    #And user click on skip button in screen four
    #And user clicks on ok button in cookies screen
    #And user clicks continue in MUApp popup
    #And user clicks on not now button in match appearance alert screen
    #And user clicks on braze in app msg
    #And user clicks on Mutv tab
    #And user clicks on explore icon
    #And user checks for UTD Podcast in MUTV
    #Then user clicks on first podcast in MUTV
    #And user clicks on log in button in subscribe page
    #And user enter the valid email "<username>" and valid password "<password>"
     #And user clicks on login button in login screen
    #And user clicks continue in MUApp popup
    #And user clicks on close from notification
    #Then user validates play button in podcast audio screen
    #And user clicks on back icon in podcast audio screen
    #And user clicks on united now in bottom tab
    #Then user validates prodcast audio minimized and playing in BG
    #And user click on My United in bottom tab
    #Then user validates prodcast audio minimized and playing
    #And user clicks on Mutv tab
    #And user checks for Top twenty collections in MUTV
    #And user clicks on first top collection video in MUTV
    #And user clicks on play button 
    #Then user clicks on the close button in the played video 
    #Examples: 
      #| username                | password |
      #| manupreprod@yopmail.com | Manu@123 |
      
    Scenario: [MUTV]TC017 Validate the MUTV hero carousel when disabled from CMS
    #prerequisite - Inform QA team to disable MUTV hero carousel from CMS
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #    And user clicks on the notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user validates the MUTV hero carousel is not displayed when disabled from CMS
    