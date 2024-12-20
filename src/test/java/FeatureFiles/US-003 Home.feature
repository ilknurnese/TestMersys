Feature:

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"
    Then User should login successfully

  Scenario: Click On The Top Menu

    Given Click top menu elements and new page success
      | courses       | welcome          |
      | calendar      | weeklyCoursePlan |
      | attendance    | academicYear     |
      | assigments    | assiglocator     |
      | grading       | gradLoc          |
      | hamburgerMenu | Hmenu            |
      | message       | sentTime         |
      | profil        | singOut          |