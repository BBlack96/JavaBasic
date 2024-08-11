package tests.positive;

import org.testng.annotations.Test;
import tests.BaseTest;

public class DemoQaTest extends BaseTest {

    @Test
    public void firstTest() {
        elementsPage().openPage();
        elementsPage().openCheckBoxTab();
        elementsPage().clickCheckBox();



    }

}
