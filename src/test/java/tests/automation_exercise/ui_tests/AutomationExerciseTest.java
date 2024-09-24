package tests.automation_exercise.ui_tests;

import automation_exercise.pages.BasePage;
import automation_exercise.utils.EnvConfig;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class AutomationExerciseTest extends BaseTest {

    EnvConfig config = new EnvConfig();

    @BeforeSuite
    public void setup() {
        BasePage basePage = new BasePage();
        basePage.open("chrome://extensions/");
        try {
            Thread.sleep(5000);
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
    public void registerUser() {
        homePage.clickLoginButton();
        loginPage
                .checkSignupFormTitle()
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        signupPage
                .checkSignupFormTitle()
                .fillRegisterForm(
                        config.getNewUserMaleGender(),
                        config.getNewUserName(),
                        config.getNewUserPassword(),
                        24,
                        "May",
                        "1990",
                        config.getNewUserFirstName(),
                        config.getNewUserLastName(),
                        config.getNewUserCompanyName(),
                        config.getNewUserAddress1(),
                        config.getNewUserAddress2(),
                        config.getNewUserCountry(),
                        config.getNewUserState(),
                        config.getNewUserCity(),
                        config.getNewUserZipCode(),
                        config.getNewUserMobileNumber())
                .selectNewsletterSubscription()
                .selectSpecialOffersSubscription()
                .clickCreateAccountButton();
        accountCreatedPage.verifyAccountCreatedTitle().clickContinueButton();
        homePage.checkLoggedUser(config.getNewUserName()).clickLogoutButton();
    }

    @Test(priority = 2)
    public void loginUserWithCorrectEmailAndPassword() {
        homePage.clickLoginButton();
        loginPage
                .checkSignInTitle()
                .enterLoginEmail(config.getNewUserEmail())
                .enterLoginPassword(config.getNewUserPassword())
                .clickLoginButton();
        homePage
                .checkLoggedUser(config.getNewUserName())
                .clickDeleteAccountButton()
                .checkAccountDeletedMessage();
    }

    @Test(priority = 3)
    public void loginUserWithIncorrectEmailAndPassword() {
        homePage.clickLoginButton();
        loginPage
                .checkSignInTitle()
                .enterLoginEmail(config.getInvalidUserEmail())
                .enterLoginPassword(config.getInvalidUserPassword())
                .clickLoginButton()
                .checkWrongCredentialsMessage();
    }

    @Test(priority = 4)
    public void logoutUser() {
        homePage.clickLoginButton();
        loginPage
                .checkSignInTitle()
                .enterLoginEmail(config.getValidUserEmail())
                .enterLoginPassword(config.getValidUserPassword())
                .clickLoginButton();
        homePage.checkLoggedUser(config.getValidUserName()).clickLogoutButton();
        loginPage.checkCurrentPage();
    }

    @Test(priority = 5)
    public void registerUserWithExistingEmail() {
        homePage.clickLoginButton();
        loginPage
                .checkSignupFormTitle()
                .enterNewUserEmail(config.getValidUserEmail())
                .enterNewUserName(config.getValidUserName())
                .clickSignupButton()
                .checkExistingCredsMessage();
    }

    @Test(priority = 6)
    public void contactUsForm() {
        homePage.clickContactUsButton();
        contactUsPage
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
        homePage.checkCurrentPage();
    }

    @Test(priority = 7)
    public void verifyTestCasesPage() {
        homePage.clickTestCasesButton();
        testCasesPage.checkTitle();
    }

    @Test(priority = 8)
    public void verifyAllProductsAndProductDetailPage() {
        homePage.clickProductsButton();
        productsPage
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
    public void searchProduct() {
        homePage.clickProductsButton();
        productsPage
                .productsListIsVisible()
                .searchProduct("Men Tshirt")
                .checkSearchedProductsTitle()
                .checkSearchResultProductName("Men Tshirt");
    }

    @Test(priority = 10)
    public void verifySubscriptionInHomePage() {
        homePage
                .checkFooterSubscriptionTitle()
                .enterEmailForSubscription(config.getSubscriptionEmail())
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 11)
    public void verifySubscriptionInCartPage() {
        homePage.clickCartButton();
        cartPage
                .checkFooterSubscriptionTitle()
                .enterEmailForSubscription(config.getSubscriptionEmail())
                .checkSubscriptionSuccessMessage();
    }

    @Test(priority = 12)
    public void addProductsInCart() {
        homePage.clickProductsButton();
        productsPage
                .productsListIsVisible()
                .addProductByName("Blue Top")
                .clickContinueShoppingButton()
                .addProductToCartByIndex(3)
                .clickViewCartLink();
        cartPage.checkProductInCart("Blue Top").checkProductInCart("Men Tshirt");
    }

    @Test(priority = 13)
    public void verifyProductQuantityInCart() {
        productsPage
                .clickProductViewButtonByIndex(1)
                .checkProductDetailsTitle()
                .setProductQuantity(4)
                .addProductToCart()
                .clickViewCartLink();
        cartPage.checkProductInCart("Blue Top").checkProductQuantityInCart("Blue Top", "5");
    }

    @Test(priority = 14)
    public void placeOrderRegisterWhileCheckout() {
        productsPage
                .addProductByName("Blue Top")
                .clickContinueShoppingButton()
                .addProductByName("Men Tshirt")
                .clickViewCartLink();
        cartPage.clickProceedToCheckoutButton().clickRegisterLoginLink();
        loginPage
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        signupPage
                .fillRegisterForm(
                        config.getNewUserMaleGender(),
                        config.getNewUserName(),
                        config.getNewUserPassword(),
                        24,
                        "May",
                        "1990",
                        config.getNewUserFirstName(),
                        config.getNewUserLastName(),
                        config.getNewUserCompanyName(),
                        config.getNewUserAddress1(),
                        config.getNewUserAddress2(),
                        config.getNewUserCountry(),
                        config.getNewUserState(),
                        config.getNewUserCity(),
                        config.getNewUserZipCode(),
                        config.getNewUserMobileNumber())
                .clickCreateAccountButton();
        accountCreatedPage.verifyAccountCreatedTitle().clickContinueButton();
        homePage.checkLoggedUser(config.getNewUserName()).clickCartButton();
        cartPage
                .clickProceedToCheckoutButton()
                .verifyAddressDetailsTitle()
                .verifyReviewOrderTitle()
                .setOrderMessage("Test Message")
                .clickPlaceOrderButton()
                .enterPaymentDetails(
                        config.getCardName(),
                        config.getCardNumber(),
                        config.getCardCVC(),
                        config.getCardExpiryMonth(),
                        config.getCardExpiryYear())
                .clickConfirmOrderButton()
                .checkOrderPlacedMessage();
        homePage.clickDeleteAccountButton().checkAccountDeletedMessage();
    }

    @Test(priority = 15)
    public void placeOrderRegisterBeforeCheckout() {
        homePage.clickLoginButton();
        loginPage
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        signupPage
                .fillRegisterForm(
                        config.getNewUserMaleGender(),
                        config.getNewUserName(),
                        config.getNewUserPassword(),
                        24,
                        "May",
                        "1990",
                        config.getNewUserFirstName(),
                        config.getNewUserLastName(),
                        config.getNewUserCompanyName(),
                        config.getNewUserAddress1(),
                        config.getNewUserAddress2(),
                        config.getNewUserCountry(),
                        config.getNewUserState(),
                        config.getNewUserCity(),
                        config.getNewUserZipCode(),
                        config.getNewUserMobileNumber())
                .clickCreateAccountButton();
        accountCreatedPage.verifyAccountCreatedTitle().clickContinueButton();
        homePage.checkLoggedUser(config.getNewUserName());
        productsPage.addProductByName("Blue Top").addProductByName("Men Tshirt").clickViewCartLink();
        cartPage
                .clickProceedToCheckoutButton()
                .verifyAddressDetailsTitle()
                .verifyReviewOrderTitle()
                .setOrderMessage("Test Message")
                .clickPlaceOrderButton()
                .enterPaymentDetails(
                        config.getCardName(),
                        config.getCardNumber(),
                        config.getCardCVC(),
                        config.getCardExpiryMonth(),
                        config.getCardExpiryYear())
                .clickConfirmOrderButton()
                .checkOrderPlacedMessage();
        homePage.clickDeleteAccountButton().checkAccountDeletedMessage();
    }

    @Test(priority = 16)
    public void PlaceOrderLoginBeforeCheckout() {
        homePage.clickLoginButton();
        loginPage
                .enterLoginEmail(config.getValidUserEmail())
                .enterLoginPassword(config.getValidUserPassword())
                .clickLoginButton();
        homePage.checkLoggedUser(config.getValidUserName());
        productsPage.addProductByName("Blue Top").addProductByName("Men Tshirt").clickViewCartLink();
        cartPage
                .checkProductInCart("Blue Top")
                .checkProductInCart("Men Tshirt")
                .clickProceedToCheckoutButton()
                .verifyAddressDetailsTitle()
                .verifyReviewOrderTitle()
                .setOrderMessage("Test Message")
                .clickPlaceOrderButton()
                .enterPaymentDetails(
                        config.getCardName(),
                        config.getCardNumber(),
                        config.getCardCVC(),
                        config.getCardExpiryMonth(),
                        config.getCardExpiryYear())
                .clickConfirmOrderButton()
                .checkOrderPlacedMessage();
    }

    @Test(priority = 17)
    public void RemoveProductsFromCart() {
        productsPage
                .addProductByName("Blue Top")
                .clickContinueShoppingButton()
                .addProductByName("Men Tshirt")
                .clickViewCartLink();
        cartPage
                .checkProductInCart("Blue Top")
                .checkProductInCart("Men Tshirt")
                .deleteProductFromCart("Blue Top")
                .checkProductIsDeletedFromCart("Blue Top")
                .deleteProductFromCart("Men Tshirt")
                .checkProductIsDeletedFromCart("Men Tshirt");
    }

    @Test(priority = 18)
    public void ViewCategoryProducts() {
        homePage
                .checkProductsCategoryList()
                .checkProductsCategoryList()
                .clickWomenCategory()
                .clickDressWomenSubcategory()
                .checkDressSubcategoryTitle()
                .clickMenCategory()
                .clickTshirtsMenSubcategory()
                .checkMenTshirtsSubcategoryTitle();
    }

    @Test(priority = 19)
    public void ViewAndCartBrandProducts() {
        homePage.clickProductsButton();
        productsPage
                .checkBrandsIsVisible()
                .clickPoloBrand()
                .productsListIsVisible()
                .clickHimBrand()
                .productsListIsVisible();
        homePage.clickLogoutButton();
    }

    @Test(priority = 20)
    public void SearchProductsAndVerifyCartAfterLogin() {
        homePage.clickProductsButton();
        productsPage
                .productsListIsVisible()
                .searchProduct("Top")
                .areSearchedProductsVisible("Top")
                .addSearchedProductsToCart();
        homePage.clickCartButton();
        cartPage.checkProductsInCart("Top");
        homePage.clickLoginButton();
        loginPage
                .enterLoginEmail(config.getValidUserEmail())
                .enterLoginPassword(config.getValidUserPassword())
                .clickLoginButton();
        homePage.clickCartButton();
        cartPage.checkProductsInCart("Top");
    }

    @Test(priority = 21)
    public void AddReviewOnProduct() {
        homePage.clickProductsButton();
        productsPage
                .clickProductViewButtonByIndex(1)
                .checkWriteYourReviewTitleOnProductPage()
                .fillReviewForm(
                        config.getValidUserName(), config.getValidUserEmail(), config.getReviewMessage())
                .submitReview()
                .checkReviewSuccessAlert();
    }

    @Test(priority = 22)
    public void AddToCartFromRecommendedItems() {
        homePage.checkRecommendedProductsTitle();
        List<String> recommendedItems = homePage.getRecommendedItemsText();
        homePage.addRecommendedProductsToCart().clickCartButton();
        cartPage.checkProductsInCart(recommendedItems);
        homePage.clickLogoutButton();
    }

    @Test(priority = 23)
    public void VerifyAddressDetailsInCheckoutPage() {
        homePage.clickLoginButton();
        loginPage
                .checkSignupFormTitle()
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        signupPage
                .checkSignupFormTitle()
                .fillRegisterForm(
                        config.getNewUserMaleGender(),
                        config.getNewUserName(),
                        config.getNewUserPassword(),
                        24,
                        "May",
                        "1990",
                        config.getNewUserFirstName(),
                        config.getNewUserLastName(),
                        config.getNewUserCompanyName(),
                        config.getNewUserAddress1(),
                        config.getNewUserAddress2(),
                        config.getNewUserCountry(),
                        config.getNewUserState(),
                        config.getNewUserCity(),
                        config.getNewUserZipCode(),
                        config.getNewUserMobileNumber())
                .selectNewsletterSubscription()
                .selectSpecialOffersSubscription()
                .clickCreateAccountButton();
        accountCreatedPage.verifyAccountCreatedTitle().clickContinueButton();
        homePage
                .checkLoggedUser(config.getNewUserName())
                .addRecommendedProductsToCart()
                .clickCartButton();
        cartPage
                .clickProceedToCheckoutButton()
                .verifyDeliveryAddress(config.getNewUserMaleGender() + " " + config.getNewUserName())
                .verifyBillingAddress(config.getNewUserMaleGender() + " " + config.getNewUserName());
        homePage.clickDeleteAccountButton().checkAccountDeletedMessage();
    }

    @Test(priority = 24)
    public void DownloadInvoiceAfterPurchaseOrder() {
        homePage.clickLoginButton();
        loginPage
                .checkSignupFormTitle()
                .enterNewUserEmail(config.getNewUserEmail())
                .enterNewUserName(config.getNewUserName())
                .clickSignupButton();
        signupPage
                .checkSignupFormTitle()
                .fillRegisterForm(
                        config.getNewUserMaleGender(),
                        config.getNewUserName(),
                        config.getNewUserPassword(),
                        24,
                        "May",
                        "1990",
                        config.getNewUserFirstName(),
                        config.getNewUserLastName(),
                        config.getNewUserCompanyName(),
                        config.getNewUserAddress1(),
                        config.getNewUserAddress2(),
                        config.getNewUserCountry(),
                        config.getNewUserState(),
                        config.getNewUserCity(),
                        config.getNewUserZipCode(),
                        config.getNewUserMobileNumber())
                .selectNewsletterSubscription()
                .selectSpecialOffersSubscription()
                .clickCreateAccountButton();
        accountCreatedPage.verifyAccountCreatedTitle().clickContinueButton();
        homePage
                .checkLoggedUser(config.getNewUserName())
                .addRecommendedProductsToCart()
                .clickCartButton();
        cartPage
                .clickProceedToCheckoutButton()
                .clickPlaceOrderButton()
                .enterPaymentDetails(
                        config.getCardName(),
                        config.getCardNumber(),
                        config.getCardCVC(),
                        config.getCardExpiryMonth(),
                        config.getCardExpiryYear())
                .clickConfirmOrderButton()
                .checkOrderPlacedMessage()
                .downloadAndCheckInvoice();
        homePage.clickDeleteAccountButton().checkAccountDeletedMessage();
    }
}
