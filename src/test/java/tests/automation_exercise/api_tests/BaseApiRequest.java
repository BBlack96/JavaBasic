package tests.automation_exercise.api_tests;

import automation_exercise.requests.*;
import automation_exercise.utils.JsonReader;
import org.testng.annotations.BeforeMethod;

public class BaseApiRequest {

    protected BrandsList brandsList;
    protected CreateAccount createAccount;
    protected DeleteAccount deleteAccount;
    protected GetUserDetailByEmail getUserDetailByEmail;
    protected ProductsList productsList;
    protected SearchProduct searchProduct;
    protected UpdateAccount updateAccount;
    protected VerifyLogin verifyLogin;
    protected JsonReader jsonReader;

    @BeforeMethod
    public void setUpRequests() {
        brandsList = new BrandsList();
        createAccount = new CreateAccount();
        deleteAccount = new DeleteAccount();
        getUserDetailByEmail = new GetUserDetailByEmail();
        productsList = new ProductsList();
        searchProduct = new SearchProduct();
        updateAccount = new UpdateAccount();
        verifyLogin = new VerifyLogin();
        jsonReader = new JsonReader("src/test/resources/bodies.json");
    }
}
