package automation_exercise.locators;

import org.openqa.selenium.By;

public enum CartLocators {
    FOOTER_SUBSCRIPTION_TITLE(By.xpath("//footer//h2")),
    SUBSCRIBE_EMAIL_INPUT(By.id("susbscribe_email")),
    SUBSCRIBE_BUTTON(By.id("subscribe")),
    SUCCESS_SUBSCRIPTION_MESSAGE(By.id("success-subscribe")),
    PRODUCT_NAME_IN_CART(By.xpath("//tbody/tr//a[text()='%s']")),
    PROCEED_TO_CHECKOUT_BUTTON(By.xpath("//a[text()='Proceed To Checkout']")),
    REGISTER_LOGIN_LINK(By.xpath("//div[@id='checkoutModal']//a[@href='/login']")),
    PRODUCT_QUANTITY_IN_CART(
            By.xpath("//tbody/tr//a[text()='%s']/../../../td[@class='cart_quantity']/button")),
    ADDRESS_DETAILS_TITLE(By.xpath("//h2[text()='Address Details']")),
    REVIEW_ORDER_TITLE(By.xpath("//h2[text()='Review Your Order']")),
    ORDER_MESSAGE(By.xpath("//div[@id='ordermsg']/textarea")),
    PLACE_ORDER_BUTTON(By.xpath("//a[@href='/payment']")),
    NAME_ON_CARD_INPUT(By.name("name_on_card")),
    CARD_NUMBER_INPUT(By.name("card_number")),
    CVC_INPUT(By.name("cvc")),
    EXPIRY_MONTH_INPUT(By.name("expiry_month")),
    EXPIRY_YEAR_INPUT(By.name("expiry_year")),
    CONFIRM_ORDER_BUTTON(By.id("submit")),
    ORDER_PLACED_MESSAGE(By.xpath("//b[text()='Order Placed!']")),
    DELETE_PRODUCT_BUTTON(By.xpath("//tbody/tr//a[text()='%s']/../../../td[@class='cart_delete']/a")),
    PRODUCTS_NAMES_IN_CART(
            By.xpath("//tr//td[@class='cart_description']//a[contains(text(), '%s')]")),
    DELIVERY_DESTINATION_TITLE(
            By.xpath(
                    "//ul[@id='address_delivery']/li[contains(@class, 'firstname') "
                            + "and contains(@class, 'lastname')]")),
    DOWNLOAD_INVOICE_LINK(By.xpath("//a[text()='Download Invoice']")),
    ;

    private final By locator;

    CartLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

    public By getLocator(String productName) {
        String xpath = String.format(locator.toString().replace("By.xpath: ", ""), productName);
        return By.xpath(xpath);
    }
}
