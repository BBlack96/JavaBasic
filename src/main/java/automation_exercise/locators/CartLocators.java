package automation_exercise.locators;

import org.openqa.selenium.By;

public enum CartLocators {
    FOOTER_SUBSCRIPTION_TITLE(By.xpath("//footer//h2")),
    SUBSCRIBE_EMAIL_INPUT(By.id("susbscribe_email")),
    SUBSCRIBE_BUTTON(By.id("subscribe")),
    SUCCESS_SUBSCRIPTION_MESSAGE(By.id("success-subscribe")),
    PRODUCT_IN_CART(By.xpath("//tbody/tr")),
    PRODUCT_NAME_IN_CART(By.xpath("//tbody/tr//a[text()='%s']")),
    ;

    private final By locator;

    CartLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

    public By getLocator(String productName) {
        String xpath = String.format(locator.toString().replace("By.xpath: ", ""), productName);
        return By.xpath(xpath);
    }
}
