package automation_exercise.locators;

import org.openqa.selenium.By;

public enum ProductsLocators {
    PRODUCTS_LIST(By.xpath("//div[@class='features_items']")),
    SINGLE_PRODUCT_VIEW_BUTTON(By.xpath("//a[text()='View Product']")),
    PRODUCT_NAME(By.xpath("//div[@class='product-information']/h2")),
    PRODUCT_CATEGORY(By.xpath("//div[@class='product-information']/p[contains(text(), 'Category')]")),
    PRODUCT_PRICE(By.xpath("//div[@class='product-information']/span/span")),
    PRODUCT_AVAILABILITY(By.xpath("//div[@class='product-information']//b[text()='Availability:']")),
    PRODUCT_CONDITION(By.xpath("//div[@class='product-information']//b[text()='Condition:']")),
    PRODUCT_BRAND(By.xpath("//div[@class='product-information']//b[text()='Brand:']")),
    ;

    private final By locator;

    ProductsLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
