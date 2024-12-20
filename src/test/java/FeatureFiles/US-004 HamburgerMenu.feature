Feature: HamburgerMenu Functionality

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"
    Then User should login successfully

  Scenario: Hamburger Menu elements kontrol

    When Click top menu elements and new page success
      | hamburgerMenu | Hmenu         |
      | messaging     | messagingMenu |
      | sendMessaging | send          |


    When Click top menu elements and new page success
      | hamburgerMenu | Hmenu         |
      | messaging     | messagingMenu |
      | inbox         | inboxTablo    |

    When Click top menu elements and new page success
      | hamburgerMenu | Hmenu         |
      | messaging     | messagingMenu |
      | outbox        | outboxTablo   |

    When Click top menu elements and new page success
      | hamburgerMenu | Hmenu         |
      | messaging     | messagingMenu |
      | trash         | trashKontrol  |
