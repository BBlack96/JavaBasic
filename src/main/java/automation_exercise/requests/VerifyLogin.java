package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class VerifyLogin extends BaseRequest{

    public Response deleteAccount() {
        return sendDeleteRequest(ApiEndpoints.DELETE_ACCOUNT.getEndpoint());
    }

    public Response getAccount() {
        return sendGetRequest(ApiEndpoints.DELETE_ACCOUNT.getEndpoint());
    }

    public Response postAccount(String body) {
        return sendPostRequest(ApiEndpoints.DELETE_ACCOUNT.getEndpoint(), body);
    }

    public Response putAccount(String body) {
        return sendPutRequest(ApiEndpoints.DELETE_ACCOUNT.getEndpoint(), body);
    }
}
