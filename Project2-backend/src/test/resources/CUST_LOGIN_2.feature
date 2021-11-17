Feature: Login Feature for Customer
  Scenario: Login Successful with valid credentials as Customer
    Given Customer is on Login page
    When Customer enters username and password
    And Customer click on login button
    Then Customer should be on Customer Home Page
