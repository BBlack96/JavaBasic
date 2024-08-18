package automation_exercise.pages;

import automation_exercise.locators.HomeLocators;

public class HomePage extends BasePage {

    final String pageUrl = "https://www.automationexercise.com/";

    public HomePage openPage() {
        open(pageUrl);
        return this;
    }

    public HomePage verifyLogoIsVisible() {
        isVisible(HomeLocators.LOGO.getLocator());
        return this;
    }

    public HomePage clickProductsButton() {
        $(HomeLocators.PRODUCTS_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage clickTestCasesButton() {
        $(HomeLocators.TEST_CASES_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage verifyURL() {
        checkURL(pageUrl);
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

    public HomePage checkCurrentPage(){
        checkPageTitle("Automation Exercise");
        return this;
    }

    public void clickContactUsButton() {
        $(HomeLocators.CONTACT_US_BUTTON.getLocator()).click();
    }
}
