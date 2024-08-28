package automation_exercise.locators;

import org.openqa.selenium.By;

public enum HomeLocators {
    LOGO(By.xpath("//div[contains(@class, 'logo ')]")),
    PRODUCTS_BUTTON(By.xpath("//a[text()=' Products']")),
    CART_BUTTON(By.xpath("//a[text()=' Cart']")),
    LOGIN_BUTTON(By.xpath("//a[contains(text(), 'Login')]")),
    CONTACT_US_BUTTON(By.xpath("//a[contains(text(), 'Contact')]")),
    LOGGED_USER_FIELD(By.xpath("//i[contains(@class, 'fa fa-user')]/..")),
    DELETE_ACCOUNT_BUTTON(By.xpath("//a[text()=' Delete Account']")),
    ACCOUNT_DELETED_MESSAGE(By.xpath("//h2/b[text()='Account Deleted!']")),
    LOGOUT_BUTTON(By.xpath("//a[text()=' Logout']")),
    TEST_CASES_BUTTON(By.xpath("//a[text()=' Test Cases']")),
    FOOTER_SUBSCRIPTION_TITLE(By.xpath("//footer//h2")),
    SUBSCRIBE_EMAIL_INPUT(By.id("susbscribe_email")),
    SUBSCRIBE_BUTTON(By.id("subscribe")),
    SUCCESS_SUBSCRIPTION_MESSAGE(By.id("success-subscribe")),
    PRODUCTS_CATEGORY_LIST(By.id("accordian")),
    WOMEN_CATEGORY(By.xpath("//a[@href='#Women']")),
    DRESS_WOMEN_SUBCATEGORY(By.xpath("//div[@id='Women']//a[text()='Dress ']")),
    TOPS_WOMEN_SUBCATEGORY(By.xpath("//div[@id='Women']//a[text()='Tops ']")),
    SAREE_WOMEN_SUBCATEGORY(By.xpath("//div[@id='Women']//a[text()='Saree ']")),
    DRESS_SUBCATEGORY_TITLE(By.xpath("//h2[text()='Women - Dress Products']")),
    MEN_TSHIRTS_SUBCATEGORY_TITLE(By.xpath("//h2[text()='Men - Tshirts Products']")),
    MEN_CATEGORY(By.xpath("//a[@href='#Men']")),
    TSHIRTS_MEN_SUBCATEGORY(By.xpath("//div[@id='Men']//a[text()='Tshirts ']")),
    JEANS_MEN_SUBCATEGORY(By.xpath("//div[@id='Men']//a[text()='Jeans ']")),
    KIDS_CATEGORY(By.xpath("//a[@href='#Kids']")),
    ;

    private final By locator;

    HomeLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }



}
