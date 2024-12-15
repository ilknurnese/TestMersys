Feature: Student Fees Functionality

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"
    When navigate to Finance page

    Scenario: Student fee details
      And fistly click on the student name and click on the balance details
      Then balance details should be displayed