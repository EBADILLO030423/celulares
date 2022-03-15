@tag 
Feature: Excersice Page 
	navigate throug practice page to verify that its functions are working correctly

@validCredentials 
Scenario: Verify functions of Practice Page 
	Given User should be in "https://www.demoblaze.com/index.html" 
	When User should be able to click phones button and see the smartphones
	When user shoud be able to click the button laptops and see the laptops
	When user shoud be able to click the button monitors and see the monitors