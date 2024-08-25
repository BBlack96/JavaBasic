// AutomationExerciseTest.java
package tests.automation_exercise.ui_tests;

import automation_exercise.pages.BasePage;
import automation_exercise.utils.EnvConfig;
import org.testng.annotations.*;

public class AutomationExerciseTest extends BaseTest {

    EnvConfig config = new EnvConfig();

    @BeforeSuite
    public void setup() {
        BasePage basePage = new BasePage();
        basePage.open("chrome://extensions/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        basePage.closeExtraTabs();
    }

    @BeforeMethod
    public void openMainPage() {
        homePage.openPage().checkCurrentPage();
    }

    @Test(priority = 1)
    public void RegisterUser() {
        homePage.clickLoginButton();
        loginPage.checkSignupFormTitle()
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        signupPage.checkSignupFormTitle()
                .selectMaleGender()
                .fillRegisterForm(config.getNewUserName(), config.getNewUserPassword(), 24, "May", "1990",
                        config.getNewUserFirstName(), config.getNewUserLastName(), config.getNewUserCompanyName(),
                        config.getNewUserAddress1(), config.getNewUserAddress2(), config.getNewUserCountry(),
                        config.getNewUserState(), config.getNewUserCity(), config.getNewUserZipCode(), config.getNewUserMobileNumber())
                .selectNewsletterSubscription()
                .selectSpecialOffersSubscription()
                .clickCreateAccountButton();
        accountCreatedPage.verifyAccountCreatedTitle()
                .clickContinueButton();
        homePage.checkLoggedUser(config.getNewUserName())
                .clickLogoutButton();
    }

    @Test(priority = 2)
    public void LoginUserWithCorrectEmailAndPassword() {
        homePage.clickLoginButton();
        loginPage.checkSignInTitle()
                .enterLoginEmail(config.getNewUserEmail())
                .enterLoginPassword(config.getNewUserPassword())
                .clickLoginButton();
        homePage.checkLoggedUser(config.getNewUserName())
                .clickDeleteAccountButton()
                .checkAccountDeletedMessage();
    }

    @Test(priority = 3)
    public void LoginUserWithIncorrectEmailAndPassword() {
        homePage.clickLoginButton();
        loginPage.checkSignInTitle()
                .enterLoginEmail(config.getInvalidUserEmail())
                .enterLoginPassword(config.getInvalidUserPassword())
                .clickLoginButton()
                .checkWrongCredentialsMessage();
    }

    @Test(priority = 4)
    public void LogoutUser() {
        homePage.clickLoginButton();
        loginPage.checkSignInTitle()
                .enterLoginEmail(config.getValidUserEmail())
                .enterLoginPassword(config.getValidUserPassword())
                .clickLoginButton();
        homePage.checkLoggedUser(config.getValidUserName())
                .clickLogoutButton();
        loginPage.checkCurrentPage();
    }

    @Test(priority = 5)
    public void RegisterUserWithExistingEmail() {
        homePage.clickLoginButton();
        loginPage.checkSignupFormTitle()
                .enterNewUserEmail(config.getValidUserEmail())
                .enterNewUserName(config.getValidUserName())
                .clickSignupButton()
                .checkExistingCredsMessage();
    }

    @Test(priority = 6)
    public void ContactUsForm() {
        homePage.clickContactUsButton();
        contactUsPage.checkGetInTouchTitle()
                .enterName(config.getContactUserName())
                .enterEmail(config.getContactUserEmail())
                .enterSubject(config.getContactUserSubject())
                .enterMessage(config.getContactUserMessage())
                .uploadFile(config.getContactUserFileName())
                .clickSubmitButton()
                .OkAlert()
                .isVisibleAlertStatusMessage()
                .clickHomeButton();
        homePage.checkCurrentPage();
    }

    @Test(priority = 7)
    public void VerifyTestCasesPage() {
        homePage.clickTestCasesButton();
        testCasesPage.checkTitle();
    }

    @Test(priority = 8)
    public void VerifyAllProductsAndProductDetailPage() {
        homePage.clickProductsButton();
        productsPage.checkTitle()
                .productsListIsVisible()
                .clickProductViewButtonByIndex(1)
                .checkProductDetailsTitle()
                .productNameIsVisible()
                .productCategoryIsVisible()
                .productPriceIsVisible()
                .productAvailabilityIsVisible()
                .productConditionIsVisible()
                .productBrandIsVisible();
    }

    @Test(priority = 9)
    public void SearchProduct(){
        homePage.clickProductsButton();
        productsPage.productsListIsVisible()
                .searchProduct("Men Tshirt")
                .checkSearchedProductsTitle()
                .checkSearchResultProductName("Men Tshirt");
    }

    @Test(priority = 10)
    public void VerifySubscriptionInHomePage(){
        homePage.checkFooterSubscriptionTitle()
                .enterEmailForSubscription(config.getSubscriptionEmail())
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 11)
    public  void  VerifySubscriptionInCartPage(){
        homePage.clickCartButton();
        cartPage.checkFooterSubscriptionTitle()
                .enterEmailForSubscription(config.getSubscriptionEmail())
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 12)
    public void AddProductsInCart(){
        homePage.clickProductsButton();
        productsPage.productsListIsVisible()
                .addProductByName("Blue Top")
                .clickContinueShoppingButton()
                .addProductToCartByIndex(3)
                .clickViewCartLink();
        cartPage.checkProductInCart("Blue Top")
                .checkProductInCart("Men Tshirt");
    }
}