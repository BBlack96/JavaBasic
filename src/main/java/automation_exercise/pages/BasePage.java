package automation_exercise.pages;

import org.openqa.selenium.By;
import com.codeborne.selenide.*;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BasePage {
    static {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/java/automation_exercise/utils/AdblockPlus.crx"));
        Configuration.browserCapabilities = options;
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

    }

    public void open(String url) {
        Selenide.open(url);
    }

    public SelenideElement $(By locator) {
        return Selenide.$(locator);
    }

    public ElementsCollection $$ (By locator) {
        return Selenide.$$(locator);
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

    public void checkText(By locator, String text) {
        $(locator).shouldHave(Condition.text(text));
    }

    public void clearInput(By locator) {
        $(locator).clear();
    }

    public void refresh() {
        Selenide.refresh();
    }

    public String getTitle() {
        return Selenide.title();
    }

    public void closeTab() {
        Selenide.closeWindow();
    }

    public void closeExtraTabs() {
        String originalHandle = WebDriverRunner.getWebDriver().getWindowHandle();
        for (String handle : WebDriverRunner.getWebDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                WebDriverRunner.getWebDriver().switchTo().window(handle);
                WebDriverRunner.getWebDriver().close();
            }
        }
        WebDriverRunner.getWebDriver().switchTo().window(originalHandle);
    }

    public void checkPageTitle(String title) {
        Selenide.title().equals(title);
    }

    public void acceptAlert(){
        WebDriverRunner.getWebDriver().switchTo().alert().accept();
    }

    public void clickByIndex(By locator, int index) {
        $$(locator).get(index).click();
    }



}


