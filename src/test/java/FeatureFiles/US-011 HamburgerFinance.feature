Feature: Installment payment Functionality

  Background:  Valid login
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"

  Scenario: It's time. I should be able to pay my installment

    When I should be able to get to the payment page
    Then I pay my installment and my debt should decrease