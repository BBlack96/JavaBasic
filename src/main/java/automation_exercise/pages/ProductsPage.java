package automation_exercise.pages;

public class ProductsPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/products/";

    public ProductsPage openPage() {
        open(pageUrl);
        return this;
    }

}
