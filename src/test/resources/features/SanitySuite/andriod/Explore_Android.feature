@Sanity_Android @Explore_Android
Feature: Explore

  Scenario: [Explore]TC001 to TC006 Help --> Contact Us &CTA (Settings Page)
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
    And user click on setting icon on top righhand side
    And user click on GENERAL link in setting screen
    And user click on HELP link in general screen
    And user click on contact us link help screen
    Then I verify the contactUs text in contact us screen
      | contactUs  |
      | Contact Us |
    And user clicks on Back icon
    # [Explore]TC002 Help --> FAQs &CTA (Settings Page)
    And user click on faqs link help screen
    Then I verify the faqs text in faqs screen
      | faqs |
      | Faqs |
    And user clicks on Back icon
    # [Explore]TC003 Help --> Accessibility &CTA (Settings Page)
    And user click on accessibility link help screen
    Then I verify the accessibility text in accessibility screen
      | accessibility |
      | Accessibility |
    And user clicks on Back icon
    #[Explore]TC004 Help --> Term Of Use &CTA (Settings Page)
    And user click on Terms of Use link in help screen
    Then I verify the Terms of Use text in Terms of Use screen
      | Terms of Use |
      | Terms Of Use |
    And user clicks on Back icon
    #[Explore]TC005 Help --> Privacy Policy &CTA (Settings Page)
    And user click on privacy policy link in help screen
    Then I verify the privacy policy text in privacy policy  screen
      | privacy policy |
      | Privacy Policy |
    And user clicks on Back icon
    #[Explore]TC006 Help --> Send App Feedback &CTA (Native Screen)
    And user click on feedback link in help screen
    Then I verify the feedback text in feedback screen
      | feedback |
      | Feedback |
    And user enters below details in the feedback screen
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  #    Then user validates the success message
  #      | success message             |
  #      | Feedback sent successfully. |
  
  Scenario: [Explore]TC007-TC012 Help --> Contact Us &CTA (Hybrid Page)
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
    And user clicks help courosel in search screen
    And user click on contact us link help screen
    Then I verify the contactUs text in contact us screen
      | contactUs  |
      | Contact Us |
    And user clicks on Back icon
    #[Explore]TC008 Help --> FAQs &CTA (Hybrid Page)
    And user click on faqs link help screen
    Then I verify the faqs text in faqs screen
      | faqs |
      | Faqs |
    And user clicks on Back icon
    # [Explore]TC009 Help --> Accessibility &CTA (Hybrid Page)
    And user click on accessibility link help screen
    Then I verify the accessibility text in accessibility screen
      | accessibility |
      | Accessibility |
    And user clicks on Back icon
    #[Explore]TC010 Help --> Term Of Use &CTA (Hybrid Page)
    And user click on Terms of Use link in help screen
    Then I verify the Terms of Use text in Terms of Use screen
      | Terms of Use |
      | Terms Of Use |
    And user clicks on Back icon
    # [Explore]TC011 Help --> Privacy Policy &CTA (Hybrid Page)
    And user click on privacy policy link in help screen
    Then I verify the privacy policy text in privacy policy  screen
      | privacy policy |
      | Privacy Policy |
    And user clicks on Back icon
    #[Explore]TC012 Help --> Send App Feedback &CTA (Native Screen)
    And user click on feedback link in help screen
    Then I verify the feedback text in feedback screen
      | feedback |
      | Feedback |
    And user enters below details in the feedback screen
      | email address | subject      | feedback      |
      | test@test.com | Test Subject | Test Feedback |

  #    Then user validates the success message
  #      | success message             |
  #      | Feedback sent successfully. |
  Scenario: [Explore]TC013 History -> should be Hybrid Page
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

  Scenario: [Explore]TC014 Mutv -> should be Hybrid Page
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
    And user clicks mutv courosel in search screen
    Then user verify the mutv screen
      | welcome to mutv | explore |
      | WELCOME TO MUTV | EXPLORE |

  Scenario: [Explore]TC015 Shop -> should be Hybrid Page
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
    And user clicks shop courosel in search screen
    Then user validates all the tabs names in shop screen using API

  Scenario: [Explore]TC016 My Tickets -> should be Hybrid Page
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
    And user clicks my tickets courosel in search screen

  Scenario: [Explore]TC017 Membership -> should be Hybrid Page
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
    And user clicks membership courosel in search screen
     Then user verify the membership screen
      | official member     |
      | UNITED MEMBERSHIP |
    #Then user verify the membership screen
      #| official member     | Description                                                               |
      #| OFFICIAL MEMBERSHIP | Be part of the United family. 2024/25 Official Membership is now on sale. |

  Scenario: [Explore]TC018 My United -> should be Hybrid Page
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
    And user clicks my united courosel in search screen
    Then user verify the title
      | my united |
      | MY UNITED |

  Scenario: [Explore]TC019 Players -> should be Hybrid Page
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

  Scenario: [Explore]TC020 Fixtures and Tables -> should be Hybrid Page
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

  Scenario: [Explore]TC021 Buy Tickets -> should be Hybrid Page
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
    And user clicks buy tickets courosel in search screen
     And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    Then user verify the ticket screen
      | Ticket title |
      | Tickets      |

  Scenario: [Explore]TC022 Fans -> should be Hybrid Page
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
    And user clicks fans courosel in search screen
    Then user verify the fans screen
      | Fans page Content                |
      | FOOTBALL IS NOTHING WITHOUT FANS |

  Scenario: [Explore]TC023 Predictions -> should be Hybrid Page
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
    And user clicks predictions courosel in search screen

  Scenario: [Explore]TC024 Latest -> should be Hybrid Page
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

  #  Scenario:[Explore]Verify all the carousel in search page validated against api
  #    Given user navigates to manu android application
  #    And user navigates to screen two
  #    And user navigates to screen three
  #    And user navigates to screen four
  #    And user click on skip button in screen four
  #    And user clicks on ok button in cookies screen
  #    And user clicks continue in MUApp popup
  #    And user clicks on not now button in match appearance alert screen
  #    And user clicks on braze in app msg
  #    And user clicks search button in united screen
  #    Then user verify all carousel is displayed using api
  
  Scenario Outline: [Explore]TC025 Global search screen testcases
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #Validate the Global search screen is launched without any issue by clicking on the Search Icon from United Now screen
    And user clicks search button in united screen
    And user validates popular and categories section in the search screen
    And user validates the popular content in the search screen
    Then user verify all carousel is displayed using api
    #DMD-2229- EXPLORE - SEARCH - Search return Result (without Data)
    And user validates without data in search screen
    Examples: 
      | ExploreSearchText | ImageContent | VideoContent | NewsContent | AllContent |
      | Bruno             | image        | video        | News        | All        |

  Scenario Outline: [Explore]TC026 Input the text in the search box and see if the suggestions are coming less than 3 character and greater equal 3 character
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
    And user enters less than three character in search for "la" in page filter
    Then user validate no suggestion are displayed
    And user enters three character in search for "mut" in page filter
    Then user validate suggestion are displayed
    
    
    #@AndroidTC027 - SwhichToVwebView not working evenafter implementation using SwhithcToVwebView as still it is Pointing to Native app
  #Scenario Outline: [Explore]TC027 Validate the search results screen UI , Data and the filter functionality
    #Given user navigates to manu android application
    #And user navigates to screen two
    #And user navigates to screen three
    #And user navigates to screen four
    #And user click on skip button in screen four
    #And user clicks on ok button in cookies screen
    #And user clicks continue in MUApp popup
    #And user clicks on not now button in match appearance alert screen
    #And user clicks on braze in app msg
    #And user clicks search button in united screen
    #And user enters three character in search for "mut" in page filter
    #And user select first item from suggestion
    #Then user validate data in search screen
    
     