package e2eTest;

import Main.Endpoint;
import Service.Service;
import org.testng.Assert;
import org.testng.annotations.Test;
import Service.Poke;

public class TestingE2E {
    Poke poke = new Poke();
    Endpoint endpoint = new Endpoint();

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
        poke.getPoke(endpoint.charmander());
        Assert.assertEquals(poke.getID(), 4);
        poke.getPoke(endpoint.charmeleon());
        Assert.assertEquals(poke.getID(), 5);
        poke.getPoke(endpoint.charizard());
        Assert.assertEquals(poke.getID(), 6);
    }


}
