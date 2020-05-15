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
    Then "HR Manager" group is displayed in the table
    When click on the "HR Manager" group
    Then users block is displayed
    When click on the Add User icon
    Then Add User pop-up is appeared
    When enter "o.ivankovckyi" in the Search for users field
    When click on the Search button
    Then "o.ivankovckyi" user name is displayed in the Add User pop-up
    When click on the Add button
#    Then "Successfully added user 'Oleg Ivankovckyi'." message is displayed
    Then "o.ivankovckyi" user is added to the users block