package api;

import api.campus.City;
import api.campus.Country;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class CityTest {

    Cookies cookies;
    String cityId;
    City city;
    Country country;
    String countryId;

    @BeforeClass
    public void login(){
        baseURI = "https://test.mersys.io";
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("username", "admin_intern");
        credentials.put("password", "admin12345");
        credentials.put("remember", "true");

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
    public void createCountry() {
        country = new Country();
        country.setName(randomCountryName);
        country.setCode(randomCountryCode);

        countryId = given()
                .cookies(cookies)
                .body(country)
                .contentType(ContentType.JSON)

                .when()
                .post("/school-service/api/countries")
                .then()
                .statusCode(201)
                .log().status()
                .body("name",equalTo(randomCountryName))
                .log().body()
                .extract().jsonPath().getString("id");

        System.out.println(countryId);
    }
    String randomCountryName = RandomStringUtils.randomAlphabetic(6);
    String randomCountryCode = RandomStringUtils.randomAlphanumeric(3);
    String randomCityName = RandomStringUtils.randomAlphabetic(5);

    @Test(dependsOnMethods = "createCountry")
    public void newCity(){

        HashMap<String,String> countryObject = new HashMap<>();
        countryObject.put("id",countryId);

        HashMap<String, Object> cityObject = new HashMap<>();
        cityObject.put("name", randomCityName);
        cityObject.put("country", countryObject);

        cityId = given()
                .cookies(cookies)
                .body(cityObject)
                .contentType(ContentType.JSON)
                .when()
                .post("/school-service/api/cities")
                .then()
                .statusCode(201)
                .body("name",equalTo(randomCityName))
                .log().body()
                .extract().jsonPath().getString("id");

        System.out.println(cityId);
    }

    @Test(dependsOnMethods = "newCity")
    public void updateCity(){
        HashMap<String,String> updatedCountryObject = new HashMap<>();
        updatedCountryObject.put("id",countryId);

        HashMap<String, Object> updatedCityObject = new HashMap<>();
        updatedCityObject.put("name", randomCityName);
        updatedCityObject.put("id",cityId);
        updatedCityObject.put("country", updatedCountryObject);

        given()
                .cookies(cookies)
                .body(updatedCityObject)
                .contentType(ContentType.JSON)
                .when()
                .put("/school-service/api/cities")
                .then()
                .statusCode(200)
                .body("name",equalTo(randomCityName))
                .log().body();
        System.out.println(cityId);
    }

    @Test(dependsOnMethods = "updateCity")
    public void deleteCity(){
        given()
                .cookies(cookies)
                .pathParam("id",cityId)
                .when()
                .delete("/school-service/api/cities/{id}")
                .then()
                .statusCode(200)
                .log().body();
    }
}
