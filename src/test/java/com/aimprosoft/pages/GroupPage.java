package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://aim-dms.aimprosoft.com/share/page/")

public class GroupPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(GroupPage.class);


    public void clickOnTheLinkAtTheHeader(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ADMIN_TOOLS_LINK.replace("$1", arg0)));
    }

    public boolean pageIsDisplayed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.ADMIN_TOOLS_TITLE.replace("$1", arg0))));
        return $(LOCATORS.ADMIN_TOOLS_TITLE.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheLinkInTheLeftPanel(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.GROUPS_LINK.replace("$1", arg0)));
    }

    public boolean subPageIsDisplayed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.GROUPS_TITLE.replace("$1", arg0))));
        return $(LOCATORS.GROUPS_TITLE.replace("$1", arg0)).isPresent();
    }

    public boolean searchFieldIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.SEARCH_FIELD)));
        return $(LOCATORS.SEARCH_FIELD).isPresent();
    }

    public void enterInTheSearchField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.SEARCH_FIELD.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.SEARCH_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnTheBrowseButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.BROWSE_BUTTON));
    }

    public boolean groupIsDisplayedInTheTable(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.GROUP_NAME_IN_THE_TABLE.replace("$1", arg0))));
        return $(LOCATORS.GROUP_NAME_IN_THE_TABLE.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheGroup(String arg0) {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.GROUP_NAME_IN_THE_TABLE.replace("$1", arg0)));
    }

    public boolean usersBlockIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.GROUP_USERS_BLOCK)));
        return $(LOCATORS.GROUP_USERS_BLOCK).isPresent();
    }

    public void clickOnTheAddUserIcon() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ADD_USER_ICON));
    }

    public boolean addUserPopUpIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ADD_USER_TITLE_IN_POPUP)));
        return $(LOCATORS.ADD_USER_TITLE_IN_POPUP).isPresent();
    }

    public void enterInTheSearchForUsersField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.SEARCH_FOR_USERS_FIELD.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.SEARCH_FOR_USERS_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnTheSearchButton() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.SEARCH_FOR_USERS_FIELD));


//        withTimeoutOf(5, TimeUnit.SECONDS);
//        evaluateJavascript("arguments[0].click();", $(LOCATORS.SEARCH_FOR_USERS_FIELD));
    }

    public boolean userNameIsDisplayedInTheAddUserPopUp(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_ADD_USER_POPUP.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_ADD_USER_POPUP.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheAddButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ADD_BUTTON));
    }

    public boolean messageIsDisplayed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.TEMPORARY_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.TEMPORARY_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void waitMessageIsClosed() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(org.openqa.selenium.By.xpath("//div[@id=\"message_mask\"]")));
    }
}