Feature: Pay table download Functionality

  Background: Valid login
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"

  Scenario: The user must download the paytable

    When I can download my total debt as pdf or exxel. I can follow the payment schedule more easily.