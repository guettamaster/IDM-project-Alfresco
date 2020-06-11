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
    When enter "6/6/2020" in the Contract Date field in the Regenerate Document pop-up
    When enter "7/7/2020" in the Дата закінчення договору field in the Regenerate Document pop-up
    When click on Generate button in the Regenerate Document pop-up
    Then "2020-06-06" Contract Date in the message is displayed in the pop-up
    Then appropriate message for Договір підряду is displayed
    When click OK button
    Then Договір підряду document is regenerated
    Then "2020-06-06" Contract Date for Договір підряду document is displayed correctly
    Then "1.1" document version for Договір підряду document is presented
    When click on the Договір підряду document
    When switch to second tab
#    When Договір підряду document is opened in OnlyOffice
    Then "Sat 6 Jun 2020" Contract Date is displayed correctly
    Then "2020-07-07" Дата закінчення договору is displayed correctly

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
    Then "1.1" document version for Договір підряду document is presented
    Then Додаток комерційна таємниця document is displayed
    Then "1.0" document version for Додаток комерційна таємниця document is presented
    Then Замовлення document is displayed
    Then "1.0" document version for Замовлення document is presented
    When click second Regenerate icon near the "Додаток комерційна таємниця" document
    Then Regenerate Document pop-up is appeared
    Then checkbox is preselected on the Update current document
    When enter "2/2/2020" in the Contract Date field in the Regenerate Document pop-up
    When enter "3/3/2020" in the Дата укладення угоди field in the Regenerate Document pop-up
    When click on Generate button in the Regenerate Document pop-up
    Then appropriate message for Додаток комерційна таємниця is displayed
    When click OK button
    Then Додаток комерційна таємниця is regenerated
    Then "1.1" document version for Додаток комерційна таємниця document is presented
    When click on the Додаток комерційна таємниця document
    When switch to second tab
    Then "Sun 2 Feb 2020" Contract Date is displayed correctly
    Then "2020-03-03" Дата укладення угоди is displayed correctly

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
    Then "1.1" document version for Договір підряду document is presented
    Then Додаток комерційна таємниця document is displayed
    Then "1.1" document version for Додаток комерційна таємниця document is presented
    Then Замовлення document is displayed
    Then "1.0" document version for Замовлення document is presented
    When click third Regenerate icon near the "Замовлення" document
    Then Regenerate Document pop-up is appeared
    Then checkbox is preselected on the Update current document
    When enter "8/8/2020" in the Contract Date field in the Regenerate Document pop-up