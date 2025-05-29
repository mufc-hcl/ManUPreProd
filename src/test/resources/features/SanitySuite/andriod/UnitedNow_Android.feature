@Sanity_Android @UnitedNow_Android
Feature: United now

  Scenario: [United now]TC001 Validate the What's New text along with the date and day in united now screen
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then verify whats new or live match blog in home page using api
    Then user validates the current day and date

  Scenario: [United now]TC002 Validate if the filter is not selected by default
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on filter icon
    Then user validates filter is not selected by default

  Scenario: [United now]TC003 Validate the filter functionality on United Now when filter is selected & TC004  Validate the filter functionality on United Now when filter is unselected
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on filter icon
    Then user validates select all icon using api
    Then user validates filters feeds in united now screen using api
    And user clicks on each filter and validates section and deselection of each filter
    And user clicks on select all icon
    Then user validate the clear all icon in UnitedNow page Using Api

  Scenario: [United now]TC005,TC006,TC007 Validation of Fixture Calender Icon,Men and United Tabs and Men Dropdown List
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user click on My United in bottom tab
    #And user clicks on united now in bottom tab
    And user click on calender icon
    Then user navigates to fixtures screen and validate below three values
      | united | All Teams |
      | UNITED | ALL TEAMS |
    And user click on men drop down and validates the dropdown values using API

  @ToBeFixedTC008
  Scenario: [United now]TC008 Validate the fixture listing page show the data based on the Team + League filter applied
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks continue in MUApp popup
    And user click on calender icon
    And user clicks Three dots icon
    Then user validates the following leagues using Api
    And user clicks the following filter in UnitedNow Calender screen and validate content in the body
  
  Scenario: [United now]TC009 Validate the fixture listing page has Results and Upcoming fixtures data
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks continue in MUApp popup
    And user click on calender icon
    And user clicks Three dots icon
    And user clicks the following filter in UnitedNow Calender screen
      | League      |
      | All 2025/26 |
    Then user validates the upcoming Fixtures using Api

  Scenario: [United now]TC0010 Validate if the Greetings message , Stories Carousel and Coming Up carousel are displayed in United Now page when enabled from CMS
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user validates Greetings message in united now is displayed
    Then user validates Stories Carousel in united now is displayed
    Then user validates Coming Up carousel in united now is displayed using API

  #ToBeFixed Till Auguest 9th Table will not be availabe - Murali to confirm
  #Scenario: [United now]TC0011 Validate the Table CTA from Upcoming fixtures page and then validate the same data and filters applied
    #Given user navigates to manu android application
    #And user navigates to screen two
    #And user navigates to screen three
    #And user navigates to screen four
    #And user click on skip button in screen four
    #And user clicks on ok button in cookies screen
    #And user clicks on not now button in match appearance alert screen
    #And user clicks on braze in app msg
    #And user clicks continue in MUApp popup
    #And user click on calender icon
    #And user clicks on table icon from any scheduled match
    #Then user validates the Men match schedule using API
    #| League1        | League2       |
    #| PREMIER LEAGUE | EUROPA LEAGUE |
    #And user selects "Women" from the dropdown
    #Then user validates the Women match schedule using API
    #| League1              | League2                |
    #| WOMEN'S SUPER LEAGUE | CONTINENTAL LEAGUE CUP |
    #And user selects "under21" from the dropdown
    #Then user validates the under twenty one match schedule using API
    #| League1          | League2    |
    #| PREMIER LEAGUE 2 | EFL TROPHY |
    #And user selects "under18" from the dropdown
    #Then user validates the under eighteen match schedule using API

  #| League1            | League2           |
  #| U18 PREMIER LEAGUE | UEFA YOUTH LEAGUE |
  Scenario: [United now]TC0012 Validate Clicking on the Player icons from United Now top right corner and then validate the page filter (Based on Data in Service) [First Team, Reserve & etc.]
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks the player icon in united now screen
    Then user validates the Players filter items in the players screen using Api
    And user clicks player from "men" tab
    Then verify profile and stats tab are displayed
    And navigates to the joined section
    And user clicks back icon
    And user clicks player from "women" tab
    Then verify profile and stats tab are displayed
    And navigates to the joined section
    And user clicks back icon
    And user clicks player from "under23" tab
    Then verify profile and stats tab are displayed
    And navigates to the joined section
    And user clicks back icon
    And user clicks player from "under18" tab
    Then verify profile and stats tab are displayed
    And navigates to the joined section
    And user clicks back icon
    And user clicks player from "legends" tab
    Then verify profile and stats tab are displayed
    And navigate to the latest section for the player
    And verify clicking on video or article navigates to the respective page

  Scenario: [United now]TC0013 United Now Carousel should display in United Now when it's Fixture, Result or No Spotlight
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user clicks on the stories carousel
    And user validates the story page is displayed

  Scenario: [United now]TC0014 First Card In Carousel should be Fixture or Result Spotlight and deeplink to Match listing or respective match centre.
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks on the coming up carousel
    Then user validates the carosel page is displayed for the carousel
    And user validates stories carousel is displayed in Match or Result card using API

  Scenario: [United now]TC0015 Validate if the Greetings message / Stories Carousel / Coming Up carousel are not displayed in United Now page when disabled from CMS
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user validates Greetings message is not displayed in united now page
    Then user validates Stories Carousel is not displayed in united now
    Then user validates Coming Up carousel is not displayed in united now

  Scenario: [United now]TC0016 Validate the upsell functionality in United Now if upsell is enabled from CMS
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user validates upsell functionality is displayed united now screen using API

  Scenario Outline: [United now]TC0017 Validate the Live Video functionality in United Now if enabled from CMS
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
    And user clicks on united now in bottom tab
    Then user validates live video is displayed in united now screen using Api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC0018 UNITED NOW - Validate the functionality of the Article card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for article card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline:: TC019 UNITED NOW - Validate the functionality of the Video card from United Now feeds/United Now Storiese
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
  And user clicks on close from notification
  And user clicks on united now tab
  Then user checks for video card in united now page using api
  Examples:
  | username                | password |
  | manupreprod@yopmail.com | Manu@123 |
  
  Scenario Outline: TC020 UNITED NOW - Validate the functionality of the gallery card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for gallery card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC021 UNITED NOW - Validate the functionality of the Quote card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for quote card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC022 UNITED NOW - Validate the functionality of the Quiz card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for quiz card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC023 UNITED NOW - Validate the functionality of the Poll card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for poll card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC024 UNITED NOW - Validate the functionality of the Competition card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for Competition card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC025 UNITED NOW - Validate the functionality of the Adcard from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for Adcard card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario Outline: TC026 UNITED NOW - Validate the functionality of the Image card from United Now feeds/United Now Stories
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
    And user clicks on close from notification
    And user clicks on united now tab
    Then user checks for Image card in united now page using api

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario: TC027 UNITED NOW All Configured Sponsor get displayed
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #And user clicks on united now tab
    Then user validates Sponsor logo in united now screen using API
