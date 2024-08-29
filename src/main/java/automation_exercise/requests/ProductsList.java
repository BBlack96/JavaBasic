package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class ProductsList extends BaseRequest{

    public Response getProductsList() {
        return sendGetRequest(ApiEndpoints.PRODUCT_LIST.getEndpoint());
    }
}
