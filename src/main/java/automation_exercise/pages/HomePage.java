package automation_exercise.pages;

import automation_exercise.locators.HomeLocators;
import automation_exercise.locators.CommonLocators;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.NoSuchElementException;

import java.util.List;

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
        try {
            $(HomeLocators.LOGIN_BUTTON.getLocator()).click();
        } catch (NoSuchElementException e) {
            $(HomeLocators.LOGOUT_BUTTON.getLocator()).click();
            $(HomeLocators.LOGIN_BUTTON.getLocator()).click();
        }
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
        isVisible(CommonLocators.PRODUCTS_CATEGORY_LIST.getLocator());
        return this;
    }

    public HomePage clickWomenCategory() {
        $(CommonLocators.WOMEN_CATEGORY.getLocator()).click();
        return this;
    }

    public HomePage clickDressWomenSubcategory() {
        $(CommonLocators.DRESS_WOMEN_SUBCATEGORY.getLocator()).click();
        return this;
    }

    public HomePage checkDressSubcategoryTitle() {
        isVisible(CommonLocators.DRESS_SUBCATEGORY_TITLE.getLocator());
        return this;
    }

    public HomePage clickMenCategory() {
        $(CommonLocators.MEN_CATEGORY.getLocator()).click();
        return this;
    }

    public HomePage clickTshirtsMenSubcategory() {
        $(CommonLocators.TSHIRTS_MEN_SUBCATEGORY.getLocator()).click();
        return this;
    }

    public HomePage checkMenTshirtsSubcategoryTitle() {
        isVisible(CommonLocators.MEN_TSHIRTS_SUBCATEGORY_TITLE.getLocator());
        return this;
    }

    public HomePage checkRecommendedProductsTitle() {
        isVisible(HomeLocators.RECOMMENDED_PRODUCTS_TITLE.getLocator());
        return this;
    }

    public HomePage clickContinueShoppingButton() {
        $(CommonLocators.CONTINUE_SHOPPING_BUTTON.getLocator()).click();
        return this;
    }

    public HomePage addRecommendedProductsToCart(){
        for (SelenideElement selenideElement : $$(HomeLocators.RECOMMENDED_PRODUCT_ADD_TO_CART.getLocator())) {
            selenideElement.click();
            clickContinueShoppingButton();
        }
        return this;
    }

    public List<String> getRecommendedItemsText() {
        return getElementsText(HomeLocators.RECOMMENDED_PRODUCTS_NAMES.getLocator());
    }


}
