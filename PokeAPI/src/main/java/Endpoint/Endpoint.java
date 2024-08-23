package Endpoint;

public class Endpoint {

    private String endpoint = null;
    private final String BASEURI = "https://pokeapi.co/api/v2/pokemon/";
    public String ditto(){ return  endpoint = BASEURI + "ditto"; }
    public String bulbassauro(){
        return  endpoint = BASEURI + "bulbasaur";
    }

    public String charmander() {
        return endpoint = BASEURI + "charmander";
    }

    public String charizard() {
        return endpoint = BASEURI + "charizard";
    }

    public String charmeleon() {
        return endpoint = BASEURI + "charmeleon";
    }

    public String squirtle() { return endpoint = BASEURI + "squirtle"; }

    public String ivysaur() { return endpoint = BASEURI + "ivysaur"; }

    public String venusaur() { return endpoint = BASEURI + "venusaur"; }

    public String pikachu() { return endpoint = BASEURI + "pikachu";}
    public String raichu() { return endpoint = BASEURI + "raichu";}

    public String electabuzz() { return endpoint = BASEURI + "electabuzz";}

    public String zapdos() { return endpoint = BASEURI + "zapdos"; }

    public String articuno() { return endpoint = BASEURI + "articuno"; }

    public String moltres() { return endpoint = BASEURI + "moltres"; }
}
