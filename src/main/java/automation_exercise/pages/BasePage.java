package automation_exercise.pages;

import org.openqa.selenium.By;
import com.codeborne.selenide.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    static {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.automationexercise.com";
        Configuration.timeout = 10000;

    }

    public void open(String url) {
        Selenide.open(url);
    }

    public SelenideElement $(By locator) {
        return Selenide.$(locator);
    }

    public void isVisible(By locator) {
        $(locator).shouldHave(Condition.visible);
    }

    public void isNotVisible(By locator) {
        $(locator).shouldNotBe(Condition.visible);
    }

    public String getURL() {
        return WebDriverRunner.url();
    }

    public boolean checkURL(String url) {
        return WebDriverRunner.url().equals(url);
    }

    public void checkText(By locator, String text){
        $(locator).shouldHave(Condition.text(text));
    }

    public void clearInput(By locator){
        $(locator).clear();
    }

    public void refresh(){
        Selenide.refresh();
    }

    public String getTitle(){
        return Selenide.title();
    }

    public void closeTab(){
        Selenide.closeWindow();
    }


}


