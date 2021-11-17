#From Guest Home Page - As a Customer - I need to register if I want to buy ticket
Feature: Register Feature for Customer

  Scenario: Successful Registration with valid inputs as a Customer
    Given Customer is on Guest Home Page
    When Customer clicks on Customer Register button
    Then Customer should be on Customer Registration Page
    And Customer enters valid inputs on all required fields
    And Customer clicks on Register button
    Then Customer is on the Login Page
