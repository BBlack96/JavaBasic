package tests.automation_exercise.ui_tests;

import automation_exercise.pages.HomePage;
import automation_exercise.pages.LoginPage;
import automation_exercise.pages.SignupPage;
import org.testng.annotations.Test;

public class AutomationExerciseTest {

    @Test
    public void firstTest() {
        new HomePage()
                .openPage()
                .verifyURL()
                .clickLoginButton()
        ;
        new LoginPage()
                .checkSignupFormTitle()
                .enterNewUserEmail("SelenideTest@gmail.com")
                .enterNewUserName("Alan Wake")
                .clickSignupButton()
                ;
        new SignupPage()
                .checkSignupFormTitle()
                ;
    }
}
