package api;

import api.pojo.parametersPage.Fees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Cookies;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import utils.ApiUtility;
import utils.ConfigurationReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;

public class FeeApiSteps {

    Cookies cookies= ApiUtility.loginMersysWithCookies();

    Fees fees = new Fees();

    String fees_id;

    String feeName = "newFees";

    String updatedfeeName="updatedfeeName";

    String feeCode ="newfeeCode";

    String updatedfeeCodeName= "updatedFeeCodeName";

    String feePriority = "444";

    boolean feeActive=true;



    @When("Create A Fee")
    public void createAFee() {

        fees.setName(feeName);
        fees.setCode(feeCode);
        fees.setPriority(feePriority);
        fees.setActive(feeActive);

       /* fees_id = given()
                .cookies(cookies)
                .body(fees)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/fee-types")
                .then()
                .statusCode(201)
               // .body("name", equalTo(feeName))
                .log().body()
                .extract().jsonPath().getString("id"); */

        Response response=given()
                .cookies(cookies)
                .body(fees)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/fee-types");

        fees_id=response.then().extract().jsonPath().getString("id"); //responsun bodysini acip jsonpathinin icindenstringi id ye esit olan kismi alip fees_id nin icine koyduk


                response.prettyPrint();


        System.out.println("Fee Created Succesfully");
    }

    @Then("Search A Fee")
    public void searchAFee() {

        given().cookies(cookies)
                .body(fees)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/fee-types/search")
                .then()
                .log().body()
                .statusCode(200);

        System.out.println("Fee Searched Succesfully");





    }

    @Then("Update A Fee")
    public void updateAFee() {

        fees.setId(fees_id);
        fees.setName(updatedfeeName);
        fees.setCode(updatedfeeCodeName);

        given().cookies(cookies)
                .body(fees)
                .contentType(ContentType.JSON)
                .when()
                .put("/school-service/api/fee-types")
                .then()
                .log().body()
                .statusCode(200);

        System.out.println("Fee Updated Succesfully");

    }

    @Then("Delete A Fee With Id")
    public void deleteAFeeWithId() {

        given().cookies(cookies)
                .pathParam("id", fees_id)
                .contentType(ContentType.JSON)
                .when()
                .delete("/school-service/api/fee-types/{id}")
                .then()
                .statusCode(200);

        System.out.println("Fee Deleted Succesfully");





    }
}
