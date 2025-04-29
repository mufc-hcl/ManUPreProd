@Regression_IOS @Reg_UnitedNowUpsell_IOS
Feature: United Now Upsell
@DMD-2284_IOS
  Scenario: DMD-2284	Upsell - Dynamic Upsell - Upsell with External Link
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    Then user checks for upsell in united now page in ios
