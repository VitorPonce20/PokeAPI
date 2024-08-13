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

    private Response response;
    JsonPath jsonResponse;


}


