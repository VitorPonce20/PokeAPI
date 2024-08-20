package e2eTest;

import Endpoint.Endpoint;
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

        poke.getPoke(endpoint.charmander()).then().statusCode(200);
        Assert.assertEquals(poke.getID(), 4);

        poke.getPoke(endpoint.charmeleon()).then().statusCode(200);
        Assert.assertEquals(poke.getID(), 5);

        poke.getPoke(endpoint.charizard()).then().statusCode(200);
        Assert.assertEquals(poke.getID(), 6);

    }
    @Test
    public void seedTest(){
        poke.getPoke(endpoint.bulbassauro());
        Assert.assertEquals(poke.getID(),1);

        poke.getPoke(endpoint.ivysaur());
        Assert.assertEquals(poke.getID(), 2);

        poke.getPoke(endpoint.venusaur());
        Assert.assertEquals(poke.getID(), 3);
    }


}
