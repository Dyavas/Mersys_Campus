package api.model.parameterPage;

import api.pojo.parametersPage.fields_Pojo;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ConfigurationReader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class fieldsTests {
    Cookies cookies;
    String fieldsId;

    List<String> typeList = Arrays.asList("STRING", "INTEGER");
    fields_Pojo fields;

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

    String randomName = RandomStringUtils.randomAlphabetic(6);
    String randomCode = RandomStringUtils.randomAlphabetic(3);

    @Test
    public void getFieldsList() {
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("schoolId", "635c5eaf0710ed26cf962380");



        given()
                .cookies(cookies)
                .body(credentials)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/entity-field/search")
                .then()
                .log().body();

    }

    @Test(dependsOnMethods = "getFieldsList")
    public void createFields() {
        fields = new fields_Pojo();
        fields.setName(randomName);
        fields.setCode(randomCode);
        fields.setSchoolId("635c5eaf0710ed26cf962380");
        fields.setType(typeList.get(0));

        fieldsId = given()
                .cookies(cookies)
                .body(fields)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/entity-field")
                .then()
                .statusCode(201)
                .log().body()
                .extract().jsonPath().getString("id");
        System.out.println(fieldsId);
    }

    @Test(dependsOnMethods = "createFields")
    public void updateFields() {
        String randomName = RandomStringUtils.randomAlphabetic(5);
        fields.setId(fieldsId);
        fields.setName(randomName);
        fields.setType(typeList.get(1));
        given()
                .cookies(cookies)
                .body(fields)
                .contentType(ContentType.JSON)
                .when()
                .put("/school-service/api/entity-field")
                .then()
                .statusCode(200)
                .log().body()
                .body("name", equalTo(fields.getName()));
    }

    @Test(dependsOnMethods = "updateFields")
    public void deleteFields() {
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .delete("/school-service/api/entity-field/" + fields.getId())
                .then()
                .log().body()
                .statusCode(204);
    }

    @Test(dependsOnMethods = "deleteFields")
    public void deleteFieldsNegativTest() {
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .delete("/school-service/api/entity-field/" + fields.getId())
                .then()
                .log().body()
                .statusCode(400);
    }


}
