Feature: Hamburger Menu Messaging Functionality

  Background:
    Given Navigate to TestMersys
    When Enter username and Password as username "Student_7" as password "S12345"
    Then User should login successfully

  Scenario: Send a message from the hamburger menu
    When Click on the element
      | hamburgerMenu |

    Then Click top menu elements and new page success
      | messaging | messagingMenu |


    And Click on the element
      | sendMessaging |
      | addButton     |

    Then Send a message
      | nameSend | stu |

    And Click on the element
      | student2 |
      | student5 |


    When Click top menu elements and new page success
      | iframeAdd | successMessage |


    And Send a message
      | nameSend | tea |

    And Click on the element
      | teacher3 |


    And Click top menu elements and new page success
      | iframeAdd | successMessage |

    And Click on the element
      | addAndClose |

    And Mission done successfully element
      | stuElement2 |
      | stuElement5 |
      | teaElement3 |


    Then Click on the element
      | sendVia |
      | Email   |
      | sendVia |

    When Send a message
      | subject | git branching |

    Then İFrame Send  message

    And Click on the element
      | attachFile |
      | fromLocal  |

    Then File upload
    And Mission done successfully element
      | dosyaKontrol |
    Then Click on the element
      | send |
    And Mission done successfully element
    |messageSuccessfully|






