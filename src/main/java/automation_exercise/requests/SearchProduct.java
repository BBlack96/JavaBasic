package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class SearchProduct extends BaseRequest {

    public Response getSearchProduct() {
        return sendGetRequest(ApiEndpoints.SEARCH_PRODUCT.getEndpoint());
    }

    public Response postSearchProduct(String body) {
        return sendPostRequest(ApiEndpoints.SEARCH_PRODUCT.getEndpoint(), body);
    }

    public Response putSearchProduct(String body) {
        return sendPutRequest(ApiEndpoints.SEARCH_PRODUCT.getEndpoint(), body);
    }

    public Response deleteSearchProduct() {
        return sendDeleteRequest(ApiEndpoints.SEARCH_PRODUCT.getEndpoint());
    }
}
