package automation_exercise.pages;

import automation_exercise.locators.SignupLocators;

public class SignupPage extends BasePage {

    public SignupPage checkSignupFormTitle() {
        isVisible(SignupLocators.SIGNUP_FORM_TITLE.getLocator());
        return this;
    }

    public SignupPage selectMaleGender() {
        $(SignupLocators.MALE_GENDER_RADIO.getLocator()).click();
        return this;
    }

    public SignupPage selectFemaleGender() {
        $(SignupLocators.FEMALE_GENDER_RADIO.getLocator()).click();
        return this;
    }

    public SignupPage enterNewUserName(String name) {
        clearInput(SignupLocators.NAME_INPUT.getLocator());
        $(SignupLocators.NAME_INPUT.getLocator()).setValue(name);
        return this;
    }

    public SignupPage enterNewUserEmail(String email) {
        clearInput(SignupLocators.EMAIL_INPUT.getLocator());
        $(SignupLocators.EMAIL_INPUT.getLocator()).setValue(email);
        return this;
    }

    public SignupPage enterNewUserPassword(String password) {
        $(SignupLocators.PASSWORD_INPUT.getLocator()).setValue(password);
        return this;
    }

    public SignupPage selectDayOfBirth(int day) {
        $(SignupLocators.DAY_OF_BIRTH_SELECT.getLocator()).selectOption(day);
        return this;
    }

    public SignupPage selectMonthOfBirth(String month) {
        $(SignupLocators.MONTH_OF_BIRTH_SELECT.getLocator()).selectOption(month);
        return this;
    }

    public SignupPage selectYearOfBirth(String year) {
        $(SignupLocators.YEAR_OF_BIRTH_SELECT.getLocator()).selectOption(year);
        return this;
    }

    public SignupPage selectNewsletterSubscription() {
        $(SignupLocators.NEWSLETTER_CHECKBOX.getLocator()).click();
        return this;
    }

    public SignupPage selectSpecialOffersSubscription() {
        $(SignupLocators.SPECIAL_OFFERS_CHECKBOX.getLocator()).click();
        return this;
    }

    public SignupPage enterFirstName(String firstName) {
        $(SignupLocators.FIRST_NAME_INPUT.getLocator()).setValue(firstName);
        return this;
    }

    public SignupPage enterLastName(String lastName) {
        $(SignupLocators.LAST_NAME_INPUT.getLocator()).setValue(lastName);
        return this;
    }

    public SignupPage enterCompanyName(String companyName) {
        $(SignupLocators.NAME_OF_COMPANY_INPUT.getLocator()).setValue(companyName);
        return this;
    }

    public SignupPage enterAddress1(String address1) {
        $(SignupLocators.ADDRESS1_INPUT.getLocator()).setValue(address1);
        return this;
    }

    public SignupPage enterAddress2(String address2) {
        $(SignupLocators.ADDRESS2_INPUT.getLocator()).setValue(address2);
        return this;
    }

    public SignupPage selectCountry(String country) {
        $(SignupLocators.COUNTY_SELECT.getLocator()).selectOption(country);
        return this;
    }

    public SignupPage enterState(String state) {
        $(SignupLocators.STATE_INPUT.getLocator()).setValue(state);
        return this;
    }

    public SignupPage enterCity(String city) {
        $(SignupLocators.CITY_INPUT.getLocator()).setValue(city);
        return this;
    }

    public SignupPage enterZipCode(String zipCode) {
        $(SignupLocators.ZIP_CODE_INPUT.getLocator()).setValue(zipCode);
        return this;
    }

    public SignupPage enterMobileNumber(String mobileNumber) {
        $(SignupLocators.MOBILE_NUMBER_INPUT.getLocator()).setValue(mobileNumber);
        return this;
    }


    public SignupPage clickCreateAccountButton() {
        $(SignupLocators.CREATE_ACCOUNT_BUTTON.getLocator()).click();
        return this;
    }

    public SignupPage fillRegisterForm(String name, String password, int day, String month, String year
    , String firstName, String lastName, String companyName, String address1, String address2, String country,
                                       String state, String city, String zipCode, String mobileNumber) {
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
