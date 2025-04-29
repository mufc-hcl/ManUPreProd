@Regression_Android @Reg_UnitedNow_Android
Feature: Regression -United Now Test Cases

  #  Same locator for stories carousel cards and article card
  #  -com.mu.muclubapp.staging_mu_dxc:id/gradient_view(id) in android
  #  Scenario: DMD-2099-UNITED NOW - HOME PAGE - Article Card and Destination Page
  #    Given user navigates to manu android application
  #    And user navigates to screen two
  #    And user navigates to screen three
  #    And user navigates to screen four
  #    And user click on skip button in screen four
  #    And user clicks on ok button in cookies screen
  #    And user clicks continue in MUApp popup
  #    And user clicks on not now button in match appearance alert screen
  #    And user clicks on braze in app msg
  #    Then user checks for article card in united now page
  Scenario: DMD-2100-UNITED NOW - HOME PAGE - Image Card and Modal
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for image card in united now page

  Scenario: DMD-2102-UNITED NOW - HOME PAGE - Image Gallery Card and Modal
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for image gallery card in united now page

  Scenario: DMD-2102-UNITED NOW - HOME PAGE - Video Card and Modal
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for video card in united now page

  Scenario: DMD-2102-UNITED NOW - HOME PAGE - Quiz Card and Modal
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for quiz card in united now page

  Scenario: DMD-2106-UNITED NOW - HOME PAGE - Stats cards & destination
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for stats card in united now page

  Scenario: DMD-2107-UNITED NOW - HOME PAGE - Collection Card and Modal.
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for collections card in united now page

  Scenario: DMD-2108	UNITED NOW - HOME PAGE - Poll Card
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user checks on Poll Card in united now page

  #Scenario: DMD-2109	UNITED NOW - HOME PAGE - Social Card - Out of scope
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #Then user checks for Social Card in united now page
  Scenario: DMD-2101 UNITED NOW - HOME PAGE - Quote Card and Modal
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for Quote Card and Modal in united now page

  Scenario: DMD-2113	UNITED NOW - HOME PAGE - Table Card
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user checks on view full table in united now page

  Scenario: DMD-2114 UNITED NOW - HOME PAGE - Player Profile Card
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for Player Profile Card in united now page

  Scenario: DMD-2116	UNITED NOW - HOME PAGE - DFP Add card as expected & CTA
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for Add card in united now page

  Scenario: DMD-2117	UNITED NOW - ALTERNATE FIXTURES AND TABLES - Page Filter (UNITED & ALL TEAM)
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    Then user navigates to fixtures screen and validate below three values
      | united | All Teams |
      | UNITED | ALL TEAMS |

  Scenario: DMD-2118	UNITED NOW - ALTERNATE FIXTURES AND TABLES - Upcoming Match Fixtures
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    Then user checks for Upcoming Match Fixtures in united now page

  Scenario: DMD-2119	UNITED NOW - ALTERNATE FIXTURES AND TABLES - Old Match Results
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    Then user checks for Upcoming Match Fixtures in united now page
    And user checks for Old Match Results in united now page

  Scenario: DMD-2120	UNITED NOW - ALTERNATE FIXTURES AND TABLES - Different Teams Filter (First Team, Women, U23 and U18)
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    Then user navigates to fixtures screen and validate below three values
      | united | All Teams |
      | UNITED | ALL TEAMS |
    And user click on men drop down and validates the dropdown values
      | Men | Women | Under 21s | Under 18s | Girls |
      | Men | Women | Under-21s | Under-18s | Girls |
      
      Scenario: DMD-2121,DMD-2122
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    And user clicks Three dots icon
    Then user validates the following leagues
      | All         | premier        | FA     | FA Community Shield | league     | Europe        | friendly |
      | All 2024/25 | Premier League | FA Cup | FA Community Shield | League Cup | Europa League | Friendly |
    # DMD-2122 UNITED NOW - ALTERNATE FIXTURES AND TABLES - Data reflection based on League filter Selection
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
      | League              |
      | FA Community Shield |
    Then user validates the filtered league
      | Filter Validation                                                                  |
      | FA Community Shield,There are currently no fixtures available in this competition. |
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
  
  Scenario: DMD-2123  UNITED NOW - ALTERNATE FIXTURES AND TABLES - Buy Ticket/Hospitality/Tickey Info  for Home Match & CTA
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    And user clicks on ticket info CTA in fixtures page
    Then user verify the ticket screen
      | Ticket title |
      | Tickets      |
 
  Scenario: DMD-2124 UNITED NOW - ALTERNATE FIXTURES AND TABLES - CTA to Table
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on calender icon
    And user clicks on table button on CTA in fixtures page
    Then user validates page filters in men tab.
      | Premier League | Europa League |
      | PREMIER LEAGUE | EUROPA LEAGUE |
    #DMD-2125 UNITED NOW - ALTERNATE FIXTURES AND TABLES - Table Page filter (Based on Data in Service)
    And user clicks on "women" tab in table CTA page
    Then user validates page filters in womens tab.
      | Womens Super League  | Continental League cup |
      | WOMEN'S SUPER LEAGUE | CONTINENTAL LEAGUE CUP |
    And user clicks on "under21" tab in table CTA page
    Then user validates page filters in under twenty ones tab.
      | Premier League 2 | Efl Trophy |
      | PREMIER LEAGUE 2 | EFL TROPHY |
    And user clicks on "under18" tab in table CTA page
    Then user validates page filters in under eighteen s tab.
      | U18 Premier League | Uefa Youth League |
      | U18 PREMIER LEAGUE | UEFA YOUTH LEAGUE |
    And user clicks on "girls" tab in table CTA page
    Then user validates page filters in girls tab.
      | Premier League | Champions League |
      | PREMIER LEAGUE | CHAMPIONS LEAGUE |
 
  Scenario: DMD-2127 UNITED NOW - ALTERNATE FIXTURES AND TABLES - Crest Image for Teams (TABLET Only)
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
    And user click on calender icon
    Then user validates the crest image in fixtures screen
 
 
  Scenario: DMD-2128,DMD-2129,DMD-2130,DMD-2131
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
    #DMD-2128-UNITED NOW - ALTERNATE TEAM GRID - Page filter (Based on Data in Service) [First Team -men, Reserve-Under21age & etc.]
    Then user validates the following filter in the players screen
      | Filter1 | Filter2 | Filter3   | Filter4   | Filter5 |
      | MEN     | WOMEN   | UNDER-21S | UNDER-18S | LEGENDS |
    #DMD-2129-UNITED NOW - ALTERNATE TEAM GRID - Player Detailed Page [First Team, Reserve, Academy, Manager & Staff, Legends]
    #DMD-2131-UNITED NOW - ALTERNATE TEAM GRID - Stats and Profile Tab for Players (If Applicable)
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
    #DMD-2130-UNITED NOW - ALTERNATE TEAM GRID - Latest section on player profile detail page
    And navigate to the latest section for the player
    And verify clicking on video or article navigates to the respective page
 
 
  Scenario: DMD-2132-UNITED NOW - ALTERNATE TEAM GRID - Match Live Stats and Season Stats for Players (If Applicable)
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
    And user clicks player from "men" tab
    And user clicks on stats tab in players screen
    Then user validates match live stats and season stats for players
      | Match Live | Season stats |
      | LAST MATCH | SEASON STATS |
