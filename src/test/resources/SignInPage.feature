Feature: testing signin page

  Scenario: 1.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened




