package com.aimprosoft.steps.serenity;

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
}