package automation_exercise.pages;

import automation_exercise.locators.AccountCreatedLocators;

public class AccountCreatedPage extends BasePage{

    final String pageUrl = "https://www.automationexercise.com/account_created";

    public AccountCreatedPage openPage() {
        open(pageUrl);
        return this;
    }

    public AccountCreatedPage verifyAccountCreatedTitle() {
        checkText(AccountCreatedLocators.ACCOUNT_CREATED_TITLE.getLocator(), "Account Created!");
        return this;
    }

    public AccountCreatedPage clickContinueButton() {
        $(AccountCreatedLocators.CONTINUE_BUTTON.getLocator()).click();
        return this;
    }

}
