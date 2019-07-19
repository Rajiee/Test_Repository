Feature: Login functionality

Scenario: Login functionality
Given users must be registered
When user enters the below credentials
|username||password|
|abc||abc123|
|xyz||xyz12|
Then users must be in the home page