@RandomLoginTest
Feature: Test login functionality

  @RandomLoginTest1 @login @browser
  Scenario Outline: Validate user is able to login in with the valid credentials
    Given user is on login page
    When user enters the <username> & <password>
    And user clicks on the login button
    Then user is redirected to landing page

    Examples: 
      | username | password |
      | test     |    12345 |
      | test2    |    12345 |
