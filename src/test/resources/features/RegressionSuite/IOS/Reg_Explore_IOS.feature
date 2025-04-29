@Regression_IOS @Reg_Explore_IOS
Feature: Explore IOS Regression features

  Scenario Outline: DMD-2187,DMD-2188,DMD-2189,DMD-2190,DMD-2191
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
    And user clicks on united now in bottom tab in ios
    And user clicks search button in united screen in ios
    And user clicks latest courosel in search screen in ios
    #DMD-2187- EXPLORE - LATEST - Hero card
    Then user validates hero card in Latest screen
    #DMD-2188-EXPLORE - LATEST - Page Filters
    And user clicks on page filters in latest screen
    #DMD-2190-EXPLORE - LATEST - Listing Page with latest Item
    Then user validates the latest item in latest screen
    #DMD-2189-EXPLORE - LATEST - CTA[Opening in Destination or Modal]
    And user clicks on the any one of the card in latest screen
    And user clicks on cross icon in latest card
    #DMD-2191-EXPLORE - LATEST - Share the   cards
    And user clicks on share icon in any of the Latest cards
    And user clicks on message icon in share screen

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario Outline: DMD-2193,DMD-2194
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
    And user clicks on united now in bottom tab in ios
    And user clicks search button in united screen in ios
    And user clicks latest courosel in search screen in ios
    #DMD-2194-EXPLORE - LATEST - Listing Page with latest Video
    And user selects a latest video in latest listing page in ios
    #DMD-2193-EXPLORE - LATEST - CTA[Video PlayingÂ  inÂ  Video Modal]
    Then user validates the video playing in video destination page in ios

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: DMD-2215,DMD-2216,DMD-2217,DMD-2218,DMD-2219,DMD-2220
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    #DMD-2215- EXPLORE - HELP - Contact Us &CTA (Hybrid Page)
    And user clicks search button in united screen in ios
    And user clicks help carousel in search screen in ios
    And user click on contact us link help screen in ios
    Then I verify the contactUs text in contact us screen in ios
      | contactUs  |
      | CONTACT US |
    And user clicks on Back icon
    #DMD-2216-EXPLORE - HELP - FAQ's &CTA (Hybrid Page)
    And user clicks help carousel in search screen in ios
    And user click on faqs link help screen in ios
    Then I verify the faqs text in faqs screen in ios
      | faqs |
      | FAQS |
    And user clicks on Back icon
    #DMD-2217-EXPLORE - HELP - Accessibility &CTA (Hybrid Page)
    And user click on accessibility link help screen in ios
    Then I verify the accessibility text in accessibility screen in ios
      | accessibility |
      | ACCESSIBILITY |
    And user clicks on Back icon
    #DMD-2218-EXPLORE - HELP - Term Of Use &CTA (Hybrid Page)
    And user click on Terms of Use link in help screen in ios
    Then I verify the Terms of Use text in Terms of Use screen in ios
      | Terms of Use |
      | TERMS OF USE |
    And user clicks on Back icon
    #DMD-2219-EXPLORE - HELP - Privacy Policy &CTA (Hybrid Page)
    And user click on privacy policy link in help screen in ios
    Then I verify the privacy policy text in privacy policy  screen in ios
      | privacy policy |
      | PRIVACY POLICY |
    And user clicks on Back icon
    #DMD-2220-EXPLORE - HELP - Send App Feedback &CTA (Native Screen)
    And user click on feedback link in help screen in ios
    Then I verify the feedback text in feedback screen in ios
      | feedback |
      | FEEDBACK |
    And user enters below details in the feedback screen in ios
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  Scenario: DMD-2221,DMD-2222
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    #DMD-2221-EXPLORE - HISTORY - CTA (Hybrid Page)
    And user clicks history courosel in search screen in ios
    Then user verify the story in history screen in ios
      | story                                             |
      | MANCHESTER UNITED'S STORY: THE GREATEST EVER TOLD |
    #DMD-2222-EXPLORE - HISTORY - Items in Page CTA
    Then user validates the items in history page ios
    And user clicks on any one of the history item in ios
    Then user validates the CTA history item in ios

  Scenario: DMD-2223,DMD-2224,DMD-2225,DMD-2226,DMD-2227
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    #DMD-2224-EXPLORE - Other External Tiles - Shop
    And user clicks shop courosel in search screen in ios
    Then user validates all the tabs names in shop screen in ios
      | merch | membership | tickets | shoptab |
      | MERCH | MEMBERSHIP | TICKETS | SHOPTAB |
    #DMD-2225-EXPLORE - Other External Tiles - MUTV
    And user clicks on united now in bottom tab in ios
    And user clicks mutv courosel in search screen in ios
    Then user verify the mutv screen in ios
      | welcome to mutv | Description of mutv                                                                                                                                      | explore |
      | WELCOME TO MUTV | Welcome to the all-new MUTV, now available in the Manchester United App! Access MUTV 24/7, including your favourite shows & boxsets, live and on-demand. | EXPLORE |
    #DMD-2226-EXPLORE - Other External Tiles - Predictions
    And user clicks on united now in bottom tab in ios
    And user clicks predictions courosel in search screen in ios
    #DMD-2227-EXPLORE - Other External Tiles - MY UNITED
    And user clicks on united now in bottom tab in ios
    And user clicks my united courosel in search screen in ios
    Then user verify the title in ios
      | my united |
      | MY UNITED |
    #DMD-2223- EXPLORE - Other External Tiles - Tickets
    And user clicks on united now in bottom tab in ios
    And user clicks buy tickets courosel in search screen in ios
    Then user verify the ticket screen in ios
      | Ticket title |
      | TICKETS      |

  Scenario Outline: DMD-2228,DMD-2229,DMD-2230,DMD-2231
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    #DMD-2229- EXPLORE - SEARCH - Search return Result (without Data)
    And user validates without data in search screen ios
    #DMD-2228- EXPLORE - SEARCH - Ability to enter text & Auto Suggestion
    And user search players or updates "<ExploreSearchText>" in ios
    Then user validates search Auto suggestions is displayed in ios
    #DMD-2229- EXPLORE - SEARCH - Search return Result (with Data)
    Then user validates search Auto suggestions is displayed in ios
    #DMD-2230- EXPLORE - SEARCH - Page filter (Based on Data in Service) [All, News, Videos, Image]
    And user enters image in search for "<ImageContent>" in page filter ios
    Then user validates search result for image in ios
    And user enters Videos in search for "<VideoContent>" in page filter ios
    Then user validates search result for Videos in ios
    And user enters News in search for "<NewsContent>" in page filter ios
    Then user validates search result for News in ios
    And user enters All in search for "<AllContent>" in page filter ios
    Then user validates search result for All in ios
    #DMD-2231- EXPLORE - SEARCH - Related Searches for successful Search result
    And user search players or updates "<ExploreSearchText>"Related Searches in ios
    And user clicks on a player in search suggestions in ios
    Then user validates the search result in ios
    And user clicks on content related to search result in ios
    Then user validates the search result of the player in ios
      | Title                             |
      | 'EVERYONE IS A PART OF THIS CLUB' |

    Examples: 
      | ExploreSearchText | ImageContent | VideoContent | NewsContent | AllContent |
      | Bruno             | image        | video        | News        | All        |

  Scenario: DMD-2195,DMD-2196,DMD-2197,DMD-2199,DMD-2200
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    #DMD-2195-  EXPLORE - FIXTURES AND TABLES - Page Filter (UNITED & ALL TEAM)
    And user clicks fixtures and table courosel in search screen in ios
    Then user validates page filters in fixtures and tables screen in ios
      | united         | All teams         |
      | UNITEDTab Item | ALL TEAMSTab Item |
    #DMD-2196-EXPLORE - FIXTURES AND TABLES - Upcoming Match Fixtures
    Then user validates the upcoming Fixtures in ios
      | Fixtures                    |
      | MATCHDAY LIVE,MATCHDAY LIVE |
    #DMD-2197      EXPLORE - FIXTURES AND TABLES - Old Match Results
    And user clicks back icon in ios
    And user clicks fixtures and table courosel in search screen in ios
    Then user validates the Old Match Results in ios
      | results      |
      | MATCH REVIEW |
    #DMD-2199-EXPLORE - FIXTURES AND TABLES - League Filter (EPL, CL, etc only for Current year)
    And user clicks Three dots icon in ios
    Then user validates the following leagues in ios
      | All                          | premier               | FA            | league            | Europe               | friendly        |
      | All 2024/25, selected, radio | Premier League, radio | FA Cup, radio | League Cup, radio | Europa League, radio | Friendly, radio |
    #DMD-2200-EXPLORE - FIXTURES AND TABLES - Data reflection based on League filter Selection
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League      |
      | All 2024/25 |
    And user clicks all radio button and validates leagues displayed in ios
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League         |
      | Premier League |
    Then user validates the filtered league in ios
      | Filter Validation                                                                     |
      | English Premier League,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League |
      | FA Cup |
    Then user validates the filtered FA league in ios
      | Filter Validation                                                             |
      | English FA Cup,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League     |
      | League Cup |
    Then user validates League cup the filtered league in ios
      | Filter Validation                                                                  |
      | English League Cup ,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League        |
      | Europa League |
    Then user validates the filtered Europe league in ios
      | Filter Validation                                                                  |
      | UEFA Europa League ,There are currently no fixtures available in this competition. |
    And user clicks Three dots icon in ios
    And user clicks the following filter in UnitedNow Calender screen in ios
      | League   |
      | Friendly |
    Then user validates the Friendly filtered league in ios
      | Filter Validation                                                        |
      | Friendly ,There are currently no fixtures available in this competition. |
    #DMD-2198- EXPLORE - FIXTURES AND TABLES - Different Teams Filter (First Team, Women, U23 and U18)
    And user click on men drop down and validates team filters in fixtures ios
      | Men                  | Women        | Under 21s        | Under 18s        | Girls        |
      | Men, selected, radio | Women, radio | Under-21s, radio | Under-18s, radio | Girls, radio |

  Scenario: DMD-2201,DMD-2202,DMD-2203,DMD-2204
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks fixtures and table courosel in search screen in ios
    #DMD-2202-EXPLORE - FIXTURES AND TABLES - CTA to Table
    And user clicks on Table CTA Fixtures and tables page in ios
    #DMD-2203- EXPLORE - FIXTURES AND TABLES - Table Page filter (Based on Data in Service)
    Then user validates the Men match schedule in ios
      | League1                | League2               |
      | PREMIER LEAGUETab Item | EUROPA LEAGUETab Item |
    And user clicks on men tab in ios
    And user clicks on women tab and validates the Women match schedule in ios
      | League1                      | League2                        |
      | WOMEN'S SUPER LEAGUETab Item | CONTINENTAL LEAGUE CUPTab Item |
    And user clicks on women tab in ios
    And user clicks on under tweenty oneS and validates the under twenty one match schedule in ios
      | League1                  | League2            |
      | PREMIER LEAGUE 2Tab Item | EFL TROPHYTab Item |
    And user clicks on under tweenty oneS tab in ios
    And user clicks on under eighteenS validates the under eighteen match schedule in ios
      | League1                    | League2                   |
      | U18 PREMIER LEAGUETab Item | UEFA YOUTH LEAGUETab Item |
    And user clicks on EighteenS tab in ios
    Then user clicks on Girls team and validates the under girls match schedule in ios
      | League1                            | League2                               | League3                             |
      | ENGLISH PGA U16 WOMENS CUPTab Item | ENGLISH PGA U21 WOMENS LEAGUETab Item | ENGLISH WOMENS SUPER LEAGUETab Item |
    #DMD-2201-EXPLORE - FIXTURES AND TABLES - Buy Ticket/Hospitality/Tickey Info  for Home Match & CTA
    And user clicks back icon in ios
    And user clicks on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page in ios
    Then user verify the ticket screen in ios
      | Ticket title |
      | TICKETS      |
    And user clicks on cross icon in tickets page ios
    #DMD-2204-EXPLORE - FIXTURES AND TABLES - CTA [To Match Centre only for Result or 3 hour prior Match Live]
    And user clicks back icon in ios
    And user clicks fixtures and table courosel in search screen in ios
    And user clicks on match result in fixtures screen ios
    And user clicks on post match analysis in united screen ios
    Then user validates match center in ios
      | matchcenter  |
      | MATCH CENTRE |

  Scenario: DMD-2207,DMD-2208,DMD-2210
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks players courosel in search screen in ios
    #DMD-2207-EXPLORE - PLAYERS - Page filter (Based on Data in Service) [First Team, Reserve & etc.]
    Then user validates the following filter in the players screen in ios
      | Filter1     | Filter2       | Filter3           | Filter4           | Filter5         |
      | MENTab Item | WOMENTab Item | UNDER-21STab Item | UNDER-18STab Item | LEGENDSTab Item |
    #DMD-2208-EXPLORE - PLAYERS - Player Detailed Page [First Team, Reserve, Academy, Manager & Staff, Legends]
    #DMD-2210-EXPLORE - PLAYERS - Stats and Profile Tab for Players (If Applicable)
    And user clicks women tab in ios
    And user clicks player from "men" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "women" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "under21" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "under18" tab in ios
    Then verify profile and stats tab are displayed in ios
    And navigates to the joined section in ios
    And user clicks back icon in ios
    And user clicks player from "legends" tab in ios
    Then verify profile and stats tab are displayed in ios

  Scenario: DMD-2209,DMD-2211,DMD-2212,DMD-2213
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks players courosel in search screen in ios
    #DMD-2211-EXPLORE - PLAYERS - Match Live Stats and Season Stats for Players (If Applicable)
    And user clicks player from "men" tab in ios
    And user clicks on stats tab in players screen ios
    Then user validates match live stats and season stats for players in ios
      | Match Live | Season stats |
      | LAST MATCH | SEASON STATS |
    #DMD-2209-EXPLORE - PLAYERS - Latest section on player profile detail page
    And user clicks on profile stats in players screen ios
    And navigate to the latest section for the player in ios
    And verify clicking on video or article navigates to the respective page in ios
    #DMD-2212-EXPLORE - PLAYERS - Tapping View More takes user to Search
    And user clicks player from "men" tab in ios
    And user clicks on view more btn in palyers screen ios
    Then user validates the search page in ios
    #DMD-2213-EXPLORE - PLAYERS - Share the player
    Then user validates the share icon in players screen in ios
    And user clicks on share icon in players screen ios
    And user clicks on message icon in share screen

  
  Scenario: DMD-2205
    And user initiates the Ios Tablet Session
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks fixtures and table courosel in search screen in ios
    #DMD-2205-EXPLORE - FIXTURES AND TABLES - Crest Image for Teams (TABLET Only)
    Then user validates the crest image in fixtures screen
