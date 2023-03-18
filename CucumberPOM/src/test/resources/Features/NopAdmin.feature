Feature: To Demo with Cucumber POM

Scenario: Login 

Given the user lauches the NOPAdmin url
Then the user verifies the logo
When the user enters the username and password
And the user clicks on signin button
Then the user verifies the homepage

Scenario: Logout
Then the user verifies the homepage
And the user clicks on the logout button
