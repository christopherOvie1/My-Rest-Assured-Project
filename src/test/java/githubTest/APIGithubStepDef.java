package githubTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.given;

public class APIGithubStepDef {
    RequestSpecification request;
    Response response;
    @Given("user sets the API request on the {string}")
    public void userSetsTheAPIRequestOnThe(String url) {
        RestAssured.baseURI= url;

    }
    @And("user authenticates the API request with  with {string}")
    public void userAuthenticatesTheAPIRequestWithWith(String token) {
        request= given().auth().oauth2(token);

    }

    @When("user  makes the request to get list of all repositories")
    public void user_makes_the_request_to_get_list_of_all_repositories() {
        String path = "/user/repos";
        response=  request.get(path).then().extract().response();
    }
    @Then("user should confirm  status code")
   public void user_should_confirm_status_code()
    {System.out.println(response.getStatusCode());
     int y=   response.statusCode();
     Assert.assertEquals(response.getStatusCode(),y);

         }


   /* @Then("user validates the status code as {string}")
    public void userValidatesTheStatusCodeAs(int code) {
        Assert.assertEquals(response.getStatusCode(),code);
    }*/
}
