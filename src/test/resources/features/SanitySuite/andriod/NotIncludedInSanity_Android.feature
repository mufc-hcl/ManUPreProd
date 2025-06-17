@NotSanity_Android
Feature: Validate functionality for Change Email and Password

  @TC014_android_ChangeEmail
  Scenario Outline: [My United]TC014 Settings --> My Profile --> Change email address for Login user
    #prerequisite-Change Email requires manual email verification on Yopmail before execution.
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "<username>" and valid password "<password>"
    And user clicks on login button in login screen
    And user clicks on close from notification
    And user click on setting icon on top righhand side
    And user clicks on My profile icon
    And user clicks on change email address in my profile screen
    And user enter the New email "<usernameNew>" and Confirm email"<confirmusernameNew>"valid password "<password>"
    And user clicks on update email address in my profile
    Then user validates email change successfully message
      | EmailUpdate Success Message |
      | CHANGE EMAIL ADDRESS        |
    And user clicks on close icon in email update success screen
    And user clicks on change email address in my profile screen
    And user enters the old email"<username>" and confirm email"<confirmOldusername>"valid password "<password>"
    And user clicks on update email address in my profile
    Then user validates email change successfully message
      | EmailUpdate Success Message |
      | CHANGE EMAIL ADDRESS        |

    Examples: 
      | username             | confirmOldusername   | usernameNew          | confirmusernameNew   | password |
      | oldemail@yopmail.com | oldemail@yopmail.com | emailnew@yopmail.com | emailnew@yopmail.com | Manu@123 |

  @TC019_android_ChangePW
  Scenario: [My United]TC019 Settings --> Settings --> My Profile --> Change Password for Login user
    #postrequisite - git commit /src/main/resources/pw_store.txt file after execution
    Given user navigates to manu android application
    And user navigates to screen two
    And user navigates to screen three
    And user navigates to screen four
    And user click on skip button in screen four
    And user clicks on ok button in cookies screen
    And user clicks continue in MUApp popup
    And user clicks on not now button in match appearance alert screen
    And user clicks on braze in app msg
    And user click on My United in bottom tab
    And user clicks on log in button
    And user enter the valid email "Manupw@yopmail.com" and valid password
    And user clicks on login button in login screen
    And user clicks on close from notification
    And user click on setting icon on top righhand side
    And user clicks on My profile icon
    And user clicks on change password in my profile screen
    Then user enters the current password, new password and confirm new password
    And user clicks on update password button in change password screen
    Then user validates password updated successfully message
