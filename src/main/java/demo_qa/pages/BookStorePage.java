package demo_qa.pages;

public class BookStorePage extends BasePage {

    final String pageUrl = "https://demoqa.com/books";

    public void openPage() {
        open(pageUrl);
    }
}
