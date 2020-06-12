package com.aimprosoft.steps.serenity;

import com.aimprosoft.LOCATORS;
import com.aimprosoft.pages.DocumentPage;
import com.aimprosoft.pages.GroupPage;
import com.aimprosoft.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    SignInPage signinPage;
    GroupPage groupPage;
    DocumentPage documentPage;

    //======================================================SignInPage===================================================

    @Step
    public void openSignInPage() {
        signinPage.open();
    }

    @Step
    public void loginAsuser() {
        signinPage.loginAsuser();
    }

    @Step
    public void clickOnLoginButton() {
        signinPage.clickOnLoginButton();
    }

    @Step
    public void homePageIsOpened() {
        Assert.assertTrue("False", signinPage.homePageIsOpened());
    }

    @Step
    public void userNameIsDisplayed(String arg0) {
        Assert.assertTrue("False", signinPage.userNameIsDisplayed(arg0));
    }

    @Step
    public void loginAsadmin() {
        signinPage.loginAsadmin();
    }

    @Step
    public void clickOnTheLinkAtTheHeader(String arg0) {
        groupPage.clickOnTheLinkAtTheHeader(arg0);
    }

    @Step
    public void pageIsDisplayed(String arg0) {
        Assert.assertTrue("False", groupPage.pageIsDisplayed(arg0));
    }

    @Step
    public void clickOnTheLinkInTheLeftPanel(String arg0) {
        groupPage.clickOnTheLinkInTheLeftPanel(arg0);
    }

    @Step
    public void subPageIsDisplayed(String arg0) {
        Assert.assertTrue("False", groupPage.subPageIsDisplayed(arg0));
    }

    @Step
    public void searchFieldIsDisplayed() {
        Assert.assertTrue("False", groupPage.searchFieldIsDisplayed());
    }

    @Step
    public void enterInTheSearchField(String arg0) {
        groupPage.enterInTheSearchField(arg0);
    }

    @Step
    public void clickOnTheBrowseButton() {
        groupPage.clickOnTheBrowseButton();
    }

    @Step
    public void groupIsDisplayedInTheTable(String arg0) {
        Assert.assertTrue("False", groupPage.groupIsDisplayedInTheTable(arg0));
    }

    @Step
    public void clickOnTheGroup(String arg0) {
        groupPage.clickOnTheGroup(arg0);
    }

    @Step
    public void usersBlockIsDisplayed() {
        Assert.assertTrue("False", groupPage.usersBlockIsDisplayed());
    }

    @Step
    public void clickOnTheAddUserIcon() {
        groupPage.clickOnTheAddUserIcon();
    }

    @Step
    public void addUserPopUpIsAppeared() {
        Assert.assertTrue("False", groupPage.addUserPopUpIsAppeared());
    }

    @Step
    public void enterInTheSearchForUsersField(String arg0) {
        groupPage.enterInTheSearchForUsersField(arg0);
    }

    @Step
    public void clickOnTheSearchButton() {
        groupPage.clickOnTheSearchButton();
    }

    @Step
    public void userNameIsDisplayedInTheAddUserPopUp(String arg0) {
        Assert.assertTrue("False", groupPage.userNameIsDisplayedInTheAddUserPopUp(arg0));
    }

    @Step
    public void clickOnTheAddButton() {
        groupPage.clickOnTheAddButton();
    }

    @Step
    public void messageIsDisplayed(String arg0) {
        Assert.assertTrue("False", groupPage.messageIsDisplayed(arg0));
        groupPage.waitMessageIsClosed();
    }

    @Step
    public void userIsAddedToTheUsersBlock(String arg0) {
        Assert.assertTrue("False", groupPage.userIsAddedToTheUsersBlock(arg0));
    }

    @Step
    public void clickOnRemoveIconOnTheUserName(String arg0) {
        groupPage.clickOnRemoveIconOnTheUserName(arg0);
    }

    @Step
    public void removeUserFromGroupPopUpIsAppeared() {
        Assert.assertTrue("False", groupPage.removeUserFromGroupPopUpIsAppeared());
    }

    @Step
    public void clickOnTheYesButton() {
        groupPage.clickOnTheYesButton();
    }

    @Step
    public void userIsRemovedFromTheGroup(String arg0) {
        Assert.assertTrue("False", groupPage.userIsRemovedFromTheGroup(arg0));
    }

    @Step
    public void clickOnTheUserName(String arg0) {
        documentPage.clickOnTheUserName(arg0);
    }

    @Step
    public void userMenuIsAppeared() {
        Assert.assertTrue("False", documentPage.userMenuIsAppeared());
    }

    @Step
    public void clickMyProfileLink() {
        Assert.assertTrue(documentPage.elementIsVisible(1,LOCATORS.MY_PROFLE_LINK));
        documentPage.clickMyProfileLink();
    }

    @Step
    public void userProfilePageIsOpened() {
        Assert.assertTrue("False", documentPage.userProfilePageIsOpened());
    }

    @Step
    public void clickTheLink(String arg0) {
        documentPage.clickTheLink(arg0);
    }

    @Step
    public void pageIsOpened(String arg0) {
        Assert.assertTrue("False", documentPage.pageIsOpened(arg0));
    }

    @Step
    public void generateDocumentsBlockIsDisplayed() {
        Assert.assertTrue("False", documentPage.generateDocumentsBlockIsDisplayed());
    }

    @Step
    public void generatedDocumentsBlockIsDisplayed() {
        Assert.assertTrue("False", documentPage.generatedDocumentsBlockIsDisplayed());
    }

    @Step
    public void clickOnTheTypeDropDownMenu() {
        documentPage.clickOnTheTypeDropDownMenu();
    }

    @Step
    public void chooseTheПакетДокументовItem() {
        documentPage.chooseTheПакетДокументовItem();
    }

    @Step
    public void clickOnTheTemplateDropDownMenu() {
        documentPage.clickOnTheTemplateDropDownMenu();
    }

    @Step
    public void chooseTheДоговірПідрядуФінальнаВерсіяItem() {
        documentPage.chooseTheДоговірПідрядуФінальнаВерсіяItem();
    }

    @Step
    public void documentsWillBeCreatedSectionIsAppeared() {
        Assert.assertTrue("False", documentPage.documentsWillBeCreatedSectionIsAppeared());
    }

    @Step
    public void clickOnTheContractorDropDownMenu() {
        documentPage.clickOnTheContractorDropDownMenu();
    }

    @Step
    public void chooseTheФлайтехItem() {
        documentPage.chooseTheФлайтехItem();
    }

    @Step
    public void enterInTheContractDateField(String arg0) {
        documentPage.enterInTheContractDateField(arg0);
    }

    @Step
    public void enterInTheДатаЗавершенняРобітField(String arg0) {
        documentPage.enterInTheДатаЗавершенняРобітField(arg0);
    }

    @Step
    public void enterInTheДатаЗакінченняДоговоруField(String arg0) {
        documentPage.enterInTheДатаЗакінченняДоговоруField(arg0);
    }

    @Step
    public void enterInTheДатаПередачіРезультатівРоботиField(String arg0) {
        documentPage.enterInTheДатаПередачіРезультатівРоботиField(arg0);
    }

    @Step
    public void enterInTheДатаПочаткуВиконанняРобітField(String arg0) {
        documentPage.enterInTheДатаПочаткуВиконанняРобітField(arg0);
    }

    @Step
    public void enterInTheДатаУкладенняУгодиField(String arg0) {
        documentPage.enterInTheДатаУкладенняУгодиField(arg0);
    }

    @Step
    public void enterInTheДатаУкладенняЗамовленняField(String arg0) {
        documentPage.enterInTheДатаУкладенняЗамовленняField(arg0);
    }

    @Step
    public void enterInTheВартістьЗамовленняField(String arg0) {
        documentPage.enterInTheВартістьЗамовленняField(arg0);
    }

    @Step
    public void clickOnGenerateButton() {
        documentPage.clickOnGenerateButton();
    }

    @Step
    public void chooseArchivePreviousVersionSCheckbox() {
        documentPage.chooseArchivePreviousVersionSCheckbox();
    }

    @Step
    public void договірПідрядуDocumentIsGenerated() {
        Assert.assertTrue("False", documentPage.договірПідрядуDocumentIsGenerated());
    }

    @Step
    public void додатокКомерційнаТаємницяIsGenerated() {
        Assert.assertTrue("False", documentPage.додатокКомерційнаТаємницяIsGenerated());
    }

    @Step
    public void замовленняIsGenerated() {
        Assert.assertTrue("False", documentPage.замовленняIsGenerated());
    }

    @Step
    public void documentSGeneratedSuccessfullyMessageInThePopUpIsAppeared() {
        Assert.assertTrue("False", documentPage.documentSGeneratedSuccessfullyMessageInThePopUpIsAppeared());
    }

    @Step
    public void clickOKButton() {
        documentPage.clickOKButton();
    }

    @Step
    public void archivePreviousDocumentVersionSPopUpIsAppeared() {
        Assert.assertTrue("False", documentPage.archivePreviousDocumentVersionSPopUpIsAppeared());
    }

    @Step
    public void договірПідрядуDocumentIsDisplayed() {
        Assert.assertTrue("False", documentPage.договірПідрядуDocumentIsDisplayed());
    }

    @Step
    public void clickOnTheДоговірПідрядуDocument() {

        documentPage.elementIsVisible(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT);
//        Assert.assertTrue(documentPage.elementIsVisible(1,LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT));
        documentPage.clickOnTheДоговірПідрядуDocument();
    }

    @Step
    public void договірПідрядуDocumentIsOpenedInOnlyOffice() {
        documentPage.договірПідрядуDocumentIsOpenedInOnlyOffice();
    }

    @Step
    public void датаЗакінченняДоговоруIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаЗакінченняДоговоруIsDisplayedCorrectly(arg0));
    }

    @Step
    public void contractDateIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.contractDateIsDisplayedCorrectly(arg0));
    }

    @Step
    public void додатокКомерційнаТаємницяDocumentIsDisplayed() {
        Assert.assertTrue("False", documentPage.додатокКомерційнаТаємницяDocumentIsDisplayed());    }

    @Step
    public void clickOnTheДодатокКомерційнаТаємницяDocument() {
        documentPage.elementIsVisible(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT);
        documentPage.clickOnTheДодатокКомерційнаТаємницяDocument();
    }

    @Step
    public void додатокКомерційнаТаємницяDocumentIsOpenedInOnlyOffice() {
        documentPage.додатокКомерційнаТаємницяDocumentIsOpenedInOnlyOffice();
    }

    @Step
    public void датаУкладенняУгодиIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаУкладенняУгодиIsDisplayedCorrectly(arg0));
    }

    @Step
    public void замовленняDocumentIsDisplayed() {
        Assert.assertTrue("False", documentPage.замовленняDocumentIsDisplayed());
    }

    @Step
    public void clickOnTheЗамовленняDocument() {
        documentPage.elementIsVisible(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT);
        documentPage.clickOnTheЗамовленняDocument();
    }

    @Step
    public void замовленняDocumentIsOpenedInOnlyOffice() {
        documentPage.замовленняDocumentIsOpenedInOnlyOffice();
    }

    @Step
    public void датаЗавершенняРобітIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаЗавершенняРобітIsDisplayedCorrectly(arg0));
    }

    @Step
    public void датаПередачіРезультатівРоботиIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаПередачіРезультатівРоботиIsDisplayedCorrectly(arg0));
    }

    @Step
    public void датаПочаткуВиконанняРобітIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаПочаткуВиконанняРобітIsDisplayedCorrectly(arg0));
    }

    @Step
    public void датаУкладенняЗамовленняIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаУкладенняЗамовленняIsDisplayedCorrectly(arg0));
    }

    @Step
    public void вартістьЗамовленняIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.вартістьЗамовленняIsDisplayedCorrectly(arg0));
    }

    @Step
    public void documentVersionForДоговірПідрядуDocumentIsPresented(String arg0) {
        Assert.assertTrue("False", documentPage.documentVersionForДоговірПідрядуDocumentIsPresented(arg0));
    }

    @Step
    public void documentVersionForДодатокКомерційнаТаємницяDocumentIsPresented(String arg0) {
        Assert.assertTrue("False", documentPage.documentVersionForДодатокКомерційнаТаємницяDocumentIsPresented(arg0));
    }

    @Step
    public void documentVersionForЗамовленняDocumentIsPresented(String arg0) {
        Assert.assertTrue("False", documentPage.documentVersionForЗамовленняDocumentIsPresented(arg0));
    }

    @Step
    public void clickRegenerateIconNearTheDocument(String arg0) {
        documentPage.clickRegenerateIconNearTheDocument(arg0);
    }

    @Step
    public void regenerateDocumentPopUpIsAppeared() {
        Assert.assertTrue("False", documentPage.regenerateDocumentPopUpIsAppeared());
    }

    @Step
    public void contractDateForДоговірПідрядуDocumentIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.contractDateForДоговірПідрядуDocumentIsDisplayedCorrectly(arg0));
    }

    @Step
    public void датаУкладенняЗамовленняForЗамовленняDocumentIsDisplayedCorrectly(String arg0) {
        Assert.assertTrue("False", documentPage.датаУкладенняЗамовленняForЗамовленняDocumentIsDisplayedCorrectly(arg0));
    }

    @Step
    public void enterInTheContractDateFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(1, LOCATORS.CONTRACT_DATE_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheContractDateFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void enterInTheДатаЗакінченняДоговоруFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(1, LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheДатаЗакінченняДоговоруFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void clickOnGenerateButtonInTheRegenerateDocumentPopUp() {
        documentPage.clickOnGenerateButtonInTheRegenerateDocumentPopUp();
    }

    @Step
    public void contractDateInTheMessageIsDisplayedInThePopUp(String arg0) {
        Assert.assertTrue("False", documentPage.contractDateInTheMessageIsDisplayedInThePopUp(arg0));
    }

    @Step
    public void appropriateMessageForДоговірПідрядуIsDisplayed() {
        Assert.assertTrue("False", documentPage.appropriateMessageForДоговірПідрядуIsDisplayed());
    }

    @Step
    public void договірПідрядуDocumentIsRegenerated() {
        Assert.assertTrue(documentPage.elementIsVisible(1,LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT));
        Assert.assertTrue("False", documentPage.договірПідрядуDocumentIsRegenerated());
    }

    @Step
    public void clickSecondRegenerateIconNearTheDocument(String arg0) {
        documentPage.clickSecondRegenerateIconNearTheDocument(arg0);
    }

    @Step
    public void checkboxIsPreselectedOnTheUpdateCurrentDocument() {
        Assert.assertTrue(documentPage.elementIsVisible(1,LOCATORS.UPDATE_CURRENT_DOCUMENT_PRESELECTED_CHECKBOX));
        Assert.assertTrue("False", documentPage.checkboxIsPreselectedOnTheUpdateCurrentDocument());
    }

    @Step
    public void switchToSecondTab() {
        documentPage.switchToSecondTab();
    }

    @Step
    public void switchToFirstTab() {
        documentPage.switchToFirstTab();
    }

    @Step
    public void enterInTheДатаУкладенняУгодиFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheДатаУкладенняУгодиFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void appropriateMessageForДодатокКомерційнаТаємницяIsDisplayed() {
        Assert.assertTrue("False", documentPage.appropriateMessageForДодатокКомерційнаТаємницяIsDisplayed());
    }

    @Step
    public void додатокКомерційнаТаємницяIsRegenerated() {
        Assert.assertTrue(documentPage.elementIsVisible(1,LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT));
        Assert.assertTrue("False", documentPage.додатокКомерційнаТаємницяIsRegenerated());
    }

    @Step
    public void clickThirdRegenerateIconNearTheDocument(String arg0) {
        documentPage.clickThirdRegenerateIconNearTheDocument(arg0);
    }

    @Step
    public void clearDataInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp() {
        documentPage.clearDataInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp();
    }

    @Step
    public void enterInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void enterInTheДатаУкладенняЗамовленняFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheДатаУкладенняЗамовленняFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void enterInTheДатаЗавершенняРобітFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheДатаЗавершенняРобітFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void enterInTheДатаПередачіРезультатівРоботиFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheДатаПередачіРезультатівРоботиFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Step
    public void enterInTheДатаПочаткуВиконанняРобітFieldInTheRegenerateDocumentPopUp(String arg0) {
        documentPage.elementIsVisible(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP);
        documentPage.enterInTheДатаПочаткуВиконанняРобітFieldInTheRegenerateDocumentPopUp(arg0);
    }
}