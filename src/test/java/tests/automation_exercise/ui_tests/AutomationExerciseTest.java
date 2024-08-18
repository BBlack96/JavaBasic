package tests.automation_exercise.ui_tests;

import automation_exercise.pages.*;
import org.testng.annotations.*;

public class AutomationExerciseTest {

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
                .enterNewUserEmail("SelenideTest797@gmail.com")
                .enterNewUserName("John Doe")
                .clickSignupButton();
        new SignupPage()
                .checkSignupFormTitle()
                .selectMaleGender()
                .enterNewUserName("Alan Wake")
                .enterNewUserPassword("MyTestPassword123!")
                .selectDayOfBirth(24)
                .selectMonthOfBirth("May")
                .selectYearOfBirth("1990")
                .selectNewsletterSubscription()
                .selectSpecialOffersSubscription()
                .enterFirstName("Alan")
                .enterLastName("Wake")
                .enterCompanyName("Remedy Entertainment")
                .enterAddress1("Asema-aukio 2")
                .enterAddress2("PL 20")
                .selectCountry("United States")
                .enterState("New York")
                .enterCity("New York")
                .enterZipCode("10001")
                .enterMobileNumber("123456789")
                .clickCreateAccountButton();
        new AccountCreatedPage()
                .verifyAccountCreatedTitle()
                .clickContinueButton();
        new HomePage()
                .checkLoggedUser("Alan Wake")
                .clickLogoutButton();
    }

    @Test(priority = 2)
    public void LoginUserWithCorrectEmailAndPassword() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail("SelenideTest797@gmail.com")
                .enterLoginPassword("MyTestPassword123!")
                .clickLoginButton();
        new HomePage()
                .checkLoggedUser("Alan Wake")
                .clickDeleteAccountButton()
                .checkAccountDeletedMessage();
    }

    @Test(priority = 3)
    public void LoginUserWithIncorrectEmailAndPassword() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail("invalidEmail@gmail.com")
                .enterLoginPassword("invalidPassword")
                .clickLoginButton()
                .checkWrongCredentialsMessage();
    }

    @Test(priority = 4)
    public void LogoutUser() {
        new HomePage()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail("ValidUser+1@gmail.com")
                .enterLoginPassword("ValidUser+1@gmail.com")
                .clickLoginButton();
        new HomePage()
                .checkLoggedUser("Alan Wake")
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
                .enterNewUserEmail("ValidUser+1@gmail.com")
                .enterNewUserName("John Doe")
                .clickSignupButton()
                .checkExistingCredsMessage();
    }

    @Test(priority = 6)
    public void ContactUsForm() {
        new HomePage()
                .clickContactUsButton();
        new ContactUsPage()
                .checkGetInTouchTitle()
                .enterName("John Doe")
                .enterEmail("SomeTestEmail@gmail.com")
                .enterSubject("Test Subject")
                .enterMessage("Test Message")
                .uploadFile("dog.jpg")
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
                .enterEmailForSubscription("test@gmail.com")
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 11)
    public  void  VerifySubscriptionInCartPage(){
        new HomePage()
                .clickCartButton();
        new CartPage()
                .checkFooterSubscriptionTitle()
                .enterEmailForSubscription("test@gmail.com")
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
