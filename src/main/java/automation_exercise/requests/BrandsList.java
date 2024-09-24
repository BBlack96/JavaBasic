package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class BrandsList extends BaseRequest {

    public Response getBrandsList() {
        return sendGetRequest(ApiEndpoints.BRANDS_LIST.getEndpoint());
    }

    public Response postBrandsList(String body) {
        return sendPostRequest(ApiEndpoints.BRANDS_LIST.getEndpoint(), body);
    }

    public Response putBrandsList(String body) {
        return sendPutRequest(ApiEndpoints.BRANDS_LIST.getEndpoint(), body);
    }

    public Response deleteBrandsList() {
        return sendDeleteRequest(ApiEndpoints.BRANDS_LIST.getEndpoint());
    }
}
