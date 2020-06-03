Feature: removing a user from the HR group

  Background: 3.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data by admin
    When click on Login button
    Then home page is opened
    Then "Administrator" user name is displayed

  Scenario: 3.002 Check that user is removed from the HR group
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
    When click on remove icon on the "o.ivankovckyi" user name
    Then Remove User from Group pop-up is appeared
    When click on the Yes button
#    Then "Successfully removed user 'Oleg Ivankovckyi'." message is displayed
    Then "o.ivankovckyi" user is removed from the group