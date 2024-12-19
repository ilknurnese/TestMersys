Feature: Finance Functionality
  Background: : Valid login
    Given Navigate to Mersys
    When Enter username and password
    Then User should Successfully

    Scenario: Finance Menu Access
      When navigate to Finance page
      Then Finance page should be displayed
