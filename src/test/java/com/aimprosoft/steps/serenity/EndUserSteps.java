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
}