package automation_exercise.pages;

import automation_exercise.locators.CartLocators;

import java.util.List;

public class CartPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/view_cart";

    public CartPage openPage() {
        open(pageUrl);
        return this;
    }
    public CartPage checkFooterSubscriptionTitle() {
        checkText(CartLocators.FOOTER_SUBSCRIPTION_TITLE.getLocator(), "Subscription");
        return this;
    }

    public CartPage deleteProductFromCart(String productName) {
        $(CartLocators.DELETE_PRODUCT_BUTTON.getLocator(productName)).click();
        return this;
    }

    public CartPage enterEmailForSubscription(String email) {
        $(CartLocators.SUBSCRIBE_EMAIL_INPUT.getLocator()).setValue(email);
        $(CartLocators.SUBSCRIBE_BUTTON.getLocator()).click();
        return this;
    }

    public CartPage checkProductIsDeletedFromCart(String productName) {
        isNotVisible(CartLocators.PRODUCT_NAME_IN_CART.getLocator(productName));
        return this;
    }

    public CartPage checkSubscriptionSuccessMessage() {
        checkText(CartLocators.SUCCESS_SUBSCRIPTION_MESSAGE.getLocator(), "You have been successfully subscribed!");
        return this;
    }

    public CartPage checkProductInCart(String productName) {
        isVisible(CartLocators.PRODUCT_NAME_IN_CART.getLocator(productName));
        return this;
    }

    public CartPage checkProductQuantityInCart(String productName, String quantity) {
        checkText(CartLocators.PRODUCT_QUANTITY_IN_CART.getLocator(productName), quantity);
        return this;
    }

    public CartPage clickProceedToCheckoutButton() {
        $(CartLocators.PROCEED_TO_CHECKOUT_BUTTON.getLocator()).click();
        return this;
    }

    public CartPage clickRegisterLoginLink() {
        $(CartLocators.REGISTER_LOGIN_LINK.getLocator()).click();
        return this;
    }
    public CartPage verifyAddressDetailsTitle() {
        isVisible(CartLocators.ADDRESS_DETAILS_TITLE.getLocator());
        return this;
    }

    public CartPage verifyReviewOrderTitle() {
        isVisible(CartLocators.REVIEW_ORDER_TITLE.getLocator());
        return this;
    }

    public CartPage setOrderMessage(String message) {
        $(CartLocators.ORDER_MESSAGE.getLocator()).setValue(message);
        return this;
    }

    public CartPage clickPlaceOrderButton() {
        $(CartLocators.PLACE_ORDER_BUTTON.getLocator()).click();
        return this;
    }

    public CartPage enterPaymentDetails(String nameOnCard, String cardNumber, String cvc, String expiryMonth, String expiryYear) {
        $(CartLocators.NAME_ON_CARD_INPUT.getLocator()).setValue(nameOnCard);
        $(CartLocators.CARD_NUMBER_INPUT.getLocator()).setValue(cardNumber);
        $(CartLocators.CVC_INPUT.getLocator()).setValue(cvc);
        $(CartLocators.EXPIRY_MONTH_INPUT.getLocator()).setValue(expiryMonth);
        $(CartLocators.EXPIRY_YEAR_INPUT.getLocator()).setValue(expiryYear);
        return this;
    }

    public CartPage clickConfirmOrderButton() {
        $(CartLocators.CONFIRM_ORDER_BUTTON.getLocator()).click();
        return this;
    }

    public CartPage checkOrderPlacedMessage() {
        isVisible(CartLocators.ORDER_PLACED_MESSAGE.getLocator());
        return this;
    }

    public CartPage checkProductsInCart(String productName) {
        areVisible(CartLocators.PRODUCTS_NAMES_IN_CART.getLocator(productName));
        return this;
    }

    public CartPage checkProductsInCart(List<String> productNames) {
        for (String product : productNames) {
            isVisible(CartLocators.PRODUCT_NAME_IN_CART.getLocator(product));
        }
        return this;
    }


}
