Feature: Profile Theme Selection
  As a student, I want to select at least three different theme options in my profile
  So that I can experience a more personalized user interface.

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"

  @Regression
  Scenario: Validate Theme Selection and Success Message

    And Click on the Element in Dialog
      | profileMenu       |
      | settings          |

    Then User should see theme dropdown in the Settings page

    And Verify theme options are available
      | purple-theme       |
      | dark-purple-theme  |
      | indigo-theme       |

    When Select "purple" theme from the dropdown
    Then Verify theme changed to "purple-theme"

    When Select "dark purple" theme from the dropdown
    Then Verify theme changed to "dark-purple-theme"

    When Select "indigo" theme from the dropdown
    Then Verify theme changed to "indigo-theme"

    And Click on the Element in Dialog
      | saveButton        |

    Then Confirm Profile Theme Success Message
