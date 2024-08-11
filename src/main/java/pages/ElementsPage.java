package pages;

import locators.ElementsPageLocators;

public class ElementsPage extends BasePage {
    final String pageUrl = "https://demoqa.com/elements";

    public void openPage() {
        open(pageUrl);
    }

    public void clickTextBox() {
        $((ElementsPageLocators.ElementsMainPage.TEXT_BOX.getLocator())).click();
    }

    public void clickCheckBox() {
        $((ElementsPageLocators.ElementsMainPage.CHECK_BOX.getLocator())).click();
    }

    public void clickRadioButton() {
        $((ElementsPageLocators.ElementsMainPage.RADIO_BUTTON.getLocator())).click();
    }

    public void clickWebTables() {
        $((ElementsPageLocators.ElementsMainPage.WEB_TABLES.getLocator())).click();
    }

    public void clickButtons() {
        $((ElementsPageLocators.ElementsMainPage.BUTTONS.getLocator())).click();
    }

    public void clickLinks() {
        $((ElementsPageLocators.ElementsMainPage.LINKS.getLocator())).click();
    }

    public void clickBrokenLinks() {
        $((ElementsPageLocators.ElementsMainPage.BROKEN_LINKS.getLocator())).click();
    }

    public void clickUploadDownload() {
        $((ElementsPageLocators.ElementsMainPage.UPLOAD_DOWNLOAD.getLocator())).click();
    }

    public void clickDynamicProperties() {
        $((ElementsPageLocators.ElementsMainPage.DYNAMIC_PROPERTIES.getLocator())).click();
    }

    public void setFullName(String fullName) {
        $((ElementsPageLocators.TextBoxPage.FULL_NAME_INPUT.getLocator())).setValue(fullName);
    }

}
