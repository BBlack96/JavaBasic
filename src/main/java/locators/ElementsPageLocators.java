package locators;

import org.openqa.selenium.By;

public class ElementsPageLocators {

    public enum ElementsMainPage {
        TEXT_BOX(By.xpath("//ul//span[text()='Text Box']")),
        CHECK_BOX(By.xpath("//ul//span[text()='Check Box']")),
        RADIO_BUTTON(By.xpath("//ul//span[text()='Radio Button']")),
        WEB_TABLES(By.xpath("//ul//span[text()='Web Tables']")),
        BUTTONS(By.xpath("//ul//span[text()='Buttons']")),
        LINKS(By.xpath("//ul//span[text()='Links']")),
        BROKEN_LINKS(By.xpath("//ul//span[text()='Broken Links - Images']")),
        UPLOAD_DOWNLOAD(By.xpath("//ul//span[text()='Upload and Download']")),
        DYNAMIC_PROPERTIES(By.xpath("//ul//span[text()='Dynamic Properties']"));

        private final By locator;

        ElementsMainPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum TextBoxPage {
        FULL_NAME_INPUT(By.id("userName")),
        EMAIL_INPUT(By.cssSelector("#userEmail")),
        CURRENT_ADDRESS_INPUT(By.cssSelector("#currentAddress")),
        PERMANENT_ADDRESS_INPUT(By.cssSelector("#permanentAddress")),
        SUBMIT_BUTTON(By.cssSelector("#submit")),
        NAME_OUTPUT(By.cssSelector("#name")),
        EMAIL_OUTPUT(By.cssSelector("#email")),
        CURRENT_ADDRESS_OUTPUT(By.cssSelector("#currentAddress")),
        PERMANENT_ADDRESS_OUTPUT(By.cssSelector("#permanentAddress"));

        private final By locator;

        TextBoxPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum CheckBoxPage {
        ACCORDION(By.xpath("//button[@title='Toggle']")),
        CHECKBOX(By.xpath("//span[@class='rct-checkbox']")),
        EXPAND_ALL_BUTTON(By.xpath("//button[@title='Expand all']")),
        COLLAPSE_ALL_BUTTON(By.xpath("//button[@title='Collapse all']")),
        TREE_ELEMENTS(By.xpath("//div[@class='check-box-tree-wrapper']")),

        ;

        private final By locator;

        CheckBoxPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
}