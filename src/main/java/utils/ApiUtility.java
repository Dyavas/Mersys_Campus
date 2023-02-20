package utils;

import io.restassured.http.ContentType;
import io.restassured.http.Cookies;

import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ApiUtility {

    public static Cookies loginMersysWithCookies(){

        Cookies cookies;
        baseURI = ConfigurationReader.getProperty("url_test");

        HashMap<String, String> hesapbilgileri = new HashMap<>();// hesapbilgileerimi koymak icin bir Hashmap olusturuyorum, key ve value lari String
        hesapbilgileri.put("username", ConfigurationReader.getProperty("username"));// username keyine configuration propertiesteki admin_intern usernameini koyduk
        hesapbilgileri.put("password", ConfigurationReader.getProperty("password"));//password keyine configuration propertiesteki admin12345 passwordunu koyduk
        hesapbilgileri.put("rememberMe", "true");// rememberMe keyine true valuesini koyduk.

         cookies=given()
                .body(hesapbilgileri)
                .contentType(ContentType.JSON)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .log().body()
                .extract().response().getDetailedCookies();

        System.out.println("cookies= " + cookies);

        return cookies;
    }
}
