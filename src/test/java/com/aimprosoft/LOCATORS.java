package com.aimprosoft;

import org.yecht.Data;

public interface LOCATORS {


//TODO======================================================SignInPage========================================================

    String USER_NAME_FIELD = "//input[@placeholder='User Name']";
    String PASSWORD_FIELD = "//input[@placeholder='Password']";
    String SIGNIN_BUTTON = "//button[.='Sign In']";

//TODO======================================================HomePage==========================================================

    String HOME_PAGE_LINK = "//a[.='Home']";
    String USER_NAME_AFTER_AUTHORIZATION = "//span[@data-dojo-attach-point][.='$1']";
    String ADMIN_TOOLS_LINK = "//a[@class='alfresco-navigation-_HtmlAnchorMixin'][contains(text(),'$1')]";
    String USER_MENU = "//div[@class='alf-menu-groups alf-header-menu-bar'][@aria-labelledby='HEADER_USER_MENU_POPUP_text']";
    String MY_PROFLE_LINK = "//a[@class='alfresco-navigation-_HtmlAnchorMixin'][contains(text(),'My Profile')]";

//TODO======================================================AdminToolsPage====================================================

    String ADMIN_TOOLS_TITLE = "//span[@class='alfresco-header-Title__text has-max-width'][contains(text(),'$1')]";
    String GROUPS_LINK = "//a[@title='Group Management'][contains(text(),'$1')]";
    String GROUPS_TITLE = "//label[@for='page_x002e_ctool_x002e_admin-console_x0023_default-search-text'][contains(text(),'$1')]";
    String SEARCH_FIELD = "//input[@id='page_x002e_ctool_x002e_admin-console_x0023_default-search-text']";
    String BROWSE_BUTTON = "//button[.='Browse']";
    String GROUP_NAME_IN_THE_TABLE = "//span[@class='yui-columnbrowser-item-label'][contains(text(),'$1')]";
    String GROUP_USERS_BLOCK = "//li[@class='yui-carousel-item yui-columnbrowser-column']";
    String ADD_USER_ICON = "//span[@title='Add User']";
    String ADD_USER_TITLE_IN_POPUP = "//span[contains(text(),'Add User')]";
    String SEARCH_FOR_USERS_FIELD = "//input[@id='page_x002e_ctool_x002e_admin-console_x0023_default-search-peoplefinder-search-text']";
    String SEARCH_BUTTON = "//button[@id='page_x002e_ctool_x002e_admin-console_x0023_default-search-peoplefinder-search-button-button'][.='Search']";
    String USER_NAME_IN_THE_ADD_USER_POPUP = "//span[@class='lighter'][contains(text(),'$1')]";
    String ADD_BUTTON = "//button[.='Add ']";
    String TEMPORARY_MESSAGE = "//span[contains(text(),'$1')]";
    String ADDED_USER_NAME = "//span[@class='yui-columnbrowser-item-label'][contains(text(),'$1')]";
    String REMOVE_ICON_NEAR_USER_NAME = "//span[@class='yui-columnbrowser-item-label'][contains(text(),'$1')]//ancestor::a//span[@title='Remove User']";
    String REMOVE_USER_FROM_GROUP_TITLE_IN_POPUP = "//div[contains(text(),'Remove User from Group')]";
    String YES_BUTTON_IN_THE_REMOVE_USER_FROM_GROUP_POPUP = "//button[.='Yes']";

//TODO======================================================UserProfilePage===================================================

    String USER_PROFILE_PAGE_TITLE = "//span[@class='alfresco-header-Title__text has-max-width'][contains(text(),'User Profile Page')]";
    String LINK_ON_THE_PROFILE_PAGE = "//a[contains(@id,'template_x002e_toolbar_x002e_user-profile_x0023_default')][contains(text(),'$1')]";
    String PAGE_ON_THE_PROFILE_PAGE = "//span[@class='alfresco-header-Title__text has-max-width'][contains(text(),'$1')]";
    String GENERATE_DOCUMENTS_TITLE = "//div[@class='header-bar'][contains(text(),'Generate Documents')]";
    String GENERATED_DOCUMENTS_TITLE = "//div[@class='header-bar'][contains(text(),'Generated Documents')]";
    String TYPE_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_templateType'][@class='generate-documents-select']";
    String OPTION_ITEM_FROM_THE_TYPE_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_templateType'][@class='generate-documents-select']//option[.='Пакет документов']";
    String TEMPLATE_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_template']";
    String OPTION_ITEM_FROM_THE_TEMPLATE_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_template'][@class='generate-documents-select']//option[.='Договір Підряду (фінальна версія)']";
    String DOCUMENTS_WILL_BE_CREATED_TITLE = "//span[@class='label span-align'][contains(text(),'Documents will be created')]";
    String GENERATE_BUTTON = "(//button[.='Generate'])[2]";
    String CONTRACTOR_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_entities.contractor']";
    String OPTION_ITEM_FROM_THE_CONTRACTOR_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_entities.contractor'][@name='entities.contractor']//option[.='Флайтех']";
    String CONTRACT_DATE_FIELD = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.contract.startDate-ctrl-date']";
    String ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.commencementWork.endDate-ctrl-date']";
    String ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.contract.endDate-ctrl-date']";
    String ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ = "";
    String ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ = "";
    String ДАТА_УКЛАДАННЯ_УГОДИ = "";
    String ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ = "";
    String ВАРТІСТЬ_ЗАМОВЛЕННЯ = "";

}