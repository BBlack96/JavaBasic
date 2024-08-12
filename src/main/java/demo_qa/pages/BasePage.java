package demo_qa.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


public class BasePage {
    static {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.timeout = 10000;
    }

    public void open(String url) {
        Selenide.open(url);

    }

    public SelenideElement $(By locator) {
        return Selenide.$(locator);
    }



}
