@Sanity_IOS @IDM_IOS
Feature: IDM

  Scenario: [IDM]TC001 Validate tapping on login ,navigated to Login screen and the Google Privacy Policy and Terms of Service apply is displayed.
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
    Then user validates the google privacy policy in login screen in ios

  Scenario: [IDM]TC002 Validate tapping on login ,navigated to Sign up screen and the Google Privacy Policy and Terms of Service apply is displayed.
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on sign for united button in ios
    And user clicks on continue button in ios
    Then user validates the google privacy policy in Sign Up screen in ios

  Scenario Outline: [IDM]TC003 & TC004 & TC005 & TC006 Verify that user is able to Login using valid credentials natively,Verify logs out,validate my unites screen, validate my profile screen.
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
    And user click on My United in bottom tab in ios
    #Then user navigated to my united screen and validates the following text in ios using Api 
      #| Streaks       | Total       | Appearances |
      #| DAILY STREAKS | TOTAL SCORE | APPEARANCES |
    And user click on setting icon on top righhand side in ios
    And user clicks on My profile icon in ios
   Then user validates the below in my profile screen in ios using Api
#      | edit profile | changePassword  | changeEmail          | preference        | logout |
#      | edit profile | change password | change email address | preference centre | logout |
    And user clicks on Logout icon in ios

    #And user selects yes from the want to logout alert box in ios
    #Then user is navigated to my unites screen and validates the following in ios
    #| sign in button  | login button |
    #| SIGN FOR UNITED | LOG IN       |
    Examples:
      | username             | password |
      | manupreprod@yopmail.com | Manu@123 |

#not feasible due to multi factor authentication
#  Scenario Outline: [IDM]TC008 &TC009 Verify that user is able to Login using valid credentials using social channel,User should Not see Change email & change password in seeting screen however user should see Edit profile, Preference center and Log out.
#    Given user navigates to manu ios application
#    And user clicks on cancel button in apple id screen
#    And user clicks lets go button in screen one in ios
#    And user clicks on ask me later in screen two in ios
#    And user clicks skip button in screen three in ios
#    And user click on skip button in screen four in ios
#    And user clicks on ok in the cookies screen in ios
#    And user clicks on not now button in match appearance alert screen in ios
#    And user click on My United in bottom tab in ios
#    And user clicks on log in button in ios
#    And user clicks on continue button in ios
#    And user clicks on sign in with google button
#    And user enters the valid email "<username>" and valid password "<password>" in google screen in ios
#    And user clicks on show details in ios
#     And user clicks on test continue and clicks on back icon
#      And user clicks on No tracking
#      And user click on My United in bottom tab in ios
#    And user click on setting icon on top righhand side
#    And user clicks on My profile icon
#    Then user validates change password an email is not displayed
#
#    Examples:
#      | username                | password |
#      | manusocial080@gmail.com |          |

#  Scenario Outline: [IDM]TC0010 Verify the updated favorite player details on ios for a user and the same favorite player details are displayed on android for the same user
#    Given user navigates to manu ios application
#    And user clicks on cancel button in apple id screen
#    And user clicks lets go button in screen one in ios
#    And user clicks on ask me later in screen two in ios
#    And user clicks skip button in screen three in ios
#    And user click on skip button in screen four in ios
#    And user clicks on ok in the cookies screen in ios
#    And user clicks on not now button in match appearance alert screen in ios
#    And user click on My United in bottom tab in ios
#    And user clicks on log in button in ios
#    And user clicks on continue button in ios
#    And user enter the valid email "<username>" and valid password "<password>" in ios
#    And user clicks on login button in login screen in ios
#    And user clicks on test continue and clicks on back icon
#    And user clicks on No tracking
#    And user scrolls down to favorite player screen in ios
#    And user clicks on edit button in my united screen in ios
#    And user selects a favorite player in players screen in ios
#    And user initiates the android session
#    Given user navigates to manu android application
#    And user navigates to screen two
#    And user navigates to screen three
#    And user navigates to screen four
#    And user click on skip button in screen four
#    And user clicks on ok button in cookies screen
#    And user clicks on not now button in match appearance alert screen
#    And user clicks on braze in app msg
#    And user click on My United in bottom tab
#    And user clicks on log in button
#    And user enter the valid email "<username>" and valid password "<password>"
#    And user clicks on login button in login screen
#    And user clicks on test continue and clicks on back icon
#    And user clicks on close from notification
#    And user scrolls down to favorite player screen
#    Then user validates player name updated in my united screen in android
#      | player name |
#      | Tom         |

    Examples:
      | username             | password |
      | manupreprod@yopmail.com | Manu@123 |

  Scenario: [IDM]TC0011 Verify that user is able to sign up natively & an email should get triggered with expected email template & post sucessfuly confirmation of email user is able to log in using the credntials successfully.
   #Partial script till entering the values in the signup screen
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on sign for united button in ios
    And user clicks on continue button in ios
    And user enters the following details in signin page in ios
      | firstname | surname | emailaddress       | password | confirmpassword | dob | mob | yob  | country        |
      | firstname | surname | test@testemail.com | xxxx     | xxxx            | 1   | May | 2015 | United Kingdom |

  Scenario: [IDM]TC0012 Verify that during native sign up if user age is less then 13 years then user is presented with parental consent section asking user to enter parent/gauradian details.
   #Partial script till entering the values in the signup screen
    Given user navigates to manu ios application
    And user clicks on cancel button in apple id screen
    And user clicks lets go button in screen one in ios
    And user clicks on ask me later in screen two in ios
    And user clicks skip button in screen three in ios
    And user click on skip button in screen four in ios
    And user clicks on ok in the cookies screen in ios
    And user clicks on not now button in match appearance alert screen in ios
    And user click on My United in bottom tab in ios
    And user clicks on sign for united button in ios
    And user clicks on continue button in ios
    And user enters the following details in signin page in ios
      | firstname | surname | emailaddress       | password | confirmpassword | dob | mob | yob  | country        |
      | firstname | surname | test@testemail.com | xxxx     | xxxx            | 1   | May | 2015 | United Kingdom |
    And user enters the following parents details in signin page in ios
      | relationship | firstname  | surname       | emailaddress        |
      | Parent       | parentname | parentsurname | parentmail@test.com |


  Scenario: [IDM]TC0013 Verify that user is able to reset the password using forget password link & an email should get triggered with expected email template & post password reset user is able to log in using chnaged password.
   #PArtial script till entering the values in the signup screen
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
    And user clicks on forget password link in ios
    And user enters the following details in forget password screen in ios
      | email             | dob | mob | yob  |
      | testmail@test.com | 1   | May | 2015 |


  Scenario Outline: [IDM]TC0015 Verify that user able to naviagte to Change email screen post log in natively and in change password email user should be able to change email sucessfully, also an email should get triggered with expected email template to confirm the email. Post email confirmation if user try to relogin user should be able to log in using new changed email.
   #PArtial script till entering the values in the signup screen
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
    And user enters the following details in the change email address screen in ios
      | new email         | confirm new email | password |
      | testmail@test.com | testmail@test.com | 1234     |

    Examples:
      | username             | password |
      | manupreprod@yopmail.com | Manu@123 |