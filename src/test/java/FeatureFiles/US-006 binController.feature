Feature: Bin control Functionality
Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"

    @Regression
  Scenario: Bin control
      When Navigate to trash box
      And Restore message on the trash box
      And successfully message should be displayed
      And delete message on the trash box
      Then successfully message should be displayed
