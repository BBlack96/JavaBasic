package demo_qa.pages;

public class AlertsFramesWindowsPage extends BasePage {

    final String pageUrl = "https://demoqa.com/alertsFramesWindows";

    public AlertsFramesWindowsPage openPage() {
        open(pageUrl);
        return this;
    }


}
