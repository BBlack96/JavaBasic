package automation_exercise.locators;

import org.openqa.selenium.By;

public enum SignupLocators {
    SIGNUP_FORM_TITLE(By.xpath("//div[@class='login-form']/h2")),
    MALE_GENDER_RADIO(By.id("id_gender1")),
    FEMALE_GENDER_RADIO(By.id("id_gender2")),
    NAME_INPUT(By.id("name")),
    EMAIL_INPUT(By.id("email")),
    PASSWORD_INPUT(By.id("password")),
    DAY_OF_BIRTH_SELECT(By.id("days")),
    MONTH_OF_BIRTH_SELECT(By.id("months")),
    YEAR_OF_BIRTH_SELECT(By.id("years")),
    NEWSLETTER_CHECKBOX(By.id("newsletter")),
    SPECIAL_OFFERS_CHECKBOX(By.id("optin")),
    FIRST_NAME_INPUT(By.id("first_name")),
    LAST_NAME_INPUT(By.id("last_name")),
    NAME_OF_COMPANY_INPUT(By.id("company")),
    ADDRESS1_INPUT(By.id("address1")),
    ADDRESS2_INPUT(By.id("address2")),
    COUNTY_SELECT(By.id("country")),
    STATE_INPUT(By.id("state")),
    CITY_INPUT(By.id("city")),
    ZIP_CODE_INPUT(By.id("zipcode")),
    MOBILE_NUMBER_INPUT(By.id("mobile_number")),
    CREATE_ACCOUNT_BUTTON(By.xpath("//button[@data-qa='create-account']"));

    private final By locator;

    SignupLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }
}
