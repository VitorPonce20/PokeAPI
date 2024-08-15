package e2eTest;

import Service.Service;
import org.testng.Assert;
import org.testng.annotations.Test;

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

}
