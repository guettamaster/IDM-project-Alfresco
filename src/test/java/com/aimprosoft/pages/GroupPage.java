package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
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
        waitABit(10000);
    }

    public boolean subPageIsDisplayed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.GROUPS_TITLE.replace("$1", arg0))));
        return $(LOCATORS.GROUPS_TITLE.replace("$1", arg0)).isPresent();
    }

    public boolean searchFieldIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.SEARCH_FIELD)));
        return $(LOCATORS.SEARCH_FIELD).isPresent();
    }
}