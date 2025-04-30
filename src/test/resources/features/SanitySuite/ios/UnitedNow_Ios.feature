@Sanity_IOS @UnitedNow_IOS
Feature: United now

  Scenario: [United now]TC001 Validate the What's New text along with the date and day in united now screen
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then verify whats new or live match blog in home page using api in ios

  #Then user validates the current day and date in ios
  Scenario: [United now]TC002 Validate if the filter is not selected by default
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on filter icon in ios
    And user validates filter is not selected by default in ios

  Scenario: [United now]TC003,TC004  Validate the filter functionality on United Now when filter is selected &  Validate the filter functionality on United Now when filter is unselected
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on filter icon in ios
    Then user validates select all icon in ios using api
    Then user validates filters feeds in united now screen in ios using api
    And user clicks on each filter and validates section and deselection of each filter in ios
    And user clicks on select all icon in ios using Api
    Then user validate the clear all icon in UnitedNow page in ios Using Api

  Scenario: [United now]TC005,TC006,TC007 Validation of Fixture Calender Icon,Men and United Tabs and Men Dropdown List
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    Then user navigates to fixtures screen and validate below three values in ios
      | united         | All Teams         |
      | UNITEDTab Item | ALL TEAMSTab Item |
    And user click on men drop down and validates the dropdown values in ios using API

 Scenario: [United now]TC008 Validate the fixture listing page show the data based on the Team + League filter applied
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    And user clicks Three dots icon in ios
    Then user validates the following leagues using Api
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League      |
      | All 2024/25 |
    Then user validate DummyTestSiteCore text using api in ios
     And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League        |
      | Europa League |
    Then user validate Europa League text using api
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League   |
      | Friendly |
    Then user validate Friendly text using api
    #And user clicks Three dots icon in ios
    #And user clicks the following filter in UnitedNow Calender screen in ios
      #| League         |
      #| Premier League |
    #Then user validate English Premier League text using api
    # UI it has text English FA Cup but in API response body it has only FA Cup
    #And user clicks Three dots icon in ios
    #And user clicks the following filter in UnitedNow Calender screen in ios
      #| League |
      #| FA Cup |
    #Then user validate FA Cup text using api
    # UI it has text English League cup but in API response body it has only League cup
    #And user clicks Three dots icon in ios
    #And user clicks the following filter in UnitedNow Calender screen in ios
      #| League     |
      #| League Cup |
    #Then user validate League Cup text using api
    
  Scenario: [United now]TC009 Validate the fixture listing page has Results and Upcoming fixtures data
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League      |
      | All 2024/25 |
    #Then user validates the upcoming Fixtures in ios
    Then user validates the results in ios Using Api

  Scenario: [United now]TC0010 Validate if the Greetings message , Stories Carousel and Coming Up carousel are displayed in United Now page when enabled from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user validates Greetings message in united now is displayed in ios
    Then user validates Stories Carousel in united now is displayed in ios
    Then user validates Coming Up carousel in united now is displayed in ios

  Scenario: [United now]TC0011 Validate the Table CTA from Upcoming fixtures page and then validate the same data and filters applied
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on calender icon in ios
    And user clicks on table icon from any scheduled match in ios
    Then user validates the Men match schedule in ios
    #| League1                | League2               |
    #| PREMIER LEAGUETab Item | EUROPA LEAGUETab Item |
    And user clicks on men tab in ios
    And user clicks on women tab and validates the Women match schedule in ios
    #| League1                      | League2                        |
    #| WOMEN'S SUPER LEAGUETab Item | CONTINENTAL LEAGUE CUPTab Item |
    And user clicks on women tab in ios
    And user clicks on under tweenty oneS and validates the under twenty one match schedule in ios
    #| League1                  | League2            |
    #| PREMIER LEAGUE 2Tab Item | EFL TROPHYTab Item |
    And user clicks on under tweenty oneS tab in ios
    And user clicks on under eighteenS validates the under eighteen match schedule in ios
  #| League1                    | League2                   |
  #| U18 PREMIER LEAGUETab Item | UEFA YOUTH LEAGUETab Item |
  
  
  Scenario: [United now]TC0012 Validate Clicking on the Player icons from United Now top right corner and then validate the page filter (Based on Data in Service) [First Team, Reserve & etc.]
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks the player icon in united now screen in ios
    Then user validates the Players filter items in the players screen in ios using API
    #| Filter1     | Filter2       | Filter3           | Filter4           | Filter5         |
    #| MENTab Item | WOMENTab Item | UNDER-23STab Item | UNDER-18STab Item | LEGENDSTab Item |
    And user clicks women tab in ios
    And user clicks player from "men" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "women" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "under23" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "under18" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "legends" tab in ios
    Then verify profile and stats tab are displayed in ios
    And user clicks back icon in ios
    And user clicks player from "women" tab in ios
    And navigate to the latest section for the player in ios
    And verify clicking on video or article navigates to the respective page in ios

  Scenario: [United now]TC0013 United Now Carousel should display in United Now when it's Fixture, Result or No Spotlight
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user validates Stories Carousel in united now is displayed in ios
    And user clicks on the stories carousel
    Then user validates the story page is displayed

  Scenario: [United now]TC0014 First Card In Carousel should be Fixture or Result Spotlight and deeplink to Match listing or respective match centre.
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks on the coming up carousel
    Then user validates the carosel page is displayed for the carousel

  Scenario: [United now]TC0015 Validate if the Greetings message / Stories Carousel / Coming Up carousel are not displayed in United Now page when disabled from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user validates Greetings message is not displayed in united now page in ios
    Then user validates Stories Carousel is not displayed in united now in ios
    Then user validates Coming Up carousel is not displayed in united now in ios

  Scenario Outline: [United now]TC0016- Validate the functionality of the Article card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for article card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC0017 - Validate the functionality of the Video card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for video card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC0018 - Validate the functionality of the gallery card from United Now feeds/United Now Stories
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on united now tab in ios
    Then user checks for gallery card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario: [United now]TC0019 Validate the Live Video functionality in United Now if enabled from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user validates live video is displayed in united now screen in ios using Api

  Scenario Outline: [United now]TC0020 - Validate the functionality of the Quote card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for quote card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC021 - Validate the functionality of the Quiz card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for quiz card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC022 - Validate the functionality of the Poll card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for poll card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC023 - Validate the functionality of the Competition card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for Competition card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC024 - Validate the functionality of the Adcard from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for Adcard card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario Outline: [United now]TC025 - Validate the functionality of the Image Card from United Now feeds/United Now Stories
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
    And user clicks on united now tab in ios
    Then user checks for Image card in united now page using api in ios

    Examples: 
      | username                  | password  |
      | manupreprod@yopmail.com | Manu@1234 |

  Scenario: [United now]TC0026 Validate the upsell functionality in United Now if upsell is enabled from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user validates upsell functionality is displayed united now screen in ios using API
