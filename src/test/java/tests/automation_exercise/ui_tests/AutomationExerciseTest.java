package tests.automation_exercise.ui_tests;

import automation_exercise.pages.*;
import org.testng.annotations.*;
import automation_exercise.utils.Utils;

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

    @Test(priority = 1)
    public void RegisterUser() {
        new HomePage()
                .openPage()
                .verifyURL()
                .clickLoginButton()
        ;
        new LoginPage()
                .checkSignupFormTitle()
                .enterNewUserEmail("SelenideTest797@gmail.com")
                .enterNewUserName("John Doe")
                .clickSignupButton()
        ;
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
                .clickCreateAccountButton()
        ;
        new AccountCreatedPage()
                .verifyAccountCreatedTitle()
                .clickContinueButton()
                ;
        new HomePage()
                .checkLoggedUser("Alan Wake")
                .clickLogoutButton()
                ;
    }

    @Test(priority = 2)
    public void LoginUserWithCorrectEmailAndPassword() {
        new HomePage()
                .openPage()
                .verifyURL()
                .clickLoginButton();
        new LoginPage()
                .checkSignInTitle()
                .enterLoginEmail("SelenideTest797@gmail.com")
                .enterLoginPassword("MyTestPassword123!")
                .clickLoginButton();
        new HomePage()
                .checkLoggedUser("Alan Wake")
                .clickDeleteAccountButton()
                .checkAccountDeletedMessage()
                ;
    }
}
