Feature: Customer can view flights and book a ticket

  Scenario: Customer can view all new flights and be able to book a ticket
    Given Customer is on Customer Home Page
    When Customer can view flights and click on Book button
    Then Customer should be on Ticket Page
    And Customer fills in required information
    And Customer click on Book Ticket button
    Then Customer should be on Confirmed Page
     
