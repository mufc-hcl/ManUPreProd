@Sanity_IOS @Shop_WebView_IOS
Feature: Shop-Web View features

  @TC001_ios_Shopwebview
  Scenario: [Shop-Web View]TC001 Validate the shop page when we have the web view enabled, Validate the hamburger feature in the shop web view, user should be able to open and close the same without any issues and Validate user is able to access the Menu items available under the Hamburger page
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on shop tab in bottom tab in ios
    And user clicks on ok in the cookies screen in ios
    Then user validates the shop page when we have the web view enabled using API
    And user validates the Menu items available under the Hamburger page using API

  @TC002_ios_Shopwebview
  Scenario: [Shop-Web View]TC002 Validate the wishlist , cart and checkout functionality should work correctly
    #selected first product with size, added to bag and then clicked on bag and validated bag/basket for Sign in to checkout
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on shop tab in bottom tab in ios
    And user clicks on ok in the cookies screen in ios
    And user adds the first product and select size as "L"
    And user clicks on Add to bag button
    Then user validates Added to Bag page
    And user clicks on Bag button
    Then user validates Your Bag page with product
    #clicked on wishlist and  selected first product to add in wishlist and validated wishlist product
    Given user clicks on wishlist button
    And user adds the first product in the wishlist
    Given user clicks on wishlist button
    Then user validates product in wishlist page
