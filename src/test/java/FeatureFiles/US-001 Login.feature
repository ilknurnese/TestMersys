Feature: Login to TestMersys


  @SmokeTest
  Scenario: Login to WebSite

    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"
    Then User should login successfully







