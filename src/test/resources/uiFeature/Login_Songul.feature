Feature: Campus login feature

  @Songul
  Scenario: Login functionality

    When User navigate to "https://test.mersys.io"
    And User enter valid username in username box
    And User enter valid password in password box
    Then User click anmeldung button
    And User login Campus homepage



