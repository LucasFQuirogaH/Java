package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    // Constructor
    public Bulbasaur(int num_pokedex, String nombrePokemon, double esoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, esoPokemon, sexo, temporadaQueAparece, tipo);
    }

    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y ataco con Placaje");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y ataco con araniazo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Bulbasaur y te muerdo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y te paralizo");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y te vas por el drenaje"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y te corto en 2"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y doy con el latigo");///To change body of generated methods, choose Tools | Templates.
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
