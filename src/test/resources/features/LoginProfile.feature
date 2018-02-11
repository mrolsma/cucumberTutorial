@LoginProfile
Feature: Login Profile
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Scenario: Successful login
    When I am on the page demoaut


  Scenario Outline: Failed login using wrong credentials
    When I fill in "Username" with "<username>"
    And I fill in "Password" with "<password>"
    And I click on the "Login" button
    And I should see "<warning>" message
    Examples:
      | username    | password   | warning                           |
      | Test        | !23        | Incorrect credentials. Try again! |
      | Tset        | 123        | Incorrect credentials. Try again! |
      | Tset        | !23        | Incorrect credentials. Try again! |
      | Test        |            | Please enter password.            |
      |             | 123        | Please enter username.            |
      |             |            | Please enter your credentials.    |