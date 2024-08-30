package tests.automation_exercise.api_tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.fasterxml.jackson.databind.JsonNode;

public class AutomationExerciseApiTest extends BaseApiRequest {

    @Test
    public void GetAllProductsList(){
        productsList.getProductsList();
        Assert.assertEquals(productsList.getProductsList().getStatusCode(), 200);
        Assert.assertEquals(productsList.getProductsList().jsonPath().getString("products[0].name"), "Blue Top");
    }

    @Test
    public void PostToAllProductsList(){
        productsList.postProductsList(" ");
        Assert.assertEquals(productsList.postProductsList("").getStatusCode(), 200);
        Assert.assertEquals(productsList.postProductsList("").jsonPath().getString("responseCode"), "405");
        Assert.assertEquals(productsList.postProductsList("").jsonPath().getString("message"), "This request method is not supported.");
    }

    @Test
    public void GetAllBrandsList(){
        brandsList.getBrandsList();
        Assert.assertEquals(brandsList.getBrandsList().getStatusCode(), 200);
        Assert.assertEquals(brandsList.getBrandsList().jsonPath().getString("brands[0].brand"), "Polo");
    }

    @Test
    public void PutToAllBrandsList(){
        brandsList.postBrandsList(" ");
        Assert.assertEquals(productsList.postProductsList("").jsonPath().getString("responseCode"), "405");
        Assert.assertEquals(productsList.postProductsList("").jsonPath().getString("message"), "This request method is not supported.");
    }

    @Test
    public void PostToSearchProduct(){
        JsonNode searchProductBody = jsonReader.getRequestBody("searchRequest");
        productsList.postProductsList(searchProductBody.toString());
        Assert.assertEquals(productsList.postProductsList("").getStatusCode(), 200);
        Assert.assertEquals(productsList.postProductsList("").jsonPath().getString("responseCode"), "405");
        Assert.assertEquals(productsList.postProductsList("").jsonPath().getString("message"), "This request method is not supported.");
    }
}
