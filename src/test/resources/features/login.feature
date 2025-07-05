Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user calculated 1+2
    When user enters valid username and password
    And click on login button
    Then user is navigated to the home page
  @smoke
  Scenario: Successful login with invalid credentials
    Given user is on login page
    When user enters valid username and password
    And click on login button
    Then error message is displayed - Invalid Credentials