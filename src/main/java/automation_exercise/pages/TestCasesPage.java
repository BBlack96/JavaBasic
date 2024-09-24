package automation_exercise.pages;

import io.qameta.allure.Step;

public class TestCasesPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/test_cases";

    @Step("Test Case page is displayed")
    public TestCasesPage checkTitle() {
        checkPageTitle("Automation Practice Website for UI Testing - Test Cases");
        return this;
    }
}
