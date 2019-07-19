Feature: Login functionality
Scenario Outline: Login functionality
Given User must be registered
When user enters the <username> and <password>
Then user must be in the home page

Examples:
|username||password|
|raji||raji|
|abc123||abc123|