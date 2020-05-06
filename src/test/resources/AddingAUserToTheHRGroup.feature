Feature: adding a user to the HR group

  Scenario: 2.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data by admin
    When click on Login button
    Then home page is opened
    Then "Administrator" user name is displayed
#
#  Scenario