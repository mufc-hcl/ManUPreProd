@Sanity_Android @Shop_WebView_Android
Feature: Shop-Web View features

  @TC001_android_Shopwebview
  Scenario: [Shop-Web View]TC001 Validate the shop page when we have the web view enabled, Validate the hamburger feature in the shop web view, user should be able to open and close the same without any issues and Validate user is able to access the Menu items available under the Hamburger page
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
    And user clicks on ok button in cookies screen
    Then user validates the shop page when we have the web view enabled using API
    And user validates the Menu items available under the Hamburger page using API

  @TC002_android_Shopwebview
  Scenario: [Shop-Web View]TC002 Validate the wishlist , cart and checkout functionality should work correctly
    #selected first product with size, added to bag and then clicked on bag and validated bag/basket for Sign in to checkout
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
    And user clicks on ok button in cookies screen
    #And user clicks on ok button in cookies screen in Store
    And user adds the first product and select size as "M"
    And user clicks on Add to bag button
    Then user validates Added to Bag page
    And user clicks on Bag button
    Then user validates Your Bag page with product
    #clicked on wishlist and  selected first product to add in wishlist and validated wishlist product
    Given user clicks on wishlist button
    And user adds the first product in the wishlist
    Then user validates product in wishlist page
