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

    public HomePage verifyURL() {
        checkURL(pageUrl);
        return this;
    }

    public HomePage clickLoginButton() {
        $(HomeLocators.LOGIN_BUTTON.getLocator()).click();
        return this;
    }




}
