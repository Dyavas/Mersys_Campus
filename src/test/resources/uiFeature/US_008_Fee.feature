#By Songül Akkaya

Feature: Fees Page Functionality

  Background: user must be logged in
    When User navigate to "https://test.mersys.io"
    And User enter valid username in username box
    And User enter valid password in password box
    Then User click anmeldung button


    Scenario: TC_01 User should be able to create a new Fee Type
      When the user click on Setup button
      And the user click on Parameters button
      And the user click on Fees  button
      And the user should be able to click on + button
      Then the user should be able to input the Name in Name box.
      Then the user should be able to input new code in code box.
      And the user should be able to input new Priority in the Priority box.
      And the user should be able to click on two times Active button
      And then user should be able to click on Save button
    Then User should be able to see "Fee Type successfully created“ message in message box



    Scenario: TC_04 User should be able to search an Fee Type
      When the user click on Setup button
      And the user click on Parameters button
      And the user click on Fees  button
      And the user should be able to input an existant Fee name in name box
      Then the user should be able to click the Search button.
      Then User should be able to see an existant Fee Type


      Scenario: TC_02 User should be able to update an existant Fee Type
        When the user click on Setup button
        And the user click on Parameters button
        And the user click on Fees  button
        And the user should be able to input an existant Fee name in name box
        And the user should be able to input an existant Fee Code in code box
        Then the user should be able to click the Search button.
        Then the user should be able to click Edit button
        And the user should be able to input new Name in the Name box.
        And the user should be able to input new Code in the Code box.
        And the user should be able to input new Priority in the Priority boxx.
        And the user should be able to click on two times Active button
        And then user should be able to click on Save button
        Then User should be able to see „Fee Type successfully updated“ message in message box

  @Songul
    Scenario: TC_03 User should be able to delete an existant Fee Type
      When the user click on Setup button
      And the user click on Parameters button
      And the user click on Fees  button
      And the user should be able to input new Name in the search Name box.
      Then the user should be able to click the Search button.
      Then the user should be able to click Deleteone button
      Then the user should be able to click Deletetwo button
      Then User should be able to see „Fee Type successfully deleted“ message in message box





