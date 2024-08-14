package automation_exercise.locators;

import org.openqa.selenium.By;

public enum HomeLocators {
    LOGO(By.xpath("//div[contains(@class, 'logo ')]")),
    PRODUCTS_BUTTON(By.xpath("//a[text()=' Products']")),
    CART_BUTTON(By.xpath("//a[text()=' Cart']")),
    LOGIN_BUTTON(By.xpath("//a[contains(text(), 'Login')]")),
    CONTACT_US_BUTTON(By.xpath("//a[contains(text(), 'Contact')]")),
    ;

    private final By locator;

    HomeLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }



}
