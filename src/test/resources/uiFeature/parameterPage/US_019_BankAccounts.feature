Feature:Bank Accounts page functionality


  Background: the user goes to home page
    Given the user goes to home page
    When the user accepts the cookies
    When the user inputs a valid  email
    And the user inputs a valid password
    And the user clicks the Login button on the login page
    When the user should be to click on "English" flag
    And the user should be able to select a school


  Scenario Outline: User should be able to create a new Bank Account with valid and required informations
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to click on add button
    And User should be able to enter a Name "<Name>" to the relevant field
    And User should be able to enter a valid IBAN "<IBAN>" to the relevant field
    And User should be able to select Currency "<Currency>"
    And User should be able to enter Integration Code "<Integration Code>"
    And User should be able to switch status to actieve and click on Save button
    Then User should be able to see the "<message>" message
    Examples:
      | Name               | IBAN                        | Currency | Integration Code | message                           |
      | SC Bank Account 85 | SE56 7856 5656 2326 9599 56 | EUR      | 1                | Bank Account successfully created |
#      | Brussel College Automation Bank Account | BE56 7856 5656 2326 9596 21 | EUR      | 1                | Bank Account successfully created |
#      | BC Bank Account 3 | BE56 7856 5656 2326 9596 23 | USD      | 1                | Bank Account successfully created |
#      | BC Bank Account 4 | BE56 7856 5656 2326 9596 24 | TRY      | 1                | Bank Account successfully created |
#      | BC Bank Account 5 | BE56 7856 5656 2326 9596 25 | PKR      | 1                | Bank Account successfully created |
#      | BC Bank Account 6 | BE56 7856 5656 2326 9596 26 | KGS      | 1                | Bank Account successfully created |
#      | BC Bank Account 7 | BE56 7856 5656 2326 9596 27 | TZS      | 1                | Bank Account successfully created |


  Scenario Outline: User should be able to NOT create a duplicated Bank Account with the same IBAN
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to click on add button
    And User should be able to enter a Name "<Name>" to the relevant field
    And User should be able to enter a valid IBAN "<IBAN>" to the relevant field
    And User should be able to select Currency "<Currency>"
    And User should be able to enter Integration Code "<Integration Code>"
    And User should be able to switch status to actieve and click on Save button
    Then User should be able to see the already exist "<message>" message
    Examples:
      | Name               | IBAN                        | Currency | Integration Code | message         |
      | BC Bank Account 85 | BE56 7856 5656 2326 9596 10 | EUR      | 1                | already exists. |


  Scenario Outline: User should be able to update an exist Bank Account
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to enter a Bank Acc. "BC Bank Account 85" to search box
    And User should be able to click search button
    Then User should be able see "BC Bank Account 85" the Bank account on list
    When User should be able to click on edit button for "BE56 7856 5656 2326 9596 10"
    And User should be able to enter a Name "<Name>" to the relevant field
    And User should be able to enter a valid IBAN "<IBAN>" to the relevant field
    And User should be able to select Currency "<Currency>"
    And User should be able to enter Integration Code "<Integration Code>"
    And User should be able to switch status to actieve and click on Save button
    Then User should be able to see the "<message>" message
    Examples:
      | Name               | IBAN                        | Currency | Integration Code | message                           |
      | BC Bank Account 86 | BE56 7856 5656 2326 9596 10 | EUR      | 1                | Bank Account successfully updated |
      | BC Bank Account 86 | BE56 7856 5656 2326 9596 10 | KZT      | 1                | Bank Account successfully updated |
      | BC Bank Account 85 | BE56 7856 5656 2326 9596 10 | EUR      | 2                | Bank Account successfully updated |
      | BC Bank Account 85 | BE56 7856 5656 2326 9596 11 | EUR      | 1                | Bank Account successfully updated |


  Scenario: User should be able delete a bank account with its IBAN
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to enter a Bank Acc. "BC Bank Account 85" to search box
    And User should be able to click search button
    Then User should be able to check "BE56 7856 5656 2326 9596 10" IBAN
    And User should be able click delete button and delete "BE56 7856 5656 2326 9596 10" from the Bank account on list
    And User should be able to see the "Bank Account successfully deleted" message


  Scenario Outline: User should NOT be able to create a new Bank Account with blank input for required informations
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to click on add button
    And User should be able to enter a Name "<Name>" to the relevant field
    And User should be able to enter a IBAN "<IBAN>" to the relevant field
    And User should be able to select Currency "<Currency>"
    And User should be able to enter Integration Code "<Integration Code>"
    Then User should be able to see that save button is not clickable
    #And User should be able to see the "invalid" message
    Examples:
      | Name              | IBAN                        | Currency | Integration Code |
      |                   | BE56 7856 5656 2326 9596 23 | EUR      | 1                |
      | BC Bank Account 5 |                             | TRY      | 1                |
      | BC Bank Account 6 | Be56 7856 5656 2326 9596 24 |          | 1                |
      | BC Bank Account 7 | Be56 7856 5656 2326 9596 25 | EUR      |                  |
     # | BC Bank Account 2 | tr56 7 | EUR      | 1                |
     # | BC Bank Account 3 | Bz     | USD      | 1                |
     # | BC Bank Account 4 | eB56 7856 5656 2326 9596 20 | EUR      | 1                |
     # | BC Bank Account 4 | eB56 7856 5656 2326 9596 21 | EUR      | #@!              |
      | BC Bank Account 4 | #@!                         | EUR      | 1                |
     # | #@!               | BE56 7856 5656 2326 9596 22 | EUR      | 1                |
      | BC Bank Account 4 | #@56 7856 5656 2326 9596 23 | EUR      | 1                |
      | BC Bank Account 4 | #@56 7856 5656 2326 9596 23 | EUR      | 1                |
#gecenler!!! bunlari degistir cunku olusturdu


  Scenario: User should be able search a bank account with its name
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to enter a Bank Acc. "BC Bank Account 85" to search box
    And User should be able to click search button
    Then User should be able see "BC Bank Account 85" the Bank account on list


  Scenario: User should be able search bank accounts with currency
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to select Currency "EUR" from search dropdown box
    And User should be able to click search button
    Then User should be able see "BC Bank Account 85" the Bank account on list



  Scenario: User should be able search a bank account with name and currency
    Given User is navigate to "Setup" "Parameters" module then click "Bank Accounts" page
    When User should be able to enter a Bank Acc. "BC Bank Account 85" to search box
    And User should be able to select Currency "EUR" from search dropdown box
    And User should be able to click search button
    Then User should be able see "BC Bank Account 85" the Bank account on list

