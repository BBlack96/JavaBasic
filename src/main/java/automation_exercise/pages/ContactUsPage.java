package automation_exercise.pages;

public class ContactUsPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/contact_us";

    public ContactUsPage openPage() {
        open(pageUrl);
        return this;
    }
}
