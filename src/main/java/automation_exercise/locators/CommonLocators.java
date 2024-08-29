package automation_exercise.locators;

import org.openqa.selenium.By;

public enum CommonLocators {
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
    CONTINUE_SHOPPING_BUTTON(By.xpath("//button[text()='Continue Shopping']")),
    VIEW_CART_LINK(By.xpath("//div[@id='cartModal']//a")),
    PRODUCT_LINK(By.xpath("//div[contains(@class, 'productinfo')]/p[text()='%s']/../a")),
    PRODUCT_QUANTITY(By.id("quantity")),
    ADD_TO_CART_BUTTON(By.xpath("//div[@class='product-information']//button")),
    BRANDS_LIST(By.xpath("//div[@class='brands_products']")),
    POLO_BRAND(By.xpath("//a[@href='/brand_products/Polo']")),
    HIM_BRAND(By.xpath("//a[@href='/brand_products/H&M']")),
    MADAME_BRAND(By.xpath("//a[@href='/brand_products/Madame']")),
    MAST_AND_HARBOR_BRAND(By.xpath("//a[@href='/brand_products/Mast & Harbour']")),
    BABY_HUG_BRAND(By.xpath("//a[@href='/brand_products/Babyhug']")),
    PRODUCT_LIST(By.xpath("//div[@class='features_items']")),
    ALL_ADD_TO_CART(By.xpath("//div[contains(@class, 'productinfo')]//a[contains(@class, 'add-to-cart')]")),
    WRITE_YOUR_REVIEW_TITLE_ON_PRODUCT_PAGE(By.xpath("//a[text()='Write Your Review']")),
    REVIEW_NAME_INPUT(By.id("name")),
    REVIEW_EMAIL_INPUT(By.id("email")),
    REVIEW_MESSAGE_INPUT(By.id("review")),
    SUBMIT_REVIEW_BUTTON(By.id("button-review")),
    SUCCESS_REVIEW_ALERT(By.xpath("//div[@id='review-section']//div[contains(@class, 'alert-success')]")),
    ;

    private final By locator;

    CommonLocators(By locator) {
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