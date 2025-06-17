@Sanity_IOS @Shop_IOS
Feature: Shop features

  @Shop_Test
  Scenario: [SHOP - NATIVE]TC001 Click on the shop tab and navigate to the shop screen with all the shop filters if enabled from CMS,Validate the shop screen when there are only small card carousels enabled from CMS-Stickers - Colletable,
    Validate the shop screen only when hero carousel is enabled from CMS-Merch - Membership,Validate the shop screen when both hero and small card carousels are enabled from CMS-Tickets - Store

    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on shop tab in bottom tab in ios
    Then user validates all the tabs names in shop screen using API in ios
    And user validates shop tabs and content in it using API in ios

  Scenario: [SHOP - NATIVE]TC002 Click on the shop tab and navigate to the shop screen with all the shop filters if disabled from CMS
    #prerequisite - Inform QA team to disable shop filters from CMS
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on shop tab in bottom tab in ios
    Then user validates all the tabs in shop screen not displayed when disabled from CMS

  #Scenario: [Shop]TC003 Validate the shop tab hero carousels and small card carousels if enabled from CMS-Membership
  #Given user navigates to manu ios application
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on ask me later in screen two in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user clicks on not now button in match appearance alert screen in ios
  #And user click on shop tab in bottom tab in ios
  #And user clicks on Membership tab in shop screen in ios
  #And user validates hero carousels is displayed in membership screen in ios
  #Then user validates small card carousels in ios in membership tab using Api
  #| kitstext | trending | players | training text | tickets and hospitality | united essentials | collections text                  |
  #| KITS     | TRENDING | PLAYERS | TRAINING      | TICKETS & HOSPITALITY ! | UNITED ESSENTIALS | COLLECTIONS CAROUSEL WITH ALL ... |
  #Then user validates hero carousels and small card carousels in ios
  #| training | tickets                 |
  #| TRAINING | TICKETS & HOSPITALITY ! |
  #
  #
  #Scenario: [Shop]TC004 Validate the shop screen when there are only small card carousels enabled from CMS-Collectibles
  #Given user navigates to manu ios application
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on ask me later in screen two in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user clicks on not now button in match appearance alert screen in ios
  #And user click on shop tab in bottom tab in ios
  #And user clicks on Stickers tab in shop screen in ios
  #And user clicks on Tickets tab in shop screen in ios
  #Then user validates small card carousels in ios in Tickets tab using Api
  #| training | united essentials |
  #| TRAINING | UNITED ESSENTIALS |
  #
  #Then user validates small card carousels in ios
  #| hero card | kitstext | training text | tickets and hospitality | united essentials | collections text                  | category text |
  #| HERO CARD | KITS     | TRAINING      | TICKETS & HOSPITALITY ! | UNITED ESSENTIALS | COLLECTIONS CAROUSEL WITH ALL ... | CATEGORY2     |
  #
  #
  #Scenario: [Shop]TC005 Validate the shop screen when both hero and small card carousels are enabled from CMS-ShopTab
  #Given user navigates to manu ios application
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on ask me later in screen two in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user clicks on not now button in match appearance alert screen in ios
  #And user click on shop tab in bottom tab in ios
  #And user clicks on Shop tab in shop screen in ios
  #Then user validates small card carousels in Shop tab in ios using Api
  #And user clicks on Tickets tab in shop screen in ios
  #
  #
  #Scenario: [Shop]TC006 Validate the shop screen only when hero carousel is enabled from CMS-Merch
  #Given user navigates to manu ios application
  #And user clicks on cancel button in apple id screen
  #And user clicks lets go button in screen one in ios
  #And user clicks on ask me later in screen two in ios
  #And user clicks skip button in screen three in ios
  #And user click on skip button in screen four in ios
  #And user clicks on ok in the cookies screen in ios
  #And user clicks on not now button in match appearance alert screen in ios
  #And user click on shop tab in bottom tab in ios
  #And user clicks on Merch tab in shop screen in ios
  #Then user validates small card carousels in Merch tab in ios
  #And user clicks on the hero card dots in merch screen in ios
  Scenario: [SHOP - NATIVE] TC003 Validate the shop tab hero carousels
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on shop tab in bottom tab in ios
    Then user validates hero card in shop screen in ios
