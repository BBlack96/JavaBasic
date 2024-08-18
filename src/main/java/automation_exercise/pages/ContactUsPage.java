package automation_exercise.pages;

import automation_exercise.locators.ContactUsLocators;

import java.io.File;

public class ContactUsPage extends BasePage {

    private final String pageUrl = "https://www.automationexercise.com/contact_us";

    public ContactUsPage openPage() {
        open(pageUrl);
        return this;
    }

    public ContactUsPage checkGetInTouchTitle() {
        isVisible(ContactUsLocators.GET_IN_TOUCH_TITLE.getLocator());
        return this;
    }

    public ContactUsPage enterName(String name) {
        $(ContactUsLocators.NAME_INPUT.getLocator()).setValue(name);
        return this;
    }

    public ContactUsPage enterEmail(String email) {
        $(ContactUsLocators.EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    public ContactUsPage enterSubject(String subject) {
        $(ContactUsLocators.SUBJECT_INPUT.getLocator()).setValue(subject);
        return this;
    }

    public ContactUsPage enterMessage(String message) {
        $(ContactUsLocators.MESSAGE_INPUT.getLocator()).setValue(message);
        return this;
    }

    public ContactUsPage uploadFile(String fileName) {
        $(ContactUsLocators.UPLOAD_FILE_BUTTON.getLocator()).uploadFile(new File("src/main/java/automation_exercise/files_for_tests/" + fileName));
        return this;
    }

    public ContactUsPage clickSubmitButton() {
        $(ContactUsLocators.SUBMIT_BUTTON.getLocator()).click();
        return this;
    }

    public ContactUsPage OkAlert() {
        acceptAlert();
        return this;
    }

    public ContactUsPage isVisibleAlertStatusMessage() {
        isVisible(ContactUsLocators.ALERT_STATUS_MESSAGE.getLocator());
        return this;
    }

    public ContactUsPage clickHomeButton() {
        $(ContactUsLocators.HOME_BUTTON.getLocator()).click();
        return this;
    }
}
