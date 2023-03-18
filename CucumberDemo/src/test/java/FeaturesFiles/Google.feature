Feature: Google Search Feature

Scenario: To test the functionality of google search with Cucumber text

Given the user navigates to google url
Then the user verifies google search page is displayed
When the user enters "Cucumber" in Search bar
And the user clicks on submit button
Then the user verifies the google page results


Scenario: To test the functionality of google search with Java text

Given the user navigates to google url
Then the user verifies google search page is displayed
When the user enters "Java" in Search bar
And the user clicks on submit button
Then the user verifies the google page results