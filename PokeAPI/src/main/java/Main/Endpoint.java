package Main;

public class Endpoint {
    private String endpoint = null;
    public String ditto(){
       return this.endpoint = "/api/v2/pokemon/ditto";
    }

    public String charmander(){
        return this.endpoint = "/api/v2/pokemon/charmander";
    }
}
