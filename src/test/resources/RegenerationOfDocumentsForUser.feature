Feature: verifying document regeneration

  Background: 5.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 5.002 Check that Договір підряду document is regenerated
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    Then Договір підряду document is displayed
    Then "1.0" document version for Договір підряду document is presented
    Then Додаток комерційна таємниця document is displayed
    Then "1.0" document version for Додаток комерційна таємниця document is presented
    Then Замовлення document is displayed
    Then "1.0" document version for Замовлення document is presented
    When click Regenerate icon near the "Договір підряду" document
    Then Regenerate Document pop-up is appeared

  Scenario: 5.003 Check that Додаток комерційна таємниця document is regenerated
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    Then Договір підряду document is displayed
    Then "1.0" document version for Договір підряду document is presented
    Then Додаток комерційна таємниця document is displayed
    Then "1.0" document version for Додаток комерційна таємниця document is presented
    Then Замовлення document is displayed
    Then "1.0" document version for Замовлення document is presented
    When click Regenerate icon near the "Додаток комерційна таємниця" document

  Scenario: 5.004 Check that Замовлення document is regenerated
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    Then Договір підряду document is displayed
    Then "1.0" document version for Договір підряду document is presented
    Then Додаток комерційна таємниця document is displayed
    Then "1.0" document version for Додаток комерційна таємниця document is presented
    Then Замовлення document is displayed
    Then "1.0" document version for Замовлення document is presented
    When click Regenerate icon near the "Замовлення" document
