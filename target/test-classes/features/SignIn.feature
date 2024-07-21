@SignIn
Feature: To validate Sign In Page

  Background: 
    Given user is on Luma Website page
    When user clicks on Sign In Link on Luma Page
    Then user validates title of Sign In page

  @VaildLogin
  Scenario: To validate successfull login on Sign In Page
    When user enters valid "ss1543417@gmail.com" emailID
    And user enters valid "Shubham@9" password
    Then user clicks on SignIn button

  @ValidTexts
  Scenario: To validate texts present on Page
    When user validates text "Registered Customers"
    And user validates sub text "If you have an account, sign in with your email address."
    And user validates New Customer text "New Customers"
    And user validates Create Customer sub text "Creating an account has many benefits: check out faster, keep more than one address, track orders and more."

  @ErrorLoginText
  Scenario: To validate with invalid username and password to SignIn
    When user enters invalid "ss14325@gmail.com" emailID
    And user enters invalid "Singh@8" password
    Then user clicks on SignIn button
    Then user receives error text as "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."

  @CreateAccountButtonAndTitle
  Scenario: To validate create Account button and verify Create Account Page Title
    When user clicks on createAccount button
    Then user lands on create Account Page "Create New Customer Account"

  @ForgotPasswordLinkAndTitle
  Scenario: To validate forgot Password Link and verify forgot Password Title
    When user clicks on forgot Password link
    Then user lands on forgot Password Page "Forgot Your Password?"
