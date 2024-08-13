package tests.demo_qa;

import demo_qa.pages.ElementsPage;
import org.testng.annotations.Test;

public class DemoQaTest {

    @Test
    public void firstTest() {
        new ElementsPage()
                .openPage()
                .openCheckBoxTab()
        ;
    }

}
