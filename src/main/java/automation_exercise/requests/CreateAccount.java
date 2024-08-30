package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class CreateAccount extends BaseRequest {

    public Response postCreateAccount(String body) {
        return sendPostRequest(ApiEndpoints.CREATE_ACCOUNT.getEndpoint(), body);
    }

    public Response putCreateAccount(String body) {
        return sendPutRequest(ApiEndpoints.CREATE_ACCOUNT.getEndpoint(), body);
    }

    public Response deleteCreateAccount() {
        return sendDeleteRequest(ApiEndpoints.CREATE_ACCOUNT.getEndpoint());
    }

    public Response getCreateAccount() {
        return sendGetRequest(ApiEndpoints.CREATE_ACCOUNT.getEndpoint());
    }
}
