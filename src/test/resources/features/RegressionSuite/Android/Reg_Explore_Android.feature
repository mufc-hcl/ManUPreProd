@Regression_Android @Reg_Explore_Android
Feature: Explore Android Regression features

  Scenario Outline: [EXPLORE] TC001- DMD-2187_LATEST - Hero card,DMD-2188_LATEST - Page Filters,DMD-2189-LATEST - CTA[Opening in Destination or Modal],DMD-2190_LATEST - Listing Page with latest Item,DMD-2191_LATEST - Share the cards
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
    And user clicks on united now in bottom tab
    And user clicks search button in united screen
    And user clicks latest courosel in search screen
    Then user validates hero card in Latest screen
    And user clicks on page filters in latest screen
    Then user validates the latest item in latest screen
    And user clicks on the any one of the card in latest screen
    And user clicks on cross icon in latest card
    And user clicks on share icon in any of the Latest cards
    And user clicks on message icon in share screen

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: [EXPLORE] TC002- DMD-2192_LATEST - DFP Ads as expected & CTA
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks latest courosel in search screen
    And user scrolls down to DFP Ads card in latest screen
    Then user validates the DFP Ad card and Click on Dfp ad card
@2187LATEST
  Scenario Outline: [EXPLORE]TC003- DMD-2193_LATEST - Listing Page with latest Video,DMD-2194_LATEST - CTA[Video PlayingÂ  inÂ  Video Modal]
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks latest courosel in search screen
    And user selects a latest video in latest listing page
    Then validate subscribe screen is displayed
    And user clicks on log in button in subscribe page
    And user enter the valid email and valid password for subscribed user
    #And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
    And user clicks on close from notification
    Then user validates the video playing in video destination page

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: [EXPLORE]TC004- DMD-2215_HELP - Contact Us &CTA (Hybrid Page),DMD-2216_HELP - FAQs &CTA (Hybrid Page),DMD-2217_HELP - Accessibility &CTA (Hybrid Page),DMD-2218_HELP - Term Of Use &CTA (Hybrid Page),DMD-2219_HELP - Privacy Policy &CTA (Hybrid Page),DMD-2220_HELP - Send App Feedback &CTA (Native Screen)  
   Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks help carousel in search screen
    And user clicks continue in MUApp popup
    And user click on contact us link help screen
    Then I verify the contactUs text in contact us screen
      | contactUs  |
      | Contact Us |
    And user clicks on Back icon
    #And user clicks help carousel in search screen
    And user click on faqs link help screen
    Then I verify the faqs text in faqs screen
      | faqs |
      | Faqs |
    And user clicks on Back icon
    And user click on accessibility link help screen
    Then I verify the accessibility text in accessibility screen
      | accessibility |
      | Accessibility |
    And user clicks on Back icon
    And user click on Terms of Use link in help screen
    Then I verify the Terms of Use text in Terms of Use screen
      | Terms of Use |
      | Terms Of Use |
    And user clicks on Back icon
    And user click on privacy policy link in help screen
    Then I verify the privacy policy text in privacy policy  screen
      | privacy policy |
      | Privacy Policy |
    And user clicks on Back icon
    And user click on feedback link in help screen
    Then I verify the feedback text in feedback screen
      | feedback |
      | Feedback |
    And user enters below details in the feedback screen
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  
  Scenario: [EXPLORE]TC005- DMD-2221_HISTORY - CTA (Hybrid Page),DMD-2222_HISTORY - Items in Page CTA
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks history courosel in search screen
    Then user verify the story in history screen
      | story                                             |
      | MANCHESTER UNITED'S STORY: THE GREATEST EVER TOLD |
    Then user validates the items in history page
    And user clicks on any one of the history item
    Then user validates the CTA history item

  Scenario Outline: [EXPLORE]TC006- DMD-2223_Other External Tiles - Tickets,DMD-2224_Other External Tiles - Shop,DMD-2225_Other External Tiles - MUTV,DMD-2226_Other External Tiles - Predictions,DMD-2227_Other External Tiles - MY UNITED
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
    And user clicks on united now in bottom tab
    And user clicks search button in united screen
    And user clicks shop courosel in search screen
    Then user validates all the tabs names in shop screen using API
    #Then user validates all the tabs names in shop screen
      #| merch | membership | tickets | shoptab |
      #| MERCH | MEMBERSHIP | TICKETS | SHOPTAB |
    And user swipes to left in shop page
    And user clicks mutv courosel in search screen
     Then user verify the following details using Api
    #Then user verify the mutv screen
      #| welcome to mutv | Description of mutv                                                                                                                                      | explore |
      #| WELCOME TO MUTV | Welcome to the all-new MUTV, now available in the Manchester United App! Access MUTV 24/7, including your favourite shows & boxsets, live and on-demand. | EXPLORE |
    And user clicks on explore icon
    And user swipes to left in shop page
    And user clicks search button in united screen
    And user clicks predictions courosel in search screen
    And user clicks on Back icon in predictions page
    And user clicks on united now in bottom tab
    #And user clicks search button in united screen
    And user clicks my united courosel in search screen
    Then user verify the title
      | my united |
      | MY UNITED |
    And user clicks on united now in bottom tab
    And user clicks buy tickets courosel in search screen
    Then user verify the ticket screen
      | Ticket title |
      | Tickets      |

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: [EXPLORE]TC007- DMD-2228_SEARCH - Ability to enter text & Auto Suggestion,DMD-2229_SEARCH - Search return Result (without Data),DMD-2230_SEARCH - Page filter (Based on Data in Service) [All, News, Videos, Image],DMD-2231_SEARCH - Related Searches for successful Search result
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user validates without data in search screen
    And user search players or updates "<ExploreSearchText>" in United page
    Then user validates search Auto suggestions is displayed
    Then user validates search Auto suggestions is displayed
    And user enters image in search for "<ImageContent>" in page filter
    #Then user validates search result for image
    And user enters Videos in search for "<VideoContent>" in page filter
    #Then user validates search result for Videos
    And user enters News in search for "<NewsContent>" in page filter
    #Then user validates search result for News in ios
    And user enters All in search for "<AllContent>" in page filter
    #Then user validates search result for All
    And user search players or updates "<ExploreSearchText>"Related Searches
    And user clicks on a player in search suggestions

    #Then user validates the search result
    #And user clicks on content related to search result
    #Then user validates the search result of the player
    #| Title                             |
    #| 'EVERYONE IS A PART OF THIS CLUB' |
    Examples: 
      | ExploreSearchText | ImageContent | VideoContent | NewsContent | AllContent |
      | Bruno             | image        | video        | News        | All        |
