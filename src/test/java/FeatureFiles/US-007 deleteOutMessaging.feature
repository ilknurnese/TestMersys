Feature: Delete messaging Functionality
  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"

  @SmokeTest
  Scenario: Delete messaging outbox
    When Delete outbox message
    Then The deletion process should be successfuly
