@LoginProfile
Feature: Login Profile
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Scenario: Successful login
    When I am on the page demoaut
    And I login
    Then I am on the page demoaut