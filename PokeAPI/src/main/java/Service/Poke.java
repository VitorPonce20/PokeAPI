package Service;

import io.restassured.response.Response;

import static io.restassured.RestAssured.when;

public class Poke {

        private int id = 0;
        private String name = null;
        private Response response;

        public int getID(){
            return id;
        }

        public Response getPoke(String poke){
            System.out.println("endpoint: " + poke);
            response = when().get(poke);
            id = response.jsonPath().get("id");
            name = response.jsonPath().get("name");

            System.out.println("poke id : " + id);
            System.out.println("poke name : " + name);


            return response;
        }
    }

