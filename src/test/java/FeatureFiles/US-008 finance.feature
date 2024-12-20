Feature: Finance Functionality
  Background: : Valid login
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"


  @SmokeTest
    Scenario: Finance Menu Access
      When navigate to Finance page
      Then Finance page should be displayed
