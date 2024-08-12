package demo_qa.locators;

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

    public enum RadioButtonPage {
        YES_RADIO_BUTTON(By.xpath("//label[@for='yesRadio']")),
        IMPRESSIVE_RADIO_BUTTON(By.xpath("//label[@for='impressiveRadio']")),
        NO_RADIO_BUTTON(By.xpath("//label[@for='noRadio']")),
        RADIO_BUTTON_OUTPUT(By.xpath("//p[@class='mt-3']"));

        private final By locator;

        RadioButtonPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum WebTablesPage {
        ADD_BUTTON(By.id("addNewRecordButton")),
        SEARCH_BOX(By.id("searchBox")),
        TABLE(By.xpath("//div[@role='grid']")),
        ;

        private final By locator;

        WebTablesPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum ButtonsPage {
        DOUBLE_CLICK_BUTTON(By.id("doubleClickBtn")),
        RIGHT_CLICK_BUTTON(By.id("rightClickBtn")),
        CLICK_ME_BUTTON(By.id("doubleClickBtn")),
        DOUBLE_CLICK_MESSAGE(By.id("doubleClickMessage")),
        RIGHT_CLICK_MESSAGE(By.id("rightClickMessage")),
        CLICK_ME_MESSAGE(By.id("dynamicClickMessage"));

        private final By locator;

        ButtonsPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum LinksPage {
        HOME_LINK(By.id("simpleLink")),
        HOMEX_ENIX_LINK(By.id("dynamicLink")),
        ;

        private final By locator;

        LinksPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum BrokenLinksImagesPage {
        VALID_IMAGE(By.xpath("//div[@class='row']//img[@src='/images/Toolsqa.jpg']")),
        BROKEN_IMAGE(By.xpath("//div[@class='row']//img[@src='/images/Toolsqa_1.jpg']")),
        VALID_LINK(By.xpath("//a[text()='Click Here for Valid Link']")),
        BROKEN_LINK(By.xpath("//a[text()='Click Here for Broken Link']"));

        private final By locator;

        BrokenLinksImagesPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum UploadDownloadPage {
        UPLOAD_BUTTON(By.id("uploadFile")),
        DOWNLOAD_BUTTON(By.id("downloadButton")),
        ;

        private final By locator;

        UploadDownloadPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum DynamicPropertiesPage {
        COLOR_CHANGE_BUTTON(By.id("colorChange")),
        ENABLE_AFTER_BUTTON(By.id("enableAfter")),
        VISIBLE_AFTER_BUTTON(By.id("visibleAfter")),
        ;

        private final By locator;

        DynamicPropertiesPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
}