Feature: verifying document generation

  Background: 4.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 4.002 Check that Document page is opened
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed

  Scenario: 4.003 Check that documents are generated
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    When click on the Type drop-down menu