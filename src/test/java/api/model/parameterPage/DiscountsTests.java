package api.model.parameterPage;


import api.pojo.parametersPage.Discounts_Pojo;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DiscountsTests {

    Cookies cookies;

    Discounts_Pojo discounts = new Discounts_Pojo();

    String discounts_Id;

    String randomDescription = RandomStringUtils.randomAlphabetic(6);

    String randomCode = RandomStringUtils.randomAlphabetic(6);


    @BeforeClass
    public void login() {
        baseURI = "https://test.mersys.io";
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("username", "admin_intern");
        credentials.put("password", "admin12345");
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

        System.out.println("cookies = " + cookies);
    }

    @Test()
    public void getAllList() {

        given()
                .cookies(cookies)
                .body(discounts)
                .contentType(ContentType.JSON)
                .when()
                .get("/school-service/api/discounts")
                .then()
                .statusCode(200)
                .log().body();

    }

    @Test()
    public void createDiscounts() {

        discounts.setDescription(randomDescription);
        discounts.setCode(randomCode);

        discounts_Id = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(discounts)
                .when()
                .post("/school-service/api/discounts")
                .then()
                .statusCode(201)
                .body("description", equalTo(randomDescription),
                        "code", equalTo(randomCode))
                .log().body()
                .extract().jsonPath().getString("id");
        ;
        System.out.println("discounts_Id = " + discounts_Id);


    }

    @Test(dependsOnMethods = "createDiscounts")
    public void updateDiscounts() {

        Map<String, Object> updateBody = new HashMap<>();

        updateBody.put("id", discounts_Id);
        updateBody.put("description", RandomStringUtils.randomAlphabetic(3));
        updateBody.put("code", RandomStringUtils.randomAlphabetic(3));

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(updateBody)
                .when()
                .put("/school-service/api/discounts")
                .then()
                .statusCode(200)
                .log().body();

    }

    @Test(dependsOnMethods = "updateDiscounts")
    public void deleteDiscountsMitId() {
        given()
                .cookies(cookies)
                .pathParam("id", discounts_Id)
                .when()
                .delete("/school-service/api/discounts/{id}")
                .then()
                .statusCode(200)
                .log().body();
    }

}





