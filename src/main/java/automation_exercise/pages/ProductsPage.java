package automation_exercise.pages;

import automation_exercise.locators.ProductsLocators;

public class ProductsPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/products/";

    public ProductsPage openPage() {
        open(pageUrl);
        return this;
    }

    public ProductsPage checkTitle() {
        checkPageTitle("Automation Exercise - All Products");
        return this;
    }

    public ProductsPage checkProductDetailsTitle() {
        checkPageTitle("Automation Exercise - Product Details");
        return this;
    }

    public ProductsPage productsListIsVisible() {
        isVisible(ProductsLocators.PRODUCTS_LIST.getLocator());
        return this;
    }

    public ProductsPage clickSingleProductViewButton(int productIndex) {
        $$(ProductsLocators.SINGLE_PRODUCT_VIEW_BUTTON.getLocator()).get(productIndex).click();
        return this;
    }

    public ProductsPage productNameIsVisible() {
        isVisible(ProductsLocators.PRODUCT_NAME.getLocator());
        return this;
    }

    public ProductsPage productCategoryIsVisible() {
        isVisible(ProductsLocators.PRODUCT_CATEGORY.getLocator());
        return this;
    }

    public ProductsPage productPriceIsVisible() {
        isVisible(ProductsLocators.PRODUCT_PRICE.getLocator());
        return this;
    }

    public ProductsPage productAvailabilityIsVisible() {
        isVisible(ProductsLocators.PRODUCT_AVAILABILITY.getLocator());
        return this;
    }

    public ProductsPage productConditionIsVisible() {
        isVisible(ProductsLocators.PRODUCT_CONDITION.getLocator());
        return this;
    }

    public ProductsPage productBrandIsVisible() {
        isVisible(ProductsLocators.PRODUCT_BRAND.getLocator());
        return this;
    }

    public ProductsPage searchProduct(String productName) {
        $(ProductsLocators.SEARCH_INPUT.getLocator()).setValue(productName);
        $(ProductsLocators.SEARCH_BUTTON.getLocator()).click();
        return this;
    }

    public ProductsPage checkSearchedProductsTitle() {
        isVisible(ProductsLocators.SEARCHED_PRODUCTS_TITLE.getLocator());
        return this;
    }

    public ProductsPage searchResultsAreVisible() {
        isVisible(ProductsLocators.SEARCH_RESULT_PRODUCT_NAME.getLocator());
        return this;
    }

    public  ProductsPage checkSearchResultProductName(String productName) {
        checkText(ProductsLocators.SEARCH_RESULT_PRODUCT_NAME.getLocator(), productName);
        return this;
    }


}
