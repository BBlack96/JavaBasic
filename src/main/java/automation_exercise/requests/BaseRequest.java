package automation_exercise.requests;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseRequest {

    public Response sendGetRequest(String endpoint) {
        return RestAssured.given().when().get(endpoint);
    }

    public Response sendPostRequest(String endpoint, String body) {
        return RestAssured.given().contentType("application/json").body(body).when().post(endpoint);
    }

    public Response sendPutRequest(String endpoint, String body) {
        return RestAssured.given().contentType("application/json").body(body).when().put(endpoint);
    }

    public Response sendDeleteRequest(String endpoint) {
        return RestAssured.given().when().delete(endpoint);
    }

}
