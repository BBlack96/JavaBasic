// BaseTest.java
package tests;

import pages.ElementsPage;
import pages.InteractionsPage;
import pages.WidgetsPage;
import pages.BookStorePage;
import pages.AlertsFramesWindowsPage;

public class BaseTest {
    private static ElementsPage elementsPage;
    private static InteractionsPage interactionsPage;
    private static WidgetsPage widgetsPage;
    private static BookStorePage bookStorePage;
    private static AlertsFramesWindowsPage alertsFramesWindowsPage;

    public static ElementsPage elementsPage() {
        return elementsPage == null ? elementsPage = new ElementsPage() : elementsPage;
    }

    public static InteractionsPage interactionsPage() {
        return interactionsPage == null ? interactionsPage = new InteractionsPage() : interactionsPage;
    }

    public static WidgetsPage widgetsPage() {
        return widgetsPage == null ? widgetsPage = new WidgetsPage() : widgetsPage;
    }

    public static BookStorePage bookStorePage() {
        return bookStorePage == null ? bookStorePage = new BookStorePage() : bookStorePage;
    }

    public static AlertsFramesWindowsPage alertsFramesWindowsPage() {
        return alertsFramesWindowsPage == null ? alertsFramesWindowsPage = new AlertsFramesWindowsPage() : alertsFramesWindowsPage;
    }
}