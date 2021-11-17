Feature: Customer can search flights and book a ticket

  Scenario: Customer can search flights and be able to book a ticket
    Given Customer is on customer home page
    When Customer fill in required information to filter flights 
    When Customer click on search button
    Then Customer should be able to view filtered flights
    When Customer click on book button
    Then Customer should be on ticket page
    When Customer fills in ticket form 
    When Customer click on book ticket button
    Then Customer should be on confirmed Page