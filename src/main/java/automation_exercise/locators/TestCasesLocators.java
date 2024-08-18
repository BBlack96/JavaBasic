package automation_exercise.locators;

import org.openqa.selenium.By;

public enum TestCasesLocators {
    TITLE(By.xpath("//title")),
    ;

    private final By locator;

    TestCasesLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
