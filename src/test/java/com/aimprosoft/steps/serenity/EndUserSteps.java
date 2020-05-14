package com.aimprosoft.steps.serenity;

import com.aimprosoft.pages.GroupPage;
import com.aimprosoft.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    SignInPage signinPage;
    GroupPage groupPage;

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
}