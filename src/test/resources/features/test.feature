@temp
Feature: Login functionality

  Scenario: Positive login
    Given the user is on the homepage
    When the user clicks on Sign in button
    Then the page title should contain Login