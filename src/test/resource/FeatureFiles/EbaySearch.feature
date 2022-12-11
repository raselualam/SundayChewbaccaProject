@regression @smoke @SKYW-15 @E2E
Feature: Ebay Search Functionality

	Scenario: Search for Shoes
		Given Open Ebay Homepage
		When Search for shoes
		Then Item list should have only shoes related products
	
	
	
	
	
	
	
#HomeWork:
		
#	Scenario: Search for Shirt
#		Given Open Ebay Homepage
#		When Search for shirt
#		Then Item list should have only shirt related products
		
#	Scenario: Search for Pant
#		Given Open Ebay Homepage
#		When Search for pant
#		Then Item list should have only pant related products