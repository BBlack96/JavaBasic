package automation_exercise.pages;

import org.openqa.selenium.By;
import com.codeborne.selenide.*;

public class BasePage {
    static {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.automationexercise.com/";
        Configuration.timeout = 10000;
    }

    public void open(String url) {
        Selenide.open(url);
    }

    public SelenideElement $(By locator) {
        return Selenide.$(locator);
    }

    public void isVisible(By locator) {
        Selenide.$(locator).shouldHave(Condition.visible);
    }

    public void isNotVisible(By locator) {
        Selenide.$(locator).shouldNot(Condition.visible);
    }

    public String getURL() {
        return WebDriverRunner.url();
    }

    public boolean checkURL(String url) {
        return WebDriverRunner.url().equals(url);
    }

    public void checkText(By locator, String text){
        Selenide.$(locator).shouldHave(Condition.text(text));
    }

}


