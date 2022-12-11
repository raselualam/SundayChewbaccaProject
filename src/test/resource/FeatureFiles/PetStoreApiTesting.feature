@regression @apiTesting
Feature: Petstore API Testing

Scenario: User CRUD API

	Given Create username
	When Update username
	Then Get username
	And Delete username