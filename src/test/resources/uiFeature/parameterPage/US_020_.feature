# US_020- User should be able to use Fields Page functionality
  #1- User should be able to view Fields Page
  #2- User should be able to create new Field and view successfully validating the message
  #3- User should be able to delete Field and view, successfully validating the message
  #4- User should be able to edit Field and view successfully validating the message
  #5- When searching by name, the results should be matched the search terms.
  #By Davut Yavas
@smoke
Feature: US_020_User should be able to use Fields Settings Page

  Background: the user goes to home page
    Given the user goes to home page
    When the user accepts the cookies
    When the user inputs a valid  email
    And the user inputs a valid password
    And the user clicks the Login button on the login page
    When the user should be to click on "EN" flag
    Then user verifies the titles are "AEG" visible

  Scenario: US_020_TC01 User should be able to edit with Required and enabled button, successfully validating the message
    When the user should be to click on Setup
    When the user should be to click on Parameter
    When the user should be able to click on Fields settings Page
    And the user should be able to selectable "Student" on EntetyDropdown menu
    When the user should be able to click on RequiredRadioButton
    Then Verify the "successfully" warning
    When the user should be able to click on EnabledRadioButton
    Then Verify the "successfully" warning

  Scenario: US_020_TC02 User should be able to edit with Required and enabled button, successfully validating the message
    When the user should be to click on Setup
    When the user should be to click on Parameter
    When the user should be able to click on Fields settings Page
    And the user should be able to selectable "Student" on EntetyDropdown menu
    When the user should be able to click on EditButton
    And the user inputs a valid "1"
    When the user should be able to click on RequiredRadioButton of Fields settings Page
    When the user should be able to click on EnabledRadioButton of  Fields settings Page
    When the user should be able to click on ArrayRadioButton of  Fields settings Page
    And the user inputs a valid "2" numberOfValues
    And then user should be able to click on Save button
    Then Verify the "successfully" warning