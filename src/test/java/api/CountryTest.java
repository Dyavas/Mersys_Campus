package api;

import api.campus.Country;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CountryTest {

    Cookies cookies;
    String countryId;
    Country country;

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
    String randomName= RandomStringUtils.randomAlphabetic(6);
    String randomCode=RandomStringUtils.randomAlphabetic(3);

    @Test()
    public void createCountry() {
       country = new Country();
        country.setName(randomName);
        country.setCode(randomCode);

        countryId = given()
                .cookies(cookies)
                .body(country)
                .contentType(ContentType.JSON)

                .when()
                .post("/school-service/api/countries")
                .then()
                .statusCode(201)
                .body("name",equalTo(randomName))
                .log().body()
                .extract().jsonPath().getString("id");
        System.out.println(countryId);
    }

    @Test(dependsOnMethods = "createCountry")
    public void updateCountry(){
        country=new Country();
        country.setId(countryId);
        country.setName(randomName);
        country.setCode(randomCode);
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(country)
                .when()
                .put("/school-service/api/countries")
                .then()
                .log().body()
                .statusCode(200)
                .body("name",equalTo(randomName));
    }

    @Test(dependsOnMethods = "updateCountry")
    public void deleteCountryById(){
        given()
                .cookies(cookies)
                .pathParam("countryId",countryId)
                .when()
                .delete("/school-service/api/countries/{countryId}")
                .then()
                .statusCode(200)
                .log().body();
    }
}
