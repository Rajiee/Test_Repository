#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
Feature: Login functionality
Background: Browser launch
Given Browser must be installed by user
When User enters AUT URL in browser
Then Application must open in the browser

Scenario: Login
Given user must be in AUT login page
When user enters the valid credentials
Then User must be in home page

Scenario: Search
Given Home page must open
When User enters the product to search
Then Product details must be displayed