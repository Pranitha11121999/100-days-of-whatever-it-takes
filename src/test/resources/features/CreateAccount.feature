Feature: To validate create account page

@PositiveCreateAccount
Scenario: To click on create account link and provide required details
Given user is on Luma Website page
When  user clicks on Create an account link
And   user fills all required fields 
      |First Name | Last Name | Email        | Password | Confirm Password |
      | Shubham   | Singh     | ss@gmail.com | 123456   | 123456           |
And   clicks on create an account button
Then  user should see a successful message on screen "Thank you for registering with Main Website Store."      