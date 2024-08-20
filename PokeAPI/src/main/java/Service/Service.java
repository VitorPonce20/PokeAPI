package Service;

import Endpoint.Endpoint;

import static io.restassured.RestAssured.given;

public class Service {
    Endpoint endpoint = new Endpoint();
    private String name;
    public int id = 20;

    public void ditto(){
        given().baseUri("https://pokeapi.co").
        when().get(endpoint.ditto()).then().statusCode(200);
    }

}


