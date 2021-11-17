Feature: Register page works

  Scenario: Guest can register
    Given Guest is on the homepage
    When Guest clicks on book
    Then Guest will be on Login page

Feature: Guest features
  Scenario: Guest can view all flights
    Given The Guest is on the homepage
    When The Guest scrolls down
    Then The Guest can see all the flights

  Scenario: Guest can search all flights
    Given The Guest is on the homepage
    When The Guest enters in information into the From and To fields
    When The Guest clicks search
    Then The Guest can see all searched flight results

Feature: Customer can book multiple passengers

  Scenario: Customer can allow multiple passengers and calculate the cost
    Given The Customer is on the booked page
    When The Customer enters in multiple users
    Then The Customer can see see the new updated cost of the flight.