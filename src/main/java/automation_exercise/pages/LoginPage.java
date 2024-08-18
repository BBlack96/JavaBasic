package automation_exercise.pages;

import automation_exercise.locators.LoginLocators;

public class LoginPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/login";

    public LoginPage openPage() {
        open(pageUrl);
        return this;
    }

    public LoginPage checkSignupFormTitle() {
        isVisible(LoginLocators.SIGN_UP_FORM_TITLE.getLocator());
        return this;
    }

    public LoginPage checkSignInTitle() {
        isVisible(LoginLocators.SING_IN_TITLE.getLocator());
        return this;
    }

    public LoginPage enterNewUserName(String username) {
        $(LoginLocators.NEW_USERNAME_INPUT.getLocator()).setValue(username);
        return this;
    }

    public LoginPage enterNewUserEmail(String email) {
        $(LoginLocators.NEW_USER_EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    public LoginPage clickSignupButton() {
        $(LoginLocators.SIGNUP_BUTTON.getLocator()).click();
        return this;
    }

    public LoginPage enterLoginEmail(String email) {
        $(LoginLocators.LOGIN_EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    public LoginPage enterLoginPassword(String password) {
        $(LoginLocators.LOGIN_PASSWORD_INPUT.getLocator()).setValue(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        $(LoginLocators.LOGIN_BUTTON.getLocator()).click();
        return this;
    }

    public LoginPage checkWrongCredentialsMessage() {
        isVisible(LoginLocators.WRONG_CREDENTIALS_MESSAGE.getLocator());
        return this;
    }

    public LoginPage checkCurrentPage(){
        checkPageTitle("Automation Exercise - Signup / Login");
        return this;
    }

    public LoginPage checkExistingCredsMessage(){
        isVisible(LoginLocators.EXISTING_CREDS_MESSAGE.getLocator());
        return this;
    }


}
