package tests.positive;

import org.testng.annotations.Test;
import tests.BaseTest;

public class DemoQaTest extends BaseTest {

    @Test
    public void firsTest() {
        elementsPage().openPage();
        elementsPage().clickTextBox();
        elementsPage().setFullName("John Doe");

    }

}
