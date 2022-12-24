#By Songül Akkaya

Feature: Citizenships Page Functionality

  Background: user must be logged in
    When User navigate to "https://test.mersys.io"
    And User enter valid username in username box
    And User enter valid password in password box
    Then User click anmeldung button


  Scenario: TC_01 User should be able to create new citizionships with required informations
    When the user click on Setup button
    And the user click on Parameters button
    And the user click on Citizenships button
    And the user should be able to click on + button
    And the user should be able to input an existant Citizenships name "test" in name box
    And the user should be able to input an existant Citizenships Short name "ts" in name box
    Then the user should be able to click the Save button.
    Then User should be able to see „Citizenship successfully created“ message in message box


    Scenario: TC_02 User should be able to update an existant citizenship
    When the user click on Setup button
    And the user click on Parameters button
    And the user click on Citizenships button
    And the user should be able to input an existant Citizenships name "test" in seach name box
    And the user should be able to input an existant Citizenships Short name "ts" in search name box
    Then the user should be able to click the Search button.
    Then the user should be able to click Edit button
    And the user should be able to input an existant Citizenships new name "test1" in name box
    And the user should be able to input an existant Citizenships new Short name "ts1" in name box
    Then the user should be able to click the Save button.
    Then User should be able to see „Citizenship successfully updated“ message in message box


  Scenario: TC_03 User should be able to delete an existant citizenship
    When the user click on Setup button
    And the user click on Parameters button
    And the user click on Citizenships button
    And the user should be able to input an existant Citizenships name "test1" in seach name box
    And the user should be able to input an existant Citizenships Short name "ts1" in search name box
    Then the user should be able to click the Search button.
    Then the user should be able to click Deleteone button
    Then the user should be able to click Deletetwo button
    Then User should be able to see „Citizenship successfully deleted" message in message box

  @Songul1
    Scenario: TC_04 User should not be able to delete non existant citizenship
    When the user click on Setup button
    And the user click on Parameters button
    And the user click on Citizenships button
    And the user should be able to input an existant Citizenships name "test1" in seach name box
    And the user should be able to input an existant Citizenships Short name "ts1" in search name box
    Then the user should be able to click the Search button.
    Then User should be able to see „There is no data to display“ message



