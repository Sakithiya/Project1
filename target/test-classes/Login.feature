@Smoke @Regression
Feature: Validation of facebook details

@Login
Scenario: Validate the login details
Given User is on facebook page
When User enters userName and pwds
|userName|pwd|
|Java@gmail.com|1234567890|
|Java1@gmail.com|1234567890|
|Java2@gmail.com|1234567890|
Then User clicks the login button

