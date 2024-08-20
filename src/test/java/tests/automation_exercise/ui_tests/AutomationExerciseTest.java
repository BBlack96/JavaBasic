package tests.automation_exercise.ui_tests;

import automation_exercise.pages.*;
import automation_exercise.utils.EnvConfig;
import org.testng.annotations.*;

public class AutomationExerciseTest {

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
        new HomePage()
                .openPage()
                .checkCurrentPage();
    }

    @Test(priority = 1)
    public void RegisterUser() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignupFormTitle()
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        new SignupPage()
                .checkSignupFormTitle()
                .selectMaleGender()
                .enterNewUserName(config.getNewUserName())
                .enterNewUserPassword(config.getNewUserPassword())
                .selectDayOfBirth(24)
                .selectMonthOfBirth("May")
                .selectYearOfBirth("1990")
                .selectNewsletterSubscription()
                .selectSpecialOffersSubscription()
                .enterFirstName(config.getNewUserFirstName())
                .enterLastName(config.getNewUserLastName())
                .enterCompanyName(config.getNewUserCompanyName())
                .enterAddress1(config.getNewUserAddress1())
                .enterAddress2(config.getNewUserAddress2())
                .selectCountry(config.getNewUserCountry())
                .enterState(config.getNewUserState())
                .enterCity(config.getNewUserCity())
                .enterZipCode(config.getNewUserZipCode())
                .enterMobileNumber(config.getNewUserMobileNumber())
                .clickCreateAccountButton();
        new AccountCreatedPage()
                .verifyAccountCreatedTitle()
                .clickContinueButton();
        new HomePage()
                .checkLoggedUser(config.getNewUserName())
                .clickLogoutButton();
    }

    @Test(priority = 2)
    public void LoginUserWithCorrectEmailAndPassword() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail(config.getNewUserEmail())
                .enterLoginPassword(config.getNewUserPassword())
                .clickLoginButton();
        new HomePage()
                .checkLoggedUser(config.getNewUserName())
                .clickDeleteAccountButton()
                .checkAccountDeletedMessage();
    }

    @Test(priority = 3)
    public void LoginUserWithIncorrectEmailAndPassword() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail(config.getInvalidUserEmail())
                .enterLoginPassword(config.getInvalidUserPassword())
                .clickLoginButton()
                .checkWrongCredentialsMessage();
    }

    @Test(priority = 4)
    public void LogoutUser() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail(config.getValidUserEmail())
                .enterLoginPassword(config.getValidUserPassword())
                .clickLoginButton();
        new HomePage()
                .checkLoggedUser(config.getValidUserName())
                .clickLogoutButton();
        new LoginPage()
                .checkCurrentPage();
    }

    @Test(priority = 5)
    public void RegisterUserWithExistingEmail() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignupFormTitle()
                .enterNewUserEmail(config.getValidUserEmail())
                .enterNewUserName(config.getValidUserName())
                .clickSignupButton()
                .checkExistingCredsMessage();
    }

    @Test(priority = 6)
    public void ContactUsForm() {
        new HomePage()
                .clickContactUsButton();
        new ContactUsPage()
                .checkGetInTouchTitle()
                .enterName(config.getContactUserName())
                .enterEmail(config.getContactUserEmail())
                .enterSubject(config.getContactUserSubject())
                .enterMessage(config.getContactUserMessage())
                .uploadFile(config.getContactUserFileName())
                .clickSubmitButton()
                .OkAlert()
                .isVisibleAlertStatusMessage()
                .clickHomeButton();
        new HomePage()
                .checkCurrentPage();
    }

    @Test(priority = 7)
    public void VerifyTestCasesPage() {
        new HomePage()
                .clickTestCasesButton();
        new TestCasesPage()
                .checkTitle();
    }

    @Test(priority = 8)
    public void VerifyAllProductsAndProductDetailPage() {
        new HomePage()
                .clickProductsButton();
        new ProductsPage()
                .checkTitle()
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
        new HomePage()
                .clickProductsButton();
        new ProductsPage()
                .productsListIsVisible()
                .searchProduct("Men Tshirt")
                .checkSearchedProductsTitle()
                .checkSearchResultProductName("Men Tshirt");
    }

    @Test(priority = 10)
    public void VerifySubscriptionInHomePage(){
        new HomePage()
                .checkFooterSubscriptionTitle()
                .enterEmailForSubscription(config.getSubscriptionEmail())
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 11)
    public  void  VerifySubscriptionInCartPage(){
        new HomePage()
                .clickCartButton();
        new CartPage()
                .checkFooterSubscriptionTitle()
                .enterEmailForSubscription(config.getSubscriptionEmail())
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 12)
    public void AddProductsInCart(){
        new HomePage()
                .clickProductsButton();
        new ProductsPage()
                .productsListIsVisible()
                .addProductByName("Blue Top")
                .clickContinueShoppingButton()
                .addProductToCartByIndex(3)
                .clickViewCartLink();
        new CartPage()
                .checkProductInCart("Blue Top")
                .checkProductInCart("Men Tshirt");
    }
}
