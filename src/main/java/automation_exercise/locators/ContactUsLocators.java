package automation_exercise.locators;

import org.openqa.selenium.By;

public enum ContactUsLocators {
    GET_IN_TOUCH_TITLE(By.xpath("//div[@class='contact-form']/h2")),
    NAME_INPUT(By.name("name")),
    EMAIL_INPUT(By.name("email")),
    SUBJECT_INPUT(By.name("subject")),
    MESSAGE_INPUT(By.name("message")),
    UPLOAD_FILE_BUTTON(By.name("upload_file")),
    SUBMIT_BUTTON(By.name("submit")),
    ALERT_STATUS_MESSAGE(By.xpath("//div[contains(@class, 'status')]")),
    HOME_BUTTON(By.xpath("//div[@id='form-section']/a"))
    ;

    private final By locator;

    ContactUsLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
