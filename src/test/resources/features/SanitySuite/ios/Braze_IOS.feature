@Sanity_IOS @Braze_IOS
Feature: Braze Funtionality

  
  Scenario Outline: [Braze]TC001 Upsell - Logout & Login User
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
    And user clicks on united now tab in ios
    Then user validates upsell functionality is displayed united now screen using API

    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |
      
        Scenario Outline: [My United]TC002 My United - Content Card - Logout & Login User - braze.
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
    Then user validates braze content card in myUnited Screen
    
      Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |

         
 Scenario Outline: [MUTV] TC003- Content Card - Logout & Login User - braze
 Given user navigates to manu android application
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
    And user enter the valid email and valid password for subscribed user in ios
    #And user enter the valid email "<username>" and valid password "<password>" in ios
    And user clicks on login button in login screen in ios
    And user clicks on test continue and clicks on back icon
    And user clicks on No tracking
    And user clicks on Mutv tab in ios
    And user clicks on explore icon in ios
    And user validates braze content card in MUTV
    
    Examples: 
      | username                | password |
      | manupreprod@yopmail.com | Manu@123 |