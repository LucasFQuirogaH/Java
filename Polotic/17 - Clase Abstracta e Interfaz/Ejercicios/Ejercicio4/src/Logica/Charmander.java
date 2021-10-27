package Logica;

public class Charmander extends Pokemon implements IFuego{
    
    // Constructor
    public Charmander(int num_pokedex, String nombrePokemon, double esoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, esoPokemon, sexo, temporadaQueAparece, tipo);
    }

    
    // Metodos 
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y ataco con placaje");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Charmender y ataco con arañazo");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmander y te muerdo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y ataco con Fuego"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y ataco con Ascuas"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander y ataco con lanzallamas "); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Getters & Setters
    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getEsoPokemon() {
        return esoPokemon;
    }

    public void setEsoPokemon(double esoPokemon) {
        this.esoPokemon = esoPokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
