Feature: verifying document regeneration

  Background: 5.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 5.002 Check that Додаток комерційна таємниця document is regenerated
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    Then Договір підряду document is generated
    Then Додаток комерційна таємниця is generated
    Then Замовлення is generated
    When click Regenerate icon
