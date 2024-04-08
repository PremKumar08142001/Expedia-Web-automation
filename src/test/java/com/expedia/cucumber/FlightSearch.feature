Feature: Search Flight

Background:
	Given the user is in Expedia search page
	
Scenario: round trip search
	When the user enters trip details 
	Then the result page should be displayed