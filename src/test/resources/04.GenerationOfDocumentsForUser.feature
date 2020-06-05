Feature: verifying document generation

  Background: 4.001 Check that "Home" page is opened
    Given open signin page
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "Oleg Ivankovckyi" user name is displayed

  Scenario: 4.002 Check that Document page is opened
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed

  Scenario: 4.003 Check that documents are generated
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Generate Documents block is displayed
    Then Generated Documents block is displayed
    When click on the Type drop-down menu
    When choose the Пакет документов item
    When click on the Template drop-down menu
    When choose the Договір Підряду (фінальна версія) item
    Then Documents will be created section is appeared
    When click on the Contractor drop-down menu
    When choose the Флайтех item
    When enter "1/5/2020" in the Contract Date field
    When enter "2/5/2020" in the Дата завершення робіт field
    When enter "3/5/2020" in the Дата закінчення договору field
    When enter "4/5/2020" in the Дата передачі результатів роботи field
    When enter "5/5/2020" in the Дата початку виконання робіт field
    When enter "6/5/2020" in the Дата укладення угоди field
    When enter "7/5/2020" in the Дата укладення замовлення field
    When enter "150" in the Вартість замовлення field
    When choose Archive previous version(s) checkbox
    When click on Generate button
    Then № document(s) generated successfully message in the pop-up is appeared
    When click OK button
#    Then Archive previous document version(s) pop-up is appeared
#    When click on the Yes button
    Then Договір підряду document is generated
    Then "2020-05-01" Contract Date for Договір підряду document is displayed correctly
    Then "1.0" document version for Договір підряду document is presented
    Then Додаток комерційна таємниця is generated
    Then "1.0" document version for Додаток комерційна таємниця document is presented
    Then Замовлення is generated
    Then "2020-05-07" Дата укладення замовлення for Замовлення document is displayed correctly
    Then "1.0" document version for Замовлення document is presented

  Scenario: 4.004 Check that Contract Date and Дата закінчення договору are displayed correctly in the Договір підряду document
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Договір підряду document is displayed
    When click on the Договір підряду document
    When switch to second tab
#    When switch to first tab
#    When Договір підряду document is opened in OnlyOffice
    Then "Fri 1 May 2020" Contract Date is displayed correctly
    Then "2020-05-03" Дата закінчення договору is displayed correctly

  Scenario: 4.005 Check that Contract Date and Дата укладення угоди are displayed correctly in the Додаток комерційна таємниця document
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Додаток комерційна таємниця document is displayed
    When click on the Додаток комерційна таємниця document

    When Додаток комерційна таємниця document is opened in OnlyOffice

    Then "Fri 1 May 2020" Contract Date is displayed correctly
    Then "2020-05-06" Дата укладення угоди is displayed correctly

  Scenario: 4.006 Check that Contract Date, Дата завершення робіт, Дата передачі результатів роботи, Дата початку виконання робіт, Дата укладення замовлення and Вартість замовлення are displayed correctly in the Замовлення document
    When click on the "Oleg Ivankovckyi" user name
    Then user menu is appeared
    When click My Profile link
    Then User Profile page is opened
    When click the "Documents" link
    Then "Document" page is opened
    Then Замовлення document is displayed
    When click on the Замовлення document
    When Замовлення document is opened in OnlyOffice
    Then "Fri 1 May 2020" Contract Date is displayed correctly
    Then "2020-05-02" Дата завершення робіт is displayed correctly
    Then "2020-05-04" Дата передачі результатів роботи is displayed correctly
    Then "2020-05-05" Дата початку виконання робіт is displayed correctly
    Then "2020-05-07" Дата укладення замовлення is displayed correctly
    Then "150" Вартість замовлення is displayed correctly