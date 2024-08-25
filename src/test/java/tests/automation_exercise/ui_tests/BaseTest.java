package tests.automation_exercise.ui_tests;

import automation_exercise.pages.*;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SignupPage signupPage;
    protected AccountCreatedPage accountCreatedPage;
    protected ContactUsPage contactUsPage;
    protected TestCasesPage testCasesPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;

    @BeforeMethod
    public void setUpPages() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        signupPage = new SignupPage();
        accountCreatedPage = new AccountCreatedPage();
        contactUsPage = new ContactUsPage();
        testCasesPage = new TestCasesPage();
        productsPage = new ProductsPage();
        cartPage = new CartPage();
    }
}

