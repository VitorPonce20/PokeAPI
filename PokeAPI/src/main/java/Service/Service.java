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
    private int id;

<<<<<<< HEAD
    public void ditto(){
        given().baseUri("https://pokeapi.co").
        when().get(endpoint.ditto()).then().statusCode(200).log().all();
    }

    public void charmander(){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200).log().all();
    }

    public void squirtle(){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200).log().all();
    }

    public void Wartortle (){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200).log().all();
    }

    public void Blastoise (){
        given().baseUri("https://pokeapi.co").
                when().get(endpoint.charmander()).then().statusCode(200).log().all();
    }

}


