package automation_exercise.locators;

import org.openqa.selenium.By;

public enum ContactUsLocators {
    SOME_LOCATOR(By.xpath("//some_locator")),
    ;

    private final By locator;

    ContactUsLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
