@Sanity_Android @Shop_Android
Feature: Shop features

  Scenario: [SHOP - NATIVE]TC001 Click on the shop tab and navigate to the shop screen with all the shop filters if enabled from CMS,Validate the shop screen when there are only small card carousels enabled from CMS-Stickers - Colletable,
    Validate the shop screen only when hero carousel is enabled from CMS-Merch - Membership,Validate the shop screen when both hero and small card carousels are enabled from CMS-Tickets - Store

    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks on shop tab
    Then user validates all the tabs names in shop screen using API
    And user validates shop tabs and content in it using API

  Scenario: [SHOP - NATIVE]TC002 Click on the shop tab and navigate to the shop screen with all the shop filters if disabled from CMS
    #prerequisite - Inform QA team to disable shop filters from CMS
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks on shop tab
    Then user validates all the tabs in shop screen not displayed when disabled from CMS

  #Scenario: [Shop]TC003 Validate the shop tab hero carousels and small card carousels if enabled from CMS-Membership
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #And user clicks on shop tab
  #And user clicks on Membership tab in shop screen using Api
  #Then user validates small card carousels in Membership tab using Api
  #| training | tickets                 |
  #| TRAINING | TICKETS & HOSPITALITY ! |
  #
  #
  #Scenario: [Shop]TC004 Validate the shop screen when there are only small card carousels enabled from CMS-Ticket
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #And user clicks on shop tab
  #And user clicks on Stickers tab in shop screen
  #And user clicks on Tickets tab in shop screen
  #Then user validates small card carousels in Tickets tab using Api
  #      | kitstext | training text | united essentials | tickets text            | collections text                | category text |
  #      | KITS     | TRAINING      | UNITED ESSENTIALS | TICKETS & HOSPITALITY ! | COLLECTIONS CAROUSEL WITH ALL … | CATEGORY2     |
  #
  #
  #
  #Scenario: [Shop]TC005 Validate the shop screen when both hero and small card carousels are enabled from CMS-Store
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #And user clicks on shop tab
  #And user clicks on Shop tab in shop screen
  #Then user validates small card carousels in store tab using Api
  #And user clicks on Tickets tab in shop screen
  #    Then user validates tickets screen in shop page
  #      | error message              | retry |
  #      | Oops! something went wrong | RETRY |
  #
  #
  #Scenario: [Shop]TC006 Validate the shop screen only when hero carousel is enabled from CMS-Merch
  #Given user navigates to manu android application
  #And user navigates to screen two
  #And user navigates to screen three
  #And user navigates to screen four
  #And user click on skip button in screen four
  #And user clicks on ok button in cookies screen
  #And user clicks continue in MUApp popup
  #And user clicks on not now button in match appearance alert screen
  #And user clicks on braze in app msg
  #And user clicks on shop tab
  #And user clicks on Merch tab in shop screen
  #Then user validates small card carousels in Merch tab
  #And user clicks on the hero card dots in merch screen
  Scenario: [SHOP - NATIVE]TC003 Validate the shop tab hero carousels
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user clicks on shop tab
    Then user validates hero card in shop screen
    #And user clicks on Merch tab in shop screen
    #Then user validates hero card is displayed in shop screen in merch tab 
    #And user clicks on Membership tab in shop screen
    #Then user validates hero card is displayed in shop screen in membership tab using Api
    #And user clicks on Shop tab in shop screen
    #Then user validates hero card is displayed in shop screen in Shop tab using Api
   #And user clicks on Tickets tab in shop screen
    #Then user validates hero card is displayed in shop screen in Ticket using Api
