@Regression_IOS @Reg_FourNavigation_IOS
Feature: FourNavigation IOS Regression features

  Scenario Outline: [Four Navigation item] DMD-2098- TC001_Four Navigation item
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user validates Four Navigation items
      | navigation1 | navigation2 | navigation3 | navigation4                       |
      | United Now  | MUTV        | Shop        | My United, you are not logged in. |
    Then user validates the "United now" is selected
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    Then user validates the "MUTV" is selected
    And user click on shop tab in bottom tab in ios
    Then user validates the "Shop" is selected
    And user click on My United in bottom tab in ios
    Then user validates the "My United" is selected
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    Then user validates the "My United" is selected
    Then user validates Four Navigation items after login
      | navigation1 | navigation2 | navigation3 | navigation4                       |
      | United Now  | MUTV        | Shop        | My United, you are not logged in. |
    And user clicks on united now in bottom tab in ios
    Then user validates the "United now" is selected
    And user clicks on Mutv tab in ios
    Then user validates the "MUTV" is selected
    And user click on shop tab in bottom tab in ios
    Then user validates the "Shop" is selected

    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
