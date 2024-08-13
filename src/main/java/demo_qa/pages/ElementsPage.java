package demo_qa.pages;

import demo_qa.locators.ElementsPageLocators;

public class ElementsPage extends BasePage {
    final String pageUrl = "https://demoqa.com/elements";

    public ElementsPage openPage() {
        open(pageUrl);
        return this;
    }

    public ElementsPage openTextBoxTab() {
        $((ElementsPageLocators.ElementsMainPage.TEXT_BOX.getLocator())).click();
        return this;
    }

    public ElementsPage openCheckBoxTab() {
        $((ElementsPageLocators.ElementsMainPage.CHECK_BOX.getLocator())).click();
        return this;
    }

    public ElementsPage openRadioButtonTab() {
        $((ElementsPageLocators.ElementsMainPage.RADIO_BUTTON.getLocator())).click();
        return this;
    }

    public ElementsPage openWebTablesTab() {
        $((ElementsPageLocators.ElementsMainPage.WEB_TABLES.getLocator())).click();
        return this;
    }

    public ElementsPage openButtonsTab() {
        $((ElementsPageLocators.ElementsMainPage.BUTTONS.getLocator())).click();
        return this;
    }

    public ElementsPage openLinksTab() {
        $((ElementsPageLocators.ElementsMainPage.LINKS.getLocator())).click();
        return this;
    }

    public ElementsPage openBrokenLinksTab() {
        $((ElementsPageLocators.ElementsMainPage.BROKEN_LINKS.getLocator())).click();
        return this;
    }

    public ElementsPage openUploadDownloadTab() {
        $((ElementsPageLocators.ElementsMainPage.UPLOAD_DOWNLOAD.getLocator())).click();
        return this;
    }

    public ElementsPage openDynamicPropertiesTab() {
        $((ElementsPageLocators.ElementsMainPage.DYNAMIC_PROPERTIES.getLocator())).click();
        return this;
    }

    public ElementsPage setFullName(String fullName) {
        $((ElementsPageLocators.TextBoxPage.FULL_NAME_INPUT.getLocator())).setValue(fullName);
        return this;
    }

    public ElementsPage clickCheckBox(){
        $(ElementsPageLocators.CheckBoxPage.CHECKBOX.getLocator()).click();
        return this;
    }

}