@firstcase
  Scenario: [EXPLORE]TC008- DMD-2195_FIXTURES AND TABLES - Page Filter (UNITED & ALL TEAM),DMD-2196_FIXTURES AND TABLES - Upcoming Match Fixtures,DMD-2197_FIXTURES AND TABLES - Upcoming Match Fixtures,DMD-2198_ FIXTURES AND TABLES - Different Teams Filter (First Team, Women, U23 and U18),DMD-2199_FIXTURES AND TABLES - League Filter (EPL, CL, etc only for Current year),DMD-2200_FIXTURES AND TABLES - Data reflection based on League filter Selection
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks fixtures and table courosel in search screen
  Then user navigates to fixtures screen and validate below three values
      | united | All Teams |
      | UNITED | ALL TEAMS |
 Then user validates the upcoming Fixtures using Api in united now
      #| Fixtures                             |
      #| TICKET STG INFO,TICKET INFO,DATE TBC |
    #And user clicks on results icon in the united now screen
    #Then user validates the results
      #| results      |
      #| MATCH REVIEW |
    And user clicks Three dots icon
     Then user validates the following leagues using Api
      #| All         | premier        | FA     | league     | Europe        | friendly |
      #| All 2024/25 | Premier League | FA Cup | League Cup | Europa League | Friendly |
    And user clicks Three dots icon
    #Then user validates the following leagues
      #| All         | premier        | FA     | league     | Europe        | friendly |
      #| All 2024/25 | Premier League | FA Cup | League Cup | Europa League | Friendly |
    And user clicks the following filter in UnitedNow Calender screen
      | League      |
      | All 2024/25 |
    #    And user clicks all radio button and validates leagues displayed
    And user clicks Three dots icon
    Then user validates the following leagues using Api
    And user select first radio option and validate content in the body
    And user select secound radio option and validate content in the body
    And user select third radio option and validate content in the body
    And user select fourth radio option and validate content in the body
    And user select fifth radio option and validate content in the body
  And user click on men drop down and validates the dropdown values using API
      #| Men | Women | Under 21s | Under 18s | Girls |
      #| Men | Women | Under-21s | Under-18s | Girls |

  Scenario: [EXPLORE]TC009- DMD-2201_FIXTURES AND TABLES - Buy Ticket/Hospitality/Tickey Info  for Home Match & CTA,DMD-2202_FIXTURES AND TABLES - CTA to Table,DMD-2203_FIXTURES AND TABLES - Table Page filter (Based on Data in Service),DMD-2204_FIXTURES AND TABLES - CTA [To Match Centre only for Result or 3 hour prior Match Live]
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks fixtures and table courosel in search screen
    And user clicks on Table CTA Fixtures and tables page
    Then user validates the Men match schedule
      | League1        | League2       |
      | PREMIER LEAGUE | EUROPA LEAGUE |
    And user selects "Women" from the dropdown
    Then user validates the Women match schedule
      | League1              | League2                |
      | WOMEN'S SUPER LEAGUE | CONTINENTAL LEAGUE CUP |
    And user selects "under21" from the dropdown
    Then user validates the under twenty one match schedule
      | League1          | League2    |
      | PREMIER LEAGUE 2 | EFL TROPHY |
    And user selects "under18" from the dropdown
    Then user validates the under eighteen match schedule
      | League1            | League2           |
      | U18 PREMIER LEAGUE | UEFA YOUTH LEAGUE |
    And user selects "girls" from the dropdown
    Then user validates the under girls match schedule
      | League1                    | League2                       | League3                     |
      | ENGLISH PGA U16 WOMENS CUP | ENGLISH PGA U21 WOMENS LEAGUE | ENGLISH WOMENS SUPER LEAGUE |
    And user clicks back icon
    And user clicks fixtures and table courosel in search screen
    And user clicks on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page
    Then user verify the ticket screen
      | Ticket title |
      | Tickets      |
    And user clicks on cross icon in tickets page
    And user clicks back icon
    And user clicks on results icon in the united now screen

  #And user clicks on match result in fixtures screen
  #And user clicks on post match analysis in united screen
  #Then user validates match center
  #|matchcenter|
  #|MATCH CENTRE|
  
  Scenario: [EXPLORE]TC010- DMD-2206_EXPLORE - FIXTURES AND TABLES - DFP Ad's as expected & CTA
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks fixtures and table courosel in search screen
    And user scrolls down to DFP Ads card in latest screen
    Then user validates the DFP Ad card and Click on Dfp ad card

  Scenario: [EXPLORE]TC011- DMD-2207_PLAYERS - Page filter (Based on Data in Service) [First Team, Reserve & etc.],DMD-2208_Player Detailed Page [First Team, Reserve, Academy, Manager & Staff, Legends],DMD-2209_Stats and Profile Tab for Players (If Applicable)
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks players courosel in search screen
    Then user validates the following filter in the players screen
      | Filter1 | Filter2 | Filter3   | Filter4   | Filter5 |
      | MEN     | WOMEN   | UNDER-21S | UNDER-18S | LEGENDS |
    And user clicks player from "men" tab
    Then verify profile and stats tab are displayed
    And navigates to the joined section
    And user clicks back icon
    And user clicks player from "women" tab
    Then verify profile and stats tab are displayed
    And navigates to the joined section
    And user clicks back icon
    And user clicks player from "under21" tab
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

  Scenario: [EXPLORE]TC012- DMD-2211_Match Live Stats and Season Stats for Players (If Applicable),DMD-2212_Tapping View More takes user to Search,DMD-2213_PLAYERS - Share the player
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks players courosel in search screen
    And user clicks player from "men" tab
    And user clicks on stats tab in players screen
    Then user validates match live stats and season stats for players
      | Match Live | Season stats |
      | LAST MATCH | SEASON STATS |
    And user clicks on profile tab in players screen
    And user clicks on view more btn in palyers screen
    Then user validates the search page
    Then user validates the share icon in players screen
    And user clicks on share icon in players screen
    And user clicks on message icon in share screen

  Scenario: [EXPLORE]TC013- DMD-2214_PLAYERS - DFP Ads as expected & CTA
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks players courosel in search screen
    And user clicks player from "men" tab
    And user scrolls down to DFP Ads card in Players screen
    Then user validates the DFP Ad card and Click on Dfp ad card Players Screen
    
     Scenario: [EXPLORE]TC014- DMD-2205_FIXTURES AND TABLES - Crest Image for Teams (TABLET Only)
     And user initiates the android Tablet Session
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks search button in united screen
    And user clicks fixtures and table courosel in search screen
    Then user validates the crest image in fixtures screen
