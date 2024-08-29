package automation_exercise.pages;

import org.openqa.selenium.By;
import com.codeborne.selenide.*;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class BasePage {
    static {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/java/automation_exercise/utils/AdBlock.crx"));
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

    public void areVisible(By locator) {
        $$(locator).forEach(element -> element.shouldBe(Condition.visible));
    }

    public void isNotVisible(By locator) {
        $(locator).shouldNotBe(Condition.visible);
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

    public List<String> getElementsText(By locator) {
        return $$(locator).stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());
    }

}


