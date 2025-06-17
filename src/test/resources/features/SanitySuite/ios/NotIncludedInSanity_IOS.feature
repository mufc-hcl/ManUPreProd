@NotSanity_IOS
Feature: Validate functionality for Change Email and Password

  @TC014_ios_ChangeEmail
  Scenario Outline: [My United]TC014 Settings --> My Profile --> Change email address for Login user
    #prerequisite-Change Email requires manual email verification on Yopmail before execution.
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user click on setting icon on top righhand side in ios
    And user clicks on My profile icon in ios
    And user clicks on change email address in my profile screen in ios
    And user enter the New email "<usernameNew>" and Confirm email"<confirmusernameNew>"valid password "<password>" in ios
    And user clicks on update email address in my profile in ios
    Then user validates email change successfully message in ios
      | EmailUpdate Success Message |
      | CHANGE EMAIL ADDRESS        |
    And user clicks on close icon in email update success screen in ios
    And user clicks on change email address in my profile screen in ios
    And user enters the old email"<username>" and confirm email"<confirmOldusername>"valid password "<password>" in ios
    And user clicks on update email address in my profile in ios
    Then user validates email change successfully message in ios
      | EmailUpdate Success Message |
      | CHANGE EMAIL ADDRESS        |

    Examples: 
      | username             | confirmOldusername   | usernameNew          | confirmusernameNew   | password |
      | oldemail@yopmail.com | oldemail@yopmail.com | emailnew@yopmail.com | emailnew@yopmail.com | Manu@123 |

  @TC019_ios_ChangePW
  Scenario: [My United]TC019 Settings --> Settings --> My Profile --> Change Password for Login user
    #postrequisite - git commit /src/main/resources/pw_store.txt file after execution
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on log in button in ios
    And user clicks on continue button in ios
    And user enter the valid email "Manupw@yopmail.com" and valid password
    And user clicks on login button in login screen in ios
    And user clicks on close from notification
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user click on setting icon on top righhand side in ios
    And user clicks on My profile icon in ios
    And user clicks on change password in my profile screen
    Then user enters the current password, new password and confirm new password
    And user clicks on update password button in change password screen
    Then user validates password updated successfully message
