package tests.automation_exercise.api_tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AutomationExerciseApiTest extends BaseApiRequest {

    @Test
    public void GetAllProductsList(){
        productsList.getProductsList();
        Assert.assertEquals(productsList.getProductsList().getStatusCode(), 200);
        Assert.assertEquals(productsList.getProductsList().jsonPath().getString("products[0].name"), "Blue Top");
    }
}
