# This a simple cucumber test file
# Create date is 01/13/2022
Feature: Feature to tests loging functionality

  Scenario: check loging for the successfull user with valid loging credential
    Given user is navigation to the home page
    When user enter the valid user ID and valid Password
    And click on the login button of the home page
    Then user should be able to successfull login to the Google account page
