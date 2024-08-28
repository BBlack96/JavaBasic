package automation_exercise.pages;

import automation_exercise.locators.HomeLocators;

public class HomePage extends BasePage {

    final String pageUrl = "https://www.automationexercise.com/";

    public HomePage openPage() {
        open(pageUrl);
        return this;
    }

    public HomePage clickProductsButton() {
        $(HomeLocators.PRODUCTS_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage clickCartButton() {
        $(HomeLocators.CART_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage clickTestCasesButton() {
        $(HomeLocators.TEST_CASES_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage clickLoginButton() {
        $(HomeLocators.LOGIN_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage checkLoggedUser(String username) {
        checkText(HomeLocators.LOGGED_USER_FIELD.getLocator(), username);
        return this;
    }

    public HomePage clickDeleteAccountButton() {
        $(HomeLocators.DELETE_ACCOUNT_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage checkAccountDeletedMessage() {
        isVisible(HomeLocators.ACCOUNT_DELETED_MESSAGE.getLocator());
        return this;
    }

    public HomePage clickLogoutButton() {
        $(HomeLocators.LOGOUT_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage checkCurrentPage() {
        checkPageTitle("Automation Exercise");
        return this;
    }

    public HomePage clickContactUsButton() {
        $(HomeLocators.CONTACT_US_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage checkFooterSubscriptionTitle() {
        checkText(HomeLocators.FOOTER_SUBSCRIPTION_TITLE.getLocator(), "Subscription");
        return this;
    }

    public HomePage enterEmailForSubscription(String email) {
        $(HomeLocators.SUBSCRIBE_EMAIL_INPUT.getLocator()).setValue(email);
        $(HomeLocators.SUBSCRIBE_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage checkSubscriptionSuccessMessage() {
        checkText(HomeLocators.SUCCESS_SUBSCRIPTION_MESSAGE.getLocator(), "You have been successfully subscribed!");
        return this;
    }

    public HomePage checkProductsCategoryList() {
        isVisible(HomeLocators.PRODUCTS_CATEGORY_LIST.getLocator());
        return this;
    }

    public HomePage clickWomenCategory() {
        $(HomeLocators.WOMEN_CATEGORY.getLocator()).click();
        return this;
    }

    public HomePage clickDressWomenSubcategory() {
        $(HomeLocators.DRESS_WOMEN_SUBCATEGORY.getLocator()).click();
        return this;
    }

    public HomePage checkDressSubcategoryTitle() {
        isVisible(HomeLocators.DRESS_SUBCATEGORY_TITLE.getLocator());
        return this;
    }

    public HomePage clickMenCategory() {
        $(HomeLocators.MEN_CATEGORY.getLocator()).click();
        return this;
    }

    public HomePage clickTshirtsMenSubcategory() {
        $(HomeLocators.TSHIRTS_MEN_SUBCATEGORY.getLocator()).click();
        return this;
    }

    public HomePage checkMenTshirtsSubcategoryTitle() {
        isVisible(HomeLocators.MEN_TSHIRTS_SUBCATEGORY_TITLE.getLocator());
        return this;
    }
}
