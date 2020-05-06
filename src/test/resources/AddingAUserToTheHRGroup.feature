Feature: adding a user to the HR group

  Background: 2.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data by admin
    When click on Login button
    Then home page is opened
    Then "Administrator" user name is displayed

  Scenario: 2.002 Check that "Group" page in the "Admin Tools" is opened
    When click on the "Admin Tools" link at the header
    Then "Admin Tools" page is displayed
    When click on the "Groups" link in the left panel
    Then "Group" sub-page is displayed