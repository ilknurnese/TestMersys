Feature: Login to TestMersys

  Scenario: Login to WebSite

Feature: Login to TestMersys
  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password " S12345"
    Then Click on Assignment

  Scenario: Login to WebSite
    Then Click on Discussion
    Then Click on Discussion with chat

  Scenario: Recording Lessons
    Then Click on endLessons