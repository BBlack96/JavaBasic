package tests.demo_qa;

import org.testng.annotations.Test;

public class DemoQaTest extends BaseTest {

    @Test
    public void firstTest() {
        elementsPage().openPage();
        elementsPage().openCheckBoxTab();
        elementsPage().clickCheckBox();



    }

}
