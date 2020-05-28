Feature: verifying document regeneration

  Background: 5.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 5.002 Check that Додаток комерційна таємниця document are regenerated