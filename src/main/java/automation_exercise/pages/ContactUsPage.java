package automation_exercise.pages;

import automation_exercise.locators.ContactUsLocators;
import io.qameta.allure.Step;

import java.io.File;

public class ContactUsPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/contact_us";

    public ContactUsPage openPage() {
        open(pageUrl);
        return this;
    }

    @Step("Check if Contact Us page is opened")
    public ContactUsPage checkGetInTouchTitle() {
        isVisible(ContactUsLocators.GET_IN_TOUCH_TITLE.getLocator());
        return this;
    }

    @Step("Enter name: {name}")
    public ContactUsPage enterName(String name) {
        $(ContactUsLocators.NAME_INPUT.getLocator()).setValue(name);
        return this;
    }

    @Step("Enter email: {email}")
    public ContactUsPage enterEmail(String email) {
        $(ContactUsLocators.EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    @Step("Enter subject: {subject}")
    public ContactUsPage enterSubject(String subject) {
        $(ContactUsLocators.SUBJECT_INPUT.getLocator()).setValue(subject);
        return this;
    }

    @Step("Enter message: {message}")
    public ContactUsPage enterMessage(String message) {
        $(ContactUsLocators.MESSAGE_INPUT.getLocator()).setValue(message);
        return this;
    }

    @Step("Upload file: {fileName}")
    public ContactUsPage uploadFile(String fileName) {
        $(ContactUsLocators.UPLOAD_FILE_BUTTON.getLocator())
                .uploadFile(new File("src/main/java/automation_exercise/files_for_tests/" + fileName));
        return this;
    }

    @Step("Click Submit button")
    public ContactUsPage clickSubmitButton() {
        $(ContactUsLocators.SUBMIT_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Check if alert is displayed")
    public ContactUsPage OkAlert() {
        acceptAlert();
        return this;
    }

    @Step("Check if alert is displayed")
    public ContactUsPage isVisibleAlertStatusMessage() {
        isVisible(ContactUsLocators.ALERT_STATUS_MESSAGE.getLocator());
        return this;
    }

    @Step("Click Home button")
    public ContactUsPage clickHomeButton() {
        $(ContactUsLocators.HOME_BUTTON.getLocator()).click();
        return this;
    }
}
