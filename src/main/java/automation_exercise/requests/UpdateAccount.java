package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class UpdateAccount extends BaseRequest{

    public Response deleteAccount() {
        return sendDeleteRequest(ApiEndpoints.UPDATE_ACCOUNT.getEndpoint());
    }

    public Response getAccount() {
        return sendGetRequest(ApiEndpoints.UPDATE_ACCOUNT.getEndpoint());
    }

    public Response postAccount(String body) {
        return sendPostRequest(ApiEndpoints.UPDATE_ACCOUNT.getEndpoint(), body);
    }

    public Response putAccount(String body) {
        return sendPutRequest(ApiEndpoints.UPDATE_ACCOUNT.getEndpoint(), body);
    }
}
