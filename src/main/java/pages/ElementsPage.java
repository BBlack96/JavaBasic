package pages;

import locators.ElementsPageLocators;

public class ElementsPage extends BasePage {
    final String pageUrl = "https://demoqa.com/elements";

    public void openPage() {
        open(pageUrl);
    }

    public void openTextBoxTab() {
        $((ElementsPageLocators.ElementsMainPage.TEXT_BOX.getLocator())).click();
    }

    public void openCheckBoxTab() {
        $((ElementsPageLocators.ElementsMainPage.CHECK_BOX.getLocator())).click();
    }

    public void openRadioButtonTab() {
        $((ElementsPageLocators.ElementsMainPage.RADIO_BUTTON.getLocator())).click();
    }

    public void openWebTablesTab() {
        $((ElementsPageLocators.ElementsMainPage.WEB_TABLES.getLocator())).click();
    }

    public void openButtonsTab() {
        $((ElementsPageLocators.ElementsMainPage.BUTTONS.getLocator())).click();
    }

    public void openLinksTab() {
        $((ElementsPageLocators.ElementsMainPage.LINKS.getLocator())).click();
    }

    public void openBrokenLinksTab() {
        $((ElementsPageLocators.ElementsMainPage.BROKEN_LINKS.getLocator())).click();
    }

    public void openUploadDownloadTab() {
        $((ElementsPageLocators.ElementsMainPage.UPLOAD_DOWNLOAD.getLocator())).click();
    }

    public void openDynamicPropertiesTab() {
        $((ElementsPageLocators.ElementsMainPage.DYNAMIC_PROPERTIES.getLocator())).click();
    }

    public void setFullName(String fullName) {
        $((ElementsPageLocators.TextBoxPage.FULL_NAME_INPUT.getLocator())).setValue(fullName);
    }

    public void clickCheckBox(){
        $(ElementsPageLocators.CheckBoxPage.CHECKBOX.getLocator()).click();
    }

}
