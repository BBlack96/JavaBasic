package automation_exercise.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {
    private Dotenv dotenv;

    public EnvConfig() {
        dotenv = Dotenv.load();
    }

    public String getValidUserEmail() {
        return dotenv.get("VALID_USER_EMAIL");
    }

    public String getValidUserName() {
        return dotenv.get("VALID_USER_NAME");
    }

    public String getValidUserPassword() {
        return dotenv.get("VALID_USER_PASSWORD");
    }

    public String getInvalidUserEmail() {
        return dotenv.get("INVALID_USER_EMAIL");
    }

    public String getInvalidUserPassword() {
        return dotenv.get("INVALID_USER_PASSWORD");
    }

    public String getNewUserEmail() {
        return dotenv.get("NEW_USER_EMAIL");
    }

    public String getNewUserName() {
        return dotenv.get("NEW_USER_NAME");
    }

    public String getNewUserPassword() {
        return dotenv.get("NEW_USER_PASSWORD");
    }

    public String getNewUserFirstName() {
        return dotenv.get("NEW_USER_FIRST_NAME");
    }

    public String getNewUserLastName() {
        return dotenv.get("NEW_USER_LAST_NAME");
    }

    public String getNewUserCompanyName() {
        return dotenv.get("NEW_USER_COMPANY");
    }

    public String getNewUserAddress1() {
        return dotenv.get("NEW_USER_ADDRESS1");
    }

    public String getNewUserAddress2() {
        return dotenv.get("NEW_USER_ADDRESS2");
    }

    public String getNewUserCity() {
        return dotenv.get("NEW_USER_CITY");
    }

    public String getNewUserState() {
        return dotenv.get("NEW_USER_STATE");
    }

    public String getNewUserZipCode() {
        return dotenv.get("NEW_USER_ZIP_CODE");
    }

    public String getNewUserCountry() {
        return dotenv.get("NEW_USER_COUNTRY");
    }

    public String getNewUserMobileNumber() {
        return dotenv.get("NEW_USER_MOBILE_NUMBER");
    }

    public String getContactUserEmail() {
        return dotenv.get("CONTACT_US_USER_EMAIL");
    }

    public String getContactUserName() {
        return dotenv.get("CONTACT_US_USER_NAME");
    }

    public String getContactUserSubject() {
        return dotenv.get("CONTACT_US_USER_SUBJECT");
    }

    public String getContactUserMessage() {
        return dotenv.get("CONTACT_US_USER_MESSAGE");
    }

    public String getContactUserFileName() {
        return dotenv.get("CONTACT_US_USER_FILE_NAME");
    }

    public String getSubscriptionEmail() {
        return dotenv.get("SUBSCRIPTION_EMAIL");
    }


    public String getCardName() {
        return dotenv.get("CARD_NAME");
    }


    public String getCardNumber() {
        return dotenv.get("CARD_NUMBER");
    }

    public String getCardCVC() {
        return dotenv.get("CARD_CVC");
    }

    public String getCardExpiryMonth() {
        return dotenv.get("CARD_EXPIRY_MONTH");
    }

    public String getCardExpiryYear() {
        return dotenv.get("CARD_EXPIRY_YEAR");
    }

    public String getReviewMessage() {
        return dotenv.get("REVIEW_MESSAGE");
    }
}



