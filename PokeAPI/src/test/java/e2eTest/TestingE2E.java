package e2eTest;

import Main.Endpoint;
import Service.Service;
import groovy.json.JsonToken;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import Service.Poke;

public class TestingE2E {
    Poke poke = new Poke();
    Endpoint endpoint = new Endpoint();
    Response response;

    @Test
    public void charmanderTest(){
        poke.getPoke(endpoint.charmander());
        Assert.assertEquals(poke.getID(), 4);
    }
    @Test
    public void waterTest(){
        poke.getPoke(endpoint.squirtle());
        Assert.assertEquals(poke.getID(), 7);
    }
    @Test
    public void fireTest(){
        int id;
        String name;


        response = poke.getPoke(endpoint.charmander());
        Assert.assertEquals(poke.getID(), 4);

        JsonPath json = response.jsonPath();

        json.get("id");
        id = json.get("id");
        System.out.println(id);

        response = poke.getPoke(endpoint.charmeleon());
        Assert.assertEquals(poke.getID(), 5);
        json.get("id");
        id = json.get("id");
        System.out.println(id);

        response = poke.getPoke(endpoint.charizard());
        Assert.assertEquals(poke.getID(), 6);
        json.get("id");
        id = json.get("id");
        System.out.println(id);
    }


}
