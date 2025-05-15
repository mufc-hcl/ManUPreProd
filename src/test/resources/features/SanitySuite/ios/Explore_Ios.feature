@Sanity_IOS @Explore_IOS
Feature: Explore

  Scenario: [Explore]TC001 to TC006 Help --> Contact Us &CTA (Settings Page)
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user click on setting icon on top righhand side in ios
    And user click on GENERAL link in setting screen in ios
    And user click on HELP link in general screen in ios
    And user click on contact us link help screen in ios
    Then I verify the contactUs text in contact us screen in ios
      | contactUs  |
      | CONTACT US |
    And user clicks on Back icon
    #[Explore]TC002 Help --> FAQs &CTA (Settings Page)
    #And user click on HELP link in general screen in ios
    And user click on faqs link help screen in ios
    Then I verify the faqs text in faqs screen in ios
      | faqs |
      | FAQS |
    And user clicks on Back icon
    #[Explore]TC003 Help --> Accessibility &CTA (Settings Page)
    #And user click on HELP link in general screen in ios
    And user click on accessibility link help screen in ios
    Then I verify the accessibility text in accessibility screen in ios
      | accessibility |
      | ACCESSIBILITY |
    And user clicks on Back icon
    #[Explore]TC004 Help --> Term Of Use &CTA (Settings Page)
    #And user click on HELP link in general screen in ios
    And user click on Terms of Use link in help screen in ios
    Then I verify the Terms of Use text in Terms of Use screen in ios
      | Terms of Use |
      | TERMS OF USE |
    And user clicks on Back icon
    #[Explore]TC005 Help --> Privacy Policy &CTA (Settings Page)
    #And user click on HELP link in general screen in ios
    And user click on privacy policy link in help screen in ios
    Then I verify the privacy policy text in privacy policy  screen in ios
      | privacy policy |
      | PRIVACY POLICY |
    And user clicks on Back icon
    #[Explore]TC006 Help --> Send App Feedback &CTA (Native Screen)
    #And user click on HELP link in general screen in ios
    And user click on feedback link in help screen in ios
    Then I verify the feedback text in feedback screen in ios
      | feedback |
      | FEEDBACK |
    And user enters below details in the feedback screen in ios
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  Scenario: [Explore]TC007 to TC012 Help --> Contact Us &CTA (Hybrid Page)
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
    #[Explore]TC008 Help --> FAQs &CTA (Hybrid Page)
    And user clicks help carousel in search screen in ios
    And user click on faqs link help screen in ios
    Then I verify the faqs text in faqs screen in ios
      | faqs |
      | FAQS |
    And user clicks on Back icon
    #[Explore]TC009 Help --> Accessibility &CTA (Hybrid Page)
    And user clicks help carousel in search screen in ios
    And user click on accessibility link help screen in ios
    Then I verify the accessibility text in accessibility screen in ios
      | accessibility |
      | ACCESSIBILITY |
    And user clicks on Back icon
    #[Explore]TC010 Help --> Term Of Use &CTA (Hybrid Page)
    And user clicks help carousel in search screen in ios
    And user click on Terms of Use link in help screen in ios
    Then I verify the Terms of Use text in Terms of Use screen in ios
      | Terms of Use |
      | TERMS OF USE |
    And user clicks on Back icon
    #[Explore]TC011 Help --> Privacy Policy &CTA (Hybrid Page)
    And user clicks help carousel in search screen in ios
    And user click on privacy policy link in help screen in ios
    Then I verify the privacy policy text in privacy policy  screen in ios
      | privacy policy |
      | PRIVACY POLICY |
    And user clicks on Back icon
    #[Explore]TC012 Help --> Send App Feedback &CTA (Native Screen)
    And user clicks help carousel in search screen in ios
    And user click on feedback link in help screen in ios
    Then I verify the feedback text in feedback screen in ios
      | feedback |
      | FEEDBACK |
    And user enters below details in the feedback screen in ios
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  Scenario: [Explore]TC013 History -> should be Hybrid Page
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

  Scenario: [Explore]TC014 Mutv -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks mutv courosel in search screen in ios
    Then user verify the mutv screen in ios
      | welcome to mutv | Description of mutv                                                                                                                                      | explore |
      | WELCOME TO MUTV | Welcome to MUTV in the Manchester United App! Access MUTV 24/7, including your favourite shows & boxsets, live and on-demand. | EXPLORE |

  Scenario: [Explore]TC015 Shop -> should be Hybrid Page
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
    Then user validates all the tabs names in shop screen using API

  Scenario: [Explore]TC016 My Tickets -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks my tickets courosel in search screen in ios

  Scenario: [Explore]TC017 Membership -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks membership courosel in search screen in ios
    Then user verify the membership screen in ios
      | official member     |
      | UNITED MEMBERSHIP |

  Scenario: [Explore]TC018 My United -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks my united courosel in search screen in ios
    Then user verify the title in ios
      | my united |
      | MY UNITED |

  Scenario: [Explore]TC019 Players -> should be Hybrid Page
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

  Scenario: [Explore]TC020 Fixtures and Tables -> should be Hybrid Page
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

  Scenario: [Explore]TC021 Buy Tickets -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks buy tickets courosel in search screen in ios
    Then user verify the ticket screen in ios
      | Ticket title |
      | TICKETS      |

  Scenario: [Explore]TC022 Fans -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks fans courosel in search screen in ios
    Then user verify the fans screen in ios
      | Fans page Content                |
      | "FOOTBALL IS NOTHING WITHOUT FANS" |

  Scenario: [Explore]TC023 Predictions -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks predictions courosel in search screen in ios

  Scenario: [Explore]TC024 Latest -> should be Hybrid Page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user clicks latest courosel in search screen in ios

  Scenario Outline: [Explore]TC025 Global search screen testcases
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user validates popular and categories section in the search screen in ios
    And user validates the popular content in the search screen in ios
    Then user verify all carousel is displayed using api
    #DMD-2229- EXPLORE - SEARCH - Search return Result (without Data)
    And user validates without data in search screen ios
    #DMD-2228- EXPLORE - SEARCH - Ability to enter text & Auto Suggestion
    #    And user search players or updates "<ExploreSearchText>" in ios
    Then user validates search Auto suggestions is displayed in ios

    #    #DMD-2229- EXPLORE - SEARCH - Search return Result (with Data)
    #Then user validates search Auto suggestions is displayed in ios
    #    #DMD-2230- EXPLORE - SEARCH - Page filter (Based on Data in Service) [All, News, Videos, Image]
    #    And user enters image in search for "<ImageContent>" in page filter ios
    #    Then user validates search result for image in ios
    #    And user enters Videos in search for "<VideoContent>" in page filter ios
    #    Then user validates search result for Videos in ios
    #    And user enters News in search for "<NewsContent>" in page filter ios
    #    Then user validates search result for News in ios
    #    And user enters All in search for "<AllContent>" in page filter ios
    #    Then user validates search result for All in ios
    #    #DMD-2231- EXPLORE - SEARCH - Related Searches for successful Search result
    #    And user search players or updates "<ExploreSearchText>"Related Searches in ios
    #    And user clicks on a player in search suggestions in ios
    #    Then user validates the search result in ios
    #    And user clicks on content related to search result in ios
    #    Then user validates the search result of the player in ios
    #      | Title                             |
    #      | 'EVERYONE IS A PART OF THIS CLUB' |
    Examples: 
      | ExploreSearchText | ImageContent | VideoContent | NewsContent | AllContent |
      | Bruno             | image        | video        | News        | All        |

  Scenario: [Explore]TC026 Input the text in the search box and see if the suggestions are coming less than 3 character and greater equal 3 character
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user search players or updates "la" in ios
    Then user validate no suggestion are displayed in ios
    And user enters three character in search for "mut" in page filter in ios
    Then user validate suggestion are displayed in ios

  Scenario: [Explore]TC027 Validate the search results screen UI , Data and the filter functionality
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user clicks search button in united screen in ios
    And user search all data or updates "mutv" in ios
    And user select first item from suggestion in ios
    Then user validate data in search screen in ios
    Then user verify text in search screen in ios
      | All | Mutv | News | Videos |
      | All | MUTV | News | Videos |
      
      @EXPLORE_NEW
  Scenario Outline: [Explore]TC028 Latest --> Hero card should be the first card if enabled and data should be reflected based on the page filters selected
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
    
    Examples: 
      | username             | password |
      | manupreprod@yopmail.com | Manu@123 |