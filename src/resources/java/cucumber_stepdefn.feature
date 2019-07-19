Feature: Login functionality
@Login
Scenario: User login
Given user must be registered
When User enters credentials and performs login
Then User must be in the home page
@Registration
Scenario: User Registration
Given user must not be logged in
When user enters all the valid credentials
Then user has registered successfully
@Login @Search
Scenario: Searching for a product
Given user must be logged in
When user searches for a product
Then Product details are displayed
@Signout
Scenario: Sign_out
Given user must be logged in
When user clicks on the signout button
Then user has signed out