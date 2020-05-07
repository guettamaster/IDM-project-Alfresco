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

//    @Then("^\"([^\"]*)\" sub-page is displayed$")
//    public void subPageIsDisplayed(String arg0) throws Throwable {
//        endUserSteps.subPageIsDisplayed(arg0);
//    }
}
