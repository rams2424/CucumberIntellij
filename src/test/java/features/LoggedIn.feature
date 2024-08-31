Feature: LoggedIn User View

  Scenario: Validate user is able to view after login
    Given User navigates to the login page
    When User successfully enter the login in details
    Then User should be able to to see product details page

