Feature: verifying document generation

  Background: 4.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data by admin
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 4.002 Check that Document page is opened
    When click on the "Oleg Ivankovckyi" user name