package api;

import api.pojo.parametersPage.Citizenship;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import utils.ApiUtility;

import static io.restassured.RestAssured.*;


public class CitizenshipApiSteps {

    Cookies cookies= ApiUtility.loginMersysWithCookies();
    Citizenship citizenship=new Citizenship();

    String citiNewName="NewCitizenship";
    String citiNewShortName="NewShortName";
    String citizenshipId;
    String citiUpdatedName="UpdatedCitizenshipName";

    String citiUpdatedShortName="NewUpdatedShortName";


    @When("Create A Citizenship")
    public void createACitizenship() {

        citizenship.setName(citiNewName);
        citizenship.setShortName(citiNewShortName);

        citizenshipId=given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(citizenship)
                .when()
                .post("/school-service/api/citizenships")
                .then()
                .log().body()
                .extract().jsonPath().getString("id");

        System.out.println("Citizenship Created Succesfully");

    }

    @Then("Search A Citizenship")
    public void searchACitizenship() {

        given().body(citizenship)
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/citizenships/search")
                .then()
                .log().body();

        System.out.println("Citizenship Searched Succesfully");


    }

    @Then("Update A Citizenship")
    public void updateACitizenship() {

        citizenship.setId(citizenshipId);
        citizenship.setName(citiUpdatedName);
        citizenship.setShortName(citiUpdatedShortName);

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(citizenship)
                .when()
                .put("/school-service/api/citizenships")
                .then()
                .statusCode(200)
                .log().body();

        System.out.println("Citizenship Updated Succesfully");


    }

    @Then("Delete A Citizenship")
    public void deleteACitizenship() {

                 given()
                .cookies(cookies)
                .pathParam("id",citizenshipId)
                .contentType(ContentType.JSON)
                .when()
                .delete("/school-service/api/citizenships/{id}")
                .then()
                .statusCode(200);

        System.out.println("Citizenship Deleted Succesfully");

    }
}
