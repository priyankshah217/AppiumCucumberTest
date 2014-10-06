Feature: Checking 'secure dialog' in API Demo Application

Background: API demo

Given I Open API demo Application in my device
Scenario: Secure Dialog

When I click on 'App'
	And I click on 'Activity'
	And I click on 'Secure Surface'
	And I click on 'Secure Dialog'
Then 'Show Secure Dialog' Button is displayed