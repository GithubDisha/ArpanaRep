Feature: Login Action
Scenario: Verify Login for valid inputs
Given user is on home page
When user clicks on Signin link
Then check title
When user enters username and password clicks on Submit
Then Check Login Successful 

Scenario: Verify Login for invalid inputs
Given user is on home page
When user clicks on Signin link
Then check title
When user enters valid username and invalid password clicks on Submit
Then check error message
When user enters invalid username and valid password clicks on Submit
Then check error message
