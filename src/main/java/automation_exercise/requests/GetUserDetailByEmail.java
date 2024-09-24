package automation_exercise.requests;

import automation_exercise.endpoints.ApiEndpoints;
import io.restassured.response.Response;

public class GetUserDetailByEmail extends BaseRequest {

    public Response getUserDetailByEmail(String email) {
        return sendGetRequest(ApiEndpoints.GET_USER_DETAIL_BY_EMAIL.getEndpoint() + email);
    }

    public Response postUserDetailByEmail(String email, String body) {
        return sendPostRequest(ApiEndpoints.GET_USER_DETAIL_BY_EMAIL.getEndpoint() + email, body);
    }

    public Response putUserDetailByEmail(String email, String body) {
        return sendPutRequest(ApiEndpoints.GET_USER_DETAIL_BY_EMAIL.getEndpoint() + email, body);
    }

    public Response deleteUserDetailByEmail(String email) {
        return sendDeleteRequest(ApiEndpoints.GET_USER_DETAIL_BY_EMAIL.getEndpoint() + email);
    }
}
