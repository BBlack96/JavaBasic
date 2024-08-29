package automation_exercise.locators;

import org.openqa.selenium.By;

public enum HomeLocators {
    LOGO(By.xpath("//div[contains(@class, 'logo ')]")),
    PRODUCTS_BUTTON(By.xpath("//a[text()=' Products']")),
    CART_BUTTON(By.xpath("//a[text()=' Cart']")),
    LOGIN_BUTTON(By.xpath("//a[contains(text(), 'Login')]")),
    CONTACT_US_BUTTON(By.xpath("//a[contains(text(), 'Contact')]")),
    LOGGED_USER_FIELD(By.xpath("//i[contains(@class, 'fa fa-user')]/..")),
    DELETE_ACCOUNT_BUTTON(By.xpath("//a[text()=' Delete Account']")),
    ACCOUNT_DELETED_MESSAGE(By.xpath("//h2/b[text()='Account Deleted!']")),
    LOGOUT_BUTTON(By.xpath("//a[text()=' Logout']")),
    TEST_CASES_BUTTON(By.xpath("//a[text()=' Test Cases']")),
    FOOTER_SUBSCRIPTION_TITLE(By.xpath("//footer//h2")),
    SUBSCRIBE_EMAIL_INPUT(By.id("susbscribe_email")),
    SUBSCRIBE_BUTTON(By.id("subscribe")),
    SUCCESS_SUBSCRIPTION_MESSAGE(By.id("success-subscribe")),
    RECOMMENDED_PRODUCTS_TITLE(By.xpath("//div[@class='recommended_items']/h2")),
    RECOMMENDED_PRODUCT_ADD_TO_CART(By.xpath("//div[@id='recommended-item-carousel']//div[@class='item active']//a[text()='Add to cart']")),
    RECOMMENDED_PRODUCTS_NAMES(By.xpath("//div[@id='recommended-item-carousel']//div[@class='item active']//p")),
    ;

    private final By locator;

    HomeLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }



}
