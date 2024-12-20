Feature: I should be able to send a messag Functionality

  Background: Valid login
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"

  Scenario: As a student, I should be able to convey my excuse and situation

    When I go to the notification section
    Then I write or upload the notification