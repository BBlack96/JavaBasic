package demo_qa.pages;

public class InteractionsPage extends BasePage {

    final String pageUrl = "https://demoqa.com/interactions";

    public InteractionsPage openPage() {
        open(pageUrl);
        return this;
    }
}
