@BackgroundTest1
Feature: Check home page functionalities

  Background: user is logged in
    Given user is on login pagee
    When user enters username and password
    And clicks on the login button
    Then user is navigated to the homepage

  Scenario: check logout link
    When user click on the welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user clicks on the dashboard link
    Then quick lauch toolbar is displayed
