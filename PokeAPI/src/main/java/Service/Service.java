package Service;

import Main.Endpoint;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Service {
    Endpoint endpoint = new Endpoint();
    private String name;
    public int id = 20;

    public void ditto(){
        given().baseUri("https://pokeapi.co").
        when().get(endpoint.ditto()).then().statusCode(200);
    }
    public void charmander(){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200);
    }
    public void squirtle(){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200);
    }
    public void wartortle (){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200);
    }
    public void blastoise (){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200);
    }

}


