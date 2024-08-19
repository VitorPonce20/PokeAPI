# PokeAPI
REST API Testing

Documentation about how to test API's using REST-assured. Here we will see how to do a request and validate the response usin a GET request to obtain data from the server (about pokemons as example :D ) and after handle json body responses using JsonPath.
<h2>Installing</h2>
install java and maven
import rest-assured dependencies in pom.xml\
https://mvnrepository.com/artifact/io.rest-assured/rest-assured

<h2>Implementation</h2>
Abstract the request in a java object like Poke class that returns the response.


            public Response getPoke(String poke){
            System.out.println("endpoint: " + poke);
            response = given().when().get(poke);
            id = response.jsonPath().get("id");
            name = response.jsonPath().get("name");System.out.println("poke id : " + id);

            System.out.println("poke name : " + name);

            return response;
        }

<h2> Endpoint layer </h2>
Abstract the endpoint layer to make easy maintenance

public class Endpoint {

    private String endpoint = null;
    private final String BASEURI = "https://pokeapi.co/api/v2/pokemon/";
    public String ditto(){ return  endpoint = BASEURI + "ditto"; }
    public String bulbassauro(){return  endpoint = BASEURI + "bulbasaur"; }

    public String charmander() { return endpoint = BASEURI + "charmander"; }

    public String charizard() { return endpoint = BASEURI + "charizard"; }

    public String charmeleon() { return endpoint = BASEURI + "charmeleon"; }

    public String squirtle() { return endpoint = BASEURI + "squirtle"; }
}

<h2>Testing Validation</h2>
Create a new test using testng and create the validations
        
        @Test
        public void fireTest(){
        int id;
        String name;
        response = poke.getPoke(endpoint.charmander());
        Assert.assertEquals(poke.getID(), 4);
        response.then().statusCode(200);        

<h2> Response Validation </h2>
Use JsonPath to navigate through the json response body

        JsonPath json = response.jsonPath();
        json.get("id");
        id = json.get("id");
        System.out.println(id);

<h2>Running</h2>
Run mvn-test to run all tests

<h2>Using REST-assured</h2>
Use given to config the request\

    given(). 
Use when to send the request

    when().get(poke);
Use then to validate the response

    response.then().statusCode(200);

