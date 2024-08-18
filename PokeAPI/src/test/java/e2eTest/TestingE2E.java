package e2eTest;

import Main.Endpoint;
import Service.Service;
import org.testng.Assert;
import org.testng.annotations.Test;
import Service.Poke;

public class TestingE2E {
    Service service = new Service();

    @Test
    public void test(){
        System.out.println("Poke Test");

        service.squirtle();


    }
    @Test
    public void charmanderTest(){

        service.charmander();

    }
    @Test
    public void waterTest(){
        service.squirtle();
        System.out.println(service.id);
        service.wartortle();
        service.blastoise();
    }
    @Test
    public void pokeTest(){ int id;

        Poke poke = new Poke();
        Endpoint endpoint = new Endpoint();
        poke.getPoke(endpoint.charizard());
        Assert.assertEquals(poke.getID(), 6);

    }

}
