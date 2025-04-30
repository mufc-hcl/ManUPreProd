@Sanity_Android @Shop_WebView_Android
Feature: Shop-Web View features

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
