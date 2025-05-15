@CMS_disable_Android
Feature: Validate functionality when disabled from CMS

	@CMS_disable_Android_TC001_MUTV
   Scenario: [MUTV]TC001 Validate the MUTV hero carousel when disabled from CMS
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    #    And user clicks on the notification at bottom of screen
    And user clicks on Mutv tab
    And user clicks on explore icon
    And user validates the MUTV hero carousel is not displayed when disabled from CMS
