Feature: verify follo login details
 


   Scenario: verifying login details with vaild credentails
    Given user is on follo login  page
    When i  enter username and password
    And i  click login button
    Then i should able to login sucessfully
    
    
    
     Scenario: verifying login details with invaild credentails
      Given user is on login page
    When i  enter invalid username and password
    And i  click log button
    Then i should not able to login sucessfully
    