@Regression_Android @Reg_UnitedNowUpsell_Android
Feature: United Now Upsell
@DMD-2284_Android
  Scenario: DMD-2284	Upsell - Dynamic Upsell - Upsell with External Link
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user checks for upsell in united now page
