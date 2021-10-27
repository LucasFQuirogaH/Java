package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    // Constructor
    public Pikachu(int num_pokedex, String nombrePokemon, double esoPokemon, String sexo, int temporadaQueAparece, String tipo) {
        super(num_pokedex, nombrePokemon, esoPokemon, sexo, temporadaQueAparece, tipo);
    }
    
    
    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Pikachu y te ataco con Placaje");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Pikachu y te araño la cara");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Pikachu y te muerdo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y te atudo con mi trueno");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y te ataco doy puñetazo que suena como trueno");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarRayo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y te ataco con un rayo de carga"); //To change body of generated methods, choose Tools | Templates.
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
