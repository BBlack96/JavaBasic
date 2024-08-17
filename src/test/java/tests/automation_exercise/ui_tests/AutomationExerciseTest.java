package tests.automation_exercise.ui_tests;

import automation_exercise.pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation_exercise.utils.Utils;

public class AutomationExerciseTest {

    @BeforeTest
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

    @Test
    public void firstTest() {
        new HomePage()
                .openPage()
                .verifyURL()
                .clickLoginButton()
        ;
        new LoginPage()
                .checkSignupFormTitle()
                .enterNewUserEmail("SelenideTest"+ Utils.getRandomNumber() + "@gmail.com")
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
                .checkLoggedUser("Alan Wake");
    }
}
