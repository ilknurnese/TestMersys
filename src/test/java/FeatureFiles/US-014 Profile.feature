Feature: Profile Functionality

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"

  Scenario: Profile Picture Upload
    # 1. Profile > Settings sayfasına erişim
    And Click on the Element in Dialog
      | profileMenu           |
      | settings              |

    # 2. Profil resmine tıklama ve pencere açılması
    And Click on the Element in Dialog
      | uploadPicture         |

    # 3. Upload butonu ve resim yükleme
    And Click on the Element in Dialog
      | uploadPictureButton   |
    And Upload the picture

    # 4. Resim boyutunun doğrulanması
    Then Verify uploaded picture size

    # 5. Başarı mesajının doğrulanması
    And Click on the Element in Dialog
      | uploadButton          |
      | saveButton            |
    Then Confirm Success Message
