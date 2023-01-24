# US017- User should be able to use Fields Page functionality
  #1- User should be able to view Fields Page
  #2- User should be able to create new Field and view successfully validating the message
  #3- User should be able to delete Field and view, successfully validating the message
  #4- User should be able to edit Field and view successfully validating the message
  #5- When searching by name, the results should be matched the search terms.
  #By Davut Yavas-

Feature: US_017_User should be able to use Fields Page

  Background: the user goes to home page
    Given the user goes to home page
    When the user accepts the cookies
    When the user inputs a valid  email
    And the user inputs a valid password
    And the user clicks the Login button on the login page
    When the user should be to click on "English" flag

  Scenario Outline: US_017_TC01 User should be able to create new Field and view successfully validating the message
    When the user should be to click on Setup
    When the user should be to click on Parameter
    When the user should be able to click on Fields Page
    And the user should be able to click on + button
    Then Verify existence of "New Field" Page
    When the user should be able to input the "<name>" name
    And the user should be able to input the "<code>" code
    And the user should be able to selectable "<type>" on Dropdown menu blank
    And then user should be able to click on Save button
    Then Verify the "<message>" warning
    Examples:
      | name    | code | type    | message        |
      | schule1 | okl  | Integer | successfully   |
      | schule1 | okl  | Text    | SchoolMessages |

  Scenario Outline: US_017_TC_02 User should be able to edit a Field and view successfully validating the message
    When the user should be to click on Setup
    When the user should be to click on Parameter
    When the user should be able to click on Fields Page
    When the user should be able to sourceInput the "<name>" name
    And then user should be able to click on Source button
    And the user should be able to click on edit button
    When the user should be able to input the "<name>" name
    And the user should be able to input the "<code>" code
    And then user should be able to click on Save button
    Then Verify the "<message>" warning
    Examples:
      | name    | code | type | message                    |
      | schule1 | okl  | Text | Field successfully updated |

  Scenario: US_017_TC_03 User should be able to delete a Field and view successfully validating the message
    When the user should be to click on Setup
    When the user should be to click on Parameter
    When the user should be able to click on Fields Page
    When the user should be able to sourceInput the "schule1" name
    And then user should be able to click on Source button
    And the user should be able to click on delete button
    And the user should be able to click on delete button of page
    Then Verify the "Field successfully deleted" warning

