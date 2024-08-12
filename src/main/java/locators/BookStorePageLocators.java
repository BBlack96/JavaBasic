package locators;

import org.openqa.selenium.By;

public class BookStorePageLocators {

    public enum LoginPage {

        USER_NAME_INPUT(By.id("userName")),
        PASSWORD_INPUT(By.id("password")),
        LOGIN_BUTTON(By.id("login")),
        NEW_USER_BUTTON(By.id("newUser")),
        NEW_USER_FIRST_NAME_INPUT(By.id("firstname")),
        NEW_USER_LAST_NAME_INPUT(By.id("lastname")),
        NEW_USER_USERNAME_INPUT(By.id("userName")),
        NEW_USER_PASSWORD_INPUT(By.id("password")),
        REGISTER_BUTTON(By.id("register")),
        ;

        private final By locator;

        LoginPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum BookStorePage {
        LOGIN_BUTTON(By.id("login")),
        SEARCH_BOX(By.id("searchBox")),
        BOOKS_NAMES(By.xpath("//div[@class='action-buttons']")),
        ;

        private final By locator;

        BookStorePage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
}
