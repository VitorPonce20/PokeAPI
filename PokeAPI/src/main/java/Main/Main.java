package Main;


import Service.Service;
import Service.Poke;


public class Main {
    public static void main(String[] args){
        Poke poke = new Poke();
        Endpoint endpoint = new Endpoint();

        poke.getPoke(endpoint.ditto());
        poke.getPoke(endpoint.charmander());
        poke.getPoke(endpoint.charmeleon());
        poke.getPoke(endpoint.charizard());
        poke.getPoke(endpoint.bulbassauro());
    };
}
