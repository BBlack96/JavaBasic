package automation_exercise.pages;

import automation_exercise.locators.SignupLocators;

public class SignupPage extends BasePage {

    public SignupPage checkSignupFormTitle() {
        checkText(SignupLocators.SIGNUP_FORM_TITLE.getLocator(), "Enter Account Information");
        return this;
    }
}
