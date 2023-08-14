Feature: Piworks web page contact us feature
  User Story:
  In order to communicate with the
  company, the user is able to write and send
  her/his information easily.

  Background: For the scenarios, user is expected to send information to the company
    Given user is on the contact us page


  Scenario: Send information as user
    When user enters contact us page
    And user sees "P.I. Works - Contact" in the web page title
    And user enters first name "Developer" and last name "Tester"
    And user enters email "engineer@gmail.com"
    And user selects category
    And user enters message in the message box
    And user clicks checkbox
    Then user clicks to send button
  @student
  Scenario: login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard
  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard


