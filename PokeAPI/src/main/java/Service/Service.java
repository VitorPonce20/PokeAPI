package Service;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Service {
    public Response get(String url){
        return (Response) given()
                .when()
                .get(url)
                .then().extract().response().body();
    }
}

