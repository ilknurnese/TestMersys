Feature: Profile Functionality

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"

  Scenario: Profile Picture Upload
    # 1. Profile > Settings
    And Click on the Element in Dialog
      | profileMenu           |
      | settings              |

    And Click on the Element in Dialog
      | uploadPicture         |

    And Click on the Element in Dialog
      | uploadPictureButton   |
    And Upload the picture

    And Click on the Element in Dialog
      | uploadButton          |
      | saveButton            |
    Then Confirm Success Message
