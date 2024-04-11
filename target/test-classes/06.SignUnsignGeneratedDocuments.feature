Feature: verifying sign/unsign documents

  Background: 6.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 6.002 Check that Document page is opened
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed

  Scenario: 6.003 Check that all generated documents are signed
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    Then Договір підряду document is displayed
    Then "2020-06-06" Contract Date for Договір підряду document is displayed correctly
    Then "1.1" document version for Договір підряду document is presented
    When click Mark as signed icon near the "Договір підряду" document
    Then Mark document as signed pop-up is appeared
    When click on the Yes button
    Then message pop-up is appeared
    Then "Договір підряду" document is signed


  Scenario: 6.004 Check that all generated documents are unsigned
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    Then Договір підряду document is displayed