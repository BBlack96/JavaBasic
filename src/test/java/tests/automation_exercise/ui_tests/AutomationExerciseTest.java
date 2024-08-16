package tests.automation_exercise.ui_tests;

import automation_exercise.pages.HomePage;
import automation_exercise.pages.LoginPage;
import automation_exercise.pages.SignupPage;
import automation_exercise.pages.AccountCreatedPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import automation_exercise.utils.Utils;

public class AutomationExerciseTest {

    @DataProvider(name = "UserInfo")
    public Object[][] UserInfo() {
        return new Object[][]{
                {"Alan", "Wake"},
                {"John", "Doe"},
                {"Jane", "Doe"}
        };
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

    @Test
    public void SecondTest(){
        new HomePage()
                .openPage()

        ;

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
