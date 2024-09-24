package automation_exercise.pages;

import automation_exercise.locators.SignupLocators;
import io.qameta.allure.Step;

public class SignupPage extends BasePage {

    @Step("Check if the signup form title is visible")
    public SignupPage checkSignupFormTitle() {
        isVisible(SignupLocators.SIGNUP_FORM_TITLE.getLocator());
        return this;
    }

    @Step("Select male gender")
    public SignupPage selectMaleGender() {
        $(SignupLocators.MALE_GENDER_RADIO.getLocator()).click();
        return this;
    }

    @Step("Select female gender")
    public SignupPage selectFemaleGender() {
        $(SignupLocators.FEMALE_GENDER_RADIO.getLocator()).click();
        return this;
    }

    @Step("Enter new user name: {name}")
    public SignupPage enterNewUserName(String name) {
        clearInput(SignupLocators.NAME_INPUT.getLocator());
        $(SignupLocators.NAME_INPUT.getLocator()).setValue(name);
        return this;
    }

    @Step("Enter new user email: {email}")
    public SignupPage enterNewUserEmail(String email) {
        clearInput(SignupLocators.EMAIL_INPUT.getLocator());
        $(SignupLocators.EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    @Step("Enter new user password")
    public SignupPage enterNewUserPassword(String password) {
        $(SignupLocators.PASSWORD_INPUT.getLocator()).setValue(password);
        return this;
    }

    @Step("Select day of birth: {day}")
    public SignupPage selectDayOfBirth(int day) {
        $(SignupLocators.DAY_OF_BIRTH_SELECT.getLocator()).selectOption(day);
        return this;
    }

    @Step("Select month of birth: {month}")
    public SignupPage selectMonthOfBirth(String month) {
        $(SignupLocators.MONTH_OF_BIRTH_SELECT.getLocator()).selectOption(month);
        return this;
    }

    @Step("Select year of birth: {year}")
    public SignupPage selectYearOfBirth(String year) {
        $(SignupLocators.YEAR_OF_BIRTH_SELECT.getLocator()).selectOption(year);
        return this;
    }

    @Step("Select newsletter subscription")
    public SignupPage selectNewsletterSubscription() {
        $(SignupLocators.NEWSLETTER_CHECKBOX.getLocator()).click();
        return this;
    }

    @Step("Select special offers subscription")
    public SignupPage selectSpecialOffersSubscription() {
        $(SignupLocators.SPECIAL_OFFERS_CHECKBOX.getLocator()).click();
        return this;
    }

    @Step("Enter first name: {firstName}")
    public SignupPage enterFirstName(String firstName) {
        $(SignupLocators.FIRST_NAME_INPUT.getLocator()).setValue(firstName);
        return this;
    }

    @Step("Enter last name: {lastName}")
    public SignupPage enterLastName(String lastName) {
        $(SignupLocators.LAST_NAME_INPUT.getLocator()).setValue(lastName);
        return this;
    }

    @Step("Enter company name: {companyName}")
    public SignupPage enterCompanyName(String companyName) {
        $(SignupLocators.NAME_OF_COMPANY_INPUT.getLocator()).setValue(companyName);
        return this;
    }

    @Step("Enter address 1: {address1}")
    public SignupPage enterAddress1(String address1) {
        $(SignupLocators.ADDRESS1_INPUT.getLocator()).setValue(address1);
        return this;
    }

    @Step("Enter address 2: {address2}")
    public SignupPage enterAddress2(String address2) {
        $(SignupLocators.ADDRESS2_INPUT.getLocator()).setValue(address2);
        return this;
    }

    @Step("Select country: {country}")
    public SignupPage selectCountry(String country) {
        $(SignupLocators.COUNTY_SELECT.getLocator()).selectOption(country);
        return this;
    }

    @Step("Enter state: {state}")
    public SignupPage enterState(String state) {
        $(SignupLocators.STATE_INPUT.getLocator()).setValue(state);
        return this;
    }

    @Step("Enter city: {city}")
    public SignupPage enterCity(String city) {
        $(SignupLocators.CITY_INPUT.getLocator()).setValue(city);
        return this;
    }

    @Step("Enter zip code: {zipCode}")
    public SignupPage enterZipCode(String zipCode) {
        $(SignupLocators.ZIP_CODE_INPUT.getLocator()).setValue(zipCode);
        return this;
    }

    @Step("Enter mobile number: {mobileNumber}")
    public SignupPage enterMobileNumber(String mobileNumber) {
        $(SignupLocators.MOBILE_NUMBER_INPUT.getLocator()).setValue(mobileNumber);
        return this;
    }

    @Step("Click on 'Create Account' button")
    public SignupPage clickCreateAccountButton() {
        $(SignupLocators.CREATE_ACCOUNT_BUTTON.getLocator()).click();
        return this;
    }

    @Step("Fill the registration form")
    public SignupPage fillRegisterForm(
            String gender,
            String name,
            String password,
            int day,
            String month,
            String year,
            String firstName,
            String lastName,
            String companyName,
            String address1,
            String address2,
            String country,
            String state,
            String city,
            String zipCode,
            String mobileNumber) {
        if (gender.equals("Mr.")) {
            selectMaleGender();
        } else {
            selectFemaleGender();
        }
        enterNewUserName(name);
        enterNewUserPassword(password);
        selectDayOfBirth(day);
        selectMonthOfBirth(month);
        selectYearOfBirth(year);
        enterFirstName(firstName);
        enterLastName(lastName);
        enterCompanyName(companyName);
        enterAddress1(address1);
        enterAddress2(address2);
        selectCountry(country);
        enterState(state);
        enterCity(city);
        enterZipCode(zipCode);
        enterMobileNumber(mobileNumber);
        return this;
    }
}
