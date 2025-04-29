@Regression_Android @Reg_FourNavigation_Android
Feature: FourNavigation Android Regression features
  
  Scenario Outline: DMD-2098- Four Navigation item - Four Navigation item
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    Then user validates Four Navigation items
      | navigation1 | navigation2 | navigation3 | navigation4 |
      | United Now  | MUTV        | Shop        | My United   |
    And user clicks on Mutv tab
     And user clicks on explore icon
    And user clicks on shop tab
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks continue in MUApp popup
   Then user validates Four Navigation items after login
      | navigation1 | navigation2 | navigation3 | navigation4 |
      | United Now  | MUTV        | Shop        | My United   |
    And user clicks on united now in bottom tab
    And user clicks on Mutv tab
       #And user clicks on explore icon
    And user clicks on shop tab
    
    Examples: 
      | username             | password |
      | Manutest@yopmail.com | Manu@123 |
    
    
    
    
    