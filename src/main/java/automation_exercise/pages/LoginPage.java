package automation_exercise.pages;

import automation_exercise.locators.LoginLocators;
import io.qameta.allure.Step;

public class LoginPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/login";

    @Step("Open the login page")
    public LoginPage openPage() {
        open(pageUrl);
        return this;
    }

    @Step("Check signup form title is visible")
    public LoginPage checkSignupFormTitle() {
        isVisible(LoginLocators.SIGN_UP_FORM_TITLE.getLocator());
        return this;
    }

    @Step("Check sign-in title is visible")
    public LoginPage checkSignInTitle() {
        isVisible(LoginLocators.SING_IN_TITLE.getLocator());
        return this;
    }

    @Step("Enter new user name: {username}")
    public LoginPage enterNewUserName(String username) {
        $(LoginLocators.NEW_USERNAME_INPUT.getLocator()).setValue(username);
        return this;
    }

    @Step("Enter new user email: {email}")
    public LoginPage enterNewUserEmail(String email) {
        $(LoginLocators.NEW_USER_EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    @Step("Click on signup button")
    public LoginPage clickSignupButton() {
        $(LoginLocators.SIGNUP_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Enter login email: {email}")
    public LoginPage enterLoginEmail(String email) {
        $(LoginLocators.LOGIN_EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    @Step("Enter login password")
    public LoginPage enterLoginPassword(String password) {
        $(LoginLocators.LOGIN_PASSWORD_INPUT.getLocator()).setValue(password);
        return this;
    }

    @Step("Click on login button")
    public LoginPage clickLoginButton() {
        $(LoginLocators.LOGIN_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check that the wrong credentials message is visible")
    public LoginPage checkWrongCredentialsMessage() {
        isVisible(LoginLocators.WRONG_CREDENTIALS_MESSAGE.getLocator());
        return this;
    }

    @Step("Check that the current page is 'Automation Exercise - Signup / Login'")
    public LoginPage checkCurrentPage() {
        checkPageTitle("Automation Exercise - Signup / Login");
        return this;
    }

    @Step("Check that the existing credentials message is visible")
    public LoginPage checkExistingCredsMessage() {
        isVisible(LoginLocators.EXISTING_CREDS_MESSAGE.getLocator());
        return this;
    }
}
