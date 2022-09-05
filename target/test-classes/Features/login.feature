#Author - Hafijur Rahman
#Hooks - Blocks of code that runs before Or after each scenario; to avoid re-writing the common setup or teaddown actions  (Open Browser, Close Browser etc.)
#Scenario Hooks - runs before & after each scenario
#Step Hooks - runs before and after each step
#Conditional Hooks - hooks associated with tags for conditional executions (use order = 0,1,2 to prioritize same named hooks) (use "@Tags" after hooks to use tag specific hooks) (to combinigly use both order & tags use value = "@Tags", order=1)
#Hooks are invisible to the readers of the feature file
#Background - A step or group of steps that are common to all the scenarios in a feature; Is defined once in the feature; Runs before every scenario of the feature
#To avoid repeating the common steps in every scenario; for better readability & maintenance
#Unlike Hooks, Background is visible to the readers of the feature file
#CMD - Keywords -> from MVN project location
#Simple command -> mvn test
#Cucumber options -> mvn test -Dcucumber.options="#YourOptions"
#Cucumber options -> mvn test -Dcucumber.options="--help"
#Cucumber options -> mvn test -Dcucumber.options="#featureFileLocation"
#Cucumber options -> mvn test -Dcucumber.options="#featureFileLocation: #ScenarioNo"
#Cucumber options -> mvn test -Dcucumber.options="--tags @tagName"
#Cucumber options -> mvn test -Dcucumber.options="--plugin html:target/HtmlReports"
#Cucumber run single Test Runner -> mvn -Dtest=TestRunnerFileName test
#Maven Cucumber HTML Report optipms -> mvn clean verify
#tags - to execute features/scenarios based on given tags from TestRunner class
@SmokeFeature
Feature: Test login functionality

  @SmokeScenario1 @login
  Scenario: Check the user login is successful with valid credentials
    Given User is on login page
    When User enters the username & password
    And Click on the login button
    Then User is navigated to the home page

  @SmokeScenario2 @Register
  Scenario: Check the user is able to sucessfully register into the system
    Given User is on langing page
    And User clicks on sign up button
    When User enters the following details
      | Hafijur | Rahman | 1207 | Dhaka |
    And Clicks on the submit button
    Then User gets a registration successful message
# --- x ---
# when variables are used!
#  Scenario Outline: Check the user login is successful with valid credentials
#    Given User is on login page
#    When User enters the <username> & <password>
#    And Click on the login button
#    Then User is navigated to the home page
#
#   Examples: 
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2    |
# --- x ---
