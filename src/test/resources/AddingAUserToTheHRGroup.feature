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
    Then "Groups" sub-page is displayed

  Scenario: 2.003 Check that user is added to the HR group
    When click on the "Admin Tools" link at the header
    Then "Admin Tools" page is displayed
    When click on the "Groups" link in the left panel
    Then "Groups" sub-page is displayed
    Then Search field is displayed
    When enter "HR Manager" in the Search field
    When click on the Browse button