@a1
Feature: user can login with valid credentials data

  Scenario: user can login
    Given Username and password
    When User fill in the username blank
    And user fill password blank
    And user can click sign button
    Then user see the title on top of the page

