package demo_qa.locators;

import org.openqa.selenium.By;

public class AlertsFramesWindowsPageLocators {
    public enum BrowserWindows {
        BROWSER_WINDOWS(By.xpath("//span[text()='Browser Windows']")),
        ALERTS(By.xpath("//span[text()='Alerts']")),
        FRAMES(By.xpath("//span[text()='Frames']")),
        NESTED_FRAMES(By.xpath("//span[text()='Nested Frames']")),
        MODAL_DIALOGS(By.xpath("//span[text()='Modal Dialogs']")),
        ;

        private final By locator;

        BrowserWindows(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum BrowserWindowsPage {
        TAB_BUTTON(By.id("tabButton")),
        WINDOW_BUTTON(By.id("windowButton")),
        MESSAGE_WINDOW_BUTTON(By.id("messageWindowButton")),
        ;

        private final By locator;

        BrowserWindowsPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum AlertsPage {
        ALERT_BUTTON(By.id("alertButton")),
        TIMER_ALERT_BUTTON(By.id("timerAlertButton")),
        CONFIRM_BUTTON(By.id("confirmButton")),
        PROMPT_BUTTON(By.id("promtButton")),
        ;
        private final By locator;

        AlertsPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum ModalDialogsPage {
        SMALL_MODAL_BUTTON(By.id("showSmallModal")),
        LARGE_MODAL_BUTTON(By.id("showLargeModal")),
        ;

        private final By locator;

        ModalDialogsPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
}
