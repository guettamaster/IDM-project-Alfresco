package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://aim-dms.aimprosoft.com/share/page/")

public class SignInPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(SignInPage.class);

    public void loginAsuser() {
        String email = "o.ivankovckyi";
        //admin
        String password = "15028819";
        //!t52p6FYy
        logger.info("Entering email: " + email + " and password: " + password);
        $(LOCATORS.USER_NAME_FIELD).sendKeys(email);
        $(LOCATORS.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickOnLoginButton() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SIGNIN_BUTTON)));
        $(LOCATORS.SIGNIN_BUTTON).click();
    }

    public boolean homePageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.HOME_PAGE_LINK)));
        return $(LOCATORS.HOME_PAGE_LINK).isPresent();
    }

    public boolean userNameIsDisplayed(String arg0) {
        return $(LOCATORS.USER_NAME_AFTER_AUTHORIZATION.replace("$1", arg0)).isPresent();
    }

    public void loginAsadmin() {
        String email = "admin";
        String password = "!t52p6FYy";
        logger.info("Entering email: " + email + " and password: " + password);
        $(LOCATORS.USER_NAME_FIELD).sendKeys(email);
        $(LOCATORS.PASSWORD_FIELD).sendKeys(password);
    }
}