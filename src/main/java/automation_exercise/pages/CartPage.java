package automation_exercise.pages;

public class CartPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/view_cart";

    public CartPage openPage() {
        open(pageUrl);
        return this;
    }
}
