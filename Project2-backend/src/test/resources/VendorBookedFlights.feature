Feature: As a Vendor, I can see how many people have booked my flight

Scenario: Vendor can see how many customers booked flight
	Given Vendor is on the Vendor Landing Page
	When Vendor clicks on booked flights navbar link
	Then Vendor should be able to view all flights purchased