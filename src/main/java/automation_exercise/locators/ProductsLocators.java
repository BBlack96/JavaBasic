package automation_exercise.locators;

import org.openqa.selenium.By;

public enum ProductsLocators {
    PRODUCTS_LIST(By.xpath("//div[@class='features_items']")),
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
    CONTINUE_SHOPPING_BUTTON(By.xpath("//button[text()='Continue Shopping']")),
    VIEW_CART_LINK(By.xpath("//div[@id='cartModal']//a")),
    PRODUCT_LINK(By.xpath("//div[contains(@class, 'productinfo')]/p[text()='%s']/../a")),
    PRODUCT_QUANTITY(By.id("quantity")),
    ADD_TO_CART_BUTTON(By.xpath("//div[@class='product-information']//button")),
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

