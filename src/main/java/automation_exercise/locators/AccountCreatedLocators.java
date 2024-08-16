package automation_exercise.locators;

import org.openqa.selenium.By;

public enum AccountCreatedLocators {
    ACCOUNT_CREATED_TITLE(By.xpath("//h2[@data-qa='account-created']")),
    ACCOUNT_CREATED_FIRST_PARAGRAPH(By.xpath("//p[contains(text(), 'Congratulations')]")),
    ACCOUNT_CREATED_SECOND_PARAGRAPH(By.xpath("//p[contains(text(), 'shopping')]")),
    CONTINUE_BUTTON(By.xpath("//a[@data-qa='continue-button']")),
    ;

    private final By locator;

    AccountCreatedLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
