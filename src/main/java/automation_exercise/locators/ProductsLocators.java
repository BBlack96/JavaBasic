package automation_exercise.locators;

import org.openqa.selenium.By;

public enum ProductsLocators {
    SINGLE_PRODUCT_VIEW_BUTTON(By.xpath("//a[text()='View Product']")),
    SINGLE_PRODUCT_ADD_TO_CART_BUTTON(By.xpath("//a[text()='Add to cart']")),
    PRODUCT_NAME(By.xpath("//div[@class='product-information']/h2")),
    PRODUCT_CATEGORY(By.xpath("//div[@class='product-information']/p[contains(text(), 'Category')]")),
    PRODUCT_PRICE(By.xpath("//div[@class='product-information']/span/span")),
    PRODUCT_AVAILABILITY(By.xpath("//div[@class='product-information']//b[text()='Availability:']")),
    PRODUCT_CONDITION(By.xpath("//div[@class='product-information']//b[text()='Condition:']")),
    PRODUCT_BRAND(By.xpath("//div[@class='product-information']//b[text()='Brand:']")),
    SEARCH_INPUT(By.id("search_product")),
    SEARCH_BUTTON(By.id("submit_search")),
    SEARCHED_PRODUCTS_TITLE(By.xpath("//div[@class='features_items']/h2")),
    SEARCH_RESULT_PRODUCT_NAME(By.xpath("//div[contains(@class, 'productinfo')]/p")),
    PRODUCTS_NAMES(By.xpath("//div[contains(@class, 'productinfo')]//p[contains(text(), '%s')]")),
    ;

    private final By locator;

    ProductsLocators(By locator) {
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

