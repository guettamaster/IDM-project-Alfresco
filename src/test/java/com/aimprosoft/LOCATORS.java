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
    String CONTRACTOR_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_entities.contractor']";
    String OPTION_ITEM_FROM_THE_CONTRACTOR_DROP_DOWN_MENU = "//select[@id='template_x002e_section1_x002e_employee-documents_x0023_default_entities.contractor'][@name='entities.contractor']//option[.='Флайтех']";
    String CONTRACT_DATE_FIELD = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.contract.startDate-ctrl-date']";
    String ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.commencementWork.endDate-ctrl-date']";
    String ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.contract.endDate-ctrl-date']";
    String ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.workResults.transferDate-ctrl-date']";
    String ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.commencementWork.startDate-ctrl-date']";
    String ДАТА_УКЛАДАННЯ_УГОДИ = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.agreement.startDate-ctrl-date']";
    String ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.order.startDate-ctrl-date']";
    String ВАРТІСТЬ_ЗАМОВЛЕННЯ = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_field.orderCost.number']";
    String ARCHIVE_PREVIOUS_VERSION_S = "//input[@id='template_x002e_section1_x002e_employee-documents_x0023_default_isArchivingEnabled-entry'][@class='checkbox-align ']";
    String GENERATE_BUTTON = "(//button[.='Generate'])[2]";
    String ДОГОВІР_ПІДРЯДУ_DOCUMENT = "//tr[@class='yui-dt-rec yui-dt-first yui-dt-even']//a[contains(text(),'Договір підряду №')][contains(text(),'від')][contains(text(),'ФОП')][contains(text(),'.docx')]";
    String CONTRACT_DATE_FOR_ДОГОВІР_ПІДРЯДУ_DOCUMENT = "//tr[@class='yui-dt-rec yui-dt-first yui-dt-even']//a[contains(text(),'$1')]";
    String DOCUMENT_VERSION_FOR_ДОГОВІР_ПІДРЯДУ_DOCUMENT = "//a[@target='_blank'][contains(text(),'Договір підряду')]//ancestor::h3[@class='name']/span[@class='document-version'][contains(text(),'$1')]";
    String ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT = "//tr[contains(@class,\"yui-dt-rec yui-dt-odd\")]//a[contains(text(),'Додаток комерційна таємниця ФОП ')][contains(text(),'.docx')]";
    String DOCUMENT_VERSION_FOR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT = "//a[@target='_blank'][contains(text(),'Додаток комерційна таємниця')]//ancestor::h3[@class='name']/span[@class='document-version'][contains(text(),'$1')]";
    String ЗАМОВЛЕННЯ_DOCUMENT = "//tr[@class='yui-dt-rec yui-dt-last yui-dt-even']//a[contains(text(),'Замовлення ФОП ')][contains(text(),' від ')][contains(text(),'.docx')]";
    String ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FOR_ЗАМОВЛЕННЯ_DOCUMENT = "//tr[@class='yui-dt-rec yui-dt-last yui-dt-even']//a[contains(text(),'$1')]";
    String DOCUMENT_VERSION_FOR_ЗАМОВЛЕННЯ_DOCUMENT = "//a[@target='_blank'][contains(text(),'Замовлення')]//ancestor::h3[@class='name']/span[@class='document-version'][contains(text(),'$1')]";
    String DOCUMENT_S_GENERATED_SUCESSFULLY = "//div[@class='bd'][contains(text(),'3 document(s) generated successfully')]";
    String OK_BUTTON_IN_THE_POPUP = "//button[@type='button'][contains(text(),'OK')]";
    String ARCHIVE_PREVIOUS_DOCUMENT_VERSION_S_TITLE = "//div[@class='hd'][contains(text(),'Archive previous document version(s)')]";
    String CONTRACT_DATE_IN_ONLYOFFICE = "//span[@class='viewmode-value viewmode-value-date'][contains(text(),'$1')]";
    String ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Дата закінчення договору:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String ДАТА_УКЛАДАННЯ_УГОДИ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Дата укладення угоди:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String ДАТА_ЗАВЕРШЕННЯ_РОБІТ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Дата завершення робіт:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Дата передачі результатів роботи:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Дата початку виконання робіт:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Дата укладення замовлення:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String ВАРТІСТЬ_ЗАМОВЛЕННЯ_IN_ONLYOFFICE = "//span[@class='viewmode-label'][contains(text(),'Вартість замовлення:')]//ancestor::div[@class='document-fields-list']/span[@class='viewmode-value'][contains(text(),'$1')]";
    String REGENERATE_ICON_NEAR_ДОГОВІР_ПІДРЯДУ_DOCUMENT = "//h3[@class='name']/a[@target='_blank'][contains(text(),'$1')]//ancestor::tr[@class='yui-dt-rec yui-dt-first yui-dt-even']//a[@title='Regenerate'][contains(text(),'Regenerate')]";
    String REGENERATE_ICON_NEAR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_DOCUMENT = "//h3[@class='name']/a[@target='_blank'][contains(text(),'$1')]//ancestor::tr[@class='yui-dt-rec yui-dt-odd']//a[@title='Regenerate'][contains(text(),'Regenerate')]";
    String REGENERATE_ICON_NEAR_ЗАМОВЛЕННЯ_DOCUMENT = "//h3[@class='name']/a[@target='_blank'][contains(text(),'$1')]//ancestor::tr[@class='yui-dt-rec yui-dt-last yui-dt-even']//a[@title='Regenerate'][contains(text(),'Regenerate')]";
    String REGENERATE_DOCUMENT_TITLE_IN_THE_POPUP = "//div[@class='hd'][contains(text(),'Regenerate Document')]";
    String CONTRACT_DATE_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.contract.startDate-ctrl-date']";
    String ДАТА_ЗАКІНЧЕННЯ_ДОГОВОРУ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.contract.endDate-ctrl-date']";
    String GENERATE_BUTTON_IN_THE_REGENERATE_DOCUMENT_POPUP = "(//button[.='Generate'])[1]";
    String CONTRACT_DATE_INSIDE_THE_ДОГОВІР_ПІДРЯДУ_MESSAGE_IN_THE_POPUP = "//div[@class='bd'][contains(text(),'$1')]";
    String APPROPRIATE_MESSAGE_FOR_ДОГОВІР_ПІДРЯДУ_IN_THE_POPUP = "//div[@class='bd'][contains(text(),'Договір підряду №')][contains(text(),' від ')][contains(text(),' ФОП ')][contains(text(),'.docx updated successfully')]";
    String UPDATE_CURRENT_DOCUMENT_PRESELECTED_CHECKBOX = "//label[@class='label-align'][contains(text(),'Update current document')]//ancestor::span[@class='span-align regenerate-radio-span']//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_isUpdate_true']";
    String ДАТА_УКЛАДАННЯ_УГОДИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.agreement.startDate-ctrl-date']";
    String APPROPRIATE_MESSAGE_FOR_ДОДАТОК_КОМЕРЦІЙНА_ТАЄМНИЦЯ_IN_THE_POPUP = "//div[@class='bd'][contains(text(),'Додаток комерційна таємниця ФОП ')][contains(text(),'.docx updated successfully')]";
    String ВАРТІСТЬ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.orderCost.number']";
    String ДАТА_УКЛАДАННЯ_ЗАМОВЛЕННЯ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.order.startDate-ctrl-date']";
    String ДАТА_ЗАВЕРШЕННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.commencementWork.endDate-ctrl-date']";
    String ДАТА_ПЕРЕДАЧІ_РЕЗУЛЬТАТІВ_РОБОТИ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.workResults.transferDate-ctrl-date']";
    String ДАТА_ПОЧАТКУ_ВИКОНАННЯ_РОБІТ_FIELD_IN_THE_REGENERATE_DOCUMENT_POPUP = "//input[@id='template_x002e_section2_x002e_employee-documents_x0023_default_field.commencementWork.startDate-ctrl-date']";
    String APPROPRIATE_MESSAGE_FOR_ЗАМОВЛЕННЯ_IN_THE_POPUP = "//div[@class='bd'][contains(text(),'Замовлення ФОП')][contains(text(),' від ')][contains(text(),'.docx updated successfully')]";
    String MARK_AS_SIGNED_ICON_NEAR_ДОГОВІР_ПІДРЯДУ_DOCUMENT = "//h3[@class='name']/a[@target='_blank'][contains(text(),'$1')]//ancestor::tr[@class='yui-dt-rec yui-dt-first yui-dt-even']//a[@title='Mark as signed'][contains(text(),'Mark as signed')]";
    String MARK_DOCUMENT_AS_SIGNED_TITLE_IN_THE_POPUP = "//div[@class='hd'][contains(text(),'Mark document as signed')]";

}