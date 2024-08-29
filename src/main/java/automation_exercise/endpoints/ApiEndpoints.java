package automation_exercise.endpoints;

public enum ApiEndpoints {

    PRODUCT_LIST("https://automationexercise.com/api/productsList"),
    BRANDS_LIST("https://automationexercise.com/api/brandsList"),
    SEARCH_PRODUCT("https://automationexercise.com/api/searchProduct"),
    VERIFY_LOGIN("https://automationexercise.com/api/verifyLogin"),
    CREATE_ACCOUNT("https://automationexercise.com/api/createAccount"),
    DELETE_ACCOUNT("https://automationexercise.com/api/deleteAccount"),
    UPDATE_ACCOUNT("https://automationexercise.com/api/updateAccount"),
    GET_USER_DETAIL_BY_EMAIL("https://automationexercise.com/api/getUserDetailByEmail"),
    ;

    private final String endpoint;

    ApiEndpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
