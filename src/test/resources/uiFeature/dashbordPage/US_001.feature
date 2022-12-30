#US_001	As a user I should be able to access the home page
#https://test.mersys.io/
#The home page must be accessible when the URL is entered
#by Davut Yavas

@smoke
Feature: US_001 As a user I should be able to access the Home Page

  Scenario: US_001_TC_01 The user is on the Home Page
    Given the user goes to home page
    And the user accepts the cookies
    Then the user verifies that the url is "https://test.mersys.io/"
    Then the user verifies that the title "Campus"