# Therapist(Log in)
# US_038
# As a user I should be able to login with my account	Email address and password button should be functional
# Valid email and password must be entered
# Successful login after valid information is entered
#  by Davut Yavas-
  @smoke @us02
  Feature: US_002 As a user I should be able to login with my account Email adress and password button should be functional
    Background: the user goes to home page
      Given the user goes to home page
      When the user accepts the cookies

    Scenario:  US_002_TC_01 The user logins successfully by inputting a Valid email and password
      When the user inputs a valid  email
      And the user inputs a valid password
      And the user clicks the Login button on the login page
      When the user should be to click on "EN" flag
      Then user verifies the titles are "AEG" visible