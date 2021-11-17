Feature: Login page validates and sends user to appropriate page
  Background:
    Given The User is on the Login Page

  Scenario Outline: Login for Customer validates and sends Customer to home page
    When The Customer enters a correct "<username>" and "<password>" and presses Login
    Then The Customer should land on the Customer home page

    Examples:
    | username   |  password |
    |  cs        |   1234567 |
    |  gc        |   1234567 |

  Scenario Outline: Vendor log in correctly validates and sends to vendor home page
    When The Vendor enters their correct "<vUsername>" and "<vPassword>" and presses Login
    Then The vendor will be on the landing page

  Examples:
    | vUsername     | vPassword   |
    | ir            | 1234567     |
    | me            | 1234567     |