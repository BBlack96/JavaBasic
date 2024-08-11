package locators;

import org.openqa.selenium.By;

public enum FormsPageLocators {
    FIRST_NAME(By.id("firstName")),
    LAST_NAME(By.id("lastName")),
    EMAIL(By.id("userEmail")),
    MALE_GENDER(By.id("gender-radio-1")),
    FEMALE_GENDER(By.id("gender-radio-2")),
    OTHER_GENDER(By.id("gender-radio-3")),
    MOBILE_NUMBER(By.id("userNumber")),
    DATE_OF_BIRTH(By.id("dateOfBirthInput")),
    SUBJECTS_INPUT(By.id("subjectsContainer")),
    SPORTS_HOBBY(By.id("hobbies-checkbox-1")),
    READING_HOBBY(By.id("hobbies-checkbox-2")),
    MUSIC_HOBBY(By.id("hobbies-checkbox-3")),
    UPLOAD_PICTURE(By.id("uploadPicture")),
    CURRENT_ADDRESS(By.id("currentAddress")),
    STATE_DROPDOWN(By.id("state")),
    CITY_DROPDOWN(By.id("city")),
    SUBMIT_BUTTON(By.id("submit")),
    SUBMITTED_FORM(By.xpath("//div[@role='document']")),
    CLOSE_MODAL_BUTTON(By.id("closeLargeModal"));

    private final By locator;

    FormsPageLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

}
