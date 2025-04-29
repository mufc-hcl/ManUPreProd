@Regression_Android @Reg_Explore_Android
Feature: Explore Android Regression features

  Scenario Outline: DMD-2187,DMD-2188,DMD-2189,DMD-2190,DMD-2191
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
    #DMD-2187- EXPLORE - LATEST - Hero card
    Then user validates hero card in Latest screen
    #DMD-2188-EXPLORE - LATEST - Page Filters
    And user clicks on page filters in latest screen
    #DMD-2190-EXPLORE - LATEST - Listing Page with latest Item
    Then user validates the latest item in latest screen
    #DMD-2189-EXPLORE - LATEST - CTA[Opening in Destination or Modal]
    And user clicks on the any one of the card in latest screen
    And user clicks on cross icon in latest card
    #DMD-2191-EXPLORE - LATEST - Share the cards
    And user clicks on share icon in any of the Latest cards
    And user clicks on message icon in share screen

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2192
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
    #DMD-2192-EXPLORE - LATEST - DFP Ad's as expected & CTA
    And user scrolls down to DFP Ads card in latest screen
    Then user validates the DFP Ad card and Click on Dfp ad card

  Scenario Outline: DMD-2193,DMD-2194
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
    #DMD-2194-EXPLORE - LATEST - Listing Page with latest Video
    And user selects a latest video in latest listing page
    #DMD-2193-EXPLORE - LATEST - CTA[Video PlayingÂ  inÂ  Video Modal]
    Then user validates the video playing in video destination page

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2215,DMD-2216,DMD-2217,DMD-2218,DMD-2219,DMD-2220
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #DMD-2215- EXPLORE - HELP - Contact Us &CTA (Hybrid Page)
    And user clicks search button in united screen
    And user clicks help carousel in search screen
    And user clicks continue in MUApp popup
    And user click on contact us link help screen
    Then I verify the contactUs text in contact us screen
      | contactUs  |
      | Contact Us |
    And user clicks on Back icon
    #DMD-2216-EXPLORE - HELP - FAQ's &CTA (Hybrid Page)
    #And user clicks help carousel in search screen
    And user click on faqs link help screen
    Then I verify the faqs text in faqs screen
      | faqs |
      | Faqs |
    And user clicks on Back icon
    #DMD-2217-EXPLORE - HELP - Accessibility &CTA (Hybrid Page)
    And user click on accessibility link help screen
    Then I verify the accessibility text in accessibility screen
      | accessibility |
      | Accessibility |
    And user clicks on Back icon
    #DMD-2218-EXPLORE - HELP - Term Of Use &CTA (Hybrid Page)
    And user click on Terms of Use link in help screen
    Then I verify the Terms of Use text in Terms of Use screen
      | Terms of Use |
      | Terms Of Use |
    And user clicks on Back icon
    #DMD-2219-EXPLORE - HELP - Privacy Policy &CTA (Hybrid Page)
    And user click on privacy policy link in help screen
    Then I verify the privacy policy text in privacy policy  screen
      | privacy policy |
      | Privacy Policy |
    And user clicks on Back icon
    #DMD-2220-EXPLORE - HELP - Send App Feedback &CTA (Native Screen)
    And user click on feedback link in help screen
    Then I verify the feedback text in feedback screen
      | feedback |
      | Feedback |
    And user enters below details in the feedback screen
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  
  Scenario: DMD-2221,DMD-2222
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
    #DMD-2221-EXPLORE - HISTORY - CTA (Hybrid Page)
    And user clicks history courosel in search screen
    Then user verify the story in history screen
      | story                                             |
      | MANCHESTER UNITED'S STORY: THE GREATEST EVER TOLD |
    #DMD-2222-EXPLORE - HISTORY - Items in Page CTA
    Then user validates the items in history page
    And user clicks on any one of the history item
    Then user validates the CTA history item

  Scenario Outline: DMD-2223,DMD-2224,DMD-2225,DMD-2226,DMD-2227
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
    #DMD-2224-EXPLORE - Other External Tiles - Shop
    And user clicks shop courosel in search screen
    Then user validates all the tabs names in shop screen
      | merch | membership | tickets | shoptab |
      | MERCH | MEMBERSHIP | TICKETS | SHOPTAB |
    And user swipes to left in shop page
    #DMD-2225-EXPLORE - Other External Tiles - MUTV
    And user clicks mutv courosel in search screen
    Then user verify the mutv screen
      | welcome to mutv | Description of mutv                                                                                                                                      | explore |
      | WELCOME TO MUTV | Welcome to the all-new MUTV, now available in the Manchester United App! Access MUTV 24/7, including your favourite shows & boxsets, live and on-demand. | EXPLORE |
    And user clicks on explore icon
    And user swipes to left in shop page
    #DMD-2226-EXPLORE - Other External Tiles - Predictions
    And user clicks search button in united screen
    And user clicks predictions courosel in search screen
    And user clicks on Back icon in predictions page
    #DMD-2227-EXPLORE - Other External Tiles - MY UNITED
    And user clicks on united now in bottom tab
    #And user clicks search button in united screen
    And user clicks my united courosel in search screen
    Then user verify the title
      | my united |
      | MY UNITED |
    #DMD-2223- EXPLORE - Other External Tiles - Tickets
    And user clicks on united now in bottom tab
    And user clicks buy tickets courosel in search screen
    Then user verify the ticket screen
      | Ticket title |
      | Tickets      |

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2228,DMD-2229,DMD-2230,DMD-2231
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
    #DMD-2229- EXPLORE - SEARCH - Search return Result (without Data)
    And user validates without data in search screen
    #DMD-2228- EXPLORE - SEARCH - Ability to enter text & Auto Suggestion
    And user search players or updates "<ExploreSearchText>" in United page
    Then user validates search Auto suggestions is displayed
    #DMD-2229- EXPLORE - SEARCH - Search return Result (with Data)
    Then user validates search Auto suggestions is displayed
    #DMD-2230- EXPLORE - SEARCH - Page filter (Based on Data in Service) [All, News, Videos, Image]
    And user enters image in search for "<ImageContent>" in page filter
    #Then user validates search result for image
    And user enters Videos in search for "<VideoContent>" in page filter
    #Then user validates search result for Videos
    And user enters News in search for "<NewsContent>" in page filter
    #Then user validates search result for News in ios
    And user enters All in search for "<AllContent>" in page filter
    #Then user validates search result for All
    #DMD-2231- EXPLORE - SEARCH - Related Searches for successful Search result
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

  Scenario: DMD-2195,DMD-2196,DMD-2197,DMD-2198,DMD-2199,DMD-2200
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
    #DMD-2195-  EXPLORE - FIXTURES AND TABLES - Page Filter (UNITED & ALL TEAM)
    And user clicks fixtures and table courosel in search screen
    Then user navigates to fixtures screen and validate below three values
      | united | All Teams | men |
      | UNITED | ALL TEAMS | Men |
    #DMD-2196-EXPLORE - FIXTURES AND TABLES - Upcoming Match Fixtures
    Then user validates the upcoming Fixtures
      | Fixtures                             |
      | TICKET STG INFO,TICKET INFO,DATE TBC |
    #DMD-2197      EXPLORE - FIXTURES AND TABLES - Old Match Results
    And user clicks on results icon in the united now screen
    Then user validates the results
      | results      |
      | MATCH REVIEW |
    #DMD-2199-EXPLORE - FIXTURES AND TABLES - League Filter (EPL, CL, etc only for Current year)
    And user clicks Three dots icon
    Then user validates the following leagues
      | All         | premier        | FA     | league     | Europe        | friendly |
      | All 2024/25 | Premier League | FA Cup | League Cup | Europa League | Friendly |
    #DMD-2200-EXPLORE - FIXTURES AND TABLES - Data reflection based on League filter Selection
    And user clicks Three dots icon
    Then user validates the following leagues
      | All         | premier        | FA     | league     | Europe        | friendly |
      | All 2024/25 | Premier League | FA Cup | League Cup | Europa League | Friendly |
    And user clicks the following filter in UnitedNow Calender screen
      | League      |
      | All 2024/25 |
    #    And user clicks all radio button and validates leagues displayed
    And user clicks Three dots icon
    And user clicks the following filter in UnitedNow Calender screen
      | League         |
      | Premier League |
    Then user validates the filtered league
      | Filter Validation                                                                     |
      | English Premier League,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon
    And user clicks the following filter in UnitedNow Calender screen
      | League |
      | FA Cup |
    Then user validates the filtered league
      | Filter Validation                                                     |
      | FA Cup,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon
    And user clicks the following filter in UnitedNow Calender screen
      | League     |
      | League Cup |
    Then user validates the filtered league
      | Filter Validation                                                          |
      | League Cup ,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon
    And user clicks the following filter in UnitedNow Calender screen
      | League        |
      | Europa League |
    Then user validates the filtered league
      | Filter Validation                                                             |
      | Europa League ,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon
    And user clicks the following filter in UnitedNow Calender screen
      | League   |
      | Friendly |
    Then user validates the filtered league
      | Filter Validation                                                        |
      | Friendly ,There are currently no fixtures available in this competition. |
    #DMD-2198- EXPLORE - FIXTURES AND TABLES - Different Teams Filter (First Team, Women, U23 and U18)
    And user click on men drop down and validates the dropdown values
      | Men | Women | Under 21s | Under 18s | Girls |
      | Men | Women | Under-21s | Under-18s | Girls |

  Scenario: DMD-2201,DMD-2202,DMD-2203,DMD-2204
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
    #DMD-2202-EXPLORE - FIXTURES AND TABLES - CTA to Table
    And user clicks on Table CTA Fixtures and tables page
    #DMD-2203- EXPLORE - FIXTURES AND TABLES - Table Page filter (Based on Data in Service)
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
    #DMD-2201-EXPLORE - FIXTURES AND TABLES - Buy Ticket/Hospitality/Tickey Info  for Home Match & CTA
    And user clicks back icon
    And user clicks fixtures and table courosel in search screen
    And user clicks on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page
    Then user verify the ticket screen
      | Ticket title |
      | Tickets      |
    And user clicks on cross icon in tickets page
    #DMD-2204-EXPLORE - FIXTURES AND TABLES - CTA [To Match Centre only for Result or 3 hour prior Match Live]
    And user clicks back icon
    And user clicks on results icon in the united now screen

  #And user clicks on match result in fixtures screen
  #And user clicks on post match analysis in united screen
  #Then user validates match center
  #|matchcenter|
  #|MATCH CENTRE|
  Scenario: DMD-2201,DMD-2202,DMD-2203,DMD-2204
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
    #DMD-2206-EXPLORE - FIXTURES AND TABLES - DFP Ad's as expected & CTA
    And user scrolls down to DFP Ads card in latest screen
    Then user validates the DFP Ad card and Click on Dfp ad card

  Scenario: DMD-2207,DMD-2208,DMD-2209
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
    #DMD-2207-EXPLORE - PLAYERS - Page filter (Based on Data in Service) [First Team, Reserve & etc.]
    Then user validates the following filter in the players screen
      | Filter1 | Filter2 | Filter3   | Filter4   | Filter5 |
      | MEN     | WOMEN   | UNDER-21S | UNDER-18S | LEGENDS |
    #DMD-2208-EXPLORE - PLAYERS - Player Detailed Page [First Team, Reserve, Academy, Manager & Staff, Legends]
    #DMD-2210-EXPLORE - PLAYERS - Stats and Profile Tab for Players (If Applicable)
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
    #DMD-2209-EXPLORE - PLAYERS - Latest section on player profile detail page
    And navigate to the latest section for the player
    And verify clicking on video or article navigates to the respective page

  Scenario: DMD-2211,DMD-2212,DMD-2213
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
    #DMD-2211-EXPLORE - PLAYERS - Match Live Stats and Season Stats for Players (If Applicable)
    And user clicks player from "men" tab
    And user clicks on stats tab in players screen
    Then user validates match live stats and season stats for players
      | Match Live | Season stats |
      | LAST MATCH | SEASON STATS |
    #DMD-2212-EXPLORE - PLAYERS - Tapping View More takes user to Search
    And user clicks on profile tab in players screen
    And user clicks on view more btn in palyers screen
    Then user validates the search page
    #DMD-2213-EXPLORE - PLAYERS - Share the player
    Then user validates the share icon in players screen
    And user clicks on share icon in players screen
    And user clicks on message icon in share screen

  Scenario: DMD-2211,DMD-2212,DMD-2213
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
    #DMD-2214-EXPLORE - PLAYERS - DFP Ad's as expected & CTA
    And user scrolls down to DFP Ads card in Players screen
    Then user validates the DFP Ad card and Click on Dfp ad card Players Screen
    @Regg
     Scenario: DMD-2205
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
       #DMD-2205-EXPLORE - FIXTURES AND TABLES - Crest Image for Teams (TABLET Only)
    Then user validates the crest image in fixtures screen
