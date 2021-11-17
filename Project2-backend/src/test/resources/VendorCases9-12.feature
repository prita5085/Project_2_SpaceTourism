# Not exhaustive, will conglomerate with other feature files for complete feature file
Feature: Vendor has Create,Read, Update, Delete operations for flights that work

  Scenario: The Create Flight functionality works
    Given The Vendor is on the vendor-create-flights form Page
    When The Vendor fills out the form by entering "<departureDateTime>", "<arrivalDateTime>", "<pricePerTicket>", "<flightCost>","<departureSpaceport>", "<arrivalSpaceport>", "<spaceship>" and clicks create
    Then A new flight is created and user is sent to vendorHome page

    Examples:
      | departureDateTime   |  arrivalDateTime | pricePerTicket | flightCost | departureSpaceport | arrivalSpaceport | spaceship |
      | 3774085200000       | 3776590800000    | 6000           | 100000     | Soren              | Mordecai         | Apocalypse |

  Scenario: The Vendor View Flight functionality works
    Given The user is on the log in page
    When the user logs in with valid credentials, "<vUsername>","<vPassword>"
    Then the vendor will be taken to vendorHome page
    When the Vendor clicks on view flight for a particular flight
    Then The user will be taken to vendorflightview

    Examples:
      | vUsername     | vPassword   |
      | me            | 1234567     |

#  Scenario: The edit flight functionality works
#    Given the Vendor is on the vendorflightview page
#    When the Vendor clicks on 'edit flight' for particular flight and then clicks submit edit
#    Then the flights edit will be persisted
#
#  Scenario: The Cancel Flight functionality works
#    Given The Vendor is on the vendorflightview page
#    When The Vendor clicks on 'Delete Flight'
#    Then The flight will be deleted and removed from all flights and returned 
