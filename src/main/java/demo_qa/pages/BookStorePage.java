package demo_qa.pages;

public class BookStorePage extends BasePage {

    final String pageUrl = "https://demoqa.com/books";

    public BookStorePage openPage() {
        open(pageUrl);
        return this;
    }
}
