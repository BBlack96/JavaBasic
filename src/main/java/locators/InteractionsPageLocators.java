package locators;

import org.openqa.selenium.By;

public class InteractionsPageLocators {

    public enum InteractionsPage {
        SORTABLE(By.id("item-0")),
        SELECTABLE(By.id("item-1")),
        RESIZEABLE(By.id("item-2")),
        DROPPABLE(By.id("item-3")),
        DRAGGABLE(By.id("item-4")),
        ;
        private final By locator;

        InteractionsPage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }

    public enum SortablePage {
        LIST_CONTAINER(By.xpath("//div[@class='tab-content']/div[@id='demo-tabpane-list']/div")),
        TAB_LIST(By.id("demo-tab-list")),
        TAB_GRID(By.id("demo-tab-grid")),
        GRID_CONTAINER(By.xpath("//div[@class='tab-content']/div[@id='demo-tabpane-grid']"))
        ;
        private final By locator;

        SortablePage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
    public enum SelectablePage {
        LIST_CONTAINER(By.id("verticalListContainer")),
        TAB_LIST(By.id("demo-tab-list")),
        TAB_GRID(By.id("demo-tab-grid")),
        GRID_CONTAINER(By.id("gridContainer")),
        GRID_ROW_1(By.id("row1")),
        GRID_ROW_2(By.id("row2")),
        GRID_ROW_3(By.id("row3")),
        ;
        private final By locator;

        SelectablePage(By locator) {
            this.locator = locator;
        }

        public By getLocator() {
            return locator;
        }
    }
    public enum DroppablePage{
        SIMPLE_TAB(By.id("droppableExample-tab-simple")),
        ACCEPT_TAB(By.id("droppableExample-tab-accept")),
        PREVENT_PROPAGATION_TAB(By.id("droppableExample-tab-preventPropogation")),
        REVERT_DRAGGABLE_TAB(By.id("droppableExample-tab-revertable")),

        ;
        private final By locator;

        DroppablePage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
    public enum DraggablePage{
        SIMPLE_TAB(By.id("draggableExample-tab-simple")),
        AXIS_RESTRICTED(By.id("draggableExample-tab-axisRestriction")),
        CONTAINER_RESTRICTED(By.id("draggableExample-tab-containerRestriction")),
        CURSOR_STYLE(By.id("draggableExample-tab-cursorStyle")),
        ;
        private final By locator;

        DraggablePage(By locator){
            this.locator = locator;
        }

        public By getLocator(){
            return locator;
        }
    }
}
