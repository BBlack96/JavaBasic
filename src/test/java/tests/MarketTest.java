package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MarketTest {


    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!"},
                {"anotheruser", "password123"},
                {"text", "password"}
        };
    }

    @DataProvider(name = "searchData")
    public Object[] searchData() {
        return new Object[]
                {"Selenide", "Selenium", "Playwright", "Appium"};
    }

    @DataProvider(name = "booksNames")
    public Object[] booksNames() {
        return new Object[]
                {
                        "Git Pocket Guide",
                        "Learning JavaScript Design Patterns",
                        "Designing Evolvable Web APIs with ASP.NET",
                        "Speaking JavaScript",
                        "You Don't Know JS",
                        "Programming JavaScript Applications",
                        "Eloquent JavaScript, Second Edition",
                        "Understanding"};
    }

    @Test
    public void positiveAuthorization() {
        open("https://the-internet.herokuapp.com/login");
        $(By.xpath("//input[@id='username']")).setValue("tomsmith");
        $(By.xpath("//input[@id='password']")).setValue("SuperSecretPassword!");
        $(By.xpath("//form[@id='login']/button")).click();
        $(By.id("flash-messages")).shouldHave(text("You logged into a secure area!"));
    }

    @Test(dataProvider = "loginData")
    public void positiveAuthorizationByCSS(String username, String password) {
        open("https://the-internet.herokuapp.com/login");
        $(By.xpath("//input[@id='username']")).setValue(username);
        $(By.cssSelector("#password")).setValue(password);
        $(By.xpath("//form[@id='login']/button")).click();
        $(By.cssSelector("#flash")).shouldHave(text("You logged into a secure area!"));
    }

    @Test(dataProvider = "searchData")
    public void searchGoogle(String searchParameter) {
        open("https://www.google.com/");
        $(By.id("APjFqb")).shouldBe(visible);
        $(By.id("APjFqb")).setValue(searchParameter).pressEnter();
        $("title").shouldHave(text(searchParameter + " - Пошук Google"), Duration.ofSeconds(4));
    }

    @Test
    public void newPositiveAuthorization() {
        open("https://the-internet.herokuapp.com/login");
        $(By.id("login")).shouldBe(visible, Duration.ofSeconds(5));
        $(By.id("username")).setValue("tomsmith");
        $(By.id("password")).setValue("SuperSecretPassword!");
        $(By.xpath("//form[@id='login']/button")).click();
        $(By.id("flash-messages")).shouldHave(text("You logged into a secure area!"));
    }

    @Test
    public void checkSamsungMonitors() {
        open("https://rozetka.com.ua/");
        $(By.name("search")).setValue("Samsung Odyssey g5").pressEnter();
        $(By.className("catalog")).shouldBe(visible, Duration.ofSeconds(5));
        ElementsCollection monitors = $$(By.xpath("//span[contains(@class, 'goods-tile__title')]"));
        monitors.forEach(System.out::println);
    }


    @Test(dataProvider = "booksNames")
    public void checkMethod(String booksNames) {
        open("https://demoqa.com/books");
        $(By.xpath("//input[@placeholder='Type to search']")).setValue(booksNames).pressEnter();
        ElementsCollection books = $$(By.xpath("//span[@class='mr-2']"));
        for (SelenideElement book : books) {
            book.shouldHave(text(booksNames));
            if (books.isEmpty()) {
                System.out.println("Книга " + booksNames + " не найдена");
            }

        }
    }
}
