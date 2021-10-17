package Logica;

public abstract class Animal { //Clase Abstracta

// Atributos
    private String nombre;
    private String especie;

    // Constructores -------------------------------------------------------------------------
    public Animal() {
    }

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    // Metodos ---------------------------------------------------------------------------------
    public abstract void soyAnimal();

}
