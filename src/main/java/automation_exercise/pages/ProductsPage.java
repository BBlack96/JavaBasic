package automation_exercise.pages;

import automation_exercise.locators.CommonLocators;
import automation_exercise.locators.ProductsLocators;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class ProductsPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/products/";

    @Step("Open the Products page")
    public ProductsPage openPage() {
        open(pageUrl);
        return this;
    }

    @Step("Check the page title is 'Automation Exercise - All Products'")
    public ProductsPage checkTitle() {
        checkPageTitle("Automation Exercise - All Products");
        return this;
    }

    @Step("Check the page title is 'Automation Exercise - Product Details'")
    public ProductsPage checkProductDetailsTitle() {
        checkPageTitle("Automation Exercise - Product Details");
        return this;
    }

    @Step("Check if the product list is visible")
    public ProductsPage productsListIsVisible() {
        isVisible(CommonLocators.PRODUCT_LIST.getLocator());
        return this;
    }

    @Step("Click on the view button of the product at index {productIndex}")
    public ProductsPage clickProductViewButtonByIndex(int productIndex) {
        $$(ProductsLocators.SINGLE_PRODUCT_VIEW_BUTTON.getLocator()).get(productIndex - 1).click();
        return this;
    }

    @Step("Add product at index {productIndex} to the cart")
    public ProductsPage addProductToCartByIndex(int productIndex) {
        $$(ProductsLocators.SINGLE_PRODUCT_ADD_TO_CART_BUTTON.getLocator())
                .get(productIndex - 1)
                .click();
        return this;
    }

    @Step("Check if the product name is visible")
    public ProductsPage productNameIsVisible() {
        isVisible(ProductsLocators.PRODUCT_NAME.getLocator());
        return this;
    }

    @Step("Check if the product category is visible")
    public ProductsPage productCategoryIsVisible() {
        isVisible(ProductsLocators.PRODUCT_CATEGORY.getLocator());
        return this;
    }

    @Step("Check if the product price is visible")
    public ProductsPage productPriceIsVisible() {
        isVisible(ProductsLocators.PRODUCT_PRICE.getLocator());
        return this;
    }

    @Step("Check if the product availability is visible")
    public ProductsPage productAvailabilityIsVisible() {
        isVisible(ProductsLocators.PRODUCT_AVAILABILITY.getLocator());
        return this;
    }

    @Step("Check if the product condition is visible")
    public ProductsPage productConditionIsVisible() {
        isVisible(ProductsLocators.PRODUCT_CONDITION.getLocator());
        return this;
    }

    @Step("Check if the product brand is visible")
    public ProductsPage productBrandIsVisible() {
        isVisible(ProductsLocators.PRODUCT_BRAND.getLocator());
        return this;
    }

    @Step("Search for product: {productName}")
    public ProductsPage searchProduct(String productName) {
        $(ProductsLocators.SEARCH_INPUT.getLocator()).setValue(productName);
        $(ProductsLocators.SEARCH_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if the searched products title is visible")
    public ProductsPage checkSearchedProductsTitle() {
        isVisible(ProductsLocators.SEARCHED_PRODUCTS_TITLE.getLocator());
        return this;
    }

    @Step("Check if the search results are visible")
    public ProductsPage searchResultsAreVisible() {
        isVisible(ProductsLocators.SEARCH_RESULT_PRODUCT_NAME.getLocator());
        return this;
    }

    @Step("Check if the search result product name is {productName}")
    public ProductsPage checkSearchResultProductName(String productName) {
        checkText(ProductsLocators.SEARCH_RESULT_PRODUCT_NAME.getLocator(), productName);
        return this;
    }

    @Step("Click on the 'Continue Shopping' button")
    public ProductsPage clickContinueShoppingButton() {
        $(CommonLocators.CONTINUE_SHOPPING_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Click on the 'View Cart' link")
    public ProductsPage clickViewCartLink() {
        $(CommonLocators.VIEW_CART_LINK.getLocator()).click();
        return this;
    }

    @Step("Add product with name {productName} to the cart")
    public ProductsPage addProductByName(String productName) {
        $(CommonLocators.PRODUCT_LINK.getLocator(productName)).click();
        return this;
    }

    @Step("Set product quantity to {quantity}")
    public ProductsPage setProductQuantity(int quantity) {
        $(CommonLocators.PRODUCT_QUANTITY.getLocator()).clear();
        $(CommonLocators.PRODUCT_QUANTITY.getLocator()).setValue(String.valueOf(quantity));
        return this;
    }

    @Step("Add the product to the cart")
    public ProductsPage addProductToCart() {
        $(CommonLocators.ADD_TO_CART_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if the brands list is visible")
    public ProductsPage checkBrandsIsVisible() {
        isVisible(CommonLocators.BRANDS_LIST.getLocator());
        return this;
    }

    @Step("Click on the 'Polo' brand")
    public ProductsPage clickPoloBrand() {
        $(CommonLocators.POLO_BRAND.getLocator()).click();
        return this;
    }

    @Step("Click on the 'Him' brand")
    public ProductsPage clickHimBrand() {
        $(CommonLocators.HIM_BRAND.getLocator()).click();
        return this;
    }

    @Step("Check if the searched products for {searchRequest} are visible")
    public ProductsPage areSearchedProductsVisible(String searchRequest) {
        areVisible(ProductsLocators.PRODUCTS_NAMES.getLocator(searchRequest));
        return this;
    }

    @Step("Add all searched products to the cart")
    public ProductsPage addSearchedProductsToCart() {
        for (SelenideElement selenideElement : $$((CommonLocators.ALL_ADD_TO_CART.getLocator()))) {
            selenideElement.click();
            clickContinueShoppingButton();
        }
        return this;
    }

    @Step("Check if the 'Write Your Review' title is visible on the product page")
    public ProductsPage checkWriteYourReviewTitleOnProductPage() {
        isVisible(CommonLocators.WRITE_YOUR_REVIEW_TITLE_ON_PRODUCT_PAGE.getLocator());
        return this;
    }

    @Step("Fill the review form with name: {name}, email: {email}, and message: {message}")
    public ProductsPage fillReviewForm(String name, String email, String message) {
        $(CommonLocators.REVIEW_NAME_INPUT.getLocator()).setValue(name);
        $(CommonLocators.REVIEW_EMAIL_INPUT.getLocator()).setValue(email);
        $(CommonLocators.REVIEW_MESSAGE_INPUT.getLocator()).setValue(message);
        return this;
    }

    @Step("Submit the review")
    public ProductsPage submitReview() {
        $(CommonLocators.SUBMIT_REVIEW_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if the review success alert is visible")
    public ProductsPage checkReviewSuccessAlert() {
        isVisible(CommonLocators.SUCCESS_REVIEW_ALERT.getLocator());
        return this;
    }
}
