#US_012	As an admin user I should be able to use country Page functionality
#https://test.mersys.io/countries/list
#The country Page must be accessible when the URL is entered
#by Mehmet Bozabali-
@smoke
Feature: US_012 As an admin user I should be able to use country Page functionality

    Background:
        Given the user goes to home page
        When the user accepts the cookies
        When the user inputs a valid  email
        And the user inputs a valid password
        And the user clicks the Login button on the login page
        When the user should be to click on "English" flag
        When the user should be to click on Setup
        When the user should be to click on Parameter
        And The user goes to country page


    Scenario Outline: US_012_TC_01 The User should be able to create new country with required information

        When The user clicks add button
        And The user enters "<Name>" and "<Code>"
        And The user clicks radio button
        And The user clicks save button
        Then The user sees success message

    Examples:
    |  Name       |  Code |
    |  MehmetLand |  ML23 |


    Scenario Outline: US_012_TC_02 The User should be able to edit country with required information
        When The user searches "<Name>"
        And The user clicks country edit button
        When The user reenters "<NewName>" and "<NewCode>"
        And The user clicks save button
        Then The user sees success message

        Examples:
            |  Name        |  NewName    |  NewCode |
            |  MehmetLand  |  Mehmet23   |  M23     |


    Scenario Outline: US_012_TC_03 The User should be able to delete country
        When The user searches "<NewName>" country
        And The user clicks country delete button
        Then The user sees success message
        Examples:
        | NewName |
        | Mehmet23|

    Scenario Outline: US_012_TC_04 The User should not be able to delete non existant country
        When The user searches "<NewName>" country
        Then The user sees no data message
        Examples:
            | NewName |
            | Mehmet23|
