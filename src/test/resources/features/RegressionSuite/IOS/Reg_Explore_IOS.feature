@Regression_IOS @Reg_Explore_IOS
Feature: Explore IOS Regression features

  Scenario Outline: [EXPLORE]TC001- DMD-2187_ATEST - Hero card,DMD-2188_LATEST - Page Filters,DMD-2189_LATEST - CTA[Opening in Destination or Modal],DMD-2190_LATEST - Listing Page with latest Item,DMD-2191_LATEST - Share the   cards
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

  Scenario Outline: [EXPLORE]TC002- DMD-2193_LATEST - CTA[Video PlayingÂ  inÂ  Video Modal],DMD-2194_LATEST - Listing Page with latest Video
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
    And user selects a latest video in latest listing page in ios
    Then user validates the video playing in video destination page in ios

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |

  Scenario: [EXPLORE]TC003- DMD-2215_HELP - Contact Us &CTA (Hybrid Page),DMD-2216_HELP - FAQs &CTA (Hybrid Page),DMD-2217_HELP - Accessibility &CTA (Hybrid Page),DMD-2218_HELP - Term Of Use &CTA (Hybrid Page),DMD-2219_HELP - Privacy Policy &CTA (Hybrid Page),DMD-2220_HELP - Send App Feedback &CTA (Native Screen)
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks help carousel in search screen in ios
    And user click on contact us link help screen in ios
    Then I verify the contactUs text in contact us screen in ios
      | contactUs  |
      | CONTACT US |
    And user clicks on Back icon
    And user clicks help carousel in search screen in ios
    And user click on faqs link help screen in ios
    Then I verify the faqs text in faqs screen in ios
      | faqs |
      | FAQS |
    And user clicks on Back icon
    And user click on accessibility link help screen in ios
    Then I verify the accessibility text in accessibility screen in ios
      | accessibility |
      | ACCESSIBILITY |
    And user clicks on Back icon
    And user click on Terms of Use link in help screen in ios
    Then I verify the Terms of Use text in Terms of Use screen in ios
      | Terms of Use |
      | TERMS OF USE |
    And user clicks on Back icon
    And user click on privacy policy link in help screen in ios
    Then I verify the privacy policy text in privacy policy  screen in ios
      | privacy policy |
      | PRIVACY POLICY |
    And user clicks on Back icon
    And user click on feedback link in help screen in ios
    Then I verify the feedback text in feedback screen in ios
      | feedback |
      | FEEDBACK |
    And user enters below details in the feedback screen in ios
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  Scenario: [EXPLORE]TC004- DMD-2221_HISTORY - CTA (Hybrid Page),DMD-2222_HISTORY - Items in Page CTA
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks history courosel in search screen in ios
    Then user verify the story in history screen in ios
      | story                                             |
      | MANCHESTER UNITED'S STORY: THE GREATEST EVER TOLD |
    Then user validates the items in history page ios
    And user clicks on any one of the history item in ios
    Then user validates the CTA history item in ios

  Scenario: [EXPLORE]TC005- DMD-2223_Other External Tiles - Tickets,DMD-2224_Other External Tiles - Shop,DMD-2225_Other External Tiles - MUTV,DMD-2226_Other External Tiles - Predictions,DMD-2227_Other External Tiles - MY UNITED
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks shop courosel in search screen in ios
    Then user validates all the tabs names in shop screen in ios
      | merch | membership | tickets | shoptab |
      | MERCH | MEMBERSHIP | TICKETS | SHOPTAB |
    And user clicks on united now in bottom tab in ios
    And user clicks mutv courosel in search screen in ios
    Then user verify the mutv screen in ios
      | welcome to mutv | Description of mutv                                                                                                                                      | explore |
      | WELCOME TO MUTV | Welcome to the all-new MUTV, now available in the Manchester United App! Access MUTV 24/7, including your favourite shows & boxsets, live and on-demand. | EXPLORE |
    And user clicks on united now in bottom tab in ios
    And user clicks predictions courosel in search screen in ios
    And user clicks on united now in bottom tab in ios
    And user clicks my united courosel in search screen in ios
    Then user verify the title in ios
      | my united |
      | MY UNITED |
    And user clicks on united now in bottom tab in ios
    And user clicks buy tickets courosel in search screen in ios
    Then user verify the ticket screen in ios
      | Ticket title |
      | TICKETS      |

  Scenario Outline: [EXPLORE]TC006- DMD-2228_SEARCH - Ability to enter text & Auto Suggestion,DMD-2229_SEARCH - Search return Result (with Data),DMD-2230_SEARCH - Page filter (Based on Data in Service) [All, News, Videos, Image],DMD-2231_SEARCH - Related Searches for successful Search result
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user validates without data in search screen ios
    And user search players or updates "<ExploreSearchText>" in ios
    Then user validates search Auto suggestions is displayed in ios
    Then user validates search Auto suggestions is displayed in ios
    And user enters image in search for "<ImageContent>" in page filter ios
    Then user validates search result for image in ios
    And user enters Videos in search for "<VideoContent>" in page filter ios
    Then user validates search result for Videos in ios
    And user enters News in search for "<NewsContent>" in page filter ios
    Then user validates search result for News in ios
    And user enters All in search for "<AllContent>" in page filter ios
    Then user validates search result for All in ios
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

  Scenario: [EXPLORE]TC007- DMD-2195_FIXTURES AND TABLES - Page Filter (UNITED & ALL TEAM),DMD-2196_FIXTURES AND TABLES - Upcoming Match Fixtures,DMD-2197_FIXTURES AND TABLES - Old Match Results,DMD-2199_League Filter (EPL, CL, etc only for Current year),DMD-2200_FIXTURES AND TABLES - Data reflection based on League filter Selection
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
    Then user validates page filters in fixtures and tables screen in ios
      | united         | All teams         |
      | UNITEDTab Item | ALL TEAMSTab Item |
    Then user validates the upcoming Fixtures in ios
      | Fixtures                    |
      | MATCHDAY LIVE,MATCHDAY LIVE |
    And user clicks back icon in ios
    And user clicks fixtures and table courosel in search screen in ios
    Then user validates the Old Match Results in ios
      | results      |
      | MATCH REVIEW |
    And user clicks Three dots icon in ios
    Then user validates the following leagues in ios
      | All                          | premier               | FA            | league            | Europe               | friendly        |
      | All 2024/25, selected, radio | Premier League, radio | FA Cup, radio | League Cup, radio | Europa League, radio | Friendly, radio |
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
    And user click on men drop down and validates team filters in fixtures ios
      | Men                  | Women        | Under 21s        | Under 18s        | Girls        |
      | Men, selected, radio | Women, radio | Under-21s, radio | Under-18s, radio | Girls, radio |

  Scenario: [EXPLORE]TC008- DMD-2201_FIXTURES AND TABLES - Buy Ticket/Hospitality/Tickey Info  for Home Match & CTA,DMD-2202_FIXTURES AND TABLES - CTA to Table,DMD-2203_Table Page filter (Based on Data in Service),DMD-2204_CTA [To Match Centre only for Result or 3 hour prior Match Live]
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
    And user clicks on Table CTA Fixtures and tables page in ios
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
    And user clicks back icon in ios
    And user clicks on Buy Ticket/Hospitality/Tickey Info CTA in fixtures page in ios
    Then user verify the ticket screen in ios
      | Ticket title |
      | TICKETS      |
    And user clicks on cross icon in tickets page ios
    And user clicks back icon in ios
    And user clicks fixtures and table courosel in search screen in ios
    And user clicks on match result in fixtures screen ios
    And user clicks on post match analysis in united screen ios
    Then user validates match center in ios
      | matchcenter  |
      | MATCH CENTRE |

  Scenario: [EXPLORE]TC009- DMD-2207_PLAYERS - Page filter (Based on Data in Service) [First Team, Reserve & etc.],DMD-2208_Player Detailed Page [First Team, Reserve, Academy, Manager & Staff, Legends],DMD-2210_Stats and Profile Tab for Players (If Applicable)
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
    Then user validates the following filter in the players screen in ios
      | Filter1     | Filter2       | Filter3           | Filter4           | Filter5         |
      | MENTab Item | WOMENTab Item | UNDER-21STab Item | UNDER-18STab Item | LEGENDSTab Item |
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

  Scenario: [EXPLORE]TC010- DMD-2209_PLAYERS - Match Live Stats and Season Stats for Players (If Applicable),DMD-2211_Latest section on player profile detail page,DMD-2212_Tapping View More takes user to Search,DMD-2213_PLAYERS - Share the player
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
    And user clicks player from "men" tab in ios
    And user clicks on stats tab in players screen ios
    Then user validates match live stats and season stats for players in ios
      | Match Live | Season stats |
      | LAST MATCH | SEASON STATS |
    And user clicks on profile stats in players screen ios
    And navigate to the latest section for the player in ios
    And verify clicking on video or article navigates to the respective page in ios
    And user clicks player from "men" tab in ios
    And user clicks on view more btn in palyers screen ios
    Then user validates the search page in ios
    Then user validates the share icon in players screen in ios
    And user clicks on share icon in players screen ios
    And user clicks on message icon in share screen

  
  Scenario: [EXPLORE]TC011- DMD-2205_FIXTURES AND TABLES - Crest Image for Teams (TABLET Only)
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
    Then user validates the crest image in fixtures screen
