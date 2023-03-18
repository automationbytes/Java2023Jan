Feature: Google Search Feature
Background:
Given the user navigates to google url
Then the user verifies google search page is displayed


Scenario Outline: To test the functionality of google search with "<SearchText>" text
When the user enters "<SearchText>" in Search bar
And the user clicks on submit button
Then the user verifies the google page results


Examples:
|SearchText|
|Selenium|
|Java|
|Cucumber|
