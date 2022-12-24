#US_013	As an admin user I should be able to use country Page functionality
#https://test.mersys.io/cities/list
#The country Page must be accessible when the URL is entered
#by Mehmet Bozabali

@smoke
Feature: US_013 As an admin user I should be able to use city Page functionality

    Background:
        Given The user goes to Test Home Page
        And The user accepts the cookies
        When The user enters with the right credentials
        Then The user should login successfully
        Given The user goes to city page

    @test5
    Scenario Outline: US_013_TC_01 The User should be able to create new city with required information
        When The user clicks add city button
        And The user selects country "<country>"
        And The user enters "<city>" Name
        And The user clicks save city button
        Then The user sees success city message

        Examples:
        | country     | city   |
        | Kazakhstan  | Almaata|
#        | Germany     | Kassel |
#        | Turkey      | Manisa |

    @test2
    Scenario Outline: US_013_TC_02 The User should be able to edit city with required information
        When The user searches "<old city>" Name
        And The user clicks city edit button
        When The user reenters "<new city>" Name
        And The user clicks save city button
        Then The user sees success city message

        Examples:
            | old city      | new city|
            | AlmaAta       | Almati  |
#            | Kassel        | Dieburg |
#            | Turgutlu      | Manisa  |


    @test3
    Scenario Outline: US_013_TC_03 The User should be able to delete city
        When The user searches "<last city>" city
        And The user clicks city delete button
        Then The user sees success city message

        Examples:
            | last city  |
            | Almati     |
#            | Dieburg    |
#            | Manisa     |
    @test4
    Scenario Outline: US_013_TC_04 The User should not be able to delete non existant city
        When The user searches "<last city>" city
        Then The user sees no data message

        Examples:
            | last city  |
            | Almati     |
#            | Dieburg    |
#            | Manisa     |

