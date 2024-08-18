package automation_exercise.pages;

public class TestCasesPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/test_cases";

    public TestCasesPage checkTitle() {
        checkPageTitle("Automation Practice Website for UI Testing - Test Cases");
        return this;
    }
}
