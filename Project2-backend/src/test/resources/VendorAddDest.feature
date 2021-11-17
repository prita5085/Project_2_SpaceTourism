Feature: As a Vendor, I can add new Destinations to expand universe coverage

Scenario: Vendor can add new destinations
	Given Vendor is on the Vendor Landing Page
	When Vendor clicks on Add SpacePorts navbar link
	Then Vendor should be able to fill out form to add spaceports and clicks on submit
	Then Vendor get submited successfully message