Feature: Hamburger Menu  Finance Functionality

  Background: Valid login
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"

  Scenario: As a student, when I make a payment, I want to see in the balance section that the remaining debt is reduced by the payment amount.
    When Hamburger menu finance click
    Then Your payment will be deducted from the remaining amount
