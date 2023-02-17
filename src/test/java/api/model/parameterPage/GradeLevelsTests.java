package api.model.parameterPage;

import api.pojo.parametersPage.GradeLevels_Pojo;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigurationReader;

import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GradeLevelsTests {
    Cookies cookies;

    GradeLevels_Pojo gradeLevels=new GradeLevels_Pojo();

    String gradeLevels_Id;

    String randomName= RandomStringUtils.randomAlphabetic(6);

    String randomShortName=RandomStringUtils.randomAlphabetic(6);


    @BeforeClass
    public void login() {

        baseURI = ConfigurationReader.getProperty("url_test");

        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("username", ConfigurationReader.getProperty("username"));
        credentials.put("password", ConfigurationReader.getProperty("password"));
        credentials.put("rememberMe", "true");

        cookies = given()
                .body(credentials)
                .contentType(ContentType.JSON)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .log().body()
                .extract().response().getDetailedCookies();
        System.out.println("cookies= " + cookies);
    }

    @Test()
    public void getAllList(){

        given()
                .cookies(cookies)
                .body(gradeLevels)
                .contentType(ContentType.JSON)
                .when()
                .get("/school-service/api/grade-levels")
                .then()
                .statusCode(200)
                .log().body();

    }

    @Test()
    public void createGradeLevels() {

        gradeLevels.setName(randomName);
        gradeLevels.setShortName(randomShortName);

        gradeLevels_Id = given()
                .cookies(cookies)
                .body(gradeLevels)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/grade-levels")
                .then()
                .statusCode(201)
                .body("name",equalTo(randomName))
                .log().body()
                .extract().jsonPath().getString("id");
    }

    @Test(dependsOnMethods = "createGradeLevels")
    public void updateGradeLevels(){

        gradeLevels.setId(gradeLevels_Id);
        gradeLevels.setName(RandomStringUtils.randomAlphabetic(3));
        gradeLevels.setShortName(RandomStringUtils.randomAlphabetic(3));
        gradeLevels.setOrder(RandomStringUtils.randomNumeric(3));

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(gradeLevels)
                .when()
                .put("/school-service/api/grade-levels")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test(dependsOnMethods = "updateGradeLevels")
    public void deleteGradeLevelsMitId(){
        given()
                .cookies(cookies)
                .pathParam("id",gradeLevels_Id)
                .when()
                .delete("/school-service/api/grade-levels/{id}")
                .then()
                .statusCode(200)
                .log().body();
    }

}
