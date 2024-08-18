package automation_exercise.pages;

import automation_exercise.locators.CartLocators;

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

    public CartPage enterEmailForSubscription(String email) {
        $(CartLocators.SUBSCRIBE_EMAIL_INPUT.getLocator()).setValue(email);
        $(CartLocators.SUBSCRIBE_BUTTON.getLocator()).click();
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

}
