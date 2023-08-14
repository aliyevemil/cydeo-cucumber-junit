@n11
Feature: Searching for the given product by logging into the n11 application
  User story:After the user has successfully logged into the n11 application,
  find the apple, add to favorites and
  remove from favorites and log out of the account

Background: For the scenarios in the feature file, user is expected to be on login page
  Given User information

  Scenario: Login in the n11 app
    When go to page n11
    And user enters  username
    And user enters password
    And user should see the account on the screen
    And "iphone" is searched on the page
    And added to favorites
    And removed from favorites
    Then user log out the page



