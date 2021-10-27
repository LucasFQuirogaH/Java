package Logica;

public abstract class Pokemon {

    // Atributos
    public int num_pokedex;
    public String nombrePokemon;
    public double esoPokemon;
    public String sexo;
    public int temporadaQueAparece;
    public String tipo;
    
    // Constructor
    protected Pokemon(int num_pokedex, String nombrePokemon, double esoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.esoPokemon = esoPokemon;
        this.sexo = sexo;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }
        
    // Metodos
    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();

}
