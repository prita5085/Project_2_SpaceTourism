Feature: As a Vendor, I can see how much I have made off of the flight

Scenario: Vendor can see how much they made off of the flight
	Given Vendor is on the Vendor Landing Page
	When Vendor clicks on Revenue navbar link
	Then Vendor should be able to view overall/total revenue generated from flights