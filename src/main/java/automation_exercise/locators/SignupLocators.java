package automation_exercise.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public enum SignupLocators {
    SIGNUP_FORM_TITLE(By.xpath("//div[@class='login-form']/h2")),
    ;

    private final By locator;

    SignupLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
