package locators;

import org.openqa.selenium.By;

public class WidgetsPageLocators {

    public enum WidgetsMainPage {
        ACCORDION(By.xpath("Accordian")),
        AUTO_COMPLETE(By.xpath("Auto Complete")),
        DATE_PICKER(By.xpath("Date Picker")),
        SLIDER(By.xpath("Slider")),
        PROGRESS_BAR(By.xpath("Progress Bar")),
        TABS(By.xpath("Tabs")),
        TOOL_TIPS(By.xpath("Tool Tips")),
        MENU(By.xpath("Menu")),
        SELECT_MENU(By.xpath("Select Menu"));

        private By locator;

        WidgetsMainPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
    public enum AccordionPage{
        SECTION_1_HEADING(By.id("section1Heading")),
        SECTION_1_CONTENT(By.id("section1Content")),
        SECTION_2_HEADING(By.id("section2Heading")),
        SECTION_2_CONTENT(By.id("section2Content")),
        SECTION_3_HEADING(By.id("section3Heading")),
        SECTION_3_CONTENT(By.id("section3Content"))
        ;

        private By locator;

        AccordionPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum AutoCompletePage{
        SINGLE(By.id("autoCompleteSingleContainer")),
        MULTIPLE(By.id("autoCompleteMultipleContainer"))
        ;

        private By locator;

        AutoCompletePage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum DatePickerPage{
        DATE_PICKER(By.id("datePickerMonthYearInput")),
        DATE_AND_TIME(By.id("dateAndTimePickerInput"))
        ;

        private By locator;

        DatePickerPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum SliderPage{
        SLIDER(By.xpath("//input[contains(@class, 'range-slider')]")),
        SLIDER_VALUE(By.id("sliderValue"))
        ;

        private By locator;

        SliderPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum ProgressBarPage{
        START_STOP_PROGRESS_BAR(By.id("startStopButton")),
        PROGRESS_BAR(By.id("progressBar"))
        ;

        private By locator;

        ProgressBarPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum TabsPage{
        WHAT_TAB(By.id("demo-tab-what")),
        ORIGIN_TAB(By.id("demo-tab-origin")),
        USE_TAB(By.id("demo-tab-use")),
        MORE_TAB(By.id("demo-tab-more")),
        WHAT_TAB_CONTENT(By.xpath("//div[@id='demo-tab-what']//p")),
        ORIGIN_TAB_CONTENT_1(By.xpath("(//div[@id='demo-tabpane-origin']/p)[1]")),
        ORIGIN_TAB_CONTENT_2(By.xpath("(//div[@id='demo-tabpane-origin']/p)[2]")),
        USE_TAB_CONTENT(By.xpath("//div[@id='demo-tabpane-use']/p")),
        ;

        private By locator;

        TabsPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum ToolTipsPage{
        TOOL_TIP_BUTTON(By.id("toolTipButton")),
        TEXT_FIELD_TOOL_TIP(By.id("texFieldToolTopContainer")),
        TEXT_TOOL_TIP_1(By.xpath("//div[@id='texToolTopContainer']/a[contains(text(), 'Contrary')]")),
        TEXT_TOOL_TIP_2(By.xpath("//div[@id='texToolTopContainer']/a[contains(text(), '1.10.32')]")),
        ;

        private By locator;

        ToolTipsPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum MenuPage{
        MAIN_ITEM_1(By.xpath("//ul[@id='nav']/li/a[text()='Main Item 1']")),
        MAIN_ITEM_2(By.xpath("//ul[@id='nav']/li/a[text()='Main Item 2']")),
        MAIN_ITEM_3(By.xpath("//ul[@id='nav']/li/a[text()='Main Item 3']")),
        MAIN_2_SUBITEM_1(By.xpath("(//ul[@id='nav']/li/ul/li)[1]")),
        MAIN_2_SUBITEM_2(By.xpath("(//ul[@id='nav']/li/ul/li)[2]")),
        MAIN_2_SUBLIST(By.xpath("(//ul[@id='nav']/li/ul/li)[3]")),
        MAIN_2_SUB_SUB_ITEM_1(By.xpath("(//ul[@id='nav']/li/ul/li)[3]/ul/li[1]")),
        MAIN_2_SUB_SUB_ITEM_2(By.xpath("(//ul[@id='nav']/li/ul/li)[3]/ul/li[2]")),
        ;
        private By locator;

        MenuPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum SelectMenuPage{
        SELECT_VALUE(By.id("withOptGroup")),
        SELECT_ONE(By.id("selectOne")),
        SELECT_MULTIPLE(By.id("oldSelectMenu")),
        MULTI_SELECT_DROP_DOWN(By.xpath("//div[text()='Select...']")),
        STANDARD_MULTI_SELECT(By.id("cars")),
        ;

        private By locator;

        SelectMenuPage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
}
