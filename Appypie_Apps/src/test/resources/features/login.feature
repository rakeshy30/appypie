Feature: Login Test
  
  In order to login
  As a user
  I have navigate to appypie.com

  Scenario: login to appypie
    Given user navigates to appypie website
    When user enters email
    Then user enters password
    And user clicks on login button
    
