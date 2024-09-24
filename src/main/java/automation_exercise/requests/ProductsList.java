package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class ProductsList extends BaseRequest {

    public Response getProductsList() {
        return sendGetRequest(ApiEndpoints.PRODUCT_LIST.getEndpoint());
    }

    public Response postProductsList(String body) {
        return sendPostRequest(ApiEndpoints.PRODUCT_LIST.getEndpoint(), body);
    }

    public Response putProductsList(String body) {
        return sendPutRequest(ApiEndpoints.PRODUCT_LIST.getEndpoint(), body);
    }

    public Response deleteProductsList() {
        return sendDeleteRequest(ApiEndpoints.PRODUCT_LIST.getEndpoint());
    }
}
