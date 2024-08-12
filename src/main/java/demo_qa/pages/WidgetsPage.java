package demo_qa.pages;

public class WidgetsPage extends BasePage {

    final String pageUrl = "https://demoqa.com/widgets";

    public void openPage() {
        open(pageUrl);
    }
}
