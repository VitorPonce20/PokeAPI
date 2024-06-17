package Service;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Service {

    public static void get(){
        given().baseUri("https://pokeapi.co").
        when().get("/api/v2/pokemon/ditto").then().statusCode(200).log().all();
    }
}


