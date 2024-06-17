package Service;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Service {

    public static void post(){
        given().baseUri("https://pokeapi.co").
        when().get("/api/v2/pokemon/ditto").then().log().all();
    }
}


