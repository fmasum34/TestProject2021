#Sample Feature Definition Template
Feature: Feature to test the user login functionality

  Scenario: Check login is successful with the valid creadentials
    Given user in the portal login page
    When user enter the valid user name and password
    And click on login button
    Then user successfully navigated to the user login page
