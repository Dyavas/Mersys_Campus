#US_014
#https://test.mersys.io/
#by Yusuf Sahin.

@smoke
  Feature: US_014 User should be able to use States Page

    Scenario: US_014_TC_01 user should be able to create a new State
      Given user should be able choose a Language English
      When user should be able choose to School
      Then user should be able see States Page
      When user should be able to click on + button
      Then user should be able click to country section and to select country
      Given user should be able to enter a name to the Name and Short Name fields
      Then user should be able to click Save button
      Then user should be able to see successfully message

    Scenario: US_014_TC_02 user should be able to edit a State
      Given user should be able choose a Language English
      When user should be able choose to School
      Then user should be able see States Page
      Then user should be able to select All option from Country
      Given user should be able enter a Name in Name input
      Then user should be able to click Search button
      And user should be able to click Edit icon
      Given user should be able to change Name and Short Name input
      Then user should be able to click Save button
      Then user should be able to see successfully message

    Scenario: US_014_TC_03 user should be able to delete a State
      Given user should be able choose a Language English
      When user should be able choose to School
      Then user should be able see States Page
      Then user should be able to select All option from Country
      Given user should be able enter "Brisbane" in Name input
      Then user should be able to click Search button
      And user should be able to click Delete icon
      Then user should be able to click Delete button
      Then user should be able to see successfully message

    Scenario: US_014_TC_04 user should be able to delete a non existant State
      Given user should be able choose a Language English
      When user should be able choose to School
      Then user should be able see States Page
      Then user should be able to select All option from Country
      Given user should be able enter "Brisbane" in Name input
      And user should be able to click Search button
      Then user should be able to see There is no data to display