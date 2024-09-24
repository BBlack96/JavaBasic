package automation_exercise.locators;

import org.openqa.selenium.By;

public enum LoginLocators {
    SIGN_UP_FORM_TITLE(By.xpath("//h2[text()='New User Signup!']")),
    NEW_USERNAME_INPUT(By.xpath("//input[@data-qa='signup-name']")),
    NEW_USER_EMAIL_INPUT(By.xpath("//input[@data-qa='signup-email']")),
    SIGNUP_BUTTON(By.xpath("//button[@data-qa='signup-button']")),
    LOGIN_EMAIL_INPUT(By.xpath("//input[@data-qa='login-email']")),
    LOGIN_PASSWORD_INPUT(By.xpath("//input[@data-qa='login-password']")),
    LOGIN_BUTTON(By.xpath("//button[@data-qa='login-button']")),
    SING_IN_TITLE(By.xpath("//div[@class='login-form']/h2")),
    WRONG_CREDENTIALS_MESSAGE(By.xpath("//form[@action='/login']/p")),
    EXISTING_CREDS_MESSAGE(By.xpath("//form[@action='/signup']/p")),
    ;

    private final By locator;

    LoginLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
