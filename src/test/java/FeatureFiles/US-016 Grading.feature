Feature: Grading Feature
  As a student,
  I want to view my grades and transcript on a dedicated page,
  So that I can track my course progress more effectively.

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"

  Scenario: Access the Grading page from the homepage
    When the user clicks on the "Grading" link
    Then the user should be navigated to the Grading page

  Scenario: View Course Grades
    Given the user is on the Grading page
    When the user clicks on the "Course Grade" button
    Then the course grades should be displayed

  Scenario: View Student Transcript
    Given the user is on the Grading page
    When the user clicks on the "Student Transcript" button
    Then the student transcript should be displayed

  Scenario: View Transcript by Subject
    Given the user is on the Grading page
    When the user clicks on the "Transcript By Subject" button
    And the user selects a course
    Then the transcript for the selected course should be displayed
