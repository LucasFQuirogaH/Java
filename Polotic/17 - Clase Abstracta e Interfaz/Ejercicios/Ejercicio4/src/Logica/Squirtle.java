package Logica;

public class Squirtle extends Pokemon implements IAgua{

    // Constructor
    public Squirtle(int num_pokedex, String nombrePokemon, double esoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, esoPokemon, sexo, temporadaQueAparece, tipo);
    }

    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y ataco con Placaje"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Squirtle y te araño");  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y te muerdo");  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tacarHidrobomba() {
        System.out.println("Soy Squirtle y te baño con la hidrobomba");  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y te mojo con la pistola de agua"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y te tiro pompas de jabon"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y te tiro un chorro de agua fuerte");  //To change body of generated methods, choose Tools | Templates.
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
