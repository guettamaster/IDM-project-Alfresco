package com.aimprosoft.steps;

import com.aimprosoft.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.net.URISyntaxException;
import java.util.Map;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

//======================================================SignInPage======================================================

    @Given("^open signin page$")
    public void openSignInPage(){
        endUserSteps.openSignInPage();
    }

    @And("^filled fields valid data$")
    public void filledFieldsValidData() throws Throwable {
        endUserSteps.loginAsuser();
    }

    @When("^click on Login button$")
    public void clickOnLoginButton() throws Throwable {
        endUserSteps.clickOnLoginButton();
    }

    @Then("^home page is opened$")
    public void homePageIsOpened() {
        endUserSteps.homePageIsOpened();
    }

    @Then("^\"([^\"]*)\" user name is displayed$")
    public void userNameIsDisplayed(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayed(arg0);
    }

    @And("^filled fields valid data by admin$")
    public void filledFieldsValidDataByAdmin() {
        endUserSteps.loginAsadmin();
    }

    @When("^click on the \"([^\"]*)\" link at the header$")
    public void clickOnTheLinkAtTheHeader(String arg0) throws Throwable {
        endUserSteps.clickOnTheLinkAtTheHeader(arg0);
    }

    @Then("^\"([^\"]*)\" page is displayed$")
    public void pageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.pageIsDisplayed(arg0);
    }

    @When("^click on the \"([^\"]*)\" link in the left panel$")
    public void clickOnTheLinkInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.clickOnTheLinkInTheLeftPanel(arg0);
    }

    @Then("^\"([^\"]*)\" sub-page is displayed$")
    public void subPageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.subPageIsDisplayed(arg0);
    }

    @Then("^Search field is displayed$")
    public void searchFieldIsDisplayed() {
        endUserSteps.searchFieldIsDisplayed();
    }

    @When("^enter \"([^\"]*)\" in the Search field$")
    public void enterInTheSearchField(String arg0) throws Throwable {
        endUserSteps.enterInTheSearchField(arg0);
    }

    @When("^click on the Browse button$")
    public void clickOnTheBrowseButton() {
        endUserSteps.clickOnTheBrowseButton();
    }

    @Then("^\"([^\"]*)\" group is displayed in the table$")
    public void groupIsDisplayedInTheTable(String arg0) throws Throwable {
        endUserSteps.groupIsDisplayedInTheTable(arg0);
    }

    @When("^click on the \"([^\"]*)\" group$")
    public void clickOnTheGroup(String arg0) throws Throwable {
        endUserSteps.clickOnTheGroup(arg0);
    }

    @Then("^users block is displayed$")
    public void usersBlockIsDisplayed() {
        endUserSteps.usersBlockIsDisplayed();
    }

    @When("^click on the Add User icon$")
    public void clickOnTheAddUserIcon() {
        endUserSteps.clickOnTheAddUserIcon();
    }

    @Then("^Add User pop-up is appeared$")
    public void addUserPopUpIsAppeared() {
        endUserSteps.addUserPopUpIsAppeared();
    }

    @When("^enter \"([^\"]*)\" in the Search for users field$")
    public void enterInTheSearchForUsersField(String arg0) throws Throwable {
        endUserSteps.enterInTheSearchForUsersField(arg0);
    }

    @When("^click on the Search button$")
    public void clickOnTheSearchButton() {
        endUserSteps.clickOnTheSearchButton();
    }

    @Then("^\"([^\"]*)\" user name is displayed in the Add User pop-up$")
    public void userNameIsDisplayedInTheAddUserPopUp(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayedInTheAddUserPopUp(arg0);
    }

    @When("^click on the Add button$")
    public void clickOnTheAddButton() {
        endUserSteps.clickOnTheAddButton();
    }

    @Then("^\"([^\"]*)\" message is displayed$")
    public void messageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.messageIsDisplayed(arg0);
    }

    @Then("^\"([^\"]*)\" user is added to the users block$")
    public void userIsAddedToTheUsersBlock(String arg0) throws Throwable {
        endUserSteps.userIsAddedToTheUsersBlock(arg0);
    }

    @When("^click on remove icon on the \"([^\"]*)\" user name$")
    public void clickOnRemoveIconOnTheUserName(String arg0) throws Throwable {
        endUserSteps.clickOnRemoveIconOnTheUserName(arg0);
    }

    @Then("^Remove User from Group pop-up is appeared$")
    public void removeUserFromGroupPopUpIsAppeared() {
        endUserSteps.removeUserFromGroupPopUpIsAppeared();
    }

    @When("^click on the Yes button$")
    public void clickOnTheYesButton() {
        endUserSteps.clickOnTheYesButton();
    }

    @Then("^\"([^\"]*)\" user is removed from the group$")
    public void userIsRemovedFromTheGroup(String arg0) throws Throwable {
        endUserSteps.userIsRemovedFromTheGroup(arg0);
    }

    @When("^click on the \"([^\"]*)\" user name$")
    public void clickOnTheUserName(String arg0) throws Throwable {
        endUserSteps.clickOnTheUserName(arg0);
    }

    @Then("^user menu is appeared$")
    public void userMenuIsAppeared() {
        endUserSteps.userMenuIsAppeared();
    }

    @When("^click My Profile link$")
    public void clickMyProfileLink() {
        endUserSteps.clickMyProfileLink();
    }

    @Then("^User Profile page is opened$")
    public void userProfilePageIsOpened() {
        endUserSteps.userProfilePageIsOpened();
    }

    @When("^click the \"([^\"]*)\" link$")
    public void clickTheLink(String arg0) throws Throwable {
        endUserSteps.clickTheLink(arg0);
    }

    @Then("^\"([^\"]*)\" page is opened$")
    public void pageIsOpened(String arg0) throws Throwable {
        endUserSteps.pageIsOpened(arg0);
    }

    @Then("^Generate Documents block is displayed$")
    public void generateDocumentsBlockIsDisplayed() {
        endUserSteps.generateDocumentsBlockIsDisplayed();
    }

    @Then("^Generated Documents block is displayed$")
    public void generatedDocumentsBlockIsDisplayed() {
        endUserSteps.generatedDocumentsBlockIsDisplayed();
    }

    @When("^click on the Type drop-down menu$")
    public void clickOnTheTypeDropDownMenu() {
        endUserSteps.clickOnTheTypeDropDownMenu();
    }

    @When("^choose the Пакет документов item$")
    public void chooseTheПакетДокументовItem() {
        endUserSteps.chooseTheПакетДокументовItem();
    }

    @When("^click on the Template drop-down menu$")
    public void clickOnTheTemplateDropDownMenu() {
        endUserSteps.clickOnTheTemplateDropDownMenu();
    }

    @When("^choose the Договір Підряду \\(фінальна версія\\) item$")
    public void chooseTheДоговірПідрядуФінальнаВерсіяItem() {
        endUserSteps.chooseTheДоговірПідрядуФінальнаВерсіяItem();
    }

    @Then("^Documents will be created section is appeared$")
    public void documentsWillBeCreatedSectionIsAppeared() {
        endUserSteps.documentsWillBeCreatedSectionIsAppeared();
    }

    @When("^click on the Contractor drop-down menu$")
    public void clickOnTheContractorDropDownMenu() {
        endUserSteps.clickOnTheContractorDropDownMenu();
    }

    @When("^choose the Флайтех item$")
    public void chooseTheФлайтехItem() {
        endUserSteps.chooseTheФлайтехItem();
    }

    @When("^enter \"([^\"]*)\" in the Contract Date field$")
    public void enterInTheContractDateField(String arg0) throws Throwable {
        endUserSteps.enterInTheContractDateField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата завершення робіт field$")
    public void enterInTheДатаЗавершенняРобітField(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаЗавершенняРобітField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата закінчення договору field$")
    public void enterInTheДатаЗакінченняДоговоруField(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаЗакінченняДоговоруField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата передачі результатів роботи field$")
    public void enterInTheДатаПередачіРезультатівРоботиField(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаПередачіРезультатівРоботиField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата початку виконання робіт field$")
    public void enterInTheДатаПочаткуВиконанняРобітField(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаПочаткуВиконанняРобітField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата укладення угоди field$")
    public void enterInTheДатаУкладенняУгодиField(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаУкладенняУгодиField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата укладення замовлення field$")
    public void enterInTheДатаУкладенняЗамовленняField(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаУкладенняЗамовленняField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Вартість замовлення field$")
    public void enterInTheВартістьЗамовленняField(String arg0) throws Throwable {
        endUserSteps.enterInTheВартістьЗамовленняField(arg0);
    }

    @When("^click on Generate button$")
    public void clickOnGenerateButton() {
        endUserSteps.clickOnGenerateButton();
    }

    @When("^choose Archive previous version\\(s\\) checkbox$")
    public void chooseArchivePreviousVersionSCheckbox() {
        endUserSteps.chooseArchivePreviousVersionSCheckbox();
    }

    @Then("^Договір підряду document is generated$")
    public void договірПідрядуDocumentIsGenerated() {
        endUserSteps.договірПідрядуDocumentIsGenerated();
    }

    @Then("^Додаток комерційна таємниця is generated$")
    public void додатокКомерційнаТаємницяIsGenerated() {
        endUserSteps.додатокКомерційнаТаємницяIsGenerated();
    }

    @Then("^Замовлення is generated$")
    public void замовленняIsGenerated() {
        endUserSteps.замовленняIsGenerated();
    }

    @Then("^№ document\\(s\\) generated successfully message in the pop-up is appeared$")
    public void documentSGeneratedSuccessfullyMessageInThePopUpIsAppeared() {
        endUserSteps.documentSGeneratedSuccessfullyMessageInThePopUpIsAppeared();
    }

    @When("^click OK button$")
    public void clickOKButton() {
        endUserSteps.clickOKButton();
    }

    @Then("^Archive previous document version\\(s\\) pop-up is appeared$")
    public void archivePreviousDocumentVersionSPopUpIsAppeared() {
        endUserSteps.archivePreviousDocumentVersionSPopUpIsAppeared();
    }

    @Then("^Договір підряду document is displayed$")
    public void договірПідрядуDocumentIsDisplayed() {
        endUserSteps.договірПідрядуDocumentIsDisplayed();
    }

    @When("^click on the Договір підряду document$")
    public void clickOnTheДоговірПідрядуDocument() {
        endUserSteps.clickOnTheДоговірПідрядуDocument();
    }

    @Then("^Договір підряду document is opened in OnlyOffice$")
    public void договірПідрядуDocumentIsOpenedInOnlyOffice() {
        endUserSteps.договірПідрядуDocumentIsOpenedInOnlyOffice();
    }

    @Then("^\"([^\"]*)\" Дата закінчення договору is displayed correctly$")
    public void датаЗакінченняДоговоруIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаЗакінченняДоговоруIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" Contract Date is displayed correctly$")
    public void contractDateIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.contractDateIsDisplayedCorrectly(arg0);
    }

    @Then("^Додаток комерційна таємниця document is displayed$")
    public void додатокКомерційнаТаємницяDocumentIsDisplayed() {
        endUserSteps.додатокКомерційнаТаємницяDocumentIsDisplayed();
    }

    @When("^click on the Додаток комерційна таємниця document$")
    public void clickOnTheДодатокКомерційнаТаємницяDocument() {
        endUserSteps.clickOnTheДодатокКомерційнаТаємницяDocument();
    }

    @When("^Додаток комерційна таємниця document is opened in OnlyOffice$")
    public void додатокКомерційнаТаємницяDocumentIsOpenedInOnlyOffice() {
        endUserSteps.додатокКомерційнаТаємницяDocumentIsOpenedInOnlyOffice();
    }

    @Then("^\"([^\"]*)\" Дата укладення угоди is displayed correctly$")
    public void датаУкладенняУгодиIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаУкладенняУгодиIsDisplayedCorrectly(arg0);
    }

    @Then("^Замовлення document is displayed$")
    public void замовленняDocumentIsDisplayed() {
        endUserSteps.замовленняDocumentIsDisplayed();
    }

    @When("^click on the Замовлення document$")
    public void clickOnTheЗамовленняDocument() {
        endUserSteps.clickOnTheЗамовленняDocument();
    }

    @When("^Замовлення document is opened in OnlyOffice$")
    public void замовленняDocumentIsOpenedInOnlyOffice() {
        endUserSteps.замовленняDocumentIsOpenedInOnlyOffice();
    }

    @Then("^\"([^\"]*)\" Дата завершення робіт is displayed correctly$")
    public void датаЗавершенняРобітIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаЗавершенняРобітIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" Дата передачі результатів роботи is displayed correctly$")
    public void датаПередачіРезультатівРоботиIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаПередачіРезультатівРоботиIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" Дата початку виконання робіт is displayed correctly$")
    public void датаПочаткуВиконанняРобітIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаПочаткуВиконанняРобітIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" Дата укладення замовлення is displayed correctly$")
    public void датаУкладенняЗамовленняIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаУкладенняЗамовленняIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" Вартість замовлення is displayed correctly$")
    public void вартістьЗамовленняIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.вартістьЗамовленняIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" document version for Договір підряду document is presented$")
    public void documentVersionForДоговірПідрядуDocumentIsPresented(String arg0) throws Throwable {
        endUserSteps.documentVersionForДоговірПідрядуDocumentIsPresented(arg0);
    }

    @Then("^\"([^\"]*)\" document version for Додаток комерційна таємниця document is presented$")
    public void documentVersionForДодатокКомерційнаТаємницяDocumentIsPresented(String arg0) throws Throwable {
        endUserSteps.documentVersionForДодатокКомерційнаТаємницяDocumentIsPresented(arg0);
    }

    @Then("^\"([^\"]*)\" document version for Замовлення document is presented$")
    public void documentVersionForЗамовленняDocumentIsPresented(String arg0) throws Throwable {
        endUserSteps.documentVersionForЗамовленняDocumentIsPresented(arg0);
    }

    @When("^click Regenerate icon near the \"([^\"]*)\" document$")
    public void clickRegenerateIconNearTheDocument(String arg0) throws Throwable {
        endUserSteps.clickRegenerateIconNearTheDocument(arg0);
    }

    @Then("^Regenerate Document pop-up is appeared$")
    public void regenerateDocumentPopUpIsAppeared() {
        endUserSteps.regenerateDocumentPopUpIsAppeared();
    }

    @Then("^\"([^\"]*)\" Contract Date for Договір підряду document is displayed correctly$")
    public void contractDateForДоговірПідрядуDocumentIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.contractDateForДоговірПідрядуDocumentIsDisplayedCorrectly(arg0);
    }

    @Then("^\"([^\"]*)\" Дата укладення замовлення for Замовлення document is displayed correctly$")
    public void датаУкладенняЗамовленняForЗамовленняDocumentIsDisplayedCorrectly(String arg0) throws Throwable {
        endUserSteps.датаУкладенняЗамовленняForЗамовленняDocumentIsDisplayedCorrectly(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Contract Date field in the Regenerate Document pop-up$")
    public void enterInTheContractDateFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheContractDateFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата закінчення договору field in the Regenerate Document pop-up$")
    public void enterInTheДатаЗакінченняДоговоруFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаЗакінченняДоговоруFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @When("^click on Generate button in the Regenerate Document pop-up$")
    public void clickOnGenerateButtonInTheRegenerateDocumentPopUp() {
        endUserSteps.clickOnGenerateButtonInTheRegenerateDocumentPopUp();
    }

    @Then("^\"([^\"]*)\" Contract Date in the message is displayed in the pop-up$")
    public void contractDateInTheMessageIsDisplayedInThePopUp(String arg0) throws Throwable {
        endUserSteps.contractDateInTheMessageIsDisplayedInThePopUp(arg0);
    }

    @Then("^appropriate message for Договір підряду is displayed$")
    public void appropriateMessageForДоговірПідрядуIsDisplayed() {
        endUserSteps.appropriateMessageForДоговірПідрядуIsDisplayed();
    }

    @Then("^Договір підряду document is regenerated$")
    public void договірПідрядуDocumentIsRegenerated() {
        endUserSteps.договірПідрядуDocumentIsRegenerated();
    }

    @When("^click second Regenerate icon near the \"([^\"]*)\" document$")
    public void clickSecondRegenerateIconNearTheDocument(String arg0) throws Throwable {
        endUserSteps.clickSecondRegenerateIconNearTheDocument(arg0);
    }

    @Then("^checkbox is preselected on the Update current document$")
    public void checkboxIsPreselectedOnTheUpdateCurrentDocument() {
        endUserSteps.checkboxIsPreselectedOnTheUpdateCurrentDocument();
    }

    @When("^switch to second tab$")
    public void switchToSecondTab() {
        endUserSteps.switchToSecondTab();
    }

    @When("^switch to first tab$")
    public void switchToFirstTab() {
        endUserSteps.switchToFirstTab();
    }

    @When("^enter \"([^\"]*)\" in the Дата укладення угоди field in the Regenerate Document pop-up$")
    public void enterInTheДатаУкладенняУгодиFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаУкладенняУгодиFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @Then("^appropriate message for Додаток комерційна таємниця is displayed$")
    public void appropriateMessageForДодатокКомерційнаТаємницяIsDisplayed() {
        endUserSteps.appropriateMessageForДодатокКомерційнаТаємницяIsDisplayed();
    }

    @Then("^Додаток комерційна таємниця is regenerated$")
    public void додатокКомерційнаТаємницяIsRegenerated() {
        endUserSteps.додатокКомерційнаТаємницяIsRegenerated();
    }

    @When("^click third Regenerate icon near the \"([^\"]*)\" document$")
    public void clickThirdRegenerateIconNearTheDocument(String arg0) throws Throwable {
        endUserSteps.clickThirdRegenerateIconNearTheDocument(arg0);
    }

    @When("^clear data in the Вартість замовлення field in the Regenerate Document pop-up$")
    public void clearDataInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp() {
        endUserSteps.clearDataInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp();
    }

    @When("^enter \"([^\"]*)\" in the Вартість замовлення field in the Regenerate Document pop-up$")
    public void enterInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата укладення замовлення field in the Regenerate Document pop-up$")
    public void enterInTheДатаУкладенняЗамовленняFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаУкладенняЗамовленняFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата завершення робіт field in the Regenerate Document pop-up$")
    public void enterInTheДатаЗавершенняРобітFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаЗавершенняРобітFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата передачі результатів роботи field in the Regenerate Document pop-up$")
    public void enterInTheДатаПередачіРезультатівРоботиFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаПередачіРезультатівРоботиFieldInTheRegenerateDocumentPopUp(arg0);
    }

    @When("^enter \"([^\"]*)\" in the Дата початку виконання робіт field in the Regenerate Document pop-up$")
    public void enterInTheДатаПочаткуВиконанняРобітFieldInTheRegenerateDocumentPopUp(String arg0) throws Throwable {
        endUserSteps.enterInTheДатаПочаткуВиконанняРобітFieldInTheRegenerateDocumentPopUp(arg0);
    }
}
