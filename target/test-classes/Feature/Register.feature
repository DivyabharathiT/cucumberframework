Feature: verify user can register at follo app

  Scenario: verifying user can register with valid credentials
      Given user lands on registration page
    When user enter valid username and mobile number
    And user  click submit button
    Then user should navigate to basic details page
    
    
    Scenario: verifying user can register with invalid credentials
      Given user land on registration page
    When user enter invalid username and mobile number
    And user  clicks submit button
    Then user should not navigate to basic details page
    
    