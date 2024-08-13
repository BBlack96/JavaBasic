package demo_qa.pages;

public class FormsPage extends BasePage {

    final String pageUrl = "https://demoqa.com/forms";

    public FormsPage openPage() {
        open(pageUrl);
        return this;
    }
}
