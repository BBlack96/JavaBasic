package automation_exercise.pages;

import automation_exercise.locators.ProductsLocators;
import automation_exercise.locators.CommonLocators;
import com.codeborne.selenide.SelenideElement;

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
        isVisible(CommonLocators.PRODUCT_LIST.getLocator());
        return this;
    }

    public ProductsPage clickProductViewButtonByIndex(int productIndex) {
        $$(ProductsLocators.SINGLE_PRODUCT_VIEW_BUTTON.getLocator()).get(productIndex-1).click();
        return this;
    }

    public ProductsPage addProductToCartByIndex(int productIndex) {
        $$(ProductsLocators.SINGLE_PRODUCT_ADD_TO_CART_BUTTON.getLocator()).get(productIndex-1).click();
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

    public ProductsPage clickContinueShoppingButton() {
        $(CommonLocators.CONTINUE_SHOPPING_BUTTON.getLocator()).click();
        return this;
    }

    public ProductsPage clickViewCartLink() {
        $(CommonLocators.VIEW_CART_LINK.getLocator()).click();
        return this;
    }

    public ProductsPage addProductByName(String productName) {
        $(CommonLocators.PRODUCT_LINK.getLocator(productName)).click();
        return this;
    }

    public ProductsPage setProductQuantity(int quantity) {
        $(CommonLocators.PRODUCT_QUANTITY.getLocator()).clear();
        $(CommonLocators.PRODUCT_QUANTITY.getLocator()).setValue(String.valueOf(quantity));
        return this;
    }

    public ProductsPage addProductToCart() {
        $(CommonLocators.ADD_TO_CART_BUTTON.getLocator()).click();
        return this;
    }

    public ProductsPage checkBrandsIsVisible(){
        isVisible(CommonLocators.BRANDS_LIST.getLocator());
        return this;
    }

    public ProductsPage clickPoloBrand(){
        $(CommonLocators.POLO_BRAND.getLocator()).click();
        return this;
    }

    public ProductsPage clickHimBrand(){
        $(CommonLocators.HIM_BRAND.getLocator()).click();
        return this;
    }

    public ProductsPage areSearchedProductsVisible(String searchRequest){
        areVisible(ProductsLocators.PRODUCTS_NAMES.getLocator(searchRequest));
        return this;
    }

    public ProductsPage addSearchedProductsToCart(){
        for (SelenideElement selenideElement : $$((CommonLocators.ALL_ADD_TO_CART.getLocator()))) {
            selenideElement.click();
            clickContinueShoppingButton();
        }
        return this;
    }

    public ProductsPage checkWriteYourReviewTitleOnProductPage() {
        isVisible(CommonLocators.WRITE_YOUR_REVIEW_TITLE_ON_PRODUCT_PAGE.getLocator());
        return this;
    }

    public ProductsPage fillReviewForm(String name, String email, String message) {
        $(CommonLocators.REVIEW_NAME_INPUT.getLocator()).setValue(name);
        $(CommonLocators.REVIEW_EMAIL_INPUT.getLocator()).setValue(email);
        $(CommonLocators.REVIEW_MESSAGE_INPUT.getLocator()).setValue(message);
        return this;
    }

    public ProductsPage submitReview() {
        $(CommonLocators.SUBMIT_REVIEW_BUTTON.getLocator()).click();
        return this;
    }

    public ProductsPage checkReviewSuccessAlert() {
        isVisible(CommonLocators.SUCCESS_REVIEW_ALERT.getLocator());
        return this;
    }



}
