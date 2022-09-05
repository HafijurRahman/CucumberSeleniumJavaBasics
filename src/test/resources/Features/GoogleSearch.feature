@RandomTest
Feature: Test google search functionality

  @RandomScenario1 @browser @googleSearch
  Scenario: Validate whether google search is working as expected
    Given browser is open
    And user is on google search page
    When user enters a search string in the search box
    And user hits enter from the physical keyboard
    Then user displays the search string results
