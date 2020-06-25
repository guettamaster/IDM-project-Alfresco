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

import java.util.ArrayList;
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
        getDriver().get("http://aim-dms.aimprosoft.com/share/page/document-details?nodeRef=workspace://SpacesStore/399fdb6c-5942-4d3b-a9d6-7cb909f92f30");
    }

    public boolean датаЗакінченняДоговоруIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean contractDateIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.CONTRACT_DATE_IN_ONLYOFFICE.replace("$1", arg0))));
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
        getDriver().get("http://aim-dms.aimprosoft.com/share/page/document-details?nodeRef=workspace://SpacesStore/09619bd4-d347-4134-a2e0-e64101f3c671");
    }

    public boolean датаУкладенняУгодиIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean замовленняDocumentIsDisplayed() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT)));
        return $(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT).isPresent();
    }

    public void clickOnTheЗамовленняDocument() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT));
    }

    public void замовленняDocumentIsOpenedInOnlyOffice() {
        getDriver().get("http://aim-dms.aimprosoft.com/share/page/document-details?nodeRef=workspace://SpacesStore/f06f9e2a-ec43-4b24-a8f7-5205e8b7da31");
    }

    public boolean датаЗавершенняРобітIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean датаПередачіРезультатівРоботиIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean датаПочаткуВиконанняРобітIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean датаУкладенняЗамовленняIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean вартістьЗамовленняIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ_IN_ONLYOFFICE.replace("$1", arg0))));
        return $(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ_IN_ONLYOFFICE.replace("$1", arg0)).isPresent();
    }

    public boolean documentVersionForДоговірПідрядуDocumentIsPresented(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.DOCUMENT_VERSION_FOR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0))));
        return $(LOCATORS.DOCUMENT_VERSION_FOR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0)).isPresent();
    }

    public boolean documentVersionForДодатокКомерційнаТаємницяDocumentIsPresented(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.DOCUMENT_VERSION_FOR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT.replace("$1", arg0))));
        return $(LOCATORS.DOCUMENT_VERSION_FOR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT.replace("$1", arg0)).isPresent();
    }

    public boolean documentVersionForЗамовленняDocumentIsPresented(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.DOCUMENT_VERSION_FOR_ЗАМОВЛЕННЯ_DOCUMENT.replace("$1", arg0))));
        return $(LOCATORS.DOCUMENT_VERSION_FOR_ЗАМОВЛЕННЯ_DOCUMENT.replace("$1", arg0)).isPresent();
    }

    public void clickRegenerateIconNearTheDocument(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.REGENERATE_ICON_NEAR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.REGENERATE_ICON_NEAR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0)));
    }

    public boolean regenerateDocumentPopUpIsAppeared() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.REGENERATE_DOCUMENT_TITLE_IN_THE_POPUP)));
        return $(LOCATORS.REGENERATE_DOCUMENT_TITLE_IN_THE_POPUP).isPresent();
    }

    public boolean contractDateForДоговірПідрядуDocumentIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.CONTRACT_DATE_FOR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0))));
        return $(LOCATORS.CONTRACT_DATE_FOR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0)).isPresent();
    }

    public boolean датаУкладенняЗамовленняForЗамовленняDocumentIsDisplayedCorrectly(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FOR_ЗАМОВЛЕННЯ_DOCUMENT.replace("$1", arg0))));
        return $(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FOR_ЗАМОВЛЕННЯ_DOCUMENT.replace("$1", arg0)).isPresent();
    }

    public void enterInTheContractDateFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.CONTRACT_DATE_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.CONTRACT_DATE_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаЗакінченняДоговоруFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnGenerateButtonInTheRegenerateDocumentPopUp() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.GENERATE_BUTTON_IN_THE_REGENERATE_DOCUMENT_POPUP));
    }

    public boolean contractDateInTheMessageIsDisplayedInThePopUp(String arg0) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.CONTRACT_DATE_INSIDE_THE_ДОГОВІР_ПІДРЯДУ_MESSAGE_IN_THE_POPUP.replace("$1", arg0))));
        return $(LOCATORS.CONTRACT_DATE_INSIDE_THE_ДОГОВІР_ПІДРЯДУ_MESSAGE_IN_THE_POPUP.replace("$1", arg0)).isPresent();
    }

    public boolean appropriateMessageForДоговірПідрядуIsDisplayed() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.APPROPRIATE_MESSAGE_FOR_ДОГОВІР_ПІДРЯДУ_IN_THE_POPUP)));
        return $(LOCATORS.APPROPRIATE_MESSAGE_FOR_ДОГОВІР_ПІДРЯДУ_IN_THE_POPUP).isPresent();
    }

    public boolean договірПідрядуDocumentIsRegenerated() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT)));
        return $(LOCATORS.ДОГОВІР_ПІДРЯДУ_DOCUMENT).isPresent();
    }

    public void clickSecondRegenerateIconNearTheDocument(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.REGENERATE_ICON_NEAR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.REGENERATE_ICON_NEAR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT.replace("$1", arg0)));
    }

    public boolean checkboxIsPreselectedOnTheUpdateCurrentDocument() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.UPDATE_CURRENT_DOCUMENT_PRESELECTED_CHECKBOX)));
        return $(LOCATORS.UPDATE_CURRENT_DOCUMENT_PRESELECTED_CHECKBOX).isPresent();

    }

    public void switchToSecondTab() {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }

    public void switchToFirstTab() {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(0));
    }

    public boolean elementIsVisible(String xpath) {
        try {
            waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                    (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean elementIsVisible(int waitSec, String xpath) {
        try {
            withTimeoutOf(waitSec, TimeUnit.SECONDS)
                    .waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy
                            (By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void enterInTheДатаУкладенняУгодиFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_УГОДИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public boolean appropriateMessageForДодатокКомерційнаТаємницяIsDisplayed() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.APPROPRIATE_MESSAGE_FOR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_IN_THE_POPUP)));
        return $(LOCATORS.APPROPRIATE_MESSAGE_FOR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_IN_THE_POPUP).isPresent();
    }

    public boolean додатокКомерційнаТаємницяIsRegenerated() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT)));
        return $(LOCATORS.ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT).isPresent();
    }

    public void clickThirdRegenerateIconNearTheDocument(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.REGENERATE_ICON_NEAR_ЗАМОВЛЕННЯ_DOCUMENT.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.REGENERATE_ICON_NEAR_ЗАМОВЛЕННЯ_DOCUMENT.replace("$1", arg0)));
    }

    public void clearDataInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp() {
        $(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP).clear();
    }

    public void enterInTheВартістьЗамовленняFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ВАРТІСТЬ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаУкладенняЗамовленняFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаЗавершенняРобітFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаПередачіРезультатівРоботиFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public void enterInTheДатаПочаткуВиконанняРобітFieldInTheRegenerateDocumentPopUp(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public boolean appropriateMessageForЗамовленняIsDisplayed() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.APPROPRIATE_MESSAGE_FOR_ЗАМОВЛЕННЯ_IN_THE_POPUP)));
        return $(LOCATORS.APPROPRIATE_MESSAGE_FOR_ЗАМОВЛЕННЯ_IN_THE_POPUP).isPresent();
    }

    public boolean замовленняIsRegenerated() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT)));
        return $(LOCATORS.ЗАМОВЛЕННЯ_DOCUMENT).isPresent();
    }

    public void clickMarkAsSignedIconNearTheDocument(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.MARK_AS_SIGNED_ICON_NEAR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.MARK_AS_SIGNED_ICON_NEAR_ДОГОВІР_ПІДРЯДУ_DOCUMENT.replace("$1", arg0)));
        waitABit(5000);
    }
}
