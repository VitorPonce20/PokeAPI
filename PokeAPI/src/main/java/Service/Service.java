package Service;

import Main.Endpoint;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Service {
    Endpoint endpoint = new Endpoint();

    public void get(){

        given().baseUri("https://pokeapi.co").
        when().get(endpoint.ditto()).then().statusCode(200).log().all();
    }
}


