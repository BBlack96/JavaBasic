package automation_exercise.pages;

import automation_exercise.locators.CommonLocators;
import automation_exercise.locators.HomeLocators;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;

import java.util.List;

public class HomePage extends BasePage {

    final String pageUrl = "https://www.automationexercise.com/";

    public HomePage openPage() {
        open(pageUrl);
        return this;
    }

    @Step("Click Products button")
    public HomePage clickProductsButton() {
        $(HomeLocators.PRODUCTS_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Click Cart button")
    public HomePage clickCartButton() {
        $(HomeLocators.CART_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Click Test Cases button")
    public HomePage clickTestCasesButton() {
        $(HomeLocators.TEST_CASES_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Click Login button")
    public HomePage clickLoginButton() {
        try {
            $(HomeLocators.LOGIN_BUTTON.getLocator()).click();
        } catch (NoSuchElementException e) {
            $(HomeLocators.LOGOUT_BUTTON.getLocator()).click();
            $(HomeLocators.LOGIN_BUTTON.getLocator()).click();
        }
        return this;
    }

    @Step("Verified logged user is: {username}")
    public HomePage checkLoggedUser(String username) {
        checkText(HomeLocators.LOGGED_USER_FIELD.getLocator(), username);
        return this;
    }

    @Step("Click Delete Account button")
    public HomePage clickDeleteAccountButton() {
        $(HomeLocators.DELETE_ACCOUNT_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if account deleted message is displayed")
    public HomePage checkAccountDeletedMessage() {
        isVisible(HomeLocators.ACCOUNT_DELETED_MESSAGE.getLocator());
        return this;
    }

    @Step("Click Logout button")
    public HomePage clickLogoutButton() {
        $(HomeLocators.LOGOUT_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if Main page is opened")
    public HomePage checkCurrentPage() {
        checkPageTitle("Automation Exercise");
        return this;
    }

    @Step("Click Contact Us button")
    public HomePage clickContactUsButton() {
        $(HomeLocators.CONTACT_US_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if Subscription title is displayed in footer")
    public HomePage checkFooterSubscriptionTitle() {
        checkText(HomeLocators.FOOTER_SUBSCRIPTION_TITLE.getLocator(), "Subscription");
        return this;
    }

    @Step("Enter email {email} for subscription")
    public HomePage enterEmailForSubscription(String email) {
        $(HomeLocators.SUBSCRIBE_EMAIL_INPUT.getLocator()).setValue(email);
        $(HomeLocators.SUBSCRIBE_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if subscription success message is displayed")
    public HomePage checkSubscriptionSuccessMessage() {
        checkText(
                HomeLocators.SUCCESS_SUBSCRIPTION_MESSAGE.getLocator(),
                "You have been successfully subscribed!");
        return this;
    }

    @Step("Check if Categories list is displayed")
    public HomePage checkProductsCategoryList() {
        isVisible(CommonLocators.PRODUCTS_CATEGORY_LIST.getLocator());
        return this;
    }

    @Step("Click on Women category")
    public HomePage clickWomenCategory() {
        $(CommonLocators.WOMEN_CATEGORY.getLocator()).click();
        return this;
    }

    @Step("Click on Dresses subcategory")
    public HomePage clickDressWomenSubcategory() {
        $(CommonLocators.DRESS_WOMEN_SUBCATEGORY.getLocator()).click();
        return this;
    }

    @Step("Check dress subcategory title")
    public HomePage checkDressSubcategoryTitle() {
        isVisible(CommonLocators.DRESS_SUBCATEGORY_TITLE.getLocator());
        return this;
    }

    @Step("Click on 'Men' category")
    public HomePage clickMenCategory() {
        $(CommonLocators.MEN_CATEGORY.getLocator()).click();
        return this;
    }

    @Step("Click on 'T-shirts' men subcategory")
    public HomePage clickTshirtsMenSubcategory() {
        $(CommonLocators.TSHIRTS_MEN_SUBCATEGORY.getLocator()).click();
        return this;
    }

    @Step("Check men T-shirts subcategory title")
    public HomePage checkMenTshirtsSubcategoryTitle() {
        isVisible(CommonLocators.MEN_TSHIRTS_SUBCATEGORY_TITLE.getLocator());
        return this;
    }

    @Step("Check recommended products title")
    public HomePage checkRecommendedProductsTitle() {
        isVisible(HomeLocators.RECOMMENDED_PRODUCTS_TITLE.getLocator());
        return this;
    }

    @Step("Click on 'Continue Shopping' button")
    public HomePage clickContinueShoppingButton() {
        $(CommonLocators.CONTINUE_SHOPPING_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Add recommended products to cart")
    public HomePage addRecommendedProductsToCart() {
        for (SelenideElement selenideElement :
                $$(HomeLocators.RECOMMENDED_PRODUCT_ADD_TO_CART.getLocator())) {
            selenideElement.click();
            clickContinueShoppingButton();
        }
        return this;
    }

    @Step("Get recommended items text")
    public List<String> getRecommendedItemsText() {
        return getElementsText(HomeLocators.RECOMMENDED_PRODUCTS_NAMES.getLocator());
    }
}
