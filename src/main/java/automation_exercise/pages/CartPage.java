package automation_exercise.pages;

import automation_exercise.locators.CartLocators;
import io.qameta.allure.Step;

import java.util.List;

public class CartPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/view_cart";

    public CartPage openPage() {
        open(pageUrl);
        return this;
    }

    @Step("Check if Cart page is opened")
    public CartPage checkFooterSubscriptionTitle() {
        checkText(CartLocators.FOOTER_SUBSCRIPTION_TITLE.getLocator(), "Subscription");
        return this;
    }

    @Step("Delete product {productName} from cart")
    public CartPage deleteProductFromCart(String productName) {
        $(CartLocators.DELETE_PRODUCT_BUTTON.getLocator(productName)).click();
        return this;
    }

    @Step("Enter email {email} for subscription")
    public CartPage enterEmailForSubscription(String email) {
        $(CartLocators.SUBSCRIBE_EMAIL_INPUT.getLocator()).setValue(email);
        $(CartLocators.SUBSCRIBE_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Product {productName} is deleted from cart")
    public CartPage checkProductIsDeletedFromCart(String productName) {
        isNotVisible(CartLocators.PRODUCT_NAME_IN_CART.getLocator(productName));
        return this;
    }

    @Step("Check if subscription success message is displayed")
    public CartPage checkSubscriptionSuccessMessage() {
        checkText(
                CartLocators.SUCCESS_SUBSCRIPTION_MESSAGE.getLocator(),
                "You have been successfully subscribed!");
        return this;
    }

    @Step("Check {productName} is in cart")
    public CartPage checkProductInCart(String productName) {
        isVisible(CartLocators.PRODUCT_NAME_IN_CART.getLocator(productName));
        return this;
    }

    @Step("Check product {productName} in cart and its price: {price}")
    public CartPage checkProductQuantityInCart(String productName, String quantity) {
        checkText(CartLocators.PRODUCT_QUANTITY_IN_CART.getLocator(productName), quantity);
        return this;
    }

    @Step("Click Proceed to Checkout button")
    public CartPage clickProceedToCheckoutButton() {
        $(CartLocators.PROCEED_TO_CHECKOUT_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Click Register/Login link")
    public CartPage clickRegisterLoginLink() {
        $(CartLocators.REGISTER_LOGIN_LINK.getLocator()).click();
        return this;
    }

    @Step("Verify Address Details title")
    public CartPage verifyAddressDetailsTitle() {
        isVisible(CartLocators.ADDRESS_DETAILS_TITLE.getLocator());
        return this;
    }

    @Step("Verify Review Order title")
    public CartPage verifyReviewOrderTitle() {
        isVisible(CartLocators.REVIEW_ORDER_TITLE.getLocator());
        return this;
    }

    @Step("Add order message: {message}")
    public CartPage setOrderMessage(String message) {
        $(CartLocators.ORDER_MESSAGE.getLocator()).setValue(message);
        return this;
    }

    @Step("Click Place Order button")
    public CartPage clickPlaceOrderButton() {
        $(CartLocators.PLACE_ORDER_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Enter payment details")
    public CartPage enterPaymentDetails(
            String nameOnCard, String cardNumber, String cvc, String expiryMonth, String expiryYear) {
        $(CartLocators.NAME_ON_CARD_INPUT.getLocator()).setValue(nameOnCard);
        $(CartLocators.CARD_NUMBER_INPUT.getLocator()).setValue(cardNumber);
        $(CartLocators.CVC_INPUT.getLocator()).setValue(cvc);
        $(CartLocators.EXPIRY_MONTH_INPUT.getLocator()).setValue(expiryMonth);
        $(CartLocators.EXPIRY_YEAR_INPUT.getLocator()).setValue(expiryYear);
        return this;
    }

    @Step("Click Confirm Order button")
    public CartPage clickConfirmOrderButton() {
        $(CartLocators.CONFIRM_ORDER_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if order placed message is displayed")
    public CartPage checkOrderPlacedMessage() {
        isVisible(CartLocators.ORDER_PLACED_MESSAGE.getLocator());
        return this;
    }

    @Step("Check product: {productName} in cart")
    public CartPage checkProductsInCart(String productName) {
        areVisible(CartLocators.PRODUCTS_NAMES_IN_CART.getLocator(productName));
        return this;
    }

    @Step("Check products: {productsNames} in cart")
    public CartPage checkProductsInCart(List<String> productNames) {
        for (String product : productNames) {
            isVisible(CartLocators.PRODUCT_NAME_IN_CART.getLocator(product));
        }
        return this;
    }

    @Step("Verify Delivery Address is: {name}")
    public CartPage verifyDeliveryAddress(String name) {
        checkText(CartLocators.DELIVERY_DESTINATION_TITLE.getLocator(), name);
        return this;
    }

    @Step("Verify Billing Address is: {name}")
    public CartPage verifyBillingAddress(String name) {
        checkText(CartLocators.DELIVERY_DESTINATION_TITLE.getLocator(), name);
        return this;
    }

    @Step("Download invoice")
    public CartPage downloadAndCheckInvoice() {
        $(CartLocators.DOWNLOAD_INVOICE_LINK.getLocator()).click();
        return this;
    }
}
