package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import cucumber.api.java.bs.A;
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

public class DocumentPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(GroupPage.class);

    public void clickOnTheUserName(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.USER_NAME_AFTER_AUTHORIZATION.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.USER_NAME_AFTER_AUTHORIZATION.replace("$1", arg0)));
    }

    public boolean userMenuIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.USER_MENU)));
        return $(LOCATORS.USER_MENU).isPresent();
    }

    public void clickMyProfileLink() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.MY_PROFLE_LINK));
    }

    public boolean userProfilePageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.USER_PROFILE_PAGE_TITLE)));
        return $(LOCATORS.USER_PROFILE_PAGE_TITLE).isPresent();
    }

    public void clickTheLink(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.LINK_ON_THE_PROFILE_PAGE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.LINK_ON_THE_PROFILE_PAGE.replace("$1", arg0)));
    }

    public boolean pageIsOpened(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.PAGE_ON_THE_PROFILE_PAGE.replace("$1", arg0))));
        return $(LOCATORS.PAGE_ON_THE_PROFILE_PAGE.replace("$1", arg0)).isPresent();
    }

    public boolean generateDocumentsBlockIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.GENERATE_DOCUMENTS_TITLE)));
        return $(LOCATORS.GENERATE_DOCUMENTS_TITLE).isPresent();
    }

    public boolean generatedDocumentsBlockIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.GENERATED_DOCUMENTS_TITLE)));
        return $(LOCATORS.GENERATED_DOCUMENTS_TITLE).isPresent();
    }

    public void clickOnTheTypeDropDownMenu() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.TYPE_DROP_DOWN_MENU)));
        actions.click().build().perform();
    }

    public void chooseTheПакетДокументовItem() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.OPTION_ITEM_FROM_THE_TYPE_DROP_DOWN_MENU)));
        $(LOCATORS.OPTION_ITEM_FROM_THE_TYPE_DROP_DOWN_MENU).click();
    }

    public void clickOnTheTemplateDropDownMenu() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.TEMPLATE_DROP_DOWN_MENU)));
        actions.click().build().perform();
    }

    public void chooseTheДоговірПідрядуФінальнаВерсіяItem() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.OPTION_ITEM_FROM_THE_TEMPLATE_DROP_DOWN_MENU)));
        $(LOCATORS.OPTION_ITEM_FROM_THE_TEMPLATE_DROP_DOWN_MENU).click();
    }

    public boolean documentsWillBeCreatedSectionIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.DOCUMENTS_WILL_BE_CREATED_TITLE)));
        return $(LOCATORS.DOCUMENTS_WILL_BE_CREATED_TITLE).isPresent();
    }

    public void clickOnTheContractorDropDownMenu() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.CONTRACTOR_DROP_DOWN_MENU)));
        actions.click().build().perform();
    }

    public void chooseTheФлайтехItem() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.OPTION_ITEM_FROM_THE_CONTRACTOR_DROP_DOWN_MENU)));
        $(LOCATORS.OPTION_ITEM_FROM_THE_CONTRACTOR_DROP_DOWN_MENU).click();
    }

    public void enterInTheContractDateField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.CONTRACT_DATE_FIELD.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.CONTRACT_DATE_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаЗавершенняРобітField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаЗакінченняДоговоруField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаПередачіРезультатівРоботиField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаПочаткуВиконанняРобітField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаУкладенняУгодиField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаУкладенняЗамовленняField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheВартістьЗамовленняField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnGenerateButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.GENERATE_BUTTON));
    }

    public void chooseArchivePreviousVersionSCheckbox() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ARCHIVE_PREVIOUS_VERSION_S));
    }

    public boolean договірПідрядуDocumentIsGenerated() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT)));
        return $(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT).isPresent();
    }

    public boolean додатокКомерційнаТаємницяIsGenerated() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT)));
        return $(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT).isPresent();
    }

    public boolean замовленняIsGenerated() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT)));
        return $(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT).isPresent();
    }

    public boolean documentSGeneratedSuccessfullyMessageInThePopUpIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.DOCUMENT_S_GENERATED_SUCESSFULLY)));
        return $(LOCATORS.DOCUMENT_S_GENERATED_SUCESSFULLY).isPresent();
    }

    public void clickOKButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.OK_BUTTON_IN_THE_POPUP));
    }

    public boolean archivePreviousDocumentVersionSPopUpIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ARCHIVE_PREVIOUS_DOCUMENT_VERSION_S_TITLE)));
        return $(LOCATORS.ARCHIVE_PREVIOUS_DOCUMENT_VERSION_S_TITLE).isPresent();
    }

    public boolean договірПідрядуDocumentIsDisplayed() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT)));
        return $(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT).isPresent();
    }

    public void clickOnTheДоговірПідрядуDocument() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT));
    }

    public void договірПідрядуDocumentIsOpenedInOnlyOffice() {
        getDriver().get("http://aim-dms.aimprosoft.com/share/page/document-details?nodeRef=workspace://SpacesStore/b8faec3d-94a4-48ac-9127-6404b10581e4");
    }

    public boolean датаЗакінченняДоговоруIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean contractDateIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.CONTRACT_DATE_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.CONTRACT_DATE_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean додатокКомерційнаТаємницяDocumentIsDisplayed() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT)));
        return $(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT).isPresent();
    }

    public void clickOnTheДодатокКомерційнаТаємницяDocument() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT));
    }

    public void додатокКомерційнаТаємницяDocumentIsOpenedInOnlyOffice() {
        getDriver().get("http://aim-dms.aimprosoft.com/share/page/document-details?nodeRef=workspace://SpacesStore/099b3b3e-8062-44de-8062-2c183ffba8c0");
    }

    public boolean датаУкладенняУгодиIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }
}
